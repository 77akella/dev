
package com.nortel.soa.oi.cct.types.notificationproducer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.nortel.soa.oi.cct.types.SsoToken;
import org.xmlsoap.schemas.ws._2003._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionReference" type="{http://schemas.xmlsoap.org/ws/2003/03/addressing}EndpointReferenceType"/>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="TerminationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subscriptionReference",
    "ssoToken",
    "terminationTime"
})
@XmlRootElement(name = "Renew")
public class Renew {

    @XmlElement(name = "SubscriptionReference", required = true)
    protected EndpointReferenceType subscriptionReference;
    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(name = "TerminationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminationTime;

    /**
     * Gets the value of the subscriptionReference property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * Sets the value of the subscriptionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setSubscriptionReference(EndpointReferenceType value) {
        this.subscriptionReference = value;
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

    /**
     * Gets the value of the terminationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationTime() {
        return terminationTime;
    }

    /**
     * Sets the value of the terminationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationTime(XMLGregorianCalendar value) {
        this.terminationTime = value;
    }

}
