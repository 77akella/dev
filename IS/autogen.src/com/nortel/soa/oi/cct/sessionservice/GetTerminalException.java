
package com.nortel.soa.oi.cct.sessionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:24.250+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetTerminalException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetTerminalException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getTerminalException;

    public GetTerminalException() {
        super();
    }
    
    public GetTerminalException(String message) {
        super(message);
    }
    
    public GetTerminalException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetTerminalException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getTerminalException) {
        super(message);
        this.getTerminalException = getTerminalException;
    }

    public GetTerminalException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getTerminalException, Throwable cause) {
        super(message, cause);
        this.getTerminalException = getTerminalException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getTerminalException;
    }
}
