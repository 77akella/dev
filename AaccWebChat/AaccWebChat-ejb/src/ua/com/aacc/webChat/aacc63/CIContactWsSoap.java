/**
 * CIContactWsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public interface CIContactWsSoap extends java.rmi.Remote {
    public ua.com.aacc.webChat.aacc63.CIContactReadType readContact(long id, String sessionKey) throws java.rmi.RemoteException;

    public long closeContact(long contactID, String closureText, long closedReasonCodeValue, boolean closedReasonCodeSpecified, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleClosedRCReadType getAllClosedReasonCodes(String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIClosedRCReadType getClosedReasonCodeByName(String closedReasonCodeName, String sessionKey) throws java.rmi.RemoteException;
}
