
package com.nortel.soa.oi.cct.types.agentterminalservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.agentterminalservice package. 
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

    private final static QName _GetLoginIdRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetLoginIdRequest");
    private final static QName _GetDoNotDisturbResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetDoNotDisturbResponse");
    private final static QName _LoginRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "LoginRequest");
    private final static QName _SetNotReadyReasonCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "SetNotReadyReasonCodeRequest");
    private final static QName _GetRelatedAddressesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetRelatedAddressesRequest");
    private final static QName _GetCapabilitiesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetCapabilitiesResponse");
    private final static QName _GetActivityCodeResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetActivityCodeResponse");
    private final static QName _GetNotReadyReasonCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetNotReadyReasonCodeRequest");
    private final static QName _IsForwardedResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "IsForwardedResponse");
    private final static QName _SetActivityCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "SetActivityCodeRequest");
    private final static QName _SetIsReadyRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "SetIsReadyRequest");
    private final static QName _GetActivityCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetActivityCodeRequest");
    private final static QName _GetCapabilitiesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetCapabilitiesRequest");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetVersionRequest");
    private final static QName _CallSupervisorRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "CallSupervisorRequest");
    private final static QName _GetTerminalConnectionsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetTerminalConnectionsRequest");
    private final static QName _GetTerminalConnectionsResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetTerminalConnectionsResponse");
    private final static QName _IsForwardedRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "IsForwardedRequest");
    private final static QName _GetDoNotDisturbRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetDoNotDisturbRequest");
    private final static QName _IsReadyRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "IsReadyRequest");
    private final static QName _IsReadyResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "IsReadyResponse");
    private final static QName _LogoutRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "LogoutRequest");
    private final static QName _GetRelatedAddressesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetRelatedAddressesResponse");
    private final static QName _GetLoginIdResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetLoginIdResponse");
    private final static QName _GetNotReadyReasonCodeResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetNotReadyReasonCodeResponse");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", "GetVersionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.agentterminalservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAgentTerminalCapabilitiesResponse }
     * 
     */
    public GetAgentTerminalCapabilitiesResponse createGetAgentTerminalCapabilitiesResponse() {
        return new GetAgentTerminalCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link TerminalRequest }
     * 
     */
    public TerminalRequest createTerminalRequest() {
        return new TerminalRequest();
    }

    /**
     * Create an instance of {@link GetActivityCodeResponse }
     * 
     */
    public GetActivityCodeResponse createGetActivityCodeResponse() {
        return new GetActivityCodeResponse();
    }

    /**
     * Create an instance of {@link IsReadyResponse }
     * 
     */
    public IsReadyResponse createIsReadyResponse() {
        return new IsReadyResponse();
    }

    /**
     * Create an instance of {@link AgentTerminalLogoutRequest }
     * 
     */
    public AgentTerminalLogoutRequest createAgentTerminalLogoutRequest() {
        return new AgentTerminalLogoutRequest();
    }

    /**
     * Create an instance of {@link IsForwardedResponse }
     * 
     */
    public IsForwardedResponse createIsForwardedResponse() {
        return new IsForwardedResponse();
    }

    /**
     * Create an instance of {@link SetActivityCodeRequest }
     * 
     */
    public SetActivityCodeRequest createSetActivityCodeRequest() {
        return new SetActivityCodeRequest();
    }

    /**
     * Create an instance of {@link GetDoNotDisturbResponse }
     * 
     */
    public GetDoNotDisturbResponse createGetDoNotDisturbResponse() {
        return new GetDoNotDisturbResponse();
    }

    /**
     * Create an instance of {@link TerminalAddressRequest }
     * 
     */
    public TerminalAddressRequest createTerminalAddressRequest() {
        return new TerminalAddressRequest();
    }

    /**
     * Create an instance of {@link GetRelatedAddressesResponse }
     * 
     */
    public GetRelatedAddressesResponse createGetRelatedAddressesResponse() {
        return new GetRelatedAddressesResponse();
    }

    /**
     * Create an instance of {@link AgentTerminalLoginRequest }
     * 
     */
    public AgentTerminalLoginRequest createAgentTerminalLoginRequest() {
        return new AgentTerminalLoginRequest();
    }

    /**
     * Create an instance of {@link BooleanTerminalRequest }
     * 
     */
    public BooleanTerminalRequest createBooleanTerminalRequest() {
        return new BooleanTerminalRequest();
    }

    /**
     * Create an instance of {@link GetLoginIdResponse }
     * 
     */
    public GetLoginIdResponse createGetLoginIdResponse() {
        return new GetLoginIdResponse();
    }

    /**
     * Create an instance of {@link StringTerminalRequest }
     * 
     */
    public StringTerminalRequest createStringTerminalRequest() {
        return new StringTerminalRequest();
    }

    /**
     * Create an instance of {@link GetTerminalConnectionsResponse }
     * 
     */
    public GetTerminalConnectionsResponse createGetTerminalConnectionsResponse() {
        return new GetTerminalConnectionsResponse();
    }

    /**
     * Create an instance of {@link GetNotReadyReasonCodeResponse }
     * 
     */
    public GetNotReadyReasonCodeResponse createGetNotReadyReasonCodeResponse() {
        return new GetNotReadyReasonCodeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetLoginIdRequest")
    public JAXBElement<TerminalRequest> createGetLoginIdRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetLoginIdRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoNotDisturbResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetDoNotDisturbResponse")
    public JAXBElement<GetDoNotDisturbResponse> createGetDoNotDisturbResponse(GetDoNotDisturbResponse value) {
        return new JAXBElement<GetDoNotDisturbResponse>(_GetDoNotDisturbResponse_QNAME, GetDoNotDisturbResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentTerminalLoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "LoginRequest")
    public JAXBElement<AgentTerminalLoginRequest> createLoginRequest(AgentTerminalLoginRequest value) {
        return new JAXBElement<AgentTerminalLoginRequest>(_LoginRequest_QNAME, AgentTerminalLoginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringTerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "SetNotReadyReasonCodeRequest")
    public JAXBElement<StringTerminalRequest> createSetNotReadyReasonCodeRequest(StringTerminalRequest value) {
        return new JAXBElement<StringTerminalRequest>(_SetNotReadyReasonCodeRequest_QNAME, StringTerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetRelatedAddressesRequest")
    public JAXBElement<TerminalRequest> createGetRelatedAddressesRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetRelatedAddressesRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgentTerminalCapabilitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetCapabilitiesResponse")
    public JAXBElement<GetAgentTerminalCapabilitiesResponse> createGetCapabilitiesResponse(GetAgentTerminalCapabilitiesResponse value) {
        return new JAXBElement<GetAgentTerminalCapabilitiesResponse>(_GetCapabilitiesResponse_QNAME, GetAgentTerminalCapabilitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetActivityCodeResponse")
    public JAXBElement<GetActivityCodeResponse> createGetActivityCodeResponse(GetActivityCodeResponse value) {
        return new JAXBElement<GetActivityCodeResponse>(_GetActivityCodeResponse_QNAME, GetActivityCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetNotReadyReasonCodeRequest")
    public JAXBElement<TerminalRequest> createGetNotReadyReasonCodeRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetNotReadyReasonCodeRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsForwardedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "IsForwardedResponse")
    public JAXBElement<IsForwardedResponse> createIsForwardedResponse(IsForwardedResponse value) {
        return new JAXBElement<IsForwardedResponse>(_IsForwardedResponse_QNAME, IsForwardedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetActivityCodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "SetActivityCodeRequest")
    public JAXBElement<SetActivityCodeRequest> createSetActivityCodeRequest(SetActivityCodeRequest value) {
        return new JAXBElement<SetActivityCodeRequest>(_SetActivityCodeRequest_QNAME, SetActivityCodeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanTerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "SetIsReadyRequest")
    public JAXBElement<BooleanTerminalRequest> createSetIsReadyRequest(BooleanTerminalRequest value) {
        return new JAXBElement<BooleanTerminalRequest>(_SetIsReadyRequest_QNAME, BooleanTerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetActivityCodeRequest")
    public JAXBElement<TerminalRequest> createGetActivityCodeRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetActivityCodeRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetCapabilitiesRequest")
    public JAXBElement<TerminalRequest> createGetCapabilitiesRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetCapabilitiesRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "CallSupervisorRequest")
    public JAXBElement<TerminalAddressRequest> createCallSupervisorRequest(TerminalAddressRequest value) {
        return new JAXBElement<TerminalAddressRequest>(_CallSupervisorRequest_QNAME, TerminalAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetTerminalConnectionsRequest")
    public JAXBElement<TerminalRequest> createGetTerminalConnectionsRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetTerminalConnectionsRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTerminalConnectionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetTerminalConnectionsResponse")
    public JAXBElement<GetTerminalConnectionsResponse> createGetTerminalConnectionsResponse(GetTerminalConnectionsResponse value) {
        return new JAXBElement<GetTerminalConnectionsResponse>(_GetTerminalConnectionsResponse_QNAME, GetTerminalConnectionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "IsForwardedRequest")
    public JAXBElement<TerminalRequest> createIsForwardedRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_IsForwardedRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetDoNotDisturbRequest")
    public JAXBElement<TerminalRequest> createGetDoNotDisturbRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetDoNotDisturbRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "IsReadyRequest")
    public JAXBElement<TerminalRequest> createIsReadyRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_IsReadyRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsReadyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "IsReadyResponse")
    public JAXBElement<IsReadyResponse> createIsReadyResponse(IsReadyResponse value) {
        return new JAXBElement<IsReadyResponse>(_IsReadyResponse_QNAME, IsReadyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentTerminalLogoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "LogoutRequest")
    public JAXBElement<AgentTerminalLogoutRequest> createLogoutRequest(AgentTerminalLogoutRequest value) {
        return new JAXBElement<AgentTerminalLogoutRequest>(_LogoutRequest_QNAME, AgentTerminalLogoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatedAddressesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetRelatedAddressesResponse")
    public JAXBElement<GetRelatedAddressesResponse> createGetRelatedAddressesResponse(GetRelatedAddressesResponse value) {
        return new JAXBElement<GetRelatedAddressesResponse>(_GetRelatedAddressesResponse_QNAME, GetRelatedAddressesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoginIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetLoginIdResponse")
    public JAXBElement<GetLoginIdResponse> createGetLoginIdResponse(GetLoginIdResponse value) {
        return new JAXBElement<GetLoginIdResponse>(_GetLoginIdResponse_QNAME, GetLoginIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotReadyReasonCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetNotReadyReasonCodeResponse")
    public JAXBElement<GetNotReadyReasonCodeResponse> createGetNotReadyReasonCodeResponse(GetNotReadyReasonCodeResponse value) {
        return new JAXBElement<GetNotReadyReasonCodeResponse>(_GetNotReadyReasonCodeResponse_QNAME, GetNotReadyReasonCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

}
