/**
 * CIUtilityWsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public interface CIUtilityWsSoap extends java.rmi.Remote {
    public String customerLogin(String username, String password) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.AnonymousLoginResult getAnonymousSessionKey() throws java.rmi.RemoteException;

    public long getAnonymousCustomerID(ua.com.aacc.webChat.aacc63.AnonymousLoginResult loginResult, String emailAddress, String phoneNumber) throws java.rmi.RemoteException;

    public long getAndUpdateAnonymousCustomerID(ua.com.aacc.webChat.aacc63.AnonymousLoginResult loginResult, String emailAddress, String phoneNumber, ua.com.aacc.webChat.aacc63.CICustomerReadType thisCustomer) throws java.rmi.RemoteException;

    public String extendedCustomerLogin(String username, String exLoginPassword) throws java.rmi.RemoteException;

    public long customerLogoff(String username) throws java.rmi.RemoteException;

    public long customerEndSession(String username, String sessionKey) throws java.rmi.RemoteException;

    public long customerLogoffByContactID(String username, long contactId, String sessionKey) throws java.rmi.RemoteException;

    public String administratorLogin(String username, String password) throws java.rmi.RemoteException;

    public long administratorLogoff(String username) throws java.rmi.RemoteException;

    public boolean isContactCentreClosed(String sessionKey) throws java.rmi.RemoteException;

    public CIDateTime getServerTime() throws java.rmi.RemoteException;

    public CIDateTime getServerUTCTime(String sessionKey) throws java.rmi.RemoteException;

    public CIDateTime getServerRAWTime(String sessionKey) throws java.rmi.RemoteException;

    public long timeStampToMilliseconds(CITimeStamp timestamp) throws java.rmi.RemoteException;

    public CITimeStamp millisecondsToTimeStamp(long milliseconds, int UTCOffsetMins) throws java.rmi.RemoteException;

    public long getTotalQueued(String sessionKey) throws java.rmi.RemoteException;

    public long getTotalQueuedToSkillset(String sessionKey, long skillsetID) throws java.rmi.RemoteException;
}
