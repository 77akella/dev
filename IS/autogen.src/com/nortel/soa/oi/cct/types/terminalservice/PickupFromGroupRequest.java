
package com.nortel.soa.oi.cct.types.terminalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.SsoToken;
import com.nortel.soa.oi.cct.types.Terminal;


/**
 * <p>Java class for PickupFromGroupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupFromGroupRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="terminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="pickupGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PickupFromGroupRequest", propOrder = {
    "ssoToken",
    "terminal",
    "pickupGroup",
    "terminalAddress"
})
public class PickupFromGroupRequest {

    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(required = true)
    protected Terminal terminal;
    @XmlElement(required = true)
    protected String pickupGroup;
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
     * Gets the value of the pickupGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupGroup() {
        return pickupGroup;
    }

    /**
     * Sets the value of the pickupGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupGroup(String value) {
        this.pickupGroup = value;
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
