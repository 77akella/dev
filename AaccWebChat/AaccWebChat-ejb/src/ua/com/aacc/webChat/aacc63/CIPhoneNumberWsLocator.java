/**
 * CIPhoneNumberWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIPhoneNumberWsLocator extends org.apache.axis.client.Service implements CIPhoneNumberWs {

    public CIPhoneNumberWsLocator() {
    }


    public CIPhoneNumberWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CIPhoneNumberWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CIPhoneNumberWsSoap12
    private String CIPhoneNumberWsSoap12_address = "http://aacc63/ccmmwebservices/CIPhoneNumberWs.asmx";

    public String getCIPhoneNumberWsSoap12Address() {
        return CIPhoneNumberWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIPhoneNumberWsSoap12WSDDServiceName = "CIPhoneNumberWsSoap12";

    public String getCIPhoneNumberWsSoap12WSDDServiceName() {
        return CIPhoneNumberWsSoap12WSDDServiceName;
    }

    public void setCIPhoneNumberWsSoap12WSDDServiceName(String name) {
        CIPhoneNumberWsSoap12WSDDServiceName = name;
    }

    public CIPhoneNumberWsSoap getCIPhoneNumberWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIPhoneNumberWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIPhoneNumberWsSoap12(endpoint);
    }

    public CIPhoneNumberWsSoap getCIPhoneNumberWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIPhoneNumberWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIPhoneNumberWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCIPhoneNumberWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIPhoneNumberWsSoap12EndpointAddress(String address) {
        CIPhoneNumberWsSoap12_address = address;
    }


    // Use to get a proxy class for CIPhoneNumberWsSoap
    private String CIPhoneNumberWsSoap_address = "http://aacc63/ccmmwebservices/CIPhoneNumberWs.asmx";

    public String getCIPhoneNumberWsSoapAddress() {
        return CIPhoneNumberWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIPhoneNumberWsSoapWSDDServiceName = "CIPhoneNumberWsSoap";

    public String getCIPhoneNumberWsSoapWSDDServiceName() {
        return CIPhoneNumberWsSoapWSDDServiceName;
    }

    public void setCIPhoneNumberWsSoapWSDDServiceName(String name) {
        CIPhoneNumberWsSoapWSDDServiceName = name;
    }

    public CIPhoneNumberWsSoap getCIPhoneNumberWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIPhoneNumberWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIPhoneNumberWsSoap(endpoint);
    }

    public CIPhoneNumberWsSoap getCIPhoneNumberWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIPhoneNumberWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIPhoneNumberWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCIPhoneNumberWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIPhoneNumberWsSoapEndpointAddress(String address) {
        CIPhoneNumberWsSoap_address = address;
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
            if (CIPhoneNumberWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIPhoneNumberWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIPhoneNumberWsSoap12Stub(new java.net.URL(CIPhoneNumberWsSoap12_address), this);
                _stub.setPortName(getCIPhoneNumberWsSoap12WSDDServiceName());
                return _stub;
            }
            if (CIPhoneNumberWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIPhoneNumberWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIPhoneNumberWsSoap_BindingStub(new java.net.URL(CIPhoneNumberWsSoap_address), this);
                _stub.setPortName(getCIPhoneNumberWsSoapWSDDServiceName());
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
        if ("CIPhoneNumberWsSoap12".equals(inputPortName)) {
            return getCIPhoneNumberWsSoap12();
        } else if ("CIPhoneNumberWsSoap".equals(inputPortName)) {
            return getCIPhoneNumberWsSoap();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIPhoneNumberWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIPhoneNumberWsSoap12"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIPhoneNumberWsSoap"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CIPhoneNumberWsSoap12".equals(portName)) {
            setCIPhoneNumberWsSoap12EndpointAddress(address);
        } else if ("CIPhoneNumberWsSoap".equals(portName)) {
            setCIPhoneNumberWsSoapEndpointAddress(address);
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
