
package com.nortel.soa.oi.cct.sessionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:24.109+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetCurrentAddressCountException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetCurrentAddressCountException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getCurrentAddressCountException;

    public GetCurrentAddressCountException() {
        super();
    }
    
    public GetCurrentAddressCountException(String message) {
        super(message);
    }
    
    public GetCurrentAddressCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetCurrentAddressCountException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getCurrentAddressCountException) {
        super(message);
        this.getCurrentAddressCountException = getCurrentAddressCountException;
    }

    public GetCurrentAddressCountException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getCurrentAddressCountException, Throwable cause) {
        super(message, cause);
        this.getCurrentAddressCountException = getCurrentAddressCountException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getCurrentAddressCountException;
    }
}