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
public class InteractionFacade extends AbstractFacade<Interaction> {

    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;
    private static final Logger logger = LoggerFactory.getLogger(InteractionFacade.class);

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InteractionFacade() {
        super(Interaction.class);
    }

    public CallFlow findCallFlow(Long id){
        return getEntityManager().find(CallFlow.class, id);
    }

    public Campaign findCampaign(Long id){
        return getEntityManager().find(Campaign.class, id);
    }

    public List<Campaign> findAllRunningIncommingCampaigns() {
        QueryBundle qb = QueryBundle.createReadAllQuery(getEntityManager(), Campaign.class)
                .appendBoolFilter("deleted", false)
                .appendBoolFilter(Campaign_.incomming.getName(), true)
                .appendEqFilter("status", "Running");
        return qb.compile().getResultList();
    }

   public String findContactFileld(Long interactionId, Long varId) {
       logger.info("findContactFileld: interactionId="+interactionId+" ; varId="+varId);
       Interaction interaction=find(interactionId);
       Var var=getEntityManager().find(Var.class, varId);
       Integer conListColumn=((CampVarMap) QueryBundle.createReadAllQuery(getEntityManager(), CampVarMap.class)
               .appendBoolFilter("deleted", false)
               .appendEqObjectFilter(CampVarMap_.contactList.getName(), interaction.getContactList())
               .appendEqObjectFilter(CampVarMap_.var.getName(), var)
               .compile().setMaxResults(1).getSingleResult()).getConListColumn();
        return getEntityManager().find(Contact.class, interaction.getContactId()).getFields()[conListColumn];
    }

   public Var findVar(Long id){
        return getEntityManager().find(Var.class, id);
    }

    public WrapUpCode findWrapUpCode(Long id){
        return getEntityManager().find(WrapUpCode.class, id);
    }

    @Override
    public int loadCount(Map<String, String> filters) {
        return ((Long) createReadCountQueryBundle().setFilter(filters).appendBoolFilter("deleted", false).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult()).intValue();
    }

    @Override
    public List<Interaction> load(int start, int length, String order, boolean desc, Map<String, String> filters, String dateField, Date fromDate, Date toDate) {
        QueryBundle qb = createReadAllQueryBundle().appendOrder(order, desc).setFilter(filters).appendBetweenFilter(dateField, fromDate, toDate).appendIsNullFilter(Interaction_.child.getName());
        javax.persistence.Query q = qb.compile().setMaxResults(length).setFirstResult(start);
        return q.getResultList();
    }

