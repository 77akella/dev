
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Connection;
import com.nortel.soa.oi.cct.types.Contact;
import com.nortel.soa.oi.cct.types.Reason;
import com.nortel.soa.oi.cct.types.Terminal;
import com.nortel.soa.oi.cct.types.TerminalConnection;
import com.nortel.soa.oi.cct.types.TerminalConnectionCapabilities;
import com.nortel.soa.oi.cct.types.TerminalConnectionState;


/**
 * 
 * 				This event is fired when a terminal connection state change 
 * 				occurs for entity(s) that were detailed in subscribe request 
 * 				for	said terminalConnectionState.
 * 				The event will detail the following;
 * 					The terminal associated with the terminal connection.
 * 					The terminal connection that has changed state. 
 * 					The connection associated with this terminal connection.
 * 					The contact related to the terminal connection (via the Connection object).
 * 					The new state of the connection.
 * 					The previous state of the connection.
 * 					The reason associated with the state change.
 * 					The terminal that sent the terminal connection state change.
 * 			
 * 
 * <p>Java class for TerminalConnectionStateEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalConnectionStateEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Terminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="TerminalConnection" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnection"/>
 *         &lt;element name="Connection" type="{http://www.nortel.com/soa/oi/cct/types}connection"/>
 *         &lt;element name="TerminalConnectionCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnectionCapabilities"/>
 *         &lt;element name="Contact" type="{http://www.nortel.com/soa/oi/cct/types}contact"/>
 *         &lt;element name="NewState" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnectionState"/>
 *         &lt;element name="PreviousState" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnectionState"/>
 *         &lt;element name="Reason" type="{http://www.nortel.com/soa/oi/cct/types}reason"/>
 *         &lt;element name="SendingTerminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalConnectionStateEventType", propOrder = {
    "terminal",
    "terminalConnection",
    "connection",
    "terminalConnectionCapabilities",
    "contact",
    "newState",
    "previousState",
    "reason",
    "sendingTerminal"
})
public class TerminalConnectionStateEventType {

    @XmlElement(name = "Terminal", required = true)
    protected Terminal terminal;
    @XmlElement(name = "TerminalConnection", required = true)
    protected TerminalConnection terminalConnection;
    @XmlElement(name = "Connection", required = true)
    protected Connection connection;
    @XmlElement(name = "TerminalConnectionCapabilities", required = true)
    protected TerminalConnectionCapabilities terminalConnectionCapabilities;
    @XmlElement(name = "Contact", required = true)
    protected Contact contact;
    @XmlElement(name = "NewState", required = true)
    protected TerminalConnectionState newState;
    @XmlElement(name = "PreviousState", required = true)
    protected TerminalConnectionState previousState;
    @XmlElement(name = "Reason", required = true)
    protected Reason reason;
    @XmlElement(name = "SendingTerminal", required = true)
    protected Terminal sendingTerminal;

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setTerminal(Terminal value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the terminalConnection property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnection }
     *     
     */
    public TerminalConnection getTerminalConnection() {
        return terminalConnection;
    }

    /**
     * Sets the value of the terminalConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnection }
     *     
     */
    public void setTerminalConnection(TerminalConnection value) {
        this.terminalConnection = value;
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
     * Gets the value of the terminalConnectionCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionCapabilities }
     *     
     */
    public TerminalConnectionCapabilities getTerminalConnectionCapabilities() {
        return terminalConnectionCapabilities;
    }

    /**
     * Sets the value of the terminalConnectionCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionCapabilities }
     *     
     */
    public void setTerminalConnectionCapabilities(TerminalConnectionCapabilities value) {
        this.terminalConnectionCapabilities = value;
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
     * Gets the value of the newState property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionState }
     *     
     */
    public TerminalConnectionState getNewState() {
        return newState;
    }

    /**
     * Sets the value of the newState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionState }
     *     
     */
    public void setNewState(TerminalConnectionState value) {
        this.newState = value;
    }

    /**
     * Gets the value of the previousState property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionState }
     *     
     */
    public TerminalConnectionState getPreviousState() {
        return previousState;
    }

    /**
     * Sets the value of the previousState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionState }
     *     
     */
    public void setPreviousState(TerminalConnectionState value) {
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
     * Gets the value of the sendingTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getSendingTerminal() {
        return sendingTerminal;
    }

    /**
     * Sets the value of the sendingTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setSendingTerminal(Terminal value) {
        this.sendingTerminal = value;
    }

}
