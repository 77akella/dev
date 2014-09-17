package ua.com.AACC.is.cct;

import com.nortel.soa.oi.cct.agentterminalservice.GetLoginIdException;
import com.nortel.soa.oi.cct.agentterminalservice.GetTerminalConnectionsException;
import com.nortel.soa.oi.cct.basenotification.AgentPropertyEventType;
import com.nortel.soa.oi.cct.basenotification.ConnectionStateEventType;
import com.nortel.soa.oi.cct.basenotification.NotificationEventHolderType;
import com.nortel.soa.oi.cct.basenotification.NotificationMessageHolderType;
import com.nortel.soa.oi.cct.contactservice.GetIntrinsicsException;
import com.nortel.soa.oi.cct.contactservice.GetOriginalDestinationAddressException;
import com.nortel.soa.oi.cct.notificationconsumer.NotificationConsumer;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.AddressType;
import com.nortel.soa.oi.cct.types.AgentLoginStatus;
import com.nortel.soa.oi.cct.types.AgentProperty;
import com.nortel.soa.oi.cct.types.ConnectionState;
import com.nortel.soa.oi.cct.types.Intrinsic;
import com.nortel.soa.oi.cct.types.Reason;
import com.nortel.soa.oi.cct.types.SsoToken;
import com.nortel.soa.oi.cct.types.Terminal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.jetty.util.ConcurrentHashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.AACC.is.callback.CallbackController;
import ua.com.AACC.is.db.CacheCCMMconnection;
import ua.com.AACC.is.run.IS;
import ua.com.AACC.is.socketServer.SocketServer;

//Todo: clear content
@javax.jws.WebService(
        serviceName = "SOAOICCT_NotificationConsumer",
        portName = "NotificationConsumer",
        targetNamespace = "http://www.nortel.com/soa/oi/cct/NotificationConsumer",
        endpointInterface = "com.nortel.soa.oi.cct.notificationconsumer.NotificationConsumer")
public class EventProcessor implements NotificationConsumer {

    private final static Logger logger = LoggerFactory.getLogger(EventProcessor.class);
    private final static Logger loggerAllEvents = LoggerFactory.getLogger("CCTevents");
    private final static Logger loggerTiming = LoggerFactory.getLogger("Timing");
    //Connection details
    private static volatile String subscriptionId;
    private static volatile SsoToken ssoToken;
    //Config for GT.CRM
    private static String afterCallWorkCode = null;
    private static String urlBase = null;
    private static String urlBaseAO = null;
    private static String urlBaseCB = null;
    private static String urlBaseWC = null;
    //This map holds data for incomming contacts, that can be transfered
    private static volatile Map<String, String> agentTransferContactMap = new ConcurrentHashMap<>();
    //This set holds an agents with AutomatedOutbound contacts, this is used for
    //ignore CONNECTION_STATE Disconnected for voice call as part of AutomatedOutbound contact
    private static volatile Set<String> agentsInAO = new ConcurrentHashSet<>();
    //Static web service variables (for all NotificationConsumer threads)
//    private static AddressService addressService;
//    private static ContactService contactService;
//    private static AgentService agentService;
//    private static AgentTerminalService agentTerminalService;
//    private static SessionService sessionService;
    //Stat variables
    private static volatile long maxProcessingTime = 0;
    private static volatile long summProcessTime = 0;
    private static volatile long countProcess = 0;

    public static void setConnectionParams(String subscriptionId, SsoToken ssoToken) {
        EventProcessor.subscriptionId = subscriptionId;
        EventProcessor.ssoToken = ssoToken;
    }

    public EventProcessor() {
        if (afterCallWorkCode == null) {
            afterCallWorkCode = System.getProperty("afterCallWorkCode", "1283476004");
        }
        if (urlBase == null) {
            urlBase = System.getProperty("urlBase", "http://cc-crm/crm/webagent/switch.phtml");
        }
        if (urlBaseAO == null) {
            urlBaseAO = System.getProperty("urlBaseAO", "http://cc-crm/crm/webagent/switch_outbound.phtml");
        }
        if (urlBaseCB == null) {
            urlBaseCB = System.getProperty("urlBaseCB", "http://cc-crm/crm/webagent/switch_inbound_callback.phtml");
        }
        if (urlBaseWC == null) {
            urlBaseWC = System.getProperty("urlBaseWC", "http://cc-crm/crm/webagent/switch_inbound_webchat.phtml");
        }
    }

    public static void reinitializeServices() {
//        addressService = null;
//        contactService = null;
//        agentService = null;
//        agentTerminalService = null;
//        sessionService = null;
    }

    public static void setStatDetails(long maxProcessingTime, long summProcessTime, long countProcess) {
        EventProcessor.maxProcessingTime = maxProcessingTime;
        EventProcessor.summProcessTime = summProcessTime;
        EventProcessor.countProcess = countProcess;
    }

    private static void calcStat(long startTime, long cctReqTime) {
        long pocessingTime = System.currentTimeMillis() - startTime - cctReqTime;
        if (maxProcessingTime < pocessingTime) {
            maxProcessingTime = pocessingTime;
        }
        summProcessTime += System.currentTimeMillis() - startTime - cctReqTime;
        countProcess++;
        if (loggerTiming.isDebugEnabled()) {
            loggerTiming.debug("Statistics: avgProcessingTime = {},\t maxProcessingTime = {},\t requestCount = {}",
                    (double) summProcessTime / countProcess, maxProcessingTime, countProcess);
        }
    }

    public static long getCountProcess() {
        return countProcess;
    }

    public static long getMaxProcessingTime() {
        return maxProcessingTime;
    }

    public static long getSummProcessTime() {
        return summProcessTime;
    }

    public static double getAvgProcessingTime() {
        if (countProcess == 0) {
            return 0;
        }
        return (double) (summProcessTime * 100 / countProcess) / 100;
    }

