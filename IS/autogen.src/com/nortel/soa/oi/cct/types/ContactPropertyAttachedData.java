
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPropertyAttachedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPropertyAttachedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachedData" type="{http://www.nortel.com/soa/oi/cct/types}attachedData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPropertyAttachedData", propOrder = {
    "attachedData"
})
public class ContactPropertyAttachedData {

    @XmlElement(required = true)
    protected AttachedData attachedData;

    /**
     * Gets the value of the attachedData property.
     * 
     * @return
     *     possible object is
     *     {@link AttachedData }
     *     
     */
    public AttachedData getAttachedData() {
        return attachedData;
    }

    /**
     * Sets the value of the attachedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedData }
     *     
     */
    public void setAttachedData(AttachedData value) {
        this.attachedData = value;
    }

}
