
package com.nortel.soa.oi.cct.types.sessionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.sessionservice package. 
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

    private final static QName _HoldContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "HoldContactRequest");
    private final static QName _LogInToCCTServerResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "LogInToCCTServerResponse");
    private final static QName _EmergencyKeyRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "EmergencyKeyRequest");
    private final static QName _SetContactDataRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "SetContactDataRequest");
    private final static QName _GenerateDTMFRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GenerateDTMFRequest");
    private final static QName _GetCurrentTerminalCountResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetCurrentTerminalCountResponse");
    private final static QName _LoginAgentToStateRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "LoginAgentToStateRequest");
    private final static QName _MakeSetBusyRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "MakeSetBusyRequest");
    private final static QName _GetAgentsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetAgentsRequest");
    private final static QName _LogoutAgentFromTerminalRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "LogoutAgentFromTerminalRequest");
    private final static QName _GetReadyStateRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetReadyStateRequest");
    private final static QName _GetCurrentAddressCountRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetCurrentAddressCountRequest");
    private final static QName _GetAgentsResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetAgentsResponse");
    private final static QName _GetContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetContactRequest");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetVersionResponse");
    private final static QName _SetToReadyStatetRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "SetToReadyStatetRequest");
    private final static QName _SetToNotReadyStateWithReasonCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "SetToNotReadyStateWithReasonCodeRequest");
    private final static QName _LogoutAgentRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "LogoutAgentRequest");
    private final static QName _DisposeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "DisposeRequest");
    private final static QName _CreateContactResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "CreateContactResponse");
    private final static QName _GetTerminalAddressesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetTerminalAddressesResponse");
    private final static QName _GetAgentTerminalsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetAgentTerminalsRequest");
    private final static QName _GetAddressRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetAddressRequest");
    private final static QName _GetTerminalRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetTerminalRequest");
    private final static QName _SetIntrinsicsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "SetIntrinsicsRequest");
    private final static QName _GetContactDataRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetContactDataRequest");
    private final static QName _SetActivityCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "SetActivityCodeRequest");
    private final static QName _GetIntrinsicsResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetIntrinsicsResponse");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetVersionRequest");
    private final static QName _LogInToCCTServerRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "LogInToCCTServerRequest");
    private final static QName _CallSupervisorRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "CallSupervisorRequest");
    private final static QName _GetTerminalsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetTerminalsRequest");
    private final static QName _GetAgentAddressesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetAgentAddressesResponse");
    private final static QName _InitiateConferenceResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "InitiateConferenceResponse");
    private final static QName _GetAgentTerminalsResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetAgentTerminalsResponse");
    private final static QName _TerminalResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "TerminalResponse");
    private final static QName _AnswerContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "AnswerContactRequest");
    private final static QName _GetTerminalsResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetTerminalsResponse");
    private final static QName _InitiateConferenceRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "InitiateConferenceRequest");
    private final static QName _GetContactResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetContactResponse");
    private final static QName _CreateContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "CreateContactRequest");
    private final static QName _InitiateSupervisedTransferResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "InitiateSupervisedTransferResponse");
    private final static QName _DropContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "DropContactRequest");
    private final static QName _TransferContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "TransferContactRequest");
    private final static QName _AddressResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "AddressResponse");
    private final static QName _GetReadyStateResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetReadyStateResponse");
    private final static QName _GetAgentAddressesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetAgentAddressesRequest");
    private final static QName _GetCurrentAddressCountResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetCurrentAddressCountResponse");
    private final static QName _UnHoldContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "UnHoldContactRequest");
    private final static QName _GetTerminalAddressesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetTerminalAddressesRequest");
    private final static QName _CompleteSupervisedTransferRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "CompleteSupervisedTransferRequest");
    private final static QName _GetCurrentTerminalCountRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetCurrentTerminalCountRequest");
    private final static QName _LoginAgentRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "LoginAgentRequest");
    private final static QName _GetAddressesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetAddressesResponse");
    private final static QName _GetIntrinsicsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetIntrinsicsRequest");
    private final static QName _LoginAgentToTerminalRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "LoginAgentToTerminalRequest");
    private final static QName _LogOffFromCCTServerRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "LogOffFromCCTServerRequest");
    private final static QName _CompleteConferenceRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "CompleteConferenceRequest");
    private final static QName _SetToNotReadyStatetRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "SetToNotReadyStatetRequest");
    private final static QName _InitiateSupervisedTransferRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "InitiateSupervisedTransferRequest");
    private final static QName _GetAddressesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetAddressesRequest");
    private final static QName _GetContactDataResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/SessionService", "GetContactDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.sessionservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactResponse }
     * 
     */
    public ContactResponse createContactResponse() {
        return new ContactResponse();
    }

    /**
     * Create an instance of {@link GetIntrinsicsResponse }
     * 
     */
    public GetIntrinsicsResponse createGetIntrinsicsResponse() {
        return new GetIntrinsicsResponse();
    }

    /**
     * Create an instance of {@link TerminalContactRequest }
     * 
     */
    public TerminalContactRequest createTerminalContactRequest() {
        return new TerminalContactRequest();
    }

    /**
     * Create an instance of {@link TerminalContactAddressRequest }
     * 
     */
    public TerminalContactAddressRequest createTerminalContactAddressRequest() {
        return new TerminalContactAddressRequest();
    }

    /**
     * Create an instance of {@link SetToNotReadyStateWithReasonCodeRequest }
     * 
     */
    public SetToNotReadyStateWithReasonCodeRequest createSetToNotReadyStateWithReasonCodeRequest() {
        return new SetToNotReadyStateWithReasonCodeRequest();
    }

    /**
     * Create an instance of {@link AddressResponse }
     * 
     */
    public AddressResponse createAddressResponse() {
        return new AddressResponse();
    }

    /**
     * Create an instance of {@link GetReadyStateResponse }
     * 
     */
    public GetReadyStateResponse createGetReadyStateResponse() {
        return new GetReadyStateResponse();
    }

    /**
     * Create an instance of {@link LogInToCCTServerResponse }
     * 
     */
    public LogInToCCTServerResponse createLogInToCCTServerResponse() {
        return new LogInToCCTServerResponse();
    }

    /**
     * Create an instance of {@link SetContactDataRequest }
     * 
     */
    public SetContactDataRequest createSetContactDataRequest() {
        return new SetContactDataRequest();
    }

    /**
     * Create an instance of {@link LogInToCCTServerRequest }
     * 
     */
    public LogInToCCTServerRequest createLogInToCCTServerRequest() {
        return new LogInToCCTServerRequest();
    }

    /**
     * Create an instance of {@link GenerateDTMFRequest }
     * 
     */
    public GenerateDTMFRequest createGenerateDTMFRequest() {
        return new GenerateDTMFRequest();
    }

    /**
     * Create an instance of {@link LogoutAgentRequest }
     * 
     */
    public LogoutAgentRequest createLogoutAgentRequest() {
        return new LogoutAgentRequest();
    }

    /**
     * Create an instance of {@link TerminalAddressRequest }
     * 
     */
    public TerminalAddressRequest createTerminalAddressRequest() {
        return new TerminalAddressRequest();
    }

    /**
     * Create an instance of {@link GetAgentAddressesRequest }
     * 
     */
    public GetAgentAddressesRequest createGetAgentAddressesRequest() {
        return new GetAgentAddressesRequest();
    }

    /**
     * Create an instance of {@link SsoRequest }
     * 
     */
    public SsoRequest createSsoRequest() {
        return new SsoRequest();
    }

    /**
     * Create an instance of {@link AddressList }
     * 
     */
    public AddressList createAddressList() {
        return new AddressList();
    }

    /**
     * Create an instance of {@link GetAgentTerminalsRequest }
     * 
     */
    public GetAgentTerminalsRequest createGetAgentTerminalsRequest() {
        return new GetAgentTerminalsRequest();
    }

    /**
     * Create an instance of {@link LoginAgentToStateRequest }
     * 
     */
    public LoginAgentToStateRequest createLoginAgentToStateRequest() {
        return new LoginAgentToStateRequest();
    }

    /**
     * Create an instance of {@link GetTerminalAddressesRequest }
     * 
     */
    public GetTerminalAddressesRequest createGetTerminalAddressesRequest() {
        return new GetTerminalAddressesRequest();
    }

    /**
     * Create an instance of {@link GetAddressRequest }
     * 
     */
    public GetAddressRequest createGetAddressRequest() {
        return new GetAddressRequest();
    }

    /**
     * Create an instance of {@link GetTerminalRequest }
     * 
     */
    public GetTerminalRequest createGetTerminalRequest() {
        return new GetTerminalRequest();
    }

    /**
     * Create an instance of {@link TerminalRequest }
     * 
     */
    public TerminalRequest createTerminalRequest() {
        return new TerminalRequest();
    }

    /**
     * Create an instance of {@link TerminalContactContactRequest }
     * 
     */
    public TerminalContactContactRequest createTerminalContactContactRequest() {
        return new TerminalContactContactRequest();
    }

    /**
     * Create an instance of {@link GetTerminalsRequest }
     * 
     */
    public GetTerminalsRequest createGetTerminalsRequest() {
        return new GetTerminalsRequest();
    }

    /**
     * Create an instance of {@link SetIntrinsicsRequest }
     * 
     */
    public SetIntrinsicsRequest createSetIntrinsicsRequest() {
        return new SetIntrinsicsRequest();
    }

    /**
     * Create an instance of {@link ContactRequest }
     * 
     */
    public ContactRequest createContactRequest() {
        return new ContactRequest();
    }

    /**
     * Create an instance of {@link LoginAgentRequest }
     * 
     */
    public LoginAgentRequest createLoginAgentRequest() {
        return new LoginAgentRequest();
    }

    /**
     * Create an instance of {@link LogoutAgentFromTerminalRequest }
     * 
     */
    public LogoutAgentFromTerminalRequest createLogoutAgentFromTerminalRequest() {
        return new LogoutAgentFromTerminalRequest();
    }

    /**
     * Create an instance of {@link TerminalList }
     * 
     */
    public TerminalList createTerminalList() {
        return new TerminalList();
    }

    /**
     * Create an instance of {@link LoginAgentToTerminalRequest }
     * 
     */
    public LoginAgentToTerminalRequest createLoginAgentToTerminalRequest() {
        return new LoginAgentToTerminalRequest();
    }

    /**
     * Create an instance of {@link TerminalResponse }
     * 
     */
    public TerminalResponse createTerminalResponse() {
        return new TerminalResponse();
    }

    /**
     * Create an instance of {@link SetActivityCodeRequest }
     * 
     */
    public SetActivityCodeRequest createSetActivityCodeRequest() {
        return new SetActivityCodeRequest();
    }

    /**
     * Create an instance of {@link LogOffFromCCTServerRequest }
     * 
     */
    public LogOffFromCCTServerRequest createLogOffFromCCTServerRequest() {
        return new LogOffFromCCTServerRequest();
    }

    /**
     * Create an instance of {@link GetAddressesRequest }
     * 
     */
    public GetAddressesRequest createGetAddressesRequest() {
        return new GetAddressesRequest();
    }

    /**
     * Create an instance of {@link GetAgentsResponse }
     * 
     */
    public GetAgentsResponse createGetAgentsResponse() {
        return new GetAgentsResponse();
    }

    /**
     * Create an instance of {@link CreateContactRequest }
     * 
     */
    public CreateContactRequest createCreateContactRequest() {
        return new CreateContactRequest();
    }

    /**
     * Create an instance of {@link GetContactDataResponse }
     * 
     */
    public GetContactDataResponse createGetContactDataResponse() {
        return new GetContactDataResponse();
    }

    /**
     * Create an instance of {@link ConnectionResponse }
     * 
     */
    public ConnectionResponse createConnectionResponse() {
        return new ConnectionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "HoldContactRequest")
    public JAXBElement<TerminalContactRequest> createHoldContactRequest(TerminalContactRequest value) {
        return new JAXBElement<TerminalContactRequest>(_HoldContactRequest_QNAME, TerminalContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogInToCCTServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "LogInToCCTServerResponse")
    public JAXBElement<LogInToCCTServerResponse> createLogInToCCTServerResponse(LogInToCCTServerResponse value) {
        return new JAXBElement<LogInToCCTServerResponse>(_LogInToCCTServerResponse_QNAME, LogInToCCTServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "EmergencyKeyRequest")
    public JAXBElement<TerminalContactRequest> createEmergencyKeyRequest(TerminalContactRequest value) {
        return new JAXBElement<TerminalContactRequest>(_EmergencyKeyRequest_QNAME, TerminalContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetContactDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "SetContactDataRequest")
    public JAXBElement<SetContactDataRequest> createSetContactDataRequest(SetContactDataRequest value) {
        return new JAXBElement<SetContactDataRequest>(_SetContactDataRequest_QNAME, SetContactDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateDTMFRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GenerateDTMFRequest")
    public JAXBElement<GenerateDTMFRequest> createGenerateDTMFRequest(GenerateDTMFRequest value) {
        return new JAXBElement<GenerateDTMFRequest>(_GenerateDTMFRequest_QNAME, GenerateDTMFRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetCurrentTerminalCountResponse")
    public JAXBElement<Integer> createGetCurrentTerminalCountResponse(Integer value) {
        return new JAXBElement<Integer>(_GetCurrentTerminalCountResponse_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAgentToStateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "LoginAgentToStateRequest")
    public JAXBElement<LoginAgentToStateRequest> createLoginAgentToStateRequest(LoginAgentToStateRequest value) {
        return new JAXBElement<LoginAgentToStateRequest>(_LoginAgentToStateRequest_QNAME, LoginAgentToStateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "MakeSetBusyRequest")
    public JAXBElement<TerminalRequest> createMakeSetBusyRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_MakeSetBusyRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetAgentsRequest")
    public JAXBElement<SsoRequest> createGetAgentsRequest(SsoRequest value) {
        return new JAXBElement<SsoRequest>(_GetAgentsRequest_QNAME, SsoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutAgentFromTerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "LogoutAgentFromTerminalRequest")
    public JAXBElement<LogoutAgentFromTerminalRequest> createLogoutAgentFromTerminalRequest(LogoutAgentFromTerminalRequest value) {
        return new JAXBElement<LogoutAgentFromTerminalRequest>(_LogoutAgentFromTerminalRequest_QNAME, LogoutAgentFromTerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetReadyStateRequest")
    public JAXBElement<TerminalRequest> createGetReadyStateRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_GetReadyStateRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetCurrentAddressCountRequest")
    public JAXBElement<SsoRequest> createGetCurrentAddressCountRequest(SsoRequest value) {
        return new JAXBElement<SsoRequest>(_GetCurrentAddressCountRequest_QNAME, SsoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetAgentsResponse")
    public JAXBElement<GetAgentsResponse> createGetAgentsResponse(GetAgentsResponse value) {
        return new JAXBElement<GetAgentsResponse>(_GetAgentsResponse_QNAME, GetAgentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetContactRequest")
    public JAXBElement<ContactRequest> createGetContactRequest(ContactRequest value) {
        return new JAXBElement<ContactRequest>(_GetContactRequest_QNAME, ContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "SetToReadyStatetRequest")
    public JAXBElement<TerminalRequest> createSetToReadyStatetRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_SetToReadyStatetRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetToNotReadyStateWithReasonCodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "SetToNotReadyStateWithReasonCodeRequest")
    public JAXBElement<SetToNotReadyStateWithReasonCodeRequest> createSetToNotReadyStateWithReasonCodeRequest(SetToNotReadyStateWithReasonCodeRequest value) {
        return new JAXBElement<SetToNotReadyStateWithReasonCodeRequest>(_SetToNotReadyStateWithReasonCodeRequest_QNAME, SetToNotReadyStateWithReasonCodeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutAgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "LogoutAgentRequest")
    public JAXBElement<LogoutAgentRequest> createLogoutAgentRequest(LogoutAgentRequest value) {
        return new JAXBElement<LogoutAgentRequest>(_LogoutAgentRequest_QNAME, LogoutAgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "DisposeRequest")
    public JAXBElement<SsoRequest> createDisposeRequest(SsoRequest value) {
        return new JAXBElement<SsoRequest>(_DisposeRequest_QNAME, SsoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "CreateContactResponse")
    public JAXBElement<ContactResponse> createCreateContactResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_CreateContactResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetTerminalAddressesResponse")
    public JAXBElement<AddressList> createGetTerminalAddressesResponse(AddressList value) {
        return new JAXBElement<AddressList>(_GetTerminalAddressesResponse_QNAME, AddressList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgentTerminalsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetAgentTerminalsRequest")
    public JAXBElement<GetAgentTerminalsRequest> createGetAgentTerminalsRequest(GetAgentTerminalsRequest value) {
        return new JAXBElement<GetAgentTerminalsRequest>(_GetAgentTerminalsRequest_QNAME, GetAgentTerminalsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetAddressRequest")
    public JAXBElement<GetAddressRequest> createGetAddressRequest(GetAddressRequest value) {
        return new JAXBElement<GetAddressRequest>(_GetAddressRequest_QNAME, GetAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetTerminalRequest")
    public JAXBElement<GetTerminalRequest> createGetTerminalRequest(GetTerminalRequest value) {
        return new JAXBElement<GetTerminalRequest>(_GetTerminalRequest_QNAME, GetTerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetIntrinsicsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "SetIntrinsicsRequest")
    public JAXBElement<SetIntrinsicsRequest> createSetIntrinsicsRequest(SetIntrinsicsRequest value) {
        return new JAXBElement<SetIntrinsicsRequest>(_SetIntrinsicsRequest_QNAME, SetIntrinsicsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetContactDataRequest")
    public JAXBElement<ContactRequest> createGetContactDataRequest(ContactRequest value) {
        return new JAXBElement<ContactRequest>(_GetContactDataRequest_QNAME, ContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetActivityCodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "SetActivityCodeRequest")
    public JAXBElement<SetActivityCodeRequest> createSetActivityCodeRequest(SetActivityCodeRequest value) {
        return new JAXBElement<SetActivityCodeRequest>(_SetActivityCodeRequest_QNAME, SetActivityCodeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIntrinsicsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetIntrinsicsResponse")
    public JAXBElement<GetIntrinsicsResponse> createGetIntrinsicsResponse(GetIntrinsicsResponse value) {
        return new JAXBElement<GetIntrinsicsResponse>(_GetIntrinsicsResponse_QNAME, GetIntrinsicsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogInToCCTServerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "LogInToCCTServerRequest")
    public JAXBElement<LogInToCCTServerRequest> createLogInToCCTServerRequest(LogInToCCTServerRequest value) {
        return new JAXBElement<LogInToCCTServerRequest>(_LogInToCCTServerRequest_QNAME, LogInToCCTServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "CallSupervisorRequest")
    public JAXBElement<TerminalAddressRequest> createCallSupervisorRequest(TerminalAddressRequest value) {
        return new JAXBElement<TerminalAddressRequest>(_CallSupervisorRequest_QNAME, TerminalAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTerminalsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetTerminalsRequest")
    public JAXBElement<GetTerminalsRequest> createGetTerminalsRequest(GetTerminalsRequest value) {
        return new JAXBElement<GetTerminalsRequest>(_GetTerminalsRequest_QNAME, GetTerminalsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetAgentAddressesResponse")
    public JAXBElement<AddressList> createGetAgentAddressesResponse(AddressList value) {
        return new JAXBElement<AddressList>(_GetAgentAddressesResponse_QNAME, AddressList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "InitiateConferenceResponse")
    public JAXBElement<ContactResponse> createInitiateConferenceResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_InitiateConferenceResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetAgentTerminalsResponse")
    public JAXBElement<TerminalList> createGetAgentTerminalsResponse(TerminalList value) {
        return new JAXBElement<TerminalList>(_GetAgentTerminalsResponse_QNAME, TerminalList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "TerminalResponse")
    public JAXBElement<TerminalResponse> createTerminalResponse(TerminalResponse value) {
        return new JAXBElement<TerminalResponse>(_TerminalResponse_QNAME, TerminalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "AnswerContactRequest")
    public JAXBElement<TerminalContactRequest> createAnswerContactRequest(TerminalContactRequest value) {
        return new JAXBElement<TerminalContactRequest>(_AnswerContactRequest_QNAME, TerminalContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetTerminalsResponse")
    public JAXBElement<TerminalList> createGetTerminalsResponse(TerminalList value) {
        return new JAXBElement<TerminalList>(_GetTerminalsResponse_QNAME, TerminalList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "InitiateConferenceRequest")
    public JAXBElement<TerminalContactAddressRequest> createInitiateConferenceRequest(TerminalContactAddressRequest value) {
        return new JAXBElement<TerminalContactAddressRequest>(_InitiateConferenceRequest_QNAME, TerminalContactAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetContactResponse")
    public JAXBElement<ContactResponse> createGetContactResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_GetContactResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "CreateContactRequest")
    public JAXBElement<CreateContactRequest> createCreateContactRequest(CreateContactRequest value) {
        return new JAXBElement<CreateContactRequest>(_CreateContactRequest_QNAME, CreateContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "InitiateSupervisedTransferResponse")
    public JAXBElement<ContactResponse> createInitiateSupervisedTransferResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_InitiateSupervisedTransferResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "DropContactRequest")
    public JAXBElement<TerminalContactRequest> createDropContactRequest(TerminalContactRequest value) {
        return new JAXBElement<TerminalContactRequest>(_DropContactRequest_QNAME, TerminalContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "TransferContactRequest")
    public JAXBElement<TerminalContactAddressRequest> createTransferContactRequest(TerminalContactAddressRequest value) {
        return new JAXBElement<TerminalContactAddressRequest>(_TransferContactRequest_QNAME, TerminalContactAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "AddressResponse")
    public JAXBElement<AddressResponse> createAddressResponse(AddressResponse value) {
        return new JAXBElement<AddressResponse>(_AddressResponse_QNAME, AddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReadyStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetReadyStateResponse")
    public JAXBElement<GetReadyStateResponse> createGetReadyStateResponse(GetReadyStateResponse value) {
        return new JAXBElement<GetReadyStateResponse>(_GetReadyStateResponse_QNAME, GetReadyStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgentAddressesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetAgentAddressesRequest")
    public JAXBElement<GetAgentAddressesRequest> createGetAgentAddressesRequest(GetAgentAddressesRequest value) {
        return new JAXBElement<GetAgentAddressesRequest>(_GetAgentAddressesRequest_QNAME, GetAgentAddressesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetCurrentAddressCountResponse")
    public JAXBElement<Integer> createGetCurrentAddressCountResponse(Integer value) {
        return new JAXBElement<Integer>(_GetCurrentAddressCountResponse_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "UnHoldContactRequest")
    public JAXBElement<TerminalContactRequest> createUnHoldContactRequest(TerminalContactRequest value) {
        return new JAXBElement<TerminalContactRequest>(_UnHoldContactRequest_QNAME, TerminalContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTerminalAddressesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetTerminalAddressesRequest")
    public JAXBElement<GetTerminalAddressesRequest> createGetTerminalAddressesRequest(GetTerminalAddressesRequest value) {
        return new JAXBElement<GetTerminalAddressesRequest>(_GetTerminalAddressesRequest_QNAME, GetTerminalAddressesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "CompleteSupervisedTransferRequest")
    public JAXBElement<TerminalContactContactRequest> createCompleteSupervisedTransferRequest(TerminalContactContactRequest value) {
        return new JAXBElement<TerminalContactContactRequest>(_CompleteSupervisedTransferRequest_QNAME, TerminalContactContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SsoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetCurrentTerminalCountRequest")
    public JAXBElement<SsoRequest> createGetCurrentTerminalCountRequest(SsoRequest value) {
        return new JAXBElement<SsoRequest>(_GetCurrentTerminalCountRequest_QNAME, SsoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAgentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "LoginAgentRequest")
    public JAXBElement<LoginAgentRequest> createLoginAgentRequest(LoginAgentRequest value) {
        return new JAXBElement<LoginAgentRequest>(_LoginAgentRequest_QNAME, LoginAgentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetAddressesResponse")
    public JAXBElement<AddressList> createGetAddressesResponse(AddressList value) {
        return new JAXBElement<AddressList>(_GetAddressesResponse_QNAME, AddressList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetIntrinsicsRequest")
    public JAXBElement<ContactRequest> createGetIntrinsicsRequest(ContactRequest value) {
        return new JAXBElement<ContactRequest>(_GetIntrinsicsRequest_QNAME, ContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginAgentToTerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "LoginAgentToTerminalRequest")
    public JAXBElement<LoginAgentToTerminalRequest> createLoginAgentToTerminalRequest(LoginAgentToTerminalRequest value) {
        return new JAXBElement<LoginAgentToTerminalRequest>(_LoginAgentToTerminalRequest_QNAME, LoginAgentToTerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogOffFromCCTServerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "LogOffFromCCTServerRequest")
    public JAXBElement<LogOffFromCCTServerRequest> createLogOffFromCCTServerRequest(LogOffFromCCTServerRequest value) {
        return new JAXBElement<LogOffFromCCTServerRequest>(_LogOffFromCCTServerRequest_QNAME, LogOffFromCCTServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "CompleteConferenceRequest")
    public JAXBElement<TerminalContactContactRequest> createCompleteConferenceRequest(TerminalContactContactRequest value) {
        return new JAXBElement<TerminalContactContactRequest>(_CompleteConferenceRequest_QNAME, TerminalContactContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "SetToNotReadyStatetRequest")
    public JAXBElement<TerminalRequest> createSetToNotReadyStatetRequest(TerminalRequest value) {
        return new JAXBElement<TerminalRequest>(_SetToNotReadyStatetRequest_QNAME, TerminalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "InitiateSupervisedTransferRequest")
    public JAXBElement<TerminalContactAddressRequest> createInitiateSupervisedTransferRequest(TerminalContactAddressRequest value) {
        return new JAXBElement<TerminalContactAddressRequest>(_InitiateSupervisedTransferRequest_QNAME, TerminalContactAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetAddressesRequest")
    public JAXBElement<GetAddressesRequest> createGetAddressesRequest(GetAddressesRequest value) {
        return new JAXBElement<GetAddressesRequest>(_GetAddressesRequest_QNAME, GetAddressesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContactDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/SessionService", name = "GetContactDataResponse")
    public JAXBElement<GetContactDataResponse> createGetContactDataResponse(GetContactDataResponse value) {
        return new JAXBElement<GetContactDataResponse>(_GetContactDataResponse_QNAME, GetContactDataResponse.class, null, value);
    }

}
