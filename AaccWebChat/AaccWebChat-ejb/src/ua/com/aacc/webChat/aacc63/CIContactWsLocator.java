/**
 * CIContactWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIContactWsLocator extends org.apache.axis.client.Service implements CIContactWs {

    public CIContactWsLocator() {
    }


    public CIContactWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CIContactWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CIContactWsSoap
    private String CIContactWsSoap_address = "http://aacc63/ccmmwebservices/CIContactWs.asmx";

    public String getCIContactWsSoapAddress() {
        return CIContactWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIContactWsSoapWSDDServiceName = "CIContactWsSoap";

    public String getCIContactWsSoapWSDDServiceName() {
        return CIContactWsSoapWSDDServiceName;
    }

    public void setCIContactWsSoapWSDDServiceName(String name) {
        CIContactWsSoapWSDDServiceName = name;
    }

    public CIContactWsSoap getCIContactWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIContactWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIContactWsSoap(endpoint);
    }

    public CIContactWsSoap getCIContactWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIContactWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIContactWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCIContactWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIContactWsSoapEndpointAddress(String address) {
        CIContactWsSoap_address = address;
    }


    // Use to get a proxy class for CIContactWsSoap12
    private String CIContactWsSoap12_address = "http://aacc63/ccmmwebservices/CIContactWs.asmx";

    public String getCIContactWsSoap12Address() {
        return CIContactWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIContactWsSoap12WSDDServiceName = "CIContactWsSoap12";

    public String getCIContactWsSoap12WSDDServiceName() {
        return CIContactWsSoap12WSDDServiceName;
    }

    public void setCIContactWsSoap12WSDDServiceName(String name) {
        CIContactWsSoap12WSDDServiceName = name;
    }

    public CIContactWsSoap getCIContactWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIContactWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIContactWsSoap12(endpoint);
    }

    public CIContactWsSoap getCIContactWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIContactWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIContactWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCIContactWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIContactWsSoap12EndpointAddress(String address) {
        CIContactWsSoap12_address = address;
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
            if (CIContactWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIContactWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIContactWsSoap_BindingStub(new java.net.URL(CIContactWsSoap_address), this);
                _stub.setPortName(getCIContactWsSoapWSDDServiceName());
                return _stub;
            }
            if (CIContactWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIContactWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIContactWsSoap12Stub(new java.net.URL(CIContactWsSoap12_address), this);
                _stub.setPortName(getCIContactWsSoap12WSDDServiceName());
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
        if ("CIContactWsSoap".equals(inputPortName)) {
            return getCIContactWsSoap();
        } else if ("CIContactWsSoap12".equals(inputPortName)) {
            return getCIContactWsSoap12();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIContactWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIContactWsSoap"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIContactWsSoap12"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CIContactWsSoap".equals(portName)) {
            setCIContactWsSoapEndpointAddress(address);
        } else if ("CIContactWsSoap12".equals(portName)) {
            setCIContactWsSoap12EndpointAddress(address);
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
