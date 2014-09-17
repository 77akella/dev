
package com.nortel.soa.oi.cct.notificationproducer;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:03:09.234+03:00
 * Generated source version: 2.6.1
 */

@WebFault(name = "GetVersionFault", targetNamespace = "http://www.nortel.com/soa/oi/cct/types/NotificationProducer")
public class GetVersionFault extends Exception {
    
    private com.nortel.soa.oi.cct.types.notificationproducer.GetVersionFaultType getVersionFault;

    public GetVersionFault() {
        super();
    }
    
    public GetVersionFault(String message) {
        super(message);
    }
    
    public GetVersionFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetVersionFault(String message, com.nortel.soa.oi.cct.types.notificationproducer.GetVersionFaultType getVersionFault) {
        super(message);
        this.getVersionFault = getVersionFault;
    }

    public GetVersionFault(String message, com.nortel.soa.oi.cct.types.notificationproducer.GetVersionFaultType getVersionFault, Throwable cause) {
        super(message, cause);
        this.getVersionFault = getVersionFault;
    }

    public com.nortel.soa.oi.cct.types.notificationproducer.GetVersionFaultType getFaultInfo() {
        return this.getVersionFault;
    }
}
