/**
 * CICustomFieldWsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CICustomFieldWsLocator extends org.apache.axis.client.Service implements CICustomFieldWs {

    public CICustomFieldWsLocator() {
    }


    public CICustomFieldWsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CICustomFieldWsLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CICustomFieldWsSoap
    private String CICustomFieldWsSoap_address = "http://aacc63/ccmmwebservices/CICustomFieldWs.asmx";

    public String getCICustomFieldWsSoapAddress() {
        return CICustomFieldWsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String CICustomFieldWsSoapWSDDServiceName = "CICustomFieldWsSoap";

    public String getCICustomFieldWsSoapWSDDServiceName() {
        return CICustomFieldWsSoapWSDDServiceName;
    }

    public void setCICustomFieldWsSoapWSDDServiceName(String name) {
        CICustomFieldWsSoapWSDDServiceName = name;
    }

    public CICustomFieldWsSoap getCICustomFieldWsSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CICustomFieldWsSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCICustomFieldWsSoap(endpoint);
    }

    public CICustomFieldWsSoap getCICustomFieldWsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CICustomFieldWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CICustomFieldWsSoap_BindingStub(portAddress, this);
            _stub.setPortName(getCICustomFieldWsSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCICustomFieldWsSoapEndpointAddress(String address) {
        CICustomFieldWsSoap_address = address;
    }


    // Use to get a proxy class for CICustomFieldWsSoap12
    private String CICustomFieldWsSoap12_address = "http://aacc63/ccmmwebservices/CICustomFieldWs.asmx";

    public String getCICustomFieldWsSoap12Address() {
        return CICustomFieldWsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String CICustomFieldWsSoap12WSDDServiceName = "CICustomFieldWsSoap12";

    public String getCICustomFieldWsSoap12WSDDServiceName() {
        return CICustomFieldWsSoap12WSDDServiceName;
    }

    public void setCICustomFieldWsSoap12WSDDServiceName(String name) {
        CICustomFieldWsSoap12WSDDServiceName = name;
    }

    public CICustomFieldWsSoap getCICustomFieldWsSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CICustomFieldWsSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCICustomFieldWsSoap12(endpoint);
    }

    public CICustomFieldWsSoap getCICustomFieldWsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ua.com.aacc.webChat.aacc63.CICustomFieldWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CICustomFieldWsSoap12Stub(portAddress, this);
            _stub.setPortName(getCICustomFieldWsSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCICustomFieldWsSoap12EndpointAddress(String address) {
        CICustomFieldWsSoap12_address = address;
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
            if (CICustomFieldWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CICustomFieldWsSoap_BindingStub _stub = new ua.com.aacc.webChat.aacc63.CICustomFieldWsSoap_BindingStub(new java.net.URL(CICustomFieldWsSoap_address), this);
                _stub.setPortName(getCICustomFieldWsSoapWSDDServiceName());
                return _stub;
            }
            if (CICustomFieldWsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ua.com.aacc.webChat.aacc63.CICustomFieldWsSoap12Stub _stub = new ua.com.aacc.webChat.aacc63.CICustomFieldWsSoap12Stub(new java.net.URL(CICustomFieldWsSoap12_address), this);
                _stub.setPortName(getCICustomFieldWsSoap12WSDDServiceName());
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
        if ("CICustomFieldWsSoap".equals(inputPortName)) {
            return getCICustomFieldWsSoap();
        } else if ("CICustomFieldWsSoap12".equals(inputPortName)) {
            return getCICustomFieldWsSoap12();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CICustomFieldWs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CICustomFieldWsSoap"));
            ports.add(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CICustomFieldWsSoap12"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("CICustomFieldWsSoap".equals(portName)) {
            setCICustomFieldWsSoapEndpointAddress(address);
        } else if ("CICustomFieldWsSoap12".equals(portName)) {
            setCICustomFieldWsSoap12EndpointAddress(address);
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
