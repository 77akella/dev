
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentTerminalPropertyAgentLoginSessionEnded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentTerminalPropertyAgentLoginSessionEnded">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginEnded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentTerminalPropertyAgentLoginSessionEnded", propOrder = {
    "loginEnded"
})
public class AgentTerminalPropertyAgentLoginSessionEnded {

    protected boolean loginEnded;

    /**
     * Gets the value of the loginEnded property.
     * 
     */
    public boolean isLoginEnded() {
        return loginEnded;
    }

    /**
     * Sets the value of the loginEnded property.
     * 
     */
    public void setLoginEnded(boolean value) {
        this.loginEnded = value;
    }

}
