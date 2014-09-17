
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.ResourceState;
import com.nortel.soa.oi.cct.types.Terminal;
import com.nortel.soa.oi.cct.types.TerminalCapabilities;


/**
 * 
 * 				This event is fired when an Terminals state changes.
 * 				The event will detail the following;
 * 					The terminal associated with the notification
 * 				    That terminals state 
 * 				    The reason associated with the state
 * 			
 * 
 * <p>Java class for TerminalStateEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalStateEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Terminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="State" type="{http://www.nortel.com/soa/oi/cct/types}resourceState"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TerminalCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}terminalCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalStateEventType", propOrder = {
    "terminal",
    "state",
    "reason",
    "terminalCapabilities"
})
public class TerminalStateEventType {

    @XmlElement(name = "Terminal", required = true)
    protected Terminal terminal;
    @XmlElement(name = "State", required = true)
    protected ResourceState state;
    @XmlElement(name = "Reason", required = true)
    protected String reason;
    @XmlElement(name = "TerminalCapabilities", required = true)
    protected TerminalCapabilities terminalCapabilities;

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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceState }
     *     
     */
    public ResourceState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceState }
     *     
     */
    public void setState(ResourceState value) {
        this.state = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
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

}
