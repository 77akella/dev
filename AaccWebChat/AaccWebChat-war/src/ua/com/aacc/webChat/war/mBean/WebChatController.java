package ua.com.aacc.webChat.war.mBean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.aacc.webChat.aacc63.*;
import ua.com.aacc.webChat.ejb.WebChatConfigFacade;
import ua.com.aacc.webChat.ejb.WsCcmmFacade;
import ua.com.aacc.webChat.entity.WebChatConfig;
import ua.com.aacc.webChat.entity.enums.AuthTypeEnum;
import ua.com.aacc.webChat.entity.enums.GlobalConfigurationPropertyEnum;
import ua.com.aacc.webChat.entity.enums.SubjectTypeEnum;
import ua.com.aacc.webChat.war.mBean.util.JsfUtil;
import ua.com.aacc.webChat.war.mBean.util.UTF8Control;

import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Artem Murashov
 */
@ManagedBean(name = "webChatController")
@ViewScoped
public class WebChatController implements Serializable {
    //logger for all errors, etc.
    private static final Logger logger = LoggerFactory.getLogger(WebChatController.class);
    //logger for all customer actions. must include ip address
    private static final Logger logActions = LoggerFactory.getLogger("ActionsLogger");
    //logger for calculating timing (processing time, ws request timing)
    private static final Logger logTiming = LoggerFactory.getLogger("TimingLogger");
    private static final Logger logFatal = LoggerFactory.getLogger("FatalLogger");
    private static final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    //AACC CCMM WS EJB
    @EJB
    private WsCcmmFacade ccmmFacadeLocal;
    //EJB for getting webChat configuration
    @EJB
    private WebChatConfigFacade webChatConfigFacade;


    //// These variables used for initiating WC session
    private String sessionKey; //Session key for all actions through WS
    private long customerId; //Customer ID assigned after authorization
    private long contactId; //Contact ID (Web Chat interaction ID), assigns after Web Chat request

//    //This variable may hold all conversations
//    private String chatHistory = "";

    //// Variables for conversation and status
    private String customerMessage = ""; // Message, which will be sent to agent
    private String status; // Holds conversation status
    private boolean agentOnline; // is agent accepted contact, and session not ended
    private boolean chatStarted; // is chat started?
    private boolean sessionEnded; //is session ended
    private long timeDelta;      // Time delta between server time and AACC
    private long lastHistoryCheckTime; //
    private long lastHeartBeat;
    private String unreadMessages; //UnreadMessages, which will be sent to customer page for addition to chat history

    //// These variables must be set after init method
//    private String webChatId; // ID (UUID) which sent in request parameter 'id'
    private WebChatConfig current; // Current WebChatConfig, which found by webChatId
    private String ip; // customer's IP
    private String requestHeaders = ""; // HTTP Headers. They used in Custom Field 'headers'

    private boolean isCustomerTyping; // Flag for typing notification
    //// these vars set in request information or during aacc auth
    private String customerName = ""; // Customer Name
    private String customerPhone = ""; // Customer Phone
    private String customerMail = ""; //e-mail or login for AACC auth
    private String webChatSubject = ""; // WebChat Subject
    private String aaccAuthCustPassword; //Customer password for auth

    //Workflow - which page to display
    private WorkFlowEnum workFlowStatus = WorkFlowEnum.IN_LOGIN;

    //Variable for tracking aacc on hold messages (AACC have a bug)
    private Set<CICOnHoldMessages> displayedOnHoldMessages = new HashSet<>();
    private int contactClosedStatusCount;
    //Period in seconds to refresh chat history
    private int chatHistoryRefreshPeriod=0;


    /**
     * Creates a new instance of WebChatController
     */
    public WebChatController() {
    }

