
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminalCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terminalCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canConference" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canConsult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canDoNotDisturb" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canForward" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canOriginate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canPickup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canPickupFromGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terminalCapabilities", propOrder = {
    "canConference",
    "canConsult",
    "canDoNotDisturb",
    "canForward",
    "canOriginate",
    "canPickup",
    "canPickupFromGroup",
    "canTransfer"
})
public class TerminalCapabilities {

    protected boolean canConference;
    protected boolean canConsult;
    protected boolean canDoNotDisturb;
    protected boolean canForward;
    protected boolean canOriginate;
    protected boolean canPickup;
    protected boolean canPickupFromGroup;
    protected boolean canTransfer;

    /**
     * Gets the value of the canConference property.
     * 
     */
    public boolean isCanConference() {
        return canConference;
    }

    /**
     * Sets the value of the canConference property.
     * 
     */
    public void setCanConference(boolean value) {
        this.canConference = value;
    }

    /**
     * Gets the value of the canConsult property.
     * 
     */
    public boolean isCanConsult() {
        return canConsult;
    }

    /**
     * Sets the value of the canConsult property.
     * 
     */
    public void setCanConsult(boolean value) {
        this.canConsult = value;
    }

    /**
     * Gets the value of the canDoNotDisturb property.
     * 
     */
    public boolean isCanDoNotDisturb() {
        return canDoNotDisturb;
    }

    /**
     * Sets the value of the canDoNotDisturb property.
     * 
     */
    public void setCanDoNotDisturb(boolean value) {
        this.canDoNotDisturb = value;
    }

    /**
     * Gets the value of the canForward property.
     * 
     */
    public boolean isCanForward() {
        return canForward;
    }

    /**
     * Sets the value of the canForward property.
     * 
     */
    public void setCanForward(boolean value) {
        this.canForward = value;
    }

    /**
     * Gets the value of the canOriginate property.
     * 
     */
    public boolean isCanOriginate() {
        return canOriginate;
    }

    /**
     * Sets the value of the canOriginate property.
     * 
     */
    public void setCanOriginate(boolean value) {
        this.canOriginate = value;
    }

    /**
     * Gets the value of the canPickup property.
     * 
     */
    public boolean isCanPickup() {
        return canPickup;
    }

    /**
     * Sets the value of the canPickup property.
     * 
     */
    public void setCanPickup(boolean value) {
        this.canPickup = value;
    }

    /**
     * Gets the value of the canPickupFromGroup property.
     * 
     */
    public boolean isCanPickupFromGroup() {
        return canPickupFromGroup;
    }

    /**
     * Sets the value of the canPickupFromGroup property.
     * 
     */
    public void setCanPickupFromGroup(boolean value) {
        this.canPickupFromGroup = value;
    }

    /**
     * Gets the value of the canTransfer property.
     * 
     */
    public boolean isCanTransfer() {
        return canTransfer;
    }

    /**
     * Sets the value of the canTransfer property.
     * 
     */
    public void setCanTransfer(boolean value) {
        this.canTransfer = value;
    }

}
