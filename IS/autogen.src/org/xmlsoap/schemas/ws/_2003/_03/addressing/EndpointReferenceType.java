
package org.xmlsoap.schemas.ws._2003._03.addressing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndpointReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndpointReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://schemas.xmlsoap.org/ws/2003/03/addressing}AttributedURI"/>
 *         &lt;element name="ReferenceProperties" type="{http://schemas.xmlsoap.org/ws/2003/03/addressing}ReferencePropertiesType" minOccurs="0"/>
 *         &lt;element name="PortType" type="{http://schemas.xmlsoap.org/ws/2003/03/addressing}AttributedQName" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://schemas.xmlsoap.org/ws/2003/03/addressing}ServiceNameType" minOccurs="0"/>
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointReferenceType", propOrder = {
    "address",
    "referenceProperties",
    "portType",
    "serviceName",
    "subscriptionId"
})
public class EndpointReferenceType {

    @XmlElement(name = "Address", required = true)
    protected AttributedURI address;
    @XmlElement(name = "ReferenceProperties")
    protected ReferencePropertiesType referenceProperties;
    @XmlElement(name = "PortType")
    protected AttributedQName portType;
    @XmlElement(name = "ServiceName")
    protected ServiceNameType serviceName;
    @XmlElement(name = "SubscriptionId", required = true)
    protected String subscriptionId;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AttributedURI }
     *     
     */
    public AttributedURI getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedURI }
     *     
     */
    public void setAddress(AttributedURI value) {
        this.address = value;
    }

    /**
     * Gets the value of the referenceProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePropertiesType }
     *     
     */
    public ReferencePropertiesType getReferenceProperties() {
        return referenceProperties;
    }

    /**
     * Sets the value of the referenceProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePropertiesType }
     *     
     */
    public void setReferenceProperties(ReferencePropertiesType value) {
        this.referenceProperties = value;
    }

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributedQName }
     *     
     */
    public AttributedQName getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedQName }
     *     
     */
    public void setPortType(AttributedQName value) {
        this.portType = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceNameType }
     *     
     */
    public ServiceNameType getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNameType }
     *     
     */
    public void setServiceName(ServiceNameType value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

}
