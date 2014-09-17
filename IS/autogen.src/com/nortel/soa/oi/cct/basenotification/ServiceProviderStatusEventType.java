
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Provider;
import com.nortel.soa.oi.cct.types.ProviderStatusType;


/**
 * 
 * 				This event is fired whenever there is a change
 * 				in the status of a service provider.
 * 				The event will detail the following;
 * 					The provider associated with the event
 * 					The providers status
 * 			
 * 
 * <p>Java class for ServiceProviderStatusEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProviderStatusEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provider" type="{http://www.nortel.com/soa/oi/cct/types}provider"/>
 *         &lt;element name="Status" type="{http://www.nortel.com/soa/oi/cct/types}providerStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProviderStatusEventType", propOrder = {
    "provider",
    "status"
})
public class ServiceProviderStatusEventType {

    @XmlElement(name = "Provider", required = true)
    protected Provider provider;
    @XmlElement(name = "Status", required = true)
    protected ProviderStatusType status;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderStatusType }
     *     
     */
    public ProviderStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderStatusType }
     *     
     */
    public void setStatus(ProviderStatusType value) {
        this.status = value;
    }

}
