
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Agent;
import com.nortel.soa.oi.cct.types.AgentCapabilities;
import com.nortel.soa.oi.cct.types.AgentProperty;
import com.nortel.soa.oi.cct.types.AgentPropertyAddressName;
import com.nortel.soa.oi.cct.types.AgentPropertyContactTypeArray;
import com.nortel.soa.oi.cct.types.AgentPropertyInformation;
import com.nortel.soa.oi.cct.types.AgentPropertyLoginStatus;
import com.nortel.soa.oi.cct.types.AgentPropertyReadyStatus;
import com.nortel.soa.oi.cct.types.AgentPropertyVoiceTerminal;


/**
 * 
 * 				This event is fired when a property associated
 * 				with an agent changes.
 * 				The event will detail the following;
 * 				    The agent property that changed.
 * 				    The agent associated with that changed property.
 * 			
 * 
 * <p>Java class for AgentPropertyEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentPropertyEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentProperty" type="{http://www.nortel.com/soa/oi/cct/types}agentProperty"/>
 *         &lt;element name="Agent" type="{http://www.nortel.com/soa/oi/cct/types}agent"/>
 *         &lt;element name="AgentCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}agentCapabilities"/>
 *         &lt;element name="AgentPropertyAddressName" type="{http://www.nortel.com/soa/oi/cct/types}agentPropertyAddressName" minOccurs="0"/>
 *         &lt;element name="AgentPropertyContactTypeArray" type="{http://www.nortel.com/soa/oi/cct/types}agentPropertyContactTypeArray" minOccurs="0"/>
 *         &lt;element name="AgentPropertyInformation" type="{http://www.nortel.com/soa/oi/cct/types}agentPropertyInformation" minOccurs="0"/>
 *         &lt;element name="AgentPropertyLoginStatus" type="{http://www.nortel.com/soa/oi/cct/types}agentPropertyLoginStatus" minOccurs="0"/>
 *         &lt;element name="AgentPropertyReadyStatus" type="{http://www.nortel.com/soa/oi/cct/types}agentPropertyReadyStatus" minOccurs="0"/>
 *         &lt;element name="AgentPropertyVoiceTerminal" type="{http://www.nortel.com/soa/oi/cct/types}agentPropertyVoiceTerminal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentPropertyEventType", propOrder = {
    "agentProperty",
    "agent",
    "agentCapabilities",
    "agentPropertyAddressName",
    "agentPropertyContactTypeArray",
    "agentPropertyInformation",
    "agentPropertyLoginStatus",
    "agentPropertyReadyStatus",
    "agentPropertyVoiceTerminal"
})
public class AgentPropertyEventType {

    @XmlElement(name = "AgentProperty", required = true)
    protected AgentProperty agentProperty;
    @XmlElement(name = "Agent", required = true)
    protected Agent agent;
    @XmlElement(name = "AgentCapabilities", required = true)
    protected AgentCapabilities agentCapabilities;
    @XmlElement(name = "AgentPropertyAddressName")
    protected AgentPropertyAddressName agentPropertyAddressName;
    @XmlElement(name = "AgentPropertyContactTypeArray")
    protected AgentPropertyContactTypeArray agentPropertyContactTypeArray;
    @XmlElement(name = "AgentPropertyInformation")
    protected AgentPropertyInformation agentPropertyInformation;
    @XmlElement(name = "AgentPropertyLoginStatus")
    protected AgentPropertyLoginStatus agentPropertyLoginStatus;
    @XmlElement(name = "AgentPropertyReadyStatus")
    protected AgentPropertyReadyStatus agentPropertyReadyStatus;
    @XmlElement(name = "AgentPropertyVoiceTerminal")
    protected AgentPropertyVoiceTerminal agentPropertyVoiceTerminal;

    /**
     * Gets the value of the agentProperty property.
     * 
     * @return
     *     possible object is
     *     {@link AgentProperty }
     *     
     */
    public AgentProperty getAgentProperty() {
        return agentProperty;
    }

    /**
     * Sets the value of the agentProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentProperty }
     *     
     */
    public void setAgentProperty(AgentProperty value) {
        this.agentProperty = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    public void setAgent(Agent value) {
        this.agent = value;
    }

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

    /**
     * Gets the value of the agentPropertyAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link AgentPropertyAddressName }
     *     
     */
    public AgentPropertyAddressName getAgentPropertyAddressName() {
        return agentPropertyAddressName;
    }

    /**
     * Sets the value of the agentPropertyAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPropertyAddressName }
     *     
     */
    public void setAgentPropertyAddressName(AgentPropertyAddressName value) {
        this.agentPropertyAddressName = value;
    }

    /**
     * Gets the value of the agentPropertyContactTypeArray property.
     * 
     * @return
     *     possible object is
     *     {@link AgentPropertyContactTypeArray }
     *     
     */
    public AgentPropertyContactTypeArray getAgentPropertyContactTypeArray() {
        return agentPropertyContactTypeArray;
    }

    /**
     * Sets the value of the agentPropertyContactTypeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPropertyContactTypeArray }
     *     
     */
    public void setAgentPropertyContactTypeArray(AgentPropertyContactTypeArray value) {
        this.agentPropertyContactTypeArray = value;
    }

    /**
     * Gets the value of the agentPropertyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AgentPropertyInformation }
     *     
     */
    public AgentPropertyInformation getAgentPropertyInformation() {
        return agentPropertyInformation;
    }

    /**
     * Sets the value of the agentPropertyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPropertyInformation }
     *     
     */
    public void setAgentPropertyInformation(AgentPropertyInformation value) {
        this.agentPropertyInformation = value;
    }

    /**
     * Gets the value of the agentPropertyLoginStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgentPropertyLoginStatus }
     *     
     */
    public AgentPropertyLoginStatus getAgentPropertyLoginStatus() {
        return agentPropertyLoginStatus;
    }

    /**
     * Sets the value of the agentPropertyLoginStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPropertyLoginStatus }
     *     
     */
    public void setAgentPropertyLoginStatus(AgentPropertyLoginStatus value) {
        this.agentPropertyLoginStatus = value;
    }

    /**
     * Gets the value of the agentPropertyReadyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgentPropertyReadyStatus }
     *     
     */
    public AgentPropertyReadyStatus getAgentPropertyReadyStatus() {
        return agentPropertyReadyStatus;
    }

    /**
     * Sets the value of the agentPropertyReadyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPropertyReadyStatus }
     *     
     */
    public void setAgentPropertyReadyStatus(AgentPropertyReadyStatus value) {
        this.agentPropertyReadyStatus = value;
    }

    /**
     * Gets the value of the agentPropertyVoiceTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link AgentPropertyVoiceTerminal }
     *     
     */
    public AgentPropertyVoiceTerminal getAgentPropertyVoiceTerminal() {
        return agentPropertyVoiceTerminal;
    }

    /**
     * Sets the value of the agentPropertyVoiceTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentPropertyVoiceTerminal }
     *     
     */
    public void setAgentPropertyVoiceTerminal(AgentPropertyVoiceTerminal value) {
        this.agentPropertyVoiceTerminal = value;
    }

}
