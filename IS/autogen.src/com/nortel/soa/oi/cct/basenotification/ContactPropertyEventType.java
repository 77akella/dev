
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.Contact;
import com.nortel.soa.oi.cct.types.ContactCapabilities;
import com.nortel.soa.oi.cct.types.ContactProperty;
import com.nortel.soa.oi.cct.types.ContactPropertyAttachedData;
import com.nortel.soa.oi.cct.types.ContactPropertyCalledAddress;
import com.nortel.soa.oi.cct.types.ContactPropertyCalledAlias;
import com.nortel.soa.oi.cct.types.ContactPropertyCallingAddress;
import com.nortel.soa.oi.cct.types.ContactPropertyCallingTerminal;
import com.nortel.soa.oi.cct.types.ContactPropertyCcmId;
import com.nortel.soa.oi.cct.types.ContactPropertyContactTypeArray;
import com.nortel.soa.oi.cct.types.ContactPropertyIntrinsicArray;
import com.nortel.soa.oi.cct.types.ContactPropertyLastRedirectedAddress;
import com.nortel.soa.oi.cct.types.ContactPropertyNetworkDialledAddress;
import com.nortel.soa.oi.cct.types.ContactPropertyNodeId;
import com.nortel.soa.oi.cct.types.ContactPropertyRoute;
import com.nortel.soa.oi.cct.types.ContactPropertySourceSiteGroupId;
import com.nortel.soa.oi.cct.types.ContactPropertySpExternalId;
import com.nortel.soa.oi.cct.types.ContactPropertyTargetAgentPositionId;
import com.nortel.soa.oi.cct.types.ContactPropertyUui;


