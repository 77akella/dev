/**
 * GetStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vp.launchCall;

public class GetStatusResponse  implements java.io.Serializable {
    private int iSIPRequestsProcessed_returned;

    private int iTELRequestsProcessed_returned;

    private int iVXMLRequestsProcessed_returned;

    private int iCCXMLRequestsProcessed_returned;

    private int iCCXMLEventsSent_returned;

    private int maxMPPHops_returned;

    private int minMPPHops_returned;

    private int avgMPPHops_returned;

    private java.util.Calendar serviceStartedDateTime_returned;

    private java.util.Calendar lastRequestDateTime_returned;

    private java.lang.String vpmsSoftwareVersion_returned;

    public GetStatusResponse() {
    }

    public GetStatusResponse(
           int iSIPRequestsProcessed_returned,
           int iTELRequestsProcessed_returned,
           int iVXMLRequestsProcessed_returned,
           int iCCXMLRequestsProcessed_returned,
           int iCCXMLEventsSent_returned,
           int maxMPPHops_returned,
           int minMPPHops_returned,
           int avgMPPHops_returned,
           java.util.Calendar serviceStartedDateTime_returned,
           java.util.Calendar lastRequestDateTime_returned,
           java.lang.String vpmsSoftwareVersion_returned) {
           this.iSIPRequestsProcessed_returned = iSIPRequestsProcessed_returned;
           this.iTELRequestsProcessed_returned = iTELRequestsProcessed_returned;
           this.iVXMLRequestsProcessed_returned = iVXMLRequestsProcessed_returned;
           this.iCCXMLRequestsProcessed_returned = iCCXMLRequestsProcessed_returned;
           this.iCCXMLEventsSent_returned = iCCXMLEventsSent_returned;
           this.maxMPPHops_returned = maxMPPHops_returned;
           this.minMPPHops_returned = minMPPHops_returned;
           this.avgMPPHops_returned = avgMPPHops_returned;
           this.serviceStartedDateTime_returned = serviceStartedDateTime_returned;
           this.lastRequestDateTime_returned = lastRequestDateTime_returned;
           this.vpmsSoftwareVersion_returned = vpmsSoftwareVersion_returned;
    }


    /**
     * Gets the iSIPRequestsProcessed_returned value for this GetStatusResponse.
     *
     * @return iSIPRequestsProcessed_returned
     */
    public int getISIPRequestsProcessed_returned() {
        return iSIPRequestsProcessed_returned;
    }


    /**
     * Sets the iSIPRequestsProcessed_returned value for this GetStatusResponse.
     *
     * @param iSIPRequestsProcessed_returned
     */
    public void setISIPRequestsProcessed_returned(int iSIPRequestsProcessed_returned) {
        this.iSIPRequestsProcessed_returned = iSIPRequestsProcessed_returned;
    }


    /**
     * Gets the iTELRequestsProcessed_returned value for this GetStatusResponse.
     *
     * @return iTELRequestsProcessed_returned
     */
    public int getITELRequestsProcessed_returned() {
        return iTELRequestsProcessed_returned;
    }


    /**
     * Sets the iTELRequestsProcessed_returned value for this GetStatusResponse.
     *
     * @param iTELRequestsProcessed_returned
     */
    public void setITELRequestsProcessed_returned(int iTELRequestsProcessed_returned) {
        this.iTELRequestsProcessed_returned = iTELRequestsProcessed_returned;
    }


    /**
     * Gets the iVXMLRequestsProcessed_returned value for this GetStatusResponse.
     *
     * @return iVXMLRequestsProcessed_returned
     */
    public int getIVXMLRequestsProcessed_returned() {
        return iVXMLRequestsProcessed_returned;
    }


    /**
     * Sets the iVXMLRequestsProcessed_returned value for this GetStatusResponse.
     *
     * @param iVXMLRequestsProcessed_returned
     */
    public void setIVXMLRequestsProcessed_returned(int iVXMLRequestsProcessed_returned) {
        this.iVXMLRequestsProcessed_returned = iVXMLRequestsProcessed_returned;
    }


    /**
     * Gets the iCCXMLRequestsProcessed_returned value for this GetStatusResponse.
     *
     * @return iCCXMLRequestsProcessed_returned
     */
    public int getICCXMLRequestsProcessed_returned() {
        return iCCXMLRequestsProcessed_returned;
    }


    /**
     * Sets the iCCXMLRequestsProcessed_returned value for this GetStatusResponse.
     *
     * @param iCCXMLRequestsProcessed_returned
     */
    public void setICCXMLRequestsProcessed_returned(int iCCXMLRequestsProcessed_returned) {
        this.iCCXMLRequestsProcessed_returned = iCCXMLRequestsProcessed_returned;
    }


    /**
     * Gets the iCCXMLEventsSent_returned value for this GetStatusResponse.
     *
     * @return iCCXMLEventsSent_returned
     */
    public int getICCXMLEventsSent_returned() {
        return iCCXMLEventsSent_returned;
    }


    /**
     * Sets the iCCXMLEventsSent_returned value for this GetStatusResponse.
     *
     * @param iCCXMLEventsSent_returned
     */
    public void setICCXMLEventsSent_returned(int iCCXMLEventsSent_returned) {
        this.iCCXMLEventsSent_returned = iCCXMLEventsSent_returned;
    }


    /**
     * Gets the maxMPPHops_returned value for this GetStatusResponse.
     *
     * @return maxMPPHops_returned
     */
    public int getMaxMPPHops_returned() {
        return maxMPPHops_returned;
    }


    /**
     * Sets the maxMPPHops_returned value for this GetStatusResponse.
     *
     * @param maxMPPHops_returned
     */
    public void setMaxMPPHops_returned(int maxMPPHops_returned) {
        this.maxMPPHops_returned = maxMPPHops_returned;
    }


    /**
     * Gets the minMPPHops_returned value for this GetStatusResponse.
     *
     * @return minMPPHops_returned
     */
    public int getMinMPPHops_returned() {
        return minMPPHops_returned;
    }


    /**
     * Sets the minMPPHops_returned value for this GetStatusResponse.
     *
     * @param minMPPHops_returned
     */
    public void setMinMPPHops_returned(int minMPPHops_returned) {
        this.minMPPHops_returned = minMPPHops_returned;
    }


    /**
     * Gets the avgMPPHops_returned value for this GetStatusResponse.
     *
     * @return avgMPPHops_returned
     */
    public int getAvgMPPHops_returned() {
        return avgMPPHops_returned;
    }


    /**
     * Sets the avgMPPHops_returned value for this GetStatusResponse.
     *
     * @param avgMPPHops_returned
     */
    public void setAvgMPPHops_returned(int avgMPPHops_returned) {
        this.avgMPPHops_returned = avgMPPHops_returned;
    }


    /**
     * Gets the serviceStartedDateTime_returned value for this GetStatusResponse.
     *
     * @return serviceStartedDateTime_returned
     */
    public java.util.Calendar getServiceStartedDateTime_returned() {
        return serviceStartedDateTime_returned;
    }


    /**
     * Sets the serviceStartedDateTime_returned value for this GetStatusResponse.
     *
     * @param serviceStartedDateTime_returned
     */
    public void setServiceStartedDateTime_returned(java.util.Calendar serviceStartedDateTime_returned) {
        this.serviceStartedDateTime_returned = serviceStartedDateTime_returned;
    }


    /**
     * Gets the lastRequestDateTime_returned value for this GetStatusResponse.
     *
     * @return lastRequestDateTime_returned
     */
    public java.util.Calendar getLastRequestDateTime_returned() {
        return lastRequestDateTime_returned;
    }


    /**
     * Sets the lastRequestDateTime_returned value for this GetStatusResponse.
     *
     * @param lastRequestDateTime_returned
     */
    public void setLastRequestDateTime_returned(java.util.Calendar lastRequestDateTime_returned) {
        this.lastRequestDateTime_returned = lastRequestDateTime_returned;
    }


    /**
     * Gets the vpmsSoftwareVersion_returned value for this GetStatusResponse.
     *
     * @return vpmsSoftwareVersion_returned
     */
    public java.lang.String getVpmsSoftwareVersion_returned() {
        return vpmsSoftwareVersion_returned;
    }


    /**
     * Sets the vpmsSoftwareVersion_returned value for this GetStatusResponse.
     *
     * @param vpmsSoftwareVersion_returned
     */
    public void setVpmsSoftwareVersion_returned(java.lang.String vpmsSoftwareVersion_returned) {
        this.vpmsSoftwareVersion_returned = vpmsSoftwareVersion_returned;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStatusResponse)) return false;
        GetStatusResponse other = (GetStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            this.iSIPRequestsProcessed_returned == other.getISIPRequestsProcessed_returned() &&
            this.iTELRequestsProcessed_returned == other.getITELRequestsProcessed_returned() &&
            this.iVXMLRequestsProcessed_returned == other.getIVXMLRequestsProcessed_returned() &&
            this.iCCXMLRequestsProcessed_returned == other.getICCXMLRequestsProcessed_returned() &&
            this.iCCXMLEventsSent_returned == other.getICCXMLEventsSent_returned() &&
            this.maxMPPHops_returned == other.getMaxMPPHops_returned() &&
            this.minMPPHops_returned == other.getMinMPPHops_returned() &&
            this.avgMPPHops_returned == other.getAvgMPPHops_returned() &&
            ((this.serviceStartedDateTime_returned==null && other.getServiceStartedDateTime_returned()==null) ||
             (this.serviceStartedDateTime_returned!=null &&
              this.serviceStartedDateTime_returned.equals(other.getServiceStartedDateTime_returned()))) &&
            ((this.lastRequestDateTime_returned==null && other.getLastRequestDateTime_returned()==null) ||
             (this.lastRequestDateTime_returned!=null &&
              this.lastRequestDateTime_returned.equals(other.getLastRequestDateTime_returned()))) &&
            ((this.vpmsSoftwareVersion_returned==null && other.getVpmsSoftwareVersion_returned()==null) ||
             (this.vpmsSoftwareVersion_returned!=null &&
              this.vpmsSoftwareVersion_returned.equals(other.getVpmsSoftwareVersion_returned())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getISIPRequestsProcessed_returned();
        _hashCode += getITELRequestsProcessed_returned();
        _hashCode += getIVXMLRequestsProcessed_returned();
        _hashCode += getICCXMLRequestsProcessed_returned();
        _hashCode += getICCXMLEventsSent_returned();
        _hashCode += getMaxMPPHops_returned();
        _hashCode += getMinMPPHops_returned();
        _hashCode += getAvgMPPHops_returned();
        if (getServiceStartedDateTime_returned() != null) {
            _hashCode += getServiceStartedDateTime_returned().hashCode();
        }
        if (getLastRequestDateTime_returned() != null) {
            _hashCode += getLastRequestDateTime_returned().hashCode();
        }
        if (getVpmsSoftwareVersion_returned() != null) {
            _hashCode += getVpmsSoftwareVersion_returned().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.vp.avaya.com", ">GetStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISIPRequestsProcessed_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "iSIPRequestsProcessed_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITELRequestsProcessed_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "iTELRequestsProcessed_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVXMLRequestsProcessed_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "iVXMLRequestsProcessed_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCXMLRequestsProcessed_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "iCCXMLRequestsProcessed_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICCXMLEventsSent_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "iCCXMLEventsSent_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMPPHops_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "maxMPPHops_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMPPHops_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "minMPPHops_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avgMPPHops_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "avgMPPHops_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStartedDateTime_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "serviceStartedDateTime_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRequestDateTime_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "lastRequestDateTime_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpmsSoftwareVersion_returned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.vp.avaya.com", "vpmsSoftwareVersion_returned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
