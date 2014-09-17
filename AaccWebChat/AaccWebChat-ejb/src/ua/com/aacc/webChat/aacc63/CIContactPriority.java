/**
 * CIContactPriority.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIContactPriority implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CIContactPriority(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _Priority_1_Highest = "Priority_1_Highest";
    public static final String _Priority_2_High = "Priority_2_High";
    public static final String _Priority_3_Medium_High = "Priority_3_Medium_High";
    public static final String _Priority_4_Medium_Low = "Priority_4_Medium_Low";
    public static final String _Priority_5_Low = "Priority_5_Low";
    public static final String _Priority_6_Lowest = "Priority_6_Lowest";
    public static final String _Unspecified = "Unspecified";
    public static final CIContactPriority Priority_1_Highest = new CIContactPriority(_Priority_1_Highest);
    public static final CIContactPriority Priority_2_High = new CIContactPriority(_Priority_2_High);
    public static final CIContactPriority Priority_3_Medium_High = new CIContactPriority(_Priority_3_Medium_High);
    public static final CIContactPriority Priority_4_Medium_Low = new CIContactPriority(_Priority_4_Medium_Low);
    public static final CIContactPriority Priority_5_Low = new CIContactPriority(_Priority_5_Low);
    public static final CIContactPriority Priority_6_Lowest = new CIContactPriority(_Priority_6_Lowest);
    public static final CIContactPriority Unspecified = new CIContactPriority(_Unspecified);

    public String getValue() {
        return _value_;
    }

    public static CIContactPriority fromValue(String value)
            throws IllegalArgumentException {
        CIContactPriority enumeration = (CIContactPriority)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static CIContactPriority fromString(String value)
            throws IllegalArgumentException {
        return fromValue(value);
    }

    public boolean equals(Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return _value_;
    }

    public Object readResolve() throws java.io.ObjectStreamException {
        return fromValue(_value_);
    }

    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumSerializer(
                        _javaType, _xmlType);
    }

    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumDeserializer(
                        _javaType, _xmlType);
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIContactPriority.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactPriority"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
