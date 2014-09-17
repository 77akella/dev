/**
 * CIEmailAddressWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIEmailAddressWsLocator extends org.apache.axis.client.Service implements CIEmailAddressWs {

    public CIEmailAddressWsLocator() {
    }


    public CIEmailAddressWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CIEmailAddressWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CIEmailAddressWsSoap12
    private String CIEmailAddressWsSoap12_address = "http://aacc63/ccmmwebservices/CIEmailAddressWs.asmx";

    public String getCIEmailAddressWsSoap12Address() {
        return CIEmailAddressWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIEmailAddressWsSoap12WSDDServiceName = "CIEmailAddressWsSoap12";

    public String getCIEmailAddressWsSoap12WSDDServiceName() {
        return CIEmailAddressWsSoap12WSDDServiceName;
    }

    public void setCIEmailAddressWsSoap12WSDDServiceName(String name) {
        CIEmailAddressWsSoap12WSDDServiceName = name;
    }

    public CIEmailAddressWsSoap getCIEmailAddressWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIEmailAddressWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIEmailAddressWsSoap12(endpoint);
    }

    public CIEmailAddressWsSoap getCIEmailAddressWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIEmailAddressWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIEmailAddressWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCIEmailAddressWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIEmailAddressWsSoap12EndpointAddress(String address) {
        CIEmailAddressWsSoap12_address = address;
    }


    // Use to get a proxy class for CIEmailAddressWsSoap
    private String CIEmailAddressWsSoap_address = "http://aacc63/ccmmwebservices/CIEmailAddressWs.asmx";

    public String getCIEmailAddressWsSoapAddress() {
        return CIEmailAddressWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIEmailAddressWsSoapWSDDServiceName = "CIEmailAddressWsSoap";

    public String getCIEmailAddressWsSoapWSDDServiceName() {
        return CIEmailAddressWsSoapWSDDServiceName;
    }

    public void setCIEmailAddressWsSoapWSDDServiceName(String name) {
        CIEmailAddressWsSoapWSDDServiceName = name;
    }

    public CIEmailAddressWsSoap getCIEmailAddressWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIEmailAddressWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIEmailAddressWsSoap(endpoint);
    }

    public CIEmailAddressWsSoap getCIEmailAddressWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIEmailAddressWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIEmailAddressWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCIEmailAddressWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIEmailAddressWsSoapEndpointAddress(String address) {
        CIEmailAddressWsSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CIEmailAddressWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIEmailAddressWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIEmailAddressWsSoap12Stub(new java.net.URL(CIEmailAddressWsSoap12_address), this);
                _stub.setPortName(getCIEmailAddressWsSoap12WSDDServiceName());
                return _stub;
            }
            if (CIEmailAddressWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIEmailAddressWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIEmailAddressWsSoap_BindingStub(new java.net.URL(CIEmailAddressWsSoap_address), this);
                _stub.setPortName(getCIEmailAddressWsSoapWSDDServiceName());
                return _stub;
            }
        } catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("CIEmailAddressWsSoap12".equals(inputPortName)) {
            return getCIEmailAddressWsSoap12();
        } else if ("CIEmailAddressWsSoap".equals(inputPortName)) {
            return getCIEmailAddressWsSoap();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIEmailAddressWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIEmailAddressWsSoap12"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIEmailAddressWsSoap"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CIEmailAddressWsSoap12".equals(portName)) {
            setCIEmailAddressWsSoap12EndpointAddress(address);
        } else if ("CIEmailAddressWsSoap".equals(portName)) {
            setCIEmailAddressWsSoapEndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
