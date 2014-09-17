/**
 * CICustomerReadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CICustomerReadType implements java.io.Serializable {
    private long id;

    private String title;

    private String firstName;

    private String lastName;

    private String username;

    private CIDateTime registerDate;

    private CIAddressReadType[] addressList;

    private ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType[] phoneNumberList;

    private ua.com.aacc.webChat.aacc63.CIEmailAddressReadType[] emailAddressList;

    private ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] customFieldList;

    private CIAddressReadType defaultAddress;

    private ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType defaultPhoneNumber;

    private ua.com.aacc.webChat.aacc63.CIEmailAddressReadType defaultEmailAddress;

    public CICustomerReadType() {
    }

    public CICustomerReadType(
            long id,
            String title,
            String firstName,
            String lastName,
            String username,
            CIDateTime registerDate,
            CIAddressReadType[] addressList,
            ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType[] phoneNumberList,
            ua.com.aacc.webChat.aacc63.CIEmailAddressReadType[] emailAddressList,
            ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] customFieldList,
            CIAddressReadType defaultAddress,
            ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType defaultPhoneNumber,
            ua.com.aacc.webChat.aacc63.CIEmailAddressReadType defaultEmailAddress) {
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.registerDate = registerDate;
        this.addressList = addressList;
        this.phoneNumberList = phoneNumberList;
        this.emailAddressList = emailAddressList;
        this.customFieldList = customFieldList;
        this.defaultAddress = defaultAddress;
        this.defaultPhoneNumber = defaultPhoneNumber;
        this.defaultEmailAddress = defaultEmailAddress;
    }


    /**
     * Gets the id value for this CICustomerReadType.
     *
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this CICustomerReadType.
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the title value for this CICustomerReadType.
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CICustomerReadType.
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the firstName value for this CICustomerReadType.
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this CICustomerReadType.
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this CICustomerReadType.
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this CICustomerReadType.
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the username value for this CICustomerReadType.
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this CICustomerReadType.
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the registerDate value for this CICustomerReadType.
     *
     * @return registerDate
     */
    public CIDateTime getRegisterDate() {
        return registerDate;
    }


    /**
     * Sets the registerDate value for this CICustomerReadType.
     *
     * @param registerDate
     */
    public void setRegisterDate(CIDateTime registerDate) {
        this.registerDate = registerDate;
    }


    /**
     * Gets the addressList value for this CICustomerReadType.
     *
     * @return addressList
     */
    public CIAddressReadType[] getAddressList() {
        return addressList;
    }


    /**
     * Sets the addressList value for this CICustomerReadType.
     *
     * @param addressList
     */
    public void setAddressList(CIAddressReadType[] addressList) {
        this.addressList = addressList;
    }


    /**
     * Gets the phoneNumberList value for this CICustomerReadType.
     *
     * @return phoneNumberList
     */
    public ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType[] getPhoneNumberList() {
        return phoneNumberList;
    }


    /**
     * Sets the phoneNumberList value for this CICustomerReadType.
     *
     * @param phoneNumberList
     */
    public void setPhoneNumberList(ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType[] phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }


    /**
     * Gets the emailAddressList value for this CICustomerReadType.
     *
     * @return emailAddressList
     */
    public ua.com.aacc.webChat.aacc63.CIEmailAddressReadType[] getEmailAddressList() {
        return emailAddressList;
    }


    /**
     * Sets the emailAddressList value for this CICustomerReadType.
     *
     * @param emailAddressList
     */
    public void setEmailAddressList(ua.com.aacc.webChat.aacc63.CIEmailAddressReadType[] emailAddressList) {
        this.emailAddressList = emailAddressList;
    }


    /**
     * Gets the customFieldList value for this CICustomerReadType.
     *
     * @return customFieldList
     */
    public ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CICustomerReadType.
     *
     * @param customFieldList
     */
    public void setCustomFieldList(ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the defaultAddress value for this CICustomerReadType.
     *
     * @return defaultAddress
     */
    public CIAddressReadType getDefaultAddress() {
        return defaultAddress;
    }


    /**
     * Sets the defaultAddress value for this CICustomerReadType.
     *
     * @param defaultAddress
     */
    public void setDefaultAddress(CIAddressReadType defaultAddress) {
        this.defaultAddress = defaultAddress;
    }


    /**
     * Gets the defaultPhoneNumber value for this CICustomerReadType.
     *
     * @return defaultPhoneNumber
     */
    public ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType getDefaultPhoneNumber() {
        return defaultPhoneNumber;
    }


    /**
     * Sets the defaultPhoneNumber value for this CICustomerReadType.
     *
     * @param defaultPhoneNumber
     */
    public void setDefaultPhoneNumber(ua.com.aacc.webChat.aacc63.CIPhoneNumberReadType defaultPhoneNumber) {
        this.defaultPhoneNumber = defaultPhoneNumber;
    }


    /**
     * Gets the defaultEmailAddress value for this CICustomerReadType.
     *
     * @return defaultEmailAddress
     */
    public ua.com.aacc.webChat.aacc63.CIEmailAddressReadType getDefaultEmailAddress() {
        return defaultEmailAddress;
    }


    /**
     * Sets the defaultEmailAddress value for this CICustomerReadType.
     *
     * @param defaultEmailAddress
     */
    public void setDefaultEmailAddress(ua.com.aacc.webChat.aacc63.CIEmailAddressReadType defaultEmailAddress) {
        this.defaultEmailAddress = defaultEmailAddress;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CICustomerReadType)) return false;
        CICustomerReadType other = (CICustomerReadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.id == other.getId() &&
                ((this.title == null && other.getTitle() == null) ||
                        (this.title != null &&
                                this.title.equals(other.getTitle()))) &&
                ((this.firstName == null && other.getFirstName() == null) ||
                        (this.firstName != null &&
                                this.firstName.equals(other.getFirstName()))) &&
                ((this.lastName == null && other.getLastName() == null) ||
                        (this.lastName != null &&
                                this.lastName.equals(other.getLastName()))) &&
                ((this.username == null && other.getUsername() == null) ||
                        (this.username != null &&
                                this.username.equals(other.getUsername()))) &&
                ((this.registerDate == null && other.getRegisterDate() == null) ||
                        (this.registerDate != null &&
                                this.registerDate.equals(other.getRegisterDate()))) &&
                ((this.addressList == null && other.getAddressList() == null) ||
                        (this.addressList != null &&
                                java.util.Arrays.equals(this.addressList, other.getAddressList()))) &&
                ((this.phoneNumberList == null && other.getPhoneNumberList() == null) ||
                        (this.phoneNumberList != null &&
                                java.util.Arrays.equals(this.phoneNumberList, other.getPhoneNumberList()))) &&
                ((this.emailAddressList == null && other.getEmailAddressList() == null) ||
                        (this.emailAddressList != null &&
                                java.util.Arrays.equals(this.emailAddressList, other.getEmailAddressList()))) &&
                ((this.customFieldList == null && other.getCustomFieldList() == null) ||
                        (this.customFieldList != null &&
                                java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList()))) &&
                ((this.defaultAddress == null && other.getDefaultAddress() == null) ||
                        (this.defaultAddress != null &&
                                this.defaultAddress.equals(other.getDefaultAddress()))) &&
                ((this.defaultPhoneNumber == null && other.getDefaultPhoneNumber() == null) ||
                        (this.defaultPhoneNumber != null &&
                                this.defaultPhoneNumber.equals(other.getDefaultPhoneNumber()))) &&
                ((this.defaultEmailAddress == null && other.getDefaultEmailAddress() == null) ||
                        (this.defaultEmailAddress != null &&
                                this.defaultEmailAddress.equals(other.getDefaultEmailAddress())));
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
        _hashCode += new Long(getId()).hashCode();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getRegisterDate() != null) {
            _hashCode += getRegisterDate().hashCode();
        }
        if (getAddressList() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAddressList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAddressList(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhoneNumberList() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPhoneNumberList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPhoneNumberList(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailAddressList() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getEmailAddressList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEmailAddressList(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCustomFieldList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomFieldList(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultAddress() != null) {
            _hashCode += getDefaultAddress().hashCode();
        }
        if (getDefaultPhoneNumber() != null) {
            _hashCode += getDefaultPhoneNumber().hashCode();
        }
        if (getDefaultEmailAddress() != null) {
            _hashCode += getDefaultEmailAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CICustomerReadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICustomerReadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "registerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "addressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIAddressReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIAddressReadType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "phoneNumberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIPhoneNumberReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIPhoneNumberReadType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "emailAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIEmailAddressReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIEmailAddressReadType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICustomFieldReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICustomFieldReadType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "defaultAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIAddressReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "defaultPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIPhoneNumberReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "defaultEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIEmailAddressReadType"));
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
