<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="ReadPhoneNumber">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadPhoneNumberResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadPhoneNumberResult" type="s1:CIPhoneNumberReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdatePhoneNumber">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newPhoneNumber" type="s1:CIPhoneNumberWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdatePhoneNumberResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdatePhoneNumberResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateAreaCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newAreaCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateAreaCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateAreaCodeResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateInternationalCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newInternationalCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateInternationalCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateInternationalCodeResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateNumber">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newNumber" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateNumberResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateNumberResult" type="s:long" />
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
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ReadPhoneNumberSoapIn">
    <wsdl:part name="parameters" element="tns:ReadPhoneNumber" />
  </wsdl:message>
  <wsdl:message name="ReadPhoneNumberSoapOut">
    <wsdl:part name="parameters" element="tns:ReadPhoneNumberResponse" />
  </wsdl:message>
  <wsdl:message name="UpdatePhoneNumberSoapIn">
    <wsdl:part name="parameters" element="tns:UpdatePhoneNumber" />
  </wsdl:message>
  <wsdl:message name="UpdatePhoneNumberSoapOut">
    <wsdl:part name="parameters" element="tns:UpdatePhoneNumberResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateAreaCodeSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateAreaCode" />
  </wsdl:message>
  <wsdl:message name="UpdateAreaCodeSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateAreaCodeResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateInternationalCodeSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateInternationalCode" />
  </wsdl:message>
  <wsdl:message name="UpdateInternationalCodeSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateInternationalCodeResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateNumberSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateNumber" />
  </wsdl:message>
  <wsdl:message name="UpdateNumberSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateNumberResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateDefaultSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateDefault" />
  </wsdl:message>
  <wsdl:message name="UpdateDefaultSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateDefaultResponse" />
  </wsdl:message>
  <wsdl:portType name="CIPhoneNumberWsSoap">
    <wsdl:operation name="ReadPhoneNumber">
      <wsdl:input message="tns:ReadPhoneNumberSoapIn" />
      <wsdl:output message="tns:ReadPhoneNumberSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdatePhoneNumber">
      <wsdl:input message="tns:UpdatePhoneNumberSoapIn" />
      <wsdl:output message="tns:UpdatePhoneNumberSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateAreaCode">
      <wsdl:input message="tns:UpdateAreaCodeSoapIn" />
      <wsdl:output message="tns:UpdateAreaCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateInternationalCode">
      <wsdl:input message="tns:UpdateInternationalCodeSoapIn" />
      <wsdl:output message="tns:UpdateInternationalCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateNumber">
      <wsdl:input message="tns:UpdateNumberSoapIn" />
      <wsdl:output message="tns:UpdateNumberSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateDefault">
      <wsdl:input message="tns:UpdateDefaultSoapIn" />
      <wsdl:output message="tns:UpdateDefaultSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CIPhoneNumberWsSoap" type="tns:CIPhoneNumberWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadPhoneNumber">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadPhoneNumber" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdatePhoneNumber">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdatePhoneNumber" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateAreaCode">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateAreaCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateInternationalCode">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateInternationalCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateNumber">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateNumber" style="document" />
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
  <wsdl:binding name="CIPhoneNumberWsSoap12" type="tns:CIPhoneNumberWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadPhoneNumber">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadPhoneNumber" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdatePhoneNumber">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdatePhoneNumber" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateAreaCode">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateAreaCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateInternationalCode">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateInternationalCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateNumber">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateNumber" style="document" />
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
  <wsdl:service name="CIPhoneNumberWs">
    <wsdl:port name="CIPhoneNumberWsSoap" binding="tns:CIPhoneNumberWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CIPhoneNumberWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CIPhoneNumberWsSoap12" binding="tns:CIPhoneNumberWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CIPhoneNumberWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>