
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentTerminalCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentTerminalCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canCallSupervisor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canForcedAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetActivityCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetNotReadyReason" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetReadyStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canLogin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canLogout" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetActivityCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetNotReadyReason" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetReadyStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "agentTerminalCapabilities", propOrder = {
    "canCallSupervisor",
    "canForcedAnswer",
    "canGetActivityCode",
    "canGetNotReadyReason",
    "canGetReadyStatus",
    "canLogin",
    "canLogout",
    "canSetActivityCode",
    "canSetNotReadyReason",
    "canSetReadyStatus",
    "canConference",
    "canConsult",
    "canDoNotDisturb",
    "canForward",
    "canOriginate",
    "canPickup",
    "canPickupFromGroup",
    "canTransfer"
})
public class AgentTerminalCapabilities {

    protected boolean canCallSupervisor;
    protected boolean canForcedAnswer;
    protected boolean canGetActivityCode;
    protected boolean canGetNotReadyReason;
    protected boolean canGetReadyStatus;
    protected boolean canLogin;
    protected boolean canLogout;
    protected boolean canSetActivityCode;
    protected boolean canSetNotReadyReason;
    protected boolean canSetReadyStatus;
    protected boolean canConference;
    protected boolean canConsult;
    protected boolean canDoNotDisturb;
    protected boolean canForward;
    protected boolean canOriginate;
    protected boolean canPickup;
    protected boolean canPickupFromGroup;
    protected boolean canTransfer;

    /**
     * Gets the value of the canCallSupervisor property.
     * 
     */
    public boolean isCanCallSupervisor() {
        return canCallSupervisor;
    }

    /**
     * Sets the value of the canCallSupervisor property.
     * 
     */
    public void setCanCallSupervisor(boolean value) {
        this.canCallSupervisor = value;
    }

    /**
     * Gets the value of the canForcedAnswer property.
     * 
     */
    public boolean isCanForcedAnswer() {
        return canForcedAnswer;
    }

    /**
     * Sets the value of the canForcedAnswer property.
     * 
     */
    public void setCanForcedAnswer(boolean value) {
        this.canForcedAnswer = value;
    }

    /**
     * Gets the value of the canGetActivityCode property.
     * 
     */
    public boolean isCanGetActivityCode() {
        return canGetActivityCode;
    }

    /**
     * Sets the value of the canGetActivityCode property.
     * 
     */
    public void setCanGetActivityCode(boolean value) {
        this.canGetActivityCode = value;
    }

    /**
     * Gets the value of the canGetNotReadyReason property.
     * 
     */
    public boolean isCanGetNotReadyReason() {
        return canGetNotReadyReason;
    }

    /**
     * Sets the value of the canGetNotReadyReason property.
     * 
     */
    public void setCanGetNotReadyReason(boolean value) {
        this.canGetNotReadyReason = value;
    }

    /**
     * Gets the value of the canGetReadyStatus property.
     * 
     */
    public boolean isCanGetReadyStatus() {
        return canGetReadyStatus;
    }

    /**
     * Sets the value of the canGetReadyStatus property.
     * 
     */
    public void setCanGetReadyStatus(boolean value) {
        this.canGetReadyStatus = value;
    }

    /**
     * Gets the value of the canLogin property.
     * 
     */
    public boolean isCanLogin() {
        return canLogin;
    }

    /**
     * Sets the value of the canLogin property.
     * 
     */
    public void setCanLogin(boolean value) {
        this.canLogin = value;
    }

    /**
     * Gets the value of the canLogout property.
     * 
     */
    public boolean isCanLogout() {
        return canLogout;
    }

    /**
     * Sets the value of the canLogout property.
     * 
     */
    public void setCanLogout(boolean value) {
        this.canLogout = value;
    }

    /**
     * Gets the value of the canSetActivityCode property.
     * 
     */
    public boolean isCanSetActivityCode() {
        return canSetActivityCode;
    }

    /**
     * Sets the value of the canSetActivityCode property.
     * 
     */
    public void setCanSetActivityCode(boolean value) {
        this.canSetActivityCode = value;
    }

    /**
     * Gets the value of the canSetNotReadyReason property.
     * 
     */
    public boolean isCanSetNotReadyReason() {
        return canSetNotReadyReason;
    }

    /**
     * Sets the value of the canSetNotReadyReason property.
     * 
     */
    public void setCanSetNotReadyReason(boolean value) {
        this.canSetNotReadyReason = value;
    }

    /**
     * Gets the value of the canSetReadyStatus property.
     * 
     */
    public boolean isCanSetReadyStatus() {
        return canSetReadyStatus;
    }

    /**
     * Sets the value of the canSetReadyStatus property.
     * 
     */
    public void setCanSetReadyStatus(boolean value) {
        this.canSetReadyStatus = value;
    }

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
