
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationTopicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationTopicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressPropertyListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}AddressPropertyListenerType" minOccurs="0"/>
 *         &lt;element name="TerminalPropertyListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}TerminalPropertyListenerType" minOccurs="0"/>
 *         &lt;element name="ContactPropertyListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}ContactPropertyListenerType" minOccurs="0"/>
 *         &lt;element name="AgentPropertyListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}AgentPropertyListenerType" minOccurs="0"/>
 *         &lt;element name="ConnectionStateListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}ConnectionStateListenerType" minOccurs="0"/>
 *         &lt;element name="TerminalConnectionStateListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}TerminalConnectionStateListenerType" minOccurs="0"/>
 *         &lt;element name="AddressStateListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}AddressStateListenerType" minOccurs="0"/>
 *         &lt;element name="TerminalStateListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}TerminalStateListenerType" minOccurs="0"/>
 *         &lt;element name="AgentStateListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}AgentStateListenerType" minOccurs="0"/>
 *         &lt;element name="ServiceProviderStatusListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}ServiceProviderStatusListenerType" minOccurs="0"/>
 *         &lt;element name="ForceDisconnectListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}ForceDisconnectListenerType" minOccurs="0"/>
 *         &lt;element name="DefaultTreatmentListener" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}DefaultTreatmentListenerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationTopicType", propOrder = {
    "addressPropertyListener",
    "terminalPropertyListener",
    "contactPropertyListener",
    "agentPropertyListener",
    "connectionStateListener",
    "terminalConnectionStateListener",
    "addressStateListener",
    "terminalStateListener",
    "agentStateListener",
    "serviceProviderStatusListener",
    "forceDisconnectListener",
    "defaultTreatmentListener"
})
public class NotificationTopicType {

    @XmlElement(name = "AddressPropertyListener")
    protected AddressPropertyListenerType addressPropertyListener;
    @XmlElement(name = "TerminalPropertyListener")
    protected TerminalPropertyListenerType terminalPropertyListener;
    @XmlElement(name = "ContactPropertyListener")
    protected ContactPropertyListenerType contactPropertyListener;
    @XmlElement(name = "AgentPropertyListener")
    protected AgentPropertyListenerType agentPropertyListener;
    @XmlElement(name = "ConnectionStateListener")
    protected ConnectionStateListenerType connectionStateListener;
    @XmlElement(name = "TerminalConnectionStateListener")
    protected TerminalConnectionStateListenerType terminalConnectionStateListener;
    @XmlElement(name = "AddressStateListener")
    protected AddressStateListenerType addressStateListener;
    @XmlElement(name = "TerminalStateListener")
    protected TerminalStateListenerType terminalStateListener;
    @XmlElement(name = "AgentStateListener")
    protected AgentStateListenerType agentStateListener;
    @XmlElement(name = "ServiceProviderStatusListener")
    protected ServiceProviderStatusListenerType serviceProviderStatusListener;
    @XmlElement(name = "ForceDisconnectListener")
    protected ForceDisconnectListenerType forceDisconnectListener;
    @XmlElement(name = "DefaultTreatmentListener")
    protected DefaultTreatmentListenerType defaultTreatmentListener;

    /**
     * Gets the value of the addressPropertyListener property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyListenerType }
     *     
     */
    public AddressPropertyListenerType getAddressPropertyListener() {
        return addressPropertyListener;
    }

    /**
     * Sets the value of the addressPropertyListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyListenerType }
     *     
     */
    public void setAddressPropertyListener(AddressPropertyListenerType value) {
        this.addressPropertyListener = value;
    }

    /**
     * Gets the value of the terminalPropertyListener property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalPropertyListenerType }
     *     
     */
    public TerminalPropertyListenerType getTerminalPropertyListener() {
        return terminalPropertyListener;
    }

    /**
     * Sets the value of the terminalPropertyListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalPropertyListenerType }
     *     
     */
    public void setTerminalPropertyListener(TerminalPropertyListenerType value) {
        this.terminalPropertyListener = value;
    }

    /**
     * Gets the value of the contactPropertyListener property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyListenerType }
     *     
     */
    public ContactPropertyListenerType getContactPropertyListener() {
        return contactPropertyListener;
    }

