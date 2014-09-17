
package com.nortel.soa.oi.cct.types.agentterminalconnectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.TerminalConnectionStateInfo;


/**
 * <p>Java class for TerminalConnectionStateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalConnectionStateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalConnectionStateInfo" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnectionStateInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalConnectionStateResponse", propOrder = {
    "terminalConnectionStateInfo"
})
public class TerminalConnectionStateResponse {

    @XmlElement(required = true)
    protected TerminalConnectionStateInfo terminalConnectionStateInfo;

    /**
     * Gets the value of the terminalConnectionStateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionStateInfo }
     *     
     */
    public TerminalConnectionStateInfo getTerminalConnectionStateInfo() {
        return terminalConnectionStateInfo;
    }

    /**
     * Sets the value of the terminalConnectionStateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionStateInfo }
     *     
     */
    public void setTerminalConnectionStateInfo(TerminalConnectionStateInfo value) {
        this.terminalConnectionStateInfo = value;
    }

}
