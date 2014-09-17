/**
 * CIAddressReadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIAddressReadType implements java.io.Serializable {
    private long id;

    private String line1;

    private String line2;

    private String line3;

    private String line4;

    private String line5;

    private String zipcode;

    private String country;

    private boolean defaultAddress;

    public CIAddressReadType() {
    }

    public CIAddressReadType(
            long id,
            String line1,
            String line2,
            String line3,
            String line4,
            String line5,
            String zipcode,
            String country,
            boolean defaultAddress) {
        this.id = id;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
        this.line5 = line5;
        this.zipcode = zipcode;
        this.country = country;
        this.defaultAddress = defaultAddress;
    }


    /**
     * Gets the id value for this CIAddressReadType.
     *
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this CIAddressReadType.
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the line1 value for this CIAddressReadType.
     *
     * @return line1
     */
    public String getLine1() {
        return line1;
    }


    /**
     * Sets the line1 value for this CIAddressReadType.
     *
     * @param line1
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }


    /**
     * Gets the line2 value for this CIAddressReadType.
     *
     * @return line2
     */
    public String getLine2() {
        return line2;
    }


    /**
     * Sets the line2 value for this CIAddressReadType.
     *
     * @param line2
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }


    /**
     * Gets the line3 value for this CIAddressReadType.
     *
     * @return line3
     */
    public String getLine3() {
        return line3;
    }


    /**
     * Sets the line3 value for this CIAddressReadType.
     *
     * @param line3
     */
    public void setLine3(String line3) {
        this.line3 = line3;
    }


    /**
     * Gets the line4 value for this CIAddressReadType.
     *
     * @return line4
     */
    public String getLine4() {
        return line4;
    }


    /**
     * Sets the line4 value for this CIAddressReadType.
     *
     * @param line4
     */
    public void setLine4(String line4) {
        this.line4 = line4;
    }


    /**
     * Gets the line5 value for this CIAddressReadType.
     *
     * @return line5
     */
    public String getLine5() {
        return line5;
    }


    /**
     * Sets the line5 value for this CIAddressReadType.
     *
     * @param line5
     */
    public void setLine5(String line5) {
        this.line5 = line5;
    }


    /**
     * Gets the zipcode value for this CIAddressReadType.
     *
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this CIAddressReadType.
     *
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the country value for this CIAddressReadType.
     *
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this CIAddressReadType.
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the defaultAddress value for this CIAddressReadType.
     *
     * @return defaultAddress
     */
    public boolean isDefaultAddress() {
        return defaultAddress;
    }


    /**
     * Sets the defaultAddress value for this CIAddressReadType.
     *
     * @param defaultAddress
     */
    public void setDefaultAddress(boolean defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIAddressReadType)) return false;
        CIAddressReadType other = (CIAddressReadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.id == other.getId() &&
                ((this.line1 == null && other.getLine1() == null) ||
                        (this.line1 != null &&
                                this.line1.equals(other.getLine1()))) &&
                ((this.line2 == null && other.getLine2() == null) ||
                        (this.line2 != null &&
                                this.line2.equals(other.getLine2()))) &&
                ((this.line3 == null && other.getLine3() == null) ||
                        (this.line3 != null &&
                                this.line3.equals(other.getLine3()))) &&
                ((this.line4 == null && other.getLine4() == null) ||
                        (this.line4 != null &&
                                this.line4.equals(other.getLine4()))) &&
                ((this.line5 == null && other.getLine5() == null) ||
                        (this.line5 != null &&
                                this.line5.equals(other.getLine5()))) &&
                ((this.zipcode == null && other.getZipcode() == null) ||
                        (this.zipcode != null &&
                                this.zipcode.equals(other.getZipcode()))) &&
                ((this.country == null && other.getCountry() == null) ||
                        (this.country != null &&
                                this.country.equals(other.getCountry()))) &&
                this.defaultAddress == other.isDefaultAddress();
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
        if (getLine1() != null) {
            _hashCode += getLine1().hashCode();
        }
        if (getLine2() != null) {
            _hashCode += getLine2().hashCode();
        }
        if (getLine3() != null) {
            _hashCode += getLine3().hashCode();
        }
        if (getLine4() != null) {
            _hashCode += getLine4().hashCode();
        }
        if (getLine5() != null) {
            _hashCode += getLine5().hashCode();
        }
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += (isDefaultAddress() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIAddressReadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIAddressReadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "line1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "line2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "line3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "line4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "line5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "zipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "defaultAddress"));
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
