
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routePointConnectionCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routePointConnectionCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canGiveMusic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGiveRingBack" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGiveSilence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canRoute" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canRetrieveContact" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGetRetrieverAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSetRetrieveStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGiveIvr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGiveRan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGiveOverflow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canGiveBusy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routePointConnectionCapabilities", propOrder = {
    "canGiveMusic",
    "canGiveRingBack",
    "canGiveSilence",
    "canRoute",
    "canRetrieveContact",
    "canGetRetrieverAddress",
    "canSetRetrieveStatus",
    "canGiveIvr",
    "canGiveRan",
    "canGiveOverflow",
    "canGiveBusy"
})
public class RoutePointConnectionCapabilities {

    protected boolean canGiveMusic;
    protected boolean canGiveRingBack;
    protected boolean canGiveSilence;
    protected boolean canRoute;
    protected boolean canRetrieveContact;
    protected boolean canGetRetrieverAddress;
    protected boolean canSetRetrieveStatus;
    protected boolean canGiveIvr;
    protected boolean canGiveRan;
    protected boolean canGiveOverflow;
    protected boolean canGiveBusy;

    /**
     * Gets the value of the canGiveMusic property.
     * 
     */
    public boolean isCanGiveMusic() {
        return canGiveMusic;
    }

    /**
     * Sets the value of the canGiveMusic property.
     * 
     */
    public void setCanGiveMusic(boolean value) {
        this.canGiveMusic = value;
    }

    /**
     * Gets the value of the canGiveRingBack property.
     * 
     */
    public boolean isCanGiveRingBack() {
        return canGiveRingBack;
    }

    /**
     * Sets the value of the canGiveRingBack property.
     * 
     */
    public void setCanGiveRingBack(boolean value) {
        this.canGiveRingBack = value;
    }

    /**
     * Gets the value of the canGiveSilence property.
     * 
     */
    public boolean isCanGiveSilence() {
        return canGiveSilence;
    }

    /**
     * Sets the value of the canGiveSilence property.
     * 
     */
    public void setCanGiveSilence(boolean value) {
        this.canGiveSilence = value;
    }

    /**
     * Gets the value of the canRoute property.
     * 
     */
    public boolean isCanRoute() {
        return canRoute;
    }

    /**
     * Sets the value of the canRoute property.
     * 
     */
    public void setCanRoute(boolean value) {
        this.canRoute = value;
    }

    /**
     * Gets the value of the canRetrieveContact property.
     * 
     */
    public boolean isCanRetrieveContact() {
        return canRetrieveContact;
    }

    /**
     * Sets the value of the canRetrieveContact property.
     * 
     */
    public void setCanRetrieveContact(boolean value) {
        this.canRetrieveContact = value;
    }

    /**
     * Gets the value of the canGetRetrieverAddress property.
     * 
     */
    public boolean isCanGetRetrieverAddress() {
        return canGetRetrieverAddress;
    }

    /**
     * Sets the value of the canGetRetrieverAddress property.
     * 
     */
    public void setCanGetRetrieverAddress(boolean value) {
        this.canGetRetrieverAddress = value;
    }

    /**
     * Gets the value of the canSetRetrieveStatus property.
     * 
     */
    public boolean isCanSetRetrieveStatus() {
        return canSetRetrieveStatus;
    }

    /**
     * Sets the value of the canSetRetrieveStatus property.
     * 
     */
    public void setCanSetRetrieveStatus(boolean value) {
        this.canSetRetrieveStatus = value;
    }

    /**
     * Gets the value of the canGiveIvr property.
     * 
     */
    public boolean isCanGiveIvr() {
        return canGiveIvr;
    }

    /**
     * Sets the value of the canGiveIvr property.
     * 
     */
    public void setCanGiveIvr(boolean value) {
        this.canGiveIvr = value;
    }

    /**
     * Gets the value of the canGiveRan property.
     * 
     */
    public boolean isCanGiveRan() {
        return canGiveRan;
    }

    /**
     * Sets the value of the canGiveRan property.
     * 
     */
    public void setCanGiveRan(boolean value) {
        this.canGiveRan = value;
    }

    /**
     * Gets the value of the canGiveOverflow property.
     * 
     */
    public boolean isCanGiveOverflow() {
        return canGiveOverflow;
    }

    /**
     * Sets the value of the canGiveOverflow property.
     * 
     */
    public void setCanGiveOverflow(boolean value) {
        this.canGiveOverflow = value;
    }

    /**
     * Gets the value of the canGiveBusy property.
     * 
     */
    public boolean isCanGiveBusy() {
        return canGiveBusy;
    }

    /**
     * Sets the value of the canGiveBusy property.
     * 
     */
    public void setCanGiveBusy(boolean value) {
        this.canGiveBusy = value;
    }

}
