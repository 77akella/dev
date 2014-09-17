
package com.nortel.soa.oi.cct.types.routepointconnectionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.routepointconnectionservice package. 
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

    private final static QName _RouteResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", "RouteResponse");
    private final static QName _GiveMediaTreatmentRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", "GiveMediaTreatmentRequest");
    private final static QName _RouteRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", "RouteRequest");
    private final static QName _GetCapabilitiesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", "GetCapabilitiesResponse");
    private final static QName _RoutePointRetrieveRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", "RoutePointRetrieveRequest");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", "GetVersionResponse");
    private final static QName _GiveMediaTreatmentResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", "GiveMediaTreatmentResponse");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", "GetVersionRequest");
    private final static QName _GetCapabilitiesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", "GetCapabilitiesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.routepointconnectionservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GiveMediaTreatmentRequest }
     * 
     */
    public GiveMediaTreatmentRequest createGiveMediaTreatmentRequest() {
        return new GiveMediaTreatmentRequest();
    }

    /**
     * Create an instance of {@link ConnectionCapabilitiesResponse }
     * 
     */
    public ConnectionCapabilitiesResponse createConnectionCapabilitiesResponse() {
        return new ConnectionCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link RouteResponse }
     * 
     */
    public RouteResponse createRouteResponse() {
        return new RouteResponse();
    }

    /**
     * Create an instance of {@link RouteRequest }
     * 
     */
    public RouteRequest createRouteRequest() {
        return new RouteRequest();
    }

    /**
     * Create an instance of {@link RoutePointRetrieveRequest }
     * 
     */
    public RoutePointRetrieveRequest createRoutePointRetrieveRequest() {
        return new RoutePointRetrieveRequest();
    }

    /**
     * Create an instance of {@link ConnectionRequest }
     * 
     */
    public ConnectionRequest createConnectionRequest() {
        return new ConnectionRequest();
    }

    /**
     * Create an instance of {@link GiveMediaTreatmentResponse }
     * 
     */
    public GiveMediaTreatmentResponse createGiveMediaTreatmentResponse() {
        return new GiveMediaTreatmentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", name = "RouteResponse")
    public JAXBElement<RouteResponse> createRouteResponse(RouteResponse value) {
        return new JAXBElement<RouteResponse>(_RouteResponse_QNAME, RouteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiveMediaTreatmentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", name = "GiveMediaTreatmentRequest")
    public JAXBElement<GiveMediaTreatmentRequest> createGiveMediaTreatmentRequest(GiveMediaTreatmentRequest value) {
        return new JAXBElement<GiveMediaTreatmentRequest>(_GiveMediaTreatmentRequest_QNAME, GiveMediaTreatmentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", name = "RouteRequest")
    public JAXBElement<RouteRequest> createRouteRequest(RouteRequest value) {
        return new JAXBElement<RouteRequest>(_RouteRequest_QNAME, RouteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionCapabilitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", name = "GetCapabilitiesResponse")
    public JAXBElement<ConnectionCapabilitiesResponse> createGetCapabilitiesResponse(ConnectionCapabilitiesResponse value) {
        return new JAXBElement<ConnectionCapabilitiesResponse>(_GetCapabilitiesResponse_QNAME, ConnectionCapabilitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutePointRetrieveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", name = "RoutePointRetrieveRequest")
    public JAXBElement<RoutePointRetrieveRequest> createRoutePointRetrieveRequest(RoutePointRetrieveRequest value) {
        return new JAXBElement<RoutePointRetrieveRequest>(_RoutePointRetrieveRequest_QNAME, RoutePointRetrieveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiveMediaTreatmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", name = "GiveMediaTreatmentResponse")
    public JAXBElement<GiveMediaTreatmentResponse> createGiveMediaTreatmentResponse(GiveMediaTreatmentResponse value) {
        return new JAXBElement<GiveMediaTreatmentResponse>(_GiveMediaTreatmentResponse_QNAME, GiveMediaTreatmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/RoutePointConnectionService", name = "GetCapabilitiesRequest")
    public JAXBElement<ConnectionRequest> createGetCapabilitiesRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_GetCapabilitiesRequest_QNAME, ConnectionRequest.class, null, value);
    }

}
