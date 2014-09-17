
package com.nortel.soa.oi.cct.types.agentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.AgentCapabilities;


/**
 * <p>Java class for GetCapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCapabilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}agentCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCapabilitiesResponse", propOrder = {
    "agentCapabilities"
})
public class GetCapabilitiesResponse {

    @XmlElement(required = true)
    protected AgentCapabilities agentCapabilities;

    /**
     * Gets the value of the agentCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCapabilities }
     *     
     */
    public AgentCapabilities getAgentCapabilities() {
        return agentCapabilities;
    }

    /**
     * Sets the value of the agentCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCapabilities }
     *     
     */
    public void setAgentCapabilities(AgentCapabilities value) {
        this.agentCapabilities = value;
    }

}
