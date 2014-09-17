<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="CustomerLogin">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="password" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CustomerLoginResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CustomerLoginResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAnonymousSessionKey">
        <s:complexType />
      </s:element>
      <s:element name="GetAnonymousSessionKeyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetAnonymousSessionKeyResult" type="tns:AnonymousLoginResult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="AnonymousLoginResult">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="SessionKey" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="AnonymousID" type="s:long" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetAnonymousCustomerID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="LoginResult" type="tns:AnonymousLoginResult" />
            <s:element minOccurs="0" maxOccurs="1" name="EmailAddress" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="PhoneNumber" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAnonymousCustomerIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetAnonymousCustomerIDResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAndUpdateAnonymousCustomerID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="LoginResult" type="tns:AnonymousLoginResult" />
            <s:element minOccurs="0" maxOccurs="1" name="EmailAddress" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="PhoneNumber" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ThisCustomer" type="s1:CICustomerReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAndUpdateAnonymousCustomerIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetAndUpdateAnonymousCustomerIDResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExtendedCustomerLogin">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="exLoginPassword" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExtendedCustomerLoginResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ExtendedCustomerLoginResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CustomerLogoff">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CustomerLogoffResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CustomerLogoffResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CustomerEndSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="SessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CustomerEndSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CustomerEndSessionResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CustomerLogoffByContactID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="ContactId" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="SessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CustomerLogoffByContactIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CustomerLogoffByContactIDResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdministratorLogin">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="password" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdministratorLoginResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AdministratorLoginResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdministratorLogoff">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdministratorLogoffResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AdministratorLogoffResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsContactCentreClosed">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsContactCentreClosedResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="IsContactCentreClosedResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetServerTime">
        <s:complexType />
      </s:element>
      <s:element name="GetServerTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetServerTimeResult" type="s1:CIDateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetServerUTCTime">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetServerUTCTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetServerUTCTimeResult" type="s1:CIDateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetServerRAWTime">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetServerRAWTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetServerRAWTimeResult" type="s1:CIDateTime" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TimeStampToMilliseconds">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="timestamp" type="s1:CITimeStamp" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TimeStampToMillisecondsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="TimeStampToMillisecondsResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MillisecondsToTimeStamp">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="milliseconds" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="UTCOffsetMins" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="MillisecondsToTimeStampResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="MillisecondsToTimeStampResult" type="s1:CITimeStamp" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTotalQueued">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTotalQueuedResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetTotalQueuedResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTotalQueuedToSkillset">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="skillsetID" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTotalQueuedToSkillsetResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetTotalQueuedToSkillsetResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://datatypes.ci.ccmm.applications.nortel.com">
      <s:complexType name="CICustomerReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="firstName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lastName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="registerDate" type="s1:CIDateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="addressList" type="s1:ArrayOfCIAddressReadType" />
          <s:element minOccurs="0" maxOccurs="1" name="phoneNumberList" type="s1:ArrayOfCIPhoneNumberReadType" />
          <s:element minOccurs="0" maxOccurs="1" name="emailAddressList" type="s1:ArrayOfCIEmailAddressReadType" />
          <s:element minOccurs="0" maxOccurs="1" name="customFieldList" type="s1:ArrayOfCICustomFieldReadType" />
          <s:element minOccurs="0" maxOccurs="1" name="defaultAddress" type="s1:CIAddressReadType" />
          <s:element minOccurs="0" maxOccurs="1" name="defaultPhoneNumber" type="s1:CIPhoneNumberReadType" />
          <s:element minOccurs="0" maxOccurs="1" name="defaultEmailAddress" type="s1:CIEmailAddressReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIDateTime">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="milliseconds" type="s:long" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCIAddressReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CIAddressReadType" nillable="true" type="s1:CIAddressReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIAddressReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="line1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="line2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="line3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="line4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="line5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="zipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="country" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="defaultAddress" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCIPhoneNumberReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CIPhoneNumberReadType" nillable="true" type="s1:CIPhoneNumberReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIPhoneNumberReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="internationalCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="areaCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="number" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="doNotCall" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="defaultPhoneNumber" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="phoneNumberType" type="s1:CIPhoneNumberType" />
        </s:sequence>
      </s:complexType>
      <s:simpleType name="CIPhoneNumberType">
        <s:restriction base="s:string">
          <s:enumeration value="Unknown" />
          <s:enumeration value="Home" />
          <s:enumeration value="Business" />
          <s:enumeration value="Fax" />
          <s:enumeration value="Mobile" />
          <s:enumeration value="Other" />
          <s:enumeration value="Unspecified" />
        </s:restriction>
      </s:simpleType>
      <s:complexType name="ArrayOfCIEmailAddressReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CIEmailAddressReadType" nillable="true" type="s1:CIEmailAddressReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIEmailAddressReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="emailAddress" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="defaultEmailAddress" type="s:boolean" />
        </s:sequence>
      </s:complexType>
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
      <s:complexType name="CITimeStamp">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="day" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="month" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="year" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="hour" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="minute" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="second" type="s:int" />
          <s:element minOccurs="1" maxOccurs="1" name="UTCOffsetMins" type="s:int" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="CustomerLoginSoapIn">
    <wsdl:part name="parameters" element="tns:CustomerLogin" />
  </wsdl:message>
  <wsdl:message name="CustomerLoginSoapOut">
    <wsdl:part name="parameters" element="tns:CustomerLoginResponse" />
  </wsdl:message>
  <wsdl:message name="GetAnonymousSessionKeySoapIn">
    <wsdl:part name="parameters" element="tns:GetAnonymousSessionKey" />
  </wsdl:message>
  <wsdl:message name="GetAnonymousSessionKeySoapOut">
    <wsdl:part name="parameters" element="tns:GetAnonymousSessionKeyResponse" />
  </wsdl:message>
  <wsdl:message name="GetAnonymousCustomerIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetAnonymousCustomerID" />
  </wsdl:message>
  <wsdl:message name="GetAnonymousCustomerIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetAnonymousCustomerIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetAndUpdateAnonymousCustomerIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetAndUpdateAnonymousCustomerID" />
  </wsdl:message>
  <wsdl:message name="GetAndUpdateAnonymousCustomerIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetAndUpdateAnonymousCustomerIDResponse" />
  </wsdl:message>
  <wsdl:message name="ExtendedCustomerLoginSoapIn">
    <wsdl:part name="parameters" element="tns:ExtendedCustomerLogin" />
  </wsdl:message>
  <wsdl:message name="ExtendedCustomerLoginSoapOut">
    <wsdl:part name="parameters" element="tns:ExtendedCustomerLoginResponse" />
  </wsdl:message>
  <wsdl:message name="CustomerLogoffSoapIn">
    <wsdl:part name="parameters" element="tns:CustomerLogoff" />
  </wsdl:message>
  <wsdl:message name="CustomerLogoffSoapOut">
    <wsdl:part name="parameters" element="tns:CustomerLogoffResponse" />
  </wsdl:message>
  <wsdl:message name="CustomerEndSessionSoapIn">
    <wsdl:part name="parameters" element="tns:CustomerEndSession" />
  </wsdl:message>
  <wsdl:message name="CustomerEndSessionSoapOut">
    <wsdl:part name="parameters" element="tns:CustomerEndSessionResponse" />
  </wsdl:message>
  <wsdl:message name="CustomerLogoffByContactIDSoapIn">
    <wsdl:part name="parameters" element="tns:CustomerLogoffByContactID" />
  </wsdl:message>
  <wsdl:message name="CustomerLogoffByContactIDSoapOut">
    <wsdl:part name="parameters" element="tns:CustomerLogoffByContactIDResponse" />
  </wsdl:message>
  <wsdl:message name="AdministratorLoginSoapIn">
    <wsdl:part name="parameters" element="tns:AdministratorLogin" />
  </wsdl:message>
  <wsdl:message name="AdministratorLoginSoapOut">
    <wsdl:part name="parameters" element="tns:AdministratorLoginResponse" />
  </wsdl:message>
  <wsdl:message name="AdministratorLogoffSoapIn">
    <wsdl:part name="parameters" element="tns:AdministratorLogoff" />
  </wsdl:message>
  <wsdl:message name="AdministratorLogoffSoapOut">
    <wsdl:part name="parameters" element="tns:AdministratorLogoffResponse" />
  </wsdl:message>
  <wsdl:message name="IsContactCentreClosedSoapIn">
    <wsdl:part name="parameters" element="tns:IsContactCentreClosed" />
  </wsdl:message>
  <wsdl:message name="IsContactCentreClosedSoapOut">
    <wsdl:part name="parameters" element="tns:IsContactCentreClosedResponse" />
  </wsdl:message>
  <wsdl:message name="GetServerTimeSoapIn">
    <wsdl:part name="parameters" element="tns:GetServerTime" />
  </wsdl:message>
  <wsdl:message name="GetServerTimeSoapOut">
    <wsdl:part name="parameters" element="tns:GetServerTimeResponse" />
  </wsdl:message>
  <wsdl:message name="GetServerUTCTimeSoapIn">
    <wsdl:part name="parameters" element="tns:GetServerUTCTime" />
  </wsdl:message>
  <wsdl:message name="GetServerUTCTimeSoapOut">
    <wsdl:part name="parameters" element="tns:GetServerUTCTimeResponse" />
  </wsdl:message>
  <wsdl:message name="GetServerRAWTimeSoapIn">
    <wsdl:part name="parameters" element="tns:GetServerRAWTime" />
  </wsdl:message>
  <wsdl:message name="GetServerRAWTimeSoapOut">
    <wsdl:part name="parameters" element="tns:GetServerRAWTimeResponse" />
  </wsdl:message>
  <wsdl:message name="TimeStampToMillisecondsSoapIn">
    <wsdl:part name="parameters" element="tns:TimeStampToMilliseconds" />
  </wsdl:message>
  <wsdl:message name="TimeStampToMillisecondsSoapOut">
    <wsdl:part name="parameters" element="tns:TimeStampToMillisecondsResponse" />
  </wsdl:message>
  <wsdl:message name="MillisecondsToTimeStampSoapIn">
    <wsdl:part name="parameters" element="tns:MillisecondsToTimeStamp" />
  </wsdl:message>
  <wsdl:message name="MillisecondsToTimeStampSoapOut">
    <wsdl:part name="parameters" element="tns:MillisecondsToTimeStampResponse" />
  </wsdl:message>
  <wsdl:message name="GetTotalQueuedSoapIn">
    <wsdl:part name="parameters" element="tns:GetTotalQueued" />
  </wsdl:message>
  <wsdl:message name="GetTotalQueuedSoapOut">
    <wsdl:part name="parameters" element="tns:GetTotalQueuedResponse" />
  </wsdl:message>
  <wsdl:message name="GetTotalQueuedToSkillsetSoapIn">
    <wsdl:part name="parameters" element="tns:GetTotalQueuedToSkillset" />
  </wsdl:message>
  <wsdl:message name="GetTotalQueuedToSkillsetSoapOut">
    <wsdl:part name="parameters" element="tns:GetTotalQueuedToSkillsetResponse" />
  </wsdl:message>
  <wsdl:portType name="CIUtilityWsSoap">
    <wsdl:operation name="CustomerLogin">
      <wsdl:input message="tns:CustomerLoginSoapIn" />
      <wsdl:output message="tns:CustomerLoginSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAnonymousSessionKey">
      <wsdl:input message="tns:GetAnonymousSessionKeySoapIn" />
      <wsdl:output message="tns:GetAnonymousSessionKeySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAnonymousCustomerID">
      <wsdl:input message="tns:GetAnonymousCustomerIDSoapIn" />
      <wsdl:output message="tns:GetAnonymousCustomerIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAndUpdateAnonymousCustomerID">
      <wsdl:input message="tns:GetAndUpdateAnonymousCustomerIDSoapIn" />
      <wsdl:output message="tns:GetAndUpdateAnonymousCustomerIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ExtendedCustomerLogin">
      <wsdl:input message="tns:ExtendedCustomerLoginSoapIn" />
      <wsdl:output message="tns:ExtendedCustomerLoginSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CustomerLogoff">
      <wsdl:input message="tns:CustomerLogoffSoapIn" />
      <wsdl:output message="tns:CustomerLogoffSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CustomerEndSession">
      <wsdl:input message="tns:CustomerEndSessionSoapIn" />
      <wsdl:output message="tns:CustomerEndSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CustomerLogoffByContactID">
      <wsdl:input message="tns:CustomerLogoffByContactIDSoapIn" />
      <wsdl:output message="tns:CustomerLogoffByContactIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AdministratorLogin">
      <wsdl:input message="tns:AdministratorLoginSoapIn" />
      <wsdl:output message="tns:AdministratorLoginSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AdministratorLogoff">
      <wsdl:input message="tns:AdministratorLogoffSoapIn" />
      <wsdl:output message="tns:AdministratorLogoffSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IsContactCentreClosed">
      <wsdl:input message="tns:IsContactCentreClosedSoapIn" />
      <wsdl:output message="tns:IsContactCentreClosedSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetServerTime">
      <wsdl:input message="tns:GetServerTimeSoapIn" />
      <wsdl:output message="tns:GetServerTimeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetServerUTCTime">
      <wsdl:input message="tns:GetServerUTCTimeSoapIn" />
      <wsdl:output message="tns:GetServerUTCTimeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetServerRAWTime">
      <wsdl:input message="tns:GetServerRAWTimeSoapIn" />
      <wsdl:output message="tns:GetServerRAWTimeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TimeStampToMilliseconds">
      <wsdl:input message="tns:TimeStampToMillisecondsSoapIn" />
      <wsdl:output message="tns:TimeStampToMillisecondsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="MillisecondsToTimeStamp">
      <wsdl:input message="tns:MillisecondsToTimeStampSoapIn" />
      <wsdl:output message="tns:MillisecondsToTimeStampSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTotalQueued">
      <wsdl:input message="tns:GetTotalQueuedSoapIn" />
      <wsdl:output message="tns:GetTotalQueuedSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTotalQueuedToSkillset">
      <wsdl:input message="tns:GetTotalQueuedToSkillsetSoapIn" />
      <wsdl:output message="tns:GetTotalQueuedToSkillsetSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CIUtilityWsSoap" type="tns:CIUtilityWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CustomerLogin">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CustomerLogin" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAnonymousSessionKey">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAnonymousSessionKey" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAnonymousCustomerID">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAnonymousCustomerID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAndUpdateAnonymousCustomerID">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAndUpdateAnonymousCustomerID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ExtendedCustomerLogin">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ExtendedCustomerLogin" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CustomerLogoff">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CustomerLogoff" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CustomerEndSession">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CustomerEndSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CustomerLogoffByContactID">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CustomerLogoffByContactID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdministratorLogin">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AdministratorLogin" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdministratorLogoff">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AdministratorLogoff" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsContactCentreClosed">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/IsContactCentreClosed" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetServerTime">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetServerTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetServerUTCTime">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetServerUTCTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetServerRAWTime">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetServerRAWTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TimeStampToMilliseconds">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/TimeStampToMilliseconds" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="MillisecondsToTimeStamp">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/MillisecondsToTimeStamp" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTotalQueued">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetTotalQueued" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTotalQueuedToSkillset">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetTotalQueuedToSkillset" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CIUtilityWsSoap12" type="tns:CIUtilityWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CustomerLogin">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CustomerLogin" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAnonymousSessionKey">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAnonymousSessionKey" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAnonymousCustomerID">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAnonymousCustomerID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAndUpdateAnonymousCustomerID">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAndUpdateAnonymousCustomerID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ExtendedCustomerLogin">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ExtendedCustomerLogin" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CustomerLogoff">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CustomerLogoff" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CustomerEndSession">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CustomerEndSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CustomerLogoffByContactID">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/CustomerLogoffByContactID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdministratorLogin">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AdministratorLogin" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdministratorLogoff">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AdministratorLogoff" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsContactCentreClosed">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/IsContactCentreClosed" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetServerTime">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetServerTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetServerUTCTime">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetServerUTCTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetServerRAWTime">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetServerRAWTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TimeStampToMilliseconds">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/TimeStampToMilliseconds" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="MillisecondsToTimeStamp">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/MillisecondsToTimeStamp" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTotalQueued">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetTotalQueued" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTotalQueuedToSkillset">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetTotalQueuedToSkillset" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CIUtilityWs">
    <wsdl:port name="CIUtilityWsSoap" binding="tns:CIUtilityWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CIUtilityWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CIUtilityWsSoap12" binding="tns:CIUtilityWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CIUtilityWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>