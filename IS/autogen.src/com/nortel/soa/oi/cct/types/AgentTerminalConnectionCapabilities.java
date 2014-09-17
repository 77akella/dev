
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentTerminalConnectionCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentTerminalConnectionCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canBlindTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canCompleteConference" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canCompleteTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canEmergency" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGenerateDTMF" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canHold" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canInitiateConference" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canInitiateTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canUnhold" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canConsult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentTerminalConnectionCapabilities", propOrder = {
    "canAnswer",
    "canBlindTransfer",
    "canCompleteConference",
    "canCompleteTransfer",
    "canEmergency",
    "canGenerateDTMF",
    "canHold",
    "canInitiateConference",
    "canInitiateTransfer",
    "canUnhold",
    "canConsult"
})
public class AgentTerminalConnectionCapabilities {

    protected boolean canAnswer;
    protected boolean canBlindTransfer;
    protected boolean canCompleteConference;
    protected boolean canCompleteTransfer;
    protected boolean canEmergency;
    protected boolean canGenerateDTMF;
    protected boolean canHold;
    protected boolean canInitiateConference;
    protected boolean canInitiateTransfer;
    protected boolean canUnhold;
    protected boolean canConsult;

    /**
     * Gets the value of the canAnswer property.
     * 
     */
    public boolean isCanAnswer() {
        return canAnswer;
    }

    /**
     * Sets the value of the canAnswer property.
     * 
     */
    public void setCanAnswer(boolean value) {
        this.canAnswer = value;
    }

    /**
     * Gets the value of the canBlindTransfer property.
     * 
     */
    public boolean isCanBlindTransfer() {
        return canBlindTransfer;
    }

    /**
     * Sets the value of the canBlindTransfer property.
     * 
     */
    public void setCanBlindTransfer(boolean value) {
        this.canBlindTransfer = value;
    }

    /**
     * Gets the value of the canCompleteConference property.
     * 
     */
    public boolean isCanCompleteConference() {
        return canCompleteConference;
    }

    /**
     * Sets the value of the canCompleteConference property.
     * 
     */
    public void setCanCompleteConference(boolean value) {
        this.canCompleteConference = value;
    }

    /**
     * Gets the value of the canCompleteTransfer property.
     * 
     */
    public boolean isCanCompleteTransfer() {
        return canCompleteTransfer;
    }

    /**
     * Sets the value of the canCompleteTransfer property.
     * 
     */
    public void setCanCompleteTransfer(boolean value) {
        this.canCompleteTransfer = value;
    }

    /**
     * Gets the value of the canEmergency property.
     * 
     */
    public boolean isCanEmergency() {
        return canEmergency;
    }

    /**
     * Sets the value of the canEmergency property.
     * 
     */
    public void setCanEmergency(boolean value) {
        this.canEmergency = value;
    }

    /**
     * Gets the value of the canGenerateDTMF property.
     * 
     */
    public boolean isCanGenerateDTMF() {
        return canGenerateDTMF;
    }

    /**
     * Sets the value of the canGenerateDTMF property.
     * 
     */
    public void setCanGenerateDTMF(boolean value) {
        this.canGenerateDTMF = value;
    }

    /**
     * Gets the value of the canHold property.
     * 
     */
    public boolean isCanHold() {
        return canHold;
    }

    /**
     * Sets the value of the canHold property.
     * 
     */
    public void setCanHold(boolean value) {
        this.canHold = value;
    }

    /**
     * Gets the value of the canInitiateConference property.
     * 
     */
    public boolean isCanInitiateConference() {
        return canInitiateConference;
    }

    /**
     * Sets the value of the canInitiateConference property.
     * 
     */
    public void setCanInitiateConference(boolean value) {
        this.canInitiateConference = value;
    }

    /**
     * Gets the value of the canInitiateTransfer property.
     * 
     */
    public boolean isCanInitiateTransfer() {
        return canInitiateTransfer;
    }

    /**
     * Sets the value of the canInitiateTransfer property.
     * 
     */
    public void setCanInitiateTransfer(boolean value) {
        this.canInitiateTransfer = value;
    }

    /**
     * Gets the value of the canUnhold property.
     * 
     */
    public boolean isCanUnhold() {
        return canUnhold;
    }

    /**
     * Sets the value of the canUnhold property.
     * 
     */
    public void setCanUnhold(boolean value) {
        this.canUnhold = value;
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

}
