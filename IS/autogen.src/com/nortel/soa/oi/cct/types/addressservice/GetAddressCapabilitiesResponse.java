
package com.nortel.soa.oi.cct.types.addressservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.AddressCapabilities;


/**
 * <p>Java class for GetAddressCapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAddressCapabilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}addressCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAddressCapabilitiesResponse", propOrder = {
    "addressCapabilities"
})
public class GetAddressCapabilitiesResponse {

    @XmlElement(required = true)
    protected AddressCapabilities addressCapabilities;

    /**
     * Gets the value of the addressCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AddressCapabilities }
     *     
     */
    public AddressCapabilities getAddressCapabilities() {
        return addressCapabilities;
    }

    /**
     * Sets the value of the addressCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCapabilities }
     *     
     */
    public void setAddressCapabilities(AddressCapabilities value) {
        this.addressCapabilities = value;
    }

}
