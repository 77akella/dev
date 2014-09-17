/**
 * CICustomerWsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public interface CICustomerWsSoap extends java.rmi.Remote {
    public long registerNewCustomer(ua.com.aacc.webChat.aacc63.CICustomerWriteType newCustomer, ua.com.aacc.webChat.aacc63.CIPhoneNumberWriteType newPhoneNumber, ua.com.aacc.webChat.aacc63.CIAddressWriteType newAddress, ua.com.aacc.webChat.aacc63.CIEmailAddressWriteType newEmailAddress) throws java.rmi.RemoteException;

    public long registerAnonymousCustomer(ua.com.aacc.webChat.aacc63.CICustomerWriteType newCustomer, ua.com.aacc.webChat.aacc63.CIPhoneNumberWriteType newPhoneNumber) throws java.rmi.RemoteException;

    public long requestTextChat(long custID, ua.com.aacc.webChat.aacc63.CIContactWriteType newContact, boolean createAsClosed, String sessionKey) throws java.rmi.RemoteException;

    public long requestScheduledCallback(long custID, ua.com.aacc.webChat.aacc63.CIContactWriteType newContact, String sessionKey) throws java.rmi.RemoteException;

    public long requestScheduledCallbackUTC(long custID, ua.com.aacc.webChat.aacc63.CIContactWriteType newContact, String sessionKey) throws java.rmi.RemoteException;

    public long requestImmediateCallback(long custID, ua.com.aacc.webChat.aacc63.CIContactWriteType newContact, String sessionKey) throws java.rmi.RemoteException;

    public long sendPasswordReminder(String emailAddress, String skillsetName) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIContactBlockReadType readFirstBlockOfContacts(long customerID, long numOfContacts, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIContactBlockReadType readLastBlockOfContacts(long customerID, long numOfContacts, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIContactBlockReadType readPreviousBlockOfContacts(long customerID, long numOfContacts, long startContactID, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIContactBlockReadType readNextBlockOfContacts(long customerID, long numOfContacts, long startContactID, String sessionKey) throws java.rmi.RemoteException;

    public long getNumberOfContactsByTime(long customerID, CIDateTime timestamp, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CICustomerReadType readCustomer(long id, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIAddressReadType getDefaultAddress(long id, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType getDefaultPhoneNumber(long id, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIEmailAddressReadType getDefaultEmailAddress(long id, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CICustomerReadType getCustomerByUsername(String username, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CICustomerReadType getCustomerByEmailAddress(String emailAddress, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleCustomerIDReadType getCustomerByPhoneNumber(String intCode, String areaCode, String number, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleCustomerIDReadType getCustomerByFirstName(String firstName, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleCustomerIDReadType getCustomerByLastName(String lastName, String sessionKey) throws java.rmi.RemoteException;

    public ua.com.aacc.webChat.aacc63.CIMultipleCustomerIDReadType getCustomerByName(String firstName, String lastName, String sessionKey) throws java.rmi.RemoteException;

    public long updateTitle(long custID, String newTitle, String sessionKey) throws java.rmi.RemoteException;

    public long updateFirstName(long custID, String newFirstName, String sessionKey) throws java.rmi.RemoteException;

    public long updateLastName(long custID, String newLastName, String sessionKey) throws java.rmi.RemoteException;

    public long updateUsername(long custID, String newUsername, String sessionKey) throws java.rmi.RemoteException;

    public long updatePassword(long custID, String oldPassword, String newPassword, String sessionKey) throws java.rmi.RemoteException;

    public long updateCustomer(long id, ua.com.aacc.webChat.aacc63.CICustomerWriteType newCustomerData, String sessionKey) throws java.rmi.RemoteException;

    public long addAddress(long id, ua.com.aacc.webChat.aacc63.CIAddressWriteType newAddress, String sessionKey) throws java.rmi.RemoteException;

    public long addPhoneNumber(long id, ua.com.aacc.webChat.aacc63.CIPhoneNumberWriteType newPhoneNumber, String sessionKey) throws java.rmi.RemoteException;

    public long addEmailAddress(long id, ua.com.aacc.webChat.aacc63.CIEmailAddressWriteType newEmailAddress, String sessionKey) throws java.rmi.RemoteException;

    public long addCustomField(long id, ua.com.aacc.webChat.aacc63.CICustomFieldWriteType newCustomField, String sessionKey) throws java.rmi.RemoteException;

    public long removeAddress(long custID, long addressID, String sessionKey) throws java.rmi.RemoteException;

    public long removePhoneNumber(long custID, long phoneNumberID, String sessionKey) throws java.rmi.RemoteException;

    public long removeEmailAddress(long custID, long emailAddressID, String sessionKey) throws java.rmi.RemoteException;

    public long removeCustomField(long custID, long customFieldID, String sessionKey) throws java.rmi.RemoteException;
}
