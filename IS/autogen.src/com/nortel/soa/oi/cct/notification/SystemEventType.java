
package com.nortel.soa.oi.cct.notification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.SystemEvent;
import com.nortel.soa.oi.cct.types.SystemEventConnectionFailure;
import com.nortel.soa.oi.cct.types.SystemEventSessionTermination;
import com.nortel.soa.oi.cct.types.SystemEventSessionTerminationImminent;
import com.nortel.soa.oi.cct.types.SystemEventSubscriptionTermination;
import com.nortel.soa.oi.cct.types.SystemEventSubscriptionTerminationImminent;


/**
 * <p>Java class for SystemEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemEvent" type="{http://www.nortel.com/soa/oi/cct/types}systemEvent"/>
 *         &lt;element name="SystemEventConnectionFailure" type="{http://www.nortel.com/soa/oi/cct/types}systemEventConnectionFailure" minOccurs="0"/>
 *         &lt;element name="SystemEventSessionTermination" type="{http://www.nortel.com/soa/oi/cct/types}systemEventSessionTermination" minOccurs="0"/>
 *         &lt;element name="SystemEventSessionTerminationImminent" type="{http://www.nortel.com/soa/oi/cct/types}systemEventSessionTerminationImminent" minOccurs="0"/>
 *         &lt;element name="SystemEventSubscriptionTermination" type="{http://www.nortel.com/soa/oi/cct/types}systemEventSubscriptionTermination" minOccurs="0"/>
 *         &lt;element name="SystemEventSubscriptionTerminationImminent" type="{http://www.nortel.com/soa/oi/cct/types}systemEventSubscriptionTerminationImminent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventType", propOrder = {
    "systemEvent",
    "systemEventConnectionFailure",
    "systemEventSessionTermination",
    "systemEventSessionTerminationImminent",
    "systemEventSubscriptionTermination",
    "systemEventSubscriptionTerminationImminent"
})
public class SystemEventType {

    @XmlElement(name = "SystemEvent", required = true)
    protected SystemEvent systemEvent;
    @XmlElement(name = "SystemEventConnectionFailure")
    protected SystemEventConnectionFailure systemEventConnectionFailure;
    @XmlElement(name = "SystemEventSessionTermination")
    protected SystemEventSessionTermination systemEventSessionTermination;
    @XmlElement(name = "SystemEventSessionTerminationImminent")
    protected SystemEventSessionTerminationImminent systemEventSessionTerminationImminent;
    @XmlElement(name = "SystemEventSubscriptionTermination")
    protected SystemEventSubscriptionTermination systemEventSubscriptionTermination;
    @XmlElement(name = "SystemEventSubscriptionTerminationImminent")
    protected SystemEventSubscriptionTerminationImminent systemEventSubscriptionTerminationImminent;

    /**
     * Gets the value of the systemEvent property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEvent }
     *     
     */
    public SystemEvent getSystemEvent() {
        return systemEvent;
    }

    /**
     * Sets the value of the systemEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEvent }
     *     
     */
    public void setSystemEvent(SystemEvent value) {
        this.systemEvent = value;
    }

    /**
     * Gets the value of the systemEventConnectionFailure property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventConnectionFailure }
     *     
     */
    public SystemEventConnectionFailure getSystemEventConnectionFailure() {
        return systemEventConnectionFailure;
    }

    /**
     * Sets the value of the systemEventConnectionFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventConnectionFailure }
     *     
     */
    public void setSystemEventConnectionFailure(SystemEventConnectionFailure value) {
        this.systemEventConnectionFailure = value;
    }

    /**
     * Gets the value of the systemEventSessionTermination property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventSessionTermination }
     *     
     */
    public SystemEventSessionTermination getSystemEventSessionTermination() {
        return systemEventSessionTermination;
    }

    /**
     * Sets the value of the systemEventSessionTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventSessionTermination }
     *     
     */
    public void setSystemEventSessionTermination(SystemEventSessionTermination value) {
        this.systemEventSessionTermination = value;
    }

    /**
     * Gets the value of the systemEventSessionTerminationImminent property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventSessionTerminationImminent }
     *     
     */
    public SystemEventSessionTerminationImminent getSystemEventSessionTerminationImminent() {
        return systemEventSessionTerminationImminent;
    }

    /**
     * Sets the value of the systemEventSessionTerminationImminent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventSessionTerminationImminent }
     *     
     */
    public void setSystemEventSessionTerminationImminent(SystemEventSessionTerminationImminent value) {
        this.systemEventSessionTerminationImminent = value;
    }

    /**
     * Gets the value of the systemEventSubscriptionTermination property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventSubscriptionTermination }
     *     
     */
    public SystemEventSubscriptionTermination getSystemEventSubscriptionTermination() {
        return systemEventSubscriptionTermination;
    }

    /**
     * Sets the value of the systemEventSubscriptionTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventSubscriptionTermination }
     *     
     */
    public void setSystemEventSubscriptionTermination(SystemEventSubscriptionTermination value) {
        this.systemEventSubscriptionTermination = value;
    }

    /**
     * Gets the value of the systemEventSubscriptionTerminationImminent property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventSubscriptionTerminationImminent }
     *     
     */
    public SystemEventSubscriptionTerminationImminent getSystemEventSubscriptionTerminationImminent() {
        return systemEventSubscriptionTerminationImminent;
    }

    /**
     * Sets the value of the systemEventSubscriptionTerminationImminent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventSubscriptionTerminationImminent }
     *     
     */
    public void setSystemEventSubscriptionTerminationImminent(SystemEventSubscriptionTerminationImminent value) {
        this.systemEventSubscriptionTerminationImminent = value;
    }

}
