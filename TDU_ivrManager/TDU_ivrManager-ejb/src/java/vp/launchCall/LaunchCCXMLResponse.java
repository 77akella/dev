/**
 * LaunchCCXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vp.launchCall;

public class LaunchCCXMLResponse  implements java.io.Serializable {
    private java.lang.String sessionID_returned;

    private int totalRes_returned;

    private int unusedSIP_returned;

    private int unusedH323_returned;

    public LaunchCCXMLResponse() {
    }

    public LaunchCCXMLResponse(
           java.lang.String sessionID_returned,
           int totalRes_returned,
           int unusedSIP_returned,
           int unusedH323_returned) {
           this.sessionID_returned = sessionID_returned;
           this.totalRes_returned = totalRes_returned;
           this.unusedSIP_returned = unusedSIP_returned;
           this.unusedH323_returned = unusedH323_returned;
    }


    /**
     * Gets the sessionID_returned value for this LaunchCCXMLResponse.
     *
     * @return sessionID_returned
     */
    public java.lang.String getSessionID_returned() {
        return sessionID_returned;
    }


    /**
     * Sets the sessionID_returned value for this LaunchCCXMLResponse.
     *
     * @param sessionID_returned
     */
    public void setSessionID_returned(java.lang.String sessionID_returned) {
        this.sessionID_returned = sessionID_returned;
    }


    /**
     * Gets the totalRes_returned value for this LaunchCCXMLResponse.
     *
     * @return totalRes_returned
     */
    public int getTotalRes_returned() {
        return totalRes_returned;
    }


    /**
     * Sets the totalRes_returned value for this LaunchCCXMLResponse.
     *
     * @param totalRes_returned
     */
    public void setTotalRes_returned(int totalRes_returned) {
        this.totalRes_returned = totalRes_returned;
    }


    /**
     * Gets the unusedSIP_returned value for this LaunchCCXMLResponse.
     *
     * @return unusedSIP_returned
     */
    public int getUnusedSIP_returned() {
        return unusedSIP_returned;
    }


    /**
     * Sets the unusedSIP_returned value for this LaunchCCXMLResponse.
     *
     * @param unusedSIP_returned
     */
    public void setUnusedSIP_returned(int unusedSIP_returned) {
        this.unusedSIP_returned = unusedSIP_returned;
    }


    /**
     * Gets the unusedH323_returned value for this LaunchCCXMLResponse.
     *
     * @return unusedH323_returned
     */
    public int getUnusedH323_returned() {
        return unusedH323_returned;
    }


    /**
     * Sets the unusedH323_returned value for this LaunchCCXMLResponse.
     *
     * @param unusedH323_returned
     */
    public void setUnusedH323_returned(int unusedH323_returned) {
        this.unusedH323_returned = unusedH323_returned;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LaunchCCXMLResponse)) return false;
        LaunchCCXMLResponse other = (LaunchCCXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.sessionID_returned==null && other.getSessionID_returned()==null) ||
             (this.sessionID_returned!=null &&
              this.sessionID_returned.equals(other.getSessionID_returned()))) &&
            this.totalRes_returned == other.getTotalRes_returned() &&
            this.unusedSIP_returned == other.getUnusedSIP_returned() &&
            this.unusedH323_returned == other.getUnusedH323_returned();
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
        if (getSessionID_returned() != null) {
            _hashCode += getSessionID_returned().hashCode();
        }
        _hashCode += getTotalRes_returned();
        _hashCode += getUnusedSIP_returned();
        _hashCode += getUnusedH323_returned();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LaunchCCXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.vp.avaya.com", ">LaunchCCXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "sessionID_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRes_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "totalRes_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unusedSIP_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "unusedSIP_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unusedH323_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "unusedH323_returned"));
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
