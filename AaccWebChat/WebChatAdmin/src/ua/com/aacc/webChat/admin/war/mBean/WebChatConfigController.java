package ua.com.aacc.webChat.admin.war.mBean;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.aacc.webChat.aacc63.CISkillsetReadType;
import ua.com.aacc.webChat.admin.war.mBean.util.JsfUtil;
import ua.com.aacc.webChat.ejb.WebChatConfigFacade;
import ua.com.aacc.webChat.ejb.WsCcmmFacade;
import ua.com.aacc.webChat.entity.WebChatConfig;
import ua.com.aacc.webChat.entity.enums.AuthTypeEnum;
import ua.com.aacc.webChat.entity.enums.ContactPriorityEnum;
import ua.com.aacc.webChat.entity.enums.LanguageEnum;
import ua.com.aacc.webChat.entity.enums.SubjectTypeEnum;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@ManagedBean(name = "webChatConfigController")
@SessionScoped
public class WebChatConfigController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(WebChatConfigController.class);
    private WebChatConfig current;
    private LazyDataModel<WebChatConfig> lazyModel = null;
    @EJB
    private WebChatConfigFacade ejbFacade;

    public WebChatConfigController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<WebChatConfig>() {

            @Override
            public List<WebChatConfig> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
                logger.info("[WebChatConfigController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<WebChatConfig> result = new ArrayList<WebChatConfig>();
                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[WebChatConfigController] Error Loading data from lazyModel: ", e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }
                return result;
            }
        };
    }

    public LazyDataModel<WebChatConfig> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public WebChatConfig getSelected() {
        if (current == null) {
            current = new WebChatConfig();
            addSubjectToList();
        }
        return current;
    }

    public void addSubjectToList() {
        getSelected().getSubjectsList().add("");
    }

    public void removeSubjectFromList(int index) {
        if(getSelected().getSubjectsList().size()<2) return;
        try {
            logger.info("[WebChatConfigController] removeSubjectFromList: index='{}'", index);
            getSelected().getSubjectsList().remove(index);
        } catch (Exception e) {
            logger.error("[WebChatConfigController] removeSubjectFromList: index=" + index, e);
        }
    }

    private WebChatConfigFacade getFacade() {
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
        current = getLazyModel().getRowData();
        return "Edit";
    }

    public String update() {
        try {
            if (!getFacade().validateSkillSet(current.getSkillset())) {
                JsfUtil.addErrorMessage("ErrorSkillsetNotValid");
                return null;
            }

            current.setModDate(new Date());
            getFacade().edit(current, JsfUtil.getCurrentAdmin());
            JsfUtil.addSuccessMessage("RecordUpdated");
            return "List";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public void prepareDestroy() {
        current = getLazyModel().getRowData();
    }

    public String destroy() {
        performDestroy();
        recreateModel();
        return "List";
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage("RecordDeleted");
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    private void recreateModel() {
        lazyModel = null;
    }

//    public SelectItem[] getItemsAvailableSelect() {
//        List<WebChatConfig> entities = getFacade().findAll();
//        SelectItem[] items = new SelectItem[entities.size()];
//        int i = 0;
//        for (WebChatConfig dr : entities) {
//            items[i++] = new SelectItem(dr, dr.getName());
//        }
//        return items;
//    }

    public SelectItem[] getItemsLanguages() {
        LanguageEnum[] languageEnums = LanguageEnum.values();
        int size = languageEnums.length;
        SelectItem[] items = new SelectItem[size];
        for (int i = 0; i < size; i++) {
            items[i] = new SelectItem(languageEnums[i], JsfUtil.translate("WebChatConfig_lang_" + languageEnums[i]));
        }
        return items;
    }

    public SelectItem[] getItemsAuthTypes() {
        AuthTypeEnum[] authTypeEnums = AuthTypeEnum.values();
        int size = authTypeEnums.length;
        SelectItem[] items = new SelectItem[size];
        for (int i = 0; i < size; i++) {
            items[i] = new SelectItem(authTypeEnums[i], JsfUtil.translate("WebChatConfig_auth_" + authTypeEnums[i]));
        }
        return items;
    }

    public boolean isAuthTypeAacc() {
        return current.getAuthType().equals(AuthTypeEnum.AACC_AUTH);
    }

    public SelectItem[] getItemsContactPriorities() {
        ContactPriorityEnum[] priorityEnums = ContactPriorityEnum.values();
        int size = priorityEnums.length;
        SelectItem[] items = new SelectItem[size];
        for (int i = 0; i < size; i++) {
            items[i] = new SelectItem(priorityEnums[i], JsfUtil.translate("WebChatConfig_priority_" + priorityEnums[i]));
        }
        return items;
    }

    public SelectItem[] getItemsSubjectTypes() {
        SubjectTypeEnum[] subjectTypeEnums = SubjectTypeEnum.values();
        int size = subjectTypeEnums.length;
        SelectItem[] items = new SelectItem[size];
        for (int i = 0; i < size; i++) {
            items[i] = new SelectItem(subjectTypeEnums[i], JsfUtil.translate("WebChatConfig_subjectType_" + subjectTypeEnums[i]));
        }
        return items;
    }

    public boolean isSelectedSubjectTypeFromList(){
        return current.getSubjectType() == SubjectTypeEnum.FROM_LIST;
    }

    public SelectItem[] getItemsAllWcSkillsets(){
         try{
             CISkillsetReadType[] wcSkillsets = getFacade().getAllWcSkillsets();
             int size = wcSkillsets.length;
             SelectItem[] items = new SelectItem[size];
             for (int i = 0; i < size; i++) {
                 logger.info("Setting val '{}'",wcSkillsets[i].getName());
                 items[i] = new SelectItem(wcSkillsets[i].getName());
             }
             return items;
         } catch (Exception e){
             logger.warn("Error in getItemsAllWcSkillsets ",e);
             JsfUtil.addErrorMessage(e,"Failed to load WC skillsets");
             SelectItem[] items = new SelectItem[1];
             items[0]=new SelectItem("Error");
             return items;
         }
    }

    public SelectItem[] getItemsAllEmailSkillsets(){
        try{
            CISkillsetReadType[] emailSkillsets = getFacade().getAllEmailSkillsets();
            int size = emailSkillsets.length;
            logger.info("getItemsAllEmailSkillsets: size is {}",size);
            SelectItem[] items = new SelectItem[size];
            for (int i = 0; i < size; i++) {
                logger.info("Setting val '{}'",emailSkillsets[i].getName());
                items[i] = new SelectItem(emailSkillsets[i].getName());
            }
            return items;
        } catch (Exception e){
            logger.warn("Error in getItemsAllEmailSkillsets ",e);
            JsfUtil.addErrorMessage(e,"Failed to load Email skillsets");
            SelectItem[] items = new SelectItem[1];
            items[0]=new SelectItem("Error");
            return items;
        }
    }

    @FacesConverter(forClass = WebChatConfig.class, value = "outgoingNumberPoolConverter")
    public static class outgoingNumberPoolControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            System.out.println("outgoingNumberPoolControllerConverter: getAsObject value=" + value);
            if (value == null || value.length() == 0) {
                return null;
            }
            WebChatConfigController controller = (WebChatConfigController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "outgoingNumberPoolController");
            return controller.ejbFacade.find(value);
        }

//        String getKey(String value) {
//            Long key;
//            key = Long.valueOf(value);
//            return key;
//        }

        String getStringKey(String value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof WebChatConfig) {
                WebChatConfig o = (WebChatConfig) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + WebChatConfigController.class.getName());
            }
        }
    }
}
