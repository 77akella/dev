<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="ReadAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadAddressResult" type="s1:CIAddressReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateAddress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newAddress" type="s1:CIAddressWriteType" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateAddressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateAddressResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine1">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newLine1" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine1Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateLine1Result" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newLine2" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateLine2Result" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine3">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newLine3" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine3Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateLine3Result" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine4">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newLine4" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine4Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateLine4Result" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine5">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newLine5" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateLine5Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateLine5Result" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateCountry">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newCountry" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateCountryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateCountryResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateZipCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="newZipCode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateZipCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="UpdateZipCodeResult" type="s:long" />
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
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ReadAddressSoapIn">
    <wsdl:part name="parameters" element="tns:ReadAddress" />
  </wsdl:message>
  <wsdl:message name="ReadAddressSoapOut">
    <wsdl:part name="parameters" element="tns:ReadAddressResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateAddressSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateAddress" />
  </wsdl:message>
  <wsdl:message name="UpdateAddressSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateAddressResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateLine1SoapIn">
    <wsdl:part name="parameters" element="tns:UpdateLine1" />
  </wsdl:message>
  <wsdl:message name="UpdateLine1SoapOut">
    <wsdl:part name="parameters" element="tns:UpdateLine1Response" />
  </wsdl:message>
  <wsdl:message name="UpdateLine2SoapIn">
    <wsdl:part name="parameters" element="tns:UpdateLine2" />
  </wsdl:message>
  <wsdl:message name="UpdateLine2SoapOut">
    <wsdl:part name="parameters" element="tns:UpdateLine2Response" />
  </wsdl:message>
  <wsdl:message name="UpdateLine3SoapIn">
    <wsdl:part name="parameters" element="tns:UpdateLine3" />
  </wsdl:message>
  <wsdl:message name="UpdateLine3SoapOut">
    <wsdl:part name="parameters" element="tns:UpdateLine3Response" />
  </wsdl:message>
  <wsdl:message name="UpdateLine4SoapIn">
    <wsdl:part name="parameters" element="tns:UpdateLine4" />
  </wsdl:message>
  <wsdl:message name="UpdateLine4SoapOut">
    <wsdl:part name="parameters" element="tns:UpdateLine4Response" />
  </wsdl:message>
  <wsdl:message name="UpdateLine5SoapIn">
    <wsdl:part name="parameters" element="tns:UpdateLine5" />
  </wsdl:message>
  <wsdl:message name="UpdateLine5SoapOut">
    <wsdl:part name="parameters" element="tns:UpdateLine5Response" />
  </wsdl:message>
  <wsdl:message name="UpdateCountrySoapIn">
    <wsdl:part name="parameters" element="tns:UpdateCountry" />
  </wsdl:message>
  <wsdl:message name="UpdateCountrySoapOut">
    <wsdl:part name="parameters" element="tns:UpdateCountryResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateZipCodeSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateZipCode" />
  </wsdl:message>
  <wsdl:message name="UpdateZipCodeSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateZipCodeResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateDefaultSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateDefault" />
  </wsdl:message>
  <wsdl:message name="UpdateDefaultSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateDefaultResponse" />
  </wsdl:message>
  <wsdl:portType name="CIAddressWsSoap">
    <wsdl:operation name="ReadAddress">
      <wsdl:input message="tns:ReadAddressSoapIn" />
      <wsdl:output message="tns:ReadAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateAddress">
      <wsdl:input message="tns:UpdateAddressSoapIn" />
      <wsdl:output message="tns:UpdateAddressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateLine1">
      <wsdl:input message="tns:UpdateLine1SoapIn" />
      <wsdl:output message="tns:UpdateLine1SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateLine2">
      <wsdl:input message="tns:UpdateLine2SoapIn" />
      <wsdl:output message="tns:UpdateLine2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateLine3">
      <wsdl:input message="tns:UpdateLine3SoapIn" />
      <wsdl:output message="tns:UpdateLine3SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateLine4">
      <wsdl:input message="tns:UpdateLine4SoapIn" />
      <wsdl:output message="tns:UpdateLine4SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateLine5">
      <wsdl:input message="tns:UpdateLine5SoapIn" />
      <wsdl:output message="tns:UpdateLine5SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateCountry">
      <wsdl:input message="tns:UpdateCountrySoapIn" />
      <wsdl:output message="tns:UpdateCountrySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateZipCode">
      <wsdl:input message="tns:UpdateZipCodeSoapIn" />
      <wsdl:output message="tns:UpdateZipCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateDefault">
      <wsdl:input message="tns:UpdateDefaultSoapIn" />
      <wsdl:output message="tns:UpdateDefaultSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CIAddressWsSoap" type="tns:CIAddressWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateAddress">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateAddress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine1">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine1" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine2">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine3">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine3" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine4">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine4" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine5">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine5" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateCountry">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateCountry" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateZipCode">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateZipCode" style="document" />
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
  <wsdl:binding name="CIAddressWsSoap12" type="tns:CIAddressWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ReadAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateAddress">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateAddress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine1">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine1" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine2">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine3">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine3" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine4">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine4" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateLine5">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateLine5" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateCountry">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateCountry" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateZipCode">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/UpdateZipCode" style="document" />
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
  <wsdl:service name="CIAddressWs">
    <wsdl:port name="CIAddressWsSoap" binding="tns:CIAddressWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CIAddressWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CIAddressWsSoap12" binding="tns:CIAddressWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CIAddressWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>