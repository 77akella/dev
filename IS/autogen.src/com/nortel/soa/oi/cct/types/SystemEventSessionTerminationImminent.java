
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemEventSessionTerminationImminent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemEventSessionTerminationImminent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remainingTimeInMillis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemEventSessionTerminationImminent", propOrder = {
    "remainingTimeInMillis"
})
public class SystemEventSessionTerminationImminent {

    protected long remainingTimeInMillis;

    /**
     * Gets the value of the remainingTimeInMillis property.
     * 
     */
    public long getRemainingTimeInMillis() {
        return remainingTimeInMillis;
    }

    /**
     * Sets the value of the remainingTimeInMillis property.
     * 
     */
    public void setRemainingTimeInMillis(long value) {
        this.remainingTimeInMillis = value;
    }

}
