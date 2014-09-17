package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.OutgoingNumberPool;
import ua.com.ivrManager.ejb.entity.PhoneNumber;
import ua.com.ivrManager.ejb.session.OutgoingNumberPoolFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;

@ManagedBean(name = "outgoingNumberPoolController")
@SessionScoped
public class OutgoingNumberPoolController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(OutgoingNumberPoolController.class);
    private OutgoingNumberPool current;
    private LazyDataModel<OutgoingNumberPool> lazyModel = null;
    @EJB
    private ua.com.ivrManager.ejb.session.OutgoingNumberPoolFacade ejbFacade;

    public OutgoingNumberPoolController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<OutgoingNumberPool>() {

            @Override
            public List<OutgoingNumberPool> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info("[OutgoingNumberPoolController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<OutgoingNumberPool> result = new ArrayList<OutgoingNumberPool>();

                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[OutgoingNumberPoolController] Error Loading data from lazyModel: ", e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }

                return result;
            }
        };
    }

    public LazyDataModel<OutgoingNumberPool> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public OutgoingNumberPool getSelected() {
        if (current == null) {
            current = new OutgoingNumberPool();
            addNumber();
        }
        return current;
    }

    public void addNumber() {
        getSelected().getNumbers().add(new PhoneNumber());
    }

    public void removeNumber(PhoneNumber number) {
        try {
            logger.info("[OutgoingNumberPoolController] removeNumber: number='{}'", number);
            getSelected().getNumbers().remove(number);
        } catch (Exception e) {
            logger.error("[OutgoingNumberPoolController] removeNumber: number=" + number, e);
        }
    }

    private OutgoingNumberPoolFacade getFacade() {
        return ejbFacade;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareCreate() {
        current = null;
        return "Edit";
    }

    public String prepareEdit() {
        current = (OutgoingNumberPool) getLazyModel().getRowData();
        return "Edit";
    }

    public String update() {
        try {
            current.setModDate(new Date());
            getFacade().edit(current);
            JsfUtil.addSuccessMessage("RecordUpdated");
            return "List";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public void prepareDestroy() {
        current = (OutgoingNumberPool) getLazyModel().getRowData();
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
    }

    public SelectItem[] getItemsAvailableSelect() {
        List<OutgoingNumberPool> entities = getFacade().findAll();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (OutgoingNumberPool dr : entities) {
            items[i++] = new SelectItem(dr, dr.getName());
        }
        return items;
    }

    @FacesConverter(forClass = OutgoingNumberPool.class, value = "outgoingNumberPoolConverter")
    public static class outgoingNumberPoolControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            System.out.println("outgoingNumberPoolControllerConverter: getAsObject value=" + value);
            if (value == null || value.length() == 0) {
                return null;
            }
            OutgoingNumberPoolController controller = (OutgoingNumberPoolController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "outgoingNumberPoolController");
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
            if (object instanceof OutgoingNumberPool) {
                OutgoingNumberPool o = (OutgoingNumberPool) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + OutgoingNumberPoolController.class.getName());
            }
        }
    }
}