    /**
     * This method called on every http request,
     * before rendering view and requesting needed
     * JSF parameters.
     * Initially we extract all needed information
     * and initialize variables
     */
    public void init() {
//        if(current!=null){
//            logger.info("init: current is not null: {}",current);
//            disconnectOnPageCloseEvent();
//        }
        try {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            //Check for first request (building bean)
            if (!facesContext.isPostback()) {
                long startTime=System.currentTimeMillis();
                // getting value of 'id' GET parameter
                String webChatId = facesContext.getApplication().evaluateExpressionGet(facesContext, "#{param.id}", String.class);
//                setWebChatId(bId);
                HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
                // setting customer ip address
                ip = request.getRemoteAddr();
//                logger.warn("IP is {}", ip);
//                if (ip == null) {
//                    return;
//                }
                // This header created for every request in HTML iframe tag
                String referer = request.getHeader("referer");
                logActions.info("Initializing new web chat: referer is {}, IP: {}", referer, ip);
                current = webChatConfigFacade.find(webChatId);
                contactClosedStatusCount=0;
                // if webChatConfig not found or disabled, send 404 error and invalidate session
                if (current == null || current.isDisabled()) {
                    logActions.warn("WebChatConfig not found. Invalidating session. Requested id: {}. IP: {}", webChatId, ip);
                    facesContext.getExternalContext().responseSendError(404, "URL incomplete or invalid");
                    facesContext.responseComplete();
                    try {
                        sessionEnded = true;
                        return;
                    } finally {
//                        invalidateSession();
                    }
                }
                //Verifying referer parameter to check that request has came from business customer web site
                if (referer != null && referer.startsWith("http://wwww.")) {
                    referer = "http://" + referer.substring(12);
                } else if (referer != null && referer.startsWith("https://wwww.")) {
                    referer = "https://" + referer.substring(13);
                }
                if (referer == null || !referer.startsWith(current.getDomain())) {
                    logActions.warn("Referer '{}' is empty or not match configured ({}). Invalidating session. Requested id: {}. IP: {}", referer, current.getDomain(), webChatId, ip);
                    try {
                        facesContext.getExternalContext().responseSendError(403, "Forbidden");
                        facesContext.responseComplete();
                    } catch (IOException e) {
                    }
                    try {
                        sessionEnded = true;
                        return;
                    } finally {
//                        invalidateSession();
                    }
                }
                //Collecting headers for custom field of web chat contact
                Enumeration<String> headerNames = request.getHeaderNames();
                while (headerNames.hasMoreElements()) {
                    String header = headerNames.nextElement();
                    requestHeaders += header + ": " + request.getHeader(header) + "\n";
                }
                logger.info("HTTP headers are {}",requestHeaders);
                ////Performing navigation based on webChatConfig
                //Check working hours
                try{
                    setLastMessageCheckTime(ccmmFacadeLocal.getServerTime());
                    if (current.getWorkTimeRange() != null && !current.getWorkTimeRange().isWorkingTime(getAaccTime())) {
                        logActions.info("Initializing new web chat: not working time. Configured {} IP: {}",current.getWorkTimeRange(), ip);
                        workFlowStatus = WorkFlowEnum.NOT_WORK_TIME;
                        try {
                            sessionEnded = true;
                            createSessionAndCloseWithReasonCode(GlobalConfigurationPropertyEnum.NotWorkTime);
                            return;
                        } finally {
//                            invalidateSession();
                        }
                    }
                }catch (Throwable e){
                    logger.error("Can't check working hours",e);
                    throw e;
                }
                //Checking skillset in service
                try {
                    if (current.isSkillsetNotInServiceCheck() && !ccmmFacadeLocal.isSkillsetInService(current.getSkillset())) {
                        logActions.info("Initializing new web chat: Skillset not in service ({}). IP: {}", current.getSkillset(), ip);
                        workFlowStatus = WorkFlowEnum.SKILLSET_NOT_IN_SERVICE;
                        try {
                            sessionEnded = true;
                            createSessionAndCloseWithReasonCode(GlobalConfigurationPropertyEnum.SkillsetNotInService);
                            return;
                        } finally {
//                            invalidateSession();
                        }
                    }
                } catch (Throwable e) {
                    logger.warn("Can't check is skillset '{}' in service", current.getSkillset(), e);
                    throw e;
                }
                //Performing navigation
                if (current.getAuthType() == AuthTypeEnum.NO_AUTH) {
                    if (current.isShowRequestInformation()) {
                        workFlowStatus = WorkFlowEnum.IN_INFORMATION_REQUEST_NO_AUTH;
                    } else {
                        //In this case will be rendered another page, which will call startChat by Ajax
                        workFlowStatus = WorkFlowEnum.IN_ANON_CHAT_AUTOSTART;
//                        startAnonymousChat();
                    }
                } else {
                    workFlowStatus = WorkFlowEnum.IN_LOGIN;
                }
//                setMessageOnSessionStartDiv();
                logTiming.info("init: Processing time: {}",System.currentTimeMillis()-startTime);
            }
        } catch (Throwable e) {
            logger.error("Error in init", e);
            logFatal.error("init():",e);
            workFlowStatus=WorkFlowEnum.ERROR;
        }
    }

//    /**
//     * Invalidating session to save resources
//     */
//    private void invalidateSession() {
//        logger.info("Invalidating session for ip: '{}'", ip);
//        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
//    }

    public int getChatHistoryRefreshPeriod(){
        if(chatHistoryRefreshPeriod == 0){
            chatHistoryRefreshPeriod= ccmmFacadeLocal.getChatRefreshPeriod();
        }
        return chatHistoryRefreshPeriod;
    }

