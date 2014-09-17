
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPropertyNetworkDialledAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPropertyNetworkDialledAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networkDialledAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPropertyNetworkDialledAddress", propOrder = {
    "networkDialledAddress"
})
public class ContactPropertyNetworkDialledAddress {

    @XmlElement(required = true)
    protected String networkDialledAddress;

    /**
     * Gets the value of the networkDialledAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkDialledAddress() {
        return networkDialledAddress;
    }

    /**
     * Sets the value of the networkDialledAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkDialledAddress(String value) {
        this.networkDialledAddress = value;
    }

}
