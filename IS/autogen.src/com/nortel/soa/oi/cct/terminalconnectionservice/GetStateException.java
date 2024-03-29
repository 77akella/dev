
package com.nortel.soa.oi.cct.terminalconnectionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:34.546+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetStateException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetStateException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getStateException;

    public GetStateException() {
        super();
    }
    
    public GetStateException(String message) {
        super(message);
    }
    
    public GetStateException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetStateException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getStateException) {
        super(message);
        this.getStateException = getStateException;
    }

    public GetStateException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getStateException, Throwable cause) {
        super(message, cause);
        this.getStateException = getStateException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getStateException;
    }
}
