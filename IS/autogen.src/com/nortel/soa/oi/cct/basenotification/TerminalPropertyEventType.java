
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.AgentTerminalPropertyActivityCode;
import com.nortel.soa.oi.cct.types.AgentTerminalPropertyAgentLoginSession;
import com.nortel.soa.oi.cct.types.AgentTerminalPropertyAgentLoginSessionEnded;
import com.nortel.soa.oi.cct.types.AgentTerminalPropertyReadyStatus;
import com.nortel.soa.oi.cct.types.AgentTerminalPropertyValidateAgentStatus;
import com.nortel.soa.oi.cct.types.Terminal;
import com.nortel.soa.oi.cct.types.TerminalCapabilities;
import com.nortel.soa.oi.cct.types.TerminalProperty;
import com.nortel.soa.oi.cct.types.TerminalPropertyContactTypeArray;
import com.nortel.soa.oi.cct.types.TerminalPropertyDoNotDisturb;
import com.nortel.soa.oi.cct.types.TerminalPropertyForwardingArray;
import com.nortel.soa.oi.cct.types.TerminalPropertyName;
import com.nortel.soa.oi.cct.types.TerminalPropertyPort;
import com.nortel.soa.oi.cct.types.TerminalPropertyTransport;
import com.nortel.soa.oi.cct.types.TerminalPropertyTreatment;


