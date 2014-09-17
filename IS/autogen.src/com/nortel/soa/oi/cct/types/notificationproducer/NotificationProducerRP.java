
package com.nortel.soa.oi.cct.types.notificationproducer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.basenotification.TopicExpressionType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Topic" type="{http://www.nortel.com/soa/oi/cct/BaseNotification}TopicExpressionType" maxOccurs="unbounded"/>
 *         &lt;element name="FixedTopicSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TopicExpressionDialects" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "topic",
    "fixedTopicSet",
    "topicExpressionDialects"
})
@XmlRootElement(name = "NotificationProducerRP")
public class NotificationProducerRP {

    @XmlElement(name = "Topic", required = true)
    protected List<TopicExpressionType> topic;
    @XmlElement(name = "FixedTopicSet")
    protected boolean fixedTopicSet;
    @XmlElement(name = "TopicExpressionDialects", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicExpressionDialects;

    /**
     * Gets the value of the topic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopicExpressionType }
     * 
     * 
     */
    public List<TopicExpressionType> getTopic() {
        if (topic == null) {
            topic = new ArrayList<TopicExpressionType>();
        }
        return this.topic;
    }

    /**
     * Gets the value of the fixedTopicSet property.
     * 
     */
    public boolean isFixedTopicSet() {
        return fixedTopicSet;
    }

    /**
     * Sets the value of the fixedTopicSet property.
     * 
     */
    public void setFixedTopicSet(boolean value) {
        this.fixedTopicSet = value;
    }

    /**
     * Gets the value of the topicExpressionDialects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicExpressionDialects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicExpressionDialects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTopicExpressionDialects() {
        if (topicExpressionDialects == null) {
            topicExpressionDialects = new ArrayList<String>();
        }
        return this.topicExpressionDialects;
    }

}
