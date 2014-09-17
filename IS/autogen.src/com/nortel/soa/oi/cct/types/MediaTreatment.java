
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaTreatment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mediaTreatment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="treatmentAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="treatmentTerminal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="treatmentParameter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interruptible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mediaTreatment", propOrder = {
    "treatmentAddress",
    "treatmentTerminal",
    "treatmentParameter",
    "type",
    "interruptible"
})
public class MediaTreatment {

    @XmlElement(required = true)
    protected String treatmentAddress;
    @XmlElement(required = true)
    protected String treatmentTerminal;
    @XmlElement(required = true)
    protected String treatmentParameter;
    @XmlElement(required = true)
    protected String type;
    protected boolean interruptible;

    /**
     * Gets the value of the treatmentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatmentAddress() {
        return treatmentAddress;
    }

    /**
     * Sets the value of the treatmentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatmentAddress(String value) {
        this.treatmentAddress = value;
    }

    /**
     * Gets the value of the treatmentTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatmentTerminal() {
        return treatmentTerminal;
    }

    /**
     * Sets the value of the treatmentTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatmentTerminal(String value) {
        this.treatmentTerminal = value;
    }

    /**
     * Gets the value of the treatmentParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatmentParameter() {
        return treatmentParameter;
    }

    /**
     * Sets the value of the treatmentParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatmentParameter(String value) {
        this.treatmentParameter = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the interruptible property.
     * 
     */
    public boolean isInterruptible() {
        return interruptible;
    }

    /**
     * Sets the value of the interruptible property.
     * 
     */
    public void setInterruptible(boolean value) {
        this.interruptible = value;
    }

}
