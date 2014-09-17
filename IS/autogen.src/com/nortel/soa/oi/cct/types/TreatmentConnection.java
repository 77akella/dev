
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for treatmentConnection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="treatmentConnection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="treatmentConnectionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "treatmentConnection", propOrder = {
    "treatmentConnectionId"
})
public class TreatmentConnection {

    @XmlElement(required = true)
    protected String treatmentConnectionId;

    /**
     * Gets the value of the treatmentConnectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatmentConnectionId() {
        return treatmentConnectionId;
    }

    /**
     * Sets the value of the treatmentConnectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatmentConnectionId(String value) {
        this.treatmentConnectionId = value;
    }

}
