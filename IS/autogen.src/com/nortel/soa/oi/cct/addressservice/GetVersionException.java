
package com.nortel.soa.oi.cct.addressservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:01:11.953+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetVersionException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetVersionException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getVersionException;

    public GetVersionException() {
        super();
    }
    
    public GetVersionException(String message) {
        super(message);
    }
    
    public GetVersionException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetVersionException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getVersionException) {
        super(message);
        this.getVersionException = getVersionException;
    }

    public GetVersionException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getVersionException, Throwable cause) {
        super(message, cause);
        this.getVersionException = getVersionException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getVersionException;
    }
}
