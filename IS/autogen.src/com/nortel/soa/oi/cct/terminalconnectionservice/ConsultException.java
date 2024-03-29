
package com.nortel.soa.oi.cct.terminalconnectionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:34.625+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "ConsultException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class ConsultException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo consultException;

    public ConsultException() {
        super();
    }
    
    public ConsultException(String message) {
        super(message);
    }
    
    public ConsultException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConsultException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo consultException) {
        super(message);
        this.consultException = consultException;
    }

    public ConsultException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo consultException, Throwable cause) {
        super(message, cause);
        this.consultException = consultException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.consultException;
    }
}
