
package com.nortel.soa.oi.cct.sessionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:23.953+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "LoginAgentException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class LoginAgentException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo loginAgentException;

    public LoginAgentException() {
        super();
    }
    
    public LoginAgentException(String message) {
        super(message);
    }
    
    public LoginAgentException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginAgentException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo loginAgentException) {
        super(message);
        this.loginAgentException = loginAgentException;
    }

    public LoginAgentException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo loginAgentException, Throwable cause) {
        super(message, cause);
        this.loginAgentException = loginAgentException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.loginAgentException;
    }
}
