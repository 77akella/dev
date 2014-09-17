
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPropertyCcmId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPropertyCcmId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccmId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPropertyCcmId", propOrder = {
    "ccmId"
})
public class ContactPropertyCcmId {

    protected int ccmId;

    /**
     * Gets the value of the ccmId property.
     * 
     */
    public int getCcmId() {
        return ccmId;
    }

    /**
     * Sets the value of the ccmId property.
     * 
     */
    public void setCcmId(int value) {
        this.ccmId = value;
    }

}
