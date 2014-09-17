
package com.nortel.soa.oi.cct.types.agentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.agentservice package. 
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

    private final static QName _SetSupervisorRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "SetSupervisorRequest");
    private final static QName _LogoutRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "LogoutRequest");
    private final static QName _IsLoggedInRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "IsLoggedInRequest");
    private final static QName _IsReadyResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "IsReadyResponse");
    private final static QName _IsReadyRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "IsReadyRequest");
    private final static QName _GetNotReadyReasonCodeResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetNotReadyReasonCodeResponse");
    private final static QName _GetAgentsResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetAgentsResponse");
    private final static QName _GetTypeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetTypeRequest");
    private final static QName _RetrieveRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "RetrieveRequest");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetVersionResponse");
    private final static QName _IsLoggedInResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "IsLoggedInResponse");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetVersionRequest");
    private final static QName _GetCapabilitiesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetCapabilitiesRequest");
    private final static QName _GetAgentsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetAgentsRequest");
    private final static QName _GetContactTypesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetContactTypesRequest");
    private final static QName _GetContactTypesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetContactTypesResponse");
    private final static QName _GetCapabilitiesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetCapabilitiesResponse");
    private final static QName _RetrieveResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "RetrieveResponse");
    private final static QName _GetNotReadyReasonCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetNotReadyReasonCodeRequest");
    private final static QName _SetReadyRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "SetReadyRequest");
    private final static QName _IsSupervisorResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "IsSupervisorResponse");
    private final static QName _SetStaticVoiceTerminalRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "SetStaticVoiceTerminalRequest");
    private final static QName _GetStaticVoiceTerminalRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetStaticVoiceTerminalRequest");
    private final static QName _GetTypeResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetTypeResponse");
    private final static QName _IsSupervisorRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "IsSupervisorRequest");
    private final static QName _GetStaticVoiceTerminalResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetStaticVoiceTerminalResponse");
    private final static QName _SetNotReadyReasonCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "SetNotReadyReasonCodeRequest");
    private final static QName _LoginRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "LoginRequest");
    private final static QName _GetSupervisorRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetSupervisorRequest");
    private final static QName _GetSupervisorResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentService", "GetSupervisorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.agentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetSupervisorRequest }
     * 
     */
    public SetSupervisorRequest createSetSupervisorRequest() {
        return new SetSupervisorRequest();
    }

    /**
     * Create an instance of {@link BooleanResponse }
     * 
     */
    public BooleanResponse createBooleanResponse() {
        return new BooleanResponse();
    }

    /**
     * Create an instance of {@link GetCapabilitiesResponse }
     * 
     */
    public GetCapabilitiesResponse createGetCapabilitiesResponse() {
        return new GetCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link GetAgentContactTypesResponse }
     * 
     */
    public GetAgentContactTypesResponse createGetAgentContactTypesResponse() {
        return new GetAgentContactTypesResponse();
    }

    /**
     * Create an instance of {@link AgentRequest }
     * 
     */
    public AgentRequest createAgentRequest() {
        return new AgentRequest();
    }

    /**
     * Create an instance of {@link SetReadyRequest }
     * 
     */
    public SetReadyRequest createSetReadyRequest() {
        return new SetReadyRequest();
    }

    /**
     * Create an instance of {@link StringResponse }
     * 
     */
    public StringResponse createStringResponse() {
        return new StringResponse();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link SetStaticVoiceTerminalRequest }
     * 
     */
    public SetStaticVoiceTerminalRequest createSetStaticVoiceTerminalRequest() {
        return new SetStaticVoiceTerminalRequest();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link RetrieveRequest }
     * 
     */
    public RetrieveRequest createRetrieveRequest() {
        return new RetrieveRequest();
    }

    /**
     * Create an instance of {@link GetStaticVoiceTerminalResponse }
     * 
     */
    public GetStaticVoiceTerminalResponse createGetStaticVoiceTerminalResponse() {
        return new GetStaticVoiceTerminalResponse();
    }

    /**
     * Create an instance of {@link SetNotReadyReasonCodeRequest }
     * 
     */
    public SetNotReadyReasonCodeRequest createSetNotReadyReasonCodeRequest() {
        return new SetNotReadyReasonCodeRequest();
    }

    /**
     * Create an instance of {@link GetAgentsResponse }
     * 
     */
    public GetAgentsResponse createGetAgentsResponse() {
        return new GetAgentsResponse();
    }

    /**
     * Create an instance of {@link GetSupervisorResponse }
     * 
     */
    public GetSupervisorResponse createGetSupervisorResponse() {
        return new GetSupervisorResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSupervisorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "SetSupervisorRequest")
    public JAXBElement<SetSupervisorRequest> createSetSupervisorRequest(SetSupervisorRequest value) {
        return new JAXBElement<SetSupervisorRequest>(_SetSupervisorRequest_QNAME, SetSupervisorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "LogoutRequest")
    public JAXBElement<AgentRequest> createLogoutRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_LogoutRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "IsLoggedInRequest")
    public JAXBElement<AgentRequest> createIsLoggedInRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_IsLoggedInRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "IsReadyResponse")
    public JAXBElement<BooleanResponse> createIsReadyResponse(BooleanResponse value) {
        return new JAXBElement<BooleanResponse>(_IsReadyResponse_QNAME, BooleanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "IsReadyRequest")
    public JAXBElement<AgentRequest> createIsReadyRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_IsReadyRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetNotReadyReasonCodeResponse")
    public JAXBElement<StringResponse> createGetNotReadyReasonCodeResponse(StringResponse value) {
        return new JAXBElement<StringResponse>(_GetNotReadyReasonCodeResponse_QNAME, StringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetAgentsResponse")
    public JAXBElement<GetAgentsResponse> createGetAgentsResponse(GetAgentsResponse value) {
        return new JAXBElement<GetAgentsResponse>(_GetAgentsResponse_QNAME, GetAgentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetTypeRequest")
    public JAXBElement<AgentRequest> createGetTypeRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_GetTypeRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "RetrieveRequest")
    public JAXBElement<RetrieveRequest> createRetrieveRequest(RetrieveRequest value) {
        return new JAXBElement<RetrieveRequest>(_RetrieveRequest_QNAME, RetrieveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "IsLoggedInResponse")
    public JAXBElement<BooleanResponse> createIsLoggedInResponse(BooleanResponse value) {
        return new JAXBElement<BooleanResponse>(_IsLoggedInResponse_QNAME, BooleanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetCapabilitiesRequest")
    public JAXBElement<AgentRequest> createGetCapabilitiesRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_GetCapabilitiesRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetAgentsRequest")
    public JAXBElement<AgentRequest> createGetAgentsRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_GetAgentsRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetContactTypesRequest")
    public JAXBElement<AgentRequest> createGetContactTypesRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_GetContactTypesRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgentContactTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetContactTypesResponse")
    public JAXBElement<GetAgentContactTypesResponse> createGetContactTypesResponse(GetAgentContactTypesResponse value) {
        return new JAXBElement<GetAgentContactTypesResponse>(_GetContactTypesResponse_QNAME, GetAgentContactTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapabilitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetCapabilitiesResponse")
    public JAXBElement<GetCapabilitiesResponse> createGetCapabilitiesResponse(GetCapabilitiesResponse value) {
        return new JAXBElement<GetCapabilitiesResponse>(_GetCapabilitiesResponse_QNAME, GetCapabilitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "RetrieveResponse")
    public JAXBElement<RetrieveResponse> createRetrieveResponse(RetrieveResponse value) {
        return new JAXBElement<RetrieveResponse>(_RetrieveResponse_QNAME, RetrieveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetNotReadyReasonCodeRequest")
    public JAXBElement<AgentRequest> createGetNotReadyReasonCodeRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_GetNotReadyReasonCodeRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetReadyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "SetReadyRequest")
    public JAXBElement<SetReadyRequest> createSetReadyRequest(SetReadyRequest value) {
        return new JAXBElement<SetReadyRequest>(_SetReadyRequest_QNAME, SetReadyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "IsSupervisorResponse")
    public JAXBElement<BooleanResponse> createIsSupervisorResponse(BooleanResponse value) {
        return new JAXBElement<BooleanResponse>(_IsSupervisorResponse_QNAME, BooleanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStaticVoiceTerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "SetStaticVoiceTerminalRequest")
    public JAXBElement<SetStaticVoiceTerminalRequest> createSetStaticVoiceTerminalRequest(SetStaticVoiceTerminalRequest value) {
        return new JAXBElement<SetStaticVoiceTerminalRequest>(_SetStaticVoiceTerminalRequest_QNAME, SetStaticVoiceTerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetStaticVoiceTerminalRequest")
    public JAXBElement<AgentRequest> createGetStaticVoiceTerminalRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_GetStaticVoiceTerminalRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetTypeResponse")
    public JAXBElement<StringResponse> createGetTypeResponse(StringResponse value) {
        return new JAXBElement<StringResponse>(_GetTypeResponse_QNAME, StringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "IsSupervisorRequest")
    public JAXBElement<AgentRequest> createIsSupervisorRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_IsSupervisorRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaticVoiceTerminalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetStaticVoiceTerminalResponse")
    public JAXBElement<GetStaticVoiceTerminalResponse> createGetStaticVoiceTerminalResponse(GetStaticVoiceTerminalResponse value) {
        return new JAXBElement<GetStaticVoiceTerminalResponse>(_GetStaticVoiceTerminalResponse_QNAME, GetStaticVoiceTerminalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNotReadyReasonCodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "SetNotReadyReasonCodeRequest")
    public JAXBElement<SetNotReadyReasonCodeRequest> createSetNotReadyReasonCodeRequest(SetNotReadyReasonCodeRequest value) {
        return new JAXBElement<SetNotReadyReasonCodeRequest>(_SetNotReadyReasonCodeRequest_QNAME, SetNotReadyReasonCodeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "LoginRequest")
    public JAXBElement<LoginRequest> createLoginRequest(LoginRequest value) {
        return new JAXBElement<LoginRequest>(_LoginRequest_QNAME, LoginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetSupervisorRequest")
    public JAXBElement<AgentRequest> createGetSupervisorRequest(AgentRequest value) {
        return new JAXBElement<AgentRequest>(_GetSupervisorRequest_QNAME, AgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSupervisorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentService", name = "GetSupervisorResponse")
    public JAXBElement<GetSupervisorResponse> createGetSupervisorResponse(GetSupervisorResponse value) {
        return new JAXBElement<GetSupervisorResponse>(_GetSupervisorResponse_QNAME, GetSupervisorResponse.class, null, value);
    }

}
