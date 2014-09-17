
package com.nortel.soa.oi.cct.types.connectionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;
import com.nortel.soa.oi.cct.types.Reason;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.connectionservice package. 
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

    private final static QName _GetStateRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetStateRequest");
    private final static QName _GetRecordingStateRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetRecordingStateRequest");
    private final static QName _ParkRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "ParkRequest");
    private final static QName _RejectRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "RejectRequest");
    private final static QName _RedirectRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "RedirectRequest");
    private final static QName _GetRecordingStateReasonResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetRecordingStateReasonResponse");
    private final static QName _ParkResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "ParkResponse");
    private final static QName _GetConnectionCapabilitiesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetConnectionCapabilitiesRequest");
    private final static QName _GetConnectionCapabilitiesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetConnectionCapabilitiesResponse");
    private final static QName _StartRecordingRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "StartRecordingRequest");
    private final static QName _GetAddressRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetAddressRequest");
    private final static QName _StopRecordingRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "StopRecordingRequest");
    private final static QName _AlertRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "AlertRequest");
    private final static QName _GetContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetContactRequest");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetVersionResponse");
    private final static QName _DisconnectRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "DisconnectRequest");
    private final static QName _GetAddressResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetAddressResponse");
    private final static QName _RedirectResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "RedirectResponse");
    private final static QName _GetContactResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetContactResponse");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetVersionRequest");
    private final static QName _GetRecordingStateResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetRecordingStateResponse");
    private final static QName _AcceptRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "AcceptRequest");
    private final static QName _GetStateResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetStateResponse");
    private final static QName _GetTerminalConnectionsRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetTerminalConnectionsRequest");
    private final static QName _GetRecordingStateReasonRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetRecordingStateReasonRequest");
    private final static QName _GetTerminalConnectionsResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/ConnectionService", "GetTerminalConnectionsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.connectionservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConnectionRequest }
     * 
     */
    public ConnectionRequest createConnectionRequest() {
        return new ConnectionRequest();
    }

    /**
     * Create an instance of {@link RecordingRequest }
     * 
     */
    public RecordingRequest createRecordingRequest() {
        return new RecordingRequest();
    }

    /**
     * Create an instance of {@link RedirectRequest }
     * 
     */
    public RedirectRequest createRedirectRequest() {
        return new RedirectRequest();
    }

    /**
     * Create an instance of {@link RedirectResponse }
     * 
     */
    public RedirectResponse createRedirectResponse() {
        return new RedirectResponse();
    }

    /**
     * Create an instance of {@link AddressResponse }
     * 
     */
    public AddressResponse createAddressResponse() {
        return new AddressResponse();
    }

    /**
     * Create an instance of {@link TerminalConnectionsResponse }
     * 
     */
    public TerminalConnectionsResponse createTerminalConnectionsResponse() {
        return new TerminalConnectionsResponse();
    }

    /**
     * Create an instance of {@link ContactResponse }
     * 
     */
    public ContactResponse createContactResponse() {
        return new ContactResponse();
    }

    /**
     * Create an instance of {@link ParkRequest }
     * 
     */
    public ParkRequest createParkRequest() {
        return new ParkRequest();
    }

    /**
     * Create an instance of {@link ParkResponse }
     * 
     */
    public ParkResponse createParkResponse() {
        return new ParkResponse();
    }

    /**
     * Create an instance of {@link ConnectionCapabilitiesResponse }
     * 
     */
    public ConnectionCapabilitiesResponse createConnectionCapabilitiesResponse() {
        return new ConnectionCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link ConnectionStateResponse }
     * 
     */
    public ConnectionStateResponse createConnectionStateResponse() {
        return new ConnectionStateResponse();
    }

    /**
     * Create an instance of {@link StateResponse }
     * 
     */
    public StateResponse createStateResponse() {
        return new StateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetStateRequest")
    public JAXBElement<ConnectionRequest> createGetStateRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_GetStateRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetRecordingStateRequest")
    public JAXBElement<ConnectionRequest> createGetRecordingStateRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_GetRecordingStateRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "ParkRequest")
    public JAXBElement<ParkRequest> createParkRequest(ParkRequest value) {
        return new JAXBElement<ParkRequest>(_ParkRequest_QNAME, ParkRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "RejectRequest")
    public JAXBElement<ConnectionRequest> createRejectRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_RejectRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedirectRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "RedirectRequest")
    public JAXBElement<RedirectRequest> createRedirectRequest(RedirectRequest value) {
        return new JAXBElement<RedirectRequest>(_RedirectRequest_QNAME, RedirectRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetRecordingStateReasonResponse")
    public JAXBElement<Reason> createGetRecordingStateReasonResponse(Reason value) {
        return new JAXBElement<Reason>(_GetRecordingStateReasonResponse_QNAME, Reason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "ParkResponse")
    public JAXBElement<ParkResponse> createParkResponse(ParkResponse value) {
        return new JAXBElement<ParkResponse>(_ParkResponse_QNAME, ParkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetConnectionCapabilitiesRequest")
    public JAXBElement<ConnectionRequest> createGetConnectionCapabilitiesRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_GetConnectionCapabilitiesRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionCapabilitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetConnectionCapabilitiesResponse")
    public JAXBElement<ConnectionCapabilitiesResponse> createGetConnectionCapabilitiesResponse(ConnectionCapabilitiesResponse value) {
        return new JAXBElement<ConnectionCapabilitiesResponse>(_GetConnectionCapabilitiesResponse_QNAME, ConnectionCapabilitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "StartRecordingRequest")
    public JAXBElement<RecordingRequest> createStartRecordingRequest(RecordingRequest value) {
        return new JAXBElement<RecordingRequest>(_StartRecordingRequest_QNAME, RecordingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetAddressRequest")
    public JAXBElement<ConnectionRequest> createGetAddressRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_GetAddressRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "StopRecordingRequest")
    public JAXBElement<RecordingRequest> createStopRecordingRequest(RecordingRequest value) {
        return new JAXBElement<RecordingRequest>(_StopRecordingRequest_QNAME, RecordingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "AlertRequest")
    public JAXBElement<ConnectionRequest> createAlertRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_AlertRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetContactRequest")
    public JAXBElement<ConnectionRequest> createGetContactRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_GetContactRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "DisconnectRequest")
    public JAXBElement<ConnectionRequest> createDisconnectRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_DisconnectRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetAddressResponse")
    public JAXBElement<AddressResponse> createGetAddressResponse(AddressResponse value) {
        return new JAXBElement<AddressResponse>(_GetAddressResponse_QNAME, AddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedirectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "RedirectResponse")
    public JAXBElement<RedirectResponse> createRedirectResponse(RedirectResponse value) {
        return new JAXBElement<RedirectResponse>(_RedirectResponse_QNAME, RedirectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetContactResponse")
    public JAXBElement<ContactResponse> createGetContactResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_GetContactResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordingState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetRecordingStateResponse")
    public JAXBElement<RecordingState> createGetRecordingStateResponse(RecordingState value) {
        return new JAXBElement<RecordingState>(_GetRecordingStateResponse_QNAME, RecordingState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "AcceptRequest")
    public JAXBElement<ConnectionRequest> createAcceptRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_AcceptRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetStateResponse")
    public JAXBElement<ConnectionStateResponse> createGetStateResponse(ConnectionStateResponse value) {
        return new JAXBElement<ConnectionStateResponse>(_GetStateResponse_QNAME, ConnectionStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetTerminalConnectionsRequest")
    public JAXBElement<ConnectionRequest> createGetTerminalConnectionsRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_GetTerminalConnectionsRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetRecordingStateReasonRequest")
    public JAXBElement<ConnectionRequest> createGetRecordingStateReasonRequest(ConnectionRequest value) {
        return new JAXBElement<ConnectionRequest>(_GetRecordingStateReasonRequest_QNAME, ConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/ConnectionService", name = "GetTerminalConnectionsResponse")
    public JAXBElement<TerminalConnectionsResponse> createGetTerminalConnectionsResponse(TerminalConnectionsResponse value) {
        return new JAXBElement<TerminalConnectionsResponse>(_GetTerminalConnectionsResponse_QNAME, TerminalConnectionsResponse.class, null, value);
    }

}
