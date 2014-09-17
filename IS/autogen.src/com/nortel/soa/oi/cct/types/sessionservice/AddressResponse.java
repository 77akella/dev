
package com.nortel.soa.oi.cct.types.sessionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;


/**
 * <p>Java class for AddressResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressResponse" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressResponse", propOrder = {
    "addressResponse"
})
public class AddressResponse {

    @XmlElement(required = true)
    protected Address addressResponse;

    /**
     * Gets the value of the addressResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddressResponse() {
        return addressResponse;
    }

    /**
     * Sets the value of the addressResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddressResponse(Address value) {
        this.addressResponse = value;
    }

}
