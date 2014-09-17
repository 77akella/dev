/**
 * AppIntfWS_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vp.launchCall;

public interface AppIntfWS_Service extends javax.xml.rpc.Service {
    public java.lang.String getAppIntfWSAddress();

    public vp.launchCall.AppIntfWS_PortType getAppIntfWS() throws javax.xml.rpc.ServiceException;

    public vp.launchCall.AppIntfWS_PortType getAppIntfWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
