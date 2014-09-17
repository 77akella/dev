/**
 * AppIntfWSSOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vp.launchCall;

import javax.xml.rpc.Service;

public class AppIntfWSSOAPStub extends org.apache.axis.client.Stub implements vp.launchCall.AppIntfWS_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.vp.avaya.com", "GetStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.vp.avaya.com", ">GetStatusRequest"), vp.launchCall.GetStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.vp.avaya.com", ">GetStatusResponse"));
        oper.setReturnClass(vp.launchCall.GetStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "GetStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "GetStatusFault"),
                      "callvpws.GetStatusFault",
                      new javax.xml.namespace.QName("http://services.vp.avaya.com", "GetStatusFault"),
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LaunchVXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.vp.avaya.com", "LaunchVXMLRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchVXMLRequest"), vp.launchCall.LaunchVXMLRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchVXMLResponse"));
        oper.setReturnClass(vp.launchCall.LaunchVXMLResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "LaunchVXMLResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "LaunchVXMLFault"),
                      "callvpws.LaunchVXMLFault",
                      new javax.xml.namespace.QName("http://services.vp.avaya.com", "LaunchVXMLFault"),
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LaunchCCXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.vp.avaya.com", "LaunchCCXMLRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchCCXMLRequest"), vp.launchCall.LaunchCCXMLRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchCCXMLResponse"));
        oper.setReturnClass(vp.launchCall.LaunchCCXMLResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "LaunchCCXMLResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "LaunchCCXMLFault"),
                      "callvpws.LaunchCCXMLFault",
                      new javax.xml.namespace.QName("http://services.vp.avaya.com", "LaunchCCXMLFault"),
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendCCXMLEvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.vp.avaya.com", "SendCCXMLEventRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.vp.avaya.com", ">SendCCXMLEventRequest"), vp.launchCall.SendCCXMLEventRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.vp.avaya.com", ">SendCCXMLEventResponse"));
        oper.setReturnClass(vp.launchCall.SendCCXMLEventResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "SendCCXMLEventResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "SendCCXMLEventFault"),
                      "callvpws.SendCCXMLEventFault",
                      new javax.xml.namespace.QName("http://services.vp.avaya.com", "SendCCXMLEventFault"),
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryResources");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.vp.avaya.com", "QueryResourcesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.vp.avaya.com", ">QueryResourcesRequest"), vp.launchCall.QueryResourcesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.vp.avaya.com", ">QueryResourcesResponse"));
        oper.setReturnClass(vp.launchCall.QueryResourcesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "QueryResourcesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("", "QueryResourcesFault"),
                      "callvpws.QueryResourcesFault",
                      new javax.xml.namespace.QName("http://services.vp.avaya.com", "QueryResourcesFault"),
                      true
                     ));
        _operations[4] = oper;

    }

    public AppIntfWSSOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AppIntfWSSOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AppIntfWSSOAPStub(Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">GetStatusRequest");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.GetStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">GetStatusResponse");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.GetStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchCCXMLRequest");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.LaunchCCXMLRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchCCXMLResponse");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.LaunchCCXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchVXMLRequest");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.LaunchVXMLRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchVXMLResponse");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.LaunchVXMLResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">QueryResourcesRequest");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.QueryResourcesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">QueryResourcesResponse");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.QueryResourcesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">SendCCXMLEventRequest");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.SendCCXMLEventRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", ">SendCCXMLEventResponse");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.SendCCXMLEventResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", "GetStatusFault");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.GetStatusFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", "LaunchCCXMLFault");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.LaunchCCXMLFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", "LaunchVXMLFault");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.LaunchVXMLFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", "QueryResourcesFault");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.QueryResourcesFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.vp.avaya.com", "SendCCXMLEventFault");
            cachedSerQNames.add(qName);
            cls = vp.launchCall.SendCCXMLEventFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call1 = super._createCall();
            if (super.maintainSessionSet) {
                _call1.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call1.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call1.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call1.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call1.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call1.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call1.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call1.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call1.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call1.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call1;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public vp.launchCall.GetStatusResponse getStatus(vp.launchCall.GetStatusRequest parameters) throws java.rmi.RemoteException, vp.launchCall.GetStatusFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI(" ");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetStatus"));
        _call.setUsername(this._getProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY).toString());
        _call.setPassword(this._getProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY).toString());


        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vp.launchCall.GetStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vp.launchCall.GetStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vp.launchCall.GetStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof vp.launchCall.GetStatusFault) {
              throw (vp.launchCall.GetStatusFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public vp.launchCall.LaunchVXMLResponse launchVXML(vp.launchCall.LaunchVXMLRequest parameters) throws java.rmi.RemoteException, vp.launchCall.LaunchVXMLFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI(" ");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LaunchVXML"));
        _call.setUsername(this._getProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY).toString());
        _call.setPassword(this._getProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY).toString());

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vp.launchCall.LaunchVXMLResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vp.launchCall.LaunchVXMLResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vp.launchCall.LaunchVXMLResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof vp.launchCall.LaunchVXMLFault) {
              throw (vp.launchCall.LaunchVXMLFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public vp.launchCall.LaunchCCXMLResponse launchCCXML(vp.launchCall.LaunchCCXMLRequest parameters) throws java.rmi.RemoteException, vp.launchCall.LaunchCCXMLFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI(" ");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LaunchCCXML"));
        _call.setUsername(this._getProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY).toString());
        _call.setPassword(this._getProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY).toString());

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vp.launchCall.LaunchCCXMLResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vp.launchCall.LaunchCCXMLResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vp.launchCall.LaunchCCXMLResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof vp.launchCall.LaunchCCXMLFault) {
              throw (vp.launchCall.LaunchCCXMLFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public vp.launchCall.SendCCXMLEventResponse sendCCXMLEvent(vp.launchCall.SendCCXMLEventRequest parameters) throws java.rmi.RemoteException, vp.launchCall.SendCCXMLEventFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI(" ");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SendCCXMLEvent"));
        _call.setUsername(this._getProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY).toString());
        _call.setPassword(this._getProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY).toString());

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vp.launchCall.SendCCXMLEventResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vp.launchCall.SendCCXMLEventResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vp.launchCall.SendCCXMLEventResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof vp.launchCall.SendCCXMLEventFault) {
              throw (vp.launchCall.SendCCXMLEventFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public vp.launchCall.QueryResourcesResponse queryResources(vp.launchCall.QueryResourcesRequest parameters) throws java.rmi.RemoteException, vp.launchCall.QueryResourcesFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI(" ");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryResources"));
        _call.setUsername(this._getProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY).toString());
        _call.setPassword(this._getProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY).toString());

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vp.launchCall.QueryResourcesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vp.launchCall.QueryResourcesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vp.launchCall.QueryResourcesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof vp.launchCall.QueryResourcesFault) {
              throw (vp.launchCall.QueryResourcesFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
