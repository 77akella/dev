
package com.nortel.soa.oi.cct.metricsservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:53.765+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "MonitoredTerminalsCountException", targetNamespace = "http://www.nortel.com/soa/oi/cct/faults")
public class MonitoredTerminalsCountException extends Exception {
    
    private org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo monitoredTerminalsCountException;

    public MonitoredTerminalsCountException() {
        super();
    }
    
    public MonitoredTerminalsCountException(String message) {
        super(message);
    }
    
    public MonitoredTerminalsCountException(String message, Throwable cause) {
        super(message, cause);
    }

    public MonitoredTerminalsCountException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo monitoredTerminalsCountException) {
        super(message);
        this.monitoredTerminalsCountException = monitoredTerminalsCountException;
    }

    public MonitoredTerminalsCountException(String message, org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo monitoredTerminalsCountException, Throwable cause) {
        super(message, cause);
        this.monitoredTerminalsCountException = monitoredTerminalsCountException;
    }

    public org.oasis_open.docs.wsrf._2004._06.wsrf_ws_basefaults_1_2_draft_01.ExceptionInfo getFaultInfo() {
        return this.monitoredTerminalsCountException;
    }
}