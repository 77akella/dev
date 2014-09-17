
package com.nortel.soa.oi.cct.agentservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:01:25.625+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "SetStaticVoiceTerminalException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class SetStaticVoiceTerminalException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setStaticVoiceTerminalException;

    public SetStaticVoiceTerminalException() {
        super();
    }
    
    public SetStaticVoiceTerminalException(String message) {
        super(message);
    }
    
    public SetStaticVoiceTerminalException(String message, Throwable cause) {
        super(message, cause);
    }

    public SetStaticVoiceTerminalException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setStaticVoiceTerminalException) {
        super(message);
        this.setStaticVoiceTerminalException = setStaticVoiceTerminalException;
    }

    public SetStaticVoiceTerminalException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setStaticVoiceTerminalException, Throwable cause) {
        super(message, cause);
        this.setStaticVoiceTerminalException = setStaticVoiceTerminalException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.setStaticVoiceTerminalException;
    }
}
