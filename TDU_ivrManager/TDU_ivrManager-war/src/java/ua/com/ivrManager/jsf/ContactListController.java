package ua.com.ivrManager.jsf;

import java.io.*;
import java.util.*;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import org.apache.commons.io.FilenameUtils;
import org.eobjects.metamodel.DataContext;
import org.eobjects.metamodel.DataContextFactory;
import org.eobjects.metamodel.csv.CsvConfiguration;
import org.eobjects.metamodel.data.DataSet;
import org.eobjects.metamodel.query.Query;
import org.eobjects.metamodel.schema.Schema;
import org.eobjects.metamodel.schema.Table;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.primefaces.model.UploadedFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Contact;
import ua.com.ivrManager.ejb.entity.ContactList;
import ua.com.ivrManager.ejb.session.ContactListFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;

@ManagedBean(name = "contactListController")
@SessionScoped
public class ContactListController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(ContactListController.class);
    private ContactList current;
    private List<Contact> newContacts = new ArrayList<Contact>();
    private LazyDataModel<ContactList> lazyModel = null;
    private LazyDataModel<Contact> contactsLazyModel = null;
    @EJB
    private ua.com.ivrManager.ejb.session.ContactListFacade ejbFacade;

    public ContactListController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<ContactList>() {

            @Override
            public List<ContactList> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info("[ContactListController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<ContactList> result = new ArrayList<ContactList>();

                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[ContactListController] Error Loading data from lazyModel: ", e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }

                return result;
            }
        };
    }

    public void loadContactsData() {
        contactsLazyModel = new LazyDataModel<Contact>() {

            @Override
            public List<Contact> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
                if (current == null) {
                    logger.warn("[ContactListController] Trying to load contacts without selected contactList!!!");
                    return new ArrayList<Contact>();
                }
                logger.info("[ContactListController] Loading data from contactsLazyModel : sortField='{}'| sortOrder='{}'| filters: '{}', pagesize={},first={}", new Object[]{sortField, sortOrder.name(), filters, pageSize, first});
                List<Contact> result = new ArrayList<Contact>();

                try {
                    result.addAll(getFacade().loadContacts(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters, current));
                    contactsLazyModel.setRowCount(getFacade().loadContactsCount(filters, current));
                    contactsLazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[ContactListController] Error Loading data from contactsLazyModel: ", e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }
                return result;
            }

            @Override
            public void setRowIndex(final int rowIndex) {
                if (rowIndex == -1 || getPageSize() == 0) {
                    super.setRowIndex(-1);
                } else {
                    super.setRowIndex(rowIndex % getPageSize());
                }
            }
        };
    }

    public LazyDataModel<ContactList> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public LazyDataModel<Contact> getContactsLazyModel() {
        if (contactsLazyModel == null) {
            loadContactsData();
        }
        return contactsLazyModel;
    }

    public List<Contact> getNewContacts() {
        if (newContacts == null) {
            newContacts = new ArrayList<Contact>();
        }
        return newContacts;
    }

    public void handleFileUpload(FileUploadEvent event) {
        try {
            logger.info("[ContactListController] handleFileUpload");
            if (event.getFile().getFileName().endsWith(".csv") || event.getFile().getFileName().endsWith(".txt")) {
                handleUploadCsv(event.getFile());
            }
            if (event.getFile().getFileName().endsWith(".xls") || event.getFile().getFileName().endsWith(".xlsx")) {
                handleUploadXls(event.getFile());
            }

            logger.info("[ContactListController] File parsed");
            JsfUtil.addSuccessMessage(event.getFile().getFileName() + " " + JsfUtil.translate("File_isUploaded"));
            if (current.getName() == null || current.getName().isEmpty()) {
                current.setName(FilenameUtils.removeExtension(event.getFile().getFileName()));
            }
        } catch (Exception e) {
            logger.error("[ContactListController] Failed to handle File: ", e);
            JsfUtil.addErrorMessage(e, JsfUtil.translate("File_ErrorUpload " + event.getFile().getFileName()));
        }
    }

    public void handleUploadCsv(UploadedFile file1) throws IOException {
        InputStream inputStream = file1.getInputstream();
        DataContext dataContext = DataContextFactory.createCsvDataContext(inputStream, new CsvConfiguration());
        Schema schema = dataContext.getDefaultSchema();
        Table[] tables = schema.getTables();
        assert tables.length == 1;
        Table table = tables[0];

        if (current.getColumnNames() != null) {
            if (current.getColumnNames().length != table.getColumnNames().length) {
                throw new IllegalArgumentException("Columns count must be same: "
                        + current.getColumnNames().length + "!=" + table.getColumnNames().length);
            }
        } else {
            current.setColumnNames(table.getColumnNames());
        }

        DataSet dataSet = dataContext.executeQuery(new Query().select(table.getColumns()).from(table));

        for (Object[] objectArray : (List<Object[]>) dataSet.toObjectArrays()) {
            Contact contact = new Contact();
            contact.setFields(Arrays.copyOf(objectArray, objectArray.length, String[].class));
            contact.setContactList(current);
//            contactList.getContacts().add(contact);
            getNewContacts().add(contact);
        }
        inputStream.close();
    }

    public void handleUploadXls(UploadedFile file1) {
        File file = new File(file1.getFileName());
        try {

            FileOutputStream fos = new FileOutputStream(file);
            InputStream is = file1.getInputstream();
            int BUFFER_SIZE = 8192;
            byte[] buffer = new byte[BUFFER_SIZE];
            int a;
            while (true) {
                a = is.read(buffer);
                if (a < 0) {
                    break;
                }
                fos.write(buffer, 0, a);
                fos.flush();
            }
            fos.close();
            is.close();
        } catch (IOException e) {
        }
        DataContext dataContext = DataContextFactory.createExcelDataContext(file);
        Schema schema = dataContext.getDefaultSchema();
        Table[] tables = schema.getTables();
        assert tables.length == 1;
        Table table = tables[0];

        if (current.getColumnNames() != null) {
            if (current.getColumnNames().length != table.getColumnNames().length) {
                throw new IllegalArgumentException("Columns count must be same: "
                        + current.getColumnNames().length + "!=" + table.getColumnNames().length);
            }
        } else {
            current.setColumnNames(table.getColumnNames());
        }

        DataSet dataSet = dataContext.executeQuery(new Query().select(table.getColumns()).from(table));

        for (Object[] objectArray : (List<Object[]>) dataSet.toObjectArrays()) {
            Contact contact = new Contact();
            int nullFields = 0;
            for (int i = 0; i < objectArray.length; i++) {
                if (objectArray[i] == null) {
                    nullFields++;
                }
            }
            if (nullFields == objectArray.length) {
                continue;
            }
            contact.setFields(Arrays.copyOf(objectArray, objectArray.length, String[].class));
            contact.setContactList(current);
//            current.getContacts().add(contact);
            getNewContacts().add(contact);
            contact = null;
        }
        file.delete();
        file = null;
    }

    public List<String> getCurrentColNames() {
        return Arrays.asList(current.getColumnNames());
    }

    public void setCurrentColNames(List<String> currentColNames) {
        logger.info("[ContactListController] setCurrentColNames: currentColNames='{}'", currentColNames);
        current.setColumnNames((String[]) currentColNames.toArray());
    }

    public List asList(Object[] array) {
        return Arrays.asList(array);
    }

    public ContactList getSelected() {
        if (current == null) {
            current = new ContactList();
            newContacts = null;
        }
        return current;
    }

    private ContactListFacade getFacade() {
        return ejbFacade;
    }

    public String prepareList() {
        logger.info("[ContactListController] prepareList");
        recreateModel();
        return "List";
    }

    public String prepareEdit() {
        current = (ContactList) getLazyModel().getRowData();
        return "Edit";
    }

    public String prepareCreate() {
        current = new ContactList();
        return "Edit";
    }

    public Integer colNamesIndexOf(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        return asList(current.getColumnNames()).indexOf(value);
    }

    public String update() {
        try {
            current.setModDate(new Date());

            if (getNewContacts().size() > 0) {
                current.setContacts(newContacts);
                current.setContactsCount(current.getContactsCount()+newContacts.size());
//                getFacade().addContacts(getNewContacts());
                newContacts = null;
            }
            getFacade().edit(current);
            JsfUtil.addSuccessMessage("RecordUpdated");
            current = null;
            return prepareList();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public void prepareDestroy() {
        current = (ContactList) getLazyModel().getRowData();
    }

    public String destroy() {
        performDestroy();
        recreateModel();
        return "List";
    }

    private void performDestroy() {
        try {
            current.setDeleted(true);
            getFacade().edit(current);
            JsfUtil.addSuccessMessage("RecordDeleted");
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    private void recreateModel() {
        lazyModel = null;
        contactsLazyModel = null;
        newContacts = null;
    }

    public SelectItem[] getItemsAvailableSelect() {
        List<ContactList> entities = getFacade().findAll();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (ContactList cl : entities) {
            items[i++] = new SelectItem(cl, cl.getName());
        }
        return items;
    }

    public SelectItem[] getItemsAvailableSelectDelAny() {
        List<ContactList> entities = getFacade().findAllDelAny();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (ContactList cf : entities) {
            items[i++] = new SelectItem(cf, cf.isDeleted() ? (cf.getName() + " *") : cf.getName());
        }
        return items;
    }

    @FacesConverter(forClass = ContactList.class, value = "contactListConverter")
    public static class ContactListControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ContactListController controller = (ContactListController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "contactListController");
            return controller.ejbFacade.find(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof ContactList) {
                ContactList o = (ContactList) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + ContactListController.class.getName());
            }
        }
    }
}
