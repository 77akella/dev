
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.notification.SystemEventType;


/**
 * <p>Java class for NotificationEventHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationEventHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}eventType"/>
 *         &lt;element name="AddressPropertyEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}AddressPropertyEventType" minOccurs="0"/>
 *         &lt;element name="TerminalPropertyEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}TerminalPropertyEventType" minOccurs="0"/>
 *         &lt;element name="ContactPropertyEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}ContactPropertyEventType" minOccurs="0"/>
 *         &lt;element name="AgentPropertyEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}AgentPropertyEventType" minOccurs="0"/>
 *         &lt;element name="ConnectionStateEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}ConnectionStateEventType" minOccurs="0"/>
 *         &lt;element name="TerminalConnectionStateEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}TerminalConnectionStateEventType" minOccurs="0"/>
 *         &lt;element name="AddressStateEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}AddressStateEventType" minOccurs="0"/>
 *         &lt;element name="TerminalStateEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}TerminalStateEventType" minOccurs="0"/>
 *         &lt;element name="AgentStateEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}AgentStateEventType" minOccurs="0"/>
 *         &lt;element name="ServiceProviderStatusEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}ServiceProviderStatusEventType" minOccurs="0"/>
 *         &lt;element name="ForceDisconnectEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}ForceDisconnectEventType" minOccurs="0"/>
 *         &lt;element name="DefaultTreatmentEvent" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}DefaultTreatmentEventType" minOccurs="0"/>
 *         &lt;element name="SystemEvent" type="{http://www.nortel.com/soa/oi/cct/notification}SystemEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationEventHolderType", propOrder = {
    "eventType",
    "addressPropertyEvent",
    "terminalPropertyEvent",
    "contactPropertyEvent",
    "agentPropertyEvent",
    "connectionStateEvent",
    "terminalConnectionStateEvent",
    "addressStateEvent",
    "terminalStateEvent",
    "agentStateEvent",
    "serviceProviderStatusEvent",
    "forceDisconnectEvent",
    "defaultTreatmentEvent",
    "systemEvent"
})
public class NotificationEventHolderType {

    @XmlElement(name = "EventType", required = true)
    protected EventType eventType;
    @XmlElement(name = "AddressPropertyEvent")
    protected AddressPropertyEventType addressPropertyEvent;
    @XmlElement(name = "TerminalPropertyEvent")
    protected TerminalPropertyEventType terminalPropertyEvent;
    @XmlElement(name = "ContactPropertyEvent")
    protected ContactPropertyEventType contactPropertyEvent;
    @XmlElement(name = "AgentPropertyEvent")
    protected AgentPropertyEventType agentPropertyEvent;
    @XmlElement(name = "ConnectionStateEvent")
    protected ConnectionStateEventType connectionStateEvent;
    @XmlElement(name = "TerminalConnectionStateEvent")
    protected TerminalConnectionStateEventType terminalConnectionStateEvent;
    @XmlElement(name = "AddressStateEvent")
    protected AddressStateEventType addressStateEvent;
    @XmlElement(name = "TerminalStateEvent")
    protected TerminalStateEventType terminalStateEvent;
    @XmlElement(name = "AgentStateEvent")
    protected AgentStateEventType agentStateEvent;
    @XmlElement(name = "ServiceProviderStatusEvent")
    protected ServiceProviderStatusEventType serviceProviderStatusEvent;
    @XmlElement(name = "ForceDisconnectEvent")
    protected ForceDisconnectEventType forceDisconnectEvent;
    @XmlElement(name = "DefaultTreatmentEvent")
    protected DefaultTreatmentEventType defaultTreatmentEvent;
    @XmlElement(name = "SystemEvent")
    protected SystemEventType systemEvent;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setEventType(EventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the addressPropertyEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyEventType }
     *     
     */
    public AddressPropertyEventType getAddressPropertyEvent() {
        return addressPropertyEvent;
    }

    /**
     * Sets the value of the addressPropertyEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyEventType }
     *     
     */
    public void setAddressPropertyEvent(AddressPropertyEventType value) {
        this.addressPropertyEvent = value;
    }

    /**
     * Gets the value of the terminalPropertyEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalPropertyEventType }
     *     
     */
    public TerminalPropertyEventType getTerminalPropertyEvent() {
        return terminalPropertyEvent;
    }

    /**
     * Sets the value of the terminalPropertyEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalPropertyEventType }
     *     
     */
    public void setTerminalPropertyEvent(TerminalPropertyEventType value) {
        this.terminalPropertyEvent = value;
    }

    /**
     * Gets the value of the contactPropertyEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyEventType }
     *     
     */
    public ContactPropertyEventType getContactPropertyEvent() {
        return contactPropertyEvent;
    }

    /**
     * Sets the value of the contactPropertyEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyEventType }
     *     
     */
    public void setContactPropertyEvent(ContactPropertyEventType value) {
        this.contactPropertyEvent = value;
    }

    /**
     * Gets the value of the agentPropertyEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AgentPropertyEventType }
     *     
     */
    public AgentPropertyEventType getAgentPropertyEvent() {
        return agentPropertyEvent;
    }

    /**
     * Sets the value of the agentPropertyEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPropertyEventType }
     *     
     */
    public void setAgentPropertyEvent(AgentPropertyEventType value) {
        this.agentPropertyEvent = value;
    }

    /**
     * Gets the value of the connectionStateEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionStateEventType }
     *     
     */
    public ConnectionStateEventType getConnectionStateEvent() {
        return connectionStateEvent;
    }

    /**
     * Sets the value of the connectionStateEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionStateEventType }
     *     
     */
    public void setConnectionStateEvent(ConnectionStateEventType value) {
        this.connectionStateEvent = value;
    }

    /**
     * Gets the value of the terminalConnectionStateEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionStateEventType }
     *     
     */
    public TerminalConnectionStateEventType getTerminalConnectionStateEvent() {
        return terminalConnectionStateEvent;
    }

    /**
     * Sets the value of the terminalConnectionStateEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionStateEventType }
     *     
     */
    public void setTerminalConnectionStateEvent(TerminalConnectionStateEventType value) {
        this.terminalConnectionStateEvent = value;
    }

    /**
     * Gets the value of the addressStateEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStateEventType }
     *     
     */
    public AddressStateEventType getAddressStateEvent() {
        return addressStateEvent;
    }

    /**
     * Sets the value of the addressStateEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStateEventType }
     *     
     */
    public void setAddressStateEvent(AddressStateEventType value) {
        this.addressStateEvent = value;
    }

    /**
     * Gets the value of the terminalStateEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalStateEventType }
     *     
     */
    public TerminalStateEventType getTerminalStateEvent() {
        return terminalStateEvent;
    }

    /**
     * Sets the value of the terminalStateEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalStateEventType }
     *     
     */
    public void setTerminalStateEvent(TerminalStateEventType value) {
        this.terminalStateEvent = value;
    }

    /**
     * Gets the value of the agentStateEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AgentStateEventType }
     *     
     */
    public AgentStateEventType getAgentStateEvent() {
        return agentStateEvent;
    }

    /**
     * Sets the value of the agentStateEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentStateEventType }
     *     
     */
    public void setAgentStateEvent(AgentStateEventType value) {
        this.agentStateEvent = value;
    }

    /**
     * Gets the value of the serviceProviderStatusEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderStatusEventType }
     *     
     */
    public ServiceProviderStatusEventType getServiceProviderStatusEvent() {
        return serviceProviderStatusEvent;
    }

    /**
     * Sets the value of the serviceProviderStatusEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderStatusEventType }
     *     
     */
    public void setServiceProviderStatusEvent(ServiceProviderStatusEventType value) {
        this.serviceProviderStatusEvent = value;
    }

    /**
     * Gets the value of the forceDisconnectEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ForceDisconnectEventType }
     *     
     */
    public ForceDisconnectEventType getForceDisconnectEvent() {
        return forceDisconnectEvent;
    }

    /**
     * Sets the value of the forceDisconnectEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceDisconnectEventType }
     *     
     */
    public void setForceDisconnectEvent(ForceDisconnectEventType value) {
        this.forceDisconnectEvent = value;
    }

    /**
     * Gets the value of the defaultTreatmentEvent property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultTreatmentEventType }
     *     
     */
    public DefaultTreatmentEventType getDefaultTreatmentEvent() {
        return defaultTreatmentEvent;
    }

    /**
     * Sets the value of the defaultTreatmentEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultTreatmentEventType }
     *     
     */
    public void setDefaultTreatmentEvent(DefaultTreatmentEventType value) {
        this.defaultTreatmentEvent = value;
    }

    /**
     * Gets the value of the systemEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventType }
     *     
     */
    public SystemEventType getSystemEvent() {
        return systemEvent;
    }

    /**
     * Sets the value of the systemEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventType }
     *     
     */
    public void setSystemEvent(SystemEventType value) {
        this.systemEvent = value;
    }

}
