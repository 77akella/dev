
package com.nortel.soa.oi.cct.types.terminalservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.terminalservice package. 
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

    private final static QName _GetRelatedAddressesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetRelatedAddressesRequest");
    private final static QName _CancelForwardingRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "CancelForwardingRequest");
    private final static QName _GetDoNotDisturbResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetDoNotDisturbResponse");
    private final static QName _OriginateRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "OriginateRequest");
    private final static QName _IsForwardedResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "IsForwardedResponse");
    private final static QName _GetStateRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetStateRequest");
    private final static QName _GetCapabilitiesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetCapabilitiesResponse");
    private final static QName _GetContactTypesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetContactTypesResponse");
    private final static QName _GetDefaultContactTypeResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetDefaultContactTypeResponse");
    private final static QName _SetDoNotDisturbRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "SetDoNotDisturbRequest");
    private final static QName _GetForwardingResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetForwardingResponse");
    private final static QName _GetForwardingRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetForwardingRequest");
    private final static QName _SetForwardingRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "SetForwardingRequest");
    private final static QName _OriginateResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "OriginateResponse");
    private final static QName _PickupFromTerminalResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "PickupFromTerminalResponse");
    private final static QName _GetCapabilitiesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetCapabilitiesRequest");
    private final static QName _PickupFromTerminalRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "PickupFromTerminalRequest");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetVersionRequest");
    private final static QName _PickupFromAddressRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "PickupFromAddressRequest");
    private final static QName _PickupFromAddressResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "PickupFromAddressResponse");
    private final static QName _GetContactTypesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetContactTypesRequest");
    private final static QName _GetStateResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetStateResponse");
    private final static QName _GetTerminalConnectionsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetTerminalConnectionsRequest");
    private final static QName _GetTerminalConnectionsResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetTerminalConnectionsResponse");
    private final static QName _GetDoNotDisturbRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetDoNotDisturbRequest");
    private final static QName _IsForwardedRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "IsForwardedRequest");
    private final static QName _PickupFromGroupRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "PickupFromGroupRequest");
    private final static QName _GetDefaultContactTypeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetDefaultContactTypeRequest");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetVersionResponse");
    private final static QName _GetRelatedAddressesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "GetRelatedAddressesResponse");
    private final static QName _PickupFromGroupResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/TerminalService", "PickupFromGroupResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.terminalservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTerminalCapabilitiesResponse }
     * 
     */
    public GetTerminalCapabilitiesResponse createGetTerminalCapabilitiesResponse() {
        return new GetTerminalCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link TerminalRequest }
     * 
     */
    public TerminalRequest createTerminalRequest() {
        return new TerminalRequest();
    }

    /**
     * Create an instance of {@link ContactResponse }
     * 
     */
    public ContactResponse createContactResponse() {
        return new ContactResponse();
    }

    /**
     * Create an instance of {@link PickupFromGroupRequest }
     * 
     */
    public PickupFromGroupRequest createPickupFromGroupRequest() {
        return new PickupFromGroupRequest();
    }

    /**
     * Create an instance of {@link TerminalConnectionResponse }
     * 
     */
    public TerminalConnectionResponse createTerminalConnectionResponse() {
        return new TerminalConnectionResponse();
    }

    /**
     * Create an instance of {@link GetContactTypesResponse }
     * 
     */
    public GetContactTypesResponse createGetContactTypesResponse() {
        return new GetContactTypesResponse();
    }

    /**
     * Create an instance of {@link StringResponse }
     * 
     */
    public StringResponse createStringResponse() {
        return new StringResponse();
    }

    /**
     * Create an instance of {@link SetDoNotDisturbTerminalRequest }
     * 
     */
    public SetDoNotDisturbTerminalRequest createSetDoNotDisturbTerminalRequest() {
        return new SetDoNotDisturbTerminalRequest();
    }

    /**
     * Create an instance of {@link PickupFromTerminalRequest }
     * 
     */
    public PickupFromTerminalRequest createPickupFromTerminalRequest() {
        return new PickupFromTerminalRequest();
    }

    /**
     * Create an instance of {@link SetForwardingTerminalRequest }
     * 
     */
    public SetForwardingTerminalRequest createSetForwardingTerminalRequest() {
        return new SetForwardingTerminalRequest();
    }

    /**
     * Create an instance of {@link IsForwardedResponse }
     * 
     */
    public IsForwardedResponse createIsForwardedResponse() {
        return new IsForwardedResponse();
    }

    /**
     * Create an instance of {@link GetDoNotDisturbResponse }
     * 
     */
    public GetDoNotDisturbResponse createGetDoNotDisturbResponse() {
        return new GetDoNotDisturbResponse();
    }

    /**
     * Create an instance of {@link GetRelatedAddressesResponse }
     * 
     */
    public GetRelatedAddressesResponse createGetRelatedAddressesResponse() {
        return new GetRelatedAddressesResponse();
    }

    /**
     * Create an instance of {@link GetTerminalConnectionsResponse }
     * 
     */
    public GetTerminalConnectionsResponse createGetTerminalConnectionsResponse() {
        return new GetTerminalConnectionsResponse();
    }

    /**
     * Create an instance of {@link TerminalOriginateRequest }
     * 
     */
    public TerminalOriginateRequest createTerminalOriginateRequest() {
        return new TerminalOriginateRequest();
    }

    /**
     * Create an instance of {@link PickupFromAddressRequest }
     * 
     */
    public PickupFromAddressRequest createPickupFromAddressRequest() {
        return new PickupFromAddressRequest();
    }

    /**
     * Create an instance of {@link GetForwardingResponse }
     * 
     */
    public GetForwardingResponse createGetForwardingResponse() {
        return new GetForwardingResponse();
    }

    /**
     * Create an instance of {@link GetStateResponse }
     * 
     */
    public GetStateResponse createGetStateResponse() {
        return new GetStateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetRelatedAddressesRequest")
    public JAXBElement<TerminalRequest> createGetRelatedAddressesRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetRelatedAddressesRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "CancelForwardingRequest")
    public JAXBElement<TerminalRequest> createCancelForwardingRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_CancelForwardingRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoNotDisturbResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetDoNotDisturbResponse")
    public JAXBElement<GetDoNotDisturbResponse> createGetDoNotDisturbResponse(GetDoNotDisturbResponse value) {
        return new JAXBElement<GetDoNotDisturbResponse>(_GetDoNotDisturbResponse_QNAME, GetDoNotDisturbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalOriginateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "OriginateRequest")
    public JAXBElement<TerminalOriginateRequest> createOriginateRequest(TerminalOriginateRequest value) {
        return new JAXBElement<TerminalOriginateRequest>(_OriginateRequest_QNAME, TerminalOriginateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsForwardedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "IsForwardedResponse")
    public JAXBElement<IsForwardedResponse> createIsForwardedResponse(IsForwardedResponse value) {
        return new JAXBElement<IsForwardedResponse>(_IsForwardedResponse_QNAME, IsForwardedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetStateRequest")
    public JAXBElement<TerminalRequest> createGetStateRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetStateRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTerminalCapabilitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetCapabilitiesResponse")
    public JAXBElement<GetTerminalCapabilitiesResponse> createGetCapabilitiesResponse(GetTerminalCapabilitiesResponse value) {
        return new JAXBElement<GetTerminalCapabilitiesResponse>(_GetCapabilitiesResponse_QNAME, GetTerminalCapabilitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetContactTypesResponse")
    public JAXBElement<GetContactTypesResponse> createGetContactTypesResponse(GetContactTypesResponse value) {
        return new JAXBElement<GetContactTypesResponse>(_GetContactTypesResponse_QNAME, GetContactTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetDefaultContactTypeResponse")
    public JAXBElement<StringResponse> createGetDefaultContactTypeResponse(StringResponse value) {
        return new JAXBElement<StringResponse>(_GetDefaultContactTypeResponse_QNAME, StringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDoNotDisturbTerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "SetDoNotDisturbRequest")
    public JAXBElement<SetDoNotDisturbTerminalRequest> createSetDoNotDisturbRequest(SetDoNotDisturbTerminalRequest value) {
        return new JAXBElement<SetDoNotDisturbTerminalRequest>(_SetDoNotDisturbRequest_QNAME, SetDoNotDisturbTerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetForwardingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetForwardingResponse")
    public JAXBElement<GetForwardingResponse> createGetForwardingResponse(GetForwardingResponse value) {
        return new JAXBElement<GetForwardingResponse>(_GetForwardingResponse_QNAME, GetForwardingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetForwardingRequest")
    public JAXBElement<TerminalRequest> createGetForwardingRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetForwardingRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetForwardingTerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "SetForwardingRequest")
    public JAXBElement<SetForwardingTerminalRequest> createSetForwardingRequest(SetForwardingTerminalRequest value) {
        return new JAXBElement<SetForwardingTerminalRequest>(_SetForwardingRequest_QNAME, SetForwardingTerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "OriginateResponse")
    public JAXBElement<ContactResponse> createOriginateResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_OriginateResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "PickupFromTerminalResponse")
    public JAXBElement<TerminalConnectionResponse> createPickupFromTerminalResponse(TerminalConnectionResponse value) {
        return new JAXBElement<TerminalConnectionResponse>(_PickupFromTerminalResponse_QNAME, TerminalConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetCapabilitiesRequest")
    public JAXBElement<TerminalRequest> createGetCapabilitiesRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetCapabilitiesRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PickupFromTerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "PickupFromTerminalRequest")
    public JAXBElement<PickupFromTerminalRequest> createPickupFromTerminalRequest(PickupFromTerminalRequest value) {
        return new JAXBElement<PickupFromTerminalRequest>(_PickupFromTerminalRequest_QNAME, PickupFromTerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PickupFromAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "PickupFromAddressRequest")
    public JAXBElement<PickupFromAddressRequest> createPickupFromAddressRequest(PickupFromAddressRequest value) {
        return new JAXBElement<PickupFromAddressRequest>(_PickupFromAddressRequest_QNAME, PickupFromAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "PickupFromAddressResponse")
    public JAXBElement<TerminalConnectionResponse> createPickupFromAddressResponse(TerminalConnectionResponse value) {
        return new JAXBElement<TerminalConnectionResponse>(_PickupFromAddressResponse_QNAME, TerminalConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetContactTypesRequest")
    public JAXBElement<TerminalRequest> createGetContactTypesRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetContactTypesRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetStateResponse")
    public JAXBElement<GetStateResponse> createGetStateResponse(GetStateResponse value) {
        return new JAXBElement<GetStateResponse>(_GetStateResponse_QNAME, GetStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetTerminalConnectionsRequest")
    public JAXBElement<TerminalRequest> createGetTerminalConnectionsRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetTerminalConnectionsRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTerminalConnectionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetTerminalConnectionsResponse")
    public JAXBElement<GetTerminalConnectionsResponse> createGetTerminalConnectionsResponse(GetTerminalConnectionsResponse value) {
        return new JAXBElement<GetTerminalConnectionsResponse>(_GetTerminalConnectionsResponse_QNAME, GetTerminalConnectionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetDoNotDisturbRequest")
    public JAXBElement<TerminalRequest> createGetDoNotDisturbRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetDoNotDisturbRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "IsForwardedRequest")
    public JAXBElement<TerminalRequest> createIsForwardedRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_IsForwardedRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PickupFromGroupRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "PickupFromGroupRequest")
    public JAXBElement<PickupFromGroupRequest> createPickupFromGroupRequest(PickupFromGroupRequest value) {
        return new JAXBElement<PickupFromGroupRequest>(_PickupFromGroupRequest_QNAME, PickupFromGroupRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetDefaultContactTypeRequest")
    public JAXBElement<TerminalRequest> createGetDefaultContactTypeRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetDefaultContactTypeRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatedAddressesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "GetRelatedAddressesResponse")
    public JAXBElement<GetRelatedAddressesResponse> createGetRelatedAddressesResponse(GetRelatedAddressesResponse value) {
        return new JAXBElement<GetRelatedAddressesResponse>(_GetRelatedAddressesResponse_QNAME, GetRelatedAddressesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", name = "PickupFromGroupResponse")
    public JAXBElement<TerminalConnectionResponse> createPickupFromGroupResponse(TerminalConnectionResponse value) {
        return new JAXBElement<TerminalConnectionResponse>(_PickupFromGroupResponse_QNAME, TerminalConnectionResponse.class, null, value);
    }

}
