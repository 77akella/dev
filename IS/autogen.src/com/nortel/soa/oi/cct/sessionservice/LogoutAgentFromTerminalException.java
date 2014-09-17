
package com.nortel.soa.oi.cct.sessionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:24.015+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "LogoutAgentFromTerminalException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class LogoutAgentFromTerminalException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo logoutAgentFromTerminalException;

    public LogoutAgentFromTerminalException() {
        super();
    }
    
    public LogoutAgentFromTerminalException(String message) {
        super(message);
    }
    
    public LogoutAgentFromTerminalException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogoutAgentFromTerminalException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo logoutAgentFromTerminalException) {
        super(message);
        this.logoutAgentFromTerminalException = logoutAgentFromTerminalException;
    }

    public LogoutAgentFromTerminalException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo logoutAgentFromTerminalException, Throwable cause) {
        super(message, cause);
        this.logoutAgentFromTerminalException = logoutAgentFromTerminalException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.logoutAgentFromTerminalException;
    }
}