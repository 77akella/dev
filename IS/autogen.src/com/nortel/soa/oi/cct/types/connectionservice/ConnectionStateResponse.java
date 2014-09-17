
package com.nortel.soa.oi.cct.types.connectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.ConnectionStateInfo;


/**
 * <p>Java class for ConnectionStateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionStateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connectionStateInfo" type="{http://www.nortel.com/soa/oi/cct/types}connectionStateInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionStateResponse", propOrder = {
    "connectionStateInfo"
})
public class ConnectionStateResponse {

    @XmlElement(required = true)
    protected ConnectionStateInfo connectionStateInfo;

    /**
     * Gets the value of the connectionStateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionStateInfo }
     *     
     */
    public ConnectionStateInfo getConnectionStateInfo() {
        return connectionStateInfo;
    }

    /**
     * Sets the value of the connectionStateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionStateInfo }
     *     
     */
    public void setConnectionStateInfo(ConnectionStateInfo value) {
        this.connectionStateInfo = value;
    }

}
