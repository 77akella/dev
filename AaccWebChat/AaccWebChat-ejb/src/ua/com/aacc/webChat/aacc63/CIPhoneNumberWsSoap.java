/**
 * CIPhoneNumberWsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public interface CIPhoneNumberWsSoap extends java.rmi.Remote {
    public ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType readPhoneNumber(long id, String sessionKey) throws java.rmi.RemoteException;

    public long updatePhoneNumber(long id, ua.com.aacc.webChat.aacc63.CIPhoneNumberWriteType newPhoneNumber, String sessionKey) throws java.rmi.RemoteException;

    public long updateAreaCode(long id, String newAreaCode, String sessionKey) throws java.rmi.RemoteException;

    public long updateInternationalCode(long id, String newInternationalCode, String sessionKey) throws java.rmi.RemoteException;

    public long updateNumber(long id, String newNumber, String sessionKey) throws java.rmi.RemoteException;

    public long updateDefault(long id, boolean newValue, String sessionKey) throws java.rmi.RemoteException;
}
