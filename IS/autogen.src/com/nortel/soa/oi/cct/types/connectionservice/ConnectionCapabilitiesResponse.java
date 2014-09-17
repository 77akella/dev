
package com.nortel.soa.oi.cct.types.connectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.ConnectionCapabilities;


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
 *         &lt;element name="connectionCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}connectionCapabilities"/>
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
    protected ConnectionCapabilities connectionCapabilities;

    /**
     * Gets the value of the connectionCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCapabilities }
     *     
     */
    public ConnectionCapabilities getConnectionCapabilities() {
        return connectionCapabilities;
    }

    /**
     * Sets the value of the connectionCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCapabilities }
     *     
     */
    public void setConnectionCapabilities(ConnectionCapabilities value) {
        this.connectionCapabilities = value;
    }

}
