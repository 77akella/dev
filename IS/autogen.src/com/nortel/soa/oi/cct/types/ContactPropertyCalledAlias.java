
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPropertyCalledAlias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPropertyCalledAlias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calledAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPropertyCalledAlias", propOrder = {
    "calledAlias"
})
public class ContactPropertyCalledAlias {

    @XmlElement(required = true)
    protected String calledAlias;

    /**
     * Gets the value of the calledAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledAlias() {
        return calledAlias;
    }

    /**
     * Sets the value of the calledAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledAlias(String value) {
        this.calledAlias = value;
    }

}
