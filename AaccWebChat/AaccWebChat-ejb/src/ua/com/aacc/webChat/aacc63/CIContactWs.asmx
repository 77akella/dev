<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="ReadContact">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadContactResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadContactResult" type="s1:CIContactReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseContact">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="closureText" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="closedReasonCodeValue" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="closedReasonCodeSpecified" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseContactResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CloseContactResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllClosedReasonCodes">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllClosedReasonCodesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllClosedReasonCodesResult" type="s1:CIMultipleClosedRCReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetClosedReasonCodeByName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="closedReasonCodeName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetClosedReasonCodeByNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetClosedReasonCodeByNameResult" type="s1:CIClosedRCReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://datatypes.ci.ccmm.applications.nortel.com">
      <s:complexType name="CIContactReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="1" maxOccurs="1" name="customerID" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="originalSubject" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="source" type="s1:CIContactSource" />
          <s:element minOccurs="1" maxOccurs="1" name="status" type="s1:CIContactStatus" />
          <s:element minOccurs="0" maxOccurs="1" name="skillset" type="s1:CISkillsetReadType" />
          <s:element minOccurs="1" maxOccurs="1" name="priority" type="s1:CIContactPriority" />
          <s:element minOccurs="1" maxOccurs="1" name="timezone" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="webOnHoldTag" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="arrivalTime" type="s1:CIDateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="closedTime" type="s1:CIDateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="openTime" type="s1:CIDateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="openDuration" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="MailTo" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MailFrom" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MailCC" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="contactType" type="s1:CIContactType" />
          <s:element minOccurs="0" maxOccurs="1" name="agent" type="s1:CIAgentReadType" />
          <s:element minOccurs="0" maxOccurs="1" name="actionList" type="s1:ArrayOfCIActionReadType" />
          <s:element minOccurs="0" maxOccurs="1" name="customFieldList" type="s1:ArrayOfCICustomFieldReadType" />
        </s:sequence>
      </s:complexType>
      <s:simpleType name="CIContactSource">
        <s:restriction base="s:string">
          <s:enumeration value="NotAvailable" />
          <s:enumeration value="EMail" />
          <s:enumeration value="AgentCreated" />
          <s:enumeration value="Web" />
          <s:enumeration value="Unspecified" />
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="CIContactStatus">
        <s:restriction base="s:string">
          <s:enumeration value="New" />
          <s:enumeration value="Open" />
          <s:enumeration value="Closed" />
          <s:enumeration value="Waiting" />
          <s:enumeration value="Unspecified" />
        </s:restriction>
      </s:simpleType>
      <s:complexType name="CISkillsetReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:simpleType name="CIContactPriority">
        <s:restriction base="s:string">
          <s:enumeration value="Priority_1_Highest" />
          <s:enumeration value="Priority_2_High" />
          <s:enumeration value="Priority_3_Medium_High" />
          <s:enumeration value="Priority_4_Medium_Low" />
          <s:enumeration value="Priority_5_Low" />
          <s:enumeration value="Priority_6_Lowest" />
          <s:enumeration value="Unspecified" />
        </s:restriction>
      </s:simpleType>
      <s:complexType name="CIDateTime">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="milliseconds" type="s:long" />
        </s:sequence>
      </s:complexType>
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
      <s:complexType name="CIAgentReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="firstName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lastName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCIActionReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CIActionReadType" nillable="true" type="s1:CIActionReadType" />
        </s:sequence>
      </s:complexType>
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
      <s:complexType name="CIMultipleClosedRCReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="listOfClosedReasonCodes" type="s1:ArrayOfCIClosedRCReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCIClosedRCReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CIClosedRCReadType" nillable="true" type="s1:CIClosedRCReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIClosedRCReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="numericValue" type="s:long" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ReadContactSoapIn">
    <wsdl:part name="parameters" element="tns:ReadContact" />
  </wsdl:message>
  <wsdl:message name="ReadContactSoapOut">
    <wsdl:part name="parameters" element="tns:ReadContactResponse" />
  </wsdl:message>
  <wsdl:message name="CloseContactSoapIn">
    <wsdl:part name="parameters" element="tns:CloseContact" />
  </wsdl:message>
  <wsdl:message name="CloseContactSoapOut">
    <wsdl:part name="parameters" element="tns:CloseContactResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllClosedReasonCodesSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllClosedReasonCodes" />
  </wsdl:message>
  <wsdl:message name="GetAllClosedReasonCodesSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllClosedReasonCodesResponse" />
  </wsdl:message>
  <wsdl:message name="GetClosedReasonCodeByNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetClosedReasonCodeByName" />
  </wsdl:message>
  <wsdl:message name="GetClosedReasonCodeByNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetClosedReasonCodeByNameResponse" />
  </wsdl:message>
  <wsdl:portType name="CIContactWsSoap">
    <wsdl:operation name="ReadContact">
      <wsdl:input message="tns:ReadContactSoapIn" />
      <wsdl:output message="tns:ReadContactSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CloseContact">
      <wsdl:input message="tns:CloseContactSoapIn" />
      <wsdl:output message="tns:CloseContactSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllClosedReasonCodes">
      <wsdl:input message="tns:GetAllClosedReasonCodesSoapIn" />
      <wsdl:output message="tns:GetAllClosedReasonCodesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetClosedReasonCodeByName">
      <wsdl:input message="tns:GetClosedReasonCodeByNameSoapIn" />
      <wsdl:output message="tns:GetClosedReasonCodeByNameSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CIContactWsSoap" type="tns:CIContactWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadContact">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadContact" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseContact">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CloseContact" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllClosedReasonCodes">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllClosedReasonCodes" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetClosedReasonCodeByName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetClosedReasonCodeByName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CIContactWsSoap12" type="tns:CIContactWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadContact">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadContact" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseContact">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CloseContact" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllClosedReasonCodes">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllClosedReasonCodes" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetClosedReasonCodeByName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetClosedReasonCodeByName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CIContactWs">
    <wsdl:port name="CIContactWsSoap" binding="tns:CIContactWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CIContactWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CIContactWsSoap12" binding="tns:CIContactWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CIContactWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>