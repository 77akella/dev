package ua.com.ivrManager.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.ActionNode;
import ua.com.ivrManager.ejb.entity.DialRule;
import ua.com.ivrManager.ejb.entity.DialRuleEntery;
import ua.com.ivrManager.ejb.entity.Interaction;

/**
 *
 * @author Artem
 */
public class InteractionUtils {

    private static final Logger logger = LoggerFactory.getLogger(InteractionUtils.class.getSimpleName());
    private static final Comparator<DialRuleEntery> comparatorByDnisLength = new Comparator<DialRuleEntery>() {

        @Override
        public int compare(DialRuleEntery o1, DialRuleEntery o2) {
            if (o1.getStartsWith().length() > o2.getStartsWith().length()) {
                return -1;
            } else if (o1.getStartsWith().length() < o2.getStartsWith().length()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public static String formatDnis(String dnis, DialRule dialRule) {
        if (dnis == null) {
            return dnis;
        }
        if (dialRule == null) {
            return dnis.trim();
        }
        dnis.trim();
        Collections.sort(dialRule.getDialRuleEnteries(), comparatorByDnisLength);
        for (DialRuleEntery dialRuleEntery : dialRule.getDialRuleEnteries()) {
            if (dnis.length() == dialRuleEntery.getDnisLength() && (dialRuleEntery.getStartsWith() == null || dnis.startsWith(dialRuleEntery.getStartsWith()))) {
                dnis = dialRuleEntery.getAddToStart() == null ? "" : dialRuleEntery.getAddToStart() + dnis.substring(dialRuleEntery.getCutFromStart());
                break;
            }
        }
        return dnis;
    }

    public static Interaction processCompletionCode(Interaction interaction, String complCode) {
        logger.info("Interaction {} - complCode '{}'",new Object[]{interaction,complCode});
        if (interaction.getComplCodes().values().contains(complCode)) {
            return interaction;
        }
        interaction.getComplCodes().put(new Date(), complCode);
        interaction.setLastComplCode(complCode);
        interaction.setModDate(new Date());
        //Compl codes:

        //------------------Call--------------------//
        //---------------reorder
        //Call_Busy

        //Reorder_Tone
        //SIT_Tone
        //Network_Refusal
        //Invalid_Number
        //No_Answer
        //Cancel_No_Answer
        //
        //------------------end job
        //Answer_
        //Answer_Human
        //Answer_Machine
        //Answer_Fax
        //Machine_msg_end
        //ended
        //Application_Error
        //------------------E-Mail--------------------//
        //below
        if (complCode.equalsIgnoreCase("Call_Busy")) {
            interaction.setEnded(true);
            if (interaction.getStartDate() != null) {
                interaction.setDuration((int) (System.currentTimeMillis() - interaction.getStartDate().getTime()) / 1000);
            }
            interaction.setProcessing(false);
            ActionNode currentAction = interaction.getActionNode();
            if (currentAction.getBusyAction() != null) {
                Interaction nextInteraction = new Interaction();
                nextInteraction.setContactId(interaction.getContactId());
                nextInteraction.setActionNode(currentAction.getBusyAction());
                nextInteraction.setCampaign(interaction.getCampaign());
                nextInteraction.setContactList(interaction.getContactList());
                nextInteraction.setScheduledDate(new Date(System.currentTimeMillis() + currentAction.getBusyAction().getTimeOffset() * 60000));
                nextInteraction.setParent(interaction);
                interaction.setChild(nextInteraction);
                logger.info("[processCompletionCode] complCode=" + complCode + ", created child Interaction (BusyAction) with ScheduledDate=" + nextInteraction.getScheduledDate() + " for " + interaction.toString());
            } else {
                interaction.getComplCodes().put(new Date(), "no_child_job");
                logger.info("[processCompletionCode] complCode=" + complCode + ", no_child_job for " + interaction.toString());
            }

            return interaction;
        }
        if (complCode.equalsIgnoreCase("Reorder_Tone") || complCode.equalsIgnoreCase("SIT_Tone")
                || complCode.equalsIgnoreCase("Network_Refusal") || complCode.equalsIgnoreCase("Invalid_Number")) {
            interaction.setEnded(true);
            if (interaction.getStartDate() != null) {
                interaction.setDuration((int) (System.currentTimeMillis() - interaction.getStartDate().getTime()) / 1000);
            }
            interaction.setProcessing(false);
            ActionNode currentAction = interaction.getActionNode();
            if (currentAction.getNisAction() != null) {
                Interaction nextInteraction = new Interaction();
                nextInteraction.setContactId(interaction.getContactId());
                nextInteraction.setActionNode(currentAction.getNisAction());
                nextInteraction.setCampaign(interaction.getCampaign());
                nextInteraction.setContactList(interaction.getContactList());
                nextInteraction.setScheduledDate(new Date(System.currentTimeMillis() + currentAction.getNisAction().getTimeOffset() * 60000));
                nextInteraction.setParent(interaction);
                interaction.setChild(nextInteraction);
                logger.info("[processCompletionCode] complCode=" + complCode + ", created child Interaction (NisAction) with ScheduledDate=" + nextInteraction.getScheduledDate() + " for " + interaction.toString());
            } else {
                interaction.getComplCodes().put(new Date(), "no_child_job");
                logger.info("[processCompletionCode] complCode=" + complCode + ", no_child_job for " + interaction.toString());
            }

            return interaction;
        }
        if (complCode.equalsIgnoreCase("No_Answer") || complCode.equalsIgnoreCase("Cancel_No_Answer")) {
            interaction.setEnded(true);
            interaction.setProcessing(false);
            if (interaction.getStartDate() != null) {
                interaction.setDuration((int) (System.currentTimeMillis() - interaction.getStartDate().getTime()) / 1000);
            }
            ActionNode currentAction = interaction.getActionNode();
            if (currentAction.getNaAction() != null) {
                Interaction nextInteraction = new Interaction();
                nextInteraction.setContactId(interaction.getContactId());
                nextInteraction.setActionNode(currentAction.getNaAction());
                nextInteraction.setCampaign(interaction.getCampaign());
                nextInteraction.setContactList(interaction.getContactList());
                nextInteraction.setScheduledDate(new Date(System.currentTimeMillis() + currentAction.getNaAction().getTimeOffset() * 60000));
                nextInteraction.setParent(interaction);
                interaction.setChild(nextInteraction);
                logger.info("[processCompletionCode] complCode=" + complCode + ", created child Interaction (NisAction) with ScheduledDate=" + nextInteraction.getScheduledDate() + " for " + interaction.toString());
            } else {
                interaction.getComplCodes().put(new Date(), "no_child_job");
                logger.info("[processCompletionCode] complCode=" + complCode + ", no_child_job for " + interaction.toString());
            }
            return interaction;
        }

        if (complCode.equalsIgnoreCase("ended")
                || complCode.equalsIgnoreCase("Application_Error")) {
            interaction.setEnded(true);
            interaction.setProcessing(false);
            if (interaction.getStartDate() != null) {
                interaction.setDuration((int) (System.currentTimeMillis() - interaction.getStartDate().getTime()) / 1000);
            }
            logger.info("[processCompletionCode] complCode=" + complCode + ", interaction " + interaction + " ended! startdate= " + interaction.getStartDate() + " duration=" + interaction.getDuration());
            return interaction;
        }

        if (complCode.startsWith("Answer_")) {
            if (interaction.getComplCodes().values().contains("Answer_")
                    || interaction.getComplCodes().values().contains("Answer_")
                    || interaction.getComplCodes().values().contains("Answer_")
                    || interaction.getComplCodes().values().contains("Answer_")) {
                return interaction;
            } else {
                interaction.setStartDate(new Date());
                logger.info("[processCompletionCode] complCode=" + complCode + ", interaction Started! for " + interaction);
                return interaction;
            }

        }

        //-------------------E-Mail--------------//
//                mail_messageDelivered
//                mail_messageNotDelivered
//                mail_messagePartiallyDelivered
        if (complCode.equalsIgnoreCase("mail_messageDelivered")) {
            interaction.setEnded(true);
            if (interaction.getStartDate() != null) {
                interaction.setDuration((int) (System.currentTimeMillis() - interaction.getStartDate().getTime()) / 1000);
            }
            interaction.setProcessing(false);
            ActionNode currentAction = interaction.getActionNode();
            if (currentAction.getMailSentAction() != null) {
                Interaction nextInteraction = new Interaction();
                nextInteraction.setContactId(interaction.getContactId());
                nextInteraction.setActionNode(currentAction.getMailSentAction());
                nextInteraction.setCampaign(interaction.getCampaign());
                nextInteraction.setContactList(interaction.getContactList());
                nextInteraction.setScheduledDate(new Date(System.currentTimeMillis() + currentAction.getMailSentAction().getTimeOffset() * 60000));
                nextInteraction.setParent(interaction);
                interaction.setChild(nextInteraction);
                logger.info("[processCompletionCode] complCode=" + complCode + ", created child Interaction (MailSentAction) with ScheduledDate=" + nextInteraction.getScheduledDate() + " for " + interaction.toString());
            } else {
                interaction.getComplCodes().put(new Date(), "no_child_job");
                logger.info("[processCompletionCode] complCode=" + complCode + ", no_child_job for " + interaction.toString());
            }
            return interaction;
        }
        if (complCode.equalsIgnoreCase("mail_messageNotDelivered")) {
            interaction.setEnded(true);
            if (interaction.getStartDate() != null) {
                interaction.setDuration((int) (System.currentTimeMillis() - interaction.getStartDate().getTime()) / 1000);
            }
            interaction.setProcessing(false);
            ActionNode currentAction = interaction.getActionNode();
            if (currentAction.getMailNotSentAction() != null) {
                Interaction nextInteraction = new Interaction();
                nextInteraction.setContactId(interaction.getContactId());
                nextInteraction.setActionNode(currentAction.getMailNotSentAction());
                nextInteraction.setCampaign(interaction.getCampaign());
                nextInteraction.setContactList(interaction.getContactList());
                nextInteraction.setScheduledDate(new Date(System.currentTimeMillis() + currentAction.getMailNotSentAction().getTimeOffset() * 60000));
                nextInteraction.setParent(interaction);
                interaction.setChild(nextInteraction);
                logger.info("[processCompletionCode] complCode=" + complCode + ", created child Interaction (MailNotSentAction) with ScheduledDate=" + nextInteraction.getScheduledDate() + " for " + interaction.toString());
            } else {
                interaction.getComplCodes().put(new Date(), "no_child_job");
                logger.info("[processCompletionCode] complCode=" + complCode + ", no_child_job for " + interaction.toString());
            }

            return interaction;
        }
        if (complCode.equalsIgnoreCase("mail_messagePartiallyDelivered")) {
            interaction.setEnded(true);
            if (interaction.getStartDate() != null) {
                interaction.setDuration((int) (System.currentTimeMillis() - interaction.getStartDate().getTime()) / 1000);
            }
            interaction.setProcessing(false);
            ActionNode currentAction = interaction.getActionNode();
            if (currentAction.getMailNotSentAction() != null) {
                Interaction nextInteraction = new Interaction();
                nextInteraction.setContactId(interaction.getContactId());
                nextInteraction.setActionNode(currentAction.getMailNotSentAction());
                nextInteraction.setCampaign(interaction.getCampaign());
                nextInteraction.setContactList(interaction.getContactList());
                nextInteraction.setScheduledDate(new Date(System.currentTimeMillis() + currentAction.getMailNotSentAction().getTimeOffset() * 60000));
                nextInteraction.setParent(interaction);
                interaction.setChild(nextInteraction);
                logger.info("[processCompletionCode] complCode=" + complCode + ", created child Interaction (MailNotSentAction) with ScheduledDate=" + nextInteraction.getScheduledDate() + " for " + interaction.toString());
            } else {
                interaction.getComplCodes().put(new Date(), "no_child_job");
                logger.info("[processCompletionCode] complCode=" + complCode + ", no_child_job for " + interaction.toString());
            }

            return interaction;
        }
        logger.info("[processCompletionCode] complCode=" + complCode + ", No completion code handler found for " + interaction.toString());
        return interaction;
    }
}
