<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="ReadAction">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadActionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadActionResult" type="s1:CIActionReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://datatypes.ci.ccmm.applications.nortel.com">
      <s:complexType name="CIActionReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="agent" type="s1:CIAgentReadType" />
          <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="text" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="textHTML" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="callbackTime" type="s1:CIDateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="callbackStatus" type="s1:CICallbackStatus" />
          <s:element minOccurs="0" maxOccurs="1" name="creationTime" type="s1:CIDateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="source" type="s1:CIActionSource" />
          <s:element minOccurs="0" maxOccurs="1" name="mailTo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="mailCC" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="mailBCC" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="comment" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="timeAllocated" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="numberUsed" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="outboundTalkTime" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="outboundDispositionCode" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="actionType" type="s1:CIContactType" />
          <s:element minOccurs="0" maxOccurs="1" name="customFieldList" type="s1:ArrayOfCICustomFieldReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIAgentReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="firstName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lastName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIDateTime">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="milliseconds" type="s:long" />
        </s:sequence>
      </s:complexType>
      <s:simpleType name="CICallbackStatus">
        <s:restriction base="s:string">
          <s:enumeration value="Unknown" />
          <s:enumeration value="No_Callback" />
          <s:enumeration value="Call_Completed" />
          <s:enumeration value="Call_Not_Answered" />
          <s:enumeration value="Wrong_Telephone_Number" />
          <s:enumeration value="No_Number_Selected" />
          <s:enumeration value="Busy" />
          <s:enumeration value="Other" />
          <s:enumeration value="EMail_In_Queue" />
          <s:enumeration value="EMail_Sent" />
          <s:enumeration value="EMail_Undeliverable" />
          <s:enumeration value="EMail_Not_Sent" />
          <s:enumeration value="EMail_Address_Not_Provided" />
          <s:enumeration value="EMail_Received" />
          <s:enumeration value="EMail_Send_In_Progress" />
          <s:enumeration value="Fax_In_Queue" />
          <s:enumeration value="Fax_Sent" />
          <s:enumeration value="Wrong_Fax_Number" />
          <s:enumeration value="Fax_Not_Sent" />
          <s:enumeration value="Mail_Posted" />
          <s:enumeration value="Response_Cancelled" />
          <s:enumeration value="Web_reply" />
          <s:enumeration value="Contact_Closed" />
          <s:enumeration value="Contact_ReOpened" />
          <s:enumeration value="Contact_Transferred" />
          <s:enumeration value="Contact_Barred" />
          <s:enumeration value="Agent_Note" />
          <s:enumeration value="Chat_Response" />
          <s:enumeration value="Done" />
          <s:enumeration value="Created" />
          <s:enumeration value="Received" />
          <s:enumeration value="Unspecified" />
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="CIActionSource">
        <s:restriction base="s:string">
          <s:enumeration value="Not_Available" />
          <s:enumeration value="Automated_Response" />
          <s:enumeration value="EMail_from_Customer" />
          <s:enumeration value="EMail_from_Agent_to_Customer" />
          <s:enumeration value="Phone_from_Customer" />
          <s:enumeration value="Phone_from_Agent_to_Customer" />
          <s:enumeration value="Text_Chat_from_Customer" />
          <s:enumeration value="Text_Chat_from_Agent_to_Customer" />
          <s:enumeration value="Other_from_Customer" />
          <s:enumeration value="Other_from_Agent_to_Customer" />
          <s:enumeration value="Transfer_to_Agent" />
          <s:enumeration value="Transfer_to_Skillset" />
          <s:enumeration value="Transfer_to_External_Agent" />
          <s:enumeration value="Agent_Created_Contact" />
          <s:enumeration value="Agent_Created" />
          <s:enumeration value="Callback_Request_from_Customer" />
          <s:enumeration value="Password_Reminder_to_Customer" />
          <s:enumeration value="Outbound_Voice_Call_Not_Made" />
          <s:enumeration value="Supervisor_Closed" />
          <s:enumeration value="Customer_Abandoned_WebOnHold" />
          <s:enumeration value="Closed_By_Custom_Application" />
          <s:enumeration value="Chat_Text_History" />
          <s:enumeration value="Unspecified" />
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="CIContactType">
        <s:restriction base="s:string">
          <s:enumeration value="Fax" />
          <s:enumeration value="SMS" />
          <s:enumeration value="VoiceMail" />
          <s:enumeration value="WhiteMail" />
          <s:enumeration value="Other" />
          <s:enumeration value="ScheduledCallback" />
          <s:enumeration value="Voice" />
          <s:enumeration value="Email" />
          <s:enumeration value="Web_Communications" />
          <s:enumeration value="Outbound" />
          <s:enumeration value="Video" />
          <s:enumeration value="Unspecified" />
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ArrayOfCICustomFieldReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CICustomFieldReadType" nillable="true" type="s1:CICustomFieldReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CICustomFieldReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="text" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="isTextVisible" type="s:boolean" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ReadActionSoapIn">
    <wsdl:part name="parameters" element="tns:ReadAction" />
  </wsdl:message>
  <wsdl:message name="ReadActionSoapOut">
    <wsdl:part name="parameters" element="tns:ReadActionResponse" />
  </wsdl:message>
  <wsdl:portType name="CIActionWsSoap">
    <wsdl:operation name="ReadAction">
      <wsdl:input message="tns:ReadActionSoapIn" />
      <wsdl:output message="tns:ReadActionSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CIActionWsSoap" type="tns:CIActionWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadAction">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadAction" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CIActionWsSoap12" type="tns:CIActionWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadAction">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadAction" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CIActionWs">
    <wsdl:port name="CIActionWsSoap" binding="tns:CIActionWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CIActionWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CIActionWsSoap12" binding="tns:CIActionWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CIActionWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>