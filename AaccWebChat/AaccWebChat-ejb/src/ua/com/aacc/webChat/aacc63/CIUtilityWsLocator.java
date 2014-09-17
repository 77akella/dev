/**
 * CIUtilityWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIUtilityWsLocator extends org.apache.axis.client.Service implements CIUtilityWs {

    public CIUtilityWsLocator() {
    }


    public CIUtilityWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CIUtilityWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CIUtilityWsSoap
    private String CIUtilityWsSoap_address = "http://aacc63/ccmmwebservices/CIUtilityWs.asmx";

    public String getCIUtilityWsSoapAddress() {
        return CIUtilityWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIUtilityWsSoapWSDDServiceName = "CIUtilityWsSoap";

    public String getCIUtilityWsSoapWSDDServiceName() {
        return CIUtilityWsSoapWSDDServiceName;
    }

    public void setCIUtilityWsSoapWSDDServiceName(String name) {
        CIUtilityWsSoapWSDDServiceName = name;
    }

    public CIUtilityWsSoap getCIUtilityWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIUtilityWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIUtilityWsSoap(endpoint);
    }

    public CIUtilityWsSoap getCIUtilityWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIUtilityWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIUtilityWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCIUtilityWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIUtilityWsSoapEndpointAddress(String address) {
        CIUtilityWsSoap_address = address;
    }


    // Use to get a proxy class for CIUtilityWsSoap12
    private String CIUtilityWsSoap12_address = "http://aacc63/ccmmwebservices/CIUtilityWs.asmx";

    public String getCIUtilityWsSoap12Address() {
        return CIUtilityWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CIUtilityWsSoap12WSDDServiceName = "CIUtilityWsSoap12";

    public String getCIUtilityWsSoap12WSDDServiceName() {
        return CIUtilityWsSoap12WSDDServiceName;
    }

    public void setCIUtilityWsSoap12WSDDServiceName(String name) {
        CIUtilityWsSoap12WSDDServiceName = name;
    }

    public CIUtilityWsSoap getCIUtilityWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIUtilityWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIUtilityWsSoap12(endpoint);
    }

    public CIUtilityWsSoap getCIUtilityWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CIUtilityWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIUtilityWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCIUtilityWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIUtilityWsSoap12EndpointAddress(String address) {
        CIUtilityWsSoap12_address = address;
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
            if (CIUtilityWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIUtilityWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CIUtilityWsSoap_BindingStub(new java.net.URL(CIUtilityWsSoap_address), this);
                _stub.setPortName(getCIUtilityWsSoapWSDDServiceName());
                return _stub;
            }
            if (CIUtilityWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CIUtilityWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CIUtilityWsSoap12Stub(new java.net.URL(CIUtilityWsSoap12_address), this);
                _stub.setPortName(getCIUtilityWsSoap12WSDDServiceName());
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
        if ("CIUtilityWsSoap".equals(inputPortName)) {
            return getCIUtilityWsSoap();
        } else if ("CIUtilityWsSoap12".equals(inputPortName)) {
            return getCIUtilityWsSoap12();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIUtilityWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIUtilityWsSoap"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CIUtilityWsSoap12"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CIUtilityWsSoap".equals(portName)) {
            setCIUtilityWsSoapEndpointAddress(address);
        } else if ("CIUtilityWsSoap12".equals(portName)) {
            setCIUtilityWsSoap12EndpointAddress(address);
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
