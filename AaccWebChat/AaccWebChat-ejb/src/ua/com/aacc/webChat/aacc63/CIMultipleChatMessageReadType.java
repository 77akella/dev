/**
 * CIMultipleChatMessageReadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIMultipleChatMessageReadType implements java.io.Serializable {
    private CIChatMessageReadType[] listOfChatMessages;

    private boolean isWriting;

    private CIDateTime lastReadTime;

    public CIMultipleChatMessageReadType() {
    }

    public CIMultipleChatMessageReadType(
            CIChatMessageReadType[] listOfChatMessages,
            boolean isWriting,
            CIDateTime lastReadTime) {
        this.listOfChatMessages = listOfChatMessages;
        this.isWriting = isWriting;
        this.lastReadTime = lastReadTime;
    }


    /**
     * Gets the listOfChatMessages value for this CIMultipleChatMessageReadType.
     *
     * @return listOfChatMessages
     */
    public CIChatMessageReadType[] getListOfChatMessages() {
        return listOfChatMessages;
    }


    /**
     * Sets the listOfChatMessages value for this CIMultipleChatMessageReadType.
     *
     * @param listOfChatMessages
     */
    public void setListOfChatMessages(CIChatMessageReadType[] listOfChatMessages) {
        this.listOfChatMessages = listOfChatMessages;
    }


    /**
     * Gets the isWriting value for this CIMultipleChatMessageReadType.
     *
     * @return isWriting
     */
    public boolean isIsWriting() {
        return isWriting;
    }


    /**
     * Sets the isWriting value for this CIMultipleChatMessageReadType.
     *
     * @param isWriting
     */
    public void setIsWriting(boolean isWriting) {
        this.isWriting = isWriting;
    }


    /**
     * Gets the lastReadTime value for this CIMultipleChatMessageReadType.
     *
     * @return lastReadTime
     */
    public CIDateTime getLastReadTime() {
        return lastReadTime;
    }


    /**
     * Sets the lastReadTime value for this CIMultipleChatMessageReadType.
     *
     * @param lastReadTime
     */
    public void setLastReadTime(CIDateTime lastReadTime) {
        this.lastReadTime = lastReadTime;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIMultipleChatMessageReadType)) return false;
        CIMultipleChatMessageReadType other = (CIMultipleChatMessageReadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.listOfChatMessages == null && other.getListOfChatMessages() == null) ||
                        (this.listOfChatMessages != null &&
                                java.util.Arrays.equals(this.listOfChatMessages, other.getListOfChatMessages()))) &&
                this.isWriting == other.isIsWriting() &&
                ((this.lastReadTime == null && other.getLastReadTime() == null) ||
                        (this.lastReadTime != null &&
                                this.lastReadTime.equals(other.getLastReadTime())));
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
        if (getListOfChatMessages() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getListOfChatMessages());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getListOfChatMessages(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsWriting() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLastReadTime() != null) {
            _hashCode += getLastReadTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIMultipleChatMessageReadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIMultipleChatMessageReadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfChatMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "listOfChatMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIChatMessageReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIChatMessageReadType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWriting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "isWriting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "lastReadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime"));
        elemField.setMinOccurs(0);
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
