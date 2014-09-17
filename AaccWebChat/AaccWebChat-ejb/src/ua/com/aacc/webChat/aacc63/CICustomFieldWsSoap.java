/**
 * CICustomFieldWsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public interface CICustomFieldWsSoap extends java.rmi.Remote {
    public ua.com.aacc.webChat.aacc63.CICustomFieldReadType readCustomField(long id, String sessionKey) throws java.rmi.RemoteException;

    public long updateCustomField(long id, ua.com.aacc.webChat.aacc63.CICustomFieldWriteType newCustomField, String sessionKey) throws java.rmi.RemoteException;

    public long updateName(long id, String newName, String sessionKey) throws java.rmi.RemoteException;

    public long updateText(long id, String newText, String sessionKey) throws java.rmi.RemoteException;
}
