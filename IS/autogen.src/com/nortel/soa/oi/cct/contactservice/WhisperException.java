
package com.nortel.soa.oi.cct.contactservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:44.312+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "WhisperException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class WhisperException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo whisperException;

    public WhisperException() {
        super();
    }
    
    public WhisperException(String message) {
        super(message);
    }
    
    public WhisperException(String message, Throwable cause) {
        super(message, cause);
    }

    public WhisperException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo whisperException) {
        super(message);
        this.whisperException = whisperException;
    }

    public WhisperException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo whisperException, Throwable cause) {
        super(message, cause);
        this.whisperException = whisperException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.whisperException;
    }
}
