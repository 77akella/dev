
package com.nortel.soa.oi.cct.types.notificationproducer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.basenotification.TopicExpressionType;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.notificationproducer package. 
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

    private final static QName _Topic_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/NotificationProducer", "Topic");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/NotificationProducer", "GetVersionRequest");
    private final static QName _FixedTopicSet_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/NotificationProducer", "FixedTopicSet");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/NotificationProducer", "GetVersionResponse");
    private final static QName _CurrentTime_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/NotificationProducer", "CurrentTime");
    private final static QName _TerminationTime_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/NotificationProducer", "TerminationTime");
    private final static QName _GetVersionFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/NotificationProducer", "GetVersionFault");
    private final static QName _TopicExpressionDialects_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/NotificationProducer", "TopicExpressionDialects");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.notificationproducer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationProducerRP }
     * 
     */
    public NotificationProducerRP createNotificationProducerRP() {
        return new NotificationProducerRP();
    }

    /**
     * Create an instance of {@link GetVersionFaultType }
     * 
     */
    public GetVersionFaultType createGetVersionFaultType() {
        return new GetVersionFaultType();
    }

    /**
     * Create an instance of {@link Renew }
     * 
     */
    public Renew createRenew() {
        return new Renew();
    }

    /**
     * Create an instance of {@link UnsubscribeResponse }
     * 
     */
    public UnsubscribeResponse createUnsubscribeResponse() {
        return new UnsubscribeResponse();
    }

    /**
     * Create an instance of {@link SubscribeResponse }
     * 
     */
    public SubscribeResponse createSubscribeResponse() {
        return new SubscribeResponse();
    }

    /**
     * Create an instance of {@link RenewResponse }
     * 
     */
    public RenewResponse createRenewResponse() {
        return new RenewResponse();
    }

    /**
     * Create an instance of {@link Unsubscribe }
     * 
     */
    public Unsubscribe createUnsubscribe() {
        return new Unsubscribe();
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/NotificationProducer", name = "Topic")
    public JAXBElement<TopicExpressionType> createTopic(TopicExpressionType value) {
        return new JAXBElement<TopicExpressionType>(_Topic_QNAME, TopicExpressionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/NotificationProducer", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/NotificationProducer", name = "FixedTopicSet")
    public JAXBElement<Boolean> createFixedTopicSet(Boolean value) {
        return new JAXBElement<Boolean>(_FixedTopicSet_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/NotificationProducer", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/NotificationProducer", name = "CurrentTime")
    public JAXBElement<Object> createCurrentTime(Object value) {
        return new JAXBElement<Object>(_CurrentTime_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/NotificationProducer", name = "TerminationTime")
    public JAXBElement<Object> createTerminationTime(Object value) {
        return new JAXBElement<Object>(_TerminationTime_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/NotificationProducer", name = "GetVersionFault")
    public JAXBElement<GetVersionFaultType> createGetVersionFault(GetVersionFaultType value) {
        return new JAXBElement<GetVersionFaultType>(_GetVersionFault_QNAME, GetVersionFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/NotificationProducer", name = "TopicExpressionDialects")
    public JAXBElement<String> createTopicExpressionDialects(String value) {
        return new JAXBElement<String>(_TopicExpressionDialects_QNAME, String.class, null, value);
    }

}
