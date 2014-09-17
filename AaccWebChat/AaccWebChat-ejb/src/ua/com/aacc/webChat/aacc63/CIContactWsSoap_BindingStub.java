/**
 * CIContactWsSoap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIContactWsSoap_BindingStub extends org.apache.axis.client.Stub implements CIContactWsSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReadContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "sessionKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactReadType"));
        oper.setReturnClass(CIContactReadType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "ReadContactResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CloseContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "contactID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "closureText"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "closedReasonCodeValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "closedReasonCodeSpecified"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "sessionKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CloseContactResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllClosedReasonCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "sessionKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIMultipleClosedRCReadType"));
        oper.setReturnClass(CIMultipleClosedRCReadType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "GetAllClosedReasonCodesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClosedReasonCodeByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "closedReasonCodeName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "sessionKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIClosedRCReadType"));
        oper.setReturnClass(CIClosedRCReadType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "GetClosedReasonCodeByNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public CIContactWsSoap_BindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public CIContactWsSoap_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public CIContactWsSoap_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.1");
        Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "ArrayOfCIActionReadType");
        cachedSerQNames.add(qName);
        cls = CIActionReadType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIActionReadType");
        qName2 = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIActionReadType");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "ArrayOfCIClosedRCReadType");
        cachedSerQNames.add(qName);
        cls = CIClosedRCReadType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIClosedRCReadType");
        qName2 = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIClosedRCReadType");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "ArrayOfCICustomFieldReadType");
        cachedSerQNames.add(qName);
        cls = CICustomFieldReadType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICustomFieldReadType");
        qName2 = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICustomFieldReadType");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIActionReadType");
        cachedSerQNames.add(qName);
        cls = CIActionReadType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIActionSource");
        cachedSerQNames.add(qName);
        cls = CIActionSource.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIAgentReadType");
        cachedSerQNames.add(qName);
        cls = CIAgentReadType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICallbackStatus");
        cachedSerQNames.add(qName);
        cls = CICallbackStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIClosedRCReadType");
        cachedSerQNames.add(qName);
        cls = CIClosedRCReadType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactPriority");
        cachedSerQNames.add(qName);
        cls = CIContactPriority.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactReadType");
        cachedSerQNames.add(qName);
        cls = CIContactReadType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactSource");
        cachedSerQNames.add(qName);
        cls = CIContactSource.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactStatus");
        cachedSerQNames.add(qName);
        cls = CIContactStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactType");
        cachedSerQNames.add(qName);
        cls = CIContactType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICustomFieldReadType");
        cachedSerQNames.add(qName);
        cls = CICustomFieldReadType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime");
        cachedSerQNames.add(qName);
        cls = CIDateTime.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIMultipleClosedRCReadType");
        cachedSerQNames.add(qName);
        cls = CIMultipleClosedRCReadType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CISkillsetReadType");
        cachedSerQNames.add(qName);
        cls = CISkillsetReadType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                    cachedSerFactories.get(i);
                            Class df = (Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public CIContactReadType readContact(long id, String sessionKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.ci.ccmm.applications.nortel.com/ReadContact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "ReadContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Long(id), sessionKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (CIContactReadType) _resp;
                } catch (Exception _exception) {
                    return (CIContactReadType) org.apache.axis.utils.JavaUtils.convert(_resp, CIContactReadType.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public long closeContact(long contactID, String closureText, long closedReasonCodeValue, boolean closedReasonCodeSpecified, String sessionKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.ci.ccmm.applications.nortel.com/CloseContact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "CloseContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{new Long(contactID), closureText, new Long(closedReasonCodeValue), new Boolean(closedReasonCodeSpecified), sessionKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Long) _resp).longValue();
                } catch (Exception _exception) {
                    return ((Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public CIMultipleClosedRCReadType getAllClosedReasonCodes(String sessionKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.ci.ccmm.applications.nortel.com/GetAllClosedReasonCodes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "GetAllClosedReasonCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (CIMultipleClosedRCReadType) _resp;
                } catch (Exception _exception) {
                    return (CIMultipleClosedRCReadType) org.apache.axis.utils.JavaUtils.convert(_resp, CIMultipleClosedRCReadType.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public CIClosedRCReadType getClosedReasonCodeByName(String closedReasonCodeName, String sessionKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.ci.ccmm.applications.nortel.com/GetClosedReasonCodeByName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.ci.ccmm.applications.nortel.com", "GetClosedReasonCodeByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{closedReasonCodeName, sessionKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (CIClosedRCReadType) _resp;
                } catch (Exception _exception) {
                    return (CIClosedRCReadType) org.apache.axis.utils.JavaUtils.convert(_resp, CIClosedRCReadType.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
