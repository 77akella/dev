package ua.com.AACC.is.callback;

import com.nortel.soa.oi.cct.basenotification.ConnectionStateEventType;
import com.nortel.soa.oi.cct.contactservice.GetCallingAddressException;
import com.nortel.soa.oi.cct.contactservice.GetOriginalDestinationAddressException;
import com.nortel.soa.oi.cct.contactservice.SessionNotCreatedException;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.AddressType;
import com.nortel.soa.oi.cct.types.ConnectionState;
import com.nortel.soa.oi.cct.types.SsoToken;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jetty.util.ConcurrentHashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.AACC.is.db.DBserver;
import ua.com.AACC.is.run.IS;
import ua.com.aacc.wc.AaccCallbackFacade;

public class CallbackController implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(CallbackController.class);
    private static final Logger loggerTiming = LoggerFactory.getLogger("Timing");
    private static Map<String, CallbackConfig> cdnConfigMap = new ConcurrentHashMap<>();
    private static final Set<CallRecordEntery> callRecords = new ConcurrentHashSet<>();
    private static AaccCallbackFacade callbackFacade = null;
    private static String aaccHostName = null;
//    private static AtomicInteger callRecordsCount = new AtomicInteger(0);

    private static class CallRecordEntery {

        private String cdn;
        private String ani;
        private long time;
        private ConnectionStateEventType event;
        private int registerAttempts;

        public CallRecordEntery() {
            this.registerAttempts = 0;
            this.time = System.currentTimeMillis();
        }

        public CallRecordEntery(String cdn, String ani, ConnectionStateEventType event) {
            this.registerAttempts = 0;
            this.time = System.currentTimeMillis();
            this.cdn = cdn;
            this.ani = ani;
            this.event = event;
        }

        public String getCdn() {
            return cdn;
        }

        public String getAni() {
            return ani;
        }

        public long getTime() {
            return time;
        }

        public ConnectionStateEventType getEvent() {
            return event;
        }

        public int getRegisterAttempts() {
            return registerAttempts;
        }

        public void incRegisterAttempts() {
            registerAttempts++;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 97 * hash + Objects.hashCode(this.cdn);
            hash = 97 * hash + Objects.hashCode(this.ani);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final CallRecordEntery other = (CallRecordEntery) obj;
            if (!Objects.equals(this.cdn, other.getCdn())) {
                return false;
            }
            if (!Objects.equals(this.ani, other.getAni())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "CallRecordEntery{" + "cdn=" + cdn + ", ani=" + ani + ", time=" + time + ", event=" + event + ", registerAttempts=" + registerAttempts + '}';
        }
    }

    /**
     *
     * <NotificationEventHolderType> eventType = CONNECTION_STATE |
     * addressPropertyEvent = Object = NULL | terminalPropertyEvent = Object =
     * NULL | contactPropertyEvent = Object = NULL | agentPropertyEvent = Object
     * = NULL | connectionStateEvent = <ConnectionStateEventType> address =
     * <Address> addressName = (String) '445859930' | | addressType =
     * OUT_OF_PROVIDER | provider = <Provider> providerName = (String) 'Passive'
     * | | </Provider> | status = Object = NULL | </Address> | connection =
     * <Connection> connectionId = (String)
     * 'adf53558-5ade-422a-95e2-60005d3dcdbe' | | </Connection> | contact =
     * <Contact> contactId = (String) '4f765ead-8433-4118-9f4b-941654b51345' | |
     * externalContactId = (String) '13741' | | provider = <Provider>
     * providerName = (String) 'Passive' | | </Provider> | contactTypes =
     * <ContactTypeArray> item = <ArrayList> {{{[ <ContactType> type = (String)
     * 'Voice' | | </ContactType>]}}} | </ContactTypeArray> | </Contact> |
     * connectionCapabilities = <ConnectionCapabilities> canAccept = (Boolean)
     * 'false' | | canAlert = (Boolean) 'false' | | canDisconnect = (Boolean)
     * 'true' | | canPark = (Boolean) 'false' | | canRedirect = (Boolean)
     * 'false' | | canReject = (Boolean) 'false' | | </ConnectionCapabilities> |
     * isRemote = (Boolean) 'true' | | newState = ESTABLISHED | previousState =
     * IDLE | reason = DEFAULT | sendingAddress = <Address> addressName =
     * (String) '445859930' | | addressType = OUT_OF_PROVIDER | provider =
     * <Provider> providerName = (String) 'Passive' | | </Provider> | status =
     * Object = NULL | </Address> | </ConnectionStateEventType> |
     * terminalConnectionStateEvent = Object = NULL | addressStateEvent = Object
     * = NULL | terminalStateEvent = Object = NULL | agentStateEvent = Object =
     * NULL | serviceProviderStatusEvent = Object = NULL | forceDisconnectEvent
     * = Object = NULL | defaultTreatmentEvent = Object = NULL | systemEvent =
     * Object = NULL | </NotificationEventHolderType>
     *
     * @param event
     * @param ssoToken
     * @return true if call is added
     * @throws GetOriginalDestinationAddressException
     * @throws SessionNotCreatedException
     */
    public static boolean addCall(ConnectionStateEventType event, SsoToken ssoToken, long startTime) throws GetOriginalDestinationAddressException, SessionNotCreatedException {
        if (!event.getNewState().equals(ConnectionState.ESTABLISHED) || !event.getPreviousState().equals(ConnectionState.IDLE) || !event.getAddress().getAddressType().equals(AddressType.OUT_OF_PROVIDER)) {
            logger.warn("Invalid object wanted to add to calls table. Ignoring. \n {}", IS.logObject(event));
            return false;
        }

        if (logger.isDebugEnabled()) {
            logger.debug("addCall with event \n {}", IS.logObject(event));
        }
        com.nortel.soa.oi.cct.types.contactservice.ContactRequest contactRequest = new com.nortel.soa.oi.cct.types.contactservice.ContactRequest();
        contactRequest.setContact(event.getContact());
        contactRequest.setSsoToken(ssoToken);
        long cctReqStartTime = System.currentTimeMillis();
        String cdn = IS.getContactService().getOriginalDestinationAddress(contactRequest).getAddress().getAddressName();
        long cctReqTime = System.currentTimeMillis() - cctReqStartTime;
        String ani = event.getAddress().getAddressName();
        if (!cdnConfigMap.containsKey(cdn)) {
            logger.info("addCall: CDN is {}, ANI={} This call is not related to CDNs in config. Ignoring.", cdn, ani);
            return false;
        }
        CallRecordEntery callRecordEntery = new CallRecordEntery(cdn, ani, event);
        if (callRecords.contains(callRecordEntery)) {
            logger.warn("callRecords already contains {}. Rewriting this entery", callRecordEntery);
            callRecords.remove(callRecordEntery);
            callRecords.add(callRecordEntery);
            return true;
        }
//        callRecordsCount.incrementAndGet();
        loggerTiming.info("addCall: PricessingTime={},\t time spent for CCT req: {} \t ANI='{}', CDN='{}'",
                (System.currentTimeMillis() - startTime - cctReqTime), cctReqTime, ani, cdn);
        return callRecords.add(callRecordEntery);
    }

    public static boolean removeCall(ConnectionStateEventType event, SsoToken ssoToken, long startTime) throws GetOriginalDestinationAddressException, SessionNotCreatedException, SessionNotCreatedException, GetCallingAddressException {
        com.nortel.soa.oi.cct.types.contactservice.ContactRequest contactRequest = new com.nortel.soa.oi.cct.types.contactservice.ContactRequest();
        contactRequest.setContact(event.getContact());
        contactRequest.setSsoToken(ssoToken);

        if (logger.isDebugEnabled()) {
            logger.debug("removeCall with event \n {}", IS.logObject(event));
        }

        long cctReqStartTime = System.currentTimeMillis();
        String cdn = IS.getContactService().getOriginalDestinationAddress(contactRequest).getAddress().getAddressName();
        long cctReqTime = System.currentTimeMillis() - cctReqStartTime;
        if (!cdnConfigMap.containsKey(cdn)) {
            logger.info("removeCall: This call is not related to CDNs in config. Ignoring.");
            return false;
        }
        cctReqStartTime = System.currentTimeMillis();
        Address callingAddr = IS.getContactService().getCallingAddress(contactRequest).getAddress();
        cctReqTime += System.currentTimeMillis() - cctReqStartTime;
        if (callingAddr.getAddressType() != AddressType.OUT_OF_PROVIDER) {
            logger.warn("removeCall: Attemtipng to remove call with callingAddr.getAddressType() != AddressType.OUT_OF_PROVIDER");
            return false;
        }
        String ani = callingAddr.getAddressName();
//        callRecordsCount.decrementAndGet();
        loggerTiming.info("removeCall: PricessingTime={},\t time spent for CCT req: {} \t ANI='{}', CDN='{}'",
                (System.currentTimeMillis() - startTime - cctReqTime), cctReqTime, ani, cdn);
        return callRecords.remove(new CallRecordEntery(cdn, ani, event));
    }

    public static void reloadCdnConfigs() throws Exception {
        cdnConfigMap = DBserver.loadCallbackConfig();
        logger.info("Callback Configs successfuly reloaded: {}", cdnConfigMap);
    }

    public static AaccCallbackFacade getCallbackFacade() {
        if (callbackFacade == null) {
            callbackFacade = new AaccCallbackFacade();
        }
        return callbackFacade;
    }

    private static String getAaccHostName() {
        if (aaccHostName == null) {
            String aaccHostNameProp = System.getProperty("cctServiceHostAndPort", "ccc-aacc-mgt").trim();
            if (aaccHostNameProp.contains(":")) {
                aaccHostNameProp = aaccHostNameProp.split(":")[0];
            }
            CallbackController.aaccHostName = aaccHostNameProp;
        }
        return aaccHostName;
    }

    @Override
    public void run() {
        logger.warn("Starting callback Scheduler");
        try {
            reloadCdnConfigs();
        } catch (Exception e) {
            logger.error("Error loading CDN configs");
        }

        while (true) {
            long startTime = System.currentTimeMillis();
            int registeredCallbacks = 0;
            int processedRecords = 0;
            logger.info("Starting analyzing callRecords.");
            Iterator<CallRecordEntery> iter = callRecords.iterator();
            while (iter.hasNext()) {
                processedRecords++;
                CallRecordEntery call = iter.next();
                String cdn = call.getCdn();
                CallbackConfig config = cdnConfigMap.get(cdn);

                if (config == null) {
                    logger.warn("Failed to find config for {} with CDN. Removing", call, cdn);
//                    callRecordsCount.decrementAndGet();
                    callRecords.remove(call);
                    continue;
                }

                if (call.getTime() < (System.currentTimeMillis() - config.getMaxWaitTime() * 1000)) {
                    call.incRegisterAttempts();
                    try {
                        if (call.getRegisterAttempts() < 100) {
                            logger.info("Registering callback for {}", call);
                            getCallbackFacade().requestAnonymousCallback(getAaccHostName(), config.getPhonePrefix() + call.getAni(), config.getObSkillset(), "3", config.getSubject(), config.getText());
                            registeredCallbacks++;
                            logger.info("Successfuly registered callback for {} with {}", call, config);
                        } else {
                            logger.warn("RegisterAttempts for {} is more than 100. Removing it");
                        }
                        callRecords.remove(call);
//                        callRecordsCount.decrementAndGet();
                        logger.debug("{} removed from map successfuly", call);

                    } catch (Exception e) {
                        logger.error("Failed to register callback for {} with {}", call, config);
                        logger.error("Failed to register callback", e);
                    }
                }

            }
            logger.warn("Processed callRecords {}, Registered {} contacts in {} ms", processedRecords, registeredCallbacks, (System.currentTimeMillis() - startTime));
            try {
                logger.info("Sleepeng for 60 seconds");
                Thread.sleep(60 * 1000);
            } catch (InterruptedException e) {
                logger.error("Exception in Thread.sleep", e);
            }
        }
    }

    public static int getCallRecordsCount() {
        return callRecords.size();
    }
}
