
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPropertySpExternalId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPropertySpExternalId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spExternalId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPropertySpExternalId", propOrder = {
    "spExternalId"
})
public class ContactPropertySpExternalId {

    @XmlElement(required = true)
    protected String spExternalId;

    /**
     * Gets the value of the spExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpExternalId() {
        return spExternalId;
    }

    /**
     * Sets the value of the spExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpExternalId(String value) {
        this.spExternalId = value;
    }

}
