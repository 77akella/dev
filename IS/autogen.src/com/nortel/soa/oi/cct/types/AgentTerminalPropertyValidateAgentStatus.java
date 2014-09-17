
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentTerminalPropertyValidateAgentStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentTerminalPropertyValidateAgentStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adminUserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentTerminalPropertyValidateAgentStatus", propOrder = {
    "adminUserId"
})
public class AgentTerminalPropertyValidateAgentStatus {

    @XmlElement(required = true)
    protected String adminUserId;

    /**
     * Gets the value of the adminUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUserId() {
        return adminUserId;
    }

    /**
     * Sets the value of the adminUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUserId(String value) {
        this.adminUserId = value;
    }

}
