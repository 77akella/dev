package ua.com.ivrManager.ejb.session;

import java.util.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Asynchronous;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.*;
import ua.com.ivrManager.util.InteractionUtils;
import ua.com.ivrManager.util.QueryBundle;
import vp.launchCall.MakePartyToPartyCall;

/**
 *
 * @author Artem
 */
@Singleton(name = "ScheduledActions")
public class ScheduledActions {

    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;
    @Resource(name = "mail/ivrManager")
    private Session mailSession;
//    private Transport mailTransport;
    private static final Logger logger = LoggerFactory.getLogger(ScheduledActions.class.getSimpleName());
    private Map<Campaign, Map<ContactList, Long>> lastContactIdMap = new HashMap<Campaign, Map<ContactList, Long>>();
    private MakePartyToPartyCall call;
    private String dnis = null;
    private Random random = new Random();
//    public static String script="<script type=\"text/javascript\">\n"
//            + "function pasteImage(id){\n"
//            + "     if(!id) return;\n"
//            + "     editorWidgetVar.focus();\n"
//            + "     setTimeout(function() {\n"
//            + "           editorWidgetVar.editor.execCommand('inserthtml', '&lt;img id=\"img'+id+'\" src=\"#{request.contextPath}/ImageFile?id='+id+'\" /&gt;', false);\n"
//            + "     }, 0);\n"
//            + "}\n"
//            + "function pasteText(id,text){\n"
//            + "     editorWidgetVar.focus();\n"
//            + "     setTimeout(function() {\n"
//            + "          editorWidgetVar.editor.execCommand('inserthtml', '&lt;div id=\"var'+id+'\" style=\"-webkit-text-fill-color: #999;\"&gt;{--'+text+'--}&lt;/div&gt;', false);\n"
//            + "     }, 0);\n"
//            + "}\n"
//            + "</script>\n";
    @Resource(name = "vpHost")
    private String vpHost;
    @Resource(name = "vpUser")
    private String vpUser;
    @Resource(name = "vpPass")
    private String vpPass;
    @Resource(name = "maxCalls")
    private Integer maxCalls;
    @Resource(name = "dbClasses")
    private String dbClassesString;
    private List<String> dbClasses = null;

//    public static String decodode(String messageText, Map<Var,String> contactVarMap, ){
//        boolean haveToRepalceVars=true;
//        boolean haveToAttachImages=true;
//        while(haveToRepalceVars){
//            messageText.
//        }
//    }
    public Integer getMaxCalls() {
        return maxCalls;
    }

    public String getVpHost() {
        return vpHost;
    }

    public String getVpUser() {
        return vpUser;
    }

    public List<String> getDbClasses() {
        if (dbClasses == null) {
            String[] dbClassArray = dbClassesString.split(";");
            dbClasses = new ArrayList<String>();
            for (int i = 0; i < dbClassArray.length; i++) {
                dbClassArray[i] = dbClassArray[i].trim();
                if (dbClassArray[i] == null || dbClassArray[i].isEmpty()) {
                    logger.info("[ScheduledActions] getDbClasses: found empty record at " + i + " in dbClassesString=" + dbClassesString);
                    continue;
                }
                if (dbClassArray[i].contains("=")) {
                    dbClassArray[i] = dbClassArray[i].split("=")[0];
                }
                try {
                    Class.forName(dbClassArray[i]);
                    dbClasses.add(dbClassArray[i]);
                } catch (ClassNotFoundException cnfe) {
                    logger.warn("[ScheduledActions] getDbClasses: ClassNotFoundException for " + dbClassArray[i], cnfe);
                }
            }
        }
        if (dbClasses.isEmpty()) {
            logger.error("[ScheduledActions] getDbClasses: dbClasses is Empty, dbClassesString=" + dbClassesString);
        }
        return dbClasses;
    }
//
//        @Schedule(second="0",minute="*/15",hour="*",persistent=false)
//        private void processContactListUpgrade(){
//            List<DBConnection> dBConnections=QueryBundle.createReadAllQuery(getEntityManager(), DBConnection.class)
//                .appendBoolFilter("deleted", false)
//                .compile().getResultList();
//            for(DBConnection dbc:dBConnections){
//
//            }
//        }

    protected EntityManager getEntityManager() {
        return em;
    }

