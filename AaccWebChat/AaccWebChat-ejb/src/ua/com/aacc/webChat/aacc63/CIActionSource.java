/**
 * CIActionSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIActionSource implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CIActionSource(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _Not_Available = "Not_Available";
    public static final String _Automated_Response = "Automated_Response";
    public static final String _EMail_from_Customer = "EMail_from_Customer";
    public static final String _EMail_from_Agent_to_Customer = "EMail_from_Agent_to_Customer";
    public static final String _Phone_from_Customer = "Phone_from_Customer";
    public static final String _Phone_from_Agent_to_Customer = "Phone_from_Agent_to_Customer";
    public static final String _Text_Chat_from_Customer = "Text_Chat_from_Customer";
    public static final String _Text_Chat_from_Agent_to_Customer = "Text_Chat_from_Agent_to_Customer";
    public static final String _Other_from_Customer = "Other_from_Customer";
    public static final String _Other_from_Agent_to_Customer = "Other_from_Agent_to_Customer";
    public static final String _Transfer_to_Agent = "Transfer_to_Agent";
    public static final String _Transfer_to_Skillset = "Transfer_to_Skillset";
    public static final String _Transfer_to_External_Agent = "Transfer_to_External_Agent";
    public static final String _Agent_Created_Contact = "Agent_Created_Contact";
    public static final String _Agent_Created = "Agent_Created";
    public static final String _Callback_Request_from_Customer = "Callback_Request_from_Customer";
    public static final String _Password_Reminder_to_Customer = "Password_Reminder_to_Customer";
    public static final String _Outbound_Voice_Call_Not_Made = "Outbound_Voice_Call_Not_Made";
    public static final String _Supervisor_Closed = "Supervisor_Closed";
    public static final String _Customer_Abandoned_WebOnHold = "Customer_Abandoned_WebOnHold";
    public static final String _Closed_By_Custom_Application = "Closed_By_Custom_Application";
    public static final String _Chat_Text_History = "Chat_Text_History";
    public static final String _Unspecified = "Unspecified";
    public static final CIActionSource Not_Available = new CIActionSource(_Not_Available);
    public static final CIActionSource Automated_Response = new CIActionSource(_Automated_Response);
    public static final CIActionSource EMail_from_Customer = new CIActionSource(_EMail_from_Customer);
    public static final CIActionSource EMail_from_Agent_to_Customer = new CIActionSource(_EMail_from_Agent_to_Customer);
    public static final CIActionSource Phone_from_Customer = new CIActionSource(_Phone_from_Customer);
    public static final CIActionSource Phone_from_Agent_to_Customer = new CIActionSource(_Phone_from_Agent_to_Customer);
    public static final CIActionSource Text_Chat_from_Customer = new CIActionSource(_Text_Chat_from_Customer);
    public static final CIActionSource Text_Chat_from_Agent_to_Customer = new CIActionSource(_Text_Chat_from_Agent_to_Customer);
    public static final CIActionSource Other_from_Customer = new CIActionSource(_Other_from_Customer);
    public static final CIActionSource Other_from_Agent_to_Customer = new CIActionSource(_Other_from_Agent_to_Customer);
    public static final CIActionSource Transfer_to_Agent = new CIActionSource(_Transfer_to_Agent);
    public static final CIActionSource Transfer_to_Skillset = new CIActionSource(_Transfer_to_Skillset);
    public static final CIActionSource Transfer_to_External_Agent = new CIActionSource(_Transfer_to_External_Agent);
    public static final CIActionSource Agent_Created_Contact = new CIActionSource(_Agent_Created_Contact);
    public static final CIActionSource Agent_Created = new CIActionSource(_Agent_Created);
    public static final CIActionSource Callback_Request_from_Customer = new CIActionSource(_Callback_Request_from_Customer);
    public static final CIActionSource Password_Reminder_to_Customer = new CIActionSource(_Password_Reminder_to_Customer);
    public static final CIActionSource Outbound_Voice_Call_Not_Made = new CIActionSource(_Outbound_Voice_Call_Not_Made);
    public static final CIActionSource Supervisor_Closed = new CIActionSource(_Supervisor_Closed);
    public static final CIActionSource Customer_Abandoned_WebOnHold = new CIActionSource(_Customer_Abandoned_WebOnHold);
    public static final CIActionSource Closed_By_Custom_Application = new CIActionSource(_Closed_By_Custom_Application);
    public static final CIActionSource Chat_Text_History = new CIActionSource(_Chat_Text_History);
    public static final CIActionSource Unspecified = new CIActionSource(_Unspecified);

    public String getValue() {
        return _value_;
    }

    public static CIActionSource fromValue(String value)
            throws IllegalArgumentException {
        CIActionSource enumeration = (CIActionSource)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static CIActionSource fromString(String value)
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
            new org.apache.axis.description.TypeDesc(CIActionSource.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIActionSource"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
