
package com.nortel.soa.oi.cct.contactservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:43.953+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GiveTreatmentException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GiveTreatmentException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo giveTreatmentException;

    public GiveTreatmentException() {
        super();
    }
    
    public GiveTreatmentException(String message) {
        super(message);
    }
    
    public GiveTreatmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public GiveTreatmentException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo giveTreatmentException) {
        super(message);
        this.giveTreatmentException = giveTreatmentException;
    }

    public GiveTreatmentException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo giveTreatmentException, Throwable cause) {
        super(message, cause);
        this.giveTreatmentException = giveTreatmentException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.giveTreatmentException;
    }
}