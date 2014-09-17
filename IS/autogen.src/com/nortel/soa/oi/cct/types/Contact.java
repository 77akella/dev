
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalContactId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provider" type="{http://www.nortel.com/soa/oi/cct/types}provider"/>
 *         &lt;element name="contactTypes" type="{http://www.nortel.com/soa/oi/cct/types}contactTypeArray"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contact", propOrder = {
    "contactId",
    "externalContactId",
    "provider",
    "contactTypes"
})
public class Contact {

    @XmlElement(required = true)
    protected String contactId;
    @XmlElement(required = true)
    protected String externalContactId;
    @XmlElement(required = true)
    protected Provider provider;
    @XmlElement(required = true)
    protected ContactTypeArray contactTypes;

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the externalContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalContactId() {
        return externalContactId;
    }

    /**
     * Sets the value of the externalContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalContactId(String value) {
        this.externalContactId = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setProvider(Provider value) {
        this.provider = value;
    }

    /**
     * Gets the value of the contactTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ContactTypeArray }
     *     
     */
    public ContactTypeArray getContactTypes() {
        return contactTypes;
    }

    /**
     * Sets the value of the contactTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactTypeArray }
     *     
     */
    public void setContactTypes(ContactTypeArray value) {
        this.contactTypes = value;
    }

}