    public static int getAgentTransferMapSize() {
        return agentTransferContactMap.size();
    }

    @Override
    public void notify(List<NotificationMessageHolderType> notificationMessage) {
        try {
            long startTime = System.currentTimeMillis();
            for (final NotificationMessageHolderType nmh : notificationMessage) {

                NotificationEventHolderType event = nmh.getMessage();
                if (loggerAllEvents.isDebugEnabled()) {
                    loggerAllEvents.debug("getSessionId: {}", nmh.getSessionId());
                    loggerAllEvents.debug("getSubscriptionId: {}", nmh.getSubscriptionId());
                    loggerAllEvents.debug("NEW NotificationMessage: !!!!!!!!!!!!!!!" + IS.logObject(event));
                }
//                // Remove all old subscriptions
//                if (!nmh.getSubscriptionId().equals(subscriptionId)) {
//                    loggerTiming.info("Ignoring subscription {}", nmh.getSubscriptionId());
////                    loggerTiming.info("Destroying subscription {}", nmh.getSubscriptionId());
////                    new Thread(new Runnable() {
////                        @Override
////                        public void run() {
////                            IS.unsubscribeFromProducer(nmh.getSubscriptionId());
////                        }
////                    }).start();
//
//                    continue;
//                }
                switch (event.getEventType()) {
                    case AGENT_PROPERTY:
                        if ((event.getAgentPropertyEvent().getAgentProperty().equals(AgentProperty.LOGIN_STATUS)
                                && event.getAgentPropertyEvent().getAgentPropertyLoginStatus().getStatus().equals(AgentLoginStatus.LOGGED_IN))
                                || (event.getAgentPropertyEvent().getAgentProperty().equals(AgentProperty.INFORMATION)
                                && !event.getAgentPropertyEvent().getAgentPropertyInformation().getTnName().isEmpty())) {
                            onAgentLogin(event.getAgentPropertyEvent(), startTime);
                        }
                        if ((event.getAgentPropertyEvent().getAgentProperty().equals(AgentProperty.LOGIN_STATUS)
                                && event.getAgentPropertyEvent().getAgentPropertyLoginStatus().getStatus().equals(AgentLoginStatus.LOGGED_OUT))
                                || (event.getAgentPropertyEvent().getAgentProperty().equals(AgentProperty.INFORMATION)
                                && event.getAgentPropertyEvent().getAgentPropertyInformation().getTnName().isEmpty())) {
                            onAgentLogOut(event.getAgentPropertyEvent(), startTime);
                        }

                        break;
//                    case AGENT_STATE:
//                        //handle agent state notification here
//                        break;
                    case CONNECTION_STATE:
                        //handle Address Property notification here
//                        if (((notificationEventHolder.getConnectionStateEvent().getNewState() == ConnectionState.ESTABLISHED)
//                                && (notificationEventHolder.getConnectionStateEvent().getPreviousState() == ConnectionState.IDLE
//                                || notificationEventHolder.getConnectionStateEvent().getPreviousState() == ConnectionState.INITIATED))
//                                || notificationEventHolder.getConnectionStateEvent().getNewState() == ConnectionState.DIALING
//                                && (notificationEventHolder.getConnectionStateEvent().getPreviousState() == ConnectionState.IDLE
//                                || notificationEventHolder.getConnectionStateEvent().getPreviousState() == ConnectionState.INITIATED)) {
//                            logger.debug("!!!!!!!!!!! This is outgoing call");
//                            IS.onOutgoingCall(notificationEventHolder.getConnectionStateEvent());
//                            return;
//                        }

                        if ((event.getConnectionStateEvent().getNewState() == ConnectionState.ALERTING
                                && (event.getConnectionStateEvent().getPreviousState() == ConnectionState.IDLE
                                || event.getConnectionStateEvent().getPreviousState() == ConnectionState.QUEUED
                                || event.getConnectionStateEvent().getPreviousState() == ConnectionState.OFFERED))
                                || ((event.getConnectionStateEvent().getNewState() == ConnectionState.ESTABLISHED)
                                && event.getConnectionStateEvent().getPreviousState() == ConnectionState.OFFERED)) {
                            try {
                                onIncommingCall(event.getConnectionStateEvent(), startTime);
                            } catch (Exception e) {
                                logger.warn("Failed to onIncommingCall event is \n{}", IS.logObject(event.getConnectionStateEvent()));
                            }
                        }

                        if (event.getConnectionStateEvent().getNewState() == ConnectionState.ESTABLISHED
                                && event.getConnectionStateEvent().getPreviousState() == ConnectionState.IDLE
                                && event.getConnectionStateEvent().getAddress().getAddressType() == AddressType.OUT_OF_PROVIDER
                                && event.getConnectionStateEvent().getReason() == Reason.DEFAULT) {
                            try {
                                CallbackController.addCall(event.getConnectionStateEvent(), ssoToken, startTime);
                            } catch (Exception e) {
                                logger.warn("Failed to CallbackController.addCall event is \n{}", IS.logObject(event.getConnectionStateEvent()));
                            }
                        }

                        if (event.getConnectionStateEvent().getNewState() == ConnectionState.ESTABLISHED
                                && event.getConnectionStateEvent().getPreviousState() == ConnectionState.ALERTING
                                && event.getConnectionStateEvent().getAddress().getProvider().getProviderName().equals("CCMM")) {
//                            IS.onConnectionStateEvent(event.getConnectionStateEvent());
                            try {
                                onAutomatedOutbound(event.getConnectionStateEvent(), startTime);
                            } catch (Exception e) {
                                logger.warn("Failed to onAutomatedOutbound", e);
                                logger.warn("Failed to onAutomatedOutbound event is \n{}", IS.logObject(event.getConnectionStateEvent()));
                            }
                            return;
                        }

                        if ((event.getConnectionStateEvent().getNewState() == ConnectionState.ESTABLISHED
                                && event.getConnectionStateEvent().getPreviousState() == ConnectionState.ALERTING
                                && event.getConnectionStateEvent().getAddress().getAddressType() == AddressType.AGENT
                                && !event.getConnectionStateEvent().getAddress().getProvider().getProviderName().equals("CCMM")) //                                || (event.getConnectionStateEvent().getNewState() == ConnectionState.DISCONNECTED
                                //                                && event.getConnectionStateEvent().getPreviousState() == ConnectionState.ESTABLISHED
                                //                                && event.getConnectionStateEvent().getAddress().getAddressType() == AddressType.OUT_OF_PROVIDER)
                                ) {
                            try {
                                CallbackController.removeCall(event.getConnectionStateEvent(), ssoToken, startTime);
                            } catch (Exception e) {
                                logger.warn("Failed to CallbackController.removeCall", e);
                                logger.warn("Failed to CallbackController.removeCall event is \n{}", IS.logObject(event.getConnectionStateEvent()));
                            }
                        }


                        if (event.getConnectionStateEvent().getNewState() == ConnectionState.DISCONNECTED
                                && (event.getConnectionStateEvent().getAddress().getAddressType().equals(AddressType.GENERIC)
                                || event.getConnectionStateEvent().getAddress().getAddressType().equals(AddressType.AGENT))) {
                            onDisconnectCall(event.getConnectionStateEvent(), startTime);
                            return;
                        }
//                        if (event.getConnectionStateEvent().getNewState() == ConnectionState.DISCONNECTED
//                                &&
//                                (
//                                event.getConnectionStateEvent().getNewState() != ConnectionState.ESTABLISHED
//                                )
//                                &&
//                                !(event.getConnectionStateEvent().getAddress().getAddressType().equals(AddressType.GENERIC) || event.getConnectionStateEvent().getAddress().getAddressType().equals(AddressType.AGENT))
////                                && (event.getConnectionStateEvent().getAddress().getAddressType().equals(AddressType.)
////                                || event.getConnectionStateEvent().getAddress().getAddressType().equals(AddressType.AGENT))
//                                ) {
//                            logger.warn("Disconnected call, which was not answered! : {}",IS.logObject(event.getConnectionStateEvent()));
//                        }
                        break;
//                    case CONTACT_PROPERTY:
////                        //handle contact Property notification here
//                        //logger.info(IS.logObject(event.getContactPropertyEvent()));
//                        break;
//                    case DEFAULT_TREATMENT:
////                        //handle default treatment notification here
//                        //logger.info(IS.logObject(event.getDefaultTreatmentEvent()));
//                        break;
//                    case FORCE_DISCONNECT:
//                        //handle force disconnect notification here
//                        //logger.info(IS.logObject(event.getForceDisconnectEvent()));
//                        break;
//                    case SERVICE_PROVIDER_STATUS:
//                        //handle Service Provider Status notification here
////                        IS.logObjectToSystemOut(notificationEventHolder.getServiceProviderStatusEvent().getProvider());
////                        IS.logObjectToSystemOut(notificationEventHolder.getServiceProviderStatusEvent().getStatus());
//                        break;
                    case SYSTEM:
//                        handle System notification here
                        if (event.getSystemEvent().getSystemEventSessionTermination() != null
                                || event.getSystemEvent().getSystemEventSubscriptionTermination() != null) {
                            IS.reStartCCT();
                        }
                        break;
//                    case TERMINAL_CONNECTION_STATE:
//                        //handle Terminal Connection Statenotification here
////                        logger.info(IS.logObject(event.getTerminalConnectionStateEvent()));
//                        break;
//                    case TERMINAL_PROPERTY:
//
//                        break;
//                    case TERMINAL_STATE:
//                        break;
                }
            }

        } catch (Exception ex) {
            logger.error("Error", ex);
        }
    }

