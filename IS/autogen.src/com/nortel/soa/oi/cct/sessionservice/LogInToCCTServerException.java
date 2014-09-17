
package com.nortel.soa.oi.cct.sessionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:24.140+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "LogInToCCTServerException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class LogInToCCTServerException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo logInToCCTServerException;

    public LogInToCCTServerException() {
        super();
    }
    
    public LogInToCCTServerException(String message) {
        super(message);
    }
    
    public LogInToCCTServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogInToCCTServerException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo logInToCCTServerException) {
        super(message);
        this.logInToCCTServerException = logInToCCTServerException;
    }

    public LogInToCCTServerException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo logInToCCTServerException, Throwable cause) {
        super(message, cause);
        this.logInToCCTServerException = logInToCCTServerException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.logInToCCTServerException;
    }
}
