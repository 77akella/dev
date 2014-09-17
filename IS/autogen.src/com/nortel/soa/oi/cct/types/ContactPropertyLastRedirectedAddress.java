
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPropertyLastRedirectedAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPropertyLastRedirectedAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastRedirectedAddress" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPropertyLastRedirectedAddress", propOrder = {
    "lastRedirectedAddress"
})
public class ContactPropertyLastRedirectedAddress {

    @XmlElement(required = true)
    protected Address lastRedirectedAddress;

    /**
     * Gets the value of the lastRedirectedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getLastRedirectedAddress() {
        return lastRedirectedAddress;
    }

    /**
     * Sets the value of the lastRedirectedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setLastRedirectedAddress(Address value) {
        this.lastRedirectedAddress = value;
    }

}
