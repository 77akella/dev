
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPropertyCallingTerminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPropertyCallingTerminal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callingTerminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPropertyCallingTerminal", propOrder = {
    "callingTerminal"
})
public class ContactPropertyCallingTerminal {

    @XmlElement(required = true)
    protected Terminal callingTerminal;

    /**
     * Gets the value of the callingTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getCallingTerminal() {
        return callingTerminal;
    }

    /**
     * Sets the value of the callingTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setCallingTerminal(Terminal value) {
        this.callingTerminal = value;
    }

}
