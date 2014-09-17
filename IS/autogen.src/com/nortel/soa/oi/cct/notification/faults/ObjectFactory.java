
package com.nortel.soa.oi.cct.notification.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.notification.InvalidTopicExpressionFaultType;
import com.nortel.soa.oi.cct.notification.RenewSubscriptionFailedFaultType;
import com.nortel.soa.oi.cct.notification.ResourceUnknownFaultType;
import com.nortel.soa.oi.cct.notification.SubscribeCreationFailedFaultType;
import com.nortel.soa.oi.cct.notification.TopicNotSupportedFaultType;
import com.nortel.soa.oi.cct.notification.TopicPathDialectUnknownFaultType;
import com.nortel.soa.oi.cct.notification.UnableToDestroySubscriptionFaultType;
import com.nortel.soa.oi.cct.notification.UnacceptableTerminationTimeFaultType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.notification.faults package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RenewSubscriptionFailedFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/notification/faults", "RenewSubscriptionFailedFault");
    private final static QName _SubscribeCreationFailedFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/notification/faults", "SubscribeCreationFailedFault");
    private final static QName _ResourceUnknownFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/notification/faults", "ResourceUnknownFault");
    private final static QName _UnableToDestroySubscriptionFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/notification/faults", "UnableToDestroySubscriptionFault");
    private final static QName _TopicPathDialectUnknownFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/notification/faults", "TopicPathDialectUnknownFault");
    private final static QName _InvalidTopicExpressionFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/notification/faults", "InvalidTopicExpressionFault");
    private final static QName _TopicNotSupportedFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/notification/faults", "TopicNotSupportedFault");
    private final static QName _UnacceptableTerminationTimeFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/notification/faults", "UnacceptableTerminationTimeFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.notification.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenewSubscriptionFailedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/notification/faults", name = "RenewSubscriptionFailedFault")
    public JAXBElement<RenewSubscriptionFailedFaultType> createRenewSubscriptionFailedFault(RenewSubscriptionFailedFaultType value) {
        return new JAXBElement<RenewSubscriptionFailedFaultType>(_RenewSubscriptionFailedFault_QNAME, RenewSubscriptionFailedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeCreationFailedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/notification/faults", name = "SubscribeCreationFailedFault")
    public JAXBElement<SubscribeCreationFailedFaultType> createSubscribeCreationFailedFault(SubscribeCreationFailedFaultType value) {
        return new JAXBElement<SubscribeCreationFailedFaultType>(_SubscribeCreationFailedFault_QNAME, SubscribeCreationFailedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceUnknownFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/notification/faults", name = "ResourceUnknownFault")
    public JAXBElement<ResourceUnknownFaultType> createResourceUnknownFault(ResourceUnknownFaultType value) {
        return new JAXBElement<ResourceUnknownFaultType>(_ResourceUnknownFault_QNAME, ResourceUnknownFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnableToDestroySubscriptionFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/notification/faults", name = "UnableToDestroySubscriptionFault")
    public JAXBElement<UnableToDestroySubscriptionFaultType> createUnableToDestroySubscriptionFault(UnableToDestroySubscriptionFaultType value) {
        return new JAXBElement<UnableToDestroySubscriptionFaultType>(_UnableToDestroySubscriptionFault_QNAME, UnableToDestroySubscriptionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicPathDialectUnknownFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/notification/faults", name = "TopicPathDialectUnknownFault")
    public JAXBElement<TopicPathDialectUnknownFaultType> createTopicPathDialectUnknownFault(TopicPathDialectUnknownFaultType value) {
        return new JAXBElement<TopicPathDialectUnknownFaultType>(_TopicPathDialectUnknownFault_QNAME, TopicPathDialectUnknownFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTopicExpressionFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/notification/faults", name = "InvalidTopicExpressionFault")
    public JAXBElement<InvalidTopicExpressionFaultType> createInvalidTopicExpressionFault(InvalidTopicExpressionFaultType value) {
        return new JAXBElement<InvalidTopicExpressionFaultType>(_InvalidTopicExpressionFault_QNAME, InvalidTopicExpressionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicNotSupportedFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/notification/faults", name = "TopicNotSupportedFault")
    public JAXBElement<TopicNotSupportedFaultType> createTopicNotSupportedFault(TopicNotSupportedFaultType value) {
        return new JAXBElement<TopicNotSupportedFaultType>(_TopicNotSupportedFault_QNAME, TopicNotSupportedFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnacceptableTerminationTimeFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/notification/faults", name = "UnacceptableTerminationTimeFault")
    public JAXBElement<UnacceptableTerminationTimeFaultType> createUnacceptableTerminationTimeFault(UnacceptableTerminationTimeFaultType value) {
        return new JAXBElement<UnacceptableTerminationTimeFaultType>(_UnacceptableTerminationTimeFault_QNAME, UnacceptableTerminationTimeFaultType.class, null, value);
    }

}
