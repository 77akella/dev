package ua.com.aacc.webChat.admin.war.mBean;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.aacc.webChat.admin.war.mBean.util.JsfUtil;
import ua.com.aacc.webChat.ejb.WorkTimeRangeFacade;
import ua.com.aacc.webChat.ejb.WsCcmmFacade;
import ua.com.aacc.webChat.entity.WorkTimeRange;

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

@ManagedBean(name = "workTimeRangeController")
@SessionScoped
public class WorkTimeRangeController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(WorkTimeRangeController.class);
    private WorkTimeRange current;
    private LazyDataModel<WorkTimeRange> lazyModel = null;
    @EJB
    private WorkTimeRangeFacade ejbFacade;
    @EJB
    private WsCcmmFacade wsCcmmFacade;

    public WorkTimeRangeController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<WorkTimeRange>() {

            @Override
            public List<WorkTimeRange> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
                logger.info("[WorkTimeRangeController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<WorkTimeRange> result = new ArrayList<WorkTimeRange>();
                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[WorkTimeRangeController] Error Loading data from lazyModel: ", e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }
                return result;
            }
        };
    }

    public LazyDataModel<WorkTimeRange> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public WorkTimeRange getSelected() {
        if (current == null) {
            current = new WorkTimeRange();
        }
        return current;
    }

    private WorkTimeRangeFacade getFacade() {
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
        current = (WorkTimeRange) getLazyModel().getRowData();
        return "Edit";
    }

    public String update() {
        try {
            if (
                    (current.getMonEnd().before(current.getMonStart())) ||
                            (current.getTueEnd().before(current.getTueStart())) ||
                            (current.getWedEnd().before(current.getWedStart())) ||
                            (current.getThuEnd().before(current.getThuStart())) ||
                            (current.getFriEnd().before(current.getFriStart())) ||
                            (current.getSatEnd().before(current.getSatStart())) ||
                            (current.getSunEnd().before(current.getSunStart()))
                    ) {
                JsfUtil.addErrorMessage("ErrorWorkTimeNotValid");
                return null;
            }

            current.setModDate(new Date());

            logger.info("NOW is working time???? {}", current.isWorkingTime(System.currentTimeMillis()));
            getFacade().edit(current, JsfUtil.getCurrentAdmin());
            JsfUtil.addSuccessMessage("RecordUpdated");
            return "List";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public void prepareDestroy() {
        current = (WorkTimeRange) getLazyModel().getRowData();
    }

    public String destroy() {
        performDestroy();
        recreateModel();
        return "List";
    }

    private void performDestroy() {
        try {
            Long relatedWebChatsSize=getFacade().getRelatedWebChatsSize(current);
            if(relatedWebChatsSize>0){
                JsfUtil.addErrorMessage("ThereAreRelatedRecords",relatedWebChatsSize+"","RemoveRelatedRecordsFirst");
                return;
            }
            current.setDisabled(true);
            getFacade().edit(current, JsfUtil.getCurrentAdmin());
            JsfUtil.addSuccessMessage("RecordDeleted");
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    private void recreateModel() {
        lazyModel = null;
    }

    public SelectItem[] getItemsAvailableSelect() {
        List<WorkTimeRange> entities = getFacade().findAll();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (WorkTimeRange dr : entities) {
            items[i++] = new SelectItem(dr, dr.getName());
        }
        return items;
    }


    @FacesConverter(forClass = WorkTimeRange.class, value = "workTimeRangeConverter")
    public static class outgoingNumberPoolControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            WorkTimeRangeController controller = (WorkTimeRangeController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "workTimeRangeController");
            return controller.ejbFacade.find(value);
        }

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
            if (object instanceof WorkTimeRange) {
                WorkTimeRange o = (WorkTimeRange) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + WorkTimeRangeController.class.getName());
            }
        }
    }
}
