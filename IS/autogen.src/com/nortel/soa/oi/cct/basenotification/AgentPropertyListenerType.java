
package com.nortel.soa.oi.cct.basenotification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Agent;
import com.nortel.soa.oi.cct.types.AgentProperty;


/**
 * <p>Java class for AgentPropertyListenerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentPropertyListenerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentEntity" type="{http://www.nortel.com/soa/oi/cct/types}agent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AgentPropertyEvent" type="{http://www.nortel.com/soa/oi/cct/types}agentProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentPropertyListenerType", propOrder = {
    "agentEntity",
    "agentPropertyEvent"
})
public class AgentPropertyListenerType {

    @XmlElement(name = "AgentEntity")
    protected List<Agent> agentEntity;
    @XmlElement(name = "AgentPropertyEvent")
    protected List<AgentProperty> agentPropertyEvent;

    /**
     * Gets the value of the agentEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agent }
     * 
     * 
     */
    public List<Agent> getAgentEntity() {
        if (agentEntity == null) {
            agentEntity = new ArrayList<Agent>();
        }
        return this.agentEntity;
    }

    /**
     * Gets the value of the agentPropertyEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentPropertyEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentPropertyEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentProperty }
     * 
     * 
     */
    public List<AgentProperty> getAgentPropertyEvent() {
        if (agentPropertyEvent == null) {
            agentPropertyEvent = new ArrayList<AgentProperty>();
        }
        return this.agentPropertyEvent;
    }

}