    /**
     * Translates strings using bundles.
     * This method used by JSF also.
     *
     * @param text - key to translate
     * @return - Translated text
     */
    public String translate(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }
        if (text.trim().contains(" ")) {
            return text;
        }
        try {
            if (getCurrent() != null) {
                return ResourceBundle.getBundle("/" + current.getLang(), new UTF8Control()).getString(text);
            } else {
                return ResourceBundle.getBundle("/RUS", new UTF8Control()).getString(text);
            }
        } catch (Exception e) {
//            if (!toTranslate.contains(text + "=")) {
//                toTranslate.add(text + "=");
//            }
            logger.warn("Unable to find translation in bundle {} for text {}",current.getLang(),text);
            return text;
        }
    }

    //Getters and setters. Note, that some fields doesn't have setters

    public boolean isSessionEnded() {
        return sessionEnded;
    }

    public WebChatConfig getCurrent() {
        return current;
    }

    public String getStatus() {
        return status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        logActions.info("Setting customer name '{}'. IP: {}",customerName, ip);
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        logActions.info("Setting customer phone '{}'. IP: {}",customerPhone, ip);
        this.customerPhone = customerPhone;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        logActions.info("Setting customer email '{}'. IP: {}",customerMail, ip);
        this.customerMail = customerMail;
    }

    public String getWebChatSubject() {
        return webChatSubject;
    }

    public void setWebChatSubject(String webChatSubject) {
        logActions.info("Setting web chat subject '{}'. IP: {}",webChatSubject, ip);
        this.webChatSubject = webChatSubject;
    }

    public String getAaccAuthCustPassword() {
        return aaccAuthCustPassword;
    }

    public void setAaccAuthCustPassword(String aaccAuthCustPassword) {
        logActions.info("Setting customer password. IP: {}", ip);
        this.aaccAuthCustPassword = aaccAuthCustPassword;
    }

    public String getCustomerMessage() {
        return customerMessage;
    }

    public void setCustomerMessage(String customerMessage) {
//        logActions.info("Setting customer message to send '{}'. IP: {}",customerMessage, ip);
        this.customerMessage = customerMessage;
    }

    public boolean isChatStarted() {
        return chatStarted;
    }

    public boolean isAgentOnline() {
        return agentOnline;
    }

    /**
     * Get last messages check time.
     * We hold timeDelta - time difference
     * between server and AACC to calculate AACC time.
     *
     * @return DateTime in AACC time
     */
    private CIDateTime getLastMessageCheckTime() {
        return new CIDateTime(lastHistoryCheckTime + timeDelta);
    }

    /**
     * Set last messages check time.
     * We hold timeDelta - time difference
     * between server and AACC to calculate AACC time.
     *
     * @param lastMessageCheckTime - last message check in AACC time
     */
    private void setLastMessageCheckTime(CIDateTime lastMessageCheckTime) {
        lastHistoryCheckTime = System.currentTimeMillis();
        timeDelta = lastMessageCheckTime.getMilliseconds() - lastHistoryCheckTime;
    }

    private long getAaccTime(){
        return System.currentTimeMillis()+timeDelta;
    }

    /**
     * This method used in web.xml to set style theme.
     * @return - name of style theme (primefaces)
     */
    public String getStyleTheme() {
        if (current == null || current.getStyleTheme() == null || current.getStyleTheme().isEmpty()) {
            return "bootstrap";
        } else {
            return current.getStyleTheme();
        }
    }

    //Workflow for rendering methods.
    public boolean isWorkflowInChat() {
        return workFlowStatus.equals(WorkFlowEnum.IN_CHAT);
    }

    public boolean isWorkflowInAnonChatAutoStart() {
        return workFlowStatus.equals(WorkFlowEnum.IN_ANON_CHAT_AUTOSTART);
    }

    public boolean isWorkflowAaccAuthInRegister() {
        return workFlowStatus.equals(WorkFlowEnum.IN_REGISTER);
    }

    public boolean isWorkflowAaccAuthInPasswordRemainder() {
        return workFlowStatus.equals(WorkFlowEnum.IN_PASSWORD_REMINDER);
    }

    public boolean isWorkflowAaccAuthInLogin() {
        return workFlowStatus.equals(WorkFlowEnum.IN_LOGIN);
    }

    public boolean isWorkflowAaccAuthInInformationRequest() {
        return workFlowStatus.equals(WorkFlowEnum.IN_INFORMATION_REQUEST_AACC_AUTH);
    }

    public boolean isWorkflowNoAuthInInformationRequest() {
        return workFlowStatus.equals(WorkFlowEnum.IN_INFORMATION_REQUEST_NO_AUTH);
    }

    public boolean isWorkflowNotWorkTime() {
        return workFlowStatus.equals(WorkFlowEnum.NOT_WORK_TIME);
    }

    public boolean isWorkflowSkillsetNotInService() {
        return workFlowStatus.equals(WorkFlowEnum.SKILLSET_NOT_IN_SERVICE);
    }

    public boolean isWorkflowError(){
        return workFlowStatus.equals(WorkFlowEnum.ERROR);
    }

    /**
     * This method called when customer writes a message.
     * During history update,
     */
    public void onCustomerWrite() {
        isCustomerTyping = true;
    }

    //These methods are used to render list or textarea for subject
    public boolean isSubjectUserInput() {
        return current.getSubjectType() == SubjectTypeEnum.USER_INPUT;
    }

    public boolean isSubjectFromList() {
        return current.getSubjectType() == SubjectTypeEnum.FROM_LIST;// && current.getSubjectsList().size() > 1;
    }

    //These methods used for navigation from web page
    public void goToLogin() {
        logActions.info("Performing navigation: goToLogin. {}. IP: {}",current, ip);
        workFlowStatus = WorkFlowEnum.IN_LOGIN;
    }

    public void prepareRegister() {
        logActions.info("Performing navigation: prepareRegister. {}. IP: {}",current, ip);
        workFlowStatus = WorkFlowEnum.IN_REGISTER;
    }

    public void preparePasswordReminder() {
        logActions.info("Performing navigation: preparePasswordReminder. {}. IP: {}",current, ip);
        workFlowStatus = WorkFlowEnum.IN_PASSWORD_REMINDER;
    }

    /**
     * Remind password for specific customerEmail (username)
     */
    public void remindPassword() {
        long startTime=System.currentTimeMillis();
        logActions.info("Performing action: remindPassword.  customerMail: '{}'. IP: {}",customerMail, ip);
        try {
            ccmmFacadeLocal.sendPasswordReminder(customerMail, current.getEmailSkillSet());
            JsfUtil.addSuccessMessage("aaccAuth_password_has_sent_to_email");
            workFlowStatus = WorkFlowEnum.IN_LOGIN;
        } catch (Exception e) {
            logger.error("remindPassword failed: ", e);
            if(e.getCause().getMessage().startsWith("No Customer exists with the Email Address")){
                JsfUtil.addSuccessMessage(translate("error_remindPassword_error_wrong_email"));
            }else{
                logFatal.error("remindPassword():",e);
                JsfUtil.addSuccessMessage(translate("error_remindPassword_error"));
            }

        }
        logTiming.info("remindPassword: Processing time: {}",System.currentTimeMillis()-startTime);
    }

    /**
     * This method register anonymous customer
     * and get's anonymous session key.
     */
    private void registerAnonymous() {
        long startTime=System.currentTimeMillis();
        status = translate("status_registerAnonymous");
        logActions.info("Performing action: registerAnonymous. IP: {}", ip);
        try {
            AnonymousLoginResult anonymousSessionKey = ccmmFacadeLocal.getAnonymousSessionKey();
            logger.info("registerAnonymous: anonymousSessionKey sessionKey '{}', AnonymousID is '{}'", anonymousSessionKey.getSessionKey(), anonymousSessionKey.getAnonymousID());
            sessionKey = anonymousSessionKey.getSessionKey();

            customerId = ccmmFacadeLocal.getAnonymousCustomerID(anonymousSessionKey, customerMail, customerPhone);
            logger.info("registerAnonymous: getAnonymousCustomerID returned '{}'", customerId);
            if (customerName != null && !customerName.trim().isEmpty()) {
                ccmmFacadeLocal.updateFirstName(customerId, customerName.trim(), sessionKey);
            } else {
                customerName = current.getCustomerDefaultLabel();
            }
            // For some unknown reason, customerPhone not set to aacc contact. So we attempt to add it.
            // Exception may be thrown if this number already assigned
            try {
                if (customerPhone != null && !customerPhone.isEmpty()) {
                    CIPhoneNumberWriteType phoneNumberWriteType = new CIPhoneNumberWriteType();
                    phoneNumberWriteType.setDefaultPhoneNumber(true);
                    phoneNumberWriteType.setDefaultPhoneNumberSpecified(true);
                    phoneNumberWriteType.setNumber(customerPhone);
                    phoneNumberWriteType.setPhoneNumberType(CIPhoneNumberType.Unspecified);
                    ccmmFacadeLocal.addPhoneNumber(customerId, phoneNumberWriteType, sessionKey);
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
            logger.error("registerAnonymous Failed: ", e);
            logFatal.error("registerAnonymous():",e);
            status=translate("status_registerAnonymous_error");
        }
        logTiming.debug("registerAnonymous: Processing time: {}", System.currentTimeMillis() - startTime);
    }

    /**
     * This method must be called ~ every 30 seconds
     * to indicate that customer is online.
     */
    private void heartBeat() {
        long startTime=System.currentTimeMillis();
        if (lastHeartBeat > System.currentTimeMillis() - 30000) return;
        if (!agentOnline) return;
        try {
            // This page is reloaded every 30 seconds. It acts as a heartbeat to determine if
            // the session is still active i.e. provide notification to the customer if the
            // agent has left the session etc. It does this by updating a timer held in the database,
            // (which is checked by the agent desktop for the same purpose) and retrieving the last time
            // the agent updated their timer. It then gets the time difference (from the server time).
            // This method is independant of timezone and Daylight Savings Time - if our customer and agent
            // are in different timezones, this method will still work as the time the agent last updated
            // their timer and the server timer are both returned as the number of milliseconds since
            // Jan 1, 1970 UTC. All times are taken from the CCMM server, clock discrepencies with the
            // webserver will not impact the application.

            ccmmFacadeLocal.updateAliveTime(contactId, sessionKey);
            lastHeartBeat = System.currentTimeMillis();
        } catch (Exception e) {
            if (agentOnline) {
                status = translate("status_session_ended");
                chatStarted = false;
                agentOnline = false;
            }
        }
        logTiming.debug("heartBeat: Processing time: {}", System.currentTimeMillis() - startTime);
    }

    /**
     * Register new AACC customer with AACC auth.
     * If possible, set phone number and NAme
     */
    public void registerCustomer() {
        logActions.info("Performing action: registerCustomer.  customerMail: '{}', customerName: '{}', customerPhone: '{}'. IP: {}",customerMail,customerName,customerPhone, ip);
        long startTime=System.currentTimeMillis();
        try {
            CICustomerWriteType ciCustomerWriteType = new CICustomerWriteType();
            ciCustomerWriteType.setUsername(customerMail);
            ciCustomerWriteType.setPassword(aaccAuthCustPassword);
            if (customerName != null && !customerName.isEmpty()) {
                ciCustomerWriteType.setFirstName(customerName);
            }
            CIPhoneNumberWriteType ciPhoneNumberWriteType = new CIPhoneNumberWriteType();
            ciPhoneNumberWriteType.setPhoneNumberType(CIPhoneNumberType.Unspecified);
            try {
                if (customerPhone != null && !customerPhone.isEmpty()) {
                    CIPhoneNumberWriteType phoneNumberWriteType = new CIPhoneNumberWriteType();
                    phoneNumberWriteType.setDefaultPhoneNumber(true);
                    phoneNumberWriteType.setDefaultPhoneNumberSpecified(true);
                    phoneNumberWriteType.setNumber(customerPhone);
                    phoneNumberWriteType.setPhoneNumberType(CIPhoneNumberType.Unspecified);
                    phoneNumberWriteType.setPhoneNumberType(CIPhoneNumberType.Unspecified);
                    ccmmFacadeLocal.addPhoneNumber(customerId, phoneNumberWriteType, sessionKey);
                }
            } catch (Exception e) {
            }
            CIAddressWriteType ciAddressWriteType = new CIAddressWriteType();
            CIEmailAddressWriteType ciEmailAddressWriteType = new CIEmailAddressWriteType();
            ciEmailAddressWriteType.setEmailAddress(customerMail);
            customerId = ccmmFacadeLocal.registerNewCustomer(ciCustomerWriteType, ciPhoneNumberWriteType, ciAddressWriteType, ciEmailAddressWriteType);
            logger.info("After registerNewCustomer customerId is {}. Logging in customer", customerId);
            loginToAacc();
        } catch (Exception e) {
            workFlowStatus = WorkFlowEnum.IN_REGISTER;
            if(e.getCause().getMessage().startsWith("Customer Username is already in use")){
                JsfUtil.addSuccessMessage(translate("status_registerCustomer_username_in_use"));
            }else{
                logger.error("Can't registerCustomer:", e);
                logFatal.error("registerCustomer():",e);
                JsfUtil.addSuccessMessage(translate("status_registerCustomer_error"));
            }
        }
        logTiming.info("registerCustomer: Processing time: {}",System.currentTimeMillis()-startTime);
    }

    /**
     * Login to AACC for AACC auth.
     */
    public void loginToAacc() {
        long startTime=System.currentTimeMillis();
        logActions.info("Performing action: loginToAacc.  customerMail: '{}'. IP: {}",customerMail, ip);
        try {
            //Trying to logoff if prev login session has not being ended properly
            ccmmFacadeLocal.customerLogoff(customerMail);
        } catch (Exception e) {
        }
        try {
            // Logging in user
            sessionKey = ccmmFacadeLocal.customerLogin(customerMail, aaccAuthCustPassword);
            logger.info("sessionKey is {}", sessionKey);
            onSuccessfulLoginAaccAuth();
        } catch (Exception e) {
            logger.error("Cannot login to AACC: {}", e.getMessage());
            if (e.getCause().getMessage().startsWith("Invalid Customer Login Details for")) {
                JsfUtil.addSuccessMessage(translate("error_invalid_username_or_password"));
                logActions.warn("Warning. Invalid Customer Login Details, customerMail: '{}'. IP: {}", customerMail, ip);
                workFlowStatus = WorkFlowEnum.IN_LOGIN;
            } else if (e.getCause().getMessage().startsWith("Customer Already Logged In")) {
                AnonymousLoginResult anonymousSessionKey = ccmmFacadeLocal.getAnonymousSessionKey();
                logger.info("loginToAacc: anonymousSessionKey sessionKey '{}', AnonymousID is '{}'", anonymousSessionKey.getSessionKey(), anonymousSessionKey.getAnonymousID());
                sessionKey = anonymousSessionKey.getSessionKey();
                customerId = ccmmFacadeLocal.getAnonymousCustomerID(anonymousSessionKey, customerMail, customerPhone);
                logger.info("registerAnonymous: getAnonymousCustomerID returned '{}'", customerId);
                onSuccessfulLoginAaccAuth();
            } else {
                JsfUtil.addSuccessMessage(translate("error_login_failed"));
                workFlowStatus = WorkFlowEnum.IN_LOGIN;
            }
        }
        logTiming.info("loginToAACC: Processing time: {}",System.currentTimeMillis()-startTime);
    }

    /**
     * Performing some actions if login successful
     */
    private void onSuccessfulLoginAaccAuth() {
        // performing navigation
        if (!current.isShowRequestInformation()) {
            startAaccAuthChat();
            workFlowStatus = WorkFlowEnum.IN_CHAT;
        } else if (!current.getSubjectType().equals(SubjectTypeEnum.HIDDEN)) {
            workFlowStatus = WorkFlowEnum.IN_INFORMATION_REQUEST_AACC_AUTH;
        } else {
            startAaccAuthChat();
            workFlowStatus = WorkFlowEnum.IN_CHAT;
        }
    }

    /**
     * Disconnecting session, logging off user, etc.
     */
    public void disconnectSession() {
        long startTime=System.currentTimeMillis();
        logActions.info("Performing action: disconnectSession.  customerMail: '{}'. IP: {}",customerMail, ip);
        logger.info("Disconnecting session on user request");
        try {
            checkContactStatus();
        } catch (Throwable e) {
        }
        if (agentOnline) {
            try {
                logger.info("Agent is online. Disconnecting session");
                ccmmFacadeLocal.writeChatMessage(contactId, "Сессия окончена пользователем", "", CIChatMessageType.Session_Disconnected_by_Customer, sessionKey);
            } catch (Throwable e) {
                logger.info("agentOnline err:", e);
            }
        }

        if (!agentOnline && chatStarted) {
            try {
                logger.info("Agent is not online, but contact is being queued. Disconnecting session");
                ccmmFacadeLocal.abandonQueuingWCContact(contactId, "Cancel_by_customer_request", 0, false, sessionKey);
            } catch (Throwable e) {
                logger.info("contact is being queued abandon err:", e);
            }
        }

        if (current.getAuthType() == AuthTypeEnum.AACC_AUTH && customerMail != null && !customerMail.trim().isEmpty()) {
            try {
                ccmmFacadeLocal.customerLogoff(customerMail);
                logger.info("Successfuly logged out from aacc!");
            } catch (Exception e) {
                logger.error("Failed to logoff: {}", e.getMessage());
            }
        }
////        String endMessage = "<h1>" + current.getMessageOnSessionEnd() + "</h1>";
////        if (!chatHistory.endsWith(endMessage)) {
//        unreadMessages = "<h1>" + current.getMessageOnSessionEnd() + "</h1>";
////            chatHistory += unreadMessages;
////        }
        setMessageOnSessionEndDiv();
        chatStarted = false;
        agentOnline = false;
        sessionEnded = true;
        status = translate("status_session_ended");
        logTiming.info("disconnectSession: Processing time: {}",System.currentTimeMillis()-startTime);
    }

    /**
     * before destroying bean, attempt to disconnect session.
     */
    @PreDestroy
    private void preDestroy(){
        if(ip!=null) {
            logger.info("preDestroy called. IP: {}",ip);
        }
    }


    public void disconnectOnPageCloseEvent() {
        logger.info("disconnectOnPageCloseEvent called. Disconnecting session");
        try {
            disconnectSession();
        } catch (Throwable e) {
        }
    }

    private void createSessionAndCloseWithReasonCode(GlobalConfigurationPropertyEnum reasonCode) {
        long startTime=System.currentTimeMillis();
        ccmmFacadeLocal.createSessionAndCloseWithReasonCode(reasonCode, current.getSkillset(), requestHeaders, webChatSubject);
        logTiming.debug("createSessionAndCloseWithReasonCode: Processing time: {}", System.currentTimeMillis() - startTime);
    }

    /**
     * Start chat. Uses in AACC auth and no auth
     */
    private void startChat() {
        long startTime=System.currentTimeMillis();
        logActions.info("Performing action: starting chat. customerName: '{}',customerMail '{}', customerPhone '{}', webChatSubject ''. IP: {}",
                customerName, customerMail, customerPhone, webChatSubject, ip);
        status = translate("status_startChat");
        try {
            logger.info("Starting web chat with: customerName: '{}',customerMail '{}', customerPhone '{}', webChatSubject ''",
                    customerName, customerMail, customerPhone, webChatSubject);
//            setLastMessageCheckTime(ccmmFacadeLocal.getServerTime());
            CISkillsetReadType skillsetByName = ccmmFacadeLocal.getSkillsetByName(current.getSkillset(), sessionKey);
            //check if skillset in service
            if (!ccmmFacadeLocal.isSkillsetInService(skillsetByName.getId(), sessionKey)) {
                logger.info("startChat: Skillset is not in service. Redirecting to skillset is not in service page.");
                workFlowStatus = WorkFlowEnum.SKILLSET_NOT_IN_SERVICE;
                createSessionAndCloseWithReasonCode(GlobalConfigurationPropertyEnum.SkillsetNotInService);
                return;
            }
            if(current.getSubjectType()!=null && current.getSubjectType().equals(SubjectTypeEnum.FROM_LIST)&&current.getSubjectsList().size()==1){

                webChatSubject=current.getSubjectsList().get(0);
            }

            CICustomFieldWriteType[] customFieldWriteTypes = {new CICustomFieldWriteType("headers", requestHeaders, true)};
            CIContactWriteType writeContact = new CIContactWriteType();
            writeContact.setSkillsetID(skillsetByName.getId());
            writeContact.setPriority(CIContactPriority.fromValue(current.getPriority().toString()));
            writeContact.setSubject(webChatSubject);
            writeContact.setCustomFields(customFieldWriteTypes);
            contactId = ccmmFacadeLocal.requestTextChat(customerId, writeContact, false, sessionKey);
            chatStarted = true;
            workFlowStatus=WorkFlowEnum.IN_CHAT;
            setMessageOnSessionStartDiv();
            logger.warn("requestTextChat returned contactId '{}'", contactId);
        } catch (Exception e) {
            logger.error("startChat Failed: ", e);
            JsfUtil.addSuccessMessage(translate("status_startChat_error"));
            workFlowStatus=WorkFlowEnum.IN_CHAT;
            status=translate("status_startChat_error");
            logFatal.error("startChat():",e);
        }
        logTiming.debug("startChat: Processing time: {}", System.currentTimeMillis() - startTime);
    }

    /**
     * Start Anonymous chat.
     * Register customer and start chat.
     */
    public void startAnonymousChat() {
        long startTime=System.currentTimeMillis();
        logActions.info("Performing action: starting anonymous chat for {}, IP: {}", current, ip);
        registerAnonymous();
        startChat();
        logTiming.info("startAnonymousChat: Processing time: {}", System.currentTimeMillis() - startTime);
    }

    /**
     * Start AACC auth chat. If customerID is not set, read it.
     * Also assign customerName if possible.
     */
    public void startAaccAuthChat() {
        long startTime=System.currentTimeMillis();
        logActions.info("Performing action: starting AACC auth chat for {}, customerMail: '{}' IP: {}", current, customerMail, ip);
        if (customerId == 0L) {
            logger.info("customerId is 0 !!! will try to get by ccmmFacadeLocal.getCustomerByUsername");
            CICustomerReadType customerByUsername = ccmmFacadeLocal.getCustomerByUsername(customerMail, sessionKey);
            customerId = customerByUsername.getId();
            logger.info("customerId NOW is {}", customerId);
            if (customerByUsername.getFirstName() != null && !customerByUsername.getFirstName().trim().isEmpty()) {
                customerName = customerByUsername.getFirstName();
            } else {
                customerName = current.getCustomerDefaultLabel();
            }
        } else {
            // reading customer to set it's name if possible
            try {
                CICustomerReadType customerByUsername = ccmmFacadeLocal.readCustomer(customerId, sessionKey);
                if (customerByUsername.getFirstName() != null && !customerByUsername.getFirstName().trim().isEmpty()) {
                    customerName = customerByUsername.getFirstName();
                } else {
                    customerName = current.getCustomerDefaultLabel();
                }
            } catch (Throwable e) {
                customerName = current.getCustomerDefaultLabel();
            }
        }
        workFlowStatus = WorkFlowEnum.IN_CHAT;
        startChat();
        logTiming.info("startAaccAuthChat: Processing time: {}", System.currentTimeMillis() - startTime);
    }

    /**
     * Send customer message
     */
    public void sendCustomerMessage() {
        long startTime=System.currentTimeMillis();
        customerMessage=customerMessage.trim();
        logActions.info("Performing action: sendCustomerMessage '{}', IP: {}", customerMessage, ip);
        try {
            logger.info("Customer sent message... '{}'", customerMessage);
            String message = customerMessage;
            if (message == null || message.trim().isEmpty()) {
                return;
            }
            if (!agentOnline) {
                checkContactStatus();
                return;
            }
            //customerName must be set during registration or login
            message = "[" + customerName + "]" + " " + message;
            message = message.replaceAll("<", "< ");
            // We must write the correct message type with the text.
            ccmmFacadeLocal.writeChatMessage(contactId, message, "", CIChatMessageType.Chat_Message_from_Customer, sessionKey);
        } catch (Throwable e) {
            logger.error("Failed to sendCustomerMessage", e);
            status=translate("status_error");
        } finally {
            customerMessage = null;
        }
        logTiming.info("sendCustomerMessage: Processing time: {}",System.currentTimeMillis()-startTime);
    }


    /**
     * Get new messages, including customer's messages
     *
     * @return unread messages, formatted for view
     */
    public String getUnreadMessages() {
        long startTime=System.currentTimeMillis();
        logActions.info("Getting: UnreadMessages for '{}', IP: {}", current, ip);
        if (sessionEnded) {
            if(unreadMessages!=null&&!unreadMessages.isEmpty()){
                try{
                    logger.info(" sessionEnded returning unreadMessages '{}'",unreadMessages);
                    return unreadMessages;
                }finally {
                    unreadMessages=null;
                }
            }
            return "";
        }
        try {
            // this part returns first message and last message
            if(unreadMessages!=null&&!unreadMessages.isEmpty()){
                try{
                    logger.info("returning unreadMessages '{}'",unreadMessages);
                    return unreadMessages;
                }finally {
                    unreadMessages=null;
                }
            }
            if (!agentOnline) {
                logger.info("Agent not online yet. Checking status and getting onHold messages");
                checkContactStatus();
                getOnHoldMessages();
                return "";
            }
            if (contactId != 0L) {
                logger.info("Agent is online. Doing heartbeat and updating messages");
                unreadMessages = updateMessages();
                heartBeat();
            }
            return unreadMessages;
        } catch (Exception e) {
            logger.error("Exception in updateMessages or heartBeat: ", e);
            status=translate("status_error");
            return null;
        } finally {
            unreadMessages = "";
            logTiming.info("getUnreadMessages: Processing time: {}",System.currentTimeMillis()-startTime);
        }
    }

    /**
     * Checking contact status, while contact is routing, etc.
     */
    private void checkContactStatus() {
        long startTime=System.currentTimeMillis();
        logActions.info("Performing action: checkContactStatus for '{}', IP: {}", current, ip);
        if (sessionKey == null || sessionKey.isEmpty() || contactId == 0) {
            agentOnline = false;
            chatStarted = false;
            return;
        }
        CIContactReadType theContact = ccmmFacadeLocal.readContact(contactId, sessionKey);
        logger.info("checkContactStatus: contact status is {}",theContact.getStatus());
        if (theContact.getStatus().equals(CIContactStatus.Open)) {
            agentOnline = true;
            chatStarted = true;
            sessionEnded=false;
        } else {
            agentOnline = false;
            if (theContact.getStatus().equals(CIContactStatus.Closed)) {
                contactClosedStatusCount++;
                if(contactClosedStatusCount>2){
                    sessionEnded = true;
                    chatStarted=false;
                }
                status = translate("status_session_ended");
                setMessageOnSessionEndDiv();
            } else {
                chatStarted = true;
            }
        }
        logTiming.debug("checkContactStatus: Processing time: {}", System.currentTimeMillis() - startTime);
    }

    /**
     * Getting onHold messages, while agent not answered.
     * ShowedMessages must not being showed.
     */
    private void getOnHoldMessages() {
        long startTime=System.currentTimeMillis();
        logActions.info("Performing action: getOnHoldMessages for '{}', IP: {}", current, ip);
        try {
            CIMultipleOnHoldMessages contactOnHoldMessages = ccmmFacadeLocal.getContactOnHoldMessages(contactId, sessionKey);
            if (contactOnHoldMessages != null) {
                CICOnHoldMessages[] arrayOfOnHoldMessages = contactOnHoldMessages.getListOfOnHoldMessages();
                if (arrayOfOnHoldMessages != null) {
                    Set<CICOnHoldMessages> listOfOnHoldMessages = new HashSet<>(Arrays.asList(arrayOfOnHoldMessages));
                    listOfOnHoldMessages.removeAll(displayedOnHoldMessages);
                    displayedOnHoldMessages.addAll(listOfOnHoldMessages);
                    for (CICOnHoldMessages msg : listOfOnHoldMessages) {
                        logger.info("ContactOnHoldMessage: '{}'", msg.getMessage());
                        unreadMessages += "<div class='msg_onHoldMessage'>" + formatDateDiv(getAaccTime()) + formatMessageAndAuthorDiv(msg.getMessage()) + "</div>";
                    }
                } else {
                    logger.info("listOfOnHoldMessages is null!");
                }
            } else {
                logger.info("ContactOnHoldMessages is null");
            }
        } catch (Exception e) {
            logger.error("getOnHoldMessages error: ", e);
            logFatal.error("getOnHoldMessages():",e);
        }
        logTiming.debug("getOnHoldMessages: Processing time: {}", System.currentTimeMillis() - startTime);
    }

    private String formatDateDiv(long millis){
        java.util.Date date = new java.util.Date(millis);
        return  "<div class='msg_time'>" + dateFormat.format(date) + "</div>";
    }

    private void setMessageOnSessionStartDiv(){
        try{
            if(current.getMessageOnSessionStart()!=null && !current.getMessageOnSessionStart().trim().isEmpty()){
                String dateDiv=formatDateDiv(getAaccTime());
                String lastMessageDiv=formatMessageAndAuthorDiv(current.getMessageOnSessionStart());
                unreadMessages = "<div class='ui-datatable-even msg_onSessionStart'>" + dateDiv + lastMessageDiv + "</div>";
            }
        }catch (Throwable e){
            logger.error("Can't set first message (On session Start)",e);
        }
    }

    private void setMessageOnSessionEndDiv(){
        try{
            if(current.getMessageOnSessionEnd()!=null && !current.getMessageOnSessionEnd().trim().isEmpty()){
                String dateDiv=formatDateDiv(getAaccTime());
                String lastMessageDiv=formatMessageAndAuthorDiv(current.getMessageOnSessionEnd());
                unreadMessages = "<div class='ui-datatable-even msg_onSessionEnd'>" + dateDiv + lastMessageDiv + "</div>";
            }
        }catch (Throwable e){
            logger.error("Can't set last message (On session End)",e);
        }
    }

    private String updateMessages() {
        long startTime=System.currentTimeMillis();
        logActions.info("Performing action: updateMessages for '{}', IP: {}", current, ip);
        if (!agentOnline) return "";

        try {
            String allMessages = "";
            long lastHistoryCheckTimeTemp = System.currentTimeMillis();
            CIMultipleChatMessageReadType chatMessages = ccmmFacadeLocal.readChatMessage(contactId, getLastMessageCheckTime(), isCustomerTyping, sessionKey);
            isCustomerTyping = false;
            lastHistoryCheckTime = lastHistoryCheckTimeTemp;
            if (chatMessages.isIsWriting()) {
                status = translate("status_agent_writes_message");
            } else {
                status = translate("status_agent_is_online");
            }
            CIChatMessageReadType[] arrayOfMessages = chatMessages.getListOfChatMessages();
            if (arrayOfMessages != null) {
                int length = arrayOfMessages.length;
                CIChatMessageType lastPageActionType;
                String message;
                for (int i = 0; i < length; i++) {
                    message = arrayOfMessages[i].getChatMessage();
                    String lastMessageDiv = formatMessageAndAuthorDiv(message);
                    lastPageActionType = arrayOfMessages[i].getChatMessageType();
                    String dateDiv = formatDateDiv(arrayOfMessages[i].getWriteTime().getMilliseconds());
//                    if (lastPageActionType == CIChatMessageType.Page_Pushed_by_Customer) {
//                        allMessages = allMessages + "<div class='msg_pagePushedByCustomer'>" + dateDiv + lastMessageDiv + "</div>";
//                    } else if (lastPageActionType == CIChatMessageType.Page_Pushed_by_Agent) {
//                        allMessages = allMessages + "<div class='msg_pagePushedByAgent'>" + dateDiv + lastMessageDiv + "</div>";
//                    } else if (lastPageActionType == CIChatMessageType.Form_Shared_by_Customer) {
//                        allMessages = allMessages + "<div class='msg_formSharedByCustomer'>" + dateDiv + lastMessageDiv + "</div>";
//                    } else if (lastPageActionType == CIChatMessageType.Form_Shared_by_Agent) {
//                        allMessages = allMessages + "<div class='msg_formSharedByAgent'>" + dateDiv + lastMessageDiv + "</div>";
//                    } else if (lastPageActionType == CIChatMessageType.Page_Previewed_by_Customer) {
//                        allMessages = allMessages + "<div class='msg_pagePreviewedByCustomer'>" + dateDiv + lastMessageDiv + "</div>";
//                    } else
                    if (lastPageActionType == CIChatMessageType.Chat_Message_from_Customer) {
                        // the message from the customer will have html tags invalidated so that they render rather than are intrepreted
                        allMessages = allMessages + "<div class='ui-datatable-odd msg_chatMessageByCustomer'>" + dateDiv + lastMessageDiv + "</div>";
                    } else if (lastPageActionType == CIChatMessageType.Chat_Message_from_Agent) {
                        // the message from the agent will have html tags invalidated so that they render rather than are intrepreted
                        allMessages = allMessages + "<div class='ui-datatable-even msg_chatMessageByAgent'>" + dateDiv + lastMessageDiv + "</div>"; ////////////.replaceAll("<", "< ")
//                    } else if (lastPageActionType == CIChatMessageType.CallMe_Request_from_Customer) {
//                        allMessages = allMessages + "<div class='msg_callBackRequestByCustomer'>" + dateDiv + lastMessageDiv + "</div>";
                    } else if (lastPageActionType == CIChatMessageType.Comfort_Message) {
                        allMessages = allMessages + "<div class='ui-datatable-even msg_comfortMessage'>" + dateDiv + lastMessageDiv + "</div>";
                    } else {
                        allMessages = allMessages + "<div class='ui-datatable-even msg_otherMessage'>" + dateDiv + lastMessageDiv + "</div>";
                    }
                    // for last message set last message check time
                    if (i == (length - 1)){
                        setLastMessageCheckTime(arrayOfMessages[i].getWriteTime());
                    }
                }
                // we now escape all characters
                allMessages = allMessages.replaceAll("\"", "&quot;");
            }
            return allMessages;
        } catch (Exception e) {
            if (agentOnline) {
                checkContactStatus();
                return unreadMessages;
            } else {
                logger.error("Failed to update messages", e);
            }
            agentOnline = false;
            sessionEnded = true;
            chatStarted=false;
            return unreadMessages;
        }finally {
            logTiming.debug("updateMessages: Processing time: {}", System.currentTimeMillis() - startTime);
        }
    }

    private String formatMessageAndAuthorDiv(String message) {
        String author = null;
        if (message.startsWith("[")) {
            int lastIndex = message.indexOf("]") ;//- 1

            if (lastIndex > 0) {
                author = message.substring(1, lastIndex).trim();
                message = message.substring(lastIndex + 2).trim();
            }
        }

        if (author == null) {
            return "<div class='msg_text'>" + message.replaceAll("<", "< ").replaceAll("\n", "<br />") + "</div>";
        } else {
            return "<div class='msg_author'>" + author + "</div><div class='msg_text'>" + message.replaceAll("<", "< ").replaceAll("\n", "<br />") + "</div>";
        }
    }

//    public void ping(){
//        logActions.info("Doing ping. IP: {}",ip);
//    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////


//    protected void setWebChatId(String webChatId) {
//        if (this.webChatId != null)
//            return;
//        this.webChatId = webChatId;
//    }

    public String getWorFlowStatus() {
        return workFlowStatus.name();
    }


//    public String getAaccAuthCustEmail() {
//        return aaccAuthCustEmail;
//    }
//
//    public void setAaccAuthCustEmail(String aaccAuthCustEmail) {
//        this.aaccAuthCustEmail = aaccAuthCustEmail;
//    }


//    public String getChatHistory() {
//        try {
//            getOnHoldMessages();
//            if (!agentOnline && chatStarted) {
//                logger.info("Agent not online yet. Checking status");
//                checkContactStatus();
//                return chatHistory;
//            }
//            if (contactId != 0L) {
//                logger.info("Agent is online. Doing heartbeat and updating messages");
//                unreadMessages = updateMessages();
//                chatHistory += unreadMessages;
//                heartBeat();
//            }
//        } catch (Exception e) {
//            logger.error("Exception in updateMessages or heartBeat: ", e);
//        }
//        return chatHistory;
//    }


}
