/**
 * CIOnHoldURLReadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIOnHoldURLReadType implements java.io.Serializable {
    private String URL;

    private String description;

    private String tag;

    private long holdTime;

    private long sequence;

    public CIOnHoldURLReadType() {
    }

    public CIOnHoldURLReadType(
            String URL,
            String description,
            String tag,
            long holdTime,
            long sequence) {
        this.URL = URL;
        this.description = description;
        this.tag = tag;
        this.holdTime = holdTime;
        this.sequence = sequence;
    }


    /**
     * Gets the URL value for this CIOnHoldURLReadType.
     *
     * @return URL
     */
    public String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this CIOnHoldURLReadType.
     *
     * @param URL
     */
    public void setURL(String URL) {
        this.URL = URL;
    }


    /**
     * Gets the description value for this CIOnHoldURLReadType.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CIOnHoldURLReadType.
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the tag value for this CIOnHoldURLReadType.
     *
     * @return tag
     */
    public String getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this CIOnHoldURLReadType.
     *
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }


    /**
     * Gets the holdTime value for this CIOnHoldURLReadType.
     *
     * @return holdTime
     */
    public long getHoldTime() {
        return holdTime;
    }


    /**
     * Sets the holdTime value for this CIOnHoldURLReadType.
     *
     * @param holdTime
     */
    public void setHoldTime(long holdTime) {
        this.holdTime = holdTime;
    }


    /**
     * Gets the sequence value for this CIOnHoldURLReadType.
     *
     * @return sequence
     */
    public long getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this CIOnHoldURLReadType.
     *
     * @param sequence
     */
    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIOnHoldURLReadType)) return false;
        CIOnHoldURLReadType other = (CIOnHoldURLReadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.URL == null && other.getURL() == null) ||
                        (this.URL != null &&
                                this.URL.equals(other.getURL()))) &&
                ((this.description == null && other.getDescription() == null) ||
                        (this.description != null &&
                                this.description.equals(other.getDescription()))) &&
                ((this.tag == null && other.getTag() == null) ||
                        (this.tag != null &&
                                this.tag.equals(other.getTag()))) &&
                this.holdTime == other.getHoldTime() &&
                this.sequence == other.getSequence();
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
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        _hashCode += new Long(getHoldTime()).hashCode();
        _hashCode += new Long(getSequence()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIOnHoldURLReadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIOnHoldURLReadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "holdTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
