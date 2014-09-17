
package com.nortel.soa.oi.cct.notification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectionFailureNotificationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SessionTerminationNotificationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SessionTerminationImminentNotificationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SubscriptionTerminationNotificationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SubscriptionTerminationImminentNotificationsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionPolicyType", propOrder = {
    "connectionFailureNotificationsEnabled",
    "sessionTerminationNotificationsEnabled",
    "sessionTerminationImminentNotificationsEnabled",
    "subscriptionTerminationNotificationsEnabled",
    "subscriptionTerminationImminentNotificationsEnabled"
})
public class SubscriptionPolicyType {

    @XmlElement(name = "ConnectionFailureNotificationsEnabled")
    protected boolean connectionFailureNotificationsEnabled;
    @XmlElement(name = "SessionTerminationNotificationsEnabled")
    protected boolean sessionTerminationNotificationsEnabled;
    @XmlElement(name = "SessionTerminationImminentNotificationsEnabled")
    protected boolean sessionTerminationImminentNotificationsEnabled;
    @XmlElement(name = "SubscriptionTerminationNotificationsEnabled")
    protected boolean subscriptionTerminationNotificationsEnabled;
    @XmlElement(name = "SubscriptionTerminationImminentNotificationsEnabled")
    protected boolean subscriptionTerminationImminentNotificationsEnabled;

    /**
     * Gets the value of the connectionFailureNotificationsEnabled property.
     * 
     */
    public boolean isConnectionFailureNotificationsEnabled() {
        return connectionFailureNotificationsEnabled;
    }

    /**
     * Sets the value of the connectionFailureNotificationsEnabled property.
     * 
     */
    public void setConnectionFailureNotificationsEnabled(boolean value) {
        this.connectionFailureNotificationsEnabled = value;
    }

    /**
     * Gets the value of the sessionTerminationNotificationsEnabled property.
     * 
     */
    public boolean isSessionTerminationNotificationsEnabled() {
        return sessionTerminationNotificationsEnabled;
    }

    /**
     * Sets the value of the sessionTerminationNotificationsEnabled property.
     * 
     */
    public void setSessionTerminationNotificationsEnabled(boolean value) {
        this.sessionTerminationNotificationsEnabled = value;
    }

    /**
     * Gets the value of the sessionTerminationImminentNotificationsEnabled property.
     * 
     */
    public boolean isSessionTerminationImminentNotificationsEnabled() {
        return sessionTerminationImminentNotificationsEnabled;
    }

    /**
     * Sets the value of the sessionTerminationImminentNotificationsEnabled property.
     * 
     */
    public void setSessionTerminationImminentNotificationsEnabled(boolean value) {
        this.sessionTerminationImminentNotificationsEnabled = value;
    }

    /**
     * Gets the value of the subscriptionTerminationNotificationsEnabled property.
     * 
     */
    public boolean isSubscriptionTerminationNotificationsEnabled() {
        return subscriptionTerminationNotificationsEnabled;
    }

    /**
     * Sets the value of the subscriptionTerminationNotificationsEnabled property.
     * 
     */
    public void setSubscriptionTerminationNotificationsEnabled(boolean value) {
        this.subscriptionTerminationNotificationsEnabled = value;
    }

    /**
     * Gets the value of the subscriptionTerminationImminentNotificationsEnabled property.
     * 
     */
    public boolean isSubscriptionTerminationImminentNotificationsEnabled() {
        return subscriptionTerminationImminentNotificationsEnabled;
    }

    /**
     * Sets the value of the subscriptionTerminationImminentNotificationsEnabled property.
     * 
     */
    public void setSubscriptionTerminationImminentNotificationsEnabled(boolean value) {
        this.subscriptionTerminationImminentNotificationsEnabled = value;
    }

}
