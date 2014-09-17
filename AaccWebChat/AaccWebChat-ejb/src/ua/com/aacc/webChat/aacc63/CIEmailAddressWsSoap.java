/**
 * CIEmailAddressWsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public interface CIEmailAddressWsSoap extends java.rmi.Remote {
    public ua.com.aacc.webChat.aacc63.CIEmailAddressReadType readEmailAddress(long id, String sessionKey) throws java.rmi.RemoteException;

    public long updateEmailAddress(long id, ua.com.aacc.webChat.aacc63.CIEmailAddressWriteType newEmailAddress, String sessionKey) throws java.rmi.RemoteException;

    public long updateDefault(long id, boolean newValue, String sessionKey) throws java.rmi.RemoteException;
}
