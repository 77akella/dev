/**
 * CIAddressWsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public interface CIAddressWsSoap extends java.rmi.Remote {
    public ua.com.aacc.webChat.aacc63.CIAddressReadType readAddress(long id, String sessionKey) throws java.rmi.RemoteException;

    public long updateAddress(long id, ua.com.aacc.webChat.aacc63.CIAddressWriteType newAddress, String sessionKey) throws java.rmi.RemoteException;

    public long updateLine1(long id, String newLine1, String sessionKey) throws java.rmi.RemoteException;

    public long updateLine2(long id, String newLine2, String sessionKey) throws java.rmi.RemoteException;

    public long updateLine3(long id, String newLine3, String sessionKey) throws java.rmi.RemoteException;

    public long updateLine4(long id, String newLine4, String sessionKey) throws java.rmi.RemoteException;

    public long updateLine5(long id, String newLine5, String sessionKey) throws java.rmi.RemoteException;

    public long updateCountry(long id, String newCountry, String sessionKey) throws java.rmi.RemoteException;

    public long updateZipCode(long id, String newZipCode, String sessionKey) throws java.rmi.RemoteException;

    public long updateDefault(long id, boolean newValue, String sessionKey) throws java.rmi.RemoteException;
}
