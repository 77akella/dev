/**
 * CISkillsetWsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public interface CISkillsetWsSoap extends java.rmi.Remote {
    public ua.com.aacc.webChat.aacc63.CIMultipleSkillsetsReadType getAllSkillsets(String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleSkillsetsReadType getAllWebSkillsets(String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleSkillsetsReadType getAllOutboundSkillsets(String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleSkillsetsReadType getAllEmailSkillsets(String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CISkillsetReadType getSkillsetByID(long id, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CISkillsetReadType getSkillsetByName(String skillsetName, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CISkillsetReadType readSkillsetByName(String skillsetName, String sessionKey) throws java.rmi.RemoteException;

    public boolean isSkillsetInService(long skillsetID, String sessionKey) throws java.rmi.RemoteException;
}
