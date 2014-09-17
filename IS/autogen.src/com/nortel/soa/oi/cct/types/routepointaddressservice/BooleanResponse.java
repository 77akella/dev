
package com.nortel.soa.oi.cct.types.routepointaddressservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BooleanResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BooleanResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BooleanResponse", propOrder = {
    "response"
})
public class BooleanResponse {

    protected boolean response;

    /**
     * Gets the value of the response property.
     * 
     */
    public boolean isResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     */
    public void setResponse(boolean value) {
        this.response = value;
    }

}
