/**
 * CICustomerWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CICustomerWsLocator extends org.apache.axis.client.Service implements CICustomerWs {

    public CICustomerWsLocator() {
    }


    public CICustomerWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CICustomerWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CICustomerWsSoap12
    private String CICustomerWsSoap12_address = "http://aacc63/ccmmwebservices/CICustomerWs.asmx";

    public String getCICustomerWsSoap12Address() {
        return CICustomerWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CICustomerWsSoap12WSDDServiceName = "CICustomerWsSoap12";

    public String getCICustomerWsSoap12WSDDServiceName() {
        return CICustomerWsSoap12WSDDServiceName;
    }

    public void setCICustomerWsSoap12WSDDServiceName(String name) {
        CICustomerWsSoap12WSDDServiceName = name;
    }

    public CICustomerWsSoap getCICustomerWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CICustomerWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCICustomerWsSoap12(endpoint);
    }

    public CICustomerWsSoap getCICustomerWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CICustomerWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CICustomerWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCICustomerWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCICustomerWsSoap12EndpointAddress(String address) {
        CICustomerWsSoap12_address = address;
    }


    // Use to get a proxy class for CICustomerWsSoap
    private String CICustomerWsSoap_address = "http://aacc63/ccmmwebservices/CICustomerWs.asmx";

    public String getCICustomerWsSoapAddress() {
        return CICustomerWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CICustomerWsSoapWSDDServiceName = "CICustomerWsSoap";

    public String getCICustomerWsSoapWSDDServiceName() {
        return CICustomerWsSoapWSDDServiceName;
    }

    public void setCICustomerWsSoapWSDDServiceName(String name) {
        CICustomerWsSoapWSDDServiceName = name;
    }

    public CICustomerWsSoap getCICustomerWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CICustomerWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCICustomerWsSoap(endpoint);
    }

    public CICustomerWsSoap getCICustomerWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CICustomerWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CICustomerWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCICustomerWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCICustomerWsSoapEndpointAddress(String address) {
        CICustomerWsSoap_address = address;
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
            if (CICustomerWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CICustomerWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CICustomerWsSoap12Stub(new java.net.URL(CICustomerWsSoap12_address), this);
                _stub.setPortName(getCICustomerWsSoap12WSDDServiceName());
                return _stub;
            }
            if (CICustomerWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CICustomerWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CICustomerWsSoap_BindingStub(new java.net.URL(CICustomerWsSoap_address), this);
                _stub.setPortName(getCICustomerWsSoapWSDDServiceName());
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
        if ("CICustomerWsSoap12".equals(inputPortName)) {
            return getCICustomerWsSoap12();
        } else if ("CICustomerWsSoap".equals(inputPortName)) {
            return getCICustomerWsSoap();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CICustomerWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CICustomerWsSoap12"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CICustomerWsSoap"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CICustomerWsSoap12".equals(portName)) {
            setCICustomerWsSoap12EndpointAddress(address);
        } else if ("CICustomerWsSoap".equals(portName)) {
            setCICustomerWsSoapEndpointAddress(address);
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
