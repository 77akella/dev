
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPropertyUui complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPropertyUui">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uui" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPropertyUui", propOrder = {
    "uui"
})
public class ContactPropertyUui {

    @XmlElement(required = true)
    protected String uui;

    /**
     * Gets the value of the uui property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUui() {
        return uui;
    }

    /**
     * Sets the value of the uui property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUui(String value) {
        this.uui = value;
    }

}
