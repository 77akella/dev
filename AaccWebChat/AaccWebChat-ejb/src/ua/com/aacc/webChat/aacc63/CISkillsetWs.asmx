<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://webservices.ci.ccmm.applications.nortel.com" xmlns:s1="http://datatypes.ci.ccmm.applications.nortel.com" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://webservices.ci.ccmm.applications.nortel.com">
      <s:import namespace="http://datatypes.ci.ccmm.applications.nortel.com" />
      <s:element name="GetAllSkillsets">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllSkillsetsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllSkillsetsResult" type="s1:CIMultipleSkillsetsReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllWebSkillsets">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllWebSkillsetsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllWebSkillsetsResult" type="s1:CIMultipleSkillsetsReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllOutboundSkillsets">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllOutboundSkillsetsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllOutboundSkillsetsResult" type="s1:CIMultipleSkillsetsReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllEmailSkillsets">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllEmailSkillsetsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllEmailSkillsetsResult" type="s1:CIMultipleSkillsetsReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSkillsetByID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSkillsetByIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSkillsetByIDResult" type="s1:CISkillsetReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSkillsetByName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="skillsetName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSkillsetByNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSkillsetByNameResult" type="s1:CISkillsetReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadSkillsetByName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="skillsetName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReadSkillsetByNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReadSkillsetByNameResult" type="s1:CISkillsetReadType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsSkillsetInService">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="skillsetID" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionKey" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsSkillsetInServiceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="IsSkillsetInServiceResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://datatypes.ci.ccmm.applications.nortel.com">
      <s:complexType name="CIMultipleSkillsetsReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="skillsetList" type="s1:ArrayOfCISkillsetReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCISkillsetReadType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CISkillsetReadType" nillable="true" type="s1:CISkillsetReadType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CISkillsetReadType">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:long" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tag" type="s:string" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetAllSkillsetsSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllSkillsets" />
  </wsdl:message>
  <wsdl:message name="GetAllSkillsetsSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllSkillsetsResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllWebSkillsetsSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllWebSkillsets" />
  </wsdl:message>
  <wsdl:message name="GetAllWebSkillsetsSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllWebSkillsetsResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllOutboundSkillsetsSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllOutboundSkillsets" />
  </wsdl:message>
  <wsdl:message name="GetAllOutboundSkillsetsSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllOutboundSkillsetsResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllEmailSkillsetsSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllEmailSkillsets" />
  </wsdl:message>
  <wsdl:message name="GetAllEmailSkillsetsSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllEmailSkillsetsResponse" />
  </wsdl:message>
  <wsdl:message name="GetSkillsetByIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetSkillsetByID" />
  </wsdl:message>
  <wsdl:message name="GetSkillsetByIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetSkillsetByIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetSkillsetByNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetSkillsetByName" />
  </wsdl:message>
  <wsdl:message name="GetSkillsetByNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetSkillsetByNameResponse" />
  </wsdl:message>
  <wsdl:message name="ReadSkillsetByNameSoapIn">
    <wsdl:part name="parameters" element="tns:ReadSkillsetByName" />
  </wsdl:message>
  <wsdl:message name="ReadSkillsetByNameSoapOut">
    <wsdl:part name="parameters" element="tns:ReadSkillsetByNameResponse" />
  </wsdl:message>
  <wsdl:message name="IsSkillsetInServiceSoapIn">
    <wsdl:part name="parameters" element="tns:IsSkillsetInService" />
  </wsdl:message>
  <wsdl:message name="IsSkillsetInServiceSoapOut">
    <wsdl:part name="parameters" element="tns:IsSkillsetInServiceResponse" />
  </wsdl:message>
  <wsdl:portType name="CISkillsetWsSoap">
    <wsdl:operation name="GetAllSkillsets">
      <wsdl:input message="tns:GetAllSkillsetsSoapIn" />
      <wsdl:output message="tns:GetAllSkillsetsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllWebSkillsets">
      <wsdl:input message="tns:GetAllWebSkillsetsSoapIn" />
      <wsdl:output message="tns:GetAllWebSkillsetsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllOutboundSkillsets">
      <wsdl:input message="tns:GetAllOutboundSkillsetsSoapIn" />
      <wsdl:output message="tns:GetAllOutboundSkillsetsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllEmailSkillsets">
      <wsdl:input message="tns:GetAllEmailSkillsetsSoapIn" />
      <wsdl:output message="tns:GetAllEmailSkillsetsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSkillsetByID">
      <wsdl:input message="tns:GetSkillsetByIDSoapIn" />
      <wsdl:output message="tns:GetSkillsetByIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSkillsetByName">
      <wsdl:input message="tns:GetSkillsetByNameSoapIn" />
      <wsdl:output message="tns:GetSkillsetByNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReadSkillsetByName">
      <wsdl:input message="tns:ReadSkillsetByNameSoapIn" />
      <wsdl:output message="tns:ReadSkillsetByNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IsSkillsetInService">
      <wsdl:input message="tns:IsSkillsetInServiceSoapIn" />
      <wsdl:output message="tns:IsSkillsetInServiceSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CISkillsetWsSoap" type="tns:CISkillsetWsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetAllSkillsets">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllSkillsets" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllWebSkillsets">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllWebSkillsets" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllOutboundSkillsets">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllOutboundSkillsets" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllEmailSkillsets">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllEmailSkillsets" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSkillsetByID">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetSkillsetByID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSkillsetByName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetSkillsetByName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadSkillsetByName">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadSkillsetByName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsSkillsetInService">
      <soap:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/IsSkillsetInService" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CISkillsetWsSoap12" type="tns:CISkillsetWsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetAllSkillsets">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllSkillsets" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllWebSkillsets">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllWebSkillsets" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllOutboundSkillsets">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllOutboundSkillsets" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllEmailSkillsets">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetAllEmailSkillsets" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSkillsetByID">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetSkillsetByID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSkillsetByName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/GetSkillsetByName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReadSkillsetByName">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/ReadSkillsetByName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsSkillsetInService">
      <soap12:operation soapAction="http://webservices.ci.ccmm.applications.nortel.com/IsSkillsetInService" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CISkillsetWs">
    <wsdl:port name="CISkillsetWsSoap" binding="tns:CISkillsetWsSoap">
      <soap:address location="http://aacc63/ccmmwebservices/CISkillsetWs.asmx" />
    </wsdl:port>
    <wsdl:port name="CISkillsetWsSoap12" binding="tns:CISkillsetWsSoap12">
      <soap12:address location="http://aacc63/ccmmwebservices/CISkillsetWs.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>