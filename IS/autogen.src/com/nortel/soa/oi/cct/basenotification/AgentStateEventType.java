
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Agent;
import com.nortel.soa.oi.cct.types.AgentState;


/**
 * 
 * 				This event is fired when an Agent state changes.
 * 				The event will detail the following;
 * 					The agent associated with the notification
 * 				    That agent state 
 * 			
 * 
 * <p>Java class for AgentStateEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentStateEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agent" type="{http://www.nortel.com/soa/oi/cct/types}agent"/>
 *         &lt;element name="State" type="{http://www.nortel.com/soa/oi/cct/types}agentState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentStateEventType", propOrder = {
    "agent",
    "state"
})
public class AgentStateEventType {

    @XmlElement(name = "Agent", required = true)
    protected Agent agent;
    @XmlElement(name = "State", required = true)
    protected AgentState state;

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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link AgentState }
     *     
     */
    public AgentState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentState }
     *     
     */
    public void setState(AgentState value) {
        this.state = value;
    }

}
