
package com.nortel.soa.oi.cct.types.contactservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.ContactCapabilities;


/**
 * <p>Java class for GetContactCapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetContactCapabilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}contactCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetContactCapabilitiesResponse", propOrder = {
    "contactCapabilities"
})
public class GetContactCapabilitiesResponse {

    @XmlElement(required = true)
    protected ContactCapabilities contactCapabilities;

    /**
     * Gets the value of the contactCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ContactCapabilities }
     *     
     */
    public ContactCapabilities getContactCapabilities() {
        return contactCapabilities;
    }

    /**
     * Sets the value of the contactCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactCapabilities }
     *     
     */
    public void setContactCapabilities(ContactCapabilities value) {
        this.contactCapabilities = value;
    }

}
