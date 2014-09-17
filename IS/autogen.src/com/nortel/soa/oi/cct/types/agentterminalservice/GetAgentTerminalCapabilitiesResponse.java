
package com.nortel.soa.oi.cct.types.agentterminalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.AgentTerminalCapabilities;


/**
 * <p>Java class for GetAgentTerminalCapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAgentTerminalCapabilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}agentTerminalCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAgentTerminalCapabilitiesResponse", propOrder = {
    "terminalCapabilities"
})
public class GetAgentTerminalCapabilitiesResponse {

    @XmlElement(required = true)
    protected AgentTerminalCapabilities terminalCapabilities;

    /**
     * Gets the value of the terminalCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AgentTerminalCapabilities }
     *     
     */
    public AgentTerminalCapabilities getTerminalCapabilities() {
        return terminalCapabilities;
    }

    /**
     * Sets the value of the terminalCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentTerminalCapabilities }
     *     
     */
    public void setTerminalCapabilities(AgentTerminalCapabilities value) {
        this.terminalCapabilities = value;
    }

}
