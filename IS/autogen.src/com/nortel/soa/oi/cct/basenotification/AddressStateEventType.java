
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.AddressCapabilities;
import com.nortel.soa.oi.cct.types.ResourceState;


/**
 * 
 * 				This event is fired when an Addresses state changes.
 * 				The event will detail the following;
 * 					The address associated with the notification
 * 				    That addresses state 
 * 				    The reason associated with the state
 * 			
 * 
 * <p>Java class for AddressStateEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressStateEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *         &lt;element name="State" type="{http://www.nortel.com/soa/oi/cct/types}resourceState"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AddressCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}addressCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressStateEventType", propOrder = {
    "address",
    "state",
    "reason",
    "addressCapabilities"
})
public class AddressStateEventType {

    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "State", required = true)
    protected ResourceState state;
    @XmlElement(name = "Reason", required = true)
    protected String reason;
    @XmlElement(name = "AddressCapabilities", required = true)
    protected AddressCapabilities addressCapabilities;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceState }
     *     
     */
    public ResourceState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceState }
     *     
     */
    public void setState(ResourceState value) {
        this.state = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

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
