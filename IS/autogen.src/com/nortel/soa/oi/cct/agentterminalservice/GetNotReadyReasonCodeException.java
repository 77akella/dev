
package com.nortel.soa.oi.cct.agentterminalservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:10.015+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetNotReadyReasonCodeException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetNotReadyReasonCodeException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getNotReadyReasonCodeException;

    public GetNotReadyReasonCodeException() {
        super();
    }
    
    public GetNotReadyReasonCodeException(String message) {
        super(message);
    }
    
    public GetNotReadyReasonCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetNotReadyReasonCodeException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getNotReadyReasonCodeException) {
        super(message);
        this.getNotReadyReasonCodeException = getNotReadyReasonCodeException;
    }

    public GetNotReadyReasonCodeException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getNotReadyReasonCodeException, Throwable cause) {
        super(message, cause);
        this.getNotReadyReasonCodeException = getNotReadyReasonCodeException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getNotReadyReasonCodeException;
    }
}