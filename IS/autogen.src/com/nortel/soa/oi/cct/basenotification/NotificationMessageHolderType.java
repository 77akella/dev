
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.xmlsoap.schemas.ws._2003._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for NotificationMessageHolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMessageHolderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Topic" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}TopicExpressionType"/>
 *         &lt;element name="ProducerReference" type="{http://schemas.xmlsoap.org/ws/2003/03/addressing}EndpointReferenceType" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}NotificationEventHolderType"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SubscriptionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessageHolderType", propOrder = {
    "topic",
    "producerReference",
    "message",
    "sessionId",
    "subscriptionId",
    "timestamp"
})
public class NotificationMessageHolderType {

    @XmlElement(name = "Topic", required = true)
    protected TopicExpressionType topic;
    @XmlElement(name = "ProducerReference")
    protected EndpointReferenceType producerReference;
    @XmlElement(name = "Message", required = true)
    protected NotificationEventHolderType message;
    @XmlElement(name = "SessionId", required = true)
    protected String sessionId;
    @XmlElement(name = "SubscriptionId", required = true)
    protected String subscriptionId;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link TopicExpressionType }
     *     
     */
    public TopicExpressionType getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicExpressionType }
     *     
     */
    public void setTopic(TopicExpressionType value) {
        this.topic = value;
    }

    /**
     * Gets the value of the producerReference property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getProducerReference() {
        return producerReference;
    }

    /**
     * Sets the value of the producerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setProducerReference(EndpointReferenceType value) {
        this.producerReference = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEventHolderType }
     *     
     */
    public NotificationEventHolderType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEventHolderType }
     *     
     */
    public void setMessage(NotificationEventHolderType value) {
        this.message = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
