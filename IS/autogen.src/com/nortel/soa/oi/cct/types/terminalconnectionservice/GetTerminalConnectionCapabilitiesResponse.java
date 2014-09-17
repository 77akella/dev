
package com.nortel.soa.oi.cct.types.terminalconnectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.TerminalConnectionCapabilities;


/**
 * <p>Java class for GetTerminalConnectionCapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTerminalConnectionCapabilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalConnectionCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnectionCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTerminalConnectionCapabilitiesResponse", propOrder = {
    "terminalConnectionCapabilities"
})
public class GetTerminalConnectionCapabilitiesResponse {

    @XmlElement(required = true)
    protected TerminalConnectionCapabilities terminalConnectionCapabilities;

    /**
     * Gets the value of the terminalConnectionCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionCapabilities }
     *     
     */
    public TerminalConnectionCapabilities getTerminalConnectionCapabilities() {
        return terminalConnectionCapabilities;
    }

    /**
     * Sets the value of the terminalConnectionCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionCapabilities }
     *     
     */
    public void setTerminalConnectionCapabilities(TerminalConnectionCapabilities value) {
        this.terminalConnectionCapabilities = value;
    }

}
