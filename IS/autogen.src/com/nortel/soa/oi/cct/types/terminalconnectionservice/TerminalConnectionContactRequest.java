
package com.nortel.soa.oi.cct.types.terminalconnectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Contact;
import com.nortel.soa.oi.cct.types.SsoToken;
import com.nortel.soa.oi.cct.types.TerminalConnection;


/**
 * <p>Java class for TerminalConnectionContactRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalConnectionContactRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="terminalConnection" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnection"/>
 *         &lt;element name="consultedContact" type="{http://www.nortel.com/soa/oi/cct/types}contact"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalConnectionContactRequest", propOrder = {
    "ssoToken",
    "terminalConnection",
    "consultedContact"
})
public class TerminalConnectionContactRequest {

    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(required = true)
    protected TerminalConnection terminalConnection;
    @XmlElement(required = true)
    protected Contact consultedContact;

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

    /**
     * Gets the value of the consultedContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getConsultedContact() {
        return consultedContact;
    }

    /**
     * Sets the value of the consultedContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setConsultedContact(Contact value) {
        this.consultedContact = value;
    }

}
