
package com.nortel.soa.oi.cct.types.agentterminalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.AgentReadyStatus;
import com.nortel.soa.oi.cct.types.SsoToken;
import com.nortel.soa.oi.cct.types.Terminal;


/**
 * <p>Java class for AgentTerminalLoginRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentTerminalLoginRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="agentTerminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initialState" type="{http://www.nortel.com/soa/oi/cct/types}agentReadyStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentTerminalLoginRequest", propOrder = {
    "ssoToken",
    "agentTerminal",
    "agentId",
    "password",
    "initialState"
})
public class AgentTerminalLoginRequest {

    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(required = true)
    protected Terminal agentTerminal;
    @XmlElement(required = true)
    protected String agentId;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected AgentReadyStatus initialState;

    /**
     * Gets the value of the ssoToken property.
     * 
     * @return
     *     possible object is
     *     {@link SsoToken }
     *     
     */
    public SsoToken getSsoToken() {
        return ssoToken;
    }

    /**
     * Sets the value of the ssoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SsoToken }
     *     
     */
    public void setSsoToken(SsoToken value) {
        this.ssoToken = value;
    }

    /**
     * Gets the value of the agentTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getAgentTerminal() {
        return agentTerminal;
    }

    /**
     * Sets the value of the agentTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setAgentTerminal(Terminal value) {
        this.agentTerminal = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the initialState property.
     * 
     * @return
     *     possible object is
     *     {@link AgentReadyStatus }
     *     
     */
    public AgentReadyStatus getInitialState() {
        return initialState;
    }

    /**
     * Sets the value of the initialState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentReadyStatus }
     *     
     */
    public void setInitialState(AgentReadyStatus value) {
        this.initialState = value;
    }

}
