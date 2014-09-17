
package com.nortel.soa.oi.cct.types.agentterminalconnectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.AgentTerminalConnectionCapabilities;


/**
 * <p>Java class for GetAgentTerminalConnectionCapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgentTerminalConnectionCapabilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentTerminalConnectionCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}agentTerminalConnectionCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAgentTerminalConnectionCapabilitiesResponse", propOrder = {
    "agentTerminalConnectionCapabilities"
})
public class GetAgentTerminalConnectionCapabilitiesResponse {

    @XmlElement(required = true)
    protected AgentTerminalConnectionCapabilities agentTerminalConnectionCapabilities;

    /**
     * Gets the value of the agentTerminalConnectionCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AgentTerminalConnectionCapabilities }
     *     
     */
    public AgentTerminalConnectionCapabilities getAgentTerminalConnectionCapabilities() {
        return agentTerminalConnectionCapabilities;
    }

    /**
     * Sets the value of the agentTerminalConnectionCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentTerminalConnectionCapabilities }
     *     
     */
    public void setAgentTerminalConnectionCapabilities(AgentTerminalConnectionCapabilities value) {
        this.agentTerminalConnectionCapabilities = value;
    }

}
