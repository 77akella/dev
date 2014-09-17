
package com.nortel.soa.oi.cct.sessionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:24.140+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "SetContactDataException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class SetContactDataException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setContactDataException;

    public SetContactDataException() {
        super();
    }
    
    public SetContactDataException(String message) {
        super(message);
    }
    
    public SetContactDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public SetContactDataException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setContactDataException) {
        super(message);
        this.setContactDataException = setContactDataException;
    }

    public SetContactDataException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo setContactDataException, Throwable cause) {
        super(message, cause);
        this.setContactDataException = setContactDataException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.setContactDataException;
    }
}