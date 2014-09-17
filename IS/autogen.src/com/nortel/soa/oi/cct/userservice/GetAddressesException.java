
package com.nortel.soa.oi.cct.userservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:05:01.765+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetAddressesException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetAddressesException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getAddressesException;

    public GetAddressesException() {
        super();
    }
    
    public GetAddressesException(String message) {
        super(message);
    }
    
    public GetAddressesException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAddressesException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getAddressesException) {
        super(message);
        this.getAddressesException = getAddressesException;
    }

    public GetAddressesException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getAddressesException, Throwable cause) {
        super(message, cause);
        this.getAddressesException = getAddressesException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getAddressesException;
    }
}
