<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="CreateWebCommsSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateWebCommsSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CreateWebCommsSessionResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="WriteChatMessage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="message" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="hiddenMessage" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="chatMessageType" type="s1:CIChatMessageType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="WriteChatMessageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="WriteChatMessageResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadChatMessage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="lastReadTime" type="s1:CIDateTime" />
            <s:element minOccurs="1" maxOccurs="1" name="isWriting" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadChatMessageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadChatMessageResult" type="s1:CIMultipleChatMessageReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestChatHistory">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="email" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestChatHistoryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RequestChatHistoryResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetWebOnHoldURLs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="tagName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetWebOnHoldURLsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetWebOnHoldURLsResult" type="s1:CIMultipleOnHoldURLReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateAliveTime">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateAliveTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UpdateAliveTimeResult" type="s1:CIDateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateAliveTimeAndUpdateIsTyping">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="isTyping" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateAliveTimeAndUpdateIsTypingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UpdateAliveTimeAndUpdateIsTypingResult" type="s1:CIDateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AbandonQueuingWebCommsContact">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="closureComment" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AbandonQueuingWebCommsContactResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AbandonQueuingWebCommsContactResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AbandonQueuingWCContact">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="closureComment" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="closedReasonCodeValue" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="closedReasonCodeSpecified" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AbandonQueuingWCContactResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AbandonQueuingWCContactResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerTextChatLabel">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerTextChatLabelResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCustomerTextChatLabelResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerTextChatName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerTextChatNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCustomerTextChatNameResult" type="s1:CICustomerChatNameReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTrunkAccessCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTrunkAccessCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTrunkAccessCodeResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetContactOnHoldMessages">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="contact_id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetContactOnHoldMessagesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetContactOnHoldMessagesResult" type="s1:CIMultipleOnHoldMessages" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://datatypes.ci.ccmm.applications.nortel.com">
      <s:simpleType name="CIChatMessageType">
        <s:restriction base="s:string">
          <s:enumeration value="Chat_Message_from_Customer" />
          <s:enumeration value="Chat_Message_from_Agent" />
          <s:enumeration value="Page_Pushed_by_Customer" />
          <s:enumeration value="Page_Pushed_by_Agent" />
          <s:enumeration value="Form_Shared_by_Customer" />
          <s:enumeration value="Form_Shared_by_Agent" />
          <s:enumeration value="CallMe_Request_from_Customer" />
          <s:enumeration value="Page_Previewed_by_Customer" />
          <s:enumeration value="Page_Previewed_by_Agent" />
          <s:enumeration value="Session_Disconnected_by_Customer" />
          <s:enumeration value="Session_Disconnected_by_Agent" />
          <s:enumeration value="Private_Chat_Message_between_Agents" />
          <s:enumeration value="Comfort_Message" />
        </s:restriction>
      </s:simpleType>
      <s:complexType name="CIDateTime">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="milliseconds" type="s:long" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIMultipleChatMessageReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="listOfChatMessages" type="s1:ArrayOfCIChatMessageReadType" />
          <s:element minOccurs="1" maxOccurs="1" name="isWriting" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="lastReadTime" type="s1:CIDateTime" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCIChatMessageReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CIChatMessageReadType" nillable="true" type="s1:CIChatMessageReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIChatMessageReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="chatMessage" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="hiddenMessage" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="writeTime" type="s1:CIDateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="chatMessageType" type="s1:CIChatMessageType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIMultipleOnHoldURLReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="URLList" type="s1:ArrayOfCIOnHoldURLReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCIOnHoldURLReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CIOnHoldURLReadType" nillable="true" type="s1:CIOnHoldURLReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIOnHoldURLReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="URL" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="description" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="holdTime" type="s:long" />
          <s:element minOccurs="1" maxOccurs="1" name="sequence" type="s:long" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CICustomerChatNameReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="firstName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lastName" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIMultipleOnHoldMessages">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="listOfOnHoldMessages" type="s1:ArrayOfCICOnHoldMessages" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCICOnHoldMessages">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CICOnHoldMessages" nillable="true" type="s1:CICOnHoldMessages" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CICOnHoldMessages">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Message" type="s:string" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="CreateWebCommsSessionSoapIn">
    <wsdl:part name="parameters" element="tns:CreateWebCommsSession" />
  </wsdl:message>
  <wsdl:message name="CreateWebCommsSessionSoapOut">
    <wsdl:part name="parameters" element="tns:CreateWebCommsSessionResponse" />
  </wsdl:message>
  <wsdl:message name="WriteChatMessageSoapIn">
    <wsdl:part name="parameters" element="tns:WriteChatMessage" />
  </wsdl:message>
  <wsdl:message name="WriteChatMessageSoapOut">
    <wsdl:part name="parameters" element="tns:WriteChatMessageResponse" />
  </wsdl:message>
  <wsdl:message name="ReadChatMessageSoapIn">
    <wsdl:part name="parameters" element="tns:ReadChatMessage" />
  </wsdl:message>
  <wsdl:message name="ReadChatMessageSoapOut">
    <wsdl:part name="parameters" element="tns:ReadChatMessageResponse" />
  </wsdl:message>
  <wsdl:message name="RequestChatHistorySoapIn">
    <wsdl:part name="parameters" element="tns:RequestChatHistory" />
  </wsdl:message>
  <wsdl:message name="RequestChatHistorySoapOut">
    <wsdl:part name="parameters" element="tns:RequestChatHistoryResponse" />
  </wsdl:message>
  <wsdl:message name="GetWebOnHoldURLsSoapIn">
    <wsdl:part name="parameters" element="tns:GetWebOnHoldURLs" />
  </wsdl:message>
  <wsdl:message name="GetWebOnHoldURLsSoapOut">
    <wsdl:part name="parameters" element="tns:GetWebOnHoldURLsResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateAliveTimeSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateAliveTime" />
  </wsdl:message>
  <wsdl:message name="UpdateAliveTimeSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateAliveTimeResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateAliveTimeAndUpdateIsTypingSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateAliveTimeAndUpdateIsTyping" />
  </wsdl:message>
  <wsdl:message name="UpdateAliveTimeAndUpdateIsTypingSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateAliveTimeAndUpdateIsTypingResponse" />
  </wsdl:message>
  <wsdl:message name="AbandonQueuingWebCommsContactSoapIn">
    <wsdl:part name="parameters" element="tns:AbandonQueuingWebCommsContact" />
  </wsdl:message>
  <wsdl:message name="AbandonQueuingWebCommsContactSoapOut">
    <wsdl:part name="parameters" element="tns:AbandonQueuingWebCommsContactResponse" />
  </wsdl:message>
  <wsdl:message name="AbandonQueuingWCContactSoapIn">
    <wsdl:part name="parameters" element="tns:AbandonQueuingWCContact" />
  </wsdl:message>
  <wsdl:message name="AbandonQueuingWCContactSoapOut">
    <wsdl:part name="parameters" element="tns:AbandonQueuingWCContactResponse" />
  </wsdl:message>
  <wsdl:message name="GetCustomerTextChatLabelSoapIn">
    <wsdl:part name="parameters" element="tns:GetCustomerTextChatLabel" />
  </wsdl:message>
  <wsdl:message name="GetCustomerTextChatLabelSoapOut">
    <wsdl:part name="parameters" element="tns:GetCustomerTextChatLabelResponse" />
  </wsdl:message>
  <wsdl:message name="GetCustomerTextChatNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetCustomerTextChatName" />
  </wsdl:message>
  <wsdl:message name="GetCustomerTextChatNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetCustomerTextChatNameResponse" />
  </wsdl:message>
  <wsdl:message name="GetTrunkAccessCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetTrunkAccessCode" />
  </wsdl:message>
  <wsdl:message name="GetTrunkAccessCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetTrunkAccessCodeResponse" />
  </wsdl:message>
  <wsdl:message name="GetContactOnHoldMessagesSoapIn">
    <wsdl:part name="parameters" element="tns:GetContactOnHoldMessages" />
  </wsdl:message>
  <wsdl:message name="GetContactOnHoldMessagesSoapOut">
    <wsdl:part name="parameters" element="tns:GetContactOnHoldMessagesResponse" />
  </wsdl:message>
  <wsdl:portType name="CIWebCommsWsSoap">
    <wsdl:operation name="CreateWebCommsSession">
      <wsdl:input message="tns:CreateWebCommsSessionSoapIn" />
      <wsdl:output message="tns:CreateWebCommsSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="WriteChatMessage">
      <wsdl:input message="tns:WriteChatMessageSoapIn" />
      <wsdl:output message="tns:WriteChatMessageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReadChatMessage">
      <wsdl:input message="tns:ReadChatMessageSoapIn" />
      <wsdl:output message="tns:ReadChatMessageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RequestChatHistory">
      <wsdl:input message="tns:RequestChatHistorySoapIn" />
      <wsdl:output message="tns:RequestChatHistorySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetWebOnHoldURLs">
      <wsdl:input message="tns:GetWebOnHoldURLsSoapIn" />
      <wsdl:output message="tns:GetWebOnHoldURLsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateAliveTime">
      <wsdl:input message="tns:UpdateAliveTimeSoapIn" />
      <wsdl:output message="tns:UpdateAliveTimeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateAliveTimeAndUpdateIsTyping">
      <wsdl:input message="tns:UpdateAliveTimeAndUpdateIsTypingSoapIn" />
      <wsdl:output message="tns:UpdateAliveTimeAndUpdateIsTypingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AbandonQueuingWebCommsContact">
      <wsdl:input message="tns:AbandonQueuingWebCommsContactSoapIn" />
      <wsdl:output message="tns:AbandonQueuingWebCommsContactSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AbandonQueuingWCContact">
      <wsdl:input message="tns:AbandonQueuingWCContactSoapIn" />
      <wsdl:output message="tns:AbandonQueuingWCContactSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCustomerTextChatLabel">
      <wsdl:input message="tns:GetCustomerTextChatLabelSoapIn" />
      <wsdl:output message="tns:GetCustomerTextChatLabelSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCustomerTextChatName">
      <wsdl:input message="tns:GetCustomerTextChatNameSoapIn" />
      <wsdl:output message="tns:GetCustomerTextChatNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTrunkAccessCode">
      <wsdl:input message="tns:GetTrunkAccessCodeSoapIn" />
      <wsdl:output message="tns:GetTrunkAccessCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetContactOnHoldMessages">
      <wsdl:input message="tns:GetContactOnHoldMessagesSoapIn" />
      <wsdl:output message="tns:GetContactOnHoldMessagesSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CIWebCommsWsSoap" type="tns:CIWebCommsWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CreateWebCommsSession">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CreateWebCommsSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteChatMessage">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/WriteChatMessage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadChatMessage">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadChatMessage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestChatHistory">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestChatHistory" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetWebOnHoldURLs">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetWebOnHoldURLs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateAliveTime">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateAliveTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateAliveTimeAndUpdateIsTyping">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateAliveTimeAndUpdateIsTyping" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AbandonQueuingWebCommsContact">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AbandonQueuingWebCommsContact" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AbandonQueuingWCContact">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AbandonQueuingWCContact" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerTextChatLabel">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerTextChatLabel" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerTextChatName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerTextChatName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTrunkAccessCode">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetTrunkAccessCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetContactOnHoldMessages">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetContactOnHoldMessages" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CIWebCommsWsSoap12" type="tns:CIWebCommsWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CreateWebCommsSession">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CreateWebCommsSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteChatMessage">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/WriteChatMessage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadChatMessage">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadChatMessage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestChatHistory">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestChatHistory" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetWebOnHoldURLs">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetWebOnHoldURLs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateAliveTime">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateAliveTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateAliveTimeAndUpdateIsTyping">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateAliveTimeAndUpdateIsTyping" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AbandonQueuingWebCommsContact">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AbandonQueuingWebCommsContact" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AbandonQueuingWCContact">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AbandonQueuingWCContact" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerTextChatLabel">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerTextChatLabel" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerTextChatName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerTextChatName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTrunkAccessCode">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetTrunkAccessCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetContactOnHoldMessages">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetContactOnHoldMessages" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CIWebCommsWs">
    <wsdl:port name="CIWebCommsWsSoap" binding="tns:CIWebCommsWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CIWebCommsWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CIWebCommsWsSoap12" binding="tns:CIWebCommsWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CIWebCommsWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>