
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemEventConnectionFailure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="systemEventConnectionFailure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="downTimeInMillis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalFailures" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consecutiveFailures" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemEventConnectionFailure", propOrder = {
    "downTimeInMillis",
    "totalFailures",
    "consecutiveFailures"
})
public class SystemEventConnectionFailure {

    protected long downTimeInMillis;
    protected int totalFailures;
    protected int consecutiveFailures;

    /**
     * Gets the value of the downTimeInMillis property.
     * 
     */
    public long getDownTimeInMillis() {
        return downTimeInMillis;
    }

    /**
     * Sets the value of the downTimeInMillis property.
     * 
     */
    public void setDownTimeInMillis(long value) {
        this.downTimeInMillis = value;
    }

    /**
     * Gets the value of the totalFailures property.
     * 
     */
    public int getTotalFailures() {
        return totalFailures;
    }

    /**
     * Sets the value of the totalFailures property.
     * 
     */
    public void setTotalFailures(int value) {
        this.totalFailures = value;
    }

    /**
     * Gets the value of the consecutiveFailures property.
     * 
     */
    public int getConsecutiveFailures() {
        return consecutiveFailures;
    }

    /**
     * Sets the value of the consecutiveFailures property.
     * 
     */
    public void setConsecutiveFailures(int value) {
        this.consecutiveFailures = value;
    }

}
