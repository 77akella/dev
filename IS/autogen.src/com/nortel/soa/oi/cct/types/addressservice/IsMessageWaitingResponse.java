
package com.nortel.soa.oi.cct.types.addressservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsMessageWaitingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsMessageWaitingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isMessageWaiting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsMessageWaitingResponse", propOrder = {
    "isMessageWaiting"
})
public class IsMessageWaitingResponse {

    protected boolean isMessageWaiting;

    /**
     * Gets the value of the isMessageWaiting property.
     * 
     */
    public boolean isIsMessageWaiting() {
        return isMessageWaiting;
    }

    /**
     * Sets the value of the isMessageWaiting property.
     * 
     */
    public void setIsMessageWaiting(boolean value) {
        this.isMessageWaiting = value;
    }

}
