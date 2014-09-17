
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageWaiting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageWaiting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageWaiting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="numberOfMessages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageWaiting", propOrder = {
    "messageWaiting",
    "numberOfMessages"
})
public class MessageWaiting {

    protected boolean messageWaiting;
    protected int numberOfMessages;

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
     * Gets the value of the numberOfMessages property.
     * 
     */
    public int getNumberOfMessages() {
        return numberOfMessages;
    }

    /**
     * Sets the value of the numberOfMessages property.
     * 
     */
    public void setNumberOfMessages(int value) {
        this.numberOfMessages = value;
    }

}
