
package org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.notification.InvalidTopicExpressionFaultType;
import com.nortel.soa.oi.cct.notification.NoCurrentMessageOnTopicFaultType;
import com.nortel.soa.oi.cct.notification.RenewSubscriptionFailedFaultType;
import com.nortel.soa.oi.cct.notification.ResourceUnknownFaultType;
import com.nortel.soa.oi.cct.notification.SubscribeCreationFailedFaultType;
import com.nortel.soa.oi.cct.notification.TopicNotSupportedFaultType;
import com.nortel.soa.oi.cct.notification.TopicPathDialectUnknownFaultType;
import com.nortel.soa.oi.cct.notification.UnableToDestroySubscriptionFaultType;
import com.nortel.soa.oi.cct.notification.UnacceptableTerminationTimeFaultType;
import org.xmlsoap.schemas.ws._2003._03.addressing.EndpointReferenceType;


/**
 * <p>Java class for BaseFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Originator" type="{http://schemas.xmlsoap.org/ws/2003/03/addressing}EndpointReferenceType" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FaultCause" type="{http://docs.oasis-open.org/wsrf/2004/06/wsrf-WS-BaseFaults-1.2-draft-01.xsd}BaseFaultType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFaultType", propOrder = {
    "timestamp",
    "originator",
    "errorCode",
    "description",
    "faultCause"
})
@XmlSeeAlso({
    UnableToDestroySubscriptionFaultType.class,
    InvalidTopicExpressionFaultType.class,
    NoCurrentMessageOnTopicFaultType.class,
    ResourceUnknownFaultType.class,
    UnacceptableTerminationTimeFaultType.class,
    TopicPathDialectUnknownFaultType.class,
    SubscribeCreationFailedFaultType.class,
    RenewSubscriptionFailedFaultType.class,
    TopicNotSupportedFaultType.class,
    ExceptionInfo.class
})
public class BaseFaultType {

    @XmlElement(name = "Timestamp", required = true)
    protected String timestamp;
    @XmlElement(name = "Originator")
    protected EndpointReferenceType originator;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElement(name = "FaultCause")
    protected List<BaseFaultType> faultCause;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setOriginator(EndpointReferenceType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Gets the value of the faultCause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultCause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultCause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseFaultType }
     * 
     * 
     */
    public List<BaseFaultType> getFaultCause() {
        if (faultCause == null) {
            faultCause = new ArrayList<BaseFaultType>();
        }
        return this.faultCause;
    }

}
