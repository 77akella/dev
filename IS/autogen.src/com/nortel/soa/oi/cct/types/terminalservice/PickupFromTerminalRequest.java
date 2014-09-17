
package com.nortel.soa.oi.cct.types.terminalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.SsoToken;
import com.nortel.soa.oi.cct.types.Terminal;
import com.nortel.soa.oi.cct.types.TerminalConnection;


/**
 * <p>Java class for PickupFromTerminalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupFromTerminalRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="terminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="terminalConnection" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnection"/>
 *         &lt;element name="terminalAddress" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupFromTerminalRequest", propOrder = {
    "ssoToken",
    "terminal",
    "terminalConnection",
    "terminalAddress"
})
public class PickupFromTerminalRequest {

    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(required = true)
    protected Terminal terminal;
    @XmlElement(required = true)
    protected TerminalConnection terminalConnection;
    @XmlElement(required = true)
    protected Address terminalAddress;

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
     * Gets the value of the terminalConnection property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnection }
     *     
     */
    public TerminalConnection getTerminalConnection() {
        return terminalConnection;
    }

    /**
     * Sets the value of the terminalConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnection }
     *     
     */
    public void setTerminalConnection(TerminalConnection value) {
        this.terminalConnection = value;
    }

    /**
     * Gets the value of the terminalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getTerminalAddress() {
        return terminalAddress;
    }

    /**
     * Sets the value of the terminalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setTerminalAddress(Address value) {
        this.terminalAddress = value;
    }

}
