
package com.nortel.soa.oi.cct.contactservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:44.093+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetInstantMessagesException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetInstantMessagesException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getInstantMessagesException;

    public GetInstantMessagesException() {
        super();
    }
    
    public GetInstantMessagesException(String message) {
        super(message);
    }
    
    public GetInstantMessagesException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetInstantMessagesException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getInstantMessagesException) {
        super(message);
        this.getInstantMessagesException = getInstantMessagesException;
    }

    public GetInstantMessagesException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getInstantMessagesException, Throwable cause) {
        super(message, cause);
        this.getInstantMessagesException = getInstantMessagesException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getInstantMessagesException;
    }
}
