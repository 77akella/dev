package ua.com.aacc.webChat.ejb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.aacc.webChat.aacc63.*;
import ua.com.aacc.webChat.entity.enums.GlobalConfigurationPropertyEnum;

import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * @author Artem Murashov
 */
@Stateless
@LocalBean
public class WsCcmmFacade implements // WsCcmmFacadeRemote, WsCcmmFacadeLocal,
        CIWebCommsWsSoap, CIUtilityWsSoap, CISkillsetWsSoap, CIPhoneNumberWsSoap, CIEmailAddressWsSoap, CICustomerWsSoap, CICustomFieldWsSoap, CIContactWsSoap, CIAddressWsSoap, CIActionWsSoap {

    @EJB
    private GlobalConfigurationSingletonFacade configurationFacade;
    private static final Logger logger = LoggerFactory.getLogger(WsCcmmFacade.class);
    private CIWebCommsWsSoap webCommsWs;
    private CIUtilityWsSoap utilityWs;
    private CISkillsetWsSoap skillsetWs;
    private CIPhoneNumberWsSoap phoneNumberWs;
    private CIEmailAddressWsSoap emailAddressWs;
    private CICustomerWsSoap customerWs;
    private CICustomFieldWsSoap customFieldWs;
    private CIContactWsSoap contactWs;
    private CIAddressWsSoap addressWs;
    private CIActionWsSoap actionWs;

    private AnonymousLoginResult sessionKey;

    public String getCcmmHostName() {
        return configurationFacade.getAaccHostName();
    }

    public Integer getChatRefreshPeriod() {
        try{
            return Integer.valueOf(configurationFacade.getRefreshPeriod());
        }catch (Throwable e){
            return 3;
        }

    }

    private AnonymousLoginResult getAnonymousLoginResult(){
        if(sessionKey==null){
            sessionKey=getAnonymousSessionKey();
        }
        return sessionKey;
    }

    public boolean isSkillsetInService(String skillset){
        // get skillset by name
        CISkillsetReadType skillsetByName = getSkillsetByName(skillset, getAnonymousLoginResult().getSessionKey());
        //check if skillset in service
        return isSkillsetInService(skillsetByName.getId(), getAnonymousLoginResult().getSessionKey());
    }

    @Asynchronous
    public void createSessionAndCloseWithReasonCode(GlobalConfigurationPropertyEnum reasonCode, String skillSet,String requestHeaders, String webChatSubject) {
        try {
            CISkillsetReadType skillsetByName = getSkillsetByName(skillSet, getAnonymousLoginResult().getSessionKey());
            CICustomFieldWriteType[] customFieldWriteTypes = {new CICustomFieldWriteType("headers", requestHeaders, true)};
            CIContactWriteType writeContact = new CIContactWriteType();
            writeContact.setSkillsetID(skillsetByName.getId());
            writeContact.setPriority(CIContactPriority.Priority_6_Lowest);
            writeContact.setSubject(webChatSubject);
            writeContact.setCustomFields(customFieldWriteTypes);
            long customerId=getAnonymousCustomerID(getAnonymousLoginResult(),"","");
            long contactId = requestTextChat(customerId, writeContact, false, getAnonymousLoginResult().getSessionKey());
            try {
//                CIClosedRCReadType[] closedReasonCodes = getAllClosedReasonCodes(getAnonymousLoginResult().getSessionKey()).getListOfClosedReasonCodes();
//                int length=closedReasonCodes.length;
//                logger.info("closedReasonCodes count is {}",length);
//                for(int i=0; i< length;i++){
//                    logger.info("Exist reasonCode '{}' with value '{}'",closedReasonCodes[i].getName(),closedReasonCodes[i].getNumericValue());
//                }
//                logger.info("Disconnecting session with reason code '{}'", reasonCode);
//                long closedReasonCodeId=getClosedReasonCodeByName(reasonCode, getAnonymousLoginResult().getSessionKey()).getNumericValue();
                long closedReasonCodeId=Long.valueOf(configurationFacade.getProperty(reasonCode));
                closeContact(contactId, reasonCode.toString(), closedReasonCodeId, true, getAnonymousLoginResult().getSessionKey());

            } catch (Throwable e) {
                logger.info("Can't Close contact with reasonCode '{}'. Will close contact without reasonCode. Message:", reasonCode,e.getMessage());
                closeContact(contactId, reasonCode.toString(), 0, false, getAnonymousLoginResult().getSessionKey());
            }
        } catch (Throwable e) {
            logger.error("Error during createSessionAndCloseWithReasonCode");
        }
    }

    private CIWebCommsWsSoap getWebCommsWs() {
        if (webCommsWs == null) {
            try {
                URL ciWebCommsWsUrl = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CIWebCommsWs.asmx");
                CIWebCommsWs webCommsWsLocator = new CIWebCommsWsLocator();
                webCommsWs = webCommsWsLocator.getCIWebCommsWsSoap(ciWebCommsWsUrl);
            } catch (Exception e) {
                logger.error("Failed to initialize webCommsWs:", e);
            }
        }
        return webCommsWs;
    }

    private CIUtilityWsSoap getUtilityWs() {
        if (utilityWs == null) {
            try {
                URL ciWebCommsWsUrl = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CIUtilityWs.asmx");
                CIUtilityWs webCommsWsLocator = new CIUtilityWsLocator();
                utilityWs = webCommsWsLocator.getCIUtilityWsSoap(ciWebCommsWsUrl);
            } catch (Exception e) {
                logger.error("Failed to initialize utilityWs:", e);
            }
        }
        return utilityWs;
    }

    private CISkillsetWsSoap getSkillsetWs() {
        if (skillsetWs == null) {
            try {
                URL url = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CISkillsetWs.asmx");

                CISkillsetWs cISkillsetWs = new CISkillsetWsLocator();

                skillsetWs = cISkillsetWs.getCISkillsetWsSoap(url);
            } catch (Exception e) {
                logger.error("Failed to initialize skillsetWs:", e);
            }
        }
        return skillsetWs;
    }

    private CIPhoneNumberWsSoap getPhoneNumberWs() {
        if (phoneNumberWs == null) {
            try {
                URL url = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CIPhoneNumberWs.asmx");
                CIPhoneNumberWs cISkillsetWs = new CIPhoneNumberWsLocator();
                phoneNumberWs = cISkillsetWs.getCIPhoneNumberWsSoap(url);
            } catch (Exception e) {
                logger.error("Failed to initialize CIPhoneNumberWs:", e);
            }
        }
        return phoneNumberWs;
    }

    private CIEmailAddressWsSoap getEmailAddressWs() {
        if (emailAddressWs == null) {
            try {
                URL url = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CIEmailAddressWs.asmx");
                CIEmailAddressWs cISkillsetWs = new CIEmailAddressWsLocator();
                emailAddressWs = cISkillsetWs.getCIEmailAddressWsSoap(url);
            } catch (Exception e) {
                logger.error("Failed to initialize CIEmailAddressWs:", e);
            }
        }
        return emailAddressWs;
    }

    private CICustomerWsSoap getCustomerWs() {
        if (customerWs == null) {
            try {
                URL url = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CICustomerWs.asmx");
                CICustomerWs cICustomerWs = new CICustomerWsLocator();
                customerWs = cICustomerWs.getCICustomerWsSoap(url);
            } catch (Exception e) {
                logger.error("Failed to initialize customerWs:", e);
            }
        }
        return customerWs;
    }

    private CICustomFieldWsSoap getCustomFieldWs() {
        if (customFieldWs == null) {
            try {
                URL url = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CICustomFieldWs.asmx");
                CICustomFieldWs cICustomFieldWs = new CICustomFieldWsLocator();
                customFieldWs = cICustomFieldWs.getCICustomFieldWsSoap(url);
            } catch (Exception e) {
                logger.error("Failed to initialize CICustomFieldWs:", e);
            }
        }
        return customFieldWs;
    }

    private CIContactWsSoap getContactWs() {
        if (contactWs == null) {
            try {
                URL url = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CIContactWs.asmx");
                CIContactWs cIContactWs = new CIContactWsLocator();
                contactWs = cIContactWs.getCIContactWsSoap(url);
            } catch (Exception e) {
                logger.error("Failed to initialize CIContactWs:", e);
            }
        }
        return contactWs;
    }

    private CIAddressWsSoap getAddressWs() {
        if (addressWs == null) {
            try {
                URL url = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CIAddressWs.asmx");
                CIAddressWs cIAddressWs = new CIAddressWsLocator();
                addressWs = cIAddressWs.getCIAddressWsSoap(url);
            } catch (Exception e) {
                logger.error("Failed to initialize CIAddressWs:", e);
            }
        }
        return addressWs;
    }

    private CIActionWsSoap getActionWs() {
        if (actionWs == null) {
            try {
                URL url = new URL("http://" + getCcmmHostName() + "/ccmmwebservices/CIActionWs.asmx");
                CIActionWs cIActionWs = new CIActionWsLocator();
                actionWs = cIActionWs.getCIActionWsSoap(url);
            } catch (Exception e) {
                logger.error("Failed to initialize CIAddressWs:", e);
            }
        }
        return actionWs;
    }

    @Override
    public long createWebCommsSession(long contactId, String sessionKey) {
        try {
            return getWebCommsWs().createWebCommsSession(contactId, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long writeChatMessage(long contactID, String message, String hiddenMessage, CIChatMessageType chatMessageType, String sessionKey) {
        try {
            return getWebCommsWs().writeChatMessage(contactID, message, hiddenMessage, chatMessageType, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleChatMessageReadType readChatMessage(long contactID, CIDateTime lastReadTime, boolean isWriting, String sessionKey) {
        try {
            return getWebCommsWs().readChatMessage(contactID, lastReadTime, isWriting, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long requestChatHistory(long contactID, String email, String sessionKey) {
        try {
            return getWebCommsWs().requestChatHistory(contactID, email, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleOnHoldURLReadType getWebOnHoldURLs(String tagName, String sessionKey) {
        try{
            return getWebCommsWs().getWebOnHoldURLs(tagName, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIDateTime updateAliveTime(long contactID, String sessionKey) {
        try {
            return getWebCommsWs().updateAliveTime(contactID, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIDateTime updateAliveTimeAndUpdateIsTyping(long contactID, String sessionKey, boolean isTyping) {
        try {
            return getWebCommsWs().updateAliveTimeAndUpdateIsTyping(contactID, sessionKey, isTyping);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long abandonQueuingWebCommsContact(long contactID, String closureComment, String sessionKey) {
        try {
            return getWebCommsWs().abandonQueuingWebCommsContact(contactID, closureComment, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long abandonQueuingWCContact(long contactID, String closureComment, long closedReasonCodeValue, boolean closedReasonCodeSpecified, String sessionKey) {
        try {
            return getWebCommsWs().abandonQueuingWCContact(contactID, closureComment, closedReasonCodeValue, closedReasonCodeSpecified, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getCustomerTextChatLabel(String sessionKey) {
        try {
            return getWebCommsWs().getCustomerTextChatLabel(sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CICustomerChatNameReadType getCustomerTextChatName(long contactID, String sessionKey) {
        try {
            return getWebCommsWs().getCustomerTextChatName(contactID, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getTrunkAccessCode(String string) {
        try {
            return getWebCommsWs().getTrunkAccessCode(string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleOnHoldMessages getContactOnHoldMessages(long l, String string) {
        try {
            return getWebCommsWs().getContactOnHoldMessages(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public String customerLogin(String string, String string1) {
        try {
            return getUtilityWs().customerLogin(string, string1);
        } catch (Exception e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public AnonymousLoginResult getAnonymousSessionKey() {
        try {
            return getUtilityWs().getAnonymousSessionKey();
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long getAnonymousCustomerID(AnonymousLoginResult loginResult, String emailAddress, String phoneNumber) {
        try {
            return getUtilityWs().getAnonymousCustomerID(loginResult, emailAddress, phoneNumber);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long getAndUpdateAnonymousCustomerID(AnonymousLoginResult loginResult, String emailAddress, String phoneNumber, CICustomerReadType thisCustomer) {
        try {
            return getUtilityWs().getAndUpdateAnonymousCustomerID(loginResult, emailAddress, phoneNumber, thisCustomer);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public String extendedCustomerLogin(String string, String string1) {
        try {
            return getUtilityWs().extendedCustomerLogin(string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long customerLogoff(String string) {
        try {
            return getUtilityWs().customerLogoff(string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long customerEndSession(String username, String sessionKey) {
        try {
            return getUtilityWs().customerEndSession(username, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long customerLogoffByContactID(String username, long contactId, String sessionKey) {
        try {
            return getUtilityWs().customerLogoffByContactID(username, contactId, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public String administratorLogin(String string, String string1) {
        try {
            return getUtilityWs().administratorLogin(string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long administratorLogoff(String string) {
        try {
            return getUtilityWs().administratorLogoff(string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isContactCentreClosed(String string) {
        try {
            return getUtilityWs().isContactCentreClosed(string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIDateTime getServerTime() {
        try {
            return getUtilityWs().getServerTime();
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIDateTime getServerUTCTime(String sessionKey) {
        try {
            return getUtilityWs().getServerUTCTime(sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIDateTime getServerRAWTime(String sessionKey) {
        try {
            return getUtilityWs().getServerRAWTime(sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long timeStampToMilliseconds(CITimeStamp cits) {
        try {
            return getUtilityWs().timeStampToMilliseconds(cits);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CITimeStamp millisecondsToTimeStamp(long l, int i) {
        try {
            return getUtilityWs().millisecondsToTimeStamp(l, i);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long getTotalQueued(String sessionKey) {
        try {
            return getUtilityWs().getTotalQueued(sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }

    }

    @Override
    public long getTotalQueuedToSkillset(String sessionKey, long skillsetID) {
        try {
            return getUtilityWs().getTotalQueuedToSkillset(sessionKey, skillsetID);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleSkillsetsReadType getAllSkillsets(String string) {
        try {
            return getSkillsetWs().getAllSkillsets(string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleSkillsetsReadType getAllWebSkillsets(String string) {
        try {
            return getSkillsetWs().getAllWebSkillsets(string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleSkillsetsReadType getAllOutboundSkillsets(String string) {
        try {
            return getSkillsetWs().getAllOutboundSkillsets(string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleSkillsetsReadType getAllEmailSkillsets(String string) {
        try {
            return getSkillsetWs().getAllEmailSkillsets(string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CISkillsetReadType getSkillsetByID(long l, String string) {
        try {
            return getSkillsetWs().getSkillsetByID(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CISkillsetReadType getSkillsetByName(String string, String string1) {
        try {
            return getSkillsetWs().getSkillsetByName(string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CISkillsetReadType readSkillsetByName(String skillsetName, String sessionKey) {
        try {
            return getSkillsetWs().readSkillsetByName(skillsetName, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isSkillsetInService(long l, String string) {
        try {
            return getSkillsetWs().isSkillsetInService(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIPhoneNumberReadType readPhoneNumber(long l, String string) {
        try {
            return getPhoneNumberWs().readPhoneNumber(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updatePhoneNumber(long l, CIPhoneNumberWriteType cipnwt, String string) {
        try {
            return getPhoneNumberWs().updatePhoneNumber(l, cipnwt, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateAreaCode(long l, String string, String string1) {
        try {
            return getPhoneNumberWs().updateAreaCode(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateInternationalCode(long l, String string, String string1) {
        try {
            return getPhoneNumberWs().updateInternationalCode(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateNumber(long l, String string, String string1) {
        try {
            return getPhoneNumberWs().updateNumber(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateDefault(long l, boolean bln, String string) {
        try {
            return getPhoneNumberWs().updateDefault(l, bln, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIEmailAddressReadType readEmailAddress(long l, String string) {
        try {
            return getEmailAddressWs().readEmailAddress(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateEmailAddress(long l, CIEmailAddressWriteType cieawt, String string) {
        try {
            return getEmailAddressWs().updateEmailAddress(l, cieawt, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long registerNewCustomer(CICustomerWriteType cicwt, CIPhoneNumberWriteType cipnwt, CIAddressWriteType ciawt, CIEmailAddressWriteType cieawt) {
        try {
            return getCustomerWs().registerNewCustomer(cicwt, cipnwt, ciawt, cieawt);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long registerAnonymousCustomer(CICustomerWriteType cicwt, CIPhoneNumberWriteType cipnwt) {
        try {
            return getCustomerWs().registerAnonymousCustomer(cicwt, cipnwt);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long requestTextChat(long custId, CIContactWriteType contact, boolean createAsClosed, String sessionKey) {
        try {
            return getCustomerWs().requestTextChat(custId, contact, createAsClosed, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long requestScheduledCallback(long custId, CIContactWriteType contact, String sessionKey) {
        try {
            return getCustomerWs().requestScheduledCallback(custId, contact, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long requestScheduledCallbackUTC(long custID, CIContactWriteType newContact, String sessionKey) {
        try {
            return getCustomerWs().requestScheduledCallbackUTC(custID, newContact, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long requestImmediateCallback(long custId, CIContactWriteType contact, String sessionKey) {
        try {
            return getCustomerWs().requestImmediateCallback(custId, contact, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long sendPasswordReminder(String string, String string1) {
        try {
            return getCustomerWs().sendPasswordReminder(string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }

    }

    @Override
    public CIContactBlockReadType readFirstBlockOfContacts(long l, long l1, String string) {
        try {
            return getCustomerWs().readFirstBlockOfContacts(l, l1, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIContactBlockReadType readLastBlockOfContacts(long l, long l1, String string) {
        try {
            return getCustomerWs().readLastBlockOfContacts(l, l1, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIContactBlockReadType readPreviousBlockOfContacts(long l, long l1, long l2, String string) {
        try {
            return getCustomerWs().readPreviousBlockOfContacts(l, l1, l2, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIContactBlockReadType readNextBlockOfContacts(long l, long l1, long l2, String string) {
        try {
            return getCustomerWs().readNextBlockOfContacts(l, l1, l2, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long getNumberOfContactsByTime(long l, CIDateTime cidt, String string) {
        try {
            return getCustomerWs().getNumberOfContactsByTime(l, cidt, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CICustomerReadType readCustomer(long l, String string) {
        try {
            return getCustomerWs().readCustomer(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIAddressReadType getDefaultAddress(long l, String string) {
        try {
            return getCustomerWs().getDefaultAddress(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIPhoneNumberReadType getDefaultPhoneNumber(long l, String string) {
        try {
            return getCustomerWs().getDefaultPhoneNumber(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIEmailAddressReadType getDefaultEmailAddress(long l, String string) {
        try {
            return getCustomerWs().getDefaultEmailAddress(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CICustomerReadType getCustomerByUsername(String userName, String sessionKey) {
        try {
            return getCustomerWs().getCustomerByUsername(userName, sessionKey);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CICustomerReadType getCustomerByEmailAddress(String string, String string1) {
        try {
            return getCustomerWs().getCustomerByEmailAddress(string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleCustomerIDReadType getCustomerByPhoneNumber(String string, String string1, String string2, String string3) {
        try {
            return getCustomerWs().getCustomerByPhoneNumber(string, string1, string2, string3);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleCustomerIDReadType getCustomerByFirstName(String string, String string1) {
        try {
            return getCustomerWs().getCustomerByFirstName(string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleCustomerIDReadType getCustomerByLastName(String string, String string1) {
        try {
            return getCustomerWs().getCustomerByLastName(string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleCustomerIDReadType getCustomerByName(String string, String string1, String string2) {
        try {
            return getCustomerWs().getCustomerByName(string, string1, string2);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateTitle(long l, String string, String string1) {
        try {
            return getCustomerWs().updateTitle(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateFirstName(long l, String string, String string1) {
        try {
            return getCustomerWs().updateFirstName(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateLastName(long l, String string, String string1) {
        try {
            return getCustomerWs().updateLastName(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateUsername(long l, String string, String string1) {
        try {
            return getCustomerWs().updateUsername(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updatePassword(long l, String string, String string1, String string2) {
        try {
            return getCustomerWs().updatePassword(l, string, string1, string2);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateCustomer(long l, CICustomerWriteType cicwt, String string) {
        try {
            return getCustomerWs().updateCustomer(l, cicwt, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long addAddress(long l, CIAddressWriteType ciawt, String string) {
        try {
            return getCustomerWs().addAddress(l, ciawt, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long addPhoneNumber(long l, CIPhoneNumberWriteType cipnwt, String string) {
        try {
            return getCustomerWs().addPhoneNumber(l, cipnwt, string);
        } catch (RemoteException e) {
//            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long addEmailAddress(long l, CIEmailAddressWriteType cieawt, String string) {
        try {
            return getCustomerWs().addEmailAddress(l, cieawt, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long addCustomField(long l, CICustomFieldWriteType cicfwt, String string) {
        try {
            return getCustomerWs().addCustomField(l, cicfwt, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long removeAddress(long l, long l1, String string) {
        try {
            return getCustomerWs().removeAddress(l, l1, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long removePhoneNumber(long l, long l1, String string) {
        try {
            return getCustomerWs().removePhoneNumber(l, l1, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long removeEmailAddress(long l, long l1, String string) {
        try {
            return getCustomerWs().removeEmailAddress(l, l1, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long removeCustomField(long l, long l1, String string) {
        try {
            return getCustomerWs().removeCustomField(l, l1, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CICustomFieldReadType readCustomField(long l, String string) {
        try {
            return getCustomFieldWs().readCustomField(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateCustomField(long l, CICustomFieldWriteType cicfwt, String string) {
        try {
            return getCustomFieldWs().updateCustomField(l, cicfwt, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateName(long l, String string, String string1) {
        try {
            return getCustomFieldWs().updateName(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateText(long l, String string, String string1) {
        try {
            return getCustomFieldWs().updateText(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIContactReadType readContact(long l, String string) {
        try {
            return getContactWs().readContact(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long closeContact(long l, String string, long l1, boolean bln, String string1) {
        try {
            return getContactWs().closeContact(l, string, l1, bln, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIMultipleClosedRCReadType getAllClosedReasonCodes(String string) {
        try {
            return getContactWs().getAllClosedReasonCodes(string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIClosedRCReadType getClosedReasonCodeByName(String string, String string1) {
        try {
            return getContactWs().getClosedReasonCodeByName(string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIAddressReadType readAddress(long l, String string) {
        try {
            return getAddressWs().readAddress(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateAddress(long l, CIAddressWriteType ciawt, String string) {
        try {
            return getAddressWs().updateAddress(l, ciawt, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateLine1(long l, String string, String string1) {
        try {
            return getAddressWs().updateLine1(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateLine2(long l, String string, String string1) {
        try {
            return getAddressWs().updateLine2(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateLine3(long l, String string, String string1) {
        try {
            return getAddressWs().updateLine3(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateLine4(long l, String string, String string1) {
        try {
            return getAddressWs().updateLine4(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateLine5(long l, String string, String string1) {
        try {
            return getAddressWs().updateLine5(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateCountry(long l, String string, String string1) {
        try {
            return getAddressWs().updateCountry(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public long updateZipCode(long l, String string, String string1) {
        try {
            return getAddressWs().updateZipCode(l, string, string1);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public CIActionReadType readAction(long l, String string) {
        try {
            return getActionWs().readAction(l, string);
        } catch (RemoteException e) {
            //logger.error("Filed to call ws function:", e);
            throw new RuntimeException(e);
        }
    }
}
