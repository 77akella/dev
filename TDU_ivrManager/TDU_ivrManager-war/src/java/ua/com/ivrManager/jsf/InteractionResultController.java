package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.chart.PieChartModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Campaign;
import ua.com.ivrManager.ejb.session.InteractionFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;

@ManagedBean(name = "interactionResultController")
@SessionScoped
public class InteractionResultController implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(InteractionResultController.class);
    @EJB
    private InteractionFacade ejbFacade;
    private Date fromDate;
    private Date toDate;
    private Campaign selected;

    public Campaign getSelected() {
        return selected;
    }

    public void setSelected(Campaign selected) {
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

    public Integer getInCallsCount(){
        return getFacade().getCallsCount(selected, true, fromDate, toDate, true);
    }

    public Integer getOutCallsCount(){
        return getFacade().getCallsCount(selected, false, fromDate, toDate, true);
    }

    public Integer getOutCallsCountTotal(){
        return getFacade().getCallsCount(selected, false, fromDate, toDate, false);
    }

    public Integer getInMinDuration(){
        return getFacade().getMinDuration(selected, true, fromDate, toDate);
    }

    public Integer getOutMinDuration(){
        return getFacade().getMinDuration(selected, false, fromDate, toDate);
    }

    public Integer getInMaxDuration(){
        return getFacade().getMaxDuration(selected, true, fromDate, toDate);
    }

    public Integer getOutMaxDuration(){
        return getFacade().getMaxDuration(selected, false, fromDate, toDate);
    }

    public Double getInAvgDuration(){
        return getFacade().getAvgDuration(selected, true, fromDate, toDate);
    }

    public Double getOutAvgDuration(){
        return getFacade().getAvgDuration(selected, false, fromDate, toDate);
    }

    public String getSummDurationAllIncomming(){
        return getFacade().getSumDurationAllCampaigns(true).toString();
    }

    public String getSummDurationAllOutgoing(){
        return getFacade().getSumDurationAllCampaigns(false).toString();
    }

    public Integer getInSumDuration(){
        return getFacade().getSumDuration(selected, true, fromDate, toDate);
    }

    public Integer getOutSumDuration(){
        return getFacade().getSumDuration(selected, false, fromDate, toDate);
    }

    public PieChartModel getInWrapCodes(){
        Map<String, Number> wrapUpCodesMap = getFacade().getWrapUpCodesMap(selected, true, fromDate, toDate);
        PieChartModel pieChartModel = new PieChartModel();
        if(wrapUpCodesMap.isEmpty()){
            pieChartModel.set(JsfUtil.translate("No_Data"), 1);
        }else{
            for(Map.Entry<String, Number> wrapUpCode:wrapUpCodesMap.entrySet()){
                pieChartModel.set(JsfUtil.translate(wrapUpCode.getKey())+" ("+wrapUpCode.getValue()+")", wrapUpCode.getValue());
            }
        }
        return pieChartModel;
    }

    public PieChartModel getOutWrapCodes(){
        Map<String, Number> wrapUpCodesMap = getFacade().getWrapUpCodesMap(selected, false, fromDate, toDate);
        PieChartModel pieChartModel = new PieChartModel();
        if(wrapUpCodesMap.isEmpty()){
            pieChartModel.set(JsfUtil.translate("No_Data"), 1);
        }else{
            for(Map.Entry<String, Number> wrapUpCode:wrapUpCodesMap.entrySet()){
                pieChartModel.set(JsfUtil.translate(wrapUpCode.getKey())+" ("+wrapUpCode.getValue()+")", wrapUpCode.getValue());
            }
        }
        return pieChartModel;
    }

    public PieChartModel getOutCompletionCodes(){
        Map<String, Number> completionCodesMap = getFacade().getCompletionCodesMap(selected, fromDate, toDate);
        PieChartModel pieChartModel = new PieChartModel();
        if(completionCodesMap.isEmpty()){
            pieChartModel.set(JsfUtil.translate("No_Data"), 1);
        }else{
            for(Map.Entry<String, Number> complCode:completionCodesMap.entrySet()){
                pieChartModel.set(JsfUtil.translate(complCode.getKey())+" ("+complCode.getValue()+")", complCode.getValue());
            }
        }
        return pieChartModel;
    }

    public PieChartModel getInDnis(){
        Map<String, Number> completionCodesMap = getFacade().getDnisMap(selected, fromDate, toDate);
        PieChartModel pieChartModel = new PieChartModel();
        if(completionCodesMap.isEmpty()){
            pieChartModel.set(JsfUtil.translate("No_Data"), 1);
        }else{
            pieChartModel.setData(completionCodesMap);
        }
        return pieChartModel;
    }


    private InteractionFacade getFacade() {
        return ejbFacade;
    }
}
