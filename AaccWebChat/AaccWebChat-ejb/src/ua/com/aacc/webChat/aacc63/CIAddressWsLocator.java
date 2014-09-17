/**
 * CIAddressWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIAddressWsLocator extends org.apache.axis.client.Service implements CIAddressWs {

    public CIAddressWsLocator() {
    }


    public CIAddressWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CIAddressWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CIAddressWsSoap
    private String CIAddressWsSoap_address = "http://aacc63/ccmmwebservices/CIAddressWs.asmx";

    public String getCIAddressWsSoapAddress() {
        return CIAddressWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIAddressWsSoapWSDDServiceName = "CIAddressWsSoap";

    public String getCIAddressWsSoapWSDDServiceName() {
        return CIAddressWsSoapWSDDServiceName;
    }

    public void setCIAddressWsSoapWSDDServiceName(String name) {
        CIAddressWsSoapWSDDServiceName = name;
    }

    public CIAddressWsSoap getCIAddressWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIAddressWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIAddressWsSoap(endpoint);
    }

    public CIAddressWsSoap getCIAddressWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIAddressWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIAddressWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCIAddressWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIAddressWsSoapEndpointAddress(String address) {
        CIAddressWsSoap_address = address;
    }


    // Use to get a proxy class for CIAddressWsSoap12
    private String CIAddressWsSoap12_address = "http://aacc63/ccmmwebservices/CIAddressWs.asmx";

    public String getCIAddressWsSoap12Address() {
        return CIAddressWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIAddressWsSoap12WSDDServiceName = "CIAddressWsSoap12";

    public String getCIAddressWsSoap12WSDDServiceName() {
        return CIAddressWsSoap12WSDDServiceName;
    }

    public void setCIAddressWsSoap12WSDDServiceName(String name) {
        CIAddressWsSoap12WSDDServiceName = name;
    }

    public CIAddressWsSoap getCIAddressWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIAddressWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIAddressWsSoap12(endpoint);
    }

    public CIAddressWsSoap getCIAddressWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIAddressWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIAddressWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCIAddressWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIAddressWsSoap12EndpointAddress(String address) {
        CIAddressWsSoap12_address = address;
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
            if (CIAddressWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIAddressWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIAddressWsSoap_BindingStub(new java.net.URL(CIAddressWsSoap_address), this);
                _stub.setPortName(getCIAddressWsSoapWSDDServiceName());
                return _stub;
            }
            if (CIAddressWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIAddressWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIAddressWsSoap12Stub(new java.net.URL(CIAddressWsSoap12_address), this);
                _stub.setPortName(getCIAddressWsSoap12WSDDServiceName());
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
        if ("CIAddressWsSoap".equals(inputPortName)) {
            return getCIAddressWsSoap();
        } else if ("CIAddressWsSoap12".equals(inputPortName)) {
            return getCIAddressWsSoap12();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIAddressWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIAddressWsSoap"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIAddressWsSoap12"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CIAddressWsSoap".equals(portName)) {
            setCIAddressWsSoapEndpointAddress(address);
        } else if ("CIAddressWsSoap12".equals(portName)) {
            setCIAddressWsSoap12EndpointAddress(address);
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
