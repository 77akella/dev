package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.util.*;
import java.util.Map.Entry;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Interaction;
import ua.com.ivrManager.ejb.entity.InteractionResults;
import ua.com.ivrManager.ejb.entity.Interaction_;
import ua.com.ivrManager.ejb.entity.Var;
import ua.com.ivrManager.ejb.session.InteractionFacade;

@ManagedBean(name = "interactionController")
@SessionScoped
public class InteractionController implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(InteractionController.class);
    @EJB
    private InteractionFacade ejbFacade;
//    private List<ColumnModel> columns = new ArrayList<ColumnModel>();
    private List<String> selectedColumns = Arrays.asList("modDate", "incomming",
            "duration", "ani", "dnis", "lastComplCode", "wrapUpCode", "callFlow.name", "campaign.name", "contactList.name", "contactId");
    private final static List<String> availableColumns = Arrays.asList("modDate", "incomming",
            "duration", "ani", "dnis", "lastComplCode", "wrapUpCode", "callFlow.name", "campaign.name", "contactList.name", "contactId");
    private Map<String, String> filters = new HashMap<String, String>();
    private LazyDataModel<Interaction> lazyModel;
    private Date fromDate;
    private Date toDate;
    private Interaction selected = new Interaction();
    private static final Comparator<Map.Entry> comparatorByKeyDate = new Comparator<Map.Entry>() {

        @Override
        public int compare(Entry o1, Entry o2) {
            return ((Map.Entry<Date, String>) o1).getKey().compareTo(((Map.Entry<Date, String>) o2).getKey());
        }
    };
    private static final Comparator<InteractionResults> comparatorByRecordCount = new Comparator<InteractionResults>() {

        @Override
        public int compare(InteractionResults o1, InteractionResults o2) {
            return o1.getRecordCount().compareTo(o2.getRecordCount());
        }
    };

    public InteractionController() {
        filters = new HashMap<String, String>();
    }

    public List<String> getAvailableColumns() {
        return availableColumns;
    }

    public List<String> getSelectedColumns() {
        return selectedColumns;
    }

    public void setSelectedColumns(List<String> selectedColumns) {
        this.selectedColumns = selectedColumns;
    }

    public Map<String, String> getFilters() {
        return filters;
    }

    public void setFilters(Map<String, String> filters) {
        this.filters = filters;
    }

    public Interaction getSelected() {
        return selected;
    }

    public boolean isColumnRendered(String key) {
        return selectedColumns.contains(key);
    }

    public void resetFilters() {
        filters = new HashMap<String, String>();
        fromDate = null;
        toDate = null;
    }

    public void setSelected(Interaction selected) {
        this.selected = selected;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void loadData() {
        lazyModel = new LazyDataModel<Interaction>() {

            @Override
            public List<Interaction> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filter) {

                logger.info( "[InteractionController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<Interaction> result = new ArrayList<Interaction>();

                try {
                    selected = new Interaction();
                    filters.put(Interaction_.ended.getName(), "bool__true");
                    filters.put(Interaction_.processing.getName(), "bool__false");
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters, "modDate", fromDate, toDate);
                    lazyModel.setRowCount(getFacade().loadCount(filters, "modDate", fromDate, toDate));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error( "[InteractionController] Error Loading data from lazyModel: ", e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }

                return result;
            }

            @Override
            public Interaction getRowData(String rowKey) {
                List<Interaction> interactions = (List<Interaction>) getWrappedData();
                for (Interaction i : interactions) {
                    if (i.getId().toString().equals(rowKey)) {
                        return i;
                    }
                }
                return null;
            }

            @Override
            public Object getRowKey(Interaction interaction) {
                return interaction.getId();
            }
        };
    }

    public LazyDataModel<Interaction> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public List<InteractionResults> getSelectedResultVars() {
        Collections.sort(getSelected().getResultVars(), comparatorByRecordCount);
        return getSelected().getResultVars();
    }

    public List<Map.Entry> mapVarsToList(Map map) {
        if (map == null) {
            return null;
        }
        List<Map.Entry> list = new ArrayList<Map.Entry>();
        Iterator i = map.keySet().iterator();
        if (i.hasNext() && (i.next() instanceof Var)) {
            Map newMap = new HashMap();
            for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
                Map.Entry me = (Map.Entry) it.next();
                Var v = (Var) me.getKey();
                newMap.put(v.getName(), me.getValue());
            }
            list.addAll(newMap.entrySet());
            return list;
        }


        list.addAll(map.entrySet());
        Collections.sort(list, comparatorByKeyDate);
        return list;
    }

    public void onDateSelect() {
        logger.info( "[InteractionController] Date selected from='{}' to='{}'", new Object[]{fromDate, toDate});
        loadData();
    }

    private InteractionFacade getFacade() {
        return ejbFacade;
    }
