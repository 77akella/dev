
package com.nortel.soa.oi.cct.types.metricsservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.metricsservice package. 
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

    private final static QName _GetMonitoredTerminalsResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetMonitoredTerminalsResponse");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetVersionResponse");
    private final static QName _GetMonitoredTerminalsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetMonitoredTerminalsRequest");
    private final static QName _GetActiveSessionCountRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetActiveSessionCountRequest");
    private final static QName _GetLicenseConsumedCountResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetLicenseConsumedCountResponse");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetVersionRequest");
    private final static QName _GetMonitoredAddressCountRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetMonitoredAddressCountRequest");
    private final static QName _GetMonitoredAddressCountResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetMonitoredAddressCountResponse");
    private final static QName _GetLicenseConsumedCountRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetLicenseConsumedCountRequest");
    private final static QName _GetActiveSessionCountResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/MetricsService", "GetActiveSessionCountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.metricsservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetricsRequest }
     * 
     */
    public MetricsRequest createMetricsRequest() {
        return new MetricsRequest();
    }

    /**
     * Create an instance of {@link MetricsResponse }
     * 
     */
    public MetricsResponse createMetricsResponse() {
        return new MetricsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetMonitoredTerminalsResponse")
    public JAXBElement<MetricsResponse> createGetMonitoredTerminalsResponse(MetricsResponse value) {
        return new JAXBElement<MetricsResponse>(_GetMonitoredTerminalsResponse_QNAME, MetricsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetMonitoredTerminalsRequest")
    public JAXBElement<MetricsRequest> createGetMonitoredTerminalsRequest(MetricsRequest value) {
        return new JAXBElement<MetricsRequest>(_GetMonitoredTerminalsRequest_QNAME, MetricsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetActiveSessionCountRequest")
    public JAXBElement<MetricsRequest> createGetActiveSessionCountRequest(MetricsRequest value) {
        return new JAXBElement<MetricsRequest>(_GetActiveSessionCountRequest_QNAME, MetricsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetLicenseConsumedCountResponse")
    public JAXBElement<MetricsResponse> createGetLicenseConsumedCountResponse(MetricsResponse value) {
        return new JAXBElement<MetricsResponse>(_GetLicenseConsumedCountResponse_QNAME, MetricsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetMonitoredAddressCountRequest")
    public JAXBElement<MetricsRequest> createGetMonitoredAddressCountRequest(MetricsRequest value) {
        return new JAXBElement<MetricsRequest>(_GetMonitoredAddressCountRequest_QNAME, MetricsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetMonitoredAddressCountResponse")
    public JAXBElement<MetricsResponse> createGetMonitoredAddressCountResponse(MetricsResponse value) {
        return new JAXBElement<MetricsResponse>(_GetMonitoredAddressCountResponse_QNAME, MetricsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetLicenseConsumedCountRequest")
    public JAXBElement<MetricsRequest> createGetLicenseConsumedCountRequest(MetricsRequest value) {
        return new JAXBElement<MetricsRequest>(_GetLicenseConsumedCountRequest_QNAME, MetricsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetricsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/MetricsService", name = "GetActiveSessionCountResponse")
    public JAXBElement<MetricsResponse> createGetActiveSessionCountResponse(MetricsResponse value) {
        return new JAXBElement<MetricsResponse>(_GetActiveSessionCountResponse_QNAME, MetricsResponse.class, null, value);
    }

}
