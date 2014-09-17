
package com.nortel.soa.oi.cct.types.agentterminalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsReadyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsReadyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isReady" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsReadyResponse", propOrder = {
    "isReady"
})
public class IsReadyResponse {

    protected boolean isReady;

    /**
     * Gets the value of the isReady property.
     * 
     */
    public boolean isIsReady() {
        return isReady;
    }

    /**
     * Sets the value of the isReady property.
     * 
     */
    public void setIsReady(boolean value) {
        this.isReady = value;
    }

}
