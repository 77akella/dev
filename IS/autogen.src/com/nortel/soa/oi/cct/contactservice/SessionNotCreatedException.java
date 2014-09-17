
package com.nortel.soa.oi.cct.contactservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:43.937+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "SessionNotCreatedException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class SessionNotCreatedException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo sessionNotCreatedException;

    public SessionNotCreatedException() {
        super();
    }
    
    public SessionNotCreatedException(String message) {
        super(message);
    }
    
    public SessionNotCreatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public SessionNotCreatedException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo sessionNotCreatedException) {
        super(message);
        this.sessionNotCreatedException = sessionNotCreatedException;
    }

    public SessionNotCreatedException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo sessionNotCreatedException, Throwable cause) {
        super(message, cause);
        this.sessionNotCreatedException = sessionNotCreatedException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.sessionNotCreatedException;
    }
}
