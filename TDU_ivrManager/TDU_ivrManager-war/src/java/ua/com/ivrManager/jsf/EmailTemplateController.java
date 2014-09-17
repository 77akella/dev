package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
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
import ua.com.ivrManager.ejb.entity.*;
import ua.com.ivrManager.ejb.session.EmailTemplateFacade;
import ua.com.ivrManager.ejb.session.ScheduledActions;
import ua.com.ivrManager.jsf.util.JsfUtil;

@ManagedBean(name = "emailTemplateController")
@SessionScoped
public class EmailTemplateController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(EmailTemplateController.class);
    private Var currentVar = null;
    private EmailTemplate current;
    private ImageFile selectedImage;
    private LazyDataModel<EmailTemplate> lazyModel = null;
    @EJB
    private ua.com.ivrManager.ejb.session.EmailTemplateFacade ejbFacade;
    @EJB
    private ScheduledActions scheduledActions;
    private String testMessageAddr;

    public EmailTemplateController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<EmailTemplate>() {

            @Override
            public List<EmailTemplate> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info("[EmailTemplateController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<EmailTemplate> result = new ArrayList<EmailTemplate>();

                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[EmailTemplateController] Error Loading data from lazyModel: ", e);
                    JsfUtil.addErrorMessage(e, "Error");
                }

                return result;
            }
        };
    }

    public LazyDataModel<EmailTemplate> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public EmailTemplate getSelected() {
        if (current == null) {
            current = new EmailTemplate();
        }
        return current;
    }

    public ImageFile getSelectedImage() {
        return selectedImage;
    }

    public void setSelectedImage(ImageFile selectedImage) {
        this.selectedImage = selectedImage;
    }

    private EmailTemplateFacade getFacade() {
        return ejbFacade;
    }

    public Var getNewVar() {
        if (currentVar == null) {
            currentVar = new Var("messageVar", "mail", "", true);//Var(String dotName,String type, String initVal, boolean valueFromContactList)
        }
        return currentVar;
    }

    public void setNewVar(Var newVar) {
        this.currentVar = newVar;
    }

    public void prepareAddVar() {
        currentVar = null;
    }

    public void addVar() {
        currentVar = getFacade().editVar(currentVar);
        current.getVars().add(currentVar);
        JsfUtil.addSuccessMessage("Email_varAdded");
    }

    public void deleteVar() {
        getFacade().removeVar(currentVar);
        current.getVars().remove(currentVar);
        JsfUtil.addSuccessMessage("Email_varRemoved");
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareCreate() {
        current = null;
        currentVar = null;
        return "Edit";
    }

    public String prepareEdit() {
        current = (EmailTemplate) getLazyModel().getRowData();
        currentVar = null;
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

    public String getTestMessageAddr() {
        return testMessageAddr;
    }

    public void setTestMessageAddr(String testMessageAddr) {
        this.testMessageAddr = testMessageAddr;
    }

    public void sendMail() {
        logger.info("[EmailTemplateController] sendMail pressed to '{}'", testMessageAddr);
        if (testMessageAddr == null || testMessageAddr.trim().isEmpty()) {
            JsfUtil.addErrorMessage("Email_testAddrIsEmpty");
            return;
        }
        Interaction interaction = new Interaction();
        interaction.setDnis(testMessageAddr);//("77akella@gmail.com");
        ActionNode actionNode = new ActionNode();
        //Create campaign, ActionNode, ContactList, Contact, CampVarMap
        actionNode.setEmailMessageTemplate(current);
        interaction.setActionNode(actionNode);

        if (scheduledActions.sendMailTest(interaction)) {
            JsfUtil.addSuccessMessage("Email_messageSent");
        } else {
            JsfUtil.addErrorMessage("Email_messageSentFiled");
        }
    }

    public void prepareDestroy() {
        current = (EmailTemplate) getLazyModel().getRowData();
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
        List<EmailTemplate> entities = getFacade().findAll();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (EmailTemplate dr : entities) {
            items[i++] = new SelectItem(dr, dr.getName());
        }
        return items;
    }

//    public SelectItem[] getImagesAvailableSelect() {
//        List<ImageFile> entities = getFacade().findAllImages();
//        SelectItem[] items = new SelectItem[entities.size()];
//        int i = 0;
//        for (ImageFile imageFile : entities) {
//            items[i++] = new SelectItem(imageFile, imageFile.getName());
//        }
//        return items;
//    }
    @FacesConverter(forClass = EmailTemplate.class, value = "emailTemplateConverter")
    public static class emailTemplateControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            EmailTemplateController controller = (EmailTemplateController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "emailTemplateController");
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
            if (object instanceof EmailTemplate) {
                EmailTemplate o = (EmailTemplate) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + EmailTemplateController.class.getName());
            }
        }
    }

    @FacesConverter(forClass = EmailTemplate.class, value = "varConverter")
    public static class varConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            EmailTemplateController controller = (EmailTemplateController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "emailTemplateController");
            return controller.ejbFacade.findVar(getKey(value));
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
            if (object instanceof Var) {
                Var o = (Var) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + EmailTemplateController.class.getName());
            }
        }
    }
}
