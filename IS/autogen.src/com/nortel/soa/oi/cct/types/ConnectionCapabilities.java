
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectionCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectionCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canAccept" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canDisconnect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canPark" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canRedirect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canReject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectionCapabilities", propOrder = {
    "canAccept",
    "canAlert",
    "canDisconnect",
    "canPark",
    "canRedirect",
    "canReject"
})
public class ConnectionCapabilities {

    protected boolean canAccept;
    protected boolean canAlert;
    protected boolean canDisconnect;
    protected boolean canPark;
    protected boolean canRedirect;
    protected boolean canReject;

    /**
     * Gets the value of the canAccept property.
     * 
     */
    public boolean isCanAccept() {
        return canAccept;
    }

    /**
     * Sets the value of the canAccept property.
     * 
     */
    public void setCanAccept(boolean value) {
        this.canAccept = value;
    }

    /**
     * Gets the value of the canAlert property.
     * 
     */
    public boolean isCanAlert() {
        return canAlert;
    }

    /**
     * Sets the value of the canAlert property.
     * 
     */
    public void setCanAlert(boolean value) {
        this.canAlert = value;
    }

    /**
     * Gets the value of the canDisconnect property.
     * 
     */
    public boolean isCanDisconnect() {
        return canDisconnect;
    }

    /**
     * Sets the value of the canDisconnect property.
     * 
     */
    public void setCanDisconnect(boolean value) {
        this.canDisconnect = value;
    }

    /**
     * Gets the value of the canPark property.
     * 
     */
    public boolean isCanPark() {
        return canPark;
    }

    /**
     * Sets the value of the canPark property.
     * 
     */
    public void setCanPark(boolean value) {
        this.canPark = value;
    }

    /**
     * Gets the value of the canRedirect property.
     * 
     */
    public boolean isCanRedirect() {
        return canRedirect;
    }

    /**
     * Sets the value of the canRedirect property.
     * 
     */
    public void setCanRedirect(boolean value) {
        this.canRedirect = value;
    }

    /**
     * Gets the value of the canReject property.
     * 
     */
    public boolean isCanReject() {
        return canReject;
    }

    /**
     * Sets the value of the canReject property.
     * 
     */
    public void setCanReject(boolean value) {
        this.canReject = value;
    }

}
