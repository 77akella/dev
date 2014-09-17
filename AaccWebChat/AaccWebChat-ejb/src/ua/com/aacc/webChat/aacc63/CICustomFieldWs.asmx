<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="ReadCustomField">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadCustomFieldResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadCustomFieldResult" type="s1:CICustomFieldReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateCustomField">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newCustomField" type="s1:CICustomFieldWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateCustomFieldResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateCustomFieldResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateNameResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateText">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newText" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateTextResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateTextResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://datatypes.ci.ccmm.applications.nortel.com">
      <s:complexType name="CICustomFieldReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="text" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="isTextVisible" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CICustomFieldWriteType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="text" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="isTextVisible" type="s:boolean" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ReadCustomFieldSoapIn">
    <wsdl:part name="parameters" element="tns:ReadCustomField" />
  </wsdl:message>
  <wsdl:message name="ReadCustomFieldSoapOut">
    <wsdl:part name="parameters" element="tns:ReadCustomFieldResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateCustomFieldSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateCustomField" />
  </wsdl:message>
  <wsdl:message name="UpdateCustomFieldSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateCustomFieldResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateNameSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateName" />
  </wsdl:message>
  <wsdl:message name="UpdateNameSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateNameResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateTextSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateText" />
  </wsdl:message>
  <wsdl:message name="UpdateTextSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateTextResponse" />
  </wsdl:message>
  <wsdl:portType name="CICustomFieldWsSoap">
    <wsdl:operation name="ReadCustomField">
      <wsdl:input message="tns:ReadCustomFieldSoapIn" />
      <wsdl:output message="tns:ReadCustomFieldSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateCustomField">
      <wsdl:input message="tns:UpdateCustomFieldSoapIn" />
      <wsdl:output message="tns:UpdateCustomFieldSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateName">
      <wsdl:input message="tns:UpdateNameSoapIn" />
      <wsdl:output message="tns:UpdateNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateText">
      <wsdl:input message="tns:UpdateTextSoapIn" />
      <wsdl:output message="tns:UpdateTextSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CICustomFieldWsSoap" type="tns:CICustomFieldWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadCustomField">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadCustomField" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateCustomField">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateCustomField" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateText">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateText" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CICustomFieldWsSoap12" type="tns:CICustomFieldWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadCustomField">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadCustomField" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateCustomField">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateCustomField" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateText">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateText" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CICustomFieldWs">
    <wsdl:port name="CICustomFieldWsSoap" binding="tns:CICustomFieldWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CICustomFieldWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CICustomFieldWsSoap12" binding="tns:CICustomFieldWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CICustomFieldWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>