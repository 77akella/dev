/**
 * CIChatMessageReadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIChatMessageReadType implements java.io.Serializable {
    private String chatMessage;

    private String hiddenMessage;

    private CIDateTime writeTime;

    private CIChatMessageType chatMessageType;

    public CIChatMessageReadType() {
    }

    public CIChatMessageReadType(
            String chatMessage,
            String hiddenMessage,
            CIDateTime writeTime,
            CIChatMessageType chatMessageType) {
        this.chatMessage = chatMessage;
        this.hiddenMessage = hiddenMessage;
        this.writeTime = writeTime;
        this.chatMessageType = chatMessageType;
    }


    /**
     * Gets the chatMessage value for this CIChatMessageReadType.
     *
     * @return chatMessage
     */
    public String getChatMessage() {
        return chatMessage;
    }


    /**
     * Sets the chatMessage value for this CIChatMessageReadType.
     *
     * @param chatMessage
     */
    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }


    /**
     * Gets the hiddenMessage value for this CIChatMessageReadType.
     *
     * @return hiddenMessage
     */
    public String getHiddenMessage() {
        return hiddenMessage;
    }


    /**
     * Sets the hiddenMessage value for this CIChatMessageReadType.
     *
     * @param hiddenMessage
     */
    public void setHiddenMessage(String hiddenMessage) {
        this.hiddenMessage = hiddenMessage;
    }


    /**
     * Gets the writeTime value for this CIChatMessageReadType.
     *
     * @return writeTime
     */
    public CIDateTime getWriteTime() {
        return writeTime;
    }


    /**
     * Sets the writeTime value for this CIChatMessageReadType.
     *
     * @param writeTime
     */
    public void setWriteTime(CIDateTime writeTime) {
        this.writeTime = writeTime;
    }


    /**
     * Gets the chatMessageType value for this CIChatMessageReadType.
     *
     * @return chatMessageType
     */
    public CIChatMessageType getChatMessageType() {
        return chatMessageType;
    }


    /**
     * Sets the chatMessageType value for this CIChatMessageReadType.
     *
     * @param chatMessageType
     */
    public void setChatMessageType(CIChatMessageType chatMessageType) {
        this.chatMessageType = chatMessageType;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIChatMessageReadType)) return false;
        CIChatMessageReadType other = (CIChatMessageReadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.chatMessage == null && other.getChatMessage() == null) ||
                        (this.chatMessage != null &&
                                this.chatMessage.equals(other.getChatMessage()))) &&
                ((this.hiddenMessage == null && other.getHiddenMessage() == null) ||
                        (this.hiddenMessage != null &&
                                this.hiddenMessage.equals(other.getHiddenMessage()))) &&
                ((this.writeTime == null && other.getWriteTime() == null) ||
                        (this.writeTime != null &&
                                this.writeTime.equals(other.getWriteTime()))) &&
                ((this.chatMessageType == null && other.getChatMessageType() == null) ||
                        (this.chatMessageType != null &&
                                this.chatMessageType.equals(other.getChatMessageType())));
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
        if (getChatMessage() != null) {
            _hashCode += getChatMessage().hashCode();
        }
        if (getHiddenMessage() != null) {
            _hashCode += getHiddenMessage().hashCode();
        }
        if (getWriteTime() != null) {
            _hashCode += getWriteTime().hashCode();
        }
        if (getChatMessageType() != null) {
            _hashCode += getChatMessageType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIChatMessageReadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIChatMessageReadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "chatMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hiddenMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "hiddenMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "writeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatMessageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "chatMessageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIChatMessageType"));
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
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