    private static void onAgentLogin(AgentPropertyEventType agentPropertyEvent, long startTime) {
        try {
            long cctReqTime = 0;
            String terminalName;
            String agentLoginId = agentPropertyEvent.getAgent().getAgentLoginId();
            long cctStartReq = System.currentTimeMillis();
            Terminal terminal = IS.getVoiceTerminalFromAgentLoginId(agentPropertyEvent.getAgent().getAgentLoginId());


            terminalName = terminal.getTerminalName();
            cctReqTime += System.currentTimeMillis() - cctStartReq;
            String url = String.format("?action=idle&line=%1$s&agent=%2$s",
                    terminalName,
                    agentLoginId);
            SocketServer.sendBrowse(urlBase + url, agentLoginId);
            calcStat(startTime, cctReqTime);
            loggerTiming.info("onAgentLogin:\t PricessingTime={},\t time spent for CCT req: {} \t agentLoginId='{}'", System.currentTimeMillis() - startTime, cctReqTime, agentLoginId, (double) summProcessTime / countProcess);
        } catch (Exception e) {
            logger.error("Error processing onAgentLogin: {}, event='{}'", e.getMessage(), IS.logObject(agentPropertyEvent));
        }
    }

    private static void onAgentLogOut(AgentPropertyEventType agentPropertyEvent, long startTime) {
        try {
            String agentLoginId = agentPropertyEvent.getAgent().getAgentLoginId();
            String url = String.format("?action=idle&agent=%1$s",
                    agentLoginId);
            SocketServer.sendBrowse(urlBase + url, agentLoginId);
            calcStat(startTime, 0);
            loggerTiming.info("onAgentLogOut:\t PricessingTime={},\t time spent for CCT req: {} \t agentLoginId='{}'", System.currentTimeMillis() - startTime, 0, agentLoginId);
        } catch (Exception e) {
            logger.error("Error processing onAgentLogOut: {}, event='{}'", e.getMessage(), IS.logObject(agentPropertyEvent));
        }
    }