/**
 * 
 * 				This event is fired when a property associated
 * 				with a terminal changes.
 * 				The event will detail the following;
 * 				    The terminal property that changed.
 * 				    The terminal associated with that changed property.
 * 			
 * 
 * <p>Java class for TerminalPropertyEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalPropertyEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TerminalProperty" type="{http://www.nortel.com/soa/oi/cct/types}terminalProperty"/>
 *         &lt;element name="Terminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="TerminalCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}terminalCapabilities"/>
 *         &lt;element name="TerminalPropertyDoNotDisturb" type="{http://www.nortel.com/soa/oi/cct/types}terminalPropertyDoNotDisturb" minOccurs="0"/>
 *         &lt;element name="TerminalPropertyForwardingArray" type="{http://www.nortel.com/soa/oi/cct/types}terminalPropertyForwardingArray" minOccurs="0"/>
 *         &lt;element name="TerminalPropertyContactTypeArray" type="{http://www.nortel.com/soa/oi/cct/types}terminalPropertyContactTypeArray" minOccurs="0"/>
 *         &lt;element name="TerminalPropertyTreatment" type="{http://www.nortel.com/soa/oi/cct/types}terminalPropertyTreatment" minOccurs="0"/>
 *         &lt;element name="TerminalPropertyTransport" type="{http://www.nortel.com/soa/oi/cct/types}terminalPropertyTransport" minOccurs="0"/>
 *         &lt;element name="TerminalPropertyName" type="{http://www.nortel.com/soa/oi/cct/types}terminalPropertyName" minOccurs="0"/>
 *         &lt;element name="TerminalPropertyPort" type="{http://www.nortel.com/soa/oi/cct/types}terminalPropertyPort" minOccurs="0"/>
 *         &lt;element name="AgentTerminalPropertyAgentLoginSession" type="{http://www.nortel.com/soa/oi/cct/types}agentTerminalPropertyAgentLoginSession" minOccurs="0"/>
 *         &lt;element name="AgentTerminalPropertyAgentLoginSessionEnded" type="{http://www.nortel.com/soa/oi/cct/types}agentTerminalPropertyAgentLoginSessionEnded" minOccurs="0"/>
 *         &lt;element name="AgentTerminalPropertyActivityCode" type="{http://www.nortel.com/soa/oi/cct/types}agentTerminalPropertyActivityCode" minOccurs="0"/>
 *         &lt;element name="AgentTerminalPropertyReadyStatus" type="{http://www.nortel.com/soa/oi/cct/types}agentTerminalPropertyReadyStatus" minOccurs="0"/>
 *         &lt;element name="AgentTerminalPropertyValidateAgentStatus" type="{http://www.nortel.com/soa/oi/cct/types}agentTerminalPropertyValidateAgentStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalPropertyEventType", propOrder = {
    "terminalProperty",
    "terminal",
    "terminalCapabilities",
    "terminalPropertyDoNotDisturb",
    "terminalPropertyForwardingArray",
    "terminalPropertyContactTypeArray",
    "terminalPropertyTreatment",
    "terminalPropertyTransport",
    "terminalPropertyName",
    "terminalPropertyPort",
    "agentTerminalPropertyAgentLoginSession",
    "agentTerminalPropertyAgentLoginSessionEnded",
    "agentTerminalPropertyActivityCode",
    "agentTerminalPropertyReadyStatus",
    "agentTerminalPropertyValidateAgentStatus"
})
public class TerminalPropertyEventType {

    @XmlElement(name = "TerminalProperty", required = true)
    protected TerminalProperty terminalProperty;
    @XmlElement(name = "Terminal", required = true)
    protected Terminal terminal;
    @XmlElement(name = "TerminalCapabilities", required = true)
    protected TerminalCapabilities terminalCapabilities;
    @XmlElement(name = "TerminalPropertyDoNotDisturb")
    protected TerminalPropertyDoNotDisturb terminalPropertyDoNotDisturb;
    @XmlElement(name = "TerminalPropertyForwardingArray")
    protected TerminalPropertyForwardingArray terminalPropertyForwardingArray;
    @XmlElement(name = "TerminalPropertyContactTypeArray")
    protected TerminalPropertyContactTypeArray terminalPropertyContactTypeArray;
    @XmlElement(name = "TerminalPropertyTreatment")
    protected TerminalPropertyTreatment terminalPropertyTreatment;
    @XmlElement(name = "TerminalPropertyTransport")
    protected TerminalPropertyTransport terminalPropertyTransport;
    @XmlElement(name = "TerminalPropertyName")
    protected TerminalPropertyName terminalPropertyName;
    @XmlElement(name = "TerminalPropertyPort")
    protected TerminalPropertyPort terminalPropertyPort;
    @XmlElement(name = "AgentTerminalPropertyAgentLoginSession")
    protected AgentTerminalPropertyAgentLoginSession agentTerminalPropertyAgentLoginSession;
    @XmlElement(name = "AgentTerminalPropertyAgentLoginSessionEnded")
    protected AgentTerminalPropertyAgentLoginSessionEnded agentTerminalPropertyAgentLoginSessionEnded;
    @XmlElement(name = "AgentTerminalPropertyActivityCode")
    protected AgentTerminalPropertyActivityCode agentTerminalPropertyActivityCode;
    @XmlElement(name = "AgentTerminalPropertyReadyStatus")
    protected AgentTerminalPropertyReadyStatus agentTerminalPropertyReadyStatus;
    @XmlElement(name = "AgentTerminalPropertyValidateAgentStatus")
    protected AgentTerminalPropertyValidateAgentStatus agentTerminalPropertyValidateAgentStatus;

    /**
     * Gets the value of the terminalProperty property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalProperty }
     *     
     */
    public TerminalProperty getTerminalProperty() {
        return terminalProperty;
    }

    /**
     * Sets the value of the terminalProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalProperty }
     *     
     */
    public void setTerminalProperty(TerminalProperty value) {
        this.terminalProperty = value;
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
     * Gets the value of the terminalCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalCapabilities }
     *     
     */
    public TerminalCapabilities getTerminalCapabilities() {
        return terminalCapabilities;
    }

    /**
     * Sets the value of the terminalCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalCapabilities }
     *     
     */
    public void setTerminalCapabilities(TerminalCapabilities value) {
        this.terminalCapabilities = value;
    }

    /**
     * Gets the value of the terminalPropertyDoNotDisturb property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalPropertyDoNotDisturb }
     *     
     */
    public TerminalPropertyDoNotDisturb getTerminalPropertyDoNotDisturb() {
        return terminalPropertyDoNotDisturb;
    }

    /**
     * Sets the value of the terminalPropertyDoNotDisturb property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalPropertyDoNotDisturb }
     *     
     */
    public void setTerminalPropertyDoNotDisturb(TerminalPropertyDoNotDisturb value) {
        this.terminalPropertyDoNotDisturb = value;
    }

    /**
     * Gets the value of the terminalPropertyForwardingArray property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalPropertyForwardingArray }
     *     
     */
    public TerminalPropertyForwardingArray getTerminalPropertyForwardingArray() {
        return terminalPropertyForwardingArray;
    }

    /**
     * Sets the value of the terminalPropertyForwardingArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalPropertyForwardingArray }
     *     
     */
    public void setTerminalPropertyForwardingArray(TerminalPropertyForwardingArray value) {
        this.terminalPropertyForwardingArray = value;
    }

    /**
     * Gets the value of the terminalPropertyContactTypeArray property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalPropertyContactTypeArray }
     *     
     */
    public TerminalPropertyContactTypeArray getTerminalPropertyContactTypeArray() {
        return terminalPropertyContactTypeArray;
    }

    /**
     * Sets the value of the terminalPropertyContactTypeArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalPropertyContactTypeArray }
     *     
     */
    public void setTerminalPropertyContactTypeArray(TerminalPropertyContactTypeArray value) {
        this.terminalPropertyContactTypeArray = value;
    }

    /**
     * Gets the value of the terminalPropertyTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalPropertyTreatment }
     *     
     */
    public TerminalPropertyTreatment getTerminalPropertyTreatment() {
        return terminalPropertyTreatment;
    }

    /**
     * Sets the value of the terminalPropertyTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalPropertyTreatment }
     *     
     */
    public void setTerminalPropertyTreatment(TerminalPropertyTreatment value) {
        this.terminalPropertyTreatment = value;
    }

    /**
     * Gets the value of the terminalPropertyTransport property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalPropertyTransport }
     *     
     */
    public TerminalPropertyTransport getTerminalPropertyTransport() {
        return terminalPropertyTransport;
    }

    /**
     * Sets the value of the terminalPropertyTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalPropertyTransport }
     *     
     */
    public void setTerminalPropertyTransport(TerminalPropertyTransport value) {
        this.terminalPropertyTransport = value;
    }

    /**
     * Gets the value of the terminalPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalPropertyName }
     *     
     */
    public TerminalPropertyName getTerminalPropertyName() {
        return terminalPropertyName;
    }

    /**
     * Sets the value of the terminalPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalPropertyName }
     *     
     */
    public void setTerminalPropertyName(TerminalPropertyName value) {
        this.terminalPropertyName = value;
    }

    /**
     * Gets the value of the terminalPropertyPort property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalPropertyPort }
     *     
     */
    public TerminalPropertyPort getTerminalPropertyPort() {
        return terminalPropertyPort;
    }

    /**
     * Sets the value of the terminalPropertyPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalPropertyPort }
     *     
     */
    public void setTerminalPropertyPort(TerminalPropertyPort value) {
        this.terminalPropertyPort = value;
    }

    /**
     * Gets the value of the agentTerminalPropertyAgentLoginSession property.
     * 
     * @return
     *     possible object is
     *     {@link AgentTerminalPropertyAgentLoginSession }
     *     
     */
    public AgentTerminalPropertyAgentLoginSession getAgentTerminalPropertyAgentLoginSession() {
        return agentTerminalPropertyAgentLoginSession;
    }

    /**
     * Sets the value of the agentTerminalPropertyAgentLoginSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentTerminalPropertyAgentLoginSession }
     *     
     */
    public void setAgentTerminalPropertyAgentLoginSession(AgentTerminalPropertyAgentLoginSession value) {
        this.agentTerminalPropertyAgentLoginSession = value;
    }

    /**
     * Gets the value of the agentTerminalPropertyAgentLoginSessionEnded property.
     * 
     * @return
     *     possible object is
     *     {@link AgentTerminalPropertyAgentLoginSessionEnded }
     *     
     */
    public AgentTerminalPropertyAgentLoginSessionEnded getAgentTerminalPropertyAgentLoginSessionEnded() {
        return agentTerminalPropertyAgentLoginSessionEnded;
    }

    /**
     * Sets the value of the agentTerminalPropertyAgentLoginSessionEnded property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentTerminalPropertyAgentLoginSessionEnded }
     *     
     */
    public void setAgentTerminalPropertyAgentLoginSessionEnded(AgentTerminalPropertyAgentLoginSessionEnded value) {
        this.agentTerminalPropertyAgentLoginSessionEnded = value;
    }

    /**
     * Gets the value of the agentTerminalPropertyActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link AgentTerminalPropertyActivityCode }
     *     
     */
    public AgentTerminalPropertyActivityCode getAgentTerminalPropertyActivityCode() {
        return agentTerminalPropertyActivityCode;
    }

    /**
     * Sets the value of the agentTerminalPropertyActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentTerminalPropertyActivityCode }
     *     
     */
    public void setAgentTerminalPropertyActivityCode(AgentTerminalPropertyActivityCode value) {
        this.agentTerminalPropertyActivityCode = value;
    }

    /**
     * Gets the value of the agentTerminalPropertyReadyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgentTerminalPropertyReadyStatus }
     *     
     */
    public AgentTerminalPropertyReadyStatus getAgentTerminalPropertyReadyStatus() {
        return agentTerminalPropertyReadyStatus;
    }

    /**
     * Sets the value of the agentTerminalPropertyReadyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentTerminalPropertyReadyStatus }
     *     
     */
    public void setAgentTerminalPropertyReadyStatus(AgentTerminalPropertyReadyStatus value) {
        this.agentTerminalPropertyReadyStatus = value;
    }

    /**
     * Gets the value of the agentTerminalPropertyValidateAgentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AgentTerminalPropertyValidateAgentStatus }
     *     
     */
    public AgentTerminalPropertyValidateAgentStatus getAgentTerminalPropertyValidateAgentStatus() {
        return agentTerminalPropertyValidateAgentStatus;
    }

    /**
     * Sets the value of the agentTerminalPropertyValidateAgentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentTerminalPropertyValidateAgentStatus }
     *     
     */
    public void setAgentTerminalPropertyValidateAgentStatus(AgentTerminalPropertyValidateAgentStatus value) {
        this.agentTerminalPropertyValidateAgentStatus = value;
    }

}
