/**
 * CIActionWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIActionWsLocator extends org.apache.axis.client.Service implements CIActionWs {

    public CIActionWsLocator() {
    }


    public CIActionWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CIActionWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CIActionWsSoap
    private String CIActionWsSoap_address = "http://aacc63/ccmmwebservices/CIActionWs.asmx";

    public String getCIActionWsSoapAddress() {
        return CIActionWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIActionWsSoapWSDDServiceName = "CIActionWsSoap";

    public String getCIActionWsSoapWSDDServiceName() {
        return CIActionWsSoapWSDDServiceName;
    }

    public void setCIActionWsSoapWSDDServiceName(String name) {
        CIActionWsSoapWSDDServiceName = name;
    }

    public CIActionWsSoap getCIActionWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIActionWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIActionWsSoap(endpoint);
    }

    public CIActionWsSoap getCIActionWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIActionWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIActionWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCIActionWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIActionWsSoapEndpointAddress(String address) {
        CIActionWsSoap_address = address;
    }


    // Use to get a proxy class for CIActionWsSoap12
    private String CIActionWsSoap12_address = "http://aacc63/ccmmwebservices/CIActionWs.asmx";

    public String getCIActionWsSoap12Address() {
        return CIActionWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIActionWsSoap12WSDDServiceName = "CIActionWsSoap12";

    public String getCIActionWsSoap12WSDDServiceName() {
        return CIActionWsSoap12WSDDServiceName;
    }

    public void setCIActionWsSoap12WSDDServiceName(String name) {
        CIActionWsSoap12WSDDServiceName = name;
    }

    public CIActionWsSoap getCIActionWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIActionWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIActionWsSoap12(endpoint);
    }

    public CIActionWsSoap getCIActionWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIActionWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIActionWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCIActionWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIActionWsSoap12EndpointAddress(String address) {
        CIActionWsSoap12_address = address;
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
            if (CIActionWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIActionWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIActionWsSoap_BindingStub(new java.net.URL(CIActionWsSoap_address), this);
                _stub.setPortName(getCIActionWsSoapWSDDServiceName());
                return _stub;
            }
            if (CIActionWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIActionWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIActionWsSoap12Stub(new java.net.URL(CIActionWsSoap12_address), this);
                _stub.setPortName(getCIActionWsSoap12WSDDServiceName());
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
        if ("CIActionWsSoap".equals(inputPortName)) {
            return getCIActionWsSoap();
        } else if ("CIActionWsSoap12".equals(inputPortName)) {
            return getCIActionWsSoap12();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIActionWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIActionWsSoap"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIActionWsSoap12"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CIActionWsSoap".equals(portName)) {
            setCIActionWsSoapEndpointAddress(address);
        } else if ("CIActionWsSoap12".equals(portName)) {
            setCIActionWsSoap12EndpointAddress(address);
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
