
package com.nortel.soa.oi.cct.types.userservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;
import org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.userservice package. 
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

    private final static QName _UnsubscribeFailedFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/UserService", "UnsubscribeFailedFault");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/UserService", "GetVersionResponse");
    private final static QName _Subscribe_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/UserService", "Subscribe");
    private final static QName _SubscribeFailedFault_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/UserService", "SubscribeFailedFault");
    private final static QName _UnsubscribeResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/UserService", "UnsubscribeResponse");
    private final static QName _Unsubscribe_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/UserService", "Unsubscribe");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/UserService", "GetVersionRequest");
    private final static QName _SubscribeResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/UserService", "SubscribeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.userservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubscribeResponseType }
     * 
     */
    public SubscribeResponseType createSubscribeResponseType() {
        return new SubscribeResponseType();
    }

    /**
     * Create an instance of {@link UnsubscribeResponseType }
     * 
     */
    public UnsubscribeResponseType createUnsubscribeResponseType() {
        return new UnsubscribeResponseType();
    }

    /**
     * Create an instance of {@link UnsubscribeType }
     * 
     */
    public UnsubscribeType createUnsubscribeType() {
        return new UnsubscribeType();
    }

    /**
     * Create an instance of {@link SubscribeType }
     * 
     */
    public SubscribeType createSubscribeType() {
        return new SubscribeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/UserService", name = "UnsubscribeFailedFault")
    public JAXBElement<ExceptionInfo> createUnsubscribeFailedFault(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_UnsubscribeFailedFault_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/UserService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/UserService", name = "Subscribe")
    public JAXBElement<SubscribeType> createSubscribe(SubscribeType value) {
        return new JAXBElement<SubscribeType>(_Subscribe_QNAME, SubscribeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/UserService", name = "SubscribeFailedFault")
    public JAXBElement<ExceptionInfo> createSubscribeFailedFault(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SubscribeFailedFault_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/UserService", name = "UnsubscribeResponse")
    public JAXBElement<UnsubscribeResponseType> createUnsubscribeResponse(UnsubscribeResponseType value) {
        return new JAXBElement<UnsubscribeResponseType>(_UnsubscribeResponse_QNAME, UnsubscribeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/UserService", name = "Unsubscribe")
    public JAXBElement<UnsubscribeType> createUnsubscribe(UnsubscribeType value) {
        return new JAXBElement<UnsubscribeType>(_Unsubscribe_QNAME, UnsubscribeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/UserService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/UserService", name = "SubscribeResponse")
    public JAXBElement<SubscribeResponseType> createSubscribeResponse(SubscribeResponseType value) {
        return new JAXBElement<SubscribeResponseType>(_SubscribeResponse_QNAME, SubscribeResponseType.class, null, value);
    }

}
