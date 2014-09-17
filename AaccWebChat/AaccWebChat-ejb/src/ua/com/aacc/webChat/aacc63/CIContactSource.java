/**
 * CIContactSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIContactSource implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CIContactSource(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _NotAvailable = "NotAvailable";
    public static final String _EMail = "EMail";
    public static final String _AgentCreated = "AgentCreated";
    public static final String _Web = "Web";
    public static final String _Unspecified = "Unspecified";
    public static final CIContactSource NotAvailable = new CIContactSource(_NotAvailable);
    public static final CIContactSource EMail = new CIContactSource(_EMail);
    public static final CIContactSource AgentCreated = new CIContactSource(_AgentCreated);
    public static final CIContactSource Web = new CIContactSource(_Web);
    public static final CIContactSource Unspecified = new CIContactSource(_Unspecified);

    public String getValue() {
        return _value_;
    }

    public static CIContactSource fromValue(String value)
            throws IllegalArgumentException {
        CIContactSource enumeration = (CIContactSource)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static CIContactSource fromString(String value)
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
            new org.apache.axis.description.TypeDesc(CIContactSource.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactSource"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