/**
 * 
 * 				This event is fired when a property associated
 * 				with a contact changes.
 * 				The event will detail the following;
 * 				    The contact property that changed.
 * 				    The contact associated with that changed property.
 * 			
 * 
 * <p>Java class for ContactPropertyEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPropertyEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactProperty" type="{http://www.nortel.com/soa/oi/cct/types}contactProperty"/>
 *         &lt;element name="Address" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *         &lt;element name="Contact" type="{http://www.nortel.com/soa/oi/cct/types}contact"/>
 *         &lt;element name="ContactCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}contactCapabilities"/>
 *         &lt;element name="ContactPropertyAttachedData" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyAttachedData" minOccurs="0"/>
 *         &lt;element name="ContactPropertyNetworkDialledAddress" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyNetworkDialledAddress" minOccurs="0"/>
 *         &lt;element name="ContactPropertySpExternalId" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertySpExternalId" minOccurs="0"/>
 *         &lt;element name="ContactPropertyUui" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyUui" minOccurs="0"/>
 *         &lt;element name="ContactPropertyContactTypeArray" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyContactTypeArray" minOccurs="0"/>
 *         &lt;element name="ContactPropertyCalledAlias" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyCalledAlias" minOccurs="0"/>
 *         &lt;element name="ContactPropertyCalledAddress" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyCalledAddress" minOccurs="0"/>
 *         &lt;element name="ContactPropertyCallingAddress" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyCallingAddress" minOccurs="0"/>
 *         &lt;element name="ContactPropertyCallingTerminal" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyCallingTerminal" minOccurs="0"/>
 *         &lt;element name="ContactPropertyLastRedirectedAddress" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyLastRedirectedAddress" minOccurs="0"/>
 *         &lt;element name="ContactPropertyCcmId" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyCcmId" minOccurs="0"/>
 *         &lt;element name="ContactPropertyIntrinsicArray" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyIntrinsicArray" minOccurs="0"/>
 *         &lt;element name="ContactPropertyRoute" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyRoute" minOccurs="0"/>
 *         &lt;element name="ContactPropertyNodeId" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyNodeId" minOccurs="0"/>
 *         &lt;element name="ContactPropertySourceSiteGroupId" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertySourceSiteGroupId" minOccurs="0"/>
 *         &lt;element name="ContactPropertyTargetAgentPositionId" type="{http://www.nortel.com/soa/oi/cct/types}contactPropertyTargetAgentPositionId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPropertyEventType", propOrder = {
    "contactProperty",
    "address",
    "contact",
    "contactCapabilities",
    "contactPropertyAttachedData",
    "contactPropertyNetworkDialledAddress",
    "contactPropertySpExternalId",
    "contactPropertyUui",
    "contactPropertyContactTypeArray",
    "contactPropertyCalledAlias",
    "contactPropertyCalledAddress",
    "contactPropertyCallingAddress",
    "contactPropertyCallingTerminal",
    "contactPropertyLastRedirectedAddress",
    "contactPropertyCcmId",
    "contactPropertyIntrinsicArray",
    "contactPropertyRoute",
    "contactPropertyNodeId",
    "contactPropertySourceSiteGroupId",
    "contactPropertyTargetAgentPositionId"
})
public class ContactPropertyEventType {

    @XmlElement(name = "ContactProperty", required = true)
    protected ContactProperty contactProperty;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "Contact", required = true)
    protected Contact contact;
    @XmlElement(name = "ContactCapabilities", required = true)
    protected ContactCapabilities contactCapabilities;
    @XmlElement(name = "ContactPropertyAttachedData")
    protected ContactPropertyAttachedData contactPropertyAttachedData;
    @XmlElement(name = "ContactPropertyNetworkDialledAddress")
    protected ContactPropertyNetworkDialledAddress contactPropertyNetworkDialledAddress;
    @XmlElement(name = "ContactPropertySpExternalId")
    protected ContactPropertySpExternalId contactPropertySpExternalId;
    @XmlElement(name = "ContactPropertyUui")
    protected ContactPropertyUui contactPropertyUui;
    @XmlElement(name = "ContactPropertyContactTypeArray")
    protected ContactPropertyContactTypeArray contactPropertyContactTypeArray;
    @XmlElement(name = "ContactPropertyCalledAlias")
    protected ContactPropertyCalledAlias contactPropertyCalledAlias;
    @XmlElement(name = "ContactPropertyCalledAddress")
    protected ContactPropertyCalledAddress contactPropertyCalledAddress;
    @XmlElement(name = "ContactPropertyCallingAddress")
    protected ContactPropertyCallingAddress contactPropertyCallingAddress;
    @XmlElement(name = "ContactPropertyCallingTerminal")
    protected ContactPropertyCallingTerminal contactPropertyCallingTerminal;
    @XmlElement(name = "ContactPropertyLastRedirectedAddress")
    protected ContactPropertyLastRedirectedAddress contactPropertyLastRedirectedAddress;
    @XmlElement(name = "ContactPropertyCcmId")
    protected ContactPropertyCcmId contactPropertyCcmId;
    @XmlElement(name = "ContactPropertyIntrinsicArray")
    protected ContactPropertyIntrinsicArray contactPropertyIntrinsicArray;
    @XmlElement(name = "ContactPropertyRoute")
    protected ContactPropertyRoute contactPropertyRoute;
    @XmlElement(name = "ContactPropertyNodeId")
    protected ContactPropertyNodeId contactPropertyNodeId;
    @XmlElement(name = "ContactPropertySourceSiteGroupId")
    protected ContactPropertySourceSiteGroupId contactPropertySourceSiteGroupId;
    @XmlElement(name = "ContactPropertyTargetAgentPositionId")
    protected ContactPropertyTargetAgentPositionId contactPropertyTargetAgentPositionId;

    /**
     * Gets the value of the contactProperty property.
     * 
     * @return
     *     possible object is
     *     {@link ContactProperty }
     *     
     */
    public ContactProperty getContactProperty() {
        return contactProperty;
    }

    /**
     * Sets the value of the contactProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactProperty }
     *     
     */
    public void setContactProperty(ContactProperty value) {
        this.contactProperty = value;
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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

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

    /**
     * Gets the value of the contactPropertyAttachedData property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyAttachedData }
     *     
     */
    public ContactPropertyAttachedData getContactPropertyAttachedData() {
        return contactPropertyAttachedData;
    }

    /**
     * Sets the value of the contactPropertyAttachedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyAttachedData }
     *     
     */
    public void setContactPropertyAttachedData(ContactPropertyAttachedData value) {
        this.contactPropertyAttachedData = value;
    }

    /**
     * Gets the value of the contactPropertyNetworkDialledAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyNetworkDialledAddress }
     *     
     */
    public ContactPropertyNetworkDialledAddress getContactPropertyNetworkDialledAddress() {
        return contactPropertyNetworkDialledAddress;
    }

    /**
     * Sets the value of the contactPropertyNetworkDialledAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyNetworkDialledAddress }
     *     
     */
    public void setContactPropertyNetworkDialledAddress(ContactPropertyNetworkDialledAddress value) {
        this.contactPropertyNetworkDialledAddress = value;
    }

    /**
     * Gets the value of the contactPropertySpExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertySpExternalId }
     *     
     */
    public ContactPropertySpExternalId getContactPropertySpExternalId() {
        return contactPropertySpExternalId;
    }

    /**
     * Sets the value of the contactPropertySpExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertySpExternalId }
     *     
     */
    public void setContactPropertySpExternalId(ContactPropertySpExternalId value) {
        this.contactPropertySpExternalId = value;
    }

    /**
     * Gets the value of the contactPropertyUui property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyUui }
     *     
     */
    public ContactPropertyUui getContactPropertyUui() {
        return contactPropertyUui;
    }

    /**
     * Sets the value of the contactPropertyUui property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyUui }
     *     
     */
    public void setContactPropertyUui(ContactPropertyUui value) {
        this.contactPropertyUui = value;
    }

    /**
     * Gets the value of the contactPropertyContactTypeArray property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyContactTypeArray }
     *     
     */
    public ContactPropertyContactTypeArray getContactPropertyContactTypeArray() {
        return contactPropertyContactTypeArray;
    }

    /**
     * Sets the value of the contactPropertyContactTypeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyContactTypeArray }
     *     
     */
    public void setContactPropertyContactTypeArray(ContactPropertyContactTypeArray value) {
        this.contactPropertyContactTypeArray = value;
    }

    /**
     * Gets the value of the contactPropertyCalledAlias property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyCalledAlias }
     *     
     */
    public ContactPropertyCalledAlias getContactPropertyCalledAlias() {
        return contactPropertyCalledAlias;
    }

    /**
     * Sets the value of the contactPropertyCalledAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyCalledAlias }
     *     
     */
    public void setContactPropertyCalledAlias(ContactPropertyCalledAlias value) {
        this.contactPropertyCalledAlias = value;
    }

    /**
     * Gets the value of the contactPropertyCalledAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyCalledAddress }
     *     
     */
    public ContactPropertyCalledAddress getContactPropertyCalledAddress() {
        return contactPropertyCalledAddress;
    }

    /**
     * Sets the value of the contactPropertyCalledAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyCalledAddress }
     *     
     */
    public void setContactPropertyCalledAddress(ContactPropertyCalledAddress value) {
        this.contactPropertyCalledAddress = value;
    }

    /**
     * Gets the value of the contactPropertyCallingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyCallingAddress }
     *     
     */
    public ContactPropertyCallingAddress getContactPropertyCallingAddress() {
        return contactPropertyCallingAddress;
    }

    /**
     * Sets the value of the contactPropertyCallingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyCallingAddress }
     *     
     */
    public void setContactPropertyCallingAddress(ContactPropertyCallingAddress value) {
        this.contactPropertyCallingAddress = value;
    }

    /**
     * Gets the value of the contactPropertyCallingTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyCallingTerminal }
     *     
     */
    public ContactPropertyCallingTerminal getContactPropertyCallingTerminal() {
        return contactPropertyCallingTerminal;
    }

    /**
     * Sets the value of the contactPropertyCallingTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyCallingTerminal }
     *     
     */
    public void setContactPropertyCallingTerminal(ContactPropertyCallingTerminal value) {
        this.contactPropertyCallingTerminal = value;
    }

    /**
     * Gets the value of the contactPropertyLastRedirectedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyLastRedirectedAddress }
     *     
     */
    public ContactPropertyLastRedirectedAddress getContactPropertyLastRedirectedAddress() {
        return contactPropertyLastRedirectedAddress;
    }

    /**
     * Sets the value of the contactPropertyLastRedirectedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyLastRedirectedAddress }
     *     
     */
    public void setContactPropertyLastRedirectedAddress(ContactPropertyLastRedirectedAddress value) {
        this.contactPropertyLastRedirectedAddress = value;
    }

    /**
     * Gets the value of the contactPropertyCcmId property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyCcmId }
     *     
     */
    public ContactPropertyCcmId getContactPropertyCcmId() {
        return contactPropertyCcmId;
    }

    /**
     * Sets the value of the contactPropertyCcmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyCcmId }
     *     
     */
    public void setContactPropertyCcmId(ContactPropertyCcmId value) {
        this.contactPropertyCcmId = value;
    }

    /**
     * Gets the value of the contactPropertyIntrinsicArray property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyIntrinsicArray }
     *     
     */
    public ContactPropertyIntrinsicArray getContactPropertyIntrinsicArray() {
        return contactPropertyIntrinsicArray;
    }

    /**
     * Sets the value of the contactPropertyIntrinsicArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyIntrinsicArray }
     *     
     */
    public void setContactPropertyIntrinsicArray(ContactPropertyIntrinsicArray value) {
        this.contactPropertyIntrinsicArray = value;
    }

    /**
     * Gets the value of the contactPropertyRoute property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyRoute }
     *     
     */
    public ContactPropertyRoute getContactPropertyRoute() {
        return contactPropertyRoute;
    }

    /**
     * Sets the value of the contactPropertyRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyRoute }
     *     
     */
    public void setContactPropertyRoute(ContactPropertyRoute value) {
        this.contactPropertyRoute = value;
    }

    /**
     * Gets the value of the contactPropertyNodeId property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyNodeId }
     *     
     */
    public ContactPropertyNodeId getContactPropertyNodeId() {
        return contactPropertyNodeId;
    }

    /**
     * Sets the value of the contactPropertyNodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyNodeId }
     *     
     */
    public void setContactPropertyNodeId(ContactPropertyNodeId value) {
        this.contactPropertyNodeId = value;
    }

    /**
     * Gets the value of the contactPropertySourceSiteGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertySourceSiteGroupId }
     *     
     */
    public ContactPropertySourceSiteGroupId getContactPropertySourceSiteGroupId() {
        return contactPropertySourceSiteGroupId;
    }

    /**
     * Sets the value of the contactPropertySourceSiteGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertySourceSiteGroupId }
     *     
     */
    public void setContactPropertySourceSiteGroupId(ContactPropertySourceSiteGroupId value) {
        this.contactPropertySourceSiteGroupId = value;
    }

    /**
     * Gets the value of the contactPropertyTargetAgentPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPropertyTargetAgentPositionId }
     *     
     */
    public ContactPropertyTargetAgentPositionId getContactPropertyTargetAgentPositionId() {
        return contactPropertyTargetAgentPositionId;
    }

    /**
     * Sets the value of the contactPropertyTargetAgentPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPropertyTargetAgentPositionId }
     *     
     */
    public void setContactPropertyTargetAgentPositionId(ContactPropertyTargetAgentPositionId value) {
        this.contactPropertyTargetAgentPositionId = value;
    }

}
