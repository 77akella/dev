
package com.nortel.soa.oi.cct.types.routepointconnectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.RoutePointConnectionCapabilities;


/**
 * <p>Java class for ConnectionCapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionCapabilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}routePointConnectionCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionCapabilitiesResponse", propOrder = {
    "connectionCapabilities"
})
public class ConnectionCapabilitiesResponse {

    @XmlElement(required = true)
    protected RoutePointConnectionCapabilities connectionCapabilities;

    /**
     * Gets the value of the connectionCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointConnectionCapabilities }
     *     
     */
    public RoutePointConnectionCapabilities getConnectionCapabilities() {
        return connectionCapabilities;
    }

    /**
     * Sets the value of the connectionCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointConnectionCapabilities }
     *     
     */
    public void setConnectionCapabilities(RoutePointConnectionCapabilities value) {
        this.connectionCapabilities = value;
    }

}
