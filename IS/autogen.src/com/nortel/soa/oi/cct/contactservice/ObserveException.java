
package com.nortel.soa.oi.cct.contactservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:44.062+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "ObserveException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class ObserveException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo observeException;

    public ObserveException() {
        super();
    }
    
    public ObserveException(String message) {
        super(message);
    }
    
    public ObserveException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObserveException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo observeException) {
        super(message);
        this.observeException = observeException;
    }

    public ObserveException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo observeException, Throwable cause) {
        super(message, cause);
        this.observeException = observeException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.observeException;
    }
}