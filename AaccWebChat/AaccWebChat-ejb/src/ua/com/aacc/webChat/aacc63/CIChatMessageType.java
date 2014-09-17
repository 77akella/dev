/**
 * CIChatMessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIChatMessageType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CIChatMessageType(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _Chat_Message_from_Customer = "Chat_Message_from_Customer";
    public static final String _Chat_Message_from_Agent = "Chat_Message_from_Agent";
    public static final String _Page_Pushed_by_Customer = "Page_Pushed_by_Customer";
    public static final String _Page_Pushed_by_Agent = "Page_Pushed_by_Agent";
    public static final String _Form_Shared_by_Customer = "Form_Shared_by_Customer";
    public static final String _Form_Shared_by_Agent = "Form_Shared_by_Agent";
    public static final String _CallMe_Request_from_Customer = "CallMe_Request_from_Customer";
    public static final String _Page_Previewed_by_Customer = "Page_Previewed_by_Customer";
    public static final String _Page_Previewed_by_Agent = "Page_Previewed_by_Agent";
    public static final String _Session_Disconnected_by_Customer = "Session_Disconnected_by_Customer";
    public static final String _Session_Disconnected_by_Agent = "Session_Disconnected_by_Agent";
    public static final String _Private_Chat_Message_between_Agents = "Private_Chat_Message_between_Agents";
    public static final String _Comfort_Message = "Comfort_Message";
    public static final CIChatMessageType Chat_Message_from_Customer = new CIChatMessageType(_Chat_Message_from_Customer);
    public static final CIChatMessageType Chat_Message_from_Agent = new CIChatMessageType(_Chat_Message_from_Agent);
    public static final CIChatMessageType Page_Pushed_by_Customer = new CIChatMessageType(_Page_Pushed_by_Customer);
    public static final CIChatMessageType Page_Pushed_by_Agent = new CIChatMessageType(_Page_Pushed_by_Agent);
    public static final CIChatMessageType Form_Shared_by_Customer = new CIChatMessageType(_Form_Shared_by_Customer);
    public static final CIChatMessageType Form_Shared_by_Agent = new CIChatMessageType(_Form_Shared_by_Agent);
    public static final CIChatMessageType CallMe_Request_from_Customer = new CIChatMessageType(_CallMe_Request_from_Customer);
    public static final CIChatMessageType Page_Previewed_by_Customer = new CIChatMessageType(_Page_Previewed_by_Customer);
    public static final CIChatMessageType Page_Previewed_by_Agent = new CIChatMessageType(_Page_Previewed_by_Agent);
    public static final CIChatMessageType Session_Disconnected_by_Customer = new CIChatMessageType(_Session_Disconnected_by_Customer);
    public static final CIChatMessageType Session_Disconnected_by_Agent = new CIChatMessageType(_Session_Disconnected_by_Agent);
    public static final CIChatMessageType Private_Chat_Message_between_Agents = new CIChatMessageType(_Private_Chat_Message_between_Agents);
    public static final CIChatMessageType Comfort_Message = new CIChatMessageType(_Comfort_Message);

    public String getValue() {
        return _value_;
    }

    public static CIChatMessageType fromValue(String value)
            throws IllegalArgumentException {
        CIChatMessageType enumeration = (CIChatMessageType)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static CIChatMessageType fromString(String value)
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
            new org.apache.axis.description.TypeDesc(CIChatMessageType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIChatMessageType"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
