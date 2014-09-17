
package com.nortel.soa.oi.cct.types.contactservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.Contact;
import com.nortel.soa.oi.cct.types.SsoToken;
import com.nortel.soa.oi.cct.types.Terminal;


/**
 * <p>Java class for WhisperRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WhisperRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="contact" type="{http://www.nortel.com/soa/oi/cct/types}contact"/>
 *         &lt;element name="sourceTerminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="sourceAddress" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *         &lt;element name="desitnationTerminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="desitnationAddress" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WhisperRequest", propOrder = {
    "ssoToken",
    "contact",
    "sourceTerminal",
    "sourceAddress",
    "desitnationTerminal",
    "desitnationAddress"
})
public class WhisperRequest {

    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(required = true)
    protected Contact contact;
    @XmlElement(required = true)
    protected Terminal sourceTerminal;
    @XmlElement(required = true)
    protected Address sourceAddress;
    @XmlElement(required = true)
    protected Terminal desitnationTerminal;
    @XmlElement(required = true)
    protected Address desitnationAddress;

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
     * Gets the value of the sourceTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getSourceTerminal() {
        return sourceTerminal;
    }

    /**
     * Sets the value of the sourceTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setSourceTerminal(Terminal value) {
        this.sourceTerminal = value;
    }

    /**
     * Gets the value of the sourceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSourceAddress() {
        return sourceAddress;
    }

    /**
     * Sets the value of the sourceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSourceAddress(Address value) {
        this.sourceAddress = value;
    }

    /**
     * Gets the value of the desitnationTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getDesitnationTerminal() {
        return desitnationTerminal;
    }

    /**
     * Sets the value of the desitnationTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setDesitnationTerminal(Terminal value) {
        this.desitnationTerminal = value;
    }

    /**
     * Gets the value of the desitnationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDesitnationAddress() {
        return desitnationAddress;
    }

    /**
     * Sets the value of the desitnationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDesitnationAddress(Address value) {
        this.desitnationAddress = value;
    }

}