    private static void onDisconnectCall(ConnectionStateEventType event, long startTime) {
        ///////////////////////////// NEW NEW version
        logger.debug("----------------------onDisconnectCall----------------------------!!!");
        if (event.getAddress().getProvider().getProviderName().equals("CCMM")) {
            return;
        }
        long cctReqTime = 0;
        long cctStartReq = 0;
        String agentLoginId = null;
        Terminal terminal;
        try {
            cctStartReq = System.currentTimeMillis();
            terminal = IS.getVoiceTerminalByAddress(event.getAddress());
            cctReqTime += System.currentTimeMillis() - cctStartReq;
            if (terminal == null) {
                return;
            }
            com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest terminalRequest = new com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest();
            terminalRequest.setSsoToken(ssoToken);
            terminalRequest.setTerminal(terminal);
            cctStartReq = System.currentTimeMillis();
            if (IS.getAgentTerminalService().getTerminalConnections(terminalRequest).getTerminalConnection().size() > 0) {
                return;
            }
            agentLoginId = IS.getAgentTerminalService().getLoginId(terminalRequest).getLoginId();
            cctReqTime += System.currentTimeMillis() - cctStartReq;
        } catch (GetLoginIdException | GetTerminalConnectionsException ex) {
            logger.error("getAgentTerminalService().getLoginId | getTerminalConnections Error", ex);
        } catch (Exception ex) {
//            agentTerminalService = null;
            logger.error("getAgentTerminalService().getLoginId Error", ex);
        }

        if (agentTransferContactMap.remove(event.getAddress().getAddressName()) == null) {
//            logger.warn("Disconnected call which was not answered! \n {}",IS.logObject(event));
            logger.debug("Ignoring internal calls. address '{}' not in agentTransferContactMap", event.getAddress().getAddressName());
            return;
        }
        logger.debug("----------removed {}, now agentTransferContactMap {}", event.getAddress().getAddressName(), agentTransferContactMap);
        if (agentLoginId == null) {
            logger.info("Unable to get agentLoginId for {}", event.getAddress().getAddressName());
            return;
        }
        if (agentsInAO.remove(agentLoginId)) {
            logger.debug("This event are for Automated Outbound Activity. Ignoring");
            return;
        }
        cctStartReq = System.currentTimeMillis();
        try {
            IS.setAgentNotReady(agentLoginId, afterCallWorkCode);
        } catch (Exception ex) {
            logger.error("Failed to set agent '{}' to NotReadyState: {}", agentLoginId, ex.getMessage());
        }
        cctReqTime += System.currentTimeMillis() - cctStartReq;
        calcStat(startTime, cctReqTime);
        loggerTiming.info("onDisconnect:\t PricessingTime={},\t time spent for CCT req: {} \t agentLoginId='{}'",
                System.currentTimeMillis() - startTime, cctReqTime, agentLoginId);

////        ///////////////////////////// Old version
//        logger.debug("----------------------onDisconnectCall----------------------------!!!");
////        if (event.getReason() != null && event.getReason().equals(Reason.TRANSFER_COMPLETE)) {
////            logger.info("Ignoring events with reason==Reason.TRANSFER_COMPLETE for address='{}'",event.getAddress().getAddressName());
////            return;
////        }
//        long cctReqTime = 0;
//        com.nortel.soa.oi.cct.types.contactservice.ContactRequest contactRequest = new com.nortel.soa.oi.cct.types.contactservice.ContactRequest();
//        contactRequest.setContact(event.getContact());
//        contactRequest.setSsoToken(ssoToken);
//        try {
//            long cctStartReq = System.currentTimeMillis();
//            Address callingAddr = getContactService().getCallingAddress(contactRequest).getAddress();
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            if (callingAddr.getAddressType().equals(AddressType.AGENT)
//                    || (callingAddr.getAddressName().length() == 5
//                    && (callingAddr.getAddressName().startsWith("175") || callingAddr.getAddressName().startsWith("176")))) {
//                //Ignore internal calls
//                logger.debug("Ignoring internal calls. This is internal (ANI 17500-17699) or AddressType.AGENT call from number {}", callingAddr.getAddressName());
//                return;
//            }
//        } catch (com.nortel.soa.oi.cct.contactservice.SessionNotCreatedException ex) {
//            logger.error("Error", ex);
//        } catch (Exception ex) {
//            logger.debug("Filed to getCallingAddress - {}", ex.getMessage());
//        }
//
//        String agentLoginId;
//        if (event.getAddress().getAddressType().equals(AddressType.AGENT)
//                && !event.getAddress().getProvider().getProviderName().equals("CCMM")) {
//            long cctStartReq = System.currentTimeMillis();
//            agentLoginId = getAgentLoginIdByAddress(event.getAddress());
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            if (agentLoginId == null) {
//                logger.info("Unable to get agentLoginId for {}", event.getAddress().getAddressName());
//                return;
//            }
//            agentTransferContactMap.remove(agentLoginId);
//            logger.debug("----------removed {}, now agentTransferContactMap {}",agentLoginId, agentTransferContactMap);
//            if (agentsInAO.remove(agentLoginId)) {
//                logger.debug("This event are for Automated Outbound Activity. Ignoring");
//                return;
//            }
//            cctStartReq = System.currentTimeMillis();
//            try {
//                setAgentNotReady(agentLoginId, afterCallWorkCode);
//            } catch (Exception ex) {
//                logger.error("Failed to set agent '{}' to NotReadyState: {}", agentLoginId, ex.getMessage());
//            }
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            calcStat(startTime, cctReqTime);
//            loggerTiming.info("onDisconnect:\t PricessingTime={},\t time spent for CCT req: {} \t agentLoginId='{}'",
//                    System.currentTimeMillis() - startTime, cctReqTime, agentLoginId);
//            return;
//        }
//        if (event.getAddress().getAddressType().equals(AddressType.GENERIC)) {
//            long cctStartReq = System.currentTimeMillis();
//            agentLoginId = getAgentLoginIdByAddress(event.getAddress());
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            if (agentLoginId == null) {
//                logger.info("Unable to get agentLoginId for {}", event.getAddress().getAddressName());
//                return;
//            }
//            agentTransferContactMap.remove(agentLoginId);
//            logger.debug("----------removed {}, now agentTransferContactMap {}",agentLoginId, agentTransferContactMap);
//            if (agentsInAO.remove(agentLoginId)) {
//                logger.debug("This event are for Automated Outbound Activity. Ignoring");
//                return;
//            }
//            cctStartReq = System.currentTimeMillis();
//            setAgentNotReady(agentLoginId, afterCallWorkCode);
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            calcStat(startTime, cctReqTime);
//            loggerTiming.info("onDisconnect:\t PricessingTime={},\t time spent for CCT req: {} \t address:='{}'",
//                    System.currentTimeMillis() - startTime, cctReqTime, event.getAddress().getAddressName());
//        }


//        ///////////////////////////// NEW version
//        logger.debug("----------------------onDisconnectCall----------------------------!!! event={}", IS.logObject(event));
//        long cctReqTime = 0;
//        com.nortel.soa.oi.cct.types.contactservice.ContactRequest contactRequest = new com.nortel.soa.oi.cct.types.contactservice.ContactRequest();
//        contactRequest.setContact(event.getContact());
//        contactRequest.setSsoToken(ssoToken);
//        try {
//            long cctStartReq = System.currentTimeMillis();
//            Address callingAddr = getContactService().getCallingAddress(contactRequest).getAddress();
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            if (callingAddr.getAddressType().equals(AddressType.AGENT)
//                    || (callingAddr.getAddressName().length() == 5
//                    && (callingAddr.getAddressName().startsWith("175") || callingAddr.getAddressName().startsWith("176")))) {
//                //Ignore internal calls
//                logger.debug("Ignoring internal calls. This is internal (ANI 17500-17699) or AddressType.AGENT call from number {}", callingAddr.getAddressName());
//                return;
//            }
//        } catch (com.nortel.soa.oi.cct.contactservice.SessionNotCreatedException ex) {
//            logger.error("Error", ex);
//            contactService = null;
//        } catch (Exception ex) {
//            logger.debug("Filed to getCallingAddress - " + ex.getMessage());
//            //Ignore supervised transfer when initiator cancel transfer
//            if (event.getReason() != null && event.getReason().equals(Reason.TRANSFER_COMPLETE)) {
//                logger.debug("Ignoring events with reason==Reason.TRANSFER_COMPLETE for address='{}'", event.getAddress().getAddressName());
//                return;
//            }
//        }
//
//        String agentLoginId;
//        if (event.getAddress().getAddressType().equals(AddressType.AGENT)
//                && !event.getAddress().getProvider().getProviderName().equals("CCMM")) {
//            long cctStartReq = System.currentTimeMillis();
//            agentLoginId = getAgentLoginIdByAddress(event.getAddress());
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            if (agentLoginId == null) {
//                logger.info("Unable to get agentLoginId for {}", event.getAddress().getAddressName());
//                return;
//            }
////            agentTransferContactMap.remove(agentLoginId);
////            if (agentTransferContactMap.remove(agentLoginId) == null) {
////                logger.debug("Ignoring internal calls. agentLoginId '{}' not in agentTransferContactMap", agentLoginId);
////            }
////            logger.debug("----------removed {}, now agentTransferContactMap {}", agentLoginId, agentTransferContactMap);
//            if (agentsInAO.remove(agentLoginId)) {
//                logger.debug("This event are for Automated Outbound Activity. Ignoring");
//                return;
//            }
//            String contactId = null;
//            try {
//                contactId = agentTransferContactMap.get(event.getAddress().getAddressName()).split(" ")[2];
//            } catch (Exception e) {
//            }
//
//            if (contactId != null && !contactId.equals(event.getContact().getContactId())) {
//                logger.debug("Ignoring supervised transfer cancel calls. contactId {} for address '{}' not match in agentTransferContactMap",
//                        contactId, event.getAddress().getAddressName());
//                return;
//            }
//            if (agentTransferContactMap.remove(event.getAddress().getAddressName()) == null) {
//                logger.debug("Ignoring internal calls. address '{}' not in agentTransferContactMap", event.getAddress().getAddressName());
//                return;
//            }
//            logger.debug("----------removed {}, now agentTransferContactMap {}", event.getAddress().getAddressName(), agentTransferContactMap);
//            cctStartReq = System.currentTimeMillis();
//            try {
//                setAgentNotReady(agentLoginId, afterCallWorkCode);
//            } catch (Exception ex) {
//                logger.error("Failed to set agent '{}' to NotReadyState: {}", agentLoginId, ex.getMessage());
//            }
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            calcStat(startTime, cctReqTime);
//            loggerTiming.info("onDisconnect:\t PricessingTime={},\t time spent for CCT req: {} \t agentLoginId='{}'",
//                    System.currentTimeMillis() - startTime, cctReqTime, agentLoginId);
//            return;
//        }
//        if (event.getAddress().getAddressType().equals(AddressType.GENERIC)) {
//            long cctStartReq = System.currentTimeMillis();
//            agentLoginId = getAgentLoginIdByAddress(event.getAddress());
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            if (agentLoginId == null) {
//                logger.info("Unable to get agentLoginId for {}", event.getAddress().getAddressName());
//                return;
//            }
//            if (agentsInAO.remove(agentLoginId)) {
//                logger.debug("This event are for Automated Outbound Activity. Ignoring");
//                return;
//            }
//            String contactId = null;
//            try {
//                contactId = agentTransferContactMap.get(event.getAddress().getAddressName()).split(" ")[2];
//            } catch (Exception e) {
//            }
//
//            if (contactId != null && !contactId.equals(event.getContact().getContactId())) {
//                logger.debug("Ignoring supervised transfer cancel calls. contactId {} for address '{}' not match in agentTransferContactMap",
//                        contactId, event.getAddress().getAddressName());
//                return;
//            }
//            if (agentTransferContactMap.remove(event.getAddress().getAddressName()) == null) {
//                logger.debug("Ignoring internal calls. address '{}' not in agentTransferContactMap", event.getAddress().getAddressName());
//                return;
//            }
//            logger.debug("----------removed {}, now agentTransferContactMap {}", event.getAddress().getAddressName(), agentTransferContactMap);
//            cctStartReq = System.currentTimeMillis();
//            setAgentNotReady(agentLoginId, afterCallWorkCode);
//            cctReqTime += System.currentTimeMillis() - cctStartReq;
//            calcStat(startTime, cctReqTime);
//            loggerTiming.info("onDisconnect:\t PricessingTime={},\t time spent for CCT req: {} \t address:='{}'",
//                    System.currentTimeMillis() - startTime, cctReqTime, event.getAddress().getAddressName());
//        }
    }

    private static void onIncommingCall(ConnectionStateEventType event, long startTime) {
        long cctReqTime = 0;
        if ((!event.getAddress().getAddressType().equals(AddressType.AGENT))
                && (!event.getAddress().getAddressType().equals(AddressType.GENERIC))) {
            logger.debug("!!!!!!!!!!!!!!!!!!!!   Address().getAddressType() is {}."
                    + " This event not related to Agent. Ignoring.", event.getAddress().getAddressType().value());
            return;
        }
        logger.debug("----------------------onIncommingCall----------------------------!!!");
        String terminalName = null;
        String agentLoginId = null;
        String contactId = event.getContact().getContactId();
        String relatedContactId = null;
        String originalDestanationAddress = null;
        String callingAddress = null;

        try {
            long cctStartReq = System.currentTimeMillis();
            Terminal terminal = IS.getVoiceTerminalByAddress(event.getAddress());
            cctReqTime += System.currentTimeMillis() - cctStartReq;
            terminalName = terminal.getTerminalName();

            com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest terminalRequest = new com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest();
            terminalRequest.setSsoToken(ssoToken);
            terminalRequest.setTerminal(terminal);
            cctStartReq = System.currentTimeMillis();
            agentLoginId = IS.getAgentTerminalService().getLoginId(terminalRequest).getLoginId();
            cctReqTime += System.currentTimeMillis() - cctStartReq;

        } catch (GetLoginIdException ex) {
            logger.error("getAgentTerminalService().getLoginId Error", ex);
        } catch (Exception ex) {
//            agentTerminalService = null;
            logger.error(" getAgentTerminalService().getLoginId Error", ex);
        }
        if (agentLoginId == null) {
            logger.warn("Unable to resolve agentLoginId. Ignoring");
            return;
        }

        com.nortel.soa.oi.cct.types.contactservice.ContactRequest contactRequest = new com.nortel.soa.oi.cct.types.contactservice.ContactRequest();
        contactRequest.setContact(event.getContact());
        contactRequest.setSsoToken(ssoToken);


        try {
            long cctStartReq = System.currentTimeMillis();
            Address callingAddr = IS.getContactService().getCallingAddress(contactRequest).getAddress();
            cctReqTime += System.currentTimeMillis() - cctStartReq;
            if (callingAddr.getAddressType().equals(AddressType.AGENT)) {
                //Filter transfer Event
//                cctStartReq = System.currentTimeMillis();
//                String callingAgentLoginId = getAgentLoginIdByAddress(callingAddr);
//                cctReqTime += System.currentTimeMillis() - cctStartReq;
                String agentTransferContact = agentTransferContactMap.get(callingAddr.getAddressName());
                if (agentTransferContact == null) {
                    logger.info("agentTransferContactMap doesn't contains records for {}. Full map is {}", callingAddr.getAddressName(), agentTransferContactMap);
                    return;
                }
                String[] transferParams = agentTransferContact.split(" ");
                callingAddress = transferParams[0];
                originalDestanationAddress = transferParams[1];
                relatedContactId = transferParams[2];
            } else {
                if (callingAddr.getAddressName().length() == 5 && (callingAddr.getAddressName().startsWith("175") || callingAddr.getAddressName().startsWith("176"))) {
//                    if(event.getReason().equals(Reason.TRANSFER_COMPLETE)){ //newState =  ALERTING | previousState =  IDLE
//                        logger.info("Reason is TRANSFER_COMPLETE");
//                    }
                    //Ignore internal calls
//                    cctStartReq = System.currentTimeMillis();
//                    String callingAgentLoginId = getAgentLoginIdByAddress(callingAddr);
//                    cctReqTime += System.currentTimeMillis() - cctStartReq;
                    String agentTransferContact = agentTransferContactMap.get(callingAddr.getAddressName());
                    if (agentTransferContact == null) {
                        logger.debug("Ignoring internal calls. This is internal (ANI 17500-17699) call from number {}", callingAddr.getAddressName());
                        return;
                    }
                    String[] transferParams = agentTransferContact.split(" ");
                    callingAddress = transferParams[0];
                    originalDestanationAddress = transferParams[1];
                    relatedContactId = transferParams[2];
                } else {
                    callingAddress = callingAddr.getAddressName();
                    try {
                        cctStartReq = System.currentTimeMillis();
                        originalDestanationAddress = IS.getContactService().getOriginalDestinationAddress(contactRequest).getAddress().getAddressName();
                        cctReqTime += System.currentTimeMillis() - cctStartReq;
                    } catch (GetOriginalDestinationAddressException | com.nortel.soa.oi.cct.contactservice.SessionNotCreatedException ex) {
                        logger.warn("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to getOriginalDestinationAddress - " + ex.getMessage());
                    }
                }
            }

        } catch (com.nortel.soa.oi.cct.contactservice.SessionNotCreatedException ex) {
            logger.error("Error", ex);
        } catch (Exception ex) {
            logger.warn("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to getCallingAddress - " + ex.getMessage());
        }

        if (agentLoginId.equals(callingAddress)) {
            logger.info("agentLoginId.equals(callingAddress). This is transfer. Ignoring");
            return;
        }

        logger.debug("originalDestanationAddress: " + originalDestanationAddress);
        logger.debug("callingAddress: " + callingAddress);
        logger.debug("relatedContactId: " + relatedContactId);

        if (originalDestanationAddress != null) {
            if (relatedContactId == null) {
                agentTransferContactMap.put(event.getAddress().getAddressName(), callingAddress + " " + originalDestanationAddress + " " + contactId);
            } else {
                agentTransferContactMap.put(event.getAddress().getAddressName(), callingAddress + " " + originalDestanationAddress + " " + relatedContactId);
            }
        } else {
            return;
        }

        String url;
        if (relatedContactId == null || relatedContactId.isEmpty()) {
            url = String.format("?action=offering&line=%1$s&agent=%2$s&contactID=%3$s&callednumber=%4$s&callernumber=%5$s",
                    terminalName,
                    agentLoginId,
                    contactId,
                    originalDestanationAddress,
                    callingAddress);
        } else {
            url = String.format("?action=offering&line=%1$s&agent=%2$s&contactID=%3$s&callednumber=%4$s&callernumber=%5$s&relatedContactId=%6$s",
                    terminalName,
                    agentLoginId,
                    contactId,
                    originalDestanationAddress,
                    callingAddress,
                    relatedContactId);
        }
        SocketServer.sendBrowse(urlBase + url, agentLoginId);
        calcStat(startTime, cctReqTime);
//        loggerTiming.info("onIncommingCall: {} --> {} addr: {}", event.getPreviousState(), event.getNewState(), event.getAddress().getAddressName());
        loggerTiming.info("onIncommingCall: PricessingTime={},\t time spent for CCT req: {} \t agentLoginId='{}'", System.currentTimeMillis() - startTime, cctReqTime, agentLoginId);
    }

    private static void onAutomatedOutbound(ConnectionStateEventType event, long startTime) {
        long cctReqTime = 0;
        logger.debug("----------------------onAutomatedOutbound----------------------------!!!");
        String agentLoginId;
        String customerId = null;
        String multimediaContactID = null;//event.getContact().getContactId();
        String skillSetName = null;
        String skillSetId = null;
        String contactSubType = null;
        agentLoginId = event.getAddress().getAddressName().split("_")[2];

        com.nortel.soa.oi.cct.types.contactservice.ContactRequest contactRequest = new com.nortel.soa.oi.cct.types.contactservice.ContactRequest();
        contactRequest.setContact(event.getContact());
        contactRequest.setSsoToken(ssoToken);
        long cctStartReq = System.currentTimeMillis();
        List<Intrinsic> intrinsics;
        try {
            intrinsics = IS.getContactService().getIntrinsics(contactRequest).getIntrinsic();

            cctReqTime += System.currentTimeMillis() - cctStartReq;
            for (Intrinsic intrinsic : intrinsics) {
                if (intrinsic.getKey().equals("CUSTOMERID")) {
                    customerId = intrinsic.getValue();
                    continue;
                }
                if (intrinsic.getKey().equals("%SKILLSET%SKILLSET")) {
                    skillSetId = intrinsic.getValue();
                    continue;
                }
                if (intrinsic.getKey().equals("Skillset")) {
                    skillSetName = intrinsic.getValue();
                    continue;
                }
                if (intrinsic.getKey().equals("CONTACTSUBTYPE")) {
                    contactSubType = intrinsic.getValue();
                    continue;
                }
                if (intrinsic.getKey().equals("CONTACTID")) {
                    multimediaContactID = intrinsic.getValue();
                    continue;
                }
            }
        } catch (GetIntrinsicsException ex) {
            logger.warn("getContactService().getIntrinsics:", ex);
        } catch (Exception ex) {
//            contactService = null;
            logger.error("getContactService().getIntrinsics:", ex);
            return;
        }
        if (!"Outbound".equals(contactSubType) && !"Scheduled Callback".equalsIgnoreCase(contactSubType) && !"Web_Communications".equalsIgnoreCase(contactSubType)) {
            logger.debug("This contact subtype is not Outbound or CallBack or Web_Communications. Ignoring.");
            return;
        }
        if ("Scheduled Callback".equalsIgnoreCase(contactSubType)) {
            agentsInAO.add(agentLoginId);
            String url = String.format("?action=offering&customerID=%1$s&multimediaContactID=%2$s&agent=%3$s&skillSetName=%4$s&skillSetId=%5$s&contactSubType=%6$s%7$s",
                    customerId,
                    multimediaContactID,
                    agentLoginId,
                    skillSetName,
                    skillSetId,
                    contactSubType,
                    CacheCCMMconnection.getMsisdnArrayUrlPart(customerId));
            SocketServer.sendBrowse(urlBaseCB + url, agentLoginId);
        } else if ("Outbound".equalsIgnoreCase(contactSubType)) {
            agentsInAO.add(agentLoginId);
            String url = String.format("?action=offering&customerID=%1$s&multimediaContactID=%2$s&agent=%3$s&skillSetName=%4$s&skillSetId=%5$s&contactSubType=%6$s%7$s",
                    customerId,
                    multimediaContactID,
                    agentLoginId,
                    skillSetName,
                    skillSetId,
                    contactSubType,
                    CacheCCMMconnection.getMsisdnArrayUrlPart(customerId));
            SocketServer.sendBrowse(urlBaseAO + url, agentLoginId);
        } else if ("Web_Communications".equalsIgnoreCase(contactSubType)) {
            String url = String.format("?action=offering&customerID=%1$s&multimediaContactID=%2$s&agent=%3$s&skillSetName=%4$s&skillSetId=%5$s&contactSubType=%6$s%7$s",
                    customerId,
                    multimediaContactID,
                    agentLoginId,
                    skillSetName,
                    skillSetId,
                    contactSubType,
                    CacheCCMMconnection.getMsisdnArrayUrlPart(customerId));
            SocketServer.sendBrowse(urlBaseWC + url, agentLoginId);
        } else {
            logger.warn("!!!! Not found action for contactSubType '{}'. Popup will be not porformed.", contactSubType);
        }
//        calcStat(startTime, cctReqTime);
        loggerTiming.info("onAutomatedOut: PricessingTime={},\t time spent for CCT req: {} \t agentLoginId='{}'",
                System.currentTimeMillis() - startTime, cctReqTime, agentLoginId);
    }
    /**
     * @return {@link SessionService} Retrieves interface to be used by service
     * consumers
     */
//    private static SessionService getSessionService() {
//        if (sessionService == null) {
//            sessionService = new SOAOICCT().getSessionService();
//        }
//        return sessionService;
//    }
//
//    /**
//     * @return {@link AgentService} Retrieves interface to be used by
//     * AgentService consumers
//     */
//    private static AgentService getAgentService() throws WebServiceException {
//        if (agentService == null) {
//            agentService = new SOAOICCTAgentService().getAgentService();
//        }
//        return agentService;
//    }
//
//    /**
//     * @return {@link AgentTerminalService} Retrieves interface to be used by
//     * AgentTerminalService consumers
//     */
//    private static AgentTerminalService getAgentTerminalService() {
//        if (agentTerminalService == null) {
//            agentTerminalService = new SOAOICCTAgentTerminalService().getAgentTerminalService();
//        }
//        return agentTerminalService;
//    }
//
//    /**
//     * @return {@link AddressService} Retrieves interface to be used by
//     * AddressService consumers
//     */
//    private static AddressService getAddressService() {
//        if (addressService == null) {
//            addressService = new SOAOICCTAddressService().getAddressService();
//        }
//        return addressService;
//    }
//
//    private static ContactService getContactService() {
//        if (contactService == null) {
//            contactService = new SOAOICCTContactService().getContactService();
//        }
//        return contactService;
//    }
//    private static Terminal getVoiceTerminalByAgentLoginId(Agent agent) {
//        GetAgentTerminalsRequest agentTerminalsRequest = new GetAgentTerminalsRequest();
//        agentTerminalsRequest.setAgent(agent);
//        agentTerminalsRequest.setSsoToken(ssoToken);
//        try {
//            List<Terminal> terminals = getSessionService().getAgentTerminals(agentTerminalsRequest).getTerminals();
//            for (Terminal t : terminals) {
//                if (t.getTerminalName().startsWith("Line")) {
//                    return t;
//                }
//            }
//            logger.warn("Failed to get Voice terminal for agentLoginId='{}', terminals are {}",
//                    agent.getAgentLoginId(), IS.logObject(terminals));
//        } catch (GetAgentTerminalsException ex) {
//            logger.warn("GetAgentTerminalsException: ", ex);
//        } catch (Exception ex) {
//            sessionService = null;
//            logger.error("SessionNotCreatedException: ", ex);
//        }
//        Terminal terminal = new Terminal();
//        terminal.setTerminalName("Not found in CCT");
//        return terminal;
//    }
//    private static String getAgentLoginIdByAddress(Address address) {
//        try {
//            Terminal terminal = getVoiceTerminalByAddress(address);
//            if (terminal == null) {
//                return null;
//            }
//            com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest terminalRequest = new com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest();
//            terminalRequest.setSsoToken(ssoToken);
//            terminalRequest.setTerminal(terminal);
//            return getAgentTerminalService().getLoginId(terminalRequest).getLoginId();
//        } catch (GetLoginIdException ex) {
//            logger.error("getAgentTerminalService().getLoginId Error", ex);
//        } catch (Exception ex) {
//            agentTerminalService = null;
//            logger.error(" getAgentTerminalService().getLoginId Error", ex);
//        }
//        return null;
//    }
//    private static void setAgentNotReady(String agentLoginId, String reasonCode) {
//        if (agentLoginId == null) {
//            logger.warn("setAgentNotReady: agentLoginId==null. ignoring.");
//            return;
//        }
//        Agent agent = new Agent();
//        agent.setAgentLoginId(agentLoginId);
//        SetReadyRequest srr = new SetReadyRequest();
//        srr.setAgent(agent);
//        srr.setSsoToken(ssoToken);
//        srr.setReady(false);
//        try {
//            getAgentService().setReady(srr);
//        } catch (SetReadyException ex) {
//            logger.warn("setAgentNotReady: SetReadyException: {}", ex.getMessage());
//        } catch (Exception ex) {
//            agentService = null;
//            logger.warn("setAgentNotReady: Exception: ", ex);
//        }
//        if (reasonCode != null) {
//            try {
//                SetNotReadyReasonCodeRequest notReadyRequest = new SetNotReadyReasonCodeRequest();
//
//                notReadyRequest.setAgent(agent);
//
//                notReadyRequest.setReasonCode(reasonCode);
//                notReadyRequest.setSsoToken(ssoToken);
//
//                getAgentService().setNotReadyReasonCode(notReadyRequest);
//            } catch (SetNotReadyReasonCodeException ex) {
//                logger.warn("setAgentNotReadyReasonCode: SetNotReadyReasonCodeException: {}", ex.getMessage());
//            } catch (Exception ex) {
//                agentService = null;
//                logger.warn("setAgentNotReadyReasonCode: SetNotReadyReasonCodeException: ", ex);
//            }
//        }
//    }
}