    /**
     * Sets the value of the contactPropertyListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyListenerType }
     *     
     */
    public void setContactPropertyListener(ContactPropertyListenerType value) {
        this.contactPropertyListener = value;
    }

    /**
     * Gets the value of the agentPropertyListener property.
     * 
     * @return
     *     possible object is
     *     {@link AgentPropertyListenerType }
     *     
     */
    public AgentPropertyListenerType getAgentPropertyListener() {
        return agentPropertyListener;
    }

    /**
     * Sets the value of the agentPropertyListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPropertyListenerType }
     *     
     */
    public void setAgentPropertyListener(AgentPropertyListenerType value) {
        this.agentPropertyListener = value;
    }

    /**
     * Gets the value of the connectionStateListener property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionStateListenerType }
     *     
     */
    public ConnectionStateListenerType getConnectionStateListener() {
        return connectionStateListener;
    }

    /**
     * Sets the value of the connectionStateListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionStateListenerType }
     *     
     */
    public void setConnectionStateListener(ConnectionStateListenerType value) {
        this.connectionStateListener = value;
    }

    /**
     * Gets the value of the terminalConnectionStateListener property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionStateListenerType }
     *     
     */
    public TerminalConnectionStateListenerType getTerminalConnectionStateListener() {
        return terminalConnectionStateListener;
    }

    /**
     * Sets the value of the terminalConnectionStateListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionStateListenerType }
     *     
     */
    public void setTerminalConnectionStateListener(TerminalConnectionStateListenerType value) {
        this.terminalConnectionStateListener = value;
    }

    /**
     * Gets the value of the addressStateListener property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStateListenerType }
     *     
     */
    public AddressStateListenerType getAddressStateListener() {
        return addressStateListener;
    }

    /**
     * Sets the value of the addressStateListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStateListenerType }
     *     
     */
    public void setAddressStateListener(AddressStateListenerType value) {
        this.addressStateListener = value;
    }

    /**
     * Gets the value of the terminalStateListener property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalStateListenerType }
     *     
     */
    public TerminalStateListenerType getTerminalStateListener() {
        return terminalStateListener;
    }

    /**
     * Sets the value of the terminalStateListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalStateListenerType }
     *     
     */
    public void setTerminalStateListener(TerminalStateListenerType value) {
        this.terminalStateListener = value;
    }

    /**
     * Gets the value of the agentStateListener property.
     * 
     * @return
     *     possible object is
     *     {@link AgentStateListenerType }
     *     
     */
    public AgentStateListenerType getAgentStateListener() {
        return agentStateListener;
    }

    /**
     * Sets the value of the agentStateListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentStateListenerType }
     *     
     */
    public void setAgentStateListener(AgentStateListenerType value) {
        this.agentStateListener = value;
    }

    /**
     * Gets the value of the serviceProviderStatusListener property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderStatusListenerType }
     *     
     */
    public ServiceProviderStatusListenerType getServiceProviderStatusListener() {
        return serviceProviderStatusListener;
    }

    /**
     * Sets the value of the serviceProviderStatusListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderStatusListenerType }
     *     
     */
    public void setServiceProviderStatusListener(ServiceProviderStatusListenerType value) {
        this.serviceProviderStatusListener = value;
    }

    /**
     * Gets the value of the forceDisconnectListener property.
     * 
     * @return
     *     possible object is
     *     {@link ForceDisconnectListenerType }
     *     
     */
    public ForceDisconnectListenerType getForceDisconnectListener() {
        return forceDisconnectListener;
    }

    /**
     * Sets the value of the forceDisconnectListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceDisconnectListenerType }
     *     
     */
    public void setForceDisconnectListener(ForceDisconnectListenerType value) {
        this.forceDisconnectListener = value;
    }

    /**
     * Gets the value of the defaultTreatmentListener property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultTreatmentListenerType }
     *     
     */
    public DefaultTreatmentListenerType getDefaultTreatmentListener() {
        return defaultTreatmentListener;
    }

    /**
     * Sets the value of the defaultTreatmentListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultTreatmentListenerType }
     *     
     */
    public void setDefaultTreatmentListener(DefaultTreatmentListenerType value) {
        this.defaultTreatmentListener = value;
    }

}
