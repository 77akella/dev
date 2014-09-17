
package com.nortel.soa.oi.cct.types.terminalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.TerminalCapabilities;


/**
 * <p>Java class for GetTerminalCapabilitiesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTerminalCapabilitiesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalCapabilities" type="{http://www.nortel.com/soa/oi/cct/types}terminalCapabilities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTerminalCapabilitiesResponse", propOrder = {
    "terminalCapabilities"
})
public class GetTerminalCapabilitiesResponse {

    @XmlElement(required = true)
    protected TerminalCapabilities terminalCapabilities;

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
