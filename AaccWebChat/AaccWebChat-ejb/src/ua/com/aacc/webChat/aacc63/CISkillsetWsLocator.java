/**
 * CISkillsetWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CISkillsetWsLocator extends org.apache.axis.client.Service implements CISkillsetWs {

    public CISkillsetWsLocator() {
    }


    public CISkillsetWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CISkillsetWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CISkillsetWsSoap12
    private String CISkillsetWsSoap12_address = "http://aacc63/ccmmwebservices/CISkillsetWs.asmx";

    public String getCISkillsetWsSoap12Address() {
        return CISkillsetWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CISkillsetWsSoap12WSDDServiceName = "CISkillsetWsSoap12";

    public String getCISkillsetWsSoap12WSDDServiceName() {
        return CISkillsetWsSoap12WSDDServiceName;
    }

    public void setCISkillsetWsSoap12WSDDServiceName(String name) {
        CISkillsetWsSoap12WSDDServiceName = name;
    }

    public CISkillsetWsSoap getCISkillsetWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CISkillsetWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCISkillsetWsSoap12(endpoint);
    }

    public CISkillsetWsSoap getCISkillsetWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CISkillsetWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CISkillsetWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCISkillsetWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCISkillsetWsSoap12EndpointAddress(String address) {
        CISkillsetWsSoap12_address = address;
    }


    // Use to get a proxy class for CISkillsetWsSoap
    private String CISkillsetWsSoap_address = "http://aacc63/ccmmwebservices/CISkillsetWs.asmx";

    public String getCISkillsetWsSoapAddress() {
        return CISkillsetWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CISkillsetWsSoapWSDDServiceName = "CISkillsetWsSoap";

    public String getCISkillsetWsSoapWSDDServiceName() {
        return CISkillsetWsSoapWSDDServiceName;
    }

    public void setCISkillsetWsSoapWSDDServiceName(String name) {
        CISkillsetWsSoapWSDDServiceName = name;
    }

    public CISkillsetWsSoap getCISkillsetWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CISkillsetWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCISkillsetWsSoap(endpoint);
    }

    public CISkillsetWsSoap getCISkillsetWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CISkillsetWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CISkillsetWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCISkillsetWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCISkillsetWsSoapEndpointAddress(String address) {
        CISkillsetWsSoap_address = address;
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
            if (CISkillsetWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CISkillsetWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CISkillsetWsSoap12Stub(new java.net.URL(CISkillsetWsSoap12_address), this);
                _stub.setPortName(getCISkillsetWsSoap12WSDDServiceName());
                return _stub;
            }
            if (CISkillsetWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CISkillsetWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CISkillsetWsSoap_BindingStub(new java.net.URL(CISkillsetWsSoap_address), this);
                _stub.setPortName(getCISkillsetWsSoapWSDDServiceName());
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
        if ("CISkillsetWsSoap12".equals(inputPortName)) {
            return getCISkillsetWsSoap12();
        } else if ("CISkillsetWsSoap".equals(inputPortName)) {
            return getCISkillsetWsSoap();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CISkillsetWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CISkillsetWsSoap12"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CISkillsetWsSoap"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CISkillsetWsSoap12".equals(portName)) {
            setCISkillsetWsSoap12EndpointAddress(address);
        } else if ("CISkillsetWsSoap".equals(portName)) {
            setCISkillsetWsSoapEndpointAddress(address);
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
