
package com.nortel.soa.oi.cct.agentservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:01:25.593+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "SetReadyException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class SetReadyException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setReadyException;

    public SetReadyException() {
        super();
    }
    
    public SetReadyException(String message) {
        super(message);
    }
    
    public SetReadyException(String message, Throwable cause) {
        super(message, cause);
    }

    public SetReadyException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setReadyException) {
        super(message);
        this.setReadyException = setReadyException;
    }

    public SetReadyException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setReadyException, Throwable cause) {
        super(message, cause);
        this.setReadyException = setReadyException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.setReadyException;
    }
}