
package com.nortel.soa.oi.cct.types.addressservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTerminalStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTerminalStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTerminalStatusResponse", propOrder = {
    "terminalStatus"
})
public class GetTerminalStatusResponse {

    @XmlElement(required = true)
    protected String terminalStatus;

    /**
     * Gets the value of the terminalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalStatus() {
        return terminalStatus;
    }

    /**
     * Sets the value of the terminalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalStatus(String value) {
        this.terminalStatus = value;
    }

}
