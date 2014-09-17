
package com.nortel.soa.oi.cct.terminalconnectionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:34.609+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetConferenceConsultContactException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetConferenceConsultContactException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getConferenceConsultContactException;

    public GetConferenceConsultContactException() {
        super();
    }
    
    public GetConferenceConsultContactException(String message) {
        super(message);
    }
    
    public GetConferenceConsultContactException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetConferenceConsultContactException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getConferenceConsultContactException) {
        super(message);
        this.getConferenceConsultContactException = getConferenceConsultContactException;
    }

    public GetConferenceConsultContactException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getConferenceConsultContactException, Throwable cause) {
        super(message, cause);
        this.getConferenceConsultContactException = getConferenceConsultContactException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getConferenceConsultContactException;
    }
}
