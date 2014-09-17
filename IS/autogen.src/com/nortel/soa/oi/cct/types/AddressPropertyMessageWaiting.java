
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressPropertyMessageWaiting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressPropertyMessageWaiting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageWaiting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numberMessageWaiting" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressPropertyMessageWaiting", propOrder = {
    "messageWaiting",
    "numberMessageWaiting"
})
public class AddressPropertyMessageWaiting {

    protected boolean messageWaiting;
    protected int numberMessageWaiting;

    /**
     * Gets the value of the messageWaiting property.
     * 
     */
    public boolean isMessageWaiting() {
        return messageWaiting;
    }

    /**
     * Sets the value of the messageWaiting property.
     * 
     */
    public void setMessageWaiting(boolean value) {
        this.messageWaiting = value;
    }

    /**
     * Gets the value of the numberMessageWaiting property.
     * 
     */
    public int getNumberMessageWaiting() {
        return numberMessageWaiting;
    }

    /**
     * Sets the value of the numberMessageWaiting property.
     * 
     */
    public void setNumberMessageWaiting(int value) {
        this.numberMessageWaiting = value;
    }

}
