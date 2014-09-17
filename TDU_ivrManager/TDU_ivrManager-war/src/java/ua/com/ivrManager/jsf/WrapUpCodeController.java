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
import ua.com.ivrManager.ejb.entity.WrapUpCode;
import ua.com.ivrManager.ejb.session.WrapUpCodeFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;

@ManagedBean(name = "wrapUpCodeController")
@SessionScoped
public class WrapUpCodeController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(WrapUpCodeController.class);
    private WrapUpCode current;
    private LazyDataModel<WrapUpCode> lazyModel = null;
    @EJB
    private ua.com.ivrManager.ejb.session.WrapUpCodeFacade ejbFacade;

    public WrapUpCodeController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<WrapUpCode>() {

            @Override
            public List<WrapUpCode> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info("[WrapUpCodeController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<WrapUpCode> result = new ArrayList<WrapUpCode>();

                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[WrapUpCodeController] Error Loading data from lazyModel: ", e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }

                return result;
            }
        };
    }

    public LazyDataModel<WrapUpCode> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public WrapUpCode getSelected() {
        if (current == null) {
            current = new WrapUpCode();
        }
        return current;
    }

    private WrapUpCodeFacade getFacade() {
        return ejbFacade;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public void prepareCreate() {
        current = new WrapUpCode();
    }

    public void prepareEdit() {
        current = (WrapUpCode) getLazyModel().getRowData();
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
        current = (WrapUpCode) getLazyModel().getRowData();
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
        List<WrapUpCode> entities = getFacade().findAll();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (WrapUpCode wc : entities) {
            items[i++] = new SelectItem(wc.getId(), wc.getName());
        }
        return items;
    }

    public SelectItem[] getItemsAvailableSelectObj() {
        List<WrapUpCode> entities = getFacade().findAll();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (WrapUpCode wc : entities) {
            items[i++] = new SelectItem(wc, wc.getName());
        }
        return items;
    }

    @FacesConverter(forClass = WrapUpCode.class, value="wrapUpCodeConverter")
    public static class WrapUpCodeControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            WrapUpCodeController controller = (WrapUpCodeController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "wrapUpCodeController");
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
            if (object instanceof WrapUpCode) {
                WrapUpCode o = (WrapUpCode) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + WrapUpCodeController.class.getName());
            }
        }
    }
}
