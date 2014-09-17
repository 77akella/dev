
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canGetNotReadyReason" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetReadyStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetSupervisor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canLogin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canLogout" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canRetrieve" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetNotReadyReason" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetReadyStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetStaticVoiceTerminal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentCapabilities", propOrder = {
    "canGetNotReadyReason",
    "canGetReadyStatus",
    "canGetSupervisor",
    "canLogin",
    "canLogout",
    "canRetrieve",
    "canSetNotReadyReason",
    "canSetReadyStatus",
    "canSetStaticVoiceTerminal"
})
public class AgentCapabilities {

    protected boolean canGetNotReadyReason;
    protected boolean canGetReadyStatus;
    protected boolean canGetSupervisor;
    protected boolean canLogin;
    protected boolean canLogout;
    protected boolean canRetrieve;
    protected boolean canSetNotReadyReason;
    protected boolean canSetReadyStatus;
    protected boolean canSetStaticVoiceTerminal;

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
     * Gets the value of the canGetSupervisor property.
     * 
     */
    public boolean isCanGetSupervisor() {
        return canGetSupervisor;
    }

    /**
     * Sets the value of the canGetSupervisor property.
     * 
     */
    public void setCanGetSupervisor(boolean value) {
        this.canGetSupervisor = value;
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
     * Gets the value of the canRetrieve property.
     * 
     */
    public boolean isCanRetrieve() {
        return canRetrieve;
    }

    /**
     * Sets the value of the canRetrieve property.
     * 
     */
    public void setCanRetrieve(boolean value) {
        this.canRetrieve = value;
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
     * Gets the value of the canSetStaticVoiceTerminal property.
     * 
     */
    public boolean isCanSetStaticVoiceTerminal() {
        return canSetStaticVoiceTerminal;
    }

    /**
     * Sets the value of the canSetStaticVoiceTerminal property.
     * 
     */
    public void setCanSetStaticVoiceTerminal(boolean value) {
        this.canSetStaticVoiceTerminal = value;
    }

}
