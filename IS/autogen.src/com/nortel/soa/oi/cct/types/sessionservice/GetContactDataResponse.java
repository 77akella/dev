
package com.nortel.soa.oi.cct.types.sessionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.AttachedData;


/**
 * <p>Java class for GetContactDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContactDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactData" type="{http://www.nortel.com/soa/oi/cct/types}attachedData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContactDataResponse", propOrder = {
    "contactData"
})
public class GetContactDataResponse {

    @XmlElement(required = true)
    protected AttachedData contactData;

    /**
     * Gets the value of the contactData property.
     * 
     * @return
     *     possible object is
     *     {@link AttachedData }
     *     
     */
    public AttachedData getContactData() {
        return contactData;
    }

    /**
     * Sets the value of the contactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedData }
     *     
     */
    public void setContactData(AttachedData value) {
        this.contactData = value;
    }

}
