
package com.nortel.soa.oi.cct.types.sessionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.SsoToken;
import com.nortel.soa.oi.cct.types.Terminal;


/**
 * <p>Java class for LoginAgentToStateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginAgentToStateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="terminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initialState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginAgentToStateRequest", propOrder = {
    "ssoToken",
    "terminal",
    "agentId",
    "agentPassword",
    "initialState"
})
public class LoginAgentToStateRequest {

    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(required = true)
    protected Terminal terminal;
    @XmlElement(required = true)
    protected String agentId;
    @XmlElement(required = true)
    protected String agentPassword;
    protected int initialState;

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
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setTerminal(Terminal value) {
        this.terminal = value;
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
     * Gets the value of the agentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentPassword() {
        return agentPassword;
    }

    /**
     * Sets the value of the agentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentPassword(String value) {
        this.agentPassword = value;
    }

    /**
     * Gets the value of the initialState property.
     * 
     */
    public int getInitialState() {
        return initialState;
    }

    /**
     * Sets the value of the initialState property.
     * 
     */
    public void setInitialState(int value) {
        this.initialState = value;
    }

}
