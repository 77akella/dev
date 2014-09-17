
package com.nortel.soa.oi.cct.contactservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:44.046+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "BargeInException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class BargeInException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo bargeInException;

    public BargeInException() {
        super();
    }
    
    public BargeInException(String message) {
        super(message);
    }
    
    public BargeInException(String message, Throwable cause) {
        super(message, cause);
    }

    public BargeInException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo bargeInException) {
        super(message);
        this.bargeInException = bargeInException;
    }

    public BargeInException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo bargeInException, Throwable cause) {
        super(message, cause);
        this.bargeInException = bargeInException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.bargeInException;
    }
}