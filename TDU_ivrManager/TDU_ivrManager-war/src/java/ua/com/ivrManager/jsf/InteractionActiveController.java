package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.chart.PieChartModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Campaign;
import ua.com.ivrManager.ejb.entity.Interaction;
import ua.com.ivrManager.ejb.entity.Interaction_;
import ua.com.ivrManager.ejb.session.InteractionFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;

@ManagedBean(name = "interactionActiveController")
@SessionScoped
public class InteractionActiveController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(InteractionActiveController.class);
    @EJB
    private InteractionFacade ejbFacade;
//    private List<ColumnModel> columns = new ArrayList<ColumnModel>();
    private List<String> selectedColumns = Arrays.asList("modDate", "incomming",
            "duration", "ani", "dnis", "lastComplCode", "wrapUpCode", "callFlow.name", "campaign.name", "contactList.name", "contactId");
    private final static List<String> availableColumns = Arrays.asList("modDate", "incomming",
            "duration", "ani", "dnis", "lastComplCode", "wrapUpCode", "callFlow.name", "campaign.name", "contactList.name", "contactId");
    private long lastInteractionRequest = System.currentTimeMillis();
    private long lastCampaignRequest = System.currentTimeMillis();
    private static List<Interaction> activeInteractions = new ArrayList();
    private static Map<Campaign, CampaignStatisticsModel> activeCampaigns;

    public List<String> getAvailableColumns() {
        return availableColumns;
    }

    public List<String> getSelectedColumns() {
        return selectedColumns;
    }

    public void setSelectedColumns(List<String> selectedColumns) {
        this.selectedColumns = selectedColumns;
    }

    public boolean isColumnRendered(String key) {
        return selectedColumns.contains(key);
    }

    private InteractionFacade getFacade() {
        return ejbFacade;
    }

    public long getInteractionTimer() {
        if ((System.currentTimeMillis() - lastInteractionRequest) >= 10000) {
            lastInteractionRequest = System.currentTimeMillis();
            setActive();
        }
        return 9 - (System.currentTimeMillis() - lastInteractionRequest) / 1000;
    }

    private void setActive() {
        HashMap<String, String> filter = new HashMap<String, String>();
        filter.put(Interaction_.processing.getName(), "bool__true");
        activeInteractions = getFacade().load(0, 1000, Interaction_.modDate.getName(), true, filter, "startDate", null, null);
    }

    public List<Interaction> getActive() {
        if(activeInteractions==null||activeInteractions.isEmpty()){
            setActive();
        }
        for (Interaction a : activeInteractions) {
            if (a.getStartDate() != null) {
                a.setDuration((int) (System.currentTimeMillis() - a.getStartDate().getTime()) / 1000);
            }
        }
        return activeInteractions;
    }

    public long getCampaignTimer() {
        if ((System.currentTimeMillis() - lastCampaignRequest) > 30000) {
            lastCampaignRequest = System.currentTimeMillis();
            setRunningCampaigns();
            setPieCharts();
        }
        return 29 - (System.currentTimeMillis() - lastCampaignRequest) / 1000;
    }

    private void setRunningCampaigns() {
        activeCampaigns = new HashMap<Campaign, CampaignStatisticsModel>();
        for (Campaign c : getFacade().findRunningCampaigns()) {
            CampaignStatisticsModel campaignStatisticsModel = new CampaignStatisticsModel();
            campaignStatisticsModel.setSuccessInteractions(getFacade().getInteractionsCountAnswered(c, c.getContactList()));
            campaignStatisticsModel.setAttemptsInteractions(getFacade().getCallsCount(c, false, null, null, false));
            campaignStatisticsModel.setPlannedInteractions(getFacade().getInteractionsCountPlannedRecall(c, c.getContactList()));
            campaignStatisticsModel.setFiledInteractions(getFacade().getInteractionsCountFiled(c, c.getContactList()));

            activeCampaigns.put(c, campaignStatisticsModel);
        }
    }

    private void setPieCharts() {
        for (Campaign c : activeCampaigns.keySet()) {
            try {
                Integer done = getFacade().getInteractionsCountDone(c, c.getContactList());
                activeCampaigns.get(c).getCapmaignProgressPieChart().getData().put(
                        JsfUtil.translate("contactsDone") + ": " + done + " (" + 100 * done / c.getContactList().getContactsCount() + " %)", done);
                activeCampaigns.get(c).getCapmaignProgressPieChart().getData().put(
                        JsfUtil.translate("contactsLeft") + ": " + (c.getContactList().getContactsCount() - done) + " (" + 100 * (c.getContactList().getContactsCount() - done) / c.getContactList().getContactsCount() + " %)", c.getContactList().getContactsCount() - done);
            } catch (Exception e) {
                logger.error("[InteractionActiveController] capmaignProgressPieChart: campaign=" + c.getName(), e);
            }
            try {
                Integer successful = interactionsCountAnswered(c);
                Integer filed = interactionsCountFiled(c);
                activeCampaigns.get(c).getContactListQualityPieChart().getData().put(
                        JsfUtil.translate("Interactions_Successful") + ": " + successful + " (" + (((successful + filed) != 0) ? (100 * successful / (successful + filed)) : "0") + " %)", successful);
                activeCampaigns.get(c).getContactListQualityPieChart().getData().put(
                        JsfUtil.translate("Interactions_Filed") + ": " + filed + " (" + (((successful + filed) != 0) ? (100 * filed / (successful + filed)) : "0") + " %)", filed);
            } catch (Exception e) {
                logger.error("[InteractionActiveController] contactListQualityPieChart: campaign=" + c.getName(), e);
            }
        }
    }

    public List<Object> getRunningCampaings() {
        if (activeCampaigns == null||activeCampaigns.isEmpty()) {
            setRunningCampaigns();
        }
        return Arrays.asList(activeCampaigns.keySet().toArray());
    }

    public Integer interactionsCountAnswered(Campaign campaign) {
        return activeCampaigns.get(campaign).getSuccessInteractions();
    }

    public Integer interactionsAttemptsCount(Campaign campaign) {
        return activeCampaigns.get(campaign).getAttemptsInteractions();
    }

    public Integer interactionsCountPlannedRecall(Campaign campaign) {
        return activeCampaigns.get(campaign).getPlannedInteractions();
    }

    public Integer interactionsCountFiled(Campaign campaign) {
        return activeCampaigns.get(campaign).getFiledInteractions();
    }

    public PieChartModel capmaignProgressPieChart(Campaign c) {
        if (activeCampaigns.get(c).getCapmaignProgressPieChart().getData().isEmpty()) {
            setPieCharts();
        }
        return activeCampaigns.get(c).getCapmaignProgressPieChart();
    }

    public PieChartModel contactListQualityPieChart(Campaign c) {
        if (activeCampaigns.get(c).getContactListQualityPieChart().getData().isEmpty()) {
            setPieCharts();
        }
        return activeCampaigns.get(c).getContactListQualityPieChart();
    }

    public String prepareActive() {
        logger.info("[InteractionActiveController] prepareActive");
        setActive();
        setRunningCampaigns();
        setPieCharts();
        return "Active";
    }

    public class CampaignStatisticsModel implements Serializable {

        private Integer successInteractions;
        private Integer attemptsInteractions;
        private Integer plannedInteractions;
        private Integer filedInteractions;
        private PieChartModel capmaignProgressPieChart = new PieChartModel();
        private PieChartModel contactListQualityPieChart = new PieChartModel();

        public Integer getAttemptsInteractions() {
            return attemptsInteractions;
        }

        public void setAttemptsInteractions(Integer attemptsInteractions) {
            this.attemptsInteractions = attemptsInteractions;
        }

        public Integer getFiledInteractions() {
            return filedInteractions;
        }

        public void setFiledInteractions(Integer filedInteractions) {
            this.filedInteractions = filedInteractions;
        }

        public Integer getPlannedInteractions() {
            return plannedInteractions;
        }

        public void setPlannedInteractions(Integer plannedInteractions) {
            this.plannedInteractions = plannedInteractions;
        }

        public Integer getSuccessInteractions() {
            return successInteractions;
        }

        public void setSuccessInteractions(Integer successInteractions) {
            this.successInteractions = successInteractions;
        }

        public PieChartModel getCapmaignProgressPieChart() {
            return capmaignProgressPieChart;
        }

        public void setCapmaignProgressPieChart(PieChartModel capmaignProgressPieChart) {
            this.capmaignProgressPieChart = capmaignProgressPieChart;
        }

        public PieChartModel getContactListQualityPieChart() {
            return contactListQualityPieChart;
        }

        public void setContactListQualityPieChart(PieChartModel contactListQualityPieChart) {
            this.contactListQualityPieChart = contactListQualityPieChart;
        }
    }
}