//    public List<Interaction> getActive() {
//        HashMap<String, String> filter = new HashMap<String, String>();
//        filter.put(Interaction_.processing.getName(), "bool__true");
//        List<Interaction> active;
//        active=getFacade().load(0, 1000, Interaction_.modDate.getName(), true, filter, "modDate", null, null);
//        for(Interaction a: active){
//            if(a.getStartDate()!=null){
//                a.setDuration((int)((new Date()).getTime()-a.getStartDate().getTime())/1000);
//            }
//        }
//        return active;
//    }
//
//    public List<Campaign> getRunningCampaings(){
//        return getFacade().findRunningCampaigns();
//    }
//
//    public Integer interactionsCountAnswered(Campaign campaign){
//        return getFacade().getInteractionsCountAnswered(campaign,campaign.getContactList());
//    }
//
//    public Integer interactionsAttemptsCount(Campaign campaign){
//        return getFacade().getCallsCount(campaign, false, null, null, false);
//    }
//
//    public Integer interactionsCountPlannedRecall(Campaign campaign){
//        return getFacade().getInteractionsCountPlannedRecall(campaign,campaign.getContactList());
//    }
//
//    public Integer interactionsCountFiled(Campaign campaign){
//        return getFacade().getInteractionsCountFiled(campaign,campaign.getContactList());
//    }
////TODO: Convert to static methods. Use private variables for statistics. Check for timers here, not in facelet.
//    public PieChartModel capmaignProgressPieChart(Campaign campaign){
//        PieChartModel pieChartModel=new PieChartModel();
//        java.util.logging.Logger.getLogger(InteractioController.class.getName()).log(Level.INFO,"[InteractionController] capmaignProgressPieChart: campaign="+campaign.getName());
//        try{
//            Integer done=getFacade().getInteractionsCountDone(campaign, campaign.getContactList());
//            pieChartModel.getData().put(
//                    JsfUtil.translate("contactsDone")+": "+done+" ("+100*done/campaign.getContactList().getContactsCount()+" %)"
//                    , done);
//            pieChartModel.getData().put(
//                    JsfUtil.translate("contactsLeft")+": "+(campaign.getContactList().getContactsCount()-done)+" ("+100*(campaign.getContactList().getContactsCount()-done)/campaign.getContactList().getContactsCount()+" %)"
//                    , campaign.getContactList().getContactsCount()-done+0.01);
//        } catch (Exception e) {
//            logger.error("capmaignProgressPieChart: campaign="+campaign.getName(),e);
//        }
//        return pieChartModel;
//    }
//
//    public PieChartModel contactListQualityPieChart(Campaign campaign){
//        PieChartModel pieChartModel=new PieChartModel();
//        java.util.logging.Logger.getLogger(InteractioController.class.getName()).log(Level.INFO,"[InteractionController] contactListQualityPieChart: campaign="+campaign.getName());
//        try {
//            Integer successful=interactionsCountAnswered(campaign);
//            Integer filed=interactionsCountFiled(campaign);
//            pieChartModel.getData().put(
////                    JsfUtil.translate("Interactions_Successful")+": "+successful+" ("+100*successful/(successful+filed)+" %)"
//                    JsfUtil.translate("Interactions_Successful")
//                    , successful);
//            pieChartModel.getData().put(
////                    JsfUtil.translate("Interactions_Filed")+": "+filed+" ("+100*(filed)/(successful+filed)+" %)"
//                    JsfUtil.translate("Interactions_Filed")
//                    , filed+0.01);
//        } catch (Exception e) {
//            logger.error("contactListQualityPieChart: campaign="+campaign.getName(),e);
//        }
//        return pieChartModel;
//    }
//
//    public String prepareActive() {
//        java.util.logging.Logger.getLogger(InteractioController.class.getName()).log(Level.INFO,"[InteractionController] prepareActive");
//        return "Active";
//    }
}
