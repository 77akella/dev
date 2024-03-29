
package com.nortel.soa.oi.cct.terminalconnectionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:34.546+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "CompleteSupervisedTransferException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class CompleteSupervisedTransferException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo completeSupervisedTransferException;

    public CompleteSupervisedTransferException() {
        super();
    }
    
    public CompleteSupervisedTransferException(String message) {
        super(message);
    }
    
    public CompleteSupervisedTransferException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompleteSupervisedTransferException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo completeSupervisedTransferException) {
        super(message);
        this.completeSupervisedTransferException = completeSupervisedTransferException;
    }

    public CompleteSupervisedTransferException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo completeSupervisedTransferException, Throwable cause) {
        super(message, cause);
        this.completeSupervisedTransferException = completeSupervisedTransferException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.completeSupervisedTransferException;
    }
}
