/**
 * CIWebCommsWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIWebCommsWsLocator extends org.apache.axis.client.Service implements CIWebCommsWs {

    public CIWebCommsWsLocator() {
    }


    public CIWebCommsWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CIWebCommsWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CIWebCommsWsSoap
    private String CIWebCommsWsSoap_address = "http://aacc63/ccmmwebservices/CIWebCommsWs.asmx";

    public String getCIWebCommsWsSoapAddress() {
        return CIWebCommsWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIWebCommsWsSoapWSDDServiceName = "CIWebCommsWsSoap";

    public String getCIWebCommsWsSoapWSDDServiceName() {
        return CIWebCommsWsSoapWSDDServiceName;
    }

    public void setCIWebCommsWsSoapWSDDServiceName(String name) {
        CIWebCommsWsSoapWSDDServiceName = name;
    }

    public CIWebCommsWsSoap getCIWebCommsWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIWebCommsWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIWebCommsWsSoap(endpoint);
    }

    public CIWebCommsWsSoap getCIWebCommsWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIWebCommsWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIWebCommsWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCIWebCommsWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIWebCommsWsSoapEndpointAddress(String address) {
        CIWebCommsWsSoap_address = address;
    }


    // Use to get a proxy class for CIWebCommsWsSoap12
    private String CIWebCommsWsSoap12_address = "http://aacc63/ccmmwebservices/CIWebCommsWs.asmx";

    public String getCIWebCommsWsSoap12Address() {
        return CIWebCommsWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIWebCommsWsSoap12WSDDServiceName = "CIWebCommsWsSoap12";

    public String getCIWebCommsWsSoap12WSDDServiceName() {
        return CIWebCommsWsSoap12WSDDServiceName;
    }

    public void setCIWebCommsWsSoap12WSDDServiceName(String name) {
        CIWebCommsWsSoap12WSDDServiceName = name;
    }

    public CIWebCommsWsSoap getCIWebCommsWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIWebCommsWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIWebCommsWsSoap12(endpoint);
    }

    public CIWebCommsWsSoap getCIWebCommsWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIWebCommsWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIWebCommsWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCIWebCommsWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIWebCommsWsSoap12EndpointAddress(String address) {
        CIWebCommsWsSoap12_address = address;
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
            if (CIWebCommsWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIWebCommsWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIWebCommsWsSoap_BindingStub(new java.net.URL(CIWebCommsWsSoap_address), this);
                _stub.setPortName(getCIWebCommsWsSoapWSDDServiceName());
                return _stub;
            }
            if (CIWebCommsWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIWebCommsWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIWebCommsWsSoap12Stub(new java.net.URL(CIWebCommsWsSoap12_address), this);
                _stub.setPortName(getCIWebCommsWsSoap12WSDDServiceName());
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
        if ("CIWebCommsWsSoap".equals(inputPortName)) {
            return getCIWebCommsWsSoap();
        } else if ("CIWebCommsWsSoap12".equals(inputPortName)) {
            return getCIWebCommsWsSoap12();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIWebCommsWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIWebCommsWsSoap"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIWebCommsWsSoap12"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CIWebCommsWsSoap".equals(portName)) {
            setCIWebCommsWsSoapEndpointAddress(address);
        } else if ("CIWebCommsWsSoap12".equals(portName)) {
            setCIWebCommsWsSoap12EndpointAddress(address);
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
