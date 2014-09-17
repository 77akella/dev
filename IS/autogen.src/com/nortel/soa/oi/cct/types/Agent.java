
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agentLoginId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agentType" type="{http://www.nortel.com/soa/oi/cct/types}agentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent", propOrder = {
    "agentLoginId",
    "userName",
    "agentType"
})
public class Agent {

    @XmlElement(required = true)
    protected String agentLoginId;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected AgentType agentType;

    /**
     * Gets the value of the agentLoginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentLoginId() {
        return agentLoginId;
    }

    /**
     * Sets the value of the agentLoginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentLoginId(String value) {
        this.agentLoginId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the agentType property.
     * 
     * @return
     *     possible object is
     *     {@link AgentType }
     *     
     */
    public AgentType getAgentType() {
        return agentType;
    }

    /**
     * Sets the value of the agentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentType }
     *     
     */
    public void setAgentType(AgentType value) {
        this.agentType = value;
    }

}
