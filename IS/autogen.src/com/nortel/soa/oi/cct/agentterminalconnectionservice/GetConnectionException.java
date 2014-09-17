
package com.nortel.soa.oi.cct.agentterminalconnectionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:01:39.265+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetConnectionException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetConnectionException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getConnectionException;

    public GetConnectionException() {
        super();
    }
    
    public GetConnectionException(String message) {
        super(message);
    }
    
    public GetConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetConnectionException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getConnectionException) {
        super(message);
        this.getConnectionException = getConnectionException;
    }

    public GetConnectionException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getConnectionException, Throwable cause) {
        super(message, cause);
        this.getConnectionException = getConnectionException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getConnectionException;
    }
}