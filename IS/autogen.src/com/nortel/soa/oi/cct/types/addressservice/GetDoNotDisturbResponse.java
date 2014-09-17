
package com.nortel.soa.oi.cct.types.addressservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetDoNotDisturbResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDoNotDisturbResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doNotDisturb" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDoNotDisturbResponse", propOrder = {
    "doNotDisturb"
})
public class GetDoNotDisturbResponse {

    protected boolean doNotDisturb;

    /**
     * Gets the value of the doNotDisturb property.
     * 
     */
    public boolean isDoNotDisturb() {
        return doNotDisturb;
    }

    /**
     * Sets the value of the doNotDisturb property.
     * 
     */
    public void setDoNotDisturb(boolean value) {
        this.doNotDisturb = value;
    }

}
