
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectionStateHolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectionStateHolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://www.nortel.com/soa/oi/cct/types}connectionState"/>
 *         &lt;element name="entranceTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="reasonCode" type="{http://www.nortel.com/soa/oi/cct/types}reason"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectionStateHolder", propOrder = {
    "state",
    "entranceTime",
    "reasonCode"
})
public class ConnectionStateHolder {

    @XmlElement(required = true)
    protected ConnectionState state;
    protected long entranceTime;
    @XmlElement(required = true)
    protected Reason reasonCode;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionState }
     *     
     */
    public ConnectionState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionState }
     *     
     */
    public void setState(ConnectionState value) {
        this.state = value;
    }

    /**
     * Gets the value of the entranceTime property.
     * 
     */
    public long getEntranceTime() {
        return entranceTime;
    }

    /**
     * Sets the value of the entranceTime property.
     * 
     */
    public void setEntranceTime(long value) {
        this.entranceTime = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Reason }
     *     
     */
    public Reason getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason }
     *     
     */
    public void setReasonCode(Reason value) {
        this.reasonCode = value;
    }

}
