
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressPropertyAcquireStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressPropertyAcquireStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acquired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressPropertyAcquireStatus", propOrder = {
    "acquired"
})
public class AddressPropertyAcquireStatus {

    protected boolean acquired;

    /**
     * Gets the value of the acquired property.
     * 
     */
    public boolean isAcquired() {
        return acquired;
    }

    /**
     * Sets the value of the acquired property.
     * 
     */
    public void setAcquired(boolean value) {
        this.acquired = value;
    }

}
