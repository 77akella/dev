/**
 * AppIntfWS_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vp.launchCall;

public interface AppIntfWS_PortType extends java.rmi.Remote {
    public vp.launchCall.GetStatusResponse getStatus(vp.launchCall.GetStatusRequest parameters) throws java.rmi.RemoteException, vp.launchCall.GetStatusFault;
    public vp.launchCall.LaunchVXMLResponse launchVXML(vp.launchCall.LaunchVXMLRequest parameters) throws java.rmi.RemoteException, vp.launchCall.LaunchVXMLFault;
    public vp.launchCall.LaunchCCXMLResponse launchCCXML(vp.launchCall.LaunchCCXMLRequest parameters) throws java.rmi.RemoteException, vp.launchCall.LaunchCCXMLFault;
    public vp.launchCall.SendCCXMLEventResponse sendCCXMLEvent(vp.launchCall.SendCCXMLEventRequest parameters) throws java.rmi.RemoteException, vp.launchCall.SendCCXMLEventFault;
    public vp.launchCall.QueryResourcesResponse queryResources(vp.launchCall.QueryResourcesRequest parameters) throws java.rmi.RemoteException, vp.launchCall.QueryResourcesFault;
}
