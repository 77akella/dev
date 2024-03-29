
package com.nortel.soa.oi.cct.contactservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:44.250+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetCallingAddressException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetCallingAddressException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getCallingAddressException;

    public GetCallingAddressException() {
        super();
    }
    
    public GetCallingAddressException(String message) {
        super(message);
    }
    
    public GetCallingAddressException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetCallingAddressException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getCallingAddressException) {
        super(message);
        this.getCallingAddressException = getCallingAddressException;
    }

    public GetCallingAddressException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getCallingAddressException, Throwable cause) {
        super(message, cause);
        this.getCallingAddressException = getCallingAddressException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getCallingAddressException;
    }
}
