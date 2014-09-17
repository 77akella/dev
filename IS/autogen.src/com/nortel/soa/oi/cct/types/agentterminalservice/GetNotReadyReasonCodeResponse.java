
package com.nortel.soa.oi.cct.types.agentterminalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNotReadyReasonCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNotReadyReasonCodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notReadyReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNotReadyReasonCodeResponse", propOrder = {
    "notReadyReasonCode"
})
public class GetNotReadyReasonCodeResponse {

    @XmlElement(required = true)
    protected String notReadyReasonCode;

    /**
     * Gets the value of the notReadyReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotReadyReasonCode() {
        return notReadyReasonCode;
    }

    /**
     * Sets the value of the notReadyReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotReadyReasonCode(String value) {
        this.notReadyReasonCode = value;
    }

}
