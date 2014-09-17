
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.AddressCapabilities;
import com.nortel.soa.oi.cct.types.AddressProperty;
import com.nortel.soa.oi.cct.types.AddressPropertyAcquireStatus;
import com.nortel.soa.oi.cct.types.AddressPropertyAddressTerminalAssociation;
import com.nortel.soa.oi.cct.types.AddressPropertyDoNotDisturb;
import com.nortel.soa.oi.cct.types.AddressPropertyForwardingArray;
import com.nortel.soa.oi.cct.types.AddressPropertyMessageWaiting;
import com.nortel.soa.oi.cct.types.AddressPropertyPresence;
import com.nortel.soa.oi.cct.types.AddressPropertyUri;


/**
 * 
 * 				This event is fired when a property associated
 * 				with an address changes.
 * 				The event will detail the following;
 * 				    The address property that changed.
 * 				    The address associated with that changed property.
 * 			
 * 
 * <p>Java class for AddressPropertyEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressPropertyEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressProperty" type="{http://www.nortel.com/soa/oi/cct/types}addressProperty"/>
 *         &lt;element name="Address" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *         &lt;element name="AddressCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}addressCapabilities"/>
 *         &lt;element name="AddressPropertyAcquireStatus" type="{http://www.nortel.com/soa/oi/cct/types}addressPropertyAcquireStatus" minOccurs="0"/>
 *         &lt;element name="AddressPropertyAddressTerminalAssociation" type="{http://www.nortel.com/soa/oi/cct/types}addressPropertyAddressTerminalAssociation" minOccurs="0"/>
 *         &lt;element name="AddressPropertyDoNotDisturb" type="{http://www.nortel.com/soa/oi/cct/types}addressPropertyDoNotDisturb" minOccurs="0"/>
 *         &lt;element name="AddressPropertyForwardingArray" type="{http://www.nortel.com/soa/oi/cct/types}addressPropertyForwardingArray" minOccurs="0"/>
 *         &lt;element name="AddressPropertyMessageWaiting" type="{http://www.nortel.com/soa/oi/cct/types}addressPropertyMessageWaiting" minOccurs="0"/>
 *         &lt;element name="AddressPropertyUri" type="{http://www.nortel.com/soa/oi/cct/types}addressPropertyUri" minOccurs="0"/>
 *         &lt;element name="AddressPropertyPresence" type="{http://www.nortel.com/soa/oi/cct/types}addressPropertyPresence" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressPropertyEventType", propOrder = {
    "addressProperty",
    "address",
    "addressCapabilities",
    "addressPropertyAcquireStatus",
    "addressPropertyAddressTerminalAssociation",
    "addressPropertyDoNotDisturb",
    "addressPropertyForwardingArray",
    "addressPropertyMessageWaiting",
    "addressPropertyUri",
    "addressPropertyPresence"
})
public class AddressPropertyEventType {

    @XmlElement(name = "AddressProperty", required = true)
    protected AddressProperty addressProperty;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "AddressCapabilities", required = true)
    protected AddressCapabilities addressCapabilities;
    @XmlElement(name = "AddressPropertyAcquireStatus")
    protected AddressPropertyAcquireStatus addressPropertyAcquireStatus;
    @XmlElement(name = "AddressPropertyAddressTerminalAssociation")
    protected AddressPropertyAddressTerminalAssociation addressPropertyAddressTerminalAssociation;
    @XmlElement(name = "AddressPropertyDoNotDisturb")
    protected AddressPropertyDoNotDisturb addressPropertyDoNotDisturb;
    @XmlElement(name = "AddressPropertyForwardingArray")
    protected AddressPropertyForwardingArray addressPropertyForwardingArray;
    @XmlElement(name = "AddressPropertyMessageWaiting")
    protected AddressPropertyMessageWaiting addressPropertyMessageWaiting;
    @XmlElement(name = "AddressPropertyUri")
    protected AddressPropertyUri addressPropertyUri;
    @XmlElement(name = "AddressPropertyPresence")
    protected AddressPropertyPresence addressPropertyPresence;

    /**
     * Gets the value of the addressProperty property.
     * 
     * @return
     *     possible object is
     *     {@link AddressProperty }
     *     
     */
    public AddressProperty getAddressProperty() {
        return addressProperty;
    }

    /**
     * Sets the value of the addressProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressProperty }
     *     
     */
    public void setAddressProperty(AddressProperty value) {
        this.addressProperty = value;
    }

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

    /**
     * Gets the value of the addressPropertyAcquireStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyAcquireStatus }
     *     
     */
    public AddressPropertyAcquireStatus getAddressPropertyAcquireStatus() {
        return addressPropertyAcquireStatus;
    }

    /**
     * Sets the value of the addressPropertyAcquireStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyAcquireStatus }
     *     
     */
    public void setAddressPropertyAcquireStatus(AddressPropertyAcquireStatus value) {
        this.addressPropertyAcquireStatus = value;
    }

    /**
     * Gets the value of the addressPropertyAddressTerminalAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyAddressTerminalAssociation }
     *     
     */
    public AddressPropertyAddressTerminalAssociation getAddressPropertyAddressTerminalAssociation() {
        return addressPropertyAddressTerminalAssociation;
    }

    /**
     * Sets the value of the addressPropertyAddressTerminalAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyAddressTerminalAssociation }
     *     
     */
    public void setAddressPropertyAddressTerminalAssociation(AddressPropertyAddressTerminalAssociation value) {
        this.addressPropertyAddressTerminalAssociation = value;
    }

    /**
     * Gets the value of the addressPropertyDoNotDisturb property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyDoNotDisturb }
     *     
     */
    public AddressPropertyDoNotDisturb getAddressPropertyDoNotDisturb() {
        return addressPropertyDoNotDisturb;
    }

    /**
     * Sets the value of the addressPropertyDoNotDisturb property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyDoNotDisturb }
     *     
     */
    public void setAddressPropertyDoNotDisturb(AddressPropertyDoNotDisturb value) {
        this.addressPropertyDoNotDisturb = value;
    }

    /**
     * Gets the value of the addressPropertyForwardingArray property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyForwardingArray }
     *     
     */
    public AddressPropertyForwardingArray getAddressPropertyForwardingArray() {
        return addressPropertyForwardingArray;
    }

    /**
     * Sets the value of the addressPropertyForwardingArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyForwardingArray }
     *     
     */
    public void setAddressPropertyForwardingArray(AddressPropertyForwardingArray value) {
        this.addressPropertyForwardingArray = value;
    }

    /**
     * Gets the value of the addressPropertyMessageWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyMessageWaiting }
     *     
     */
    public AddressPropertyMessageWaiting getAddressPropertyMessageWaiting() {
        return addressPropertyMessageWaiting;
    }

    /**
     * Sets the value of the addressPropertyMessageWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyMessageWaiting }
     *     
     */
    public void setAddressPropertyMessageWaiting(AddressPropertyMessageWaiting value) {
        this.addressPropertyMessageWaiting = value;
    }

    /**
     * Gets the value of the addressPropertyUri property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyUri }
     *     
     */
    public AddressPropertyUri getAddressPropertyUri() {
        return addressPropertyUri;
    }

    /**
     * Sets the value of the addressPropertyUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyUri }
     *     
     */
    public void setAddressPropertyUri(AddressPropertyUri value) {
        this.addressPropertyUri = value;
    }

    /**
     * Gets the value of the addressPropertyPresence property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPropertyPresence }
     *     
     */
    public AddressPropertyPresence getAddressPropertyPresence() {
        return addressPropertyPresence;
    }

    /**
     * Sets the value of the addressPropertyPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPropertyPresence }
     *     
     */
    public void setAddressPropertyPresence(AddressPropertyPresence value) {
        this.addressPropertyPresence = value;
    }

}
