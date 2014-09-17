/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.session;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.*;
import ua.com.ivrManager.util.QueryBundle;

/**
 *
 * @author Artem
 */
@Stateless
public class InteractionStatisticsFacade extends AbstractFacade<InteractionResults> {

    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;
    private static final Logger logger = LoggerFactory.getLogger(InteractionStatisticsFacade.class);

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InteractionStatisticsFacade() {
        super(InteractionResults.class);
    }

    public List<StatisticsTemplate> findAllTemplates(CallFlow callFlow) {
        return QueryBundle.createReadAllQuery(getEntityManager(), StatisticsTemplate.class).appendBoolFilter("deleted", false).appendEqObjectFilter(StatisticsTemplate_.callFlow.getName(), callFlow).compile().getResultList();
    }

    public Map<String, Number> getValuesCountMapForPieChart(Var var, Date fromDate, Date toDate, Campaign campaign, ContactList contactList, boolean firstResult) {
//        java.util.logging.Logger.getLogger(InteractionStatisticsFacade.class.getName()).log(Level.INFO,"getVarValuesMapForPieChart: var="+var.getId()+", firstResult="+firstResult);
        QueryBundle queryBundle = QueryBundle.createReadDistinctQuery(em, InteractionResults.class, InteractionResults_.resultVal.getName()).appendBoolFilter("deleted", false).appendEqObjectFilter(InteractionResults_.var.getName(), var).appendBetweenFilter(InteractionResults_.modDate.getName(), fromDate, toDate);
        if (firstResult) {
            queryBundle.appendEqFilter(InteractionResults_.resultCount.getName(), new Integer(1));
        }
        if (campaign != null) {
            queryBundle.appendEqObjectFilter(InteractionResults_.campaign.getName(), campaign);
        }
        if (contactList != null) {
            queryBundle.appendEqObjectFilter(InteractionResults_.contactList.getName(), contactList);
        }

        List<String> resultValues = (List<String>) queryBundle.compile().getResultList();
        if (resultValues == null || resultValues.isEmpty()) {
            return null;
        }
//            java.util.logging.Logger.getLogger(InteractionStatisticsFacade.class.getName()).log(Level.INFO,"getVarValuesMapForPieChart: resultValues="+resultValues);
        Map<String, Number> resultValuesMap = new HashMap<String, Number>();
        for (String resultValue : resultValues) {
            QueryBundle countResultValue = QueryBundle.createReadCountQuery(getEntityManager(), InteractionResults.class).appendBoolFilter("deleted", false).appendEqObjectFilter(InteractionResults_.var.getName(), var).appendBetweenFilter(InteractionResults_.modDate.getName(), fromDate, toDate);
            if (firstResult) {
                countResultValue.appendEqFilter(InteractionResults_.resultCount.getName(), new Integer(1));
            }
            if (campaign != null) {
                countResultValue.appendEqObjectFilter(InteractionResults_.campaign.getName(), campaign);
            }
            if (contactList != null) {
                countResultValue.appendEqObjectFilter(InteractionResults_.contactList.getName(), contactList);
            }
            if (resultValue == null) {
                countResultValue.appendIsNullFilter(InteractionResults_.resultVal.getName());
            } else {
                countResultValue.appendEqFilter(InteractionResults_.resultVal.getName(), resultValue);
            }
            Number count = ((Long) countResultValue.compile().getSingleResult());
//                java.util.logging.Logger.getLogger(InteractionStatisticsFacade.class.getName()).log(Level.INFO,"getVarValuesMapForPieChart: resultValue="+resultValue+", count="+count);
            resultValuesMap.put((resultValue == null ? "Undefined" : resultValue), count == null ? 0 : count);
        }
        logger.info("getVarValuesMapForPieChart: resultValuesMap=" + resultValuesMap);

        return resultValuesMap;
    }

    public Map<Float, Number> getChangeValueTimeMapForBarChart(Var var, Date fromDate, Date toDate, Campaign campaign, ContactList contactList, boolean firstResult) {
        int results = 10;
//        java.util.logging.Logger.getLogger(InteractionStatisticsFacade.class.getName()).log(Level.INFO,"getStepTimeMapForBarChart: var="+var.getId()+", firstResult="+firstResult);
        QueryBundle queryBundle = QueryBundle.createReadMaxQuery(em, InteractionResults.class, InteractionResults_.changeValTime.getName()).appendBoolFilter("deleted", false).appendEqObjectFilter(InteractionResults_.var.getName(), var).appendBetweenFilter(InteractionResults_.modDate.getName(), fromDate, toDate);
        if (firstResult) {
            queryBundle.appendEqFilter(InteractionResults_.resultCount.getName(), new Integer(1));
        }
        if (campaign != null) {
            queryBundle.appendEqObjectFilter(InteractionResults_.campaign.getName(), campaign);
        }
        if (contactList != null) {
            queryBundle.appendEqObjectFilter(InteractionResults_.contactList.getName(), contactList);
        }
        Integer maxStepTime = (Integer) queryBundle.compile().getSingleResult();
        if (maxStepTime == null) {
            return null;
        }
//            java.util.logging.Logger.getLogger(InteractionStatisticsFacade.class.getName()).log(Level.INFO,"getStepTimeMapForBarChart: maxStepTime="+maxStepTime);
        Map<Float, Number> resultValuesMap = new HashMap<Float, Number>(results);
        for (int i = 1; i <= results; i++) {
            QueryBundle countResultValue = QueryBundle.createReadCountQuery(getEntityManager(), InteractionResults.class).appendBoolFilter("deleted", false).appendEqObjectFilter(InteractionResults_.var.getName(), var).appendBetweenFilter(InteractionResults_.modDate.getName(), fromDate, toDate);
            if (firstResult) {
                countResultValue.appendEqFilter(InteractionResults_.resultCount.getName(), new Integer(1));
            }
            if (campaign != null) {
                countResultValue.appendEqObjectFilter(InteractionResults_.campaign.getName(), campaign);
            }
            if (contactList != null) {
                countResultValue.appendEqObjectFilter(InteractionResults_.contactList.getName(), contactList);
            }
            if (i == 1) {
                countResultValue.appendBetweenIntFilter(InteractionResults_.changeValTime.getName(), 0.0, Double.valueOf((i * maxStepTime) / results));
            } else {
                countResultValue.appendBetweenIntFilter(InteractionResults_.changeValTime.getName(), Double.valueOf((i - 1) * maxStepTime / results), Double.valueOf(i * maxStepTime / results));
            }
            Number count = ((Long) countResultValue.compile().getSingleResult());
//                java.util.logging.Logger.getLogger(InteractionStatisticsFacade.class.getName()).log(Level.INFO,"getStepTimeMapForBarChart: (i*maxStepTime)/results<="+((i*maxStepTime)/results)/1000+", count="+count);
            resultValuesMap.put(Float.valueOf(((i * maxStepTime) / results) / 1000), count == null ? 0 : count);
        }
        logger.info("getStepTimeMapForBarChart: resultValuesMap=" + resultValuesMap);

        return resultValuesMap;
    }
}
