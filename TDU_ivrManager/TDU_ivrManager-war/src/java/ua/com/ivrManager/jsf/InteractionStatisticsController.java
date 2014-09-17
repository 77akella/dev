package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.model.TreeNode;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.*;
import ua.com.ivrManager.ejb.session.InteractionStatisticsFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;
import ua.com.ivrManager.util.BasicVXML;

@ManagedBean(name = "interactionStatisticsController")
@SessionScoped
public class InteractionStatisticsController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(InteractionStatisticsController.class);
    @EJB
    private InteractionStatisticsFacade ejbFacade;
    private Date fromDate;
    private Date toDate;
    private Campaign selected;
    private CallFlow selectedCallFlow;
    private TreeNode root;
    private CallFlowNode selectedCallFlowNode;
    private List<StatisticsTemplateEntery> templateEnteries = new ArrayList<StatisticsTemplateEntery>();

    public Campaign getSelected() {
        return selected;
    }

    public void setSelected(Campaign selected) {
        this.selected = selected;
    }

    public CallFlow getSelectedCallFlow() {
        return selectedCallFlow;
    }

    public void setSelectedCallFlow(CallFlow selectedCallFlow) {
        this.selectedCallFlow = selectedCallFlow;
        this.root = ((CallFlowController) FacesContext.getCurrentInstance().getApplication().getELResolver().
                getValue(FacesContext.getCurrentInstance().getELContext(), null, "callFlowController")).getTreeNodeRoot(selectedCallFlow);
        this.selectedCallFlowNode = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public List<StatisticsTemplateEntery> getTemplateEnteries() {
        return templateEnteries;
    }

    public CallFlowNode getSelectedCallFlowNode() {
        return selectedCallFlowNode;
    }

    public void setSelectedCallFlowNode(CallFlowNode selectedCallFlowNode) {
        logger.info("[InteractionStatisticsController] setSelectedCallFlowNode: {0} vars: {1}", new Object[]{selectedCallFlowNode.toString(), selectedCallFlowNode.getVars()});
        this.selectedCallFlowNode = selectedCallFlowNode;
        populateTemplateEnteries();
    }

    public List<SelectItem> getSelectItemsCallFlowNodes() {
        List<SelectItem> list = new ArrayList<SelectItem>();
        if (selectedCallFlow == null) {
            list.add(new SelectItem(null, JsfUtil.translate("Statistics_selectCallFlow")));
            return list;
        }
        List<TreeNode> callFlowNodes = getCallFlowNodesRecursively(root);
        for (TreeNode callFlowTreeNode : callFlowNodes) {
            if (((CallFlowNode) callFlowTreeNode.getData()).getType().equals(BasicVXML.TYPE_BASIC_MENU_NAME)) {
                list.add(new SelectItem(((CallFlowNode) callFlowTreeNode.getData()), ((CallFlowNode) callFlowTreeNode.getData()).getName()
                        + "[" + JsfUtil.translate(((CallFlowNode) callFlowTreeNode.getData()).getType()) + "]"));
                logger.info("[InteractionStatisticsController] getSelectItemsCallFlowNodes: added {0}", callFlowTreeNode);
            }
        }

        if (list.size() > 0 && selectedCallFlowNode == null) {
            setSelectedCallFlowNode((CallFlowNode) list.get(0).getValue());
            populateTemplateEnteries();
        } else {
            list.add(new SelectItem(null, JsfUtil.translate("Statistics_selectCallFlow")));
        }
        return list;
    }

    private List<TreeNode> getCallFlowNodesRecursively(TreeNode callFlowNode) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(callFlowNode);
        for (TreeNode tn : callFlowNode.getChildren()) {
            list.addAll(getCallFlowNodesRecursively(tn));
        }
        return list;
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

    private void populateTemplateEnteries() {
        templateEnteries = new ArrayList<StatisticsTemplateEntery>();
        if (getSelectedCallFlowNode() == null) {
            return;
        }
        logger.info("[InteractionStatisticsController] populateTemplateEnteries");
        List<Var> vars = getSelectedCallFlowNode().getVars();

        for (Var v : vars) {
            if (v.getType().equals(BasicVXML.TYPE_BASIC_MENU_NAME) && v.getDotName().equals(BasicVXML.VARIABLE_FIELD_VALUE)) {
                templateEnteries.add(0, new StatisticsTemplateEntery(v, StatisticsTemplateEntery.CHART_MODE_PIECHART_VALUES_FIRST_RESULT));
                templateEnteries.add(1, new StatisticsTemplateEntery(v, StatisticsTemplateEntery.CHART_MODE_BARCHART_STEP_TIME_FIRST_RESULT));
                templateEnteries.add(2, new StatisticsTemplateEntery(v, StatisticsTemplateEntery.CHART_MODE_PIECHART_VALUES_ALL_RESULTS));
                templateEnteries.add(3, new StatisticsTemplateEntery(v, StatisticsTemplateEntery.CHART_MODE_BARCHART_STEP_TIME_ALL_RESULTS));
            }
            if (v.getType().equals(BasicVXML.TYPE_BASIC_MENU_NAME) && v.getDotName().equals(BasicVXML.VARIABLE_FIELD_NOMATCHCOUNT)) {
                templateEnteries.add(new StatisticsTemplateEntery(v, StatisticsTemplateEntery.CHART_MODE_PIECHART_VALUES_NO_MATCH));
            }
            if (v.getType().equals(BasicVXML.TYPE_BASIC_MENU_NAME) && v.getDotName().equals(BasicVXML.VARIABLE_FIELD_NOINPUTCOUNT)) {
                templateEnteries.add(new StatisticsTemplateEntery(v, StatisticsTemplateEntery.CHART_MODE_PIECHART_VALUES_NO_INPUT));
            }
        }
    }

    public boolean isPieChartRendered(String type) {
        return type.startsWith("pieChart");
//                templateEnteries.getRowData().getChartMode().equals(StatisticsTemplateEntery.CHART_MODE_PIECHART_VALUES_FIRST_RESULT)
//                ||
//                templateEnteries.getRowData().getChartMode().equals(StatisticsTemplateEntery.CHART_MODE_PIECHART_VALUES_ALL_RESULTS);
    }

    public boolean isBarChartRendered(String type) {
        return type.startsWith("barChart");
    }

    public PieChartModel getPieChartResults(StatisticsTemplateEntery templateEntery) {
        PieChartModel pieChartModel = new PieChartModel();
        try {
            Map<String, Number> resultValues = getFacade().getValuesCountMapForPieChart(
                    templateEntery.getVar(),
                    fromDate,
                    toDate,
                    selected,
                    null,
                    templateEntery.getChartMode().equals(StatisticsTemplateEntery.CHART_MODE_PIECHART_VALUES_FIRST_RESULT));

            if (resultValues == null || resultValues.isEmpty()) {
                pieChartModel.set(JsfUtil.translate("No_Data"), 1);
            } else {
                for (Map.Entry<String, Number> resultValue : resultValues.entrySet()) {
                    pieChartModel.set(JsfUtil.translate(resultValue.getKey()) + " (" + resultValue.getValue() + ")", resultValue.getValue());
                }
            }
        } catch (Exception e) {
            logger.error("[InteractionStatisticsController] getPieChartResults: templateEntery=" + templateEntery, e);
        }
        return pieChartModel;
    }

    public CartesianChartModel getBarChartResults(StatisticsTemplateEntery templateEntery) {
        CartesianChartModel pieChartModel = new CartesianChartModel();
        try {
            Map<Float, Number> resultValues = getFacade().getChangeValueTimeMapForBarChart(
                    templateEntery.getVar(),
                    fromDate,
                    toDate,
                    selected,
                    null,
                    templateEntery.getChartMode().equals(StatisticsTemplateEntery.CHART_MODE_BARCHART_STEP_TIME_FIRST_RESULT));
            if (resultValues == null || resultValues.isEmpty()) {
                ChartSeries cs = new ChartSeries(JsfUtil.translate("No_Data"));
                cs.set(0, 0);
                pieChartModel.addSeries(cs);
            } else {
                ChartSeries cs = new ChartSeries(JsfUtil.translate(templateEntery.getChartMode()));
                //            cs.setData(resultValues);
                for (Map.Entry<Float, Number> resultValue : resultValues.entrySet()) {
                    cs.set(resultValue.getKey(), resultValue.getValue());
                }
                pieChartModel.addSeries(cs);
            }
        } catch (Exception e) {
            logger.error("[InteractionStatisticsController] getBarChartResults: templateEntery=" + templateEntery, e);
        }
        return pieChartModel;
    }

    private InteractionStatisticsFacade getFacade() {
        return ejbFacade;
    }
}
