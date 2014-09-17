
package com.nortel.soa.oi.cct.types.agentterminalconnectionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.nortel.soa.oi.cct.types.GetVersionRequest;
import com.nortel.soa.oi.cct.types.GetVersionResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.types.agentterminalconnectionservice package. 
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

    private final static QName _GetConsultContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetConsultContactRequest");
    private final static QName _GetTerminalResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetTerminalResponse");
    private final static QName _GetTransferConsultContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetTransferConsultContactRequest");
    private final static QName _GetConferenceConsultContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetConferenceConsultContactRequest");
    private final static QName _GetTerminalRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetTerminalRequest");
    private final static QName _EmergencyKeyResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "EmergencyKeyResponse");
    private final static QName _GetStateRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetStateRequest");
    private final static QName _GetActivityCodeResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetActivityCodeResponse");
    private final static QName _GetConnectionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetConnectionResponse");
    private final static QName _GetConferenceConsultContactResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetConferenceConsultContactResponse");
    private final static QName _GetTerminalConnectionCapabilitiesRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetTerminalConnectionCapabilitiesRequest");
    private final static QName _SetActivityCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "SetActivityCodeRequest");
    private final static QName _GetActivityCodeRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetActivityCodeRequest");
    private final static QName _GetVersionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetVersionRequest");
    private final static QName _EmergencyKeyRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "EmergencyKeyRequest");
    private final static QName _GetStateResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetStateResponse");
    private final static QName _GetConsultContactResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetConsultContactResponse");
    private final static QName _GetConnectionRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetConnectionRequest");
    private final static QName _GetTransferConsultContactResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetTransferConsultContactResponse");
    private final static QName _GetTerminalConnectionCapabilitiesResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetTerminalConnectionCapabilitiesResponse");
    private final static QName _GetContactResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetContactResponse");
    private final static QName _GetContactRequest_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetContactRequest");
    private final static QName _GetVersionResponse_QNAME = new QName("http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", "GetVersionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.types.agentterminalconnectionservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetActivityCodeRequest }
     * 
     */
    public SetActivityCodeRequest createSetActivityCodeRequest() {
        return new SetActivityCodeRequest();
    }

    /**
     * Create an instance of {@link TerminalConnectionRequest }
     * 
     */
    public TerminalConnectionRequest createTerminalConnectionRequest() {
        return new TerminalConnectionRequest();
    }

    /**
     * Create an instance of {@link GetAgentTerminalConnectionCapabilitiesResponse }
     * 
     */
    public GetAgentTerminalConnectionCapabilitiesResponse createGetAgentTerminalConnectionCapabilitiesResponse() {
        return new GetAgentTerminalConnectionCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link TerminalResponse }
     * 
     */
    public TerminalResponse createTerminalResponse() {
        return new TerminalResponse();
    }

    /**
     * Create an instance of {@link ContactResponse }
     * 
     */
    public ContactResponse createContactResponse() {
        return new ContactResponse();
    }

    /**
     * Create an instance of {@link GetActivityCodeResponse }
     * 
     */
    public GetActivityCodeResponse createGetActivityCodeResponse() {
        return new GetActivityCodeResponse();
    }

    /**
     * Create an instance of {@link TerminalContactRequest }
     * 
     */
    public TerminalContactRequest createTerminalContactRequest() {
        return new TerminalContactRequest();
    }

    /**
     * Create an instance of {@link ConnectionResponse }
     * 
     */
    public ConnectionResponse createConnectionResponse() {
        return new ConnectionResponse();
    }

    /**
     * Create an instance of {@link TerminalConnectionStateResponse }
     * 
     */
    public TerminalConnectionStateResponse createTerminalConnectionStateResponse() {
        return new TerminalConnectionStateResponse();
    }

    /**
     * Create an instance of {@link StateResponse }
     * 
     */
    public StateResponse createStateResponse() {
        return new StateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetConsultContactRequest")
    public JAXBElement<TerminalConnectionRequest> createGetConsultContactRequest(TerminalConnectionRequest value) {
        return new JAXBElement<TerminalConnectionRequest>(_GetConsultContactRequest_QNAME, TerminalConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetTerminalResponse")
    public JAXBElement<TerminalResponse> createGetTerminalResponse(TerminalResponse value) {
        return new JAXBElement<TerminalResponse>(_GetTerminalResponse_QNAME, TerminalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetTransferConsultContactRequest")
    public JAXBElement<TerminalConnectionRequest> createGetTransferConsultContactRequest(TerminalConnectionRequest value) {
        return new JAXBElement<TerminalConnectionRequest>(_GetTransferConsultContactRequest_QNAME, TerminalConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetConferenceConsultContactRequest")
    public JAXBElement<TerminalConnectionRequest> createGetConferenceConsultContactRequest(TerminalConnectionRequest value) {
        return new JAXBElement<TerminalConnectionRequest>(_GetConferenceConsultContactRequest_QNAME, TerminalConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetTerminalRequest")
    public JAXBElement<TerminalConnectionRequest> createGetTerminalRequest(TerminalConnectionRequest value) {
        return new JAXBElement<TerminalConnectionRequest>(_GetTerminalRequest_QNAME, TerminalConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "EmergencyKeyResponse")
    public JAXBElement<ContactResponse> createEmergencyKeyResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_EmergencyKeyResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetStateRequest")
    public JAXBElement<TerminalConnectionRequest> createGetStateRequest(TerminalConnectionRequest value) {
        return new JAXBElement<TerminalConnectionRequest>(_GetStateRequest_QNAME, TerminalConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivityCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetActivityCodeResponse")
    public JAXBElement<GetActivityCodeResponse> createGetActivityCodeResponse(GetActivityCodeResponse value) {
        return new JAXBElement<GetActivityCodeResponse>(_GetActivityCodeResponse_QNAME, GetActivityCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetConnectionResponse")
    public JAXBElement<ConnectionResponse> createGetConnectionResponse(ConnectionResponse value) {
        return new JAXBElement<ConnectionResponse>(_GetConnectionResponse_QNAME, ConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetConferenceConsultContactResponse")
    public JAXBElement<ContactResponse> createGetConferenceConsultContactResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_GetConferenceConsultContactResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetTerminalConnectionCapabilitiesRequest")
    public JAXBElement<TerminalConnectionRequest> createGetTerminalConnectionCapabilitiesRequest(TerminalConnectionRequest value) {
        return new JAXBElement<TerminalConnectionRequest>(_GetTerminalConnectionCapabilitiesRequest_QNAME, TerminalConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetActivityCodeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "SetActivityCodeRequest")
    public JAXBElement<SetActivityCodeRequest> createSetActivityCodeRequest(SetActivityCodeRequest value) {
        return new JAXBElement<SetActivityCodeRequest>(_SetActivityCodeRequest_QNAME, SetActivityCodeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetActivityCodeRequest")
    public JAXBElement<TerminalConnectionRequest> createGetActivityCodeRequest(TerminalConnectionRequest value) {
        return new JAXBElement<TerminalConnectionRequest>(_GetActivityCodeRequest_QNAME, TerminalConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetVersionRequest")
    public JAXBElement<GetVersionRequest> createGetVersionRequest(GetVersionRequest value) {
        return new JAXBElement<GetVersionRequest>(_GetVersionRequest_QNAME, GetVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalContactRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "EmergencyKeyRequest")
    public JAXBElement<TerminalContactRequest> createEmergencyKeyRequest(TerminalContactRequest value) {
        return new JAXBElement<TerminalContactRequest>(_EmergencyKeyRequest_QNAME, TerminalContactRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetStateResponse")
    public JAXBElement<TerminalConnectionStateResponse> createGetStateResponse(TerminalConnectionStateResponse value) {
        return new JAXBElement<TerminalConnectionStateResponse>(_GetStateResponse_QNAME, TerminalConnectionStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetConsultContactResponse")
    public JAXBElement<ContactResponse> createGetConsultContactResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_GetConsultContactResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetConnectionRequest")
    public JAXBElement<TerminalConnectionRequest> createGetConnectionRequest(TerminalConnectionRequest value) {
        return new JAXBElement<TerminalConnectionRequest>(_GetConnectionRequest_QNAME, TerminalConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetTransferConsultContactResponse")
    public JAXBElement<ContactResponse> createGetTransferConsultContactResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_GetTransferConsultContactResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgentTerminalConnectionCapabilitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetTerminalConnectionCapabilitiesResponse")
    public JAXBElement<GetAgentTerminalConnectionCapabilitiesResponse> createGetTerminalConnectionCapabilitiesResponse(GetAgentTerminalConnectionCapabilitiesResponse value) {
        return new JAXBElement<GetAgentTerminalConnectionCapabilitiesResponse>(_GetTerminalConnectionCapabilitiesResponse_QNAME, GetAgentTerminalConnectionCapabilitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetContactResponse")
    public JAXBElement<ContactResponse> createGetContactResponse(ContactResponse value) {
        return new JAXBElement<ContactResponse>(_GetContactResponse_QNAME, ContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminalConnectionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetContactRequest")
    public JAXBElement<TerminalConnectionRequest> createGetContactRequest(TerminalConnectionRequest value) {
        return new JAXBElement<TerminalConnectionRequest>(_GetContactRequest_QNAME, TerminalConnectionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/types/AgentTerminalConnectionService", name = "GetVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

}
