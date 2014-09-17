
package com.nortel.soa.oi.cct.types.addressservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.MessageWaiting;


/**
 * <p>Java class for GetMessageWaitingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMessageWaitingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageWaiting" type="{http://www.nortel.com/soa/oi/cct/types}messageWaiting"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMessageWaitingResponse", propOrder = {
    "messageWaiting"
})
public class GetMessageWaitingResponse {

    @XmlElement(required = true)
    protected MessageWaiting messageWaiting;

    /**
     * Gets the value of the messageWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link MessageWaiting }
     *     
     */
    public MessageWaiting getMessageWaiting() {
        return messageWaiting;
    }

    /**
     * Sets the value of the messageWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageWaiting }
     *     
     */
    public void setMessageWaiting(MessageWaiting value) {
        this.messageWaiting = value;
    }

}
