
package com.nortel.soa.oi.cct.types.sessionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Terminal;


/**
 * <p>Java class for TerminalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalResponse" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalResponse", propOrder = {
    "terminalResponse"
})
public class TerminalResponse {

    @XmlElement(required = true)
    protected Terminal terminalResponse;

    /**
     * Gets the value of the terminalResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getTerminalResponse() {
        return terminalResponse;
    }

    /**
     * Sets the value of the terminalResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setTerminalResponse(Terminal value) {
        this.terminalResponse = value;
    }

}
