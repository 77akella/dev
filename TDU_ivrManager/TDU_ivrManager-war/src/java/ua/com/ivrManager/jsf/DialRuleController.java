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
import ua.com.ivrManager.ejb.entity.DialRule;
import ua.com.ivrManager.ejb.entity.DialRuleEntery;
import ua.com.ivrManager.ejb.session.DialRuleFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;



@ManagedBean(name = "dialRuleController")
@SessionScoped
public class DialRuleController implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(DialRuleController.class);
    private DialRule current;
    private LazyDataModel<DialRule> lazyModel = null;
    @EJB
    private ua.com.ivrManager.ejb.session.DialRuleFacade ejbFacade;

    public DialRuleController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<DialRule>() {

            @Override
            public List<DialRule> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info("[DialRuleController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<DialRule> result = new ArrayList<DialRule>();

                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder==SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("Error Loading data from lazyModel: ",e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error: "+e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }

                return result;
            }
        };
    }

    public LazyDataModel<DialRule> getLazyModel() {
        if(lazyModel==null){
            loadData();
        }
        return lazyModel;
    }

    public DialRule getSelected() {
        if (current == null) {
            current = new DialRule();
            current.getDialRuleEnteries().add(new DialRuleEntery());
        }
        return current;
    }

    public void addDialRuleEntery(){
        getSelected().getDialRuleEnteries().add(new DialRuleEntery());
    }

    public void removeDialRuleEntery(DialRuleEntery dialRuleEntery){
        try {
            logger.info( "[DialRuleController] removeDialRuleEntery: index='{}'", dialRuleEntery);
            getSelected().getDialRuleEnteries().remove(dialRuleEntery);
        } catch (Exception e) {
            logger.error("removeDialRuleEntery: index="+dialRuleEntery,e);
        }
    }

    private DialRuleFacade getFacade() {
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
        current = (DialRule) getLazyModel().getRowData();
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

    public void prepareDestroy(){
        current = (DialRule) getLazyModel().getRowData();
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
        List<DialRule> entities = getFacade().findAll();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (DialRule dr : entities) {
            items[i++] = new SelectItem(dr, dr.getName());
        }
        return items;
    }


    @FacesConverter(forClass = DialRule.class,value="dialRuleConverter")
    public static class dialRuleControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            DialRuleController controller = (DialRuleController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "dialRuleController");
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
//            if((object instanceof String)&&((String) object).isEmpty()){
//                return null;
//            }
            if (object instanceof DialRule) {
                DialRule o = (DialRule) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + DialRuleController.class.getName());
            }
        }
    }
}