    @Override
    public int loadCount(Map<String, String> filters, String dateField, Date fromDate, Date toDate) {
        return ((Long) createReadCountQueryBundle().setFilter(filters).appendBoolFilter("deleted", false).appendBetweenFilter(dateField, fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult()).intValue();
    }

    public List<Campaign> findRunningCampaigns() {
        return QueryBundle.createReadAllQuery(getEntityManager(), Campaign.class).appendBoolFilter(Campaign_.outgoing.getName(), true).appendEqFilter(Campaign_.status.getName(), "Running").compile().getResultList();
    }

    public Integer getInteractionsCountDone(Campaign campaign, ContactList contactList) {
        return ((Long) createReadCountQueryBundle().appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendEqObjectFilter(Interaction_.contactList.getName(), contactList).appendBoolFilter(Interaction_.incomming.getName(), false).appendBoolFilter(Interaction_.ended.getName(), true).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult()).intValue();
    }

    public Integer getInteractionsCountAnswered(Campaign campaign, ContactList contactList) {
        return ((Long) createReadCountQueryBundle().appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendEqObjectFilter(Interaction_.contactList.getName(), contactList).appendBoolFilter(Interaction_.incomming.getName(), false).appendBoolFilter(Interaction_.ended.getName(), true) //                             .appendStartsWithOrEqFilter(Interaction_.lastComplCode.getName(), "Answer_","mail_messageDelivered")
                .appendStartsWithOrEqFilter(Interaction_.lastComplCode.getName(), "Answer_", "mail_messageDelivered").appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult()).intValue();
    }

    public Integer getInteractionsCountFiled(Campaign campaign, ContactList contactList) {
        return ((Long) createReadCountQueryBundle().appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendEqObjectFilter(Interaction_.contactList.getName(), contactList).appendBoolFilter(Interaction_.incomming.getName(), false).appendBoolFilter(Interaction_.ended.getName(), true).appendStartsWithFilter(Interaction_.lastComplCode.getName(), "Answer_", false).appendStartsWithFilter(Interaction_.lastComplCode.getName(), "mail_messageDelivered", false).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult()).intValue();
    }

    public Integer getInteractionsCountPlannedRecall(Campaign campaign, ContactList contactList) {
        return ((Long) createReadCountQueryBundle().appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendEqObjectFilter(Interaction_.contactList.getName(), contactList).appendBoolFilter(Interaction_.incomming.getName(), false).appendIsNotNullFilter(Interaction_.parent.getName()).appendIsNullFilter(Interaction_.lastComplCode.getName()).appendBetweenFilter(Interaction_.scheduledDate.getName(), new Date(), null).compile().getSingleResult()).intValue();
    }

    public Integer getCallsCount(Campaign campaign, boolean incomming, Date fromDate, Date toDate, boolean noChild) {
        QueryBundle query = createReadCountQueryBundle().appendBoolFilter("deleted", false).appendEqFilter(Interaction_.type.getName(), 0).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), incomming).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate);
        if (noChild) {
            query = query.appendIsNullFilter(Interaction_.child.getName());
        }
        return ((Long) query.compile().getSingleResult()).intValue();
    }

    public Integer getMinDuration(Campaign campaign, boolean incomming, Date fromDate, Date toDate) {
        return (Integer) QueryBundle.createReadMinQuery(em, Interaction.class, Interaction_.duration.getName()).appendBoolFilter("deleted", false).appendEqFilter(Interaction_.type.getName(), 0).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), incomming).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult();
    }

    public Integer getMaxDuration(Campaign campaign, boolean incomming, Date fromDate, Date toDate) {
        return (Integer) QueryBundle.createReadMaxQuery(em, Interaction.class, Interaction_.duration.getName()).appendBoolFilter("deleted", false).appendEqFilter(Interaction_.type.getName(), 0).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), incomming).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult();
    }

    public Integer getSumDurationAllCampaigns(boolean incomming) {
        return (Integer) QueryBundle.createReadSumQuery(em, Interaction.class, Interaction_.duration.getName()).appendBoolFilter("deleted", false).appendEqFilter(Interaction_.type.getName(), 0).appendBoolFilter(Interaction_.incomming.getName(), incomming).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult();
    }

    public Integer getSumDuration(Campaign campaign, boolean incomming, Date fromDate, Date toDate) {
        return (Integer) QueryBundle.createReadSumQuery(em, Interaction.class, Interaction_.duration.getName()).appendBoolFilter("deleted", false).appendEqFilter(Interaction_.type.getName(), 0).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), incomming).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult();
    }

    public Double getAvgDuration(Campaign campaign, boolean incomming, Date fromDate, Date toDate) {
        return (Double) QueryBundle.createReadAvgQuery(em, Interaction.class, Interaction_.duration.getName()).appendBoolFilter("deleted", false).appendEqFilter(Interaction_.type.getName(), 0).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), incomming).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult();
    }

    public Map<String, Number> getWrapUpCodesMap(Campaign campaign, boolean incomming, Date fromDate, Date toDate) {
        List<WrapUpCode> wrapUpCodes;
        Map<String, Number> wrapUpCodesMap = new HashMap<String, Number>();
        try {
            wrapUpCodes = (List<WrapUpCode>) QueryBundle.createReadDistinctQuery(em, Interaction.class, Interaction_.wrapUpCode.getName()).appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), incomming).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getResultList();
        } catch (Exception e) {
            wrapUpCodesMap.put("Undefined", 0);
            return wrapUpCodesMap;
        }

        logger.info("getWrapUpCodesMap: wrapUpCodes=" + wrapUpCodes);

        for (WrapUpCode wrapUpCode : wrapUpCodes) {
            QueryBundle countCode = createReadCountQueryBundle();
            if (wrapUpCode == null) {
                countCode.appendIsNullFilter(Interaction_.wrapUpCode.getName());
            } else {
                countCode.appendEqObjectFilter(Interaction_.wrapUpCode.getName(), wrapUpCode);
            }
            Number count = ((Long) countCode.appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), incomming).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult());
            logger.info("getWrapUpCodesMap: wrapUpCode=" + wrapUpCode.getName() + ", count=" + count);
            wrapUpCodesMap.put((wrapUpCode == null ? "Undefined" : wrapUpCode.getName()), count == null ? 0 : count);
        }
        logger.info("getWrapUpCodesMap: wrapUpCodesMap=" + wrapUpCodesMap);

        return wrapUpCodesMap;
    }

    public Map<String, Number> getCompletionCodesMap(Campaign campaign, Date fromDate, Date toDate) {
        List<String> complCodes;
        Map<String, Number> complCodesMap = new HashMap<String, Number>();
        complCodes = (List<String>) QueryBundle.createReadDistinctQuery(em, Interaction.class, Interaction_.lastComplCode.getName()).appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), false).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getResultList();
        logger.info("getCompletionCodesMap: complCodes=" + complCodes);

        for (String complCode : complCodes) {
            QueryBundle countCode = createReadCountQueryBundle();
            if (complCode == null) {
                countCode.appendIsNullFilter(Interaction_.lastComplCode.getName());
            } else {
                countCode.appendEqFilter(Interaction_.lastComplCode.getName(), complCode);
            }
            Number count = ((Long) countCode.appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), false).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult());
            logger.info("getCompletionCodesMap: complCode=" + complCode + ", count=" + count);
            complCodesMap.put((complCode == null ? "Undefined" : complCode), count == null ? 0 : count);
        }
        logger.info("getCompletionCodesMap: complCodesMap=" + complCodesMap);

        return complCodesMap;
    }

    public Map<String, Number> getDnisMap(Campaign campaign, Date fromDate, Date toDate) {
        List<String> dnisList;
        Map<String, Number> dnisMap = new HashMap<String, Number>();
        dnisList = (List<String>) QueryBundle.createReadDistinctQuery(em, Interaction.class, Interaction_.dnis.getName()).appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), true).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getResultList();
        logger.info("getDnisMap: dnisList=" + dnisList);

        for (String dnis : dnisList) {
            QueryBundle dnisQuery = createReadCountQueryBundle();
            if (dnis == null) {
                dnisQuery.appendIsNullFilter(Interaction_.dnis.getName());
            } else {
                dnisQuery.appendEqFilter(Interaction_.dnis.getName(), dnis);
            }
            Number count = ((Long) dnisQuery.appendBoolFilter("deleted", false).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendBoolFilter(Interaction_.incomming.getName(), true).appendBetweenFilter(Interaction_.modDate.getName(), fromDate, toDate).appendIsNullFilter(Interaction_.child.getName()).compile().getSingleResult());
            logger.info("getDnisMap: dnis=" + dnis + ", count=" + count);
            dnisMap.put((dnis == null ? "Undefined" : dnis) + " (" + count + ")", count == null ? 0 : count);
        }
        logger.info("getDnisMap: dnisMap=" + dnisMap);

        return dnisMap;
    }
}