    public int getFreeChanels() {
        return this.maxCalls - ((Long) QueryBundle.createReadCountQuery(getEntityManager(), Interaction.class).appendBoolFilter(Interaction_.ended.getName(), false).appendEqFilter(Interaction_.type.getName(), 0).appendBoolFilter(Interaction_.processing.getName(), true).compile().getSingleResult()).intValue();
    }

    public int getFreeChanelsForCampaign(Campaign campaign) {
        return ((campaign.getMaxCalls() > this.maxCalls) ? this.maxCalls : campaign.getMaxCalls()) - ((Long) QueryBundle.createReadCountQuery(getEntityManager(), Interaction.class).appendBoolFilter(Interaction_.ended.getName(), false).appendBoolFilter(Interaction_.processing.getName(), true).appendEqFilter(Interaction_.type.getName(), 0).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).compile().getSingleResult()).intValue();
    }

    private void setLastContactId(Campaign campaign, ContactList contactsList, Long lastId) {
        Map<ContactList, Long> lastMap = lastContactIdMap.get(campaign);
        if (lastMap == null) {
            lastMap = new HashMap<ContactList, Long>();
        }
        lastMap.put(contactsList, lastId);
        lastContactIdMap.put(campaign, lastMap);
    }

    public Long getLastContactId(Campaign campaign, ContactList contactList) {
        if (lastContactIdMap.get(campaign) == null || lastContactIdMap.get(campaign).get(contactList) == null) {
            try {
                Interaction cj = (Interaction) QueryBundle.createReadAllQuery(getEntityManager(), Interaction.class).appendEqObjectFilter(Interaction_.campaign.getName(), campaign).appendEqObjectFilter(Interaction_.contactList.getName(), contactList).appendOrder(Interaction_.contactId.getName(), true).compile().setMaxResults(1).getSingleResult();
                setLastContactId(campaign, contactList, cj.getContactId());
                logger.info("[ScheduledActions] getLastContactId put " + cj.getContactId() + " to campId=" + campaign.getId() + " conListId=" + contactList.getId());
                return cj.getContactId();
            } catch (javax.persistence.NoResultException e) {
                setLastContactId(campaign, contactList, 0L);
                return 0L;
            } catch (Exception e) {
                logger.error("[ScheduledActions] getLastContactId: ", e);
                setLastContactId(campaign, contactList, 0L);
                return 0L;
            }
        }
        return lastContactIdMap.get(campaign).get(contactList);
    }

    @Asynchronous
    public void runOutgoingInteractionsAsync() {
        logger.info("runOutgoingInteractionsAsync startnig");
        runOutgoingInteractions();
        logger.info("runOutgoingInteractionsAsync end");
    }

    @Schedule(second = "*/5", minute = "*", hour = "*", persistent = false)
    public void runOutgoingInteractions() {
        logger.info("runOutgoingInteractions: starting");
        List<Campaign> runningCampaigns = QueryBundle.createReadAllQuery(getEntityManager(), Campaign.class).appendBoolFilter("deleted", false).appendBoolFilter(Campaign_.outgoing.getName(), true).appendEqFilter(Campaign_.status.getName(), "Running").compile().getResultList();
        for (ListIterator<Campaign> it = runningCampaigns.listIterator(); it.hasNext();) {
            Campaign campaign = it.next();
            if (campaign.getFromDate() != null && campaign.getFromDate().after(new Date())) {
                it.remove();
            }
            if (campaign.getToDate() != null && campaign.getToDate().before(new Date())) {
                campaign.setStatus("ended");
                getEntityManager().merge(campaign);
                it.remove();
            }
        }

        //run calls
        for (Campaign c : runningCampaigns) {
            int maxResults = getFreeChanelsForCampaign(c);
            if (maxResults < 1) {
                continue;
            }
            List<Interaction> campInteractions = QueryBundle.createReadAllQuery(getEntityManager(), Interaction.class).appendEqObjectFilter(Interaction_.campaign.getName(), c).appendBoolFilter(Interaction_.ended.getName(), false).appendBoolFilter(Interaction_.processing.getName(), false).appendBeforeFilter(Interaction_.scheduledDate.getName(), new Date()).appendBoolFilter(Interaction_.incomming.getName(), false).appendOrder(Interaction_.contactId.getName(), false).compile().setMaxResults(maxResults).getResultList();
            if (campInteractions.size() > 0) {
                logger.info("[ScheduledActions] runOutgoingInteractions: Interactions count for campaign '" + c.getName() + "' is=" + campInteractions.size());
            }
            processInteractions(campInteractions); ////
        }

        //populate new Interactions
        int freeChanels = getFreeChanels();
        logger.info("freeChanels=" + freeChanels);
        if (freeChanels < 1) {
            return;
        }
        for (Campaign c : runningCampaigns) {
            int campMaxCalls = c.getMaxCalls() - ((Long) QueryBundle.createReadCountQuery(getEntityManager(), Interaction.class).appendEqObjectFilter(Interaction_.campaign.getName(), c).appendBoolFilter(Interaction_.ended.getName(), false).appendBoolFilter(Interaction_.processing.getName(), false).appendBeforeFilter(Interaction_.scheduledDate.getName(), new Date()).appendBoolFilter(Interaction_.incomming.getName(), false).compile().getSingleResult()).intValue();
            if (campMaxCalls > freeChanels) {
                campMaxCalls = freeChanels;
            }
            if (campMaxCalls > 0) {
                List<Contact> contacts = QueryBundle.createReadAllQuery(getEntityManager(), Contact.class).appendGtFilter(Contact_.id.getName(), getLastContactId(c, c.getContactList())).appendEqObjectFilter(Contact_.contactList.getName(), c.getContactList()).appendOrder(Contact_.id.getName(), false).compile().setMaxResults(campMaxCalls * 2).getResultList();
                for (Contact con : contacts) {
                    Interaction interactionNew = new Interaction();
                    interactionNew.setIncomming(false);
                    interactionNew.setModDate(new Date());
                    interactionNew.setScheduledDate(new Date());
                    interactionNew.setContactList(c.getContactList());
                    interactionNew.setCampaign(c);
                    interactionNew.setContactId(con.getId());
                    interactionNew.setActionNode(c.getOutAction());
                    try {
                        getEntityManager().merge(interactionNew);
                        setLastContactId(c, c.getContactList(), con.getId());
                        campMaxCalls--;
                    } catch (Exception e) {
                        logger.error(e.getLocalizedMessage());
                    }
                }
            }
        }
    }

    public void processInteractions(List<Interaction> interactions) {
        for (Interaction interaction : interactions) {
            logger.info("[ScheduledActions] processInteractions: Interaction " + interaction.getId());
            if (interaction.getActionNode().getType().equalsIgnoreCase("call")) {
                try {
                    Campaign currentCamp = interaction.getCampaign();
                    if (interaction.getAttempt() > 20) {
                        interaction.setEnded(true);
                        interaction.setLastComplCode("Attempts_count_exceeded");
                    }
                    interaction.setProcessing(false);
                    // Put dnis from contactList
                    for (CampVarMap cvm : currentCamp.getCampVarMaps()) {
                        if (interaction.getActionNode().getVars().contains(cvm.getVar()) && cvm.getVar().getType().equals("phone") && cvm.getContactList().equals(interaction.getContactList())) {
                            dnis = InteractionUtils.formatDnis(
                                    getEntityManager().find(Contact.class, interaction.getContactId()).getFields()[cvm.getConListColumn()],
                                    interaction.getCampaign().getDialRule());
                            if (dnis == null || dnis.isEmpty()) {
                                throw new IllegalArgumentException("phonenumber==null||phonenumber.isEmpty(), interaction=" + interaction.toString());
                            }
                            interaction.setDnis(dnis);
                        }
                    }
                    if (interaction.getActionNode().getOutgoingNumberPool() != null) {
                        if (interaction.getActionNode().getOutgoingNumber() == null) {
                            interaction.setAni(interaction.getActionNode().getOutgoingNumberPool().getNumbers().get(
                                    random.nextInt(interaction.getActionNode().getOutgoingNumberPool().getNumbers().size())).getNumber().trim());
                        } else {
                            interaction.setAni(interaction.getActionNode().getOutgoingNumber());
                        }
                    }
                } catch (Exception e) {
                    logger.error("processInteractions: Process CampVarMap: ", e);
                    interaction.setAttempt(interaction.getAttempt() + 1);
                    interaction.setReason("[ERROR] processInteractions:" + e.getMessage());
                    getEntityManager().merge(interaction);
                    continue;
                }
                logger.info("[ScheduledActions] processInteractions: interaction " + interaction.getId() + " will have phonenumber=" + dnis);
                try {
                    makeCall(interaction);
                } catch (Exception ex) {
                    logger.error("processInteractions: makeCall", ex);
                }
                continue;
            }
            if (interaction.getActionNode().getType().equalsIgnoreCase("email")) {
                sendMail(interaction);
            }
        }
    }

    public void makeCall(Interaction interaction) throws Exception {
        logger.info("[ScheduledActions] Attempting to make call to number " + interaction.getDnis());
        interaction.setType(0);
        interaction.setProcessing(true);
        interaction.setModDate(new Date());
        interaction.setAttempt(interaction.getAttempt() + 1);
//                        interaction.setLastComplCode("Calling");
//                        interaction.getComplCodes().put(new Date(),"Calling");
        if (call.makeCall(interaction) == null) {
            logger.error("[ScheduledActions] makeCall: " + call.getErrorMessage());
            if (interaction.getAttempt() > 20) {
                interaction.setEnded(true);
                interaction.setLastComplCode("Attempts_count_exceeded");
            }
            interaction.setProcessing(false);
            getEntityManager().merge(interaction);
            initCall();
            return;
        }
        interaction.setSessionId(call.getSessionID_returned());

        getEntityManager().merge(interaction);
//                       vpSettings.setFreeSIP(call.getUnusedSIP_returned());
//                       vpSettings.setFreeH323(call.getUnusedH323_returned());
    }

    public boolean sendMailTest(Interaction interaction) {
        getEntityManager().merge(interaction.getActionNode().getEmailMessageTemplate());
        getEntityManager().merge(interaction.getActionNode());
        interaction = getEntityManager().merge(interaction);
        sendMail(interaction);

        boolean result = getEntityManager().find(Interaction.class, interaction.getId()).getLastComplCode().equals("mail_messageDelivered");
        try {
            getEntityManager().remove(interaction.getActionNode());
        } catch (Exception e) {
            logger.error("[ScheduledActions] sendMailTest: " + e.getMessage());
        }
        try {
            getEntityManager().remove(interaction.getCampaign());
        } catch (Exception e) {
            logger.error("[ScheduledActions] sendMailTest: " + e.getMessage());
        }
        try {
            getEntityManager().remove(interaction.getContactList());
        } catch (Exception e) {
            logger.error("[ScheduledActions] sendMailTest: " + e.getMessage());
        }
        try {
            getEntityManager().remove(interaction);
        } catch (Exception e) {
            logger.error("sendMailTest: ", e);
        }
        return result;
    }

    public void sendMail(Interaction interaction) {
        logger.info("sendMail: starting");
        interaction.setType(1);
        interaction.setProcessing(true);
        interaction.setModDate(new Date());
        interaction.setAttempt(interaction.getAttempt() + 1);
        if (interaction.getAttempt() > 20) {
            interaction.setEnded(true);
            interaction.setLastComplCode("Attempts_count_exceeded");
        }
        if (interaction.getDnis() == null || interaction.getDnis().isEmpty()) {
            for (CampVarMap cvm : interaction.getCampaign().getCampVarMaps()) {
                if (interaction.getActionNode().getVars().contains(cvm.getVar()) && cvm.getVar().getType().equals("mail") && cvm.getContactList().equals(interaction.getContactList())) {
                    dnis = getEntityManager().find(Contact.class, interaction.getContactId()).getFields()[cvm.getConListColumn()];
                    if (dnis == null || dnis.isEmpty()) {
                        logger.error("[ScheduledActions] dnis==null||dnis.isEmpty(), interaction=" + interaction.toString());
                        interaction.setProcessing(false);
                        getEntityManager().merge(interaction);
                        return;
                    }
                    logger.info("[ScheduledActions] sendMail: dnis='" + dnis + "'");
                    interaction.setDnis(dnis);
                }
            }
        }
        // images starts with '<img id="img{id}' ends with />;
        // variables starts with '<a id="var{id}'  ends with </a> remove everything inside tag.
        interaction.setMessageText(interaction.getActionNode().getEmailMessageTemplate().getMessageText());
        logger.info("[ScheduledActions] sendMail: getMessageText=" + interaction.getMessageText());
        boolean haveVars = interaction.getMessageText().indexOf("<a id=\"var") != -1;
        List<ImageFile> imageFiles = new ArrayList<ImageFile>();
        int errCounter = 0;
        int start = 0;
        int end;
        while (start != -1 && haveVars && errCounter < 100) {
            start = interaction.getMessageText().indexOf("<a id=\"var");
            if (start == -1) {
                break;
            }
            end = interaction.getMessageText().indexOf("\"", start + 10);
            String varIdString = interaction.getMessageText().substring(start + 10, end);
            logger.info("[ScheduledActions] sendMail: found ''<a id=\"var'' at start=" + start + ", end=" + end);
            logger.info("[ScheduledActions] sendMail: varIdString=" + varIdString);
            Var v = getEntityManager().find(Var.class, Long.valueOf(varIdString));
            String repl = "<a id=\"var" + v.getId() + "\"[^>]*>(.*?)</a>";
            try {
                int contactColumn = ((List<CampVarMap>) QueryBundle.createReadAllQuery(getEntityManager(), CampVarMap.class).appendEqObjectFilter(CampVarMap_.campaign.getName(), interaction.getCampaign()).appendEqObjectFilter(CampVarMap_.contactList.getName(), interaction.getContactList()).appendEqObjectFilter(CampVarMap_.var.getName(), v).appendOrder(CampVarMap_.id.getName(), true).compile().setMaxResults(1).getResultList()).get(0).getConListColumn().intValue();
                interaction.setMessageText(interaction.getMessageText().replaceAll(repl, "<span>"
                        + getEntityManager().find(Contact.class, interaction.getContactId()).getFields()[contactColumn]
                        + "</span>"));
            } catch (Exception e) {
                logger.error("[ScheduledActions] [ERROR] sendMail: vars " + e.getMessage());
//                String repl = "<a id=\"var" + v.getId() + "\"\\b[^>]*>(.*?)</a>";

                logger.error("[ScheduledActions] repl='" + repl + "'");
                interaction.setMessageText(interaction.getMessageText().replaceAll(repl, "<span id=\"" + v.getId() + "\">" + (v.getInitVal() == null ? "[NO DATA]" : v.getInitVal()) + "</span>"));
                logger.error("[ScheduledActions] now interaction message text='{}'", interaction.getMessageText());
            }
            errCounter++;

        }
        String messageText = interaction.getMessageText().replaceAll("/([a-zA-Z0-9\\-\\_])+/ImageFile\\?id=", "cid:");
        boolean haveImages = messageText.indexOf("src=\"cid:") != -1;
        start = 0;
        errCounter = 0;
        while (start != -1 && haveImages && errCounter < 1000) {
            start = messageText.indexOf("src=\"cid:", start + 1);
            if (start == -1) {
                continue;
            }
            end = messageText.indexOf("\"", start + 9);
            try {
                ImageFile imageFile = getEntityManager().find(ImageFile.class, Long.valueOf(messageText.substring(start + 9, end)));

                if (!imageFiles.contains(imageFile)) {
                    imageFiles.add(imageFile);
                } else {
                    logger.info("[ScheduledActions] sendMail: imageFiles.contains(imageFile): imageFiles=" + imageFiles
                            + ", imageFile=" + imageFile);
                }
                messageText = messageText.replaceAll("<img id=\"img" + imageFile.getId() + "\"([^>])+\"/>", "<img src=\"cid:" + imageFile.getId() + "\" />");
            } catch (Exception e) {
                logger.error("[ERROR] sendMail: images ", e);
                messageText = messageText.replaceFirst("<img id=\"img" + interaction.getMessageText().substring(start + 9, end) + "\"([^>])+\"/>", "");
                start = 0;
            }
            errCounter++;
        }
        messageText = messageText.replaceAll(" id=\"img([0-9])+\"", "");
        logger.info("[ScheduledActions] sendMail: imageFiles=" + imageFiles
                + ", interaction.setMessageText(\n" + messageText);
        try {
            InternetAddress mailTo = new InternetAddress(interaction.getDnis(), false);
            Message message = new MimeMessage(mailSession);
            message.setDescription(interaction.getId() + "");
            message.addRecipient(Message.RecipientType.TO, mailTo);
            message.setSubject(interaction.getActionNode().getEmailMessageTemplate().getMessageSubject());
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(messageText, "text/html; charset=UTF-8");

            // Create a related multi-part to combine the parts
            MimeMultipart multipart = new MimeMultipart("related");
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment

            for (ImageFile imageFile : imageFiles) {
                messageBodyPart = new MimeBodyPart();
                DataSource imgDs = new ByteArrayDataSource(imageFile.getFileData(), imageFile.getContentType());
                messageBodyPart.setDataHandler(new DataHandler(imgDs));
                messageBodyPart.setHeader("Content-ID", "<" + imageFile.getId() + ">");

                // Add part to multi-part
                multipart.addBodyPart(messageBodyPart);
            }
            message.setContent(multipart);
//            InternetAddress[] mailTos={mailTo};
            interaction.setStartDate(new Date());
            interaction = getEntityManager().merge(interaction);
//            if(!mailTransport.isConnected())mailTransport.connect();
            Transport.send(message);
            interaction = InteractionUtils.processCompletionCode(interaction, "mail_messageDelivered");
            getEntityManager().merge(interaction);
        } catch (Exception e) {
            logger.error("[ERROR] sendMail: send ", e);
            interaction.setReason(e.getMessage());
            interaction = InteractionUtils.processCompletionCode(interaction, "mail_messageNotDelivered");
            getEntityManager().merge(interaction);
        } finally {
            logger.info("[ScheduledActions] sendMail: ended");
        }
    }

    @PostConstruct
    private void initCall() {
        logger.info("[ScheduledActions] Initiating call class; vpHost=" + this.vpHost
                + ", vpUser=" + this.vpUser + ", maxCalls=" + this.maxCalls);
        try {
            call = new MakePartyToPartyCall("TDU", this.vpHost, this.vpUser, this.vpPass);
        } catch (Exception e) {
            logger.error("Initiating call failed!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!. Message: ", e);
        }
        logger.info("[ScheduledActions] Initiating mailTransport getProperties=" + mailSession.getProperties());
        try {
//            mailTransport=mailSession.getTransport("smtp");//"smtp"
//            mailTransport.addTransportListener(new TransportListener(){
//                @Override
//                public void messageDelivered(TransportEvent e) {
//                    Logger.getLogger(ScheduledActions.class.getName()).log(Level.INFO,"!!!!!!!!!!!!!!!!!!!!messageDelivered: ");
//                    try {
//                        logger.info("[ScheduledActions] !!!!!!!!!!!!!!!!!!!!messageDelivered: "+ , e.getMessage().getDescription());
//                        if(!e.getMessage().getDescription().equals("null")){
//                            processCompletionCode(e.getMessage().getDescription(), "mail_messageDelivered");
//                        }
//                    } catch (MessagingException ex) {
//                        logger.error(null, ex);
//                    }
//                }
//
//                @Override
//                public void messageNotDelivered(TransportEvent e) {
//                    Logger.getLogger(ScheduledActions.class.getName()).log(Level.INFO,"!!!!!!!!!!!!!!!!!!!!messageNotDelivered");
//                    try {
//                        logger.info("[ScheduledActions] !!!!!!!!!!!!!!!!!!!!messageDelivered: "+ , e.getMessage().getDescription());
//                        if(!e.getMessage().getDescription().equals("null")){
//                            processCompletionCode(e.getMessage().getDescription(), "mail_messageNotDelivered");
//                        }
//                    } catch (MessagingException ex) {
//                        logger.error(null, ex);
//                    }
//                }
//
//                @Override
//                public void messagePartiallyDelivered(TransportEvent e){
//                    Logger.getLogger(ScheduledActions.class.getName()).log(Level.INFO,"!!!!!!!!!!!!!!!!!!!!messagePartiallyDelivered");
//                    try {
//                        logger.info("[ScheduledActions] !!!!!!!!!!!!!!!!!!!!messageDelivered: "+ , e.getMessage().getDescription());
//                        if(!e.getMessage().getDescription().equals("null")){
//                            processCompletionCode(e.getMessage().getDescription(), "mail_messagePartiallyDelivered");
//                        }
//                    } catch (MessagingException ex) {
//                        logger.error(null, ex);
//                    }
//                }
//            });
        } catch (Exception e) {
            logger.error("Initiating mailTransport failed!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!. Message: ", e);
        }

    }
}
