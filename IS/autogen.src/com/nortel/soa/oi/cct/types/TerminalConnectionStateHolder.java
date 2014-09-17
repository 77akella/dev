
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminalConnectionStateHolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terminalConnectionStateHolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnectionState"/>
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
@XmlType(name = "terminalConnectionStateHolder", propOrder = {
    "state",
    "entranceTime",
    "reasonCode"
})
public class TerminalConnectionStateHolder {

    @XmlElement(required = true)
    protected TerminalConnectionState state;
    protected long entranceTime;
    @XmlElement(required = true)
    protected Reason reasonCode;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionState }
     *     
     */
    public TerminalConnectionState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionState }
     *     
     */
    public void setState(TerminalConnectionState value) {
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
