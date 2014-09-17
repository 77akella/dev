/**
 * CIContactBlockReadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIContactBlockReadType implements java.io.Serializable {
    private long customerID;

    private CIContactReadType[] contactsList;

    private long contactsRemainingBefore;

    private long contactsRemainingAfter;

    public CIContactBlockReadType() {
    }

    public CIContactBlockReadType(
            long customerID,
            CIContactReadType[] contactsList,
            long contactsRemainingBefore,
            long contactsRemainingAfter) {
        this.customerID = customerID;
        this.contactsList = contactsList;
        this.contactsRemainingBefore = contactsRemainingBefore;
        this.contactsRemainingAfter = contactsRemainingAfter;
    }


    /**
     * Gets the customerID value for this CIContactBlockReadType.
     *
     * @return customerID
     */
    public long getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this CIContactBlockReadType.
     *
     * @param customerID
     */
    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the contactsList value for this CIContactBlockReadType.
     *
     * @return contactsList
     */
    public CIContactReadType[] getContactsList() {
        return contactsList;
    }


    /**
     * Sets the contactsList value for this CIContactBlockReadType.
     *
     * @param contactsList
     */
    public void setContactsList(CIContactReadType[] contactsList) {
        this.contactsList = contactsList;
    }


    /**
     * Gets the contactsRemainingBefore value for this CIContactBlockReadType.
     *
     * @return contactsRemainingBefore
     */
    public long getContactsRemainingBefore() {
        return contactsRemainingBefore;
    }


    /**
     * Sets the contactsRemainingBefore value for this CIContactBlockReadType.
     *
     * @param contactsRemainingBefore
     */
    public void setContactsRemainingBefore(long contactsRemainingBefore) {
        this.contactsRemainingBefore = contactsRemainingBefore;
    }


    /**
     * Gets the contactsRemainingAfter value for this CIContactBlockReadType.
     *
     * @return contactsRemainingAfter
     */
    public long getContactsRemainingAfter() {
        return contactsRemainingAfter;
    }


    /**
     * Sets the contactsRemainingAfter value for this CIContactBlockReadType.
     *
     * @param contactsRemainingAfter
     */
    public void setContactsRemainingAfter(long contactsRemainingAfter) {
        this.contactsRemainingAfter = contactsRemainingAfter;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIContactBlockReadType)) return false;
        CIContactBlockReadType other = (CIContactBlockReadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.customerID == other.getCustomerID() &&
                ((this.contactsList == null && other.getContactsList() == null) ||
                        (this.contactsList != null &&
                                java.util.Arrays.equals(this.contactsList, other.getContactsList()))) &&
                this.contactsRemainingBefore == other.getContactsRemainingBefore() &&
                this.contactsRemainingAfter == other.getContactsRemainingAfter();
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
        _hashCode += new Long(getCustomerID()).hashCode();
        if (getContactsList() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getContactsList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContactsList(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getContactsRemainingBefore()).hashCode();
        _hashCode += new Long(getContactsRemainingAfter()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIContactBlockReadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactBlockReadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "customerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactsList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "contactsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactReadType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactsRemainingBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "contactsRemainingBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactsRemainingAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "contactsRemainingAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
