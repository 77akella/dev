
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.Connection;
import com.nortel.soa.oi.cct.types.ConnectionCapabilities;
import com.nortel.soa.oi.cct.types.ConnectionState;
import com.nortel.soa.oi.cct.types.Contact;
import com.nortel.soa.oi.cct.types.Reason;


/**
 * 
 * 				This event is fired when a connection state change occurs
 * 				for entity(s) that were detailed in subscribe request for 
 * 				said connectionState.
 * 				The event will detail the following;
 * 					The address related to the connection.
 * 	 				The connection that has changed state.
 * 	 				The contact related to the connection.
 * 	 				A boolean indicating whether the connection state change event is for a 
 * 	 				connection on a local address (false) or a remote address (true).
 * 	 				The new state of the connection.
 * 	 				The previous state of the connection.
 * 					The reason associated with the state change.
 * 					The address that sent the connection state change event.
 * 			
 * 
 * <p>Java class for ConnectionStateEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionStateEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *         &lt;element name="Connection" type="{http://www.nortel.com/soa/oi/cct/types}connection"/>
 *         &lt;element name="Contact" type="{http://www.nortel.com/soa/oi/cct/types}contact"/>
 *         &lt;element name="ConnectionCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}connectionCapabilities"/>
 *         &lt;element name="IsRemote" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NewState" type="{http://www.nortel.com/soa/oi/cct/types}connectionState"/>
 *         &lt;element name="PreviousState" type="{http://www.nortel.com/soa/oi/cct/types}connectionState"/>
 *         &lt;element name="Reason" type="{http://www.nortel.com/soa/oi/cct/types}reason"/>
 *         &lt;element name="SendingAddress" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionStateEventType", propOrder = {
    "address",
    "connection",
    "contact",
    "connectionCapabilities",
    "isRemote",
    "newState",
    "previousState",
    "reason",
    "sendingAddress"
})
public class ConnectionStateEventType {

    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "Connection", required = true)
    protected Connection connection;
    @XmlElement(name = "Contact", required = true)
    protected Contact contact;
    @XmlElement(name = "ConnectionCapabilities", required = true)
    protected ConnectionCapabilities connectionCapabilities;
    @XmlElement(name = "IsRemote")
    protected boolean isRemote;
    @XmlElement(name = "NewState", required = true)
    protected ConnectionState newState;
    @XmlElement(name = "PreviousState", required = true)
    protected ConnectionState previousState;
    @XmlElement(name = "Reason", required = true)
    protected Reason reason;
    @XmlElement(name = "SendingAddress", required = true)
    protected Address sendingAddress;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link Connection }
     *     
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connection }
     *     
     */
    public void setConnection(Connection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the connectionCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCapabilities }
     *     
     */
    public ConnectionCapabilities getConnectionCapabilities() {
        return connectionCapabilities;
    }

    /**
     * Sets the value of the connectionCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCapabilities }
     *     
     */
    public void setConnectionCapabilities(ConnectionCapabilities value) {
        this.connectionCapabilities = value;
    }

    /**
     * Gets the value of the isRemote property.
     * 
     */
    public boolean isIsRemote() {
        return isRemote;
    }

    /**
     * Sets the value of the isRemote property.
     * 
     */
    public void setIsRemote(boolean value) {
        this.isRemote = value;
    }

    /**
     * Gets the value of the newState property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionState }
     *     
     */
    public ConnectionState getNewState() {
        return newState;
    }

    /**
     * Sets the value of the newState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionState }
     *     
     */
    public void setNewState(ConnectionState value) {
        this.newState = value;
    }

    /**
     * Gets the value of the previousState property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionState }
     *     
     */
    public ConnectionState getPreviousState() {
        return previousState;
    }

    /**
     * Sets the value of the previousState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionState }
     *     
     */
    public void setPreviousState(ConnectionState value) {
        this.previousState = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link Reason }
     *     
     */
    public Reason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason }
     *     
     */
    public void setReason(Reason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the sendingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSendingAddress() {
        return sendingAddress;
    }

    /**
     * Sets the value of the sendingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSendingAddress(Address value) {
        this.sendingAddress = value;
    }

}
