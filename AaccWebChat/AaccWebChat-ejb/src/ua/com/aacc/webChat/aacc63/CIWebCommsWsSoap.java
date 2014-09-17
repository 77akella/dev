/**
 * CIWebCommsWsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public interface CIWebCommsWsSoap extends java.rmi.Remote {
    public long createWebCommsSession(long contactID, String sessionKey) throws java.rmi.RemoteException;

    public long writeChatMessage(long contactID, String message, String hiddenMessage, ua.com.aacc.webChat.aacc63.CIChatMessageType chatMessageType, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleChatMessageReadType readChatMessage(long contactID, CIDateTime lastReadTime, boolean isWriting, String sessionKey) throws java.rmi.RemoteException;

    public long requestChatHistory(long contactID, String email, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleOnHoldURLReadType getWebOnHoldURLs(String tagName, String sessionKey) throws java.rmi.RemoteException;

    public CIDateTime updateAliveTime(long contactID, String sessionKey) throws java.rmi.RemoteException;

    public CIDateTime updateAliveTimeAndUpdateIsTyping(long contactID, String sessionKey, boolean isTyping) throws java.rmi.RemoteException;

    public long abandonQueuingWebCommsContact(long contactID, String closureComment, String sessionKey) throws java.rmi.RemoteException;

    public long abandonQueuingWCContact(long contactID, String closureComment, long closedReasonCodeValue, boolean closedReasonCodeSpecified, String sessionKey) throws java.rmi.RemoteException;

    public String getCustomerTextChatLabel(String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CICustomerChatNameReadType getCustomerTextChatName(long contactID, String sessionKey) throws java.rmi.RemoteException;

    public String getTrunkAccessCode(String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleOnHoldMessages getContactOnHoldMessages(long contact_id, String sessionKey) throws java.rmi.RemoteException;
}
