
package com.nortel.soa.oi.cct.types.routepointaddressservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.routepointaddressservice package. 
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

    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", "GetVersionRequest");
    private final static QName _ReleaseControlRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", "ReleaseControlRequest");
    private final static QName _IsControlledRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", "IsControlledRequest");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", "GetVersionResponse");
    private final static QName _ControlRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", "ControlRequest");
    private final static QName _IsControlledResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", "IsControlledResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.routepointaddressservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoutePointAddressRequest }
     * 
     */
    public RoutePointAddressRequest createRoutePointAddressRequest() {
        return new RoutePointAddressRequest();
    }

    /**
     * Create an instance of {@link BooleanResponse }
     * 
     */
    public BooleanResponse createBooleanResponse() {
        return new BooleanResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePointAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", name = "ReleaseControlRequest")
    public JAXBElement<RoutePointAddressRequest> createReleaseControlRequest(RoutePointAddressRequest value) {
        return new JAXBElement<RoutePointAddressRequest>(_ReleaseControlRequest_QNAME, RoutePointAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePointAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", name = "IsControlledRequest")
    public JAXBElement<RoutePointAddressRequest> createIsControlledRequest(RoutePointAddressRequest value) {
        return new JAXBElement<RoutePointAddressRequest>(_IsControlledRequest_QNAME, RoutePointAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePointAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", name = "ControlRequest")
    public JAXBElement<RoutePointAddressRequest> createControlRequest(RoutePointAddressRequest value) {
        return new JAXBElement<RoutePointAddressRequest>(_ControlRequest_QNAME, RoutePointAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointAddressService", name = "IsControlledResponse")
    public JAXBElement<BooleanResponse> createIsControlledResponse(BooleanResponse value) {
        return new JAXBElement<BooleanResponse>(_IsControlledResponse_QNAME, BooleanResponse.class, null, value);
    }

}
