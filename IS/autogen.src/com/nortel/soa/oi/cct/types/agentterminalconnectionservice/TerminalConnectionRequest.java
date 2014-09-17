
package com.nortel.soa.oi.cct.types.agentterminalconnectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.SsoToken;
import com.nortel.soa.oi.cct.types.TerminalConnection;


/**
 * <p>Java class for TerminalConnectionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalConnectionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="terminalConnection" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalConnectionRequest", propOrder = {
    "ssoToken",
    "terminalConnection"
})
public class TerminalConnectionRequest {

    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(required = true)
    protected TerminalConnection terminalConnection;

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

}
