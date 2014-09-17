/**
 * LaunchVXMLRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vp.launchCall;

public class LaunchVXMLRequest  implements java.io.Serializable {
    private java.lang.String toURI;

    private java.lang.String fromURI;

    private java.lang.String applicationName;

    private java.lang.String applicationURL;

    private java.lang.String parameters;

    private java.lang.String uuiInfo;

    private int connectTimeoutSecs;

    public LaunchVXMLRequest() {
    }

    public LaunchVXMLRequest(
           java.lang.String toURI,
           java.lang.String fromURI,
           java.lang.String applicationName,
           java.lang.String applicationURL,
           java.lang.String parameters,
           java.lang.String uuiInfo,
           int connectTimeoutSecs) {
           this.toURI = toURI;
           this.fromURI = fromURI;
           this.applicationName = applicationName;
           this.applicationURL = applicationURL;
           this.parameters = parameters;
           this.uuiInfo = uuiInfo;
           this.connectTimeoutSecs = connectTimeoutSecs;
    }


    /**
     * Gets the toURI value for this LaunchVXMLRequest.
     *
     * @return toURI
     */
    public java.lang.String getToURI() {
        return toURI;
    }


    /**
     * Sets the toURI value for this LaunchVXMLRequest.
     *
     * @param toURI
     */
    public void setToURI(java.lang.String toURI) {
        this.toURI = toURI;
    }


    /**
     * Gets the fromURI value for this LaunchVXMLRequest.
     *
     * @return fromURI
     */
    public java.lang.String getFromURI() {
        return fromURI;
    }


    /**
     * Sets the fromURI value for this LaunchVXMLRequest.
     *
     * @param fromURI
     */
    public void setFromURI(java.lang.String fromURI) {
        this.fromURI = fromURI;
    }


    /**
     * Gets the applicationName value for this LaunchVXMLRequest.
     *
     * @return applicationName
     */
    public java.lang.String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this LaunchVXMLRequest.
     *
     * @param applicationName
     */
    public void setApplicationName(java.lang.String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the applicationURL value for this LaunchVXMLRequest.
     *
     * @return applicationURL
     */
    public java.lang.String getApplicationURL() {
        return applicationURL;
    }


    /**
     * Sets the applicationURL value for this LaunchVXMLRequest.
     *
     * @param applicationURL
     */
    public void setApplicationURL(java.lang.String applicationURL) {
        this.applicationURL = applicationURL;
    }


    /**
     * Gets the parameters value for this LaunchVXMLRequest.
     *
     * @return parameters
     */
    public java.lang.String getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this LaunchVXMLRequest.
     *
     * @param parameters
     */
    public void setParameters(java.lang.String parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the uuiInfo value for this LaunchVXMLRequest.
     *
     * @return uuiInfo
     */
    public java.lang.String getUuiInfo() {
        return uuiInfo;
    }


    /**
     * Sets the uuiInfo value for this LaunchVXMLRequest.
     *
     * @param uuiInfo
     */
    public void setUuiInfo(java.lang.String uuiInfo) {
        this.uuiInfo = uuiInfo;
    }


    /**
     * Gets the connectTimeoutSecs value for this LaunchVXMLRequest.
     *
     * @return connectTimeoutSecs
     */
    public int getConnectTimeoutSecs() {
        return connectTimeoutSecs;
    }


    /**
     * Sets the connectTimeoutSecs value for this LaunchVXMLRequest.
     *
     * @param connectTimeoutSecs
     */
    public void setConnectTimeoutSecs(int connectTimeoutSecs) {
        this.connectTimeoutSecs = connectTimeoutSecs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LaunchVXMLRequest)) return false;
        LaunchVXMLRequest other = (LaunchVXMLRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.toURI==null && other.getToURI()==null) ||
             (this.toURI!=null &&
              this.toURI.equals(other.getToURI()))) &&
            ((this.fromURI==null && other.getFromURI()==null) ||
             (this.fromURI!=null &&
              this.fromURI.equals(other.getFromURI()))) &&
            ((this.applicationName==null && other.getApplicationName()==null) ||
             (this.applicationName!=null &&
              this.applicationName.equals(other.getApplicationName()))) &&
            ((this.applicationURL==null && other.getApplicationURL()==null) ||
             (this.applicationURL!=null &&
              this.applicationURL.equals(other.getApplicationURL()))) &&
            ((this.parameters==null && other.getParameters()==null) ||
             (this.parameters!=null &&
              this.parameters.equals(other.getParameters()))) &&
            ((this.uuiInfo==null && other.getUuiInfo()==null) ||
             (this.uuiInfo!=null &&
              this.uuiInfo.equals(other.getUuiInfo()))) &&
            this.connectTimeoutSecs == other.getConnectTimeoutSecs();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getToURI() != null) {
            _hashCode += getToURI().hashCode();
        }
        if (getFromURI() != null) {
            _hashCode += getFromURI().hashCode();
        }
        if (getApplicationName() != null) {
            _hashCode += getApplicationName().hashCode();
        }
        if (getApplicationURL() != null) {
            _hashCode += getApplicationURL().hashCode();
        }
        if (getParameters() != null) {
            _hashCode += getParameters().hashCode();
        }
        if (getUuiInfo() != null) {
            _hashCode += getUuiInfo().hashCode();
        }
        _hashCode += getConnectTimeoutSecs();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LaunchVXMLRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchVXMLRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "toURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "fromURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "applicationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "applicationURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuiInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "uuiInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectTimeoutSecs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "connectTimeoutSecs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
