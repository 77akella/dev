
package com.nortel.soa.oi.cct.sessionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:23.984+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "SetToNotReadyStateWithReasonCodeException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class SetToNotReadyStateWithReasonCodeException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setToNotReadyStateWithReasonCodeException;

    public SetToNotReadyStateWithReasonCodeException() {
        super();
    }
    
    public SetToNotReadyStateWithReasonCodeException(String message) {
        super(message);
    }
    
    public SetToNotReadyStateWithReasonCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SetToNotReadyStateWithReasonCodeException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setToNotReadyStateWithReasonCodeException) {
        super(message);
        this.setToNotReadyStateWithReasonCodeException = setToNotReadyStateWithReasonCodeException;
    }

    public SetToNotReadyStateWithReasonCodeException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setToNotReadyStateWithReasonCodeException, Throwable cause) {
        super(message, cause);
        this.setToNotReadyStateWithReasonCodeException = setToNotReadyStateWithReasonCodeException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.setToNotReadyStateWithReasonCodeException;
    }
}