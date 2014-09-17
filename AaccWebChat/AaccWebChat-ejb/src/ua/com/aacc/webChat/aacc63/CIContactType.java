/**
 * CIContactType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIContactType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CIContactType(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _Fax = "Fax";
    public static final String _SMS = "SMS";
    public static final String _VoiceMail = "VoiceMail";
    public static final String _WhiteMail = "WhiteMail";
    public static final String _Other = "Other";
    public static final String _ScheduledCallback = "ScheduledCallback";
    public static final String _Voice = "Voice";
    public static final String _Email = "Email";
    public static final String _Web_Communications = "Web_Communications";
    public static final String _Outbound = "Outbound";
    public static final String _Video = "Video";
    public static final String _Unspecified = "Unspecified";
    public static final CIContactType Fax = new CIContactType(_Fax);
    public static final CIContactType SMS = new CIContactType(_SMS);
    public static final CIContactType VoiceMail = new CIContactType(_VoiceMail);
    public static final CIContactType WhiteMail = new CIContactType(_WhiteMail);
    public static final CIContactType Other = new CIContactType(_Other);
    public static final CIContactType ScheduledCallback = new CIContactType(_ScheduledCallback);
    public static final CIContactType Voice = new CIContactType(_Voice);
    public static final CIContactType Email = new CIContactType(_Email);
    public static final CIContactType Web_Communications = new CIContactType(_Web_Communications);
    public static final CIContactType Outbound = new CIContactType(_Outbound);
    public static final CIContactType Video = new CIContactType(_Video);
    public static final CIContactType Unspecified = new CIContactType(_Unspecified);

    public String getValue() {
        return _value_;
    }

    public static CIContactType fromValue(String value)
            throws IllegalArgumentException {
        CIContactType enumeration = (CIContactType)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static CIContactType fromString(String value)
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
            new org.apache.axis.description.TypeDesc(CIContactType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactType"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
