<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="ReadEmailAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadEmailAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadEmailAddressResult" type="s1:CIEmailAddressReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateEmailAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newEmailAddress" type="s1:CIEmailAddressWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateEmailAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateEmailAddressResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateDefault">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="1" maxOccurs="1" name="newValue" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateDefaultResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateDefaultResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://datatypes.ci.ccmm.applications.nortel.com">
      <s:complexType name="CIEmailAddressReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="emailAddress" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="defaultEmailAddress" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CIEmailAddressWriteType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="emailAddress" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="defaultEmailAddress" type="s:boolean" />
          <s:element minOccurs="1" maxOccurs="1" name="defaultEmailAddressSpecified" type="s:boolean" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ReadEmailAddressSoapIn">
    <wsdl:part name="parameters" element="tns:ReadEmailAddress" />
  </wsdl:message>
  <wsdl:message name="ReadEmailAddressSoapOut">
    <wsdl:part name="parameters" element="tns:ReadEmailAddressResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateEmailAddressSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateEmailAddress" />
  </wsdl:message>
  <wsdl:message name="UpdateEmailAddressSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateEmailAddressResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateDefaultSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateDefault" />
  </wsdl:message>
  <wsdl:message name="UpdateDefaultSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateDefaultResponse" />
  </wsdl:message>
  <wsdl:portType name="CIEmailAddressWsSoap">
    <wsdl:operation name="ReadEmailAddress">
      <wsdl:input message="tns:ReadEmailAddressSoapIn" />
      <wsdl:output message="tns:ReadEmailAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateEmailAddress">
      <wsdl:input message="tns:UpdateEmailAddressSoapIn" />
      <wsdl:output message="tns:UpdateEmailAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateDefault">
      <wsdl:input message="tns:UpdateDefaultSoapIn" />
      <wsdl:output message="tns:UpdateDefaultSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CIEmailAddressWsSoap" type="tns:CIEmailAddressWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadEmailAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadEmailAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateEmailAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateEmailAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateDefault">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateDefault" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CIEmailAddressWsSoap12" type="tns:CIEmailAddressWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadEmailAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadEmailAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateEmailAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateEmailAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateDefault">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateDefault" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CIEmailAddressWs">
    <wsdl:port name="CIEmailAddressWsSoap" binding="tns:CIEmailAddressWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CIEmailAddressWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CIEmailAddressWsSoap12" binding="tns:CIEmailAddressWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CIEmailAddressWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>