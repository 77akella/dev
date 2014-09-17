package ua.com.AACC.is.run;

import com.nortel.soa.oi.cct.addressservice.AddressService;
import com.nortel.soa.oi.cct.addressservice.GetTerminalsException;
import com.nortel.soa.oi.cct.addressservice.SOAOICCTAddressService;
import com.nortel.soa.oi.cct.agentservice.AgentService;
import com.nortel.soa.oi.cct.agentservice.GetNotReadyReasonCodeException;
import com.nortel.soa.oi.cct.agentservice.GetStaticVoiceTerminalException;
import com.nortel.soa.oi.cct.agentservice.IsSupervisorException;
import com.nortel.soa.oi.cct.agentservice.SOAOICCTAgentService;
import com.nortel.soa.oi.cct.agentservice.SetNotReadyReasonCodeException;
import com.nortel.soa.oi.cct.agentservice.SetReadyException;
import com.nortel.soa.oi.cct.agentterminalconnectionservice.AgentTerminalConnectionService;
import com.nortel.soa.oi.cct.agentterminalconnectionservice.SOAOICCTAgentTerminalConnectionService;
import com.nortel.soa.oi.cct.agentterminalservice.AgentTerminalService;
import com.nortel.soa.oi.cct.agentterminalservice.IsReadyException;
import com.nortel.soa.oi.cct.agentterminalservice.SOAOICCTAgentTerminalService;
import com.nortel.soa.oi.cct.basenotification.ConnectionStateEventType;
import com.nortel.soa.oi.cct.connectionservice.ConnectionService;
import com.nortel.soa.oi.cct.connectionservice.SOAOICCTConnectionService;
import com.nortel.soa.oi.cct.contactservice.ContactService;
import com.nortel.soa.oi.cct.contactservice.SOAOICCTContactService;
import com.nortel.soa.oi.cct.metricsservice.SOAOICCTMetricsService;
import com.nortel.soa.oi.cct.sessionservice.CompleteSupervisedTransferException;
import com.nortel.soa.oi.cct.sessionservice.CreateContactException;
import com.nortel.soa.oi.cct.sessionservice.DropContactException;
import com.nortel.soa.oi.cct.sessionservice.GetAgentTerminalsException;
import com.nortel.soa.oi.cct.sessionservice.GetCurrentAddressCountException;
import com.nortel.soa.oi.cct.sessionservice.GetCurrentTerminalCountException;
import com.nortel.soa.oi.cct.sessionservice.GetTerminalAddressesException;
import com.nortel.soa.oi.cct.sessionservice.InitiateSupervisedTransferException;
import com.nortel.soa.oi.cct.sessionservice.SOAOICCT;
import com.nortel.soa.oi.cct.sessionservice.SessionNotCreatedException;
import com.nortel.soa.oi.cct.sessionservice.SessionService;
import com.nortel.soa.oi.cct.sessionservice.TransferContactException;
import com.nortel.soa.oi.cct.types.*;
import com.nortel.soa.oi.cct.types.addressservice.AddressRequest;
import com.nortel.soa.oi.cct.types.agentservice.AgentRequest;
import com.nortel.soa.oi.cct.types.agentservice.SetNotReadyReasonCodeRequest;
import com.nortel.soa.oi.cct.types.agentservice.SetReadyRequest;
import com.nortel.soa.oi.cct.types.metricsservice.MetricsRequest;
import com.nortel.soa.oi.cct.types.sessionservice.*;
import com.nortel.soa.oi.cct.types.agentterminalconnectionservice.TerminalConnectionRequest;
import com.nortel.soa.oi.cct.types.connectionservice.ConnectionRequest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.util.*;
import java.util.logging.Level;
import javax.xml.ws.WebServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.AACC.is.callback.CallbackController;
import ua.com.AACC.is.cct.EventProcessor;
import ua.com.AACC.is.cct.SessionMonitor;
import ua.com.AACC.is.cct.UserSubscribe;
import ua.com.AACC.is.db.CacheCCMMconnection;
import ua.com.AACC.is.db.DBserver;
import ua.com.AACC.is.http.WebServer;
import ua.com.AACC.is.socketServer.SocketServer;
import ua.com.is.config.ISconfig;

public class IS {

    private static int startedServers = 0;
    private final static Logger logger = LoggerFactory.getLogger(IS.class);
    //Configuration for CCT Notifications Consumer
    private static String cctUserName = "admintest";
    private static String cctPassword = "P@ssw0rd";
    private static String cctDomain = "localhost";
    private static String cctServiceHostAndPort = "ccc-aacc-mgt:9084";
    private static String cctConsumerPort = "9091";
    private static int cctCheckPeriod = 30;
    //Configuration for Socket Server
    private static int socketServerPort = 8888;
    //Configuration for Web Server
    private static int webServerPort = 8080;
    //Static variables
    private static SessionService sessionService;
    private static SocketServer socketServer;
    private static WebServer webServer;
    private static volatile UserSubscribe us;
    //current CCT ssoToken
    private static volatile SsoToken ssoToken;
    //current CCT subscription
    private static volatile String subscription;
    private static String localIpAddress;
    private static volatile AgentService agentService;
    private static volatile AgentTerminalService agentTerminalService;
//    private final static Logger loggerTiming = LoggerFactory.getLogger("Timing");
    private static volatile AddressService addressService;
    private static volatile ContactService contactService;
    private static volatile AgentTerminalConnectionService agentTerminalConnectionService;
    private static long sleepOnReconnectPeriod = 300 * 1000;
    private static final SessionMonitor cctSessionMonitorThread = new SessionMonitor();
    private static ConnectionService connectionService;

    /**
     *
     */
    protected static void loadConfig() {
        ISconfig.loadConfig();
        try {
            localIpAddress = System.getProperty("localIpAddress").trim();
        } catch (Exception e) {
            logger.info("Property localIpAddress not found, so using '{}'", getLocalIpAddress());
        }
        try {
            cctUserName = System.getProperty("cctUserName").trim();
        } catch (Exception e) {
            logger.info("Property cctUserName not found, so using '{}'", cctUserName);
        }
        try {
            cctPassword = System.getProperty("cctPassword").trim();
        } catch (Exception e) {
            logger.info("Property cctPassword not found, so using '{}'", cctPassword);
        }
        try {
            cctDomain = System.getProperty("cctDomain").trim();
        } catch (Exception e) {
            logger.info("Property cctDomain not found, so using '{}'", cctDomain);
        }
        try {
            cctServiceHostAndPort = System.getProperty("cctServiceHostAndPort").trim();
        } catch (Exception e) {
            logger.info("Property cctServiceHostAndPort not found, so using '{}'", cctServiceHostAndPort);
        }
        try {
            cctConsumerPort = System.getProperty("cctConsumerPort").trim();
        } catch (Exception e) {
            logger.info("Property cctConsumerPort not found, so using '{}'", cctConsumerPort);
        }
        try {
            cctCheckPeriod = Integer.valueOf(System.getProperty("cctCheckPeriod").trim());
        } catch (Exception e) {
            logger.info("Property cctCheckPeriod not found, so using '{}' sec", socketServerPort);
        }
        try {
            socketServerPort = Integer.valueOf(System.getProperty("socketServerPort").trim());
        } catch (Exception e) {
            logger.info("Property socketServerPort not found, so using '{}'", socketServerPort);
        }
        try {
            webServerPort = Integer.valueOf(System.getProperty("webServerPort").trim());
        } catch (Exception e) {
            logger.info("Property webServerPort not found, so using '{}'", webServerPort);
        }
        try {
            sleepOnReconnectPeriod = Integer.valueOf(System.getProperty("sleepOnReconnectPeriod").trim()) * 100;
        } catch (Exception e) {
            logger.info("Property webServerPort not found, so using '{}'", webServerPort);
        }
    }

    private static String getLocalIpAddress() {
        if (localIpAddress == null) {
            try {
                InetAddress addr = InetAddress.getLocalHost();
                localIpAddress = addr.getHostAddress();
            } catch (Exception e) {
                logger.error("Error getting local Ip address. ", e);
            }
        }
        return localIpAddress;
    }

    private static void stopDB() {
        try {
            DBserver.stopDB();
            startedServers--;
        } catch (Exception ex) {
            logger.warn("Stop DB Server: {}", ex.getMessage());
        }
    }

    /**
     *
     * @return
     */
    public static SsoToken getSsoToken() {
        if (ssoToken == null) {
            startCCT();
        }
        return ssoToken;
    }

    /**
     *
     */
    protected static void startDB() {
        try {
            DBserver.startDB();
            startedServers++;
        } catch (Exception ex) {
            logger.error("[StartUp] Failed to start DB: ", ex);
        }
    }

    private static UserSubscribe getUserSubscribe() throws Exception {
        if (us == null) {
            us = new UserSubscribe(localIpAddress, cctConsumerPort, cctServiceHostAndPort);
        }
        return us;
    }

    /**
     *
     * @return
     */
    protected static boolean resumeCctConnection() {
        File sessionDetails = new File(new java.io.File("").getAbsolutePath() + File.separator + "sessionDetails.save");
        logger.info("loading connection details from '{}'", sessionDetails.getAbsolutePath());
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(sessionDetails));
        } catch (IOException ioe) {
            logger.warn("Failed to load sessionDetails.save", ioe);
            return false;
        }
        String countProcess = properties.getProperty("countProcess", "0");
        String maxProcessingTime = properties.getProperty("maxProcessingTime", "0");
        String summProcessTime = properties.getProperty("summProcessTime", "0");
        logger.info("Loading stats: summProcessTime={}, maxProcessingTime={}, countProcess={}", summProcessTime, maxProcessingTime, countProcess);
        try {
            EventProcessor.setStatDetails(Long.valueOf(maxProcessingTime), Long.valueOf(summProcessTime), Long.valueOf(countProcess));
        } catch (Exception e) {
            logger.warn("Can't set stats", e);
        }

        String ssoTokenString = properties.getProperty("ssoToken", null);
        subscription = properties.getProperty("subscription", null);
        if (subscription == null || ssoTokenString == null) {
            logger.warn("Failed to load ssoTokenString({}) or subscription ({})", ssoTokenString, subscription);
            return false;
        }
        try {
            ssoToken = new SsoToken();
            ssoToken.setToken(ssoTokenString);
            String subscriptionId = subscription.substring(getUserSubscribe().getNotificationConsumerUri().length() + 1);
            EventProcessor.setConnectionParams(subscriptionId, getSsoToken());
            CacheCCMMconnection.initPool();
            logger.info("subscription1={}, subscriptionId={}", subscription, subscriptionId);
            MetricsRequest metricsRequest = new MetricsRequest();
            int licenseConsumedCount = new SOAOICCTMetricsService().getMetricsService()
                    .getLicenseConsumedCount(metricsRequest).getCount();
            logger.info("Connection to CCT established! licenseConsumedCount is {}", licenseConsumedCount);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    logger.info("Attempting to resubscribe to CCT. This may need if subscription were lost on AACC side");
                    try {
                        reSubscribeToCCT();
                    } catch (Exception e) {
                        logger.error("Failed to resubscribe to CCT", e);
                    }
                }
            }).start();
            synchronized (cctSessionMonitorThread) {
                cctSessionMonitorThread.startMonitor();
                cctSessionMonitorThread.notify();
            }
            return true;
        } catch (Exception e) {
            logger.error("resumeCctConnection failed. Trying to start new connection", e);
            return false;
        }
    }

    /**
     *
     */
    protected static void saveCctConntection() {
        Properties properties = new Properties();
        properties.setProperty("countProcess", EventProcessor.getCountProcess() + "");
        properties.setProperty("maxProcessingTime", EventProcessor.getMaxProcessingTime() + "");
        properties.setProperty("summProcessTime", EventProcessor.getSummProcessTime() + "");
        if (ssoToken != null) {
            properties.setProperty("ssoToken", ssoToken.getToken());
            properties.setProperty("subscription", subscription);
        }

        File sessionDetails = new File(new java.io.File("").getAbsolutePath() + File.separator + "sessionDetails.save");
        try {
            try (FileOutputStream fos = new FileOutputStream(sessionDetails)) {
                properties.store(fos, "CCT Connection details and stats");
                fos.flush();
            }
            logger.info("CCT Connection details and stats stored successfuly to '{}'", sessionDetails.getAbsolutePath());
        } catch (IOException ioe) {
            logger.error("Can't store CCT Connection details and stats to '{}'", sessionDetails.getAbsolutePath(), ioe);
        }
    }

    /**
     *
     */
    protected static void startCCT() {
        try {
            ssoToken = null;

            String consumerEndpoint = getUserSubscribe().publishNotificationConsumer();
            logger.info("consumerEndpoint: " + consumerEndpoint);
            //Login to get SSO TOKEN
            ssoToken = getUserSubscribe().loginToCctServer(cctUserName, cctPassword, cctDomain);
            //Simple subscribe for all events via user service
            subscription = getUserSubscribe().simpleSubscribe(consumerEndpoint, getSsoToken());
            String subscriptionId = subscription.substring(getUserSubscribe().getNotificationConsumerUri().length() + 1);
            EventProcessor.setConnectionParams(subscriptionId, getSsoToken());
            CacheCCMMconnection.initPool();
            EventProcessor.reinitializeServices();
            logger.info("subscription1={}, subscriptionId={}", subscription, subscriptionId);
            synchronized (cctSessionMonitorThread) {
                cctSessionMonitorThread.startMonitor();
                cctSessionMonitorThread.notify();
            }
            startedServers++;
            saveCctConntection();
        } catch (Exception ex) {
            synchronized (cctSessionMonitorThread) {
                cctSessionMonitorThread.startMonitor();
                cctSessionMonitorThread.notify();
            }
            us = null;
            logger.error("[StartUp] Failed to start CCT consumer: ", ex);
        }
    }

    /**
     *
     */
    protected static void attachCctSessionMonitor() {
        SessionMonitor.setPeriond(cctCheckPeriod);
        cctSessionMonitorThread.start();
    }

    private static void stopCCT(String subscription, SsoToken ssoToken1) {
        try {
            //Unsubsribe from CCT events
            getUserSubscribe().unsubscribe(subscription, ssoToken1);
        } catch (Exception ex) {
            logger.warn("Failed to unsubscribe from CCT", ex);
        }
        try {
            //Logout from server
            getUserSubscribe().logout(ssoToken1);
            startedServers--;
        } catch (Exception ex) {
            logger.warn("Failed to logout from CCT", ex);
        }
    }

    /**
     *
     * @param subscriptionId
     */
    public static void unsubscribeFromProducer(String subscriptionId) {
        try {
            String unusedSubscription = getUserSubscribe().getNotificationConsumerUri() + ":" + subscriptionId;
            logger.info("UnsubscribeFromProducer for {}", subscriptionId);
            //Unsubsribe from CCT events
            getUserSubscribe().unsubscribe(unusedSubscription, getSsoToken());
        } catch (Exception ex) {
            logger.error("Failed to unsubscribeFromProducer for {}", subscriptionId);
            logger.error("Failed to unsubscribeFromProducer:", ex);
        }
    }

    /**
     *
     */
    public static void reStartCCT() {
        logger.warn("Processing reStartCCT request");
        SsoToken oldSsoToken = new SsoToken();
        if (ssoToken != null) {
            logger.warn("RESTARTING CCT. ssoToken='{}'", getSsoToken().getToken());
            oldSsoToken.setToken(getSsoToken().getToken());
        }
        String oldSubscription = subscription + "";
        if (ssoToken != null) {
            synchronized (cctSessionMonitorThread) {
                cctSessionMonitorThread.stopMonitor();
                cctSessionMonitorThread.notify();
            }
//            cctSessionMonitorThread.notify();
            stopCCT(oldSubscription, oldSsoToken);
        }
        try {
            Thread.sleep(sleepOnReconnectPeriod);
        } catch (InterruptedException ex) {
            logger.error("Failed to sleep on reconnect", ex);
        }
        synchronized (cctSessionMonitorThread) {
            cctSessionMonitorThread.startMonitor();
            cctSessionMonitorThread.notify();
        }
//        cctSessionMonitorThread.notify();
        startCCT();
        addressService = null;
        agentTerminalConnectionService = null;
//        connectionService = null;
        contactService = null;
        agentService = null;
        agentTerminalService = null;
        sessionService = null;
    }

    /**
     *
     * @throws Exception
     */
    public static void reSubscribeToCCT() throws Exception {
        logger.warn("Processing reSubscribeToCCT request");
        String oldSubscription = subscription + "";
        String consumerEndpoint = getUserSubscribe().publishNotificationConsumer();
        subscription = getUserSubscribe().simpleSubscribe(consumerEndpoint, getSsoToken());
        String subscriptionId = subscription.substring(getUserSubscribe().getNotificationConsumerUri().length() + 1);
        EventProcessor.setConnectionParams(subscriptionId, getSsoToken());
        try {
            getUserSubscribe().unsubscribe(oldSubscription, getSsoToken());
        } catch (Exception e) {
            logger.error("reSubscribeToCCT, getUserSubscribe().unsubscribe: ", e);
        }
    }

    /**
     *
     */
    protected static void startSocketServer() {
        try {
            socketServer = new SocketServer(socketServerPort);
            new Thread(socketServer, "SocketServer").start();
            startedServers++;
            logger.info("Socket server started");
        } catch (IOException ex) {
            logger.error("[StartUp] Failed to start Socket Server: ", ex);
        }
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                logger.warn("Shutting down All services");
                stopAll();
            }
        });
    }

    private static void stopSocketServer() {
        SocketServer.stop();
        socketServer = null;
        startedServers--;
    }

    protected static void startCallbackController() {
        new Thread(new CallbackController(), "CallBackScheduler").start();
    }

    /**
     *
     */
    protected static void startWebServer() {
        try {
            webServer = new WebServer(localIpAddress, webServerPort);
            new Thread(webServer, "WebServer").start();
            startedServers++;
        } catch (Exception ex) {
            logger.error("[StartUp] Failed to start Web Server: ", ex);
        }
    }

    private static void stopWebServer() {
        try {
            WebServer.stop();
            webServer = null;
            startedServers--;
        } catch (Exception ex) {
            logger.warn("Failed to stop WebServer", ex);
        }
    }

    /**
     *
     */
    protected static void stopAll() {
        saveCctConntection();
        Thread cctStopThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (cctSessionMonitorThread) {
                    cctSessionMonitorThread.stopMonitor();
                    cctSessionMonitorThread.notify();
                }
                //stopCCT(subscription, getSsoToken());
            }
        });
        cctStopThread.start();
        stopWebServer();
        stopSocketServer();
        stopDB();
        try {
            cctStopThread.join();
        } catch (InterruptedException ex) {
            logger.warn("Exception in stopCctThread", ex);
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //Load configuration from file "app.conf"
        loadConfig();
        //Start Embedded DB Server
        startDB();
        //start socket Server
        startSocketServer();
        //start CallbackController scheduler
        startCallbackController();
        //Subscribe for All Notifications via notification producer
        startCCT();
        //start web server
        startWebServer();

        attachCctSessionMonitor();
        logger.info("--------------!!!!!!! IS started. CCT SERVER: '{}'", cctServiceHostAndPort);

        logger.info("Press [Enter] to stop Server");

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        try {
            br.readLine();
        } catch (IOException ex) {
        }
        stopAll();
        System.exit(0);
    }

    /**
     *
     * @param o
     * @return
     */
    public static String logObject(Object o) {
        return logObject(o, 0);
    }

    /**
     *
     * @param o
     * @param spacePrefix
     * @return
     */
    public static String logObject(Object o, int spacePrefix) {
        StringBuilder prefix = new StringBuilder();
        if (spacePrefix > 0) {
            for (int i = 0; i < (spacePrefix); i++) {
                prefix.append("\t");
            }
        }
        StringBuilder log = new StringBuilder(" ");
        if (o == null || o.getClass() == null) {
            log.append(prefix).append("Object = NULL");
            return log.toString();
        }
        try {

            if (o.getClass().isPrimitive() || o.getClass().isAnnotation() || o.getClass().isArray() ||//||o.getClass().isAnonymousClass()|| o.getClass().isMemberClass()
                    o.getClass().isEnum() || o.getClass().isInterface() || o.getClass().isLocalClass() || o.getClass().isSynthetic()) {
                log.append(o.toString());
                return log.toString();
            }
        } catch (Exception e) {
            return log.toString();
        }

        if ((o instanceof Number) || (o instanceof String) || (o instanceof Comparable)) {
            log.append("(").append(o.getClass().getSimpleName()).append(") '").append(o).append("' | ");
            return log.toString();
        }

        if (o instanceof Iterable) {
            Iterable al = (Iterable) o;
            Iterator itr = al.iterator();
            log.append(prefix).append("<").append(o.getClass().getSimpleName()).append("> ").append(prefix).append("{{{");
            while (itr.hasNext()) {
                Object element = itr.next();
                log.append("[").append(logObject(element, 0)).append("]");
            }
            log.append("}}}");
            return log.toString();
        }

        if (o instanceof Dictionary) {
            Dictionary al = (Dictionary) o;
            Enumeration itr = al.keys();
            log.append(prefix).append("<").append(o.getClass().getSimpleName()).append("> ").append(prefix).append("{{{");
            while (itr.hasMoreElements()) {
                Object element = itr.nextElement();
                log.append("   [ ").append(logObject(element, spacePrefix))
                        .append(" => ").append(logObject(al.get(element), 0)).append(" ]");
            }
            log.append("}}}");
            return log.toString();
        }
        log.append("<").append(o.getClass().getSimpleName()).append("> ");
        for (Field field : o.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object value = field.get(o);
                log.append(field.getName()).append(" = ");
                if (((o instanceof Iterable) || (o instanceof Dictionary) || o instanceof Comparable)
                        || (o.getClass().getName().startsWith("org.xmlsoap.schemas.")
                        || o.getClass().getName().startsWith("com.nortel.soa.oi.cct")
                        || o.getClass().getName().startsWith("com.nortelnetworks.portal.cmf.core.state"))) { //(field.getModifiers() == 4)&&
                    log.append(logObject(value, spacePrefix + 1)).append(" | ");//
                } else {
                    log.append(value).append(" |");
                }
            } catch (SecurityException | IllegalArgumentException | IllegalAccessException ex) {
                logger.error("Error", ex);
            }
        }
        log.append("</").append(o.getClass().getSimpleName()).append(">");
        return log.toString();
    }

    /**
     * Creates call from agent terminal to address.
     *
     * @param destAddress
     * @param agentLoginId
     * @return {@link String} contactId of created Call
     *
     * @throws Exception - getMessage() contains errorCode. getClause() contains
     * original exception.
     */
    public static String originateCall(String destAddress, String agentLoginId) throws Exception {
        if (destAddress == null || agentLoginId == null) {
            throw new Exception("10", new Exception("Parameter validation failed: "
                    + "destAddress == null || agentLoginId == null "));
        }
        CreateContactRequest createContactRequest = new CreateContactRequest();
        ContactResponse response;
        Address destAddr = new Address();
        destAddr.setAddressName(destAddress);
        destAddr.setAddressType(AddressType.DNIS);

        Terminal terminal = getVoiceTerminalFromAgentLoginId(agentLoginId);
        if (terminal == null) {
            throw new Exception("11", new Exception("Unable to resolve terminal for " + agentLoginId));
        }
        GetTerminalAddressesRequest terminalAddressesRequest = new GetTerminalAddressesRequest();
        terminalAddressesRequest.setSsoToken(getSsoToken());
        terminalAddressesRequest.setTerminal(terminal);
        Address srcAddress = null;

        List<Address> terminalAddresses = null;
        try {
            terminalAddresses = getSessionService().getTerminalAddresses(terminalAddressesRequest).getAddresses();
        } catch (GetTerminalAddressesException ex) {
            throw new Exception("12", ex);
        } catch (Exception ex) {
            sessionService = null;
            logger.error("originateCall: getTerminalAddresses SessionNotCreatedException: ", ex);
            throw ex;
        }
        logger.info(logObject(terminalAddresses));
        for (Address a : terminalAddresses) {
            if (a.getAddressType().equals(AddressType.GENERIC)) {
                srcAddress = a;
            }
        }
        if (srcAddress == null) {
            throw new Exception("12", new Exception("Unable to resolve srcAddress for " + agentLoginId));
        }
        createContactRequest.setTerminal(terminal);
        createContactRequest.setSsoToken(getSsoToken());
        createContactRequest.setSrcAddress(srcAddress);
        createContactRequest.setDstAddress(destAddr);
        try {
            response = getSessionService().createContact(createContactRequest);
        } catch (CreateContactException ex) {
            throw new Exception("13", ex);
        } catch (Exception ex) {
            sessionService = null;
            logger.error("originateCall: SessionNotCreatedException: ", ex);
            throw ex;
        }
        if (logger.isDebugEnabled()) {
            logger.debug("originateCall response: {}", logObject(response));
        }
        return response.getContact().getContactId();
    }

    /**
     * @param agentLoginId
     * @param contactId - Id of contact to drop address.
     *
     * @throws Exception - getMessage() contains errorCode. getClause() contains
     * original exception.
     */
    public static void dropCall(String agentLoginId, String contactId) throws Exception {
//        //start old code
//        if (contactId == null) {
//            throw new Exception("20", new Exception("Parameter validation failed: contactId==null "));
//        }
//        Contact contact = new Contact();
//        contact.setContactId(contactId);
//        // End old code
        Terminal terminal = getVoiceTerminalFromAgentLoginId(agentLoginId);
        if (terminal == null) {
            throw new Exception("21", new Exception("Unable to resolve terminal for " + agentLoginId));
        }
        //start new code
        Contact contact;
        if (contactId == null || contactId.isEmpty()) {
            logger.info("blindTransfer: contactId is null. Will get first contact on agent's termonal.");
            com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest terminalRequest = new com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest();
            terminalRequest.setTerminal(terminal);
            terminalRequest.setSsoToken(getSsoToken());
            List<TerminalConnection> terminalConnections;
            try {
                terminalConnections = getAgentTerminalService().getTerminalConnections(terminalRequest).getTerminalConnection();
            } catch (Exception e) {
                logger.error("Failed to get terminalConnections for terminal {}", terminal.getTerminalName(), e);
                throw new Exception("23", e);
            }
            if (terminalConnections.size() != 1) {
                throw new Exception("21", new Exception("There no or more then one terminalConnections on " + terminal.getTerminalName()
                        + ". Please specify contactId"));
            }
            TerminalConnection terminalConnection = terminalConnections.get(0);
            TerminalConnectionRequest terminalConnectionRequest = new TerminalConnectionRequest();
            terminalConnectionRequest.setTerminalConnection(terminalConnection);
            terminalConnectionRequest.setSsoToken(getSsoToken());
            try {
                contact = getAgentTerminalConnectionService().getContact(terminalConnectionRequest).getContact();
            } catch (Exception e) {
                logger.error("Failed to get contact for terminalConnection {}", terminalConnection.getTerminalConnectionId(), e);
                throw new Exception("23", e);
            }
        } else {
            contact = new Contact();
            contact.setContactId(contactId);
        }
        //end new code

        TerminalContactRequest terminalContactRequest = new TerminalContactRequest();
        terminalContactRequest.setSsoToken(getSsoToken());
        terminalContactRequest.setTerminal(terminal);
        terminalContactRequest.setContact(contact);
        try {
            getSessionService().dropContact(terminalContactRequest);

        } catch (DropContactException ex) {
            throw new Exception("23", ex);
        } catch (Exception ex) {
            sessionService = null;
            logger.error("dropCall: SessionNotCreatedException: ", ex);
            throw ex;
        }
    }

    /**
     * @param agentLoginId Agent Id
     * @param contactId contact Id
     * @param destAddressName
     *
     * @throws Exception - getMessage() contains errorCode. getClause() contains
     * original exception.
     */
    public static void blindTransfer(String agentLoginId, String contactId, String destAddressName) throws Exception {
        if (destAddressName == null) {
            throw new Exception("30", new Exception("Parameter validation failed: destAddressName == null"));
        }
//        //start old code
//        if (contactId == null) {
//            throw new Exception("30", new Exception("Parameter validation failed: contactId==null "));
//        }
////        Contact contact = new Contact();
////        contact.setContactId(contactId);
//        // End old code
        Address destAddress = new Address();
        destAddress.setAddressName(destAddressName);
        Terminal terminal = getVoiceTerminalFromAgentLoginId(agentLoginId);
        if (terminal == null) {
            throw new Exception("31", new Exception("Unable to resolve terminal for " + agentLoginId));
        }
        Contact contact;
        if (contactId == null || contactId.isEmpty()) {
            logger.info("blindTransfer: contactId is null. Will get first contact on agent's termonal.");
            com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest terminalRequest = new com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest();
            terminalRequest.setTerminal(terminal);
            terminalRequest.setSsoToken(getSsoToken());
            List<TerminalConnection> terminalConnections;
            try {
                terminalConnections = getAgentTerminalService().getTerminalConnections(terminalRequest).getTerminalConnection();
            } catch (Exception e) {
                logger.error("Failed to get terminalConnections for terminal {}", terminal.getTerminalName(), e);
                throw new Exception("33", e);
            }
            if (terminalConnections.size() < 1) {
                throw new Exception("31", new Exception("There no terminalConnections on " + terminal.getTerminalName()));
            }
            TerminalConnection terminalConnection = terminalConnections.get(0);
            TerminalConnectionRequest terminalConnectionRequest = new TerminalConnectionRequest();
            terminalConnectionRequest.setTerminalConnection(terminalConnection);
            terminalConnectionRequest.setSsoToken(getSsoToken());
            try {
                contact = getAgentTerminalConnectionService().getContact(terminalConnectionRequest).getContact();
            } catch (Exception e) {
                logger.error("Failed to get contact for terminalConnection {}", terminalConnection.getTerminalConnectionId(), e);
                throw new Exception("33", e);
            }
        } else {
            contact = new Contact();
            contact.setContactId(contactId);
        }


        TerminalContactAddressRequest contactAddressRequest = new TerminalContactAddressRequest();
        contactAddressRequest.setContact(contact);
        contactAddressRequest.setSsoToken(getSsoToken());
        contactAddressRequest.setTerminal(terminal);
        contactAddressRequest.setAddress(destAddress);
        try {
            getSessionService().transferContact(contactAddressRequest);
        } catch (TransferContactException ex) {
            throw new Exception("33", ex);
        } catch (Exception ex) {
            sessionService = null;
            logger.error("blindTransfer: SessionNotCreatedException: ", ex);
            throw ex;
        }
    }

    /**
     * @return {@link String} Initiates Consult Call Transfer from
     * @throws Exception
     * @param agentLoginId Agent ID
     * @param contactId - contact ID
     * @param destAddressName - DNIS
     *
     * Returns ContactId if success, error message otherwise
     */
    public static String initiateConsultTransfer(String agentLoginId, String contactId, String destAddressName) throws Exception {

        if (destAddressName == null) {
            throw new Exception("40", new Exception("Parameter validation failed: destAddressName == null"));
        }
//        //start old code
//        if (contactId == null) {
//            throw new Exception("40", new Exception("Parameter validation failed: contactId==null "));
//        }
////        Contact contact = new Contact();
////        contact.setContactId(contactId);
//        // End old code
        Address destAddress = new Address();
        destAddress.setAddressName(destAddressName);
        Terminal terminal = getVoiceTerminalFromAgentLoginId(agentLoginId);
        if (terminal == null) {
            throw new Exception("41", new Exception("Unable to resolve terminal for " + agentLoginId));
        }
        Contact contact;
        if (contactId == null || contactId.isEmpty()) {
            logger.info("initiateConsultTransfer: contactId is null. Will get first contact on agent's termonal.");
            com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest terminalRequest = new com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest();
            terminalRequest.setTerminal(terminal);
            terminalRequest.setSsoToken(getSsoToken());
            List<TerminalConnection> terminalConnections;
            try {
                terminalConnections = getAgentTerminalService().getTerminalConnections(terminalRequest).getTerminalConnection();
            } catch (Exception e) {
                logger.error("Failed to get terminalConnections for terminal {}", terminal.getTerminalName(), e);
                throw new Exception("43", e);
            }
            if (terminalConnections.size() < 1) {
                throw new Exception("41", new Exception("There no terminalConnections on " + terminal.getTerminalName()));
            }
            TerminalConnection terminalConnection = terminalConnections.get(0);
            TerminalConnectionRequest terminalConnectionRequest = new TerminalConnectionRequest();
            terminalConnectionRequest.setTerminalConnection(terminalConnection);
            terminalConnectionRequest.setSsoToken(getSsoToken());
            try {
                contact = getAgentTerminalConnectionService().getContact(terminalConnectionRequest).getContact();
            } catch (Exception e) {
                logger.error("Failed to get contact for terminalConnection {}", terminalConnection.getTerminalConnectionId(), e);
                throw new Exception("43", e);
            }
        } else {
            contact = new Contact();
            contact.setContactId(contactId);
        }

        TerminalContactAddressRequest contactAddressRequest = new TerminalContactAddressRequest();
        contactAddressRequest.setContact(contact);
        contactAddressRequest.setSsoToken(getSsoToken());
        contactAddressRequest.setTerminal(terminal);
        contactAddressRequest.setAddress(destAddress);
        try {
            return getSessionService().initiateSupervisedTransfer(contactAddressRequest).getContact().getContactId();
        } catch (InitiateSupervisedTransferException ex) {
            throw new Exception("43", ex);
        } catch (Exception ex) {
            sessionService = null;
            logger.error("initiateConsultTransfer: SessionNotCreatedException: ", ex);
            throw ex;
        }
    }

    /**
     * @throws Exception
     * @param agentLoginId Agent ID
     * @param contactId - contact ID
     * @param consultContactId - Consulted contact ID
     *
     * Returns null if success, error message otherwise
     */
    //TODO!
    public static void completeConsultTransfer(String agentLoginId, String contactId, String consultContactId) throws Exception {
        if (consultContactId == null) {
            throw new Exception("50", new Exception("Parameter validation failed: consultContactId == null"));
        }
//        //start old code
//        if (contactId == null) {
//            throw new Exception("50", new Exception("Parameter validation failed: contactId==null "));
//        }
////        Contact contact = new Contact();
////        contact.setContactId(contactId);
//        // End old code
        Contact consultContact = new Contact();
        consultContact.setContactId(consultContactId);
        Terminal terminal = getVoiceTerminalFromAgentLoginId(agentLoginId);
        if (terminal == null) {
            throw new Exception("51", new Exception("Unable to resolve terminal for " + agentLoginId));
        }
        Contact contact;
        if (contactId == null || contactId.isEmpty()) {
            logger.info("initiateConsultTransfer: contactId is null. Will get first contact on agent's termonal.");
            com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest terminalRequest = new com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest();
            terminalRequest.setTerminal(terminal);
            terminalRequest.setSsoToken(getSsoToken());
            List<TerminalConnection> terminalConnections;
            try {
                terminalConnections = getAgentTerminalService().getTerminalConnections(terminalRequest).getTerminalConnection();
            } catch (Exception e) {
                logger.error("Failed to get terminalConnections for terminal {}", terminal.getTerminalName(), e);
                throw new Exception("53", e);
            }
            if (terminalConnections.size() < 2) {
                throw new Exception("51", new Exception("There less than 2 terminalConnections on " + terminal.getTerminalName()));
            }
            TerminalConnection terminalConnection1 = terminalConnections.get(0);
            TerminalConnectionRequest terminalConnectionRequest = new TerminalConnectionRequest();
            terminalConnectionRequest.setTerminalConnection(terminalConnection1);
            terminalConnectionRequest.setSsoToken(getSsoToken());
            try {
                contact = getAgentTerminalConnectionService().getContact(terminalConnectionRequest).getContact();
            } catch (Exception e) {
                logger.error("Failed to get contact for terminalConnection {}", terminalConnection1.getTerminalConnectionId(), e);
                throw new Exception("53", e);
            }
            if (contact.getContactId().trim().equals(consultContactId.trim())) {
                logger.info("Found contact wich equals consultContactId. Will use second terminalConnection for contact.");
                TerminalConnection terminalConnection2 = terminalConnections.get(1);
                terminalConnectionRequest.setTerminalConnection(terminalConnection2);
                terminalConnectionRequest.setSsoToken(getSsoToken());
                try {
                    contact = getAgentTerminalConnectionService().getContact(terminalConnectionRequest).getContact();
                } catch (Exception e) {
                    logger.error("Failed to get contact for terminalConnection {}", terminalConnection2.getTerminalConnectionId(), e);
                    throw new Exception("53", e);
                }
            }
        } else {
            contact = new Contact();
            contact.setContactId(contactId);
        }


        TerminalContactContactRequest terminalContactContactRequest = new TerminalContactContactRequest();
        terminalContactContactRequest.setConsultedContact(consultContact);
        terminalContactContactRequest.setContact(contact);
        terminalContactContactRequest.setTerminal(terminal);
        terminalContactContactRequest.setSsoToken(getSsoToken());
        try {
            getSessionService().completeSupervisedTransfer(terminalContactContactRequest);
        } catch (CompleteSupervisedTransferException ex) {
            throw new Exception("53", ex);
        } catch (Exception ex) {
            sessionService = null;
            logger.error("completeConsultTransfer: SessionNotCreatedException: ", ex);
            throw ex;
        }
    }

    /**
     * @param agentLoginId - login id of agent
     *
     * @throws Exception - getMessage() contains errorCode. getClause() contains
     * original exception.
     */
    public static void setAgentReady(String agentLoginId) throws Exception {
        if (agentLoginId == null) {
            throw new Exception("60", new Exception("Parameter validation failed: agentLoginId==null "));
        }
        Agent agent = new Agent();
        agent.setAgentLoginId(agentLoginId);
        SetReadyRequest srr = new SetReadyRequest();
        srr.setAgent(agent);
        srr.setSsoToken(getSsoToken());
        srr.setReady(true);
        try {
            getAgentService().setReady(srr);
        } catch (SetReadyException ex) {
            throw new Exception("63", ex);
        } catch (Exception ex) {
            logger.error("setAgentReady: agentLoginId='{}'", agentLoginId);
            logger.error("SessionNotCreatedException: ", ex);
            agentService = null;
            throw ex;
        }
    }

    /**
     * Set agent to NotReady status.
     *
     * @param agentLoginId - login id of agent
     * @param reasonCode - Reason code. (optional). May be null;
     *
     * @throws Exception - getMessage() contains errorCode. getClause() contains
     * original exception.
     */
    public static void setAgentNotReady(String agentLoginId, String reasonCode) throws Exception {
        if (agentLoginId == null) {
            throw new Exception("70", new Exception("Parameter validation failed: agentLoginId==null "));
        }
        Agent agent = new Agent();
        agent.setAgentLoginId(agentLoginId);
        SetReadyRequest srr = new SetReadyRequest();
        srr.setAgent(agent);
        srr.setSsoToken(getSsoToken());
        srr.setReady(false);
        try {
            getAgentService().setReady(srr);
        } catch (SetReadyException ex) {
            throw new Exception("73", ex);
        } catch (Exception ex) {
            agentService = null;
            throw new Exception("73", ex);
        }
        if (reasonCode != null) {
            try {
                SetNotReadyReasonCodeRequest notReadyRequest = new SetNotReadyReasonCodeRequest();

                notReadyRequest.setAgent(agent);

                notReadyRequest.setReasonCode(reasonCode);
                notReadyRequest.setSsoToken(getSsoToken());

                getAgentService().setNotReadyReasonCode(notReadyRequest);
            } catch (SetNotReadyReasonCodeException ex) {
                logger.warn("setAgentNotReady: SetNotReadyReasonCodeException: ", ex);
                throw new Exception("74", new Exception("Unable to set ReasonCode: " + ex.getLocalizedMessage()));
            } catch (Exception ex) {
                agentService = null;
                throw new Exception("74", ex);
            }
        }
    }

    /**
     *
     * @param agentLoginId
     * @return
     * @throws Exception
     */
    public static String isAgentReady(String agentLoginId) throws Exception {
        Agent agent = new Agent();
        agent.setAgentLoginId(agentLoginId);
        AgentRequest agentRequest = new AgentRequest();
        agentRequest.setSsoToken(getSsoToken());
        agentRequest.setAgent(agent);
        Terminal terminal = getVoiceTerminalFromAgentLoginId(agentLoginId);
        if (terminal == null) {
            throw new Exception("81", new Exception("Unable to resolve terminal for " + agentLoginId + ". Agent may be not logged in?"));
        }
        com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest terminalRequest = new com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest();
        terminalRequest.setSsoToken(getSsoToken());
        terminalRequest.setTerminal(terminal);
        try {
            boolean isReady = getAgentTerminalService().isReady(terminalRequest).isIsReady();
            if (isReady) {
                return getAgentTerminalService().getTerminalConnections(terminalRequest).getTerminalConnection().size() > 0 ? "Busy" : "Ready";
            }
            return "NotReady";
        } catch (IsReadyException ex) {
            throw new Exception("83", ex);
        } catch (Exception ex) {
            logger.error("isAgentReady: agentLoginId='{}'", agentLoginId);
            logger.error("SessionNotCreatedException: ", ex);
            agentTerminalService = null;
            throw ex;
        }
    }

    /**
     *
     * @param agentLoginId
     * @return NotReady ReasonCode
     * @throws Exception
     */
    public static String getAgentNotReadyReasonCode(String agentLoginId) throws Exception {
        Agent agent = new Agent();
        agent.setAgentLoginId(agentLoginId);
        AgentRequest agentRequest = new AgentRequest();
        agentRequest.setSsoToken(getSsoToken());
        agentRequest.setAgent(agent);
        try {
            return getAgentService().getNotReadyReasonCode(agentRequest).getResponse();
        } catch (GetNotReadyReasonCodeException ex) {
            throw new Exception("83", ex);
        } catch (Exception ex) {
            logger.error("getAgentNotReadyReasonCode: agentLoginId='{}'", agentLoginId);
            logger.error("SessionNotCreatedException: ", ex);
            agentService = null;
            throw ex;
        }
    }

    /**
     *
     * @param agentLoginId
     * @return TerminalNotReadyCode
     * @throws Exception
     */
    public static String getTerminalNotReadyCode(String agentLoginId) throws Exception {
        Agent agent = new Agent();
        agent.setAgentLoginId(agentLoginId);
        AgentRequest agentRequest = new AgentRequest();
        agentRequest.setSsoToken(getSsoToken());
        agentRequest.setAgent(agent);
        try {
            Terminal terminal = getVoiceTerminalFromAgentLoginId(agentLoginId);
            if (terminal == null) {
                throw new Exception("81", new Exception("Unable to resolve terminal for " + agentLoginId + ". Agent may be not logged in?"));
            }
            com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest terminalRequest = new com.nortel.soa.oi.cct.types.agentterminalservice.TerminalRequest();
            terminalRequest.setSsoToken(getSsoToken());
            terminalRequest.setTerminal(terminal);
            return getAgentTerminalService().getNotReadyReasonCode(terminalRequest).getNotReadyReasonCode();
        } catch (GetNotReadyReasonCodeException ex) {
            throw new Exception("83", ex);
        } catch (Exception ex) {
            logger.error("getTerminalNotReadyCode: agentLoginId='{}'", agentLoginId);
            logger.error("SessionNotCreatedException: ", ex);
            agentTerminalService = null;
            throw ex;
        }
    }

    /**
     *
     * @param agentLoginId
     * @return Terminal by agentLoginId
     */
    public static Terminal getVoiceTerminalFromAgentLoginId(String agentLoginId) {
        Agent agent = new Agent();
        agent.setAgentLoginId(agentLoginId);
        GetAgentTerminalsRequest agentTerminalsRequest = new GetAgentTerminalsRequest();
        agentTerminalsRequest.setAgent(agent);
        agentTerminalsRequest.setSsoToken(getSsoToken());
        try {
            List<Terminal> terminals = getSessionService().getAgentTerminals(agentTerminalsRequest).getTerminals();
//            if (terminals.isEmpty()) {
//                logger.warn("getVoiceTerminalFromAgentLoginId: getAgentTerminals for {} is EMPTY!", agentLoginId);
//                agentRequest = new AgentRequest();
//                agentRequest.setAgent(agent);
//                agentRequest.setSsoToken(getSsoToken());
//                if (getAgentService().isSupervisor(agentRequest).isResponse()) {
//                    logger.info("{} is Supervisor. Trying to get terminals using agentLoginId as terminal address;", agentLoginId);
//                    AddressRequest addressRequest = new AddressRequest();
//                    Address address = new Address();
//                    address.setAddressName(agentLoginId);
//                    addressRequest.setAddress(address);
//                    addressRequest.setSsoToken(getSsoToken());
//                    terminals = getAddressService().getTerminals(addressRequest).getTerminals();
//                }
//            }
            for (Terminal t : terminals) {
                if (t.getTerminalName().startsWith("Line")) {
                    return t;
                }
            }
            logger.warn("No voice terminals found for agent {}. Getting static voice termianl.", agentLoginId);
            AgentRequest agentRequest = new AgentRequest();
            agentRequest.setAgent(agent);
            agentRequest.setSsoToken(getSsoToken());
            if (getAgentService().isSupervisor(agentRequest).isResponse()) {
                return getAgentService().getStaticVoiceTerminal(agentRequest).getTerminal();
            }
        } catch (GetStaticVoiceTerminalException | GetAgentTerminalsException | IsSupervisorException ex) {
            logger.error("Error getVoiceTerminalFromAgentLoginId: ", ex);
        } catch (Exception ex) {
            sessionService = null;
            logger.error("Error getVoiceTerminalFromAgentLoginId: SessionNotCreatedException: ", ex);
        }
        Terminal terminal = new Terminal();
        terminal.setTerminalName("Not found in CCT");
        return terminal;
    }

    /**
     *
     * @param address
     * @return Terminal by Address
     */
    public static Terminal getVoiceTerminalByAddress(Address address) {
        try {
            AddressRequest addressRequest = new AddressRequest();
            addressRequest.setAddress(address);
            addressRequest.setSsoToken(getSsoToken());
            List<Terminal> termianls;
            termianls = getAddressService().getTerminals(addressRequest).getTerminals();
            for (Terminal t : termianls) {
                if (t.getTerminalName().startsWith("Line")) {
                    return t;
                }
            }
        } catch (GetTerminalsException ex) {
            logger.warn("GetTerminalsException: ", ex);
        } catch (Exception ex) {
            addressService = null;
            logger.error("SessionNotCreatedException: ", ex);
        }
        return null;
    }

    /**
     *
     * @return CurrentTerminalCount
     */
    public static int getCurrentTerminalCount() {
        SsoRequest ssoRequest = new SsoRequest();
        ssoRequest.setSsoToken(getSsoToken());
        try {
            return getSessionService().getCurrentTerminalCount(ssoRequest);
        } catch (GetCurrentTerminalCountException | SessionNotCreatedException ex) {
            return -1;
        }
    }

    /**
     *
     * @return CurrentAddressCount
     */
    public static int getCurrentAddressCount() {
        SsoRequest ssoRequest = new SsoRequest();
        ssoRequest.setSsoToken(getSsoToken());
        try {
            return getSessionService().getCurrentAddressCount(ssoRequest);
        } catch (GetCurrentAddressCountException | SessionNotCreatedException ex) {
            return -1;
        }
    }

    /**
     * @return {@link SessionService} Retrieves interface to be used by service
     * consumers
     */
    private static SessionService getSessionService() {
        if (sessionService == null) {
            sessionService = new SOAOICCT().getSessionService();
        }
        return sessionService;
    }

    /**
     * @return {@link AgentService} Retrieves interface to be used by
     * AgentService consumers
     */
    private static AgentService getAgentService() throws WebServiceException {
        if (agentService == null) {
            agentService = new SOAOICCTAgentService().getAgentService();
        }
        return agentService;
    }

    /**
     * @return {@link AgentTerminalService} Retrieves interface to be used by
     * AgentTerminalService consumers
     */
    public static AgentTerminalService getAgentTerminalService() {
        if (agentTerminalService == null) {
            agentTerminalService = new SOAOICCTAgentTerminalService().getAgentTerminalService();
        }
        return agentTerminalService;
    }

    /**
     * @return {@link AddressService} Retrieves interface to be used by
     * AddressService consumers
     */
    private static AddressService getAddressService() {
        if (addressService == null) {
            addressService = new SOAOICCTAddressService().getAddressService();
        }
        return addressService;
    }

    /**
     * @return {@link AgentTerminalConnectionService} Retrieves interface to be
     * used by AgentTerminalConnectionService consumers
     */
    private static AgentTerminalConnectionService getAgentTerminalConnectionService() {
        if (agentTerminalConnectionService == null) {
            agentTerminalConnectionService = new SOAOICCTAgentTerminalConnectionService().getAgentTerminalConnectionService();
        }
        return agentTerminalConnectionService;
    }

    /**
     * @return {@link ConnectionService} Retrieves interface to be used by
     * ConnectionService consumers
     */
    private static ConnectionService getConnectionService() {
        if (connectionService == null) {
            connectionService = new SOAOICCTConnectionService().getConnectionService();
        }
        return connectionService;
    }

    /**
     * @return {@link ContactService} Retrieves interface to be used by
     * ContactService consumers
     */
    public static ContactService getContactService() {
        if (contactService == null) {
            contactService = new SOAOICCTContactService().getContactService();
        }
        return contactService;
    }

    public static void onConnectionStateEvent(ConnectionStateEventType event) {
        IS.logger.info("Address: ");
        IS.logger.info(logObject(event.getAddress()));
        IS.logger.info("ContactId: " + event.getContact().getContactId());
        IS.logger.info("ConnectionId: " + event.getConnection().getConnectionId());
        IS.logger.info("PrevState: " + event.getPreviousState());
        IS.logger.info("NewState: " + event.getNewState());

        com.nortel.soa.oi.cct.types.contactservice.ContactRequest contactRequest = new com.nortel.soa.oi.cct.types.contactservice.ContactRequest();
        contactRequest.setContact(event.getContact());
        contactRequest.setSsoToken(getSsoToken());

        try {
            logger.info("ContactService OriginalDestinationAddress: ");
            logger.info(logObject(getContactService().getOriginalDestinationAddress(contactRequest)));
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to getOriginalDestinationAddress - " + ex.getMessage());
        }

        try {
            logger.info("ContactService CalledAddress: ");
            logger.info(logObject(getContactService().getCalledAddress(contactRequest)));
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to CalledAddress - " + ex.getMessage());
        }
        try {
            logger.info("ContactService CallingAddress: ");
            logger.info(logObject(getContactService().getCallingAddress(contactRequest)));
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to CallingAddress - " + ex.getMessage());
        }
        try {
            logger.info("ContactService CallingTerminal: ");
            logger.info(logObject(getContactService().getCallingTerminal(contactRequest)));
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to CallingTerminal - " + ex.getMessage());
        }
        try {
            logger.info("ContactService Capabilities: ");
            logger.info(logObject(getContactService().getCapabilities(contactRequest)));
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to Capabilities - " + ex.getMessage());
        }
        try {
            logger.info("ContactService Connections: ");
            logger.info(logObject(getContactService().getConnections(contactRequest)));
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to Connections - " + ex.getMessage());
        }
        try {
            logger.info("ContactService Connections: getConnectionService Address");
            for (Connection connection : getContactService().getConnections(contactRequest).getConnection()) {
                ConnectionRequest cr = new ConnectionRequest();
                cr.setConnection(connection);
                cr.setSsoToken(getSsoToken());
                logger.info(logObject(connection));
                logger.info("-----: ");
                logger.info(logObject(getConnectionService().getAddress(cr)));
            }
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to Connections - " + ex.getMessage());
        }


        try {
            logger.info("ContactService InstantMessages: ");
            logger.info(logObject(getContactService().getInstantMessages(contactRequest)));
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to InstantMessages - " + ex.getMessage());
        }
        try {
            logger.info("ContactService Intrinsics: ");
            List<Intrinsic> intrinsics = getContactService().getIntrinsics(contactRequest).getIntrinsic();
            String customerId = null;
            for (Intrinsic intrinsic : intrinsics) {
                if (intrinsic.getKey().equals("CUSTOMERID")) {
                    customerId = intrinsic.getValue();
                    continue;
                }
            }
            logger.info(logObject(getContactService().getIntrinsics(contactRequest)));
            if (customerId != null) {
                logger.info("customerId: {}, msisdnArray: {}", customerId, CacheCCMMconnection.getMsisdnArrayUrlPart(customerId));
            }
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to Intrinsics - " + ex.getMessage());
        }
        try {
            logger.info("ContactService LastRedirectedAddress: ");
            logger.info(logObject(getContactService().getLastRedirectedAddress(contactRequest)));
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to LastRedirectedAddress - " + ex.getMessage());
        }
        try {
            logger.info("ContactService UUI: ");
            logger.info(logObject(getContactService().getUUI(contactRequest)));
        } catch (Exception ex) {
            logger.info("!!!!!!!!!!!!!!!!!!!!WARNING: Filed to UUI - " + ex.getMessage());
        }
    }
}
