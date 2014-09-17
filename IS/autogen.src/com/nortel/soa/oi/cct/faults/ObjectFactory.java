
package com.nortel.soa.oi.cct.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nortel.soa.oi.cct.faults package. 
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

    private final static QName _EmergencyKeyException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "EmergencyKeyException");
    private final static QName _CancelForwardingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "CancelForwardingException");
    private final static QName _SetToReadyStateException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetToReadyStateException");
    private final static QName _GetAddressException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetAddressException");
    private final static QName _RouteException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "RouteException");
    private final static QName _IsMessageWaitingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "IsMessageWaitingException");
    private final static QName _CompleteConferenceException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "CompleteConferenceException");
    private final static QName _InitiateConferenceException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "InitiateConferenceException");
    private final static QName _IsControlledException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "IsControlledException");
    private final static QName _GetIntrinsicsException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetIntrinsicsException");
    private final static QName _LogOffFromCCTServerException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "LogOffFromCCTServerException");
    private final static QName _InitiateSupervisedTransferException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "InitiateSupervisedTransferException");
    private final static QName _SetDoNotDisturbException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetDoNotDisturbException");
    private final static QName _PresenceSubscribeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "PresenceSubscribeException");
    private final static QName _GetContactDataException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetContactDataException");
    private final static QName _GetProvidersException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetProvidersException");
    private final static QName _SetReadyException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetReadyException");
    private final static QName _GetTypeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetTypeException");
    private final static QName _GetUriException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetUriException");
    private final static QName _GetTerminalConnectionsException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetTerminalConnectionsException");
    private final static QName _SendInstantMessageException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SendInstantMessageException");
    private final static QName _GetCallingAddressException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetCallingAddressException");
    private final static QName _ObserveException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "ObserveException");
    private final static QName _GetNotReadyReasonCodeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetNotReadyReasonCodeException");
    private final static QName _GetRelatedAddressesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetRelatedAddressesException");
    private final static QName _SetAttachedDataException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetAttachedDataException");
    private final static QName _LoginException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "LoginException");
    private final static QName _GetTerminalException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetTerminalException");
    private final static QName _GetActivityCodeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetActivityCodeException");
    private final static QName _IsReadyException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "IsReadyException");
    private final static QName _SetForwardingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetForwardingException");
    private final static QName _GetContactTypeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetContactTypeException");
    private final static QName _BargeInException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "BargeInException");
    private final static QName _LoginAgentToTerminalException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "LoginAgentToTerminalException");
    private final static QName _SetNotReadyReasonCodeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetNotReadyReasonCodeException");
    private final static QName _ParkException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "ParkException");
    private final static QName _SetMessageWaitingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetMessageWaitingException");
    private final static QName _GetContactTypesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetContactTypesException");
    private final static QName _GetRecordOnDemandStateReasonException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetRecordOnDemandStateReasonException");
    private final static QName _SetUUIException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetUUIException");
    private final static QName _CreateContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "CreateContactException");
    private final static QName _GetAttachedXMLDataException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetAttachedXMLDataException");
    private final static QName _GetAgentTerminalsException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetAgentTerminalsException");
    private final static QName _SessionNotCreatedException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SessionNotCreatedException");
    private final static QName _UnholdException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "UnholdException");
    private final static QName _GetUUIException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetUUIException");
    private final static QName _GetDoNotDisturbException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetDoNotDisturbException");
    private final static QName _OriginateException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "OriginateException");
    private final static QName _GetStaticVoiceTerminalException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetStaticVoiceTerminalException");
    private final static QName _IsSupervisorException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "IsSupervisorException");
    private final static QName _RetrieveException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "RetrieveException");
    private final static QName _MonitoredAddressesCountException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "MonitoredAddressesCountException");
    private final static QName _SetIsReadyException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetIsReadyException");
    private final static QName _SetSupervisorException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetSupervisorException");
    private final static QName _ConfirmDemandRecordingRequestException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "ConfirmDemandRecordingRequestException");
    private final static QName _PickupException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "PickupException");
    private final static QName _GetInstantMessagesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetInstantMessagesException");
    private final static QName _GetAgentsException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetAgentsException");
    private final static QName _GetReadyStateException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetReadyStateException");
    private final static QName _CompleteSupervisedTransferException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "CompleteSupervisedTransferException");
    private final static QName _DisposeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "DisposeException");
    private final static QName _RequestRecordingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "RequestRecordingException");
    private final static QName _GetForwardingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetForwardingException");
    private final static QName _LoginAgentException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "LoginAgentException");
    private final static QName _StartRecordingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "StartRecordingException");
    private final static QName _GetConnectionCapabilitiesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetConnectionCapabilitiesException");
    private final static QName _GetRecordOnDemandStateException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetRecordOnDemandStateException");
    private final static QName _SetActivityCodeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetActivityCodeException");
    private final static QName _ConfirmSaveRecordingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "ConfirmSaveRecordingException");
    private final static QName _RedirectException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "RedirectException");
    private final static QName _SaveRecordingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SaveRecordingException");
    private final static QName _StopRecordingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "StopRecordingException");
    private final static QName _GetRecordingStateException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetRecordingStateException");
    private final static QName _GetAttachedDataException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetAttachedDataException");
    private final static QName _GiveTreatmentException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GiveTreatmentException");
    private final static QName _GetTransferConsultContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetTransferConsultContactException");
    private final static QName _GetSaveRecordingStateReasonException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetSaveRecordingStateReasonException");
    private final static QName _GetPresenceException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetPresenceException");
    private final static QName _CancelRecordingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "CancelRecordingException");
    private final static QName _MakeSetBusyException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "MakeSetBusyException");
    private final static QName _GetCapabilitiesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetCapabilitiesException");
    private final static QName _SetStaticVoiceTerminalException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetStaticVoiceTerminalException");
    private final static QName _AnswerException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "AnswerException");
    private final static QName _GetTerminalStatusException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetTerminalStatusException");
    private final static QName _LoginAgentToStateException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "LoginAgentToStateException");
    private final static QName _SetInstantMessagesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetInstantMessagesException");
    private final static QName _GetConnectionException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetConnectionException");
    private final static QName _IsLoggedInException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "IsLoggedInException");
    private final static QName _IsForwardedException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "IsForwardedException");
    private final static QName _TransferContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "TransferContactException");
    private final static QName _ReleaseControlException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "ReleaseControlException");
    private final static QName _GetCurrentTerminalCountException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetCurrentTerminalCountException");
    private final static QName _AcceptException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "AcceptException");
    private final static QName _GetMessageWaitingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetMessageWaitingException");
    private final static QName _GetSupervisorException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetSupervisorException");
    private final static QName _GetTerminalsException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetTerminalsException");
    private final static QName _GiveMediaTreatmentException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GiveMediaTreatmentException");
    private final static QName _DropException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "DropException");
    private final static QName _GetTerminalAddressesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetTerminalAddressesException");
    private final static QName _ConsultException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "ConsultException");
    private final static QName _GetAddressesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetAddressesException");
    private final static QName _UnsaveRecordingException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "UnsaveRecordingException");
    private final static QName _GetCalledAddressException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetCalledAddressException");
    private final static QName _GetContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetContactException");
    private final static QName _AnswerContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "AnswerContactException");
    private final static QName _LogInToCCTServerException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "LogInToCCTServerException");
    private final static QName _GetCurrentAddressCountException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetCurrentAddressCountException");
    private final static QName _RoutePointRetrieveException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "RoutePointRetrieveException");
    private final static QName _GenerateDTMFException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GenerateDTMFException");
    private final static QName _PickupFromGroupException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "PickupFromGroupException");
    private final static QName _TransferException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "TransferException");
    private final static QName _GetTerminalInfoException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetTerminalInfoException");
    private final static QName _GetStateException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetStateException");
    private final static QName _GetConferenceConsultContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetConferenceConsultContactException");
    private final static QName _GetTerminalConnectionCapabilitiesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetTerminalConnectionCapabilitiesException");
    private final static QName _HoldContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "HoldContactException");
    private final static QName _CallSupervisorException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "CallSupervisorException");
    private final static QName _LogoutAgentException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "LogoutAgentException");
    private final static QName _SetToNotReadyStateException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetToNotReadyStateException");
    private final static QName _GetAgentAddressesException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetAgentAddressesException");
    private final static QName _WhisperException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "WhisperException");
    private final static QName _GetCallingTerminalException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetCallingTerminalException");
    private final static QName _DisconnectException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "DisconnectException");
    private final static QName _LogoutException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "LogoutException");
    private final static QName _AlertException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "AlertException");
    private final static QName _MonitoredTerminalsCountException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "MonitoredTerminalsCountException");
    private final static QName _GetLoginIdException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetLoginIdException");
    private final static QName _PresenceUnsubscribeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "PresenceUnsubscribeException");
    private final static QName _AddPartyException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "AddPartyException");
    private final static QName _RejectException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "RejectException");
    private final static QName _GetDefaultContactTypeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetDefaultContactTypeException");
    private final static QName _SetToNotReadyStateWithReasonCodeException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetToNotReadyStateWithReasonCodeException");
    private final static QName _GetVersionException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetVersionException");
    private final static QName _SetIntrinsicsException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetIntrinsicsException");
    private final static QName _GetConnectionsException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetConnectionsException");
    private final static QName _LogoutAgentFromTerminalException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "LogoutAgentFromTerminalException");
    private final static QName _GetLastRedirectedAddressException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetLastRedirectedAddressException");
    private final static QName _GetOriginalDestinationAddressException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetOriginalDestinationAddressException");
    private final static QName _DropContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "DropContactException");
    private final static QName _SetContactDataException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "SetContactDataException");
    private final static QName _GetSaveRecordingStateException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetSaveRecordingStateException");
    private final static QName _HoldException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "HoldException");
    private final static QName _ControlException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "ControlException");
    private final static QName _UnHoldContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "UnHoldContactException");
    private final static QName _GetConsultContactException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetConsultContactException");
    private final static QName _GetRecordingStateReasonException_QNAME = new QName("http://www.nortel.com/soa/oi/cct/faults", "GetRecordingStateReasonException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nortel.soa.oi.cct.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "EmergencyKeyException")
    public JAXBElement<ExceptionInfo> createEmergencyKeyException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_EmergencyKeyException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "CancelForwardingException")
    public JAXBElement<ExceptionInfo> createCancelForwardingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_CancelForwardingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetToReadyStateException")
    public JAXBElement<ExceptionInfo> createSetToReadyStateException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetToReadyStateException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetAddressException")
    public JAXBElement<ExceptionInfo> createGetAddressException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetAddressException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "RouteException")
    public JAXBElement<ExceptionInfo> createRouteException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_RouteException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "IsMessageWaitingException")
    public JAXBElement<ExceptionInfo> createIsMessageWaitingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_IsMessageWaitingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "CompleteConferenceException")
    public JAXBElement<ExceptionInfo> createCompleteConferenceException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_CompleteConferenceException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "InitiateConferenceException")
    public JAXBElement<ExceptionInfo> createInitiateConferenceException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_InitiateConferenceException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "IsControlledException")
    public JAXBElement<ExceptionInfo> createIsControlledException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_IsControlledException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetIntrinsicsException")
    public JAXBElement<ExceptionInfo> createGetIntrinsicsException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetIntrinsicsException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "LogOffFromCCTServerException")
    public JAXBElement<ExceptionInfo> createLogOffFromCCTServerException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_LogOffFromCCTServerException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "InitiateSupervisedTransferException")
    public JAXBElement<ExceptionInfo> createInitiateSupervisedTransferException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_InitiateSupervisedTransferException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetDoNotDisturbException")
    public JAXBElement<ExceptionInfo> createSetDoNotDisturbException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetDoNotDisturbException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "PresenceSubscribeException")
    public JAXBElement<ExceptionInfo> createPresenceSubscribeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_PresenceSubscribeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetContactDataException")
    public JAXBElement<ExceptionInfo> createGetContactDataException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetContactDataException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetProvidersException")
    public JAXBElement<ExceptionInfo> createGetProvidersException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetProvidersException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetReadyException")
    public JAXBElement<ExceptionInfo> createSetReadyException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetReadyException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetTypeException")
    public JAXBElement<ExceptionInfo> createGetTypeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetTypeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetUriException")
    public JAXBElement<ExceptionInfo> createGetUriException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetUriException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetTerminalConnectionsException")
    public JAXBElement<ExceptionInfo> createGetTerminalConnectionsException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetTerminalConnectionsException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SendInstantMessageException")
    public JAXBElement<ExceptionInfo> createSendInstantMessageException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SendInstantMessageException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetCallingAddressException")
    public JAXBElement<ExceptionInfo> createGetCallingAddressException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetCallingAddressException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "ObserveException")
    public JAXBElement<ExceptionInfo> createObserveException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_ObserveException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetNotReadyReasonCodeException")
    public JAXBElement<ExceptionInfo> createGetNotReadyReasonCodeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetNotReadyReasonCodeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetRelatedAddressesException")
    public JAXBElement<ExceptionInfo> createGetRelatedAddressesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetRelatedAddressesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetAttachedDataException")
    public JAXBElement<ExceptionInfo> createSetAttachedDataException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetAttachedDataException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "LoginException")
    public JAXBElement<ExceptionInfo> createLoginException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_LoginException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetTerminalException")
    public JAXBElement<ExceptionInfo> createGetTerminalException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetTerminalException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetActivityCodeException")
    public JAXBElement<ExceptionInfo> createGetActivityCodeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetActivityCodeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "IsReadyException")
    public JAXBElement<ExceptionInfo> createIsReadyException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_IsReadyException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetForwardingException")
    public JAXBElement<ExceptionInfo> createSetForwardingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetForwardingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetContactTypeException")
    public JAXBElement<ExceptionInfo> createGetContactTypeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetContactTypeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "BargeInException")
    public JAXBElement<ExceptionInfo> createBargeInException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_BargeInException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "LoginAgentToTerminalException")
    public JAXBElement<ExceptionInfo> createLoginAgentToTerminalException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_LoginAgentToTerminalException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetNotReadyReasonCodeException")
    public JAXBElement<ExceptionInfo> createSetNotReadyReasonCodeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetNotReadyReasonCodeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "ParkException")
    public JAXBElement<ExceptionInfo> createParkException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_ParkException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetMessageWaitingException")
    public JAXBElement<ExceptionInfo> createSetMessageWaitingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetMessageWaitingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetContactTypesException")
    public JAXBElement<ExceptionInfo> createGetContactTypesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetContactTypesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetRecordOnDemandStateReasonException")
    public JAXBElement<ExceptionInfo> createGetRecordOnDemandStateReasonException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetRecordOnDemandStateReasonException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetUUIException")
    public JAXBElement<ExceptionInfo> createSetUUIException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetUUIException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "CreateContactException")
    public JAXBElement<ExceptionInfo> createCreateContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_CreateContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetAttachedXMLDataException")
    public JAXBElement<ExceptionInfo> createGetAttachedXMLDataException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetAttachedXMLDataException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetAgentTerminalsException")
    public JAXBElement<ExceptionInfo> createGetAgentTerminalsException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetAgentTerminalsException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SessionNotCreatedException")
    public JAXBElement<ExceptionInfo> createSessionNotCreatedException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SessionNotCreatedException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "UnholdException")
    public JAXBElement<ExceptionInfo> createUnholdException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_UnholdException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetUUIException")
    public JAXBElement<ExceptionInfo> createGetUUIException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetUUIException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetDoNotDisturbException")
    public JAXBElement<ExceptionInfo> createGetDoNotDisturbException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetDoNotDisturbException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "OriginateException")
    public JAXBElement<ExceptionInfo> createOriginateException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_OriginateException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetStaticVoiceTerminalException")
    public JAXBElement<ExceptionInfo> createGetStaticVoiceTerminalException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetStaticVoiceTerminalException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "IsSupervisorException")
    public JAXBElement<ExceptionInfo> createIsSupervisorException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_IsSupervisorException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "RetrieveException")
    public JAXBElement<ExceptionInfo> createRetrieveException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_RetrieveException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "MonitoredAddressesCountException")
    public JAXBElement<ExceptionInfo> createMonitoredAddressesCountException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_MonitoredAddressesCountException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetIsReadyException")
    public JAXBElement<ExceptionInfo> createSetIsReadyException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetIsReadyException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetSupervisorException")
    public JAXBElement<ExceptionInfo> createSetSupervisorException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetSupervisorException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "ConfirmDemandRecordingRequestException")
    public JAXBElement<ExceptionInfo> createConfirmDemandRecordingRequestException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_ConfirmDemandRecordingRequestException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "PickupException")
    public JAXBElement<ExceptionInfo> createPickupException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_PickupException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetInstantMessagesException")
    public JAXBElement<ExceptionInfo> createGetInstantMessagesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetInstantMessagesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetAgentsException")
    public JAXBElement<ExceptionInfo> createGetAgentsException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetAgentsException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetReadyStateException")
    public JAXBElement<ExceptionInfo> createGetReadyStateException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetReadyStateException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "CompleteSupervisedTransferException")
    public JAXBElement<ExceptionInfo> createCompleteSupervisedTransferException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_CompleteSupervisedTransferException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "DisposeException")
    public JAXBElement<ExceptionInfo> createDisposeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_DisposeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "RequestRecordingException")
    public JAXBElement<ExceptionInfo> createRequestRecordingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_RequestRecordingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetForwardingException")
    public JAXBElement<ExceptionInfo> createGetForwardingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetForwardingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "LoginAgentException")
    public JAXBElement<ExceptionInfo> createLoginAgentException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_LoginAgentException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "StartRecordingException")
    public JAXBElement<ExceptionInfo> createStartRecordingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_StartRecordingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetConnectionCapabilitiesException")
    public JAXBElement<ExceptionInfo> createGetConnectionCapabilitiesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetConnectionCapabilitiesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetRecordOnDemandStateException")
    public JAXBElement<ExceptionInfo> createGetRecordOnDemandStateException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetRecordOnDemandStateException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetActivityCodeException")
    public JAXBElement<ExceptionInfo> createSetActivityCodeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetActivityCodeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "ConfirmSaveRecordingException")
    public JAXBElement<ExceptionInfo> createConfirmSaveRecordingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_ConfirmSaveRecordingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "RedirectException")
    public JAXBElement<ExceptionInfo> createRedirectException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_RedirectException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SaveRecordingException")
    public JAXBElement<ExceptionInfo> createSaveRecordingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SaveRecordingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "StopRecordingException")
    public JAXBElement<ExceptionInfo> createStopRecordingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_StopRecordingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetRecordingStateException")
    public JAXBElement<ExceptionInfo> createGetRecordingStateException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetRecordingStateException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetAttachedDataException")
    public JAXBElement<ExceptionInfo> createGetAttachedDataException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetAttachedDataException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GiveTreatmentException")
    public JAXBElement<ExceptionInfo> createGiveTreatmentException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GiveTreatmentException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetTransferConsultContactException")
    public JAXBElement<ExceptionInfo> createGetTransferConsultContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetTransferConsultContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetSaveRecordingStateReasonException")
    public JAXBElement<ExceptionInfo> createGetSaveRecordingStateReasonException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetSaveRecordingStateReasonException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetPresenceException")
    public JAXBElement<ExceptionInfo> createGetPresenceException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetPresenceException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "CancelRecordingException")
    public JAXBElement<ExceptionInfo> createCancelRecordingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_CancelRecordingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "MakeSetBusyException")
    public JAXBElement<ExceptionInfo> createMakeSetBusyException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_MakeSetBusyException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetCapabilitiesException")
    public JAXBElement<ExceptionInfo> createGetCapabilitiesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetCapabilitiesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetStaticVoiceTerminalException")
    public JAXBElement<ExceptionInfo> createSetStaticVoiceTerminalException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetStaticVoiceTerminalException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "AnswerException")
    public JAXBElement<ExceptionInfo> createAnswerException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_AnswerException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetTerminalStatusException")
    public JAXBElement<ExceptionInfo> createGetTerminalStatusException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetTerminalStatusException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "LoginAgentToStateException")
    public JAXBElement<ExceptionInfo> createLoginAgentToStateException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_LoginAgentToStateException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetInstantMessagesException")
    public JAXBElement<ExceptionInfo> createSetInstantMessagesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetInstantMessagesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetConnectionException")
    public JAXBElement<ExceptionInfo> createGetConnectionException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetConnectionException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "IsLoggedInException")
    public JAXBElement<ExceptionInfo> createIsLoggedInException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_IsLoggedInException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "IsForwardedException")
    public JAXBElement<ExceptionInfo> createIsForwardedException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_IsForwardedException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "TransferContactException")
    public JAXBElement<ExceptionInfo> createTransferContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_TransferContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "ReleaseControlException")
    public JAXBElement<ExceptionInfo> createReleaseControlException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_ReleaseControlException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetCurrentTerminalCountException")
    public JAXBElement<ExceptionInfo> createGetCurrentTerminalCountException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetCurrentTerminalCountException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "AcceptException")
    public JAXBElement<ExceptionInfo> createAcceptException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_AcceptException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetMessageWaitingException")
    public JAXBElement<ExceptionInfo> createGetMessageWaitingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetMessageWaitingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetSupervisorException")
    public JAXBElement<ExceptionInfo> createGetSupervisorException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetSupervisorException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetTerminalsException")
    public JAXBElement<ExceptionInfo> createGetTerminalsException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetTerminalsException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GiveMediaTreatmentException")
    public JAXBElement<ExceptionInfo> createGiveMediaTreatmentException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GiveMediaTreatmentException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "DropException")
    public JAXBElement<ExceptionInfo> createDropException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_DropException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetTerminalAddressesException")
    public JAXBElement<ExceptionInfo> createGetTerminalAddressesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetTerminalAddressesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "ConsultException")
    public JAXBElement<ExceptionInfo> createConsultException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_ConsultException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetAddressesException")
    public JAXBElement<ExceptionInfo> createGetAddressesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetAddressesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "UnsaveRecordingException")
    public JAXBElement<ExceptionInfo> createUnsaveRecordingException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_UnsaveRecordingException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetCalledAddressException")
    public JAXBElement<ExceptionInfo> createGetCalledAddressException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetCalledAddressException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetContactException")
    public JAXBElement<ExceptionInfo> createGetContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "AnswerContactException")
    public JAXBElement<ExceptionInfo> createAnswerContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_AnswerContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "LogInToCCTServerException")
    public JAXBElement<ExceptionInfo> createLogInToCCTServerException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_LogInToCCTServerException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetCurrentAddressCountException")
    public JAXBElement<ExceptionInfo> createGetCurrentAddressCountException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetCurrentAddressCountException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "RoutePointRetrieveException")
    public JAXBElement<ExceptionInfo> createRoutePointRetrieveException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_RoutePointRetrieveException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GenerateDTMFException")
    public JAXBElement<ExceptionInfo> createGenerateDTMFException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GenerateDTMFException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "PickupFromGroupException")
    public JAXBElement<ExceptionInfo> createPickupFromGroupException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_PickupFromGroupException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "TransferException")
    public JAXBElement<ExceptionInfo> createTransferException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_TransferException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetTerminalInfoException")
    public JAXBElement<ExceptionInfo> createGetTerminalInfoException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetTerminalInfoException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetStateException")
    public JAXBElement<ExceptionInfo> createGetStateException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetStateException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetConferenceConsultContactException")
    public JAXBElement<ExceptionInfo> createGetConferenceConsultContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetConferenceConsultContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetTerminalConnectionCapabilitiesException")
    public JAXBElement<ExceptionInfo> createGetTerminalConnectionCapabilitiesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetTerminalConnectionCapabilitiesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "HoldContactException")
    public JAXBElement<ExceptionInfo> createHoldContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_HoldContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "CallSupervisorException")
    public JAXBElement<ExceptionInfo> createCallSupervisorException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_CallSupervisorException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "LogoutAgentException")
    public JAXBElement<ExceptionInfo> createLogoutAgentException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_LogoutAgentException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetToNotReadyStateException")
    public JAXBElement<ExceptionInfo> createSetToNotReadyStateException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetToNotReadyStateException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetAgentAddressesException")
    public JAXBElement<ExceptionInfo> createGetAgentAddressesException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetAgentAddressesException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "WhisperException")
    public JAXBElement<ExceptionInfo> createWhisperException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_WhisperException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetCallingTerminalException")
    public JAXBElement<ExceptionInfo> createGetCallingTerminalException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetCallingTerminalException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "DisconnectException")
    public JAXBElement<ExceptionInfo> createDisconnectException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_DisconnectException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "LogoutException")
    public JAXBElement<ExceptionInfo> createLogoutException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_LogoutException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "AlertException")
    public JAXBElement<ExceptionInfo> createAlertException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_AlertException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "MonitoredTerminalsCountException")
    public JAXBElement<ExceptionInfo> createMonitoredTerminalsCountException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_MonitoredTerminalsCountException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetLoginIdException")
    public JAXBElement<ExceptionInfo> createGetLoginIdException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetLoginIdException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "PresenceUnsubscribeException")
    public JAXBElement<ExceptionInfo> createPresenceUnsubscribeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_PresenceUnsubscribeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "AddPartyException")
    public JAXBElement<ExceptionInfo> createAddPartyException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_AddPartyException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "RejectException")
    public JAXBElement<ExceptionInfo> createRejectException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_RejectException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetDefaultContactTypeException")
    public JAXBElement<ExceptionInfo> createGetDefaultContactTypeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetDefaultContactTypeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetToNotReadyStateWithReasonCodeException")
    public JAXBElement<ExceptionInfo> createSetToNotReadyStateWithReasonCodeException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetToNotReadyStateWithReasonCodeException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetVersionException")
    public JAXBElement<ExceptionInfo> createGetVersionException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetVersionException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetIntrinsicsException")
    public JAXBElement<ExceptionInfo> createSetIntrinsicsException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetIntrinsicsException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetConnectionsException")
    public JAXBElement<ExceptionInfo> createGetConnectionsException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetConnectionsException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "LogoutAgentFromTerminalException")
    public JAXBElement<ExceptionInfo> createLogoutAgentFromTerminalException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_LogoutAgentFromTerminalException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetLastRedirectedAddressException")
    public JAXBElement<ExceptionInfo> createGetLastRedirectedAddressException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetLastRedirectedAddressException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetOriginalDestinationAddressException")
    public JAXBElement<ExceptionInfo> createGetOriginalDestinationAddressException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetOriginalDestinationAddressException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "DropContactException")
    public JAXBElement<ExceptionInfo> createDropContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_DropContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "SetContactDataException")
    public JAXBElement<ExceptionInfo> createSetContactDataException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_SetContactDataException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetSaveRecordingStateException")
    public JAXBElement<ExceptionInfo> createGetSaveRecordingStateException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetSaveRecordingStateException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "HoldException")
    public JAXBElement<ExceptionInfo> createHoldException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_HoldException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "ControlException")
    public JAXBElement<ExceptionInfo> createControlException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_ControlException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "UnHoldContactException")
    public JAXBElement<ExceptionInfo> createUnHoldContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_UnHoldContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetConsultContactException")
    public JAXBElement<ExceptionInfo> createGetConsultContactException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetConsultContactException_QNAME, ExceptionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nortel.com/soa/oi/cct/faults", name = "GetRecordingStateReasonException")
    public JAXBElement<ExceptionInfo> createGetRecordingStateReasonException(ExceptionInfo value) {
        return new JAXBElement<ExceptionInfo>(_GetRecordingStateReasonException_QNAME, ExceptionInfo.class, null, value);
    }

}
