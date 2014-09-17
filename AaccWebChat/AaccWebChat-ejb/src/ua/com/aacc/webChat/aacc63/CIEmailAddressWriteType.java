/**
 * CIEmailAddressWriteType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIEmailAddressWriteType implements java.io.Serializable {
    private String emailAddress;

    private Boolean defaultEmailAddress;

    private boolean defaultEmailAddressSpecified;

    public CIEmailAddressWriteType() {
    }

    public CIEmailAddressWriteType(
            String emailAddress,
            Boolean defaultEmailAddress,
            boolean defaultEmailAddressSpecified) {
        this.emailAddress = emailAddress;
        this.defaultEmailAddress = defaultEmailAddress;
        this.defaultEmailAddressSpecified = defaultEmailAddressSpecified;
    }


    /**
     * Gets the emailAddress value for this CIEmailAddressWriteType.
     *
     * @return emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this CIEmailAddressWriteType.
     *
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the defaultEmailAddress value for this CIEmailAddressWriteType.
     *
     * @return defaultEmailAddress
     */
    public Boolean getDefaultEmailAddress() {
        return defaultEmailAddress;
    }


    /**
     * Sets the defaultEmailAddress value for this CIEmailAddressWriteType.
     *
     * @param defaultEmailAddress
     */
    public void setDefaultEmailAddress(Boolean defaultEmailAddress) {
        this.defaultEmailAddress = defaultEmailAddress;
    }


    /**
     * Gets the defaultEmailAddressSpecified value for this CIEmailAddressWriteType.
     *
     * @return defaultEmailAddressSpecified
     */
    public boolean isDefaultEmailAddressSpecified() {
        return defaultEmailAddressSpecified;
    }


    /**
     * Sets the defaultEmailAddressSpecified value for this CIEmailAddressWriteType.
     *
     * @param defaultEmailAddressSpecified
     */
    public void setDefaultEmailAddressSpecified(boolean defaultEmailAddressSpecified) {
        this.defaultEmailAddressSpecified = defaultEmailAddressSpecified;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIEmailAddressWriteType)) return false;
        CIEmailAddressWriteType other = (CIEmailAddressWriteType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.emailAddress == null && other.getEmailAddress() == null) ||
                        (this.emailAddress != null &&
                                this.emailAddress.equals(other.getEmailAddress()))) &&
                ((this.defaultEmailAddress == null && other.getDefaultEmailAddress() == null) ||
                        (this.defaultEmailAddress != null &&
                                this.defaultEmailAddress.equals(other.getDefaultEmailAddress()))) &&
                this.defaultEmailAddressSpecified == other.isDefaultEmailAddressSpecified();
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
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getDefaultEmailAddress() != null) {
            _hashCode += getDefaultEmailAddress().hashCode();
        }
        _hashCode += (isDefaultEmailAddressSpecified() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIEmailAddressWriteType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIEmailAddressWriteType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "emailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "defaultEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEmailAddressSpecified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "defaultEmailAddressSpecified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
