
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentPropertyVoiceTerminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentPropertyVoiceTerminal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentTerminalId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agentTerminalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passiveProviderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentPropertyVoiceTerminal", propOrder = {
    "agentTerminalId",
    "agentTerminalName",
    "passiveProviderName"
})
public class AgentPropertyVoiceTerminal {

    @XmlElement(required = true)
    protected String agentTerminalId;
    @XmlElement(required = true)
    protected String agentTerminalName;
    @XmlElement(required = true)
    protected String passiveProviderName;

    /**
     * Gets the value of the agentTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentTerminalId() {
        return agentTerminalId;
    }

    /**
     * Sets the value of the agentTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentTerminalId(String value) {
        this.agentTerminalId = value;
    }

    /**
     * Gets the value of the agentTerminalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentTerminalName() {
        return agentTerminalName;
    }

    /**
     * Sets the value of the agentTerminalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentTerminalName(String value) {
        this.agentTerminalName = value;
    }

    /**
     * Gets the value of the passiveProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveProviderName() {
        return passiveProviderName;
    }

    /**
     * Sets the value of the passiveProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveProviderName(String value) {
        this.passiveProviderName = value;
    }

}
