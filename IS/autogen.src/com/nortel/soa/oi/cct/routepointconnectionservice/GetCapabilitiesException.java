
package com.nortel.soa.oi.cct.routepointconnectionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:09.343+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetCapabilitiesException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetCapabilitiesException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getCapabilitiesException;

    public GetCapabilitiesException() {
        super();
    }
    
    public GetCapabilitiesException(String message) {
        super(message);
    }
    
    public GetCapabilitiesException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetCapabilitiesException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getCapabilitiesException) {
        super(message);
        this.getCapabilitiesException = getCapabilitiesException;
    }

    public GetCapabilitiesException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getCapabilitiesException, Throwable cause) {
        super(message, cause);
        this.getCapabilitiesException = getCapabilitiesException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getCapabilitiesException;
    }
}
