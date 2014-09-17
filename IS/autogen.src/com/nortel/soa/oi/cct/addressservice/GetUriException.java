
package com.nortel.soa.oi.cct.addressservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:01:11.968+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetUriException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetUriException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getUriException;

    public GetUriException() {
        super();
    }
    
    public GetUriException(String message) {
        super(message);
    }
    
    public GetUriException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetUriException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getUriException) {
        super(message);
        this.getUriException = getUriException;
    }

    public GetUriException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getUriException, Throwable cause) {
        super(message, cause);
        this.getUriException = getUriException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getUriException;
    }
}