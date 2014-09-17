/**
 * CIPhoneNumberReadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIPhoneNumberReadType implements java.io.Serializable {
    private long id;

    private String internationalCode;

    private String areaCode;

    private String number;

    private boolean doNotCall;

    private boolean defaultPhoneNumber;

    private CIPhoneNumberType phoneNumberType;

    public CIPhoneNumberReadType() {
    }

    public CIPhoneNumberReadType(
            long id,
            String internationalCode,
            String areaCode,
            String number,
            boolean doNotCall,
            boolean defaultPhoneNumber,
            CIPhoneNumberType phoneNumberType) {
        this.id = id;
        this.internationalCode = internationalCode;
        this.areaCode = areaCode;
        this.number = number;
        this.doNotCall = doNotCall;
        this.defaultPhoneNumber = defaultPhoneNumber;
        this.phoneNumberType = phoneNumberType;
    }


    /**
     * Gets the id value for this CIPhoneNumberReadType.
     *
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this CIPhoneNumberReadType.
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the internationalCode value for this CIPhoneNumberReadType.
     *
     * @return internationalCode
     */
    public String getInternationalCode() {
        return internationalCode;
    }


    /**
     * Sets the internationalCode value for this CIPhoneNumberReadType.
     *
     * @param internationalCode
     */
    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode;
    }


    /**
     * Gets the areaCode value for this CIPhoneNumberReadType.
     *
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }


    /**
     * Sets the areaCode value for this CIPhoneNumberReadType.
     *
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }


    /**
     * Gets the number value for this CIPhoneNumberReadType.
     *
     * @return number
     */
    public String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CIPhoneNumberReadType.
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }


    /**
     * Gets the doNotCall value for this CIPhoneNumberReadType.
     *
     * @return doNotCall
     */
    public boolean isDoNotCall() {
        return doNotCall;
    }


    /**
     * Sets the doNotCall value for this CIPhoneNumberReadType.
     *
     * @param doNotCall
     */
    public void setDoNotCall(boolean doNotCall) {
        this.doNotCall = doNotCall;
    }


    /**
     * Gets the defaultPhoneNumber value for this CIPhoneNumberReadType.
     *
     * @return defaultPhoneNumber
     */
    public boolean isDefaultPhoneNumber() {
        return defaultPhoneNumber;
    }


    /**
     * Sets the defaultPhoneNumber value for this CIPhoneNumberReadType.
     *
     * @param defaultPhoneNumber
     */
    public void setDefaultPhoneNumber(boolean defaultPhoneNumber) {
        this.defaultPhoneNumber = defaultPhoneNumber;
    }


    /**
     * Gets the phoneNumberType value for this CIPhoneNumberReadType.
     *
     * @return phoneNumberType
     */
    public CIPhoneNumberType getPhoneNumberType() {
        return phoneNumberType;
    }


    /**
     * Sets the phoneNumberType value for this CIPhoneNumberReadType.
     *
     * @param phoneNumberType
     */
    public void setPhoneNumberType(CIPhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIPhoneNumberReadType)) return false;
        CIPhoneNumberReadType other = (CIPhoneNumberReadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.id == other.getId() &&
                ((this.internationalCode == null && other.getInternationalCode() == null) ||
                        (this.internationalCode != null &&
                                this.internationalCode.equals(other.getInternationalCode()))) &&
                ((this.areaCode == null && other.getAreaCode() == null) ||
                        (this.areaCode != null &&
                                this.areaCode.equals(other.getAreaCode()))) &&
                ((this.number == null && other.getNumber() == null) ||
                        (this.number != null &&
                                this.number.equals(other.getNumber()))) &&
                this.doNotCall == other.isDoNotCall() &&
                this.defaultPhoneNumber == other.isDefaultPhoneNumber() &&
                ((this.phoneNumberType == null && other.getPhoneNumberType() == null) ||
                        (this.phoneNumberType != null &&
                                this.phoneNumberType.equals(other.getPhoneNumberType())));
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
        _hashCode += new Long(getId()).hashCode();
        if (getInternationalCode() != null) {
            _hashCode += getInternationalCode().hashCode();
        }
        if (getAreaCode() != null) {
            _hashCode += getAreaCode().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        _hashCode += (isDoNotCall() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDefaultPhoneNumber() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPhoneNumberType() != null) {
            _hashCode += getPhoneNumberType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIPhoneNumberReadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIPhoneNumberReadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("doNotCall");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "doNotCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "defaultPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumberType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "phoneNumberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIPhoneNumberType"));
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
