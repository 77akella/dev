package com.nortel.soa.oi.cct.terminalservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:43.765+03:00
 * Generated source version: 2.6.1
 * 
 */
@WebService(targetNamespace = "http://www.nortel.com/soa/oi/cct/TerminalService", name = "TerminalService")
@XmlSeeAlso({com.nortel.soa.oi.cct.types.terminalservice.ObjectFactory.class, com.nortel.soa.oi.cct.faults.ObjectFactory.class, com.nortel.soa.oi.cct.types.ObjectFactory.class, org.xmlsoap.schemas.ws._2003._03.addressing.ObjectFactory.class, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface TerminalService {

    @WebResult(name = "PickupFromGroupResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "PickupFromGroup", action = "http://www.nortel.com/soa/oi/cct/TerminalService/PickupFromGroup")
    public com.nortel.soa.oi.cct.types.terminalservice.TerminalConnectionResponse pickupFromGroup(
        @WebParam(partName = "parameters", name = "PickupFromGroupRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.PickupFromGroupRequest parameters
    ) throws PickupFromGroupException, SessionNotCreatedException;

    @WebResult(name = "PickupFromAddressResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "PickupFromAddress", action = "http://www.nortel.com/soa/oi/cct/TerminalService/Pickup")
    public com.nortel.soa.oi.cct.types.terminalservice.TerminalConnectionResponse pickupFromAddress(
        @WebParam(partName = "parameters", name = "PickupFromAddressRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.PickupFromAddressRequest parameters
    ) throws PickupException, SessionNotCreatedException;

    @WebResult(name = "PickupFromTerminalResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "PickupFromTerminal", action = "http://www.nortel.com/soa/oi/cct/TerminalService/Pickup")
    public com.nortel.soa.oi.cct.types.terminalservice.TerminalConnectionResponse pickupFromTerminal(
        @WebParam(partName = "parameters", name = "PickupFromTerminalRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.PickupFromTerminalRequest parameters
    ) throws PickupException, SessionNotCreatedException;

    @WebResult(name = "GetDoNotDisturbResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "GetDoNotDisturb", action = "http://www.nortel.com/soa/oi/cct/TerminalService/GetDoNotDisturb")
    public com.nortel.soa.oi.cct.types.terminalservice.GetDoNotDisturbResponse getDoNotDisturb(
        @WebParam(partName = "parameters", name = "GetDoNotDisturbRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws GetDoNotDisturbException, SessionNotCreatedException;

    @WebResult(name = "GetTerminalConnectionsResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "GetTerminalConnections", action = "http://www.nortel.com/soa/oi/cct/TerminalService/GetTerminalConnections")
    public com.nortel.soa.oi.cct.types.terminalservice.GetTerminalConnectionsResponse getTerminalConnections(
        @WebParam(partName = "parameters", name = "GetTerminalConnectionsRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws GetTerminalConnectionsException, SessionNotCreatedException;

    @WebMethod(operationName = "CancelForwarding", action = "http://www.nortel.com/soa/oi/cct/TerminalService/CancelForwarding")
    public void cancelForwarding(
        @WebParam(partName = "parameters", name = "CancelForwardingRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws CancelForwardingException, SessionNotCreatedException;

    @WebResult(name = "GetContactTypesResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "GetContactTypes", action = "http://www.nortel.com/soa/oi/cct/TerminalService/GetContactTypes")
    public com.nortel.soa.oi.cct.types.terminalservice.GetContactTypesResponse getContactTypes(
        @WebParam(partName = "parameters", name = "GetContactTypesRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws GetContactTypesException, SessionNotCreatedException;

    @WebResult(name = "OriginateResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "Originate", action = "http://www.nortel.com/soa/oi/cct/TerminalService/Originate")
    public com.nortel.soa.oi.cct.types.terminalservice.ContactResponse originate(
        @WebParam(partName = "parameters", name = "OriginateRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalOriginateRequest parameters
    ) throws OriginateException, SessionNotCreatedException;

    @WebMethod(operationName = "SetForwarding", action = "http://www.nortel.com/soa/oi/cct/TerminalService/SetForwarding")
    public void setForwarding(
        @WebParam(partName = "parameters", name = "SetForwardingRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.SetForwardingTerminalRequest parameters
    ) throws SetForwardingException, SessionNotCreatedException;

    @WebResult(name = "GetRelatedAddressesResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "GetRelatedAddresses", action = "http://www.nortel.com/soa/oi/cct/TerminalService/GetRelatedAddresses")
    public com.nortel.soa.oi.cct.types.terminalservice.GetRelatedAddressesResponse getRelatedAddresses(
        @WebParam(partName = "parameters", name = "GetRelatedAddressesRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws GetRelatedAddressesException, SessionNotCreatedException;

    @WebResult(name = "IsForwardedResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "IsForwarded", action = "http://www.nortel.com/soa/oi/cct/TerminalService/IsForwarded")
    public com.nortel.soa.oi.cct.types.terminalservice.IsForwardedResponse isForwarded(
        @WebParam(partName = "parameters", name = "IsForwardedRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws IsForwardedException, SessionNotCreatedException;

    @WebResult(name = "GetCapabilitiesResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "GetCapabilities", action = "http://www.nortel.com/soa/oi/cct/TerminalService/GetCapabilities")
    public com.nortel.soa.oi.cct.types.terminalservice.GetTerminalCapabilitiesResponse getCapabilities(
        @WebParam(partName = "parameters", name = "GetCapabilitiesRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws GetCapabilitiesException, SessionNotCreatedException;

    @WebResult(name = "GetVersionResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "GetVersion", action = "http://www.nortel.com/soa/oi/cct/TerminalService/GetVersion")
    public com.nortel.soa.oi.cct.types.GetVersionResponse getVersion(
        @WebParam(partName = "parameters", name = "GetVersionRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.GetVersionRequest parameters
    ) throws GetVersionException, SessionNotCreatedException;

    @WebResult(name = "GetDefaultContactTypeResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "GetDefaultContactType", action = "http://www.nortel.com/soa/oi/cct/TerminalService/GetDefaultContactType")
    public com.nortel.soa.oi.cct.types.terminalservice.StringResponse getDefaultContactType(
        @WebParam(partName = "parameters", name = "GetDefaultContactTypeRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws GetDefaultContactTypeException, SessionNotCreatedException;

    @WebMethod(operationName = "SetDoNotDisturb", action = "http://www.nortel.com/soa/oi/cct/TerminalService/SetDoNotDisturb")
    public void setDoNotDisturb(
        @WebParam(partName = "parameters", name = "SetDoNotDisturbRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.SetDoNotDisturbTerminalRequest parameters
    ) throws SetDoNotDisturbException, SessionNotCreatedException;

    @WebResult(name = "GetStateResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "GetState", action = "http://www.nortel.com/soa/oi/cct/TerminalService/GetState")
    public com.nortel.soa.oi.cct.types.terminalservice.GetStateResponse getState(
        @WebParam(partName = "parameters", name = "GetStateRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws GetStateException, SessionNotCreatedException;

    @WebResult(name = "GetForwardingResponse", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService", partName = "response")
    @WebMethod(operationName = "GetForwarding", action = "http://www.nortel.com/soa/oi/cct/TerminalService/GetForwarding")
    public com.nortel.soa.oi.cct.types.terminalservice.GetForwardingResponse getForwarding(
        @WebParam(partName = "parameters", name = "GetForwardingRequest", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/TerminalService")
        com.nortel.soa.oi.cct.types.terminalservice.TerminalRequest parameters
    ) throws GetForwardingException, SessionNotCreatedException;
}