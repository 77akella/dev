
package com.nortel.soa.oi.cct.types.terminalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsForwardedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsForwardedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isForwarded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsForwardedResponse", propOrder = {
    "isForwarded"
})
public class IsForwardedResponse {

    protected boolean isForwarded;

    /**
     * Gets the value of the isForwarded property.
     * 
     */
    public boolean isIsForwarded() {
        return isForwarded;
    }

    /**
     * Sets the value of the isForwarded property.
     * 
     */
    public void setIsForwarded(boolean value) {
        this.isForwarded = value;
    }

}
