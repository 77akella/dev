
package com.nortel.soa.oi.cct.terminalservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:43.578+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetDoNotDisturbException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetDoNotDisturbException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getDoNotDisturbException;

    public GetDoNotDisturbException() {
        super();
    }
    
    public GetDoNotDisturbException(String message) {
        super(message);
    }
    
    public GetDoNotDisturbException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetDoNotDisturbException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getDoNotDisturbException) {
        super(message);
        this.getDoNotDisturbException = getDoNotDisturbException;
    }

    public GetDoNotDisturbException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getDoNotDisturbException, Throwable cause) {
        super(message, cause);
        this.getDoNotDisturbException = getDoNotDisturbException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getDoNotDisturbException;
    }
}