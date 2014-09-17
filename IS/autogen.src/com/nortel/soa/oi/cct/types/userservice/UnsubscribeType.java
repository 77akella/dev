
package com.nortel.soa.oi.cct.types.userservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.SsoToken;


/**
 * <p>Java class for UnsubscribeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsubscribeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsubscribeType", propOrder = {
    "subscriptionRef",
    "ssoToken"
})
public class UnsubscribeType {

    @XmlElement(name = "SubscriptionRef", required = true)
    protected String subscriptionRef;
    @XmlElement(required = true)
    protected SsoToken ssoToken;

    /**
     * Gets the value of the subscriptionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionRef() {
        return subscriptionRef;
    }

    /**
     * Sets the value of the subscriptionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionRef(String value) {
        this.subscriptionRef = value;
    }

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

}
