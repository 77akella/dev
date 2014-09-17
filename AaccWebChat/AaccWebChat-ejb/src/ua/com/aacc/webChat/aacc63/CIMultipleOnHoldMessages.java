/**
 * CIMultipleOnHoldMessages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIMultipleOnHoldMessages implements java.io.Serializable {
    private CICOnHoldMessages[] listOfOnHoldMessages;

    public CIMultipleOnHoldMessages() {
    }

    public CIMultipleOnHoldMessages(
            CICOnHoldMessages[] listOfOnHoldMessages) {
        this.listOfOnHoldMessages = listOfOnHoldMessages;
    }


    /**
     * Gets the listOfOnHoldMessages value for this CIMultipleOnHoldMessages.
     *
     * @return listOfOnHoldMessages
     */
    public CICOnHoldMessages[] getListOfOnHoldMessages() {
        return listOfOnHoldMessages;
    }


    /**
     * Sets the listOfOnHoldMessages value for this CIMultipleOnHoldMessages.
     *
     * @param listOfOnHoldMessages
     */
    public void setListOfOnHoldMessages(CICOnHoldMessages[] listOfOnHoldMessages) {
        this.listOfOnHoldMessages = listOfOnHoldMessages;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIMultipleOnHoldMessages)) return false;
        CIMultipleOnHoldMessages other = (CIMultipleOnHoldMessages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.listOfOnHoldMessages == null && other.getListOfOnHoldMessages() == null) ||
                        (this.listOfOnHoldMessages != null &&
                                java.util.Arrays.equals(this.listOfOnHoldMessages, other.getListOfOnHoldMessages())));
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
        if (getListOfOnHoldMessages() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getListOfOnHoldMessages());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getListOfOnHoldMessages(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIMultipleOnHoldMessages.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIMultipleOnHoldMessages"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfOnHoldMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "listOfOnHoldMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICOnHoldMessages"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICOnHoldMessages"));
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
