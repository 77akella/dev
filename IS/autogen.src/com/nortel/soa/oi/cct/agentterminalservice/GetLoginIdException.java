
package com.nortel.soa.oi.cct.agentterminalservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:09.968+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetLoginIdException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class GetLoginIdException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getLoginIdException;

    public GetLoginIdException() {
        super();
    }
    
    public GetLoginIdException(String message) {
        super(message);
    }
    
    public GetLoginIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetLoginIdException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getLoginIdException) {
        super(message);
        this.getLoginIdException = getLoginIdException;
    }

    public GetLoginIdException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getLoginIdException, Throwable cause) {
        super(message, cause);
        this.getLoginIdException = getLoginIdException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.getLoginIdException;
    }
}
