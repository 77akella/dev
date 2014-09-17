/**
 * CICallbackStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CICallbackStatus implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CICallbackStatus(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _Unknown = "Unknown";
    public static final String _No_Callback = "No_Callback";
    public static final String _Call_Completed = "Call_Completed";
    public static final String _Call_Not_Answered = "Call_Not_Answered";
    public static final String _Wrong_Telephone_Number = "Wrong_Telephone_Number";
    public static final String _No_Number_Selected = "No_Number_Selected";
    public static final String _Busy = "Busy";
    public static final String _Other = "Other";
    public static final String _EMail_In_Queue = "EMail_In_Queue";
    public static final String _EMail_Sent = "EMail_Sent";
    public static final String _EMail_Undeliverable = "EMail_Undeliverable";
    public static final String _EMail_Not_Sent = "EMail_Not_Sent";
    public static final String _EMail_Address_Not_Provided = "EMail_Address_Not_Provided";
    public static final String _EMail_Received = "EMail_Received";
    public static final String _EMail_Send_In_Progress = "EMail_Send_In_Progress";
    public static final String _Fax_In_Queue = "Fax_In_Queue";
    public static final String _Fax_Sent = "Fax_Sent";
    public static final String _Wrong_Fax_Number = "Wrong_Fax_Number";
    public static final String _Fax_Not_Sent = "Fax_Not_Sent";
    public static final String _Mail_Posted = "Mail_Posted";
    public static final String _Response_Cancelled = "Response_Cancelled";
    public static final String _Web_reply = "Web_reply";
    public static final String _Contact_Closed = "Contact_Closed";
    public static final String _Contact_ReOpened = "Contact_ReOpened";
    public static final String _Contact_Transferred = "Contact_Transferred";
    public static final String _Contact_Barred = "Contact_Barred";
    public static final String _Agent_Note = "Agent_Note";
    public static final String _Chat_Response = "Chat_Response";
    public static final String _Done = "Done";
    public static final String _Created = "Created";
    public static final String _Received = "Received";
    public static final String _Unspecified = "Unspecified";
    public static final CICallbackStatus Unknown = new CICallbackStatus(_Unknown);
    public static final CICallbackStatus No_Callback = new CICallbackStatus(_No_Callback);
    public static final CICallbackStatus Call_Completed = new CICallbackStatus(_Call_Completed);
    public static final CICallbackStatus Call_Not_Answered = new CICallbackStatus(_Call_Not_Answered);
    public static final CICallbackStatus Wrong_Telephone_Number = new CICallbackStatus(_Wrong_Telephone_Number);
    public static final CICallbackStatus No_Number_Selected = new CICallbackStatus(_No_Number_Selected);
    public static final CICallbackStatus Busy = new CICallbackStatus(_Busy);
    public static final CICallbackStatus Other = new CICallbackStatus(_Other);
    public static final CICallbackStatus EMail_In_Queue = new CICallbackStatus(_EMail_In_Queue);
    public static final CICallbackStatus EMail_Sent = new CICallbackStatus(_EMail_Sent);
    public static final CICallbackStatus EMail_Undeliverable = new CICallbackStatus(_EMail_Undeliverable);
    public static final CICallbackStatus EMail_Not_Sent = new CICallbackStatus(_EMail_Not_Sent);
    public static final CICallbackStatus EMail_Address_Not_Provided = new CICallbackStatus(_EMail_Address_Not_Provided);
    public static final CICallbackStatus EMail_Received = new CICallbackStatus(_EMail_Received);
    public static final CICallbackStatus EMail_Send_In_Progress = new CICallbackStatus(_EMail_Send_In_Progress);
    public static final CICallbackStatus Fax_In_Queue = new CICallbackStatus(_Fax_In_Queue);
    public static final CICallbackStatus Fax_Sent = new CICallbackStatus(_Fax_Sent);
    public static final CICallbackStatus Wrong_Fax_Number = new CICallbackStatus(_Wrong_Fax_Number);
    public static final CICallbackStatus Fax_Not_Sent = new CICallbackStatus(_Fax_Not_Sent);
    public static final CICallbackStatus Mail_Posted = new CICallbackStatus(_Mail_Posted);
    public static final CICallbackStatus Response_Cancelled = new CICallbackStatus(_Response_Cancelled);
    public static final CICallbackStatus Web_reply = new CICallbackStatus(_Web_reply);
    public static final CICallbackStatus Contact_Closed = new CICallbackStatus(_Contact_Closed);
    public static final CICallbackStatus Contact_ReOpened = new CICallbackStatus(_Contact_ReOpened);
    public static final CICallbackStatus Contact_Transferred = new CICallbackStatus(_Contact_Transferred);
    public static final CICallbackStatus Contact_Barred = new CICallbackStatus(_Contact_Barred);
    public static final CICallbackStatus Agent_Note = new CICallbackStatus(_Agent_Note);
    public static final CICallbackStatus Chat_Response = new CICallbackStatus(_Chat_Response);
    public static final CICallbackStatus Done = new CICallbackStatus(_Done);
    public static final CICallbackStatus Created = new CICallbackStatus(_Created);
    public static final CICallbackStatus Received = new CICallbackStatus(_Received);
    public static final CICallbackStatus Unspecified = new CICallbackStatus(_Unspecified);

    public String getValue() {
        return _value_;
    }

    public static CICallbackStatus fromValue(String value)
            throws IllegalArgumentException {
        CICallbackStatus enumeration = (CICallbackStatus)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static CICallbackStatus fromString(String value)
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
            new org.apache.axis.description.TypeDesc(CICallbackStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICallbackStatus"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
