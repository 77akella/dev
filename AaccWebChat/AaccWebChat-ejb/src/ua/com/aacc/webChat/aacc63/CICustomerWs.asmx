<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="RegisterNewCustomer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="newCustomer" type="s1:CICustomerWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="newPhoneNumber" type="s1:CIPhoneNumberWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="newAddress" type="s1:CIAddressWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="newEmailAddress" type="s1:CIEmailAddressWriteType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RegisterNewCustomerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RegisterNewCustomerResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RegisterAnonymousCustomer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="newCustomer" type="s1:CICustomerWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="newPhoneNumber" type="s1:CIPhoneNumberWriteType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RegisterAnonymousCustomerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RegisterAnonymousCustomerResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestTextChat">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newContact" type="s1:CIContactWriteType" />
            <s:element minOccurs="1" maxOccurs="1" name="createAsClosed" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestTextChatResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RequestTextChatResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestScheduledCallback">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newContact" type="s1:CIContactWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestScheduledCallbackResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RequestScheduledCallbackResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestScheduledCallbackUTC">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newContact" type="s1:CIContactWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestScheduledCallbackUTCResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RequestScheduledCallbackUTCResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestImmediateCallback">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newContact" type="s1:CIContactWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RequestImmediateCallbackResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RequestImmediateCallbackResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SendPasswordReminder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="emailAddress" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="skillsetName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SendPasswordReminderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SendPasswordReminderResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadFirstBlockOfContacts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="customerID" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="numOfContacts" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadFirstBlockOfContactsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadFirstBlockOfContactsResult" type="s1:CIContactBlockReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadLastBlockOfContacts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="customerID" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="numOfContacts" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadLastBlockOfContactsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadLastBlockOfContactsResult" type="s1:CIContactBlockReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadPreviousBlockOfContacts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="customerID" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="numOfContacts" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="startContactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadPreviousBlockOfContactsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadPreviousBlockOfContactsResult" type="s1:CIContactBlockReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadNextBlockOfContacts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="customerID" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="numOfContacts" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="startContactID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadNextBlockOfContactsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadNextBlockOfContactsResult" type="s1:CIContactBlockReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNumberOfContactsByTime">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="customerID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="timestamp" type="s1:CIDateTime" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNumberOfContactsByTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetNumberOfContactsByTimeResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadCustomer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadCustomerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadCustomerResult" type="s1:CICustomerReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDefaultAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDefaultAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDefaultAddressResult" type="s1:CIAddressReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDefaultPhoneNumber">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDefaultPhoneNumberResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDefaultPhoneNumberResult" type="s1:CIPhoneNumberReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDefaultEmailAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDefaultEmailAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDefaultEmailAddressResult" type="s1:CIEmailAddressReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByUsername">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByUsernameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCustomerByUsernameResult" type="s1:CICustomerReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByEmailAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="emailAddress" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByEmailAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCustomerByEmailAddressResult" type="s1:CICustomerReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByPhoneNumber">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="intCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="areaCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="number" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByPhoneNumberResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCustomerByPhoneNumberResult" type="s1:CIMultipleCustomerIDReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByFirstName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="firstName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByFirstNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCustomerByFirstNameResult" type="s1:CIMultipleCustomerIDReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByLastName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="lastName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByLastNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCustomerByLastNameResult" type="s1:CIMultipleCustomerIDReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="firstName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="lastName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCustomerByNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCustomerByNameResult" type="s1:CIMultipleCustomerIDReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateTitle">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newTitle" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateTitleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateTitleResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFirstName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newFirstName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateFirstNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateFirstNameResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLastName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newLastName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLastNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateLastNameResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateUsername">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newUsername" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateUsernameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateUsernameResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdatePassword">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="oldPassword" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="newPassword" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdatePasswordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdatePasswordResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateCustomer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newCustomerData" type="s1:CICustomerWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateCustomerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateCustomerResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newAddress" type="s1:CIAddressWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddAddressResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddPhoneNumber">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newPhoneNumber" type="s1:CIPhoneNumberWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddPhoneNumberResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddPhoneNumberResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddEmailAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newEmailAddress" type="s1:CIEmailAddressWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddEmailAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddEmailAddressResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddCustomField">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newCustomField" type="s1:CICustomFieldWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddCustomFieldResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AddCustomFieldResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="addressID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RemoveAddressResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemovePhoneNumber">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="phoneNumberID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemovePhoneNumberResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RemovePhoneNumberResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveEmailAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="emailAddressID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveEmailAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RemoveEmailAddressResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveCustomField">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="custID" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="customFieldID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveCustomFieldResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RemoveCustomFieldResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://datatypes.ci.ccmm.applications.nortel.com">
      <s:complexType name="CICustomerWriteType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="title" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="firstName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lastName" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="password" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIPhoneNumberWriteType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="internationalCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="areaCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="number" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="phoneNumberType" type="s1:CIPhoneNumberType" />
          <s:element minOccurs="0" maxOccurs="1" name="doNotCall" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="doNotCallSpecified" type="s:boolean" />
          <s:element minOccurs="0" maxOccurs="1" name="defaultPhoneNumber" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="defaultPhoneNumberSpecified" type="s:boolean" />
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
      <s:complexType name="CIAddressWriteType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="line1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="line2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="line3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="line4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="line5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="zipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="country" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="defaultAddress" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="defaultAddressSpecified" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIEmailAddressWriteType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="emailAddress" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="defaultEmailAddress" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="defaultEmailAddressSpecified" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIContactWriteType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="skillsetID" type="s:long" />
          <s:element minOccurs="1" maxOccurs="1" name="priority" type="s1:CIContactPriority" />
          <s:element minOccurs="1" maxOccurs="1" name="timezone" type="s:short" />
          <s:element minOccurs="0" maxOccurs="1" name="text" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="textHTML" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="subject" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="callbackTime" nillable="true" type="s1:CIDateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="webOnHoldTag" type="s:string" />
          <s:element minOccurs="0" maxOccurs="unbounded" name="customFields" nillable="true" type="s1:CICustomFieldWriteType" />
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
      <s:complexType name="CICustomFieldWriteType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="text" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="isTextVisible" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIContactBlockReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="customerID" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="contactsList" type="s1:ArrayOfCIContactReadType" />
          <s:element minOccurs="1" maxOccurs="1" name="contactsRemainingBefore" type="s:long" />
          <s:element minOccurs="1" maxOccurs="1" name="contactsRemainingAfter" type="s:long" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCIContactReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CIContactReadType" nillable="true" type="s1:CIContactReadType" />
        </s:sequence>
      </s:complexType>
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
      <s:complexType name="CIMultipleCustomerIDReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="customerIDs" type="s1:ArrayOfLong" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfLong">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="long" type="s:long" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="RegisterNewCustomerSoapIn">
    <wsdl:part name="parameters" element="tns:RegisterNewCustomer" />
  </wsdl:message>
  <wsdl:message name="RegisterNewCustomerSoapOut">
    <wsdl:part name="parameters" element="tns:RegisterNewCustomerResponse" />
  </wsdl:message>
  <wsdl:message name="RegisterAnonymousCustomerSoapIn">
    <wsdl:part name="parameters" element="tns:RegisterAnonymousCustomer" />
  </wsdl:message>
  <wsdl:message name="RegisterAnonymousCustomerSoapOut">
    <wsdl:part name="parameters" element="tns:RegisterAnonymousCustomerResponse" />
  </wsdl:message>
  <wsdl:message name="RequestTextChatSoapIn">
    <wsdl:part name="parameters" element="tns:RequestTextChat" />
  </wsdl:message>
  <wsdl:message name="RequestTextChatSoapOut">
    <wsdl:part name="parameters" element="tns:RequestTextChatResponse" />
  </wsdl:message>
  <wsdl:message name="RequestScheduledCallbackSoapIn">
    <wsdl:part name="parameters" element="tns:RequestScheduledCallback" />
  </wsdl:message>
  <wsdl:message name="RequestScheduledCallbackSoapOut">
    <wsdl:part name="parameters" element="tns:RequestScheduledCallbackResponse" />
  </wsdl:message>
  <wsdl:message name="RequestScheduledCallbackUTCSoapIn">
    <wsdl:part name="parameters" element="tns:RequestScheduledCallbackUTC" />
  </wsdl:message>
  <wsdl:message name="RequestScheduledCallbackUTCSoapOut">
    <wsdl:part name="parameters" element="tns:RequestScheduledCallbackUTCResponse" />
  </wsdl:message>
  <wsdl:message name="RequestImmediateCallbackSoapIn">
    <wsdl:part name="parameters" element="tns:RequestImmediateCallback" />
  </wsdl:message>
  <wsdl:message name="RequestImmediateCallbackSoapOut">
    <wsdl:part name="parameters" element="tns:RequestImmediateCallbackResponse" />
  </wsdl:message>
  <wsdl:message name="SendPasswordReminderSoapIn">
    <wsdl:part name="parameters" element="tns:SendPasswordReminder" />
  </wsdl:message>
  <wsdl:message name="SendPasswordReminderSoapOut">
    <wsdl:part name="parameters" element="tns:SendPasswordReminderResponse" />
  </wsdl:message>
  <wsdl:message name="ReadFirstBlockOfContactsSoapIn">
    <wsdl:part name="parameters" element="tns:ReadFirstBlockOfContacts" />
  </wsdl:message>
  <wsdl:message name="ReadFirstBlockOfContactsSoapOut">
    <wsdl:part name="parameters" element="tns:ReadFirstBlockOfContactsResponse" />
  </wsdl:message>
  <wsdl:message name="ReadLastBlockOfContactsSoapIn">
    <wsdl:part name="parameters" element="tns:ReadLastBlockOfContacts" />
  </wsdl:message>
  <wsdl:message name="ReadLastBlockOfContactsSoapOut">
    <wsdl:part name="parameters" element="tns:ReadLastBlockOfContactsResponse" />
  </wsdl:message>
  <wsdl:message name="ReadPreviousBlockOfContactsSoapIn">
    <wsdl:part name="parameters" element="tns:ReadPreviousBlockOfContacts" />
  </wsdl:message>
  <wsdl:message name="ReadPreviousBlockOfContactsSoapOut">
    <wsdl:part name="parameters" element="tns:ReadPreviousBlockOfContactsResponse" />
  </wsdl:message>
  <wsdl:message name="ReadNextBlockOfContactsSoapIn">
    <wsdl:part name="parameters" element="tns:ReadNextBlockOfContacts" />
  </wsdl:message>
  <wsdl:message name="ReadNextBlockOfContactsSoapOut">
    <wsdl:part name="parameters" element="tns:ReadNextBlockOfContactsResponse" />
  </wsdl:message>
  <wsdl:message name="GetNumberOfContactsByTimeSoapIn">
    <wsdl:part name="parameters" element="tns:GetNumberOfContactsByTime" />
  </wsdl:message>
  <wsdl:message name="GetNumberOfContactsByTimeSoapOut">
    <wsdl:part name="parameters" element="tns:GetNumberOfContactsByTimeResponse" />
  </wsdl:message>
  <wsdl:message name="ReadCustomerSoapIn">
    <wsdl:part name="parameters" element="tns:ReadCustomer" />
  </wsdl:message>
  <wsdl:message name="ReadCustomerSoapOut">
    <wsdl:part name="parameters" element="tns:ReadCustomerResponse" />
  </wsdl:message>
  <wsdl:message name="GetDefaultAddressSoapIn">
    <wsdl:part name="parameters" element="tns:GetDefaultAddress" />
  </wsdl:message>
  <wsdl:message name="GetDefaultAddressSoapOut">
    <wsdl:part name="parameters" element="tns:GetDefaultAddressResponse" />
  </wsdl:message>
  <wsdl:message name="GetDefaultPhoneNumberSoapIn">
    <wsdl:part name="parameters" element="tns:GetDefaultPhoneNumber" />
  </wsdl:message>
  <wsdl:message name="GetDefaultPhoneNumberSoapOut">
    <wsdl:part name="parameters" element="tns:GetDefaultPhoneNumberResponse" />
  </wsdl:message>
  <wsdl:message name="GetDefaultEmailAddressSoapIn">
    <wsdl:part name="parameters" element="tns:GetDefaultEmailAddress" />
  </wsdl:message>
  <wsdl:message name="GetDefaultEmailAddressSoapOut">
    <wsdl:part name="parameters" element="tns:GetDefaultEmailAddressResponse" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByUsernameSoapIn">
    <wsdl:part name="parameters" element="tns:GetCustomerByUsername" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByUsernameSoapOut">
    <wsdl:part name="parameters" element="tns:GetCustomerByUsernameResponse" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByEmailAddressSoapIn">
    <wsdl:part name="parameters" element="tns:GetCustomerByEmailAddress" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByEmailAddressSoapOut">
    <wsdl:part name="parameters" element="tns:GetCustomerByEmailAddressResponse" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByPhoneNumberSoapIn">
    <wsdl:part name="parameters" element="tns:GetCustomerByPhoneNumber" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByPhoneNumberSoapOut">
    <wsdl:part name="parameters" element="tns:GetCustomerByPhoneNumberResponse" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByFirstNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetCustomerByFirstName" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByFirstNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetCustomerByFirstNameResponse" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByLastNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetCustomerByLastName" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByLastNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetCustomerByLastNameResponse" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetCustomerByName" />
  </wsdl:message>
  <wsdl:message name="GetCustomerByNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetCustomerByNameResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateTitleSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateTitle" />
  </wsdl:message>
  <wsdl:message name="UpdateTitleSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateTitleResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateFirstNameSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateFirstName" />
  </wsdl:message>
  <wsdl:message name="UpdateFirstNameSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateFirstNameResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateLastNameSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateLastName" />
  </wsdl:message>
  <wsdl:message name="UpdateLastNameSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateLastNameResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateUsernameSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateUsername" />
  </wsdl:message>
  <wsdl:message name="UpdateUsernameSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateUsernameResponse" />
  </wsdl:message>
  <wsdl:message name="UpdatePasswordSoapIn">
    <wsdl:part name="parameters" element="tns:UpdatePassword" />
  </wsdl:message>
  <wsdl:message name="UpdatePasswordSoapOut">
    <wsdl:part name="parameters" element="tns:UpdatePasswordResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateCustomerSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateCustomer" />
  </wsdl:message>
  <wsdl:message name="UpdateCustomerSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateCustomerResponse" />
  </wsdl:message>
  <wsdl:message name="AddAddressSoapIn">
    <wsdl:part name="parameters" element="tns:AddAddress" />
  </wsdl:message>
  <wsdl:message name="AddAddressSoapOut">
    <wsdl:part name="parameters" element="tns:AddAddressResponse" />
  </wsdl:message>
  <wsdl:message name="AddPhoneNumberSoapIn">
    <wsdl:part name="parameters" element="tns:AddPhoneNumber" />
  </wsdl:message>
  <wsdl:message name="AddPhoneNumberSoapOut">
    <wsdl:part name="parameters" element="tns:AddPhoneNumberResponse" />
  </wsdl:message>
  <wsdl:message name="AddEmailAddressSoapIn">
    <wsdl:part name="parameters" element="tns:AddEmailAddress" />
  </wsdl:message>
  <wsdl:message name="AddEmailAddressSoapOut">
    <wsdl:part name="parameters" element="tns:AddEmailAddressResponse" />
  </wsdl:message>
  <wsdl:message name="AddCustomFieldSoapIn">
    <wsdl:part name="parameters" element="tns:AddCustomField" />
  </wsdl:message>
  <wsdl:message name="AddCustomFieldSoapOut">
    <wsdl:part name="parameters" element="tns:AddCustomFieldResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveAddressSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveAddress" />
  </wsdl:message>
  <wsdl:message name="RemoveAddressSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveAddressResponse" />
  </wsdl:message>
  <wsdl:message name="RemovePhoneNumberSoapIn">
    <wsdl:part name="parameters" element="tns:RemovePhoneNumber" />
  </wsdl:message>
  <wsdl:message name="RemovePhoneNumberSoapOut">
    <wsdl:part name="parameters" element="tns:RemovePhoneNumberResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveEmailAddressSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveEmailAddress" />
  </wsdl:message>
  <wsdl:message name="RemoveEmailAddressSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveEmailAddressResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveCustomFieldSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveCustomField" />
  </wsdl:message>
  <wsdl:message name="RemoveCustomFieldSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveCustomFieldResponse" />
  </wsdl:message>
  <wsdl:portType name="CICustomerWsSoap">
    <wsdl:operation name="RegisterNewCustomer">
      <wsdl:input message="tns:RegisterNewCustomerSoapIn" />
      <wsdl:output message="tns:RegisterNewCustomerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RegisterAnonymousCustomer">
      <wsdl:input message="tns:RegisterAnonymousCustomerSoapIn" />
      <wsdl:output message="tns:RegisterAnonymousCustomerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RequestTextChat">
      <wsdl:input message="tns:RequestTextChatSoapIn" />
      <wsdl:output message="tns:RequestTextChatSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RequestScheduledCallback">
      <wsdl:input message="tns:RequestScheduledCallbackSoapIn" />
      <wsdl:output message="tns:RequestScheduledCallbackSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RequestScheduledCallbackUTC">
      <wsdl:input message="tns:RequestScheduledCallbackUTCSoapIn" />
      <wsdl:output message="tns:RequestScheduledCallbackUTCSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RequestImmediateCallback">
      <wsdl:input message="tns:RequestImmediateCallbackSoapIn" />
      <wsdl:output message="tns:RequestImmediateCallbackSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SendPasswordReminder">
      <wsdl:input message="tns:SendPasswordReminderSoapIn" />
      <wsdl:output message="tns:SendPasswordReminderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReadFirstBlockOfContacts">
      <wsdl:input message="tns:ReadFirstBlockOfContactsSoapIn" />
      <wsdl:output message="tns:ReadFirstBlockOfContactsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReadLastBlockOfContacts">
      <wsdl:input message="tns:ReadLastBlockOfContactsSoapIn" />
      <wsdl:output message="tns:ReadLastBlockOfContactsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReadPreviousBlockOfContacts">
      <wsdl:input message="tns:ReadPreviousBlockOfContactsSoapIn" />
      <wsdl:output message="tns:ReadPreviousBlockOfContactsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReadNextBlockOfContacts">
      <wsdl:input message="tns:ReadNextBlockOfContactsSoapIn" />
      <wsdl:output message="tns:ReadNextBlockOfContactsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNumberOfContactsByTime">
      <wsdl:input message="tns:GetNumberOfContactsByTimeSoapIn" />
      <wsdl:output message="tns:GetNumberOfContactsByTimeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReadCustomer">
      <wsdl:input message="tns:ReadCustomerSoapIn" />
      <wsdl:output message="tns:ReadCustomerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDefaultAddress">
      <wsdl:input message="tns:GetDefaultAddressSoapIn" />
      <wsdl:output message="tns:GetDefaultAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDefaultPhoneNumber">
      <wsdl:input message="tns:GetDefaultPhoneNumberSoapIn" />
      <wsdl:output message="tns:GetDefaultPhoneNumberSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDefaultEmailAddress">
      <wsdl:input message="tns:GetDefaultEmailAddressSoapIn" />
      <wsdl:output message="tns:GetDefaultEmailAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByUsername">
      <wsdl:input message="tns:GetCustomerByUsernameSoapIn" />
      <wsdl:output message="tns:GetCustomerByUsernameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByEmailAddress">
      <wsdl:input message="tns:GetCustomerByEmailAddressSoapIn" />
      <wsdl:output message="tns:GetCustomerByEmailAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByPhoneNumber">
      <wsdl:input message="tns:GetCustomerByPhoneNumberSoapIn" />
      <wsdl:output message="tns:GetCustomerByPhoneNumberSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByFirstName">
      <wsdl:input message="tns:GetCustomerByFirstNameSoapIn" />
      <wsdl:output message="tns:GetCustomerByFirstNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByLastName">
      <wsdl:input message="tns:GetCustomerByLastNameSoapIn" />
      <wsdl:output message="tns:GetCustomerByLastNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByName">
      <wsdl:input message="tns:GetCustomerByNameSoapIn" />
      <wsdl:output message="tns:GetCustomerByNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateTitle">
      <wsdl:input message="tns:UpdateTitleSoapIn" />
      <wsdl:output message="tns:UpdateTitleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateFirstName">
      <wsdl:input message="tns:UpdateFirstNameSoapIn" />
      <wsdl:output message="tns:UpdateFirstNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateLastName">
      <wsdl:input message="tns:UpdateLastNameSoapIn" />
      <wsdl:output message="tns:UpdateLastNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateUsername">
      <wsdl:input message="tns:UpdateUsernameSoapIn" />
      <wsdl:output message="tns:UpdateUsernameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdatePassword">
      <wsdl:input message="tns:UpdatePasswordSoapIn" />
      <wsdl:output message="tns:UpdatePasswordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateCustomer">
      <wsdl:input message="tns:UpdateCustomerSoapIn" />
      <wsdl:output message="tns:UpdateCustomerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddAddress">
      <wsdl:input message="tns:AddAddressSoapIn" />
      <wsdl:output message="tns:AddAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddPhoneNumber">
      <wsdl:input message="tns:AddPhoneNumberSoapIn" />
      <wsdl:output message="tns:AddPhoneNumberSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddEmailAddress">
      <wsdl:input message="tns:AddEmailAddressSoapIn" />
      <wsdl:output message="tns:AddEmailAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddCustomField">
      <wsdl:input message="tns:AddCustomFieldSoapIn" />
      <wsdl:output message="tns:AddCustomFieldSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveAddress">
      <wsdl:input message="tns:RemoveAddressSoapIn" />
      <wsdl:output message="tns:RemoveAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemovePhoneNumber">
      <wsdl:input message="tns:RemovePhoneNumberSoapIn" />
      <wsdl:output message="tns:RemovePhoneNumberSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveEmailAddress">
      <wsdl:input message="tns:RemoveEmailAddressSoapIn" />
      <wsdl:output message="tns:RemoveEmailAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveCustomField">
      <wsdl:input message="tns:RemoveCustomFieldSoapIn" />
      <wsdl:output message="tns:RemoveCustomFieldSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CICustomerWsSoap" type="tns:CICustomerWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="RegisterNewCustomer">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RegisterNewCustomer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegisterAnonymousCustomer">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RegisterAnonymousCustomer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestTextChat">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestTextChat" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestScheduledCallback">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestScheduledCallback" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestScheduledCallbackUTC">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestScheduledCallbackUTC" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestImmediateCallback">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestImmediateCallback" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SendPasswordReminder">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/SendPasswordReminder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadFirstBlockOfContacts">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadFirstBlockOfContacts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadLastBlockOfContacts">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadLastBlockOfContacts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadPreviousBlockOfContacts">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadPreviousBlockOfContacts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadNextBlockOfContacts">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadNextBlockOfContacts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNumberOfContactsByTime">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetNumberOfContactsByTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadCustomer">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadCustomer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDefaultAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetDefaultAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDefaultPhoneNumber">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetDefaultPhoneNumber" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDefaultEmailAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetDefaultEmailAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByUsername">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByUsername" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByEmailAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByEmailAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByPhoneNumber">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByPhoneNumber" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByFirstName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByFirstName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByLastName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByLastName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateTitle">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateTitle" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFirstName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateFirstName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLastName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLastName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateUsername">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateUsername" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdatePassword">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdatePassword" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateCustomer">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateCustomer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AddAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddPhoneNumber">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AddPhoneNumber" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddEmailAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AddEmailAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddCustomField">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AddCustomField" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RemoveAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemovePhoneNumber">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RemovePhoneNumber" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveEmailAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RemoveEmailAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveCustomField">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RemoveCustomField" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CICustomerWsSoap12" type="tns:CICustomerWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="RegisterNewCustomer">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RegisterNewCustomer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RegisterAnonymousCustomer">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RegisterAnonymousCustomer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestTextChat">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestTextChat" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestScheduledCallback">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestScheduledCallback" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestScheduledCallbackUTC">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestScheduledCallbackUTC" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RequestImmediateCallback">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RequestImmediateCallback" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SendPasswordReminder">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/SendPasswordReminder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadFirstBlockOfContacts">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadFirstBlockOfContacts" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadLastBlockOfContacts">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadLastBlockOfContacts" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadPreviousBlockOfContacts">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadPreviousBlockOfContacts" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadNextBlockOfContacts">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadNextBlockOfContacts" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNumberOfContactsByTime">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetNumberOfContactsByTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadCustomer">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadCustomer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDefaultAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetDefaultAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDefaultPhoneNumber">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetDefaultPhoneNumber" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDefaultEmailAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetDefaultEmailAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByUsername">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByUsername" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByEmailAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByEmailAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByPhoneNumber">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByPhoneNumber" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByFirstName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByFirstName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByLastName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByLastName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCustomerByName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetCustomerByName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateTitle">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateTitle" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateFirstName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateFirstName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLastName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLastName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateUsername">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateUsername" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdatePassword">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdatePassword" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateCustomer">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateCustomer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AddAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddPhoneNumber">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AddPhoneNumber" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddEmailAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AddEmailAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddCustomField">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/AddCustomField" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RemoveAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemovePhoneNumber">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RemovePhoneNumber" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveEmailAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RemoveEmailAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveCustomField">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/RemoveCustomField" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CICustomerWs">
    <wsdl:port name="CICustomerWsSoap" binding="tns:CICustomerWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CICustomerWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CICustomerWsSoap12" binding="tns:CICustomerWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CICustomerWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>