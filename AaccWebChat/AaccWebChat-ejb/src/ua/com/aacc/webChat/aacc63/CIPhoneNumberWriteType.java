/**
 * CIPhoneNumberWriteType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIPhoneNumberWriteType implements java.io.Serializable {
    private String internationalCode;

    private String areaCode;

    private String number;

    private CIPhoneNumberType phoneNumberType;

    private Boolean doNotCall;

    private boolean doNotCallSpecified;

    private Boolean defaultPhoneNumber;

    private boolean defaultPhoneNumberSpecified;

    public CIPhoneNumberWriteType() {
    }

    public CIPhoneNumberWriteType(
            String internationalCode,
            String areaCode,
            String number,
            CIPhoneNumberType phoneNumberType,
            Boolean doNotCall,
            boolean doNotCallSpecified,
            Boolean defaultPhoneNumber,
            boolean defaultPhoneNumberSpecified) {
        this.internationalCode = internationalCode;
        this.areaCode = areaCode;
        this.number = number;
        this.phoneNumberType = phoneNumberType;
        this.doNotCall = doNotCall;
        this.doNotCallSpecified = doNotCallSpecified;
        this.defaultPhoneNumber = defaultPhoneNumber;
        this.defaultPhoneNumberSpecified = defaultPhoneNumberSpecified;
    }


    /**
     * Gets the internationalCode value for this CIPhoneNumberWriteType.
     *
     * @return internationalCode
     */
    public String getInternationalCode() {
        return internationalCode;
    }


    /**
     * Sets the internationalCode value for this CIPhoneNumberWriteType.
     *
     * @param internationalCode
     */
    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode;
    }


    /**
     * Gets the areaCode value for this CIPhoneNumberWriteType.
     *
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }


    /**
     * Sets the areaCode value for this CIPhoneNumberWriteType.
     *
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }


    /**
     * Gets the number value for this CIPhoneNumberWriteType.
     *
     * @return number
     */
    public String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CIPhoneNumberWriteType.
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }


    /**
     * Gets the phoneNumberType value for this CIPhoneNumberWriteType.
     *
     * @return phoneNumberType
     */
    public CIPhoneNumberType getPhoneNumberType() {
        return phoneNumberType;
    }


    /**
     * Sets the phoneNumberType value for this CIPhoneNumberWriteType.
     *
     * @param phoneNumberType
     */
    public void setPhoneNumberType(CIPhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }


    /**
     * Gets the doNotCall value for this CIPhoneNumberWriteType.
     *
     * @return doNotCall
     */
    public Boolean getDoNotCall() {
        return doNotCall;
    }


    /**
     * Sets the doNotCall value for this CIPhoneNumberWriteType.
     *
     * @param doNotCall
     */
    public void setDoNotCall(Boolean doNotCall) {
        this.doNotCall = doNotCall;
    }


    /**
     * Gets the doNotCallSpecified value for this CIPhoneNumberWriteType.
     *
     * @return doNotCallSpecified
     */
    public boolean isDoNotCallSpecified() {
        return doNotCallSpecified;
    }


    /**
     * Sets the doNotCallSpecified value for this CIPhoneNumberWriteType.
     *
     * @param doNotCallSpecified
     */
    public void setDoNotCallSpecified(boolean doNotCallSpecified) {
        this.doNotCallSpecified = doNotCallSpecified;
    }


    /**
     * Gets the defaultPhoneNumber value for this CIPhoneNumberWriteType.
     *
     * @return defaultPhoneNumber
     */
    public Boolean getDefaultPhoneNumber() {
        return defaultPhoneNumber;
    }


    /**
     * Sets the defaultPhoneNumber value for this CIPhoneNumberWriteType.
     *
     * @param defaultPhoneNumber
     */
    public void setDefaultPhoneNumber(Boolean defaultPhoneNumber) {
        this.defaultPhoneNumber = defaultPhoneNumber;
    }


    /**
     * Gets the defaultPhoneNumberSpecified value for this CIPhoneNumberWriteType.
     *
     * @return defaultPhoneNumberSpecified
     */
    public boolean isDefaultPhoneNumberSpecified() {
        return defaultPhoneNumberSpecified;
    }


    /**
     * Sets the defaultPhoneNumberSpecified value for this CIPhoneNumberWriteType.
     *
     * @param defaultPhoneNumberSpecified
     */
    public void setDefaultPhoneNumberSpecified(boolean defaultPhoneNumberSpecified) {
        this.defaultPhoneNumberSpecified = defaultPhoneNumberSpecified;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIPhoneNumberWriteType)) return false;
        CIPhoneNumberWriteType other = (CIPhoneNumberWriteType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.internationalCode == null && other.getInternationalCode() == null) ||
                        (this.internationalCode != null &&
                                this.internationalCode.equals(other.getInternationalCode()))) &&
                ((this.areaCode == null && other.getAreaCode() == null) ||
                        (this.areaCode != null &&
                                this.areaCode.equals(other.getAreaCode()))) &&
                ((this.number == null && other.getNumber() == null) ||
                        (this.number != null &&
                                this.number.equals(other.getNumber()))) &&
                ((this.phoneNumberType == null && other.getPhoneNumberType() == null) ||
                        (this.phoneNumberType != null &&
                                this.phoneNumberType.equals(other.getPhoneNumberType()))) &&
                ((this.doNotCall == null && other.getDoNotCall() == null) ||
                        (this.doNotCall != null &&
                                this.doNotCall.equals(other.getDoNotCall()))) &&
                this.doNotCallSpecified == other.isDoNotCallSpecified() &&
                ((this.defaultPhoneNumber == null && other.getDefaultPhoneNumber() == null) ||
                        (this.defaultPhoneNumber != null &&
                                this.defaultPhoneNumber.equals(other.getDefaultPhoneNumber()))) &&
                this.defaultPhoneNumberSpecified == other.isDefaultPhoneNumberSpecified();
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
        if (getInternationalCode() != null) {
            _hashCode += getInternationalCode().hashCode();
        }
        if (getAreaCode() != null) {
            _hashCode += getAreaCode().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getPhoneNumberType() != null) {
            _hashCode += getPhoneNumberType().hashCode();
        }
        if (getDoNotCall() != null) {
            _hashCode += getDoNotCall().hashCode();
        }
        _hashCode += (isDoNotCallSpecified() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDefaultPhoneNumber() != null) {
            _hashCode += getDefaultPhoneNumber().hashCode();
        }
        _hashCode += (isDefaultPhoneNumberSpecified() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIPhoneNumberWriteType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIPhoneNumberWriteType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "internationalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "areaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumberType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "phoneNumberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIPhoneNumberType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doNotCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "doNotCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doNotCallSpecified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "doNotCallSpecified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "defaultPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPhoneNumberSpecified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "defaultPhoneNumberSpecified"));
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
