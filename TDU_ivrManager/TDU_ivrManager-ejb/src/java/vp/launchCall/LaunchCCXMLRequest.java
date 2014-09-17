/**
 * LaunchCCXMLRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vp.launchCall;

public class LaunchCCXMLRequest  implements java.io.Serializable {
    private java.lang.String toURI;

    private java.lang.String applicationName;

    private java.lang.String applicationURL;

    private java.lang.String parameters;

    private java.lang.String uuiInfo;

    private int launchTimeout;

    public LaunchCCXMLRequest() {
    }

    public LaunchCCXMLRequest(
           java.lang.String toURI,
           java.lang.String applicationName,
           java.lang.String applicationURL,
           java.lang.String parameters,
           java.lang.String uuiInfo,
           int launchTimeout) {
           this.toURI = toURI;
           this.applicationName = applicationName;
           this.applicationURL = applicationURL;
           this.parameters = parameters;
           this.uuiInfo = uuiInfo;
           this.launchTimeout = launchTimeout;
    }


    /**
     * Gets the toURI value for this LaunchCCXMLRequest.
     *
     * @return toURI
     */
    public java.lang.String getToURI() {
        return toURI;
    }


    /**
     * Sets the toURI value for this LaunchCCXMLRequest.
     *
     * @param toURI
     */
    public void setToURI(java.lang.String toURI) {
        this.toURI = toURI;
    }


    /**
     * Gets the applicationName value for this LaunchCCXMLRequest.
     *
     * @return applicationName
     */
    public java.lang.String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this LaunchCCXMLRequest.
     *
     * @param applicationName
     */
    public void setApplicationName(java.lang.String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the applicationURL value for this LaunchCCXMLRequest.
     *
     * @return applicationURL
     */
    public java.lang.String getApplicationURL() {
        return applicationURL;
    }


    /**
     * Sets the applicationURL value for this LaunchCCXMLRequest.
     *
     * @param applicationURL
     */
    public void setApplicationURL(java.lang.String applicationURL) {
        this.applicationURL = applicationURL;
    }


    /**
     * Gets the parameters value for this LaunchCCXMLRequest.
     *
     * @return parameters
     */
    public java.lang.String getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this LaunchCCXMLRequest.
     *
     * @param parameters
     */
    public void setParameters(java.lang.String parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the uuiInfo value for this LaunchCCXMLRequest.
     *
     * @return uuiInfo
     */
    public java.lang.String getUuiInfo() {
        return uuiInfo;
    }


    /**
     * Sets the uuiInfo value for this LaunchCCXMLRequest.
     *
     * @param uuiInfo
     */
    public void setUuiInfo(java.lang.String uuiInfo) {
        this.uuiInfo = uuiInfo;
    }


    /**
     * Gets the launchTimeout value for this LaunchCCXMLRequest.
     *
     * @return launchTimeout
     */
    public int getLaunchTimeout() {
        return launchTimeout;
    }


    /**
     * Sets the launchTimeout value for this LaunchCCXMLRequest.
     *
     * @param launchTimeout
     */
    public void setLaunchTimeout(int launchTimeout) {
        this.launchTimeout = launchTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LaunchCCXMLRequest)) return false;
        LaunchCCXMLRequest other = (LaunchCCXMLRequest) obj;
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
            this.launchTimeout == other.getLaunchTimeout();
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
        _hashCode += getLaunchTimeout();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LaunchCCXMLRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchCCXMLRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "toURI"));
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
        elemField.setFieldName("launchTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "launchTimeout"));
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
