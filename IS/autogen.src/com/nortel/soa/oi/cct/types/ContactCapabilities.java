
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canAddParty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canBargeIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canDrop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetAttachedData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetCallingTerminal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetIntrinsics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetInstantMessages" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetLastRedirectedAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetOriginalDestination" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetUUI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canObserve" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetAttachedData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetIntrinsics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetUUI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canWhisper" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactCapabilities", propOrder = {
    "canAddParty",
    "canBargeIn",
    "canDrop",
    "canGetAttachedData",
    "canGetCallingTerminal",
    "canGetIntrinsics",
    "canGetInstantMessages",
    "canGetLastRedirectedAddress",
    "canGetOriginalDestination",
    "canGetUUI",
    "canObserve",
    "canSetAttachedData",
    "canSetIntrinsics",
    "canSetUUI",
    "canWhisper"
})
public class ContactCapabilities {

    protected boolean canAddParty;
    protected boolean canBargeIn;
    protected boolean canDrop;
    protected boolean canGetAttachedData;
    protected boolean canGetCallingTerminal;
    protected boolean canGetIntrinsics;
    protected boolean canGetInstantMessages;
    protected boolean canGetLastRedirectedAddress;
    protected boolean canGetOriginalDestination;
    protected boolean canGetUUI;
    protected boolean canObserve;
    protected boolean canSetAttachedData;
    protected boolean canSetIntrinsics;
    protected boolean canSetUUI;
    protected boolean canWhisper;

    /**
     * Gets the value of the canAddParty property.
     * 
     */
    public boolean isCanAddParty() {
        return canAddParty;
    }

    /**
     * Sets the value of the canAddParty property.
     * 
     */
    public void setCanAddParty(boolean value) {
        this.canAddParty = value;
    }

    /**
     * Gets the value of the canBargeIn property.
     * 
     */
    public boolean isCanBargeIn() {
        return canBargeIn;
    }

    /**
     * Sets the value of the canBargeIn property.
     * 
     */
    public void setCanBargeIn(boolean value) {
        this.canBargeIn = value;
    }

    /**
     * Gets the value of the canDrop property.
     * 
     */
    public boolean isCanDrop() {
        return canDrop;
    }

    /**
     * Sets the value of the canDrop property.
     * 
     */
    public void setCanDrop(boolean value) {
        this.canDrop = value;
    }

    /**
     * Gets the value of the canGetAttachedData property.
     * 
     */
    public boolean isCanGetAttachedData() {
        return canGetAttachedData;
    }

    /**
     * Sets the value of the canGetAttachedData property.
     * 
     */
    public void setCanGetAttachedData(boolean value) {
        this.canGetAttachedData = value;
    }

    /**
     * Gets the value of the canGetCallingTerminal property.
     * 
     */
    public boolean isCanGetCallingTerminal() {
        return canGetCallingTerminal;
    }

    /**
     * Sets the value of the canGetCallingTerminal property.
     * 
     */
    public void setCanGetCallingTerminal(boolean value) {
        this.canGetCallingTerminal = value;
    }

    /**
     * Gets the value of the canGetIntrinsics property.
     * 
     */
    public boolean isCanGetIntrinsics() {
        return canGetIntrinsics;
    }

    /**
     * Sets the value of the canGetIntrinsics property.
     * 
     */
    public void setCanGetIntrinsics(boolean value) {
        this.canGetIntrinsics = value;
    }

    /**
     * Gets the value of the canGetInstantMessages property.
     * 
     */
    public boolean isCanGetInstantMessages() {
        return canGetInstantMessages;
    }

    /**
     * Sets the value of the canGetInstantMessages property.
     * 
     */
    public void setCanGetInstantMessages(boolean value) {
        this.canGetInstantMessages = value;
    }

    /**
     * Gets the value of the canGetLastRedirectedAddress property.
     * 
     */
    public boolean isCanGetLastRedirectedAddress() {
        return canGetLastRedirectedAddress;
    }

    /**
     * Sets the value of the canGetLastRedirectedAddress property.
     * 
     */
    public void setCanGetLastRedirectedAddress(boolean value) {
        this.canGetLastRedirectedAddress = value;
    }

    /**
     * Gets the value of the canGetOriginalDestination property.
     * 
     */
    public boolean isCanGetOriginalDestination() {
        return canGetOriginalDestination;
    }

    /**
     * Sets the value of the canGetOriginalDestination property.
     * 
     */
    public void setCanGetOriginalDestination(boolean value) {
        this.canGetOriginalDestination = value;
    }

    /**
     * Gets the value of the canGetUUI property.
     * 
     */
    public boolean isCanGetUUI() {
        return canGetUUI;
    }

    /**
     * Sets the value of the canGetUUI property.
     * 
     */
    public void setCanGetUUI(boolean value) {
        this.canGetUUI = value;
    }

    /**
     * Gets the value of the canObserve property.
     * 
     */
    public boolean isCanObserve() {
        return canObserve;
    }

    /**
     * Sets the value of the canObserve property.
     * 
     */
    public void setCanObserve(boolean value) {
        this.canObserve = value;
    }

    /**
     * Gets the value of the canSetAttachedData property.
     * 
     */
    public boolean isCanSetAttachedData() {
        return canSetAttachedData;
    }

    /**
     * Sets the value of the canSetAttachedData property.
     * 
     */
    public void setCanSetAttachedData(boolean value) {
        this.canSetAttachedData = value;
    }

    /**
     * Gets the value of the canSetIntrinsics property.
     * 
     */
    public boolean isCanSetIntrinsics() {
        return canSetIntrinsics;
    }

    /**
     * Sets the value of the canSetIntrinsics property.
     * 
     */
    public void setCanSetIntrinsics(boolean value) {
        this.canSetIntrinsics = value;
    }

    /**
     * Gets the value of the canSetUUI property.
     * 
     */
    public boolean isCanSetUUI() {
        return canSetUUI;
    }

    /**
     * Sets the value of the canSetUUI property.
     * 
     */
    public void setCanSetUUI(boolean value) {
        this.canSetUUI = value;
    }

    /**
     * Gets the value of the canWhisper property.
     * 
     */
    public boolean isCanWhisper() {
        return canWhisper;
    }

    /**
     * Sets the value of the canWhisper property.
     * 
     */
    public void setCanWhisper(boolean value) {
        this.canWhisper = value;
    }

}
