
package com.nortel.soa.oi.cct.addressservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:01:11.937+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetConnectionsException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetConnectionsException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getConnectionsException;

    public GetConnectionsException() {
        super();
    }
    
    public GetConnectionsException(String message) {
        super(message);
    }
    
    public GetConnectionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetConnectionsException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getConnectionsException) {
        super(message);
        this.getConnectionsException = getConnectionsException;
    }

    public GetConnectionsException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getConnectionsException, Throwable cause) {
        super(message, cause);
        this.getConnectionsException = getConnectionsException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getConnectionsException;
    }
}
