
package com.nortel.soa.oi.cct.types.contactservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.Contact;
import com.nortel.soa.oi.cct.types.MediaTreatment;
import com.nortel.soa.oi.cct.types.SsoToken;


/**
 * <p>Java class for GiveTreatmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiveTreatmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="contact" type="{http://www.nortel.com/soa/oi/cct/types}contact"/>
 *         &lt;element name="address" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *         &lt;element name="mediaTreatment" type="{http://www.nortel.com/soa/oi/cct/types}mediaTreatment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiveTreatmentRequest", propOrder = {
    "ssoToken",
    "contact",
    "address",
    "mediaTreatment"
})
public class GiveTreatmentRequest {

    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(required = true)
    protected Contact contact;
    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected MediaTreatment mediaTreatment;

    /**
     * Gets the value of the ssoToken property.
     * 
     * @return
     *     possible object is
     *     {@link SsoToken }
     *     
     */
    public SsoToken getSsoToken() {
        return ssoToken;
    }

    /**
     * Sets the value of the ssoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SsoToken }
     *     
     */
    public void setSsoToken(SsoToken value) {
        this.ssoToken = value;
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
     * Gets the value of the mediaTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTreatment }
     *     
     */
    public MediaTreatment getMediaTreatment() {
        return mediaTreatment;
    }

    /**
     * Sets the value of the mediaTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTreatment }
     *     
     */
    public void setMediaTreatment(MediaTreatment value) {
        this.mediaTreatment = value;
    }

}
