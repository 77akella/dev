/**
 * CIContactWriteType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIContactWriteType implements java.io.Serializable {
    private long skillsetID;

    private CIContactPriority priority;

    private short timezone;

    private String text;

    private String textHTML;

    private String subject;

    private CIDateTime callbackTime;

    private String webOnHoldTag;

    private ua.com.aacc.webChat.aacc63.CICustomFieldWriteType[] customFields;

    public CIContactWriteType() {
    }

    public CIContactWriteType(
            long skillsetID,
            CIContactPriority priority,
            short timezone,
            String text,
            String textHTML,
            String subject,
            CIDateTime callbackTime,
            String webOnHoldTag,
            ua.com.aacc.webChat.aacc63.CICustomFieldWriteType[] customFields) {
        this.skillsetID = skillsetID;
        this.priority = priority;
        this.timezone = timezone;
        this.text = text;
        this.textHTML = textHTML;
        this.subject = subject;
        this.callbackTime = callbackTime;
        this.webOnHoldTag = webOnHoldTag;
        this.customFields = customFields;
    }


    /**
     * Gets the skillsetID value for this CIContactWriteType.
     *
     * @return skillsetID
     */
    public long getSkillsetID() {
        return skillsetID;
    }


    /**
     * Sets the skillsetID value for this CIContactWriteType.
     *
     * @param skillsetID
     */
    public void setSkillsetID(long skillsetID) {
        this.skillsetID = skillsetID;
    }


    /**
     * Gets the priority value for this CIContactWriteType.
     *
     * @return priority
     */
    public CIContactPriority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CIContactWriteType.
     *
     * @param priority
     */
    public void setPriority(CIContactPriority priority) {
        this.priority = priority;
    }


    /**
     * Gets the timezone value for this CIContactWriteType.
     *
     * @return timezone
     */
    public short getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this CIContactWriteType.
     *
     * @param timezone
     */
    public void setTimezone(short timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the text value for this CIContactWriteType.
     *
     * @return text
     */
    public String getText() {
        return text;
    }


    /**
     * Sets the text value for this CIContactWriteType.
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }


    /**
     * Gets the textHTML value for this CIContactWriteType.
     *
     * @return textHTML
     */
    public String getTextHTML() {
        return textHTML;
    }


    /**
     * Sets the textHTML value for this CIContactWriteType.
     *
     * @param textHTML
     */
    public void setTextHTML(String textHTML) {
        this.textHTML = textHTML;
    }


    /**
     * Gets the subject value for this CIContactWriteType.
     *
     * @return subject
     */
    public String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this CIContactWriteType.
     *
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }


    /**
     * Gets the callbackTime value for this CIContactWriteType.
     *
     * @return callbackTime
     */
    public CIDateTime getCallbackTime() {
        return callbackTime;
    }


    /**
     * Sets the callbackTime value for this CIContactWriteType.
     *
     * @param callbackTime
     */
    public void setCallbackTime(CIDateTime callbackTime) {
        this.callbackTime = callbackTime;
    }


    /**
     * Gets the webOnHoldTag value for this CIContactWriteType.
     *
     * @return webOnHoldTag
     */
    public String getWebOnHoldTag() {
        return webOnHoldTag;
    }


    /**
     * Sets the webOnHoldTag value for this CIContactWriteType.
     *
     * @param webOnHoldTag
     */
    public void setWebOnHoldTag(String webOnHoldTag) {
        this.webOnHoldTag = webOnHoldTag;
    }


    /**
     * Gets the customFields value for this CIContactWriteType.
     *
     * @return customFields
     */
    public ua.com.aacc.webChat.aacc63.CICustomFieldWriteType[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this CIContactWriteType.
     *
     * @param customFields
     */
    public void setCustomFields(ua.com.aacc.webChat.aacc63.CICustomFieldWriteType[] customFields) {
        this.customFields = customFields;
    }

    public ua.com.aacc.webChat.aacc63.CICustomFieldWriteType getCustomFields(int i) {
        return this.customFields[i];
    }

    public void setCustomFields(int i, ua.com.aacc.webChat.aacc63.CICustomFieldWriteType _value) {
        this.customFields[i] = _value;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIContactWriteType)) return false;
        CIContactWriteType other = (CIContactWriteType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.skillsetID == other.getSkillsetID() &&
                ((this.priority == null && other.getPriority() == null) ||
                        (this.priority != null &&
                                this.priority.equals(other.getPriority()))) &&
                this.timezone == other.getTimezone() &&
                ((this.text == null && other.getText() == null) ||
                        (this.text != null &&
                                this.text.equals(other.getText()))) &&
                ((this.textHTML == null && other.getTextHTML() == null) ||
                        (this.textHTML != null &&
                                this.textHTML.equals(other.getTextHTML()))) &&
                ((this.subject == null && other.getSubject() == null) ||
                        (this.subject != null &&
                                this.subject.equals(other.getSubject()))) &&
                ((this.callbackTime == null && other.getCallbackTime() == null) ||
                        (this.callbackTime != null &&
                                this.callbackTime.equals(other.getCallbackTime()))) &&
                ((this.webOnHoldTag == null && other.getWebOnHoldTag() == null) ||
                        (this.webOnHoldTag != null &&
                                this.webOnHoldTag.equals(other.getWebOnHoldTag()))) &&
                ((this.customFields == null && other.getCustomFields() == null) ||
                        (this.customFields != null &&
                                java.util.Arrays.equals(this.customFields, other.getCustomFields())));
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
        _hashCode += new Long(getSkillsetID()).hashCode();
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        _hashCode += getTimezone();
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getTextHTML() != null) {
            _hashCode += getTextHTML().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getCallbackTime() != null) {
            _hashCode += getCallbackTime().hashCode();
        }
        if (getWebOnHoldTag() != null) {
            _hashCode += getWebOnHoldTag().hashCode();
        }
        if (getCustomFields() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCustomFields());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCustomFields(), i);
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
            new org.apache.axis.description.TypeDesc(CIContactWriteType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactWriteType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skillsetID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "skillsetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactPriority"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textHTML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "textHTML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "callbackTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webOnHoldTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "webOnHoldTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "customFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICustomFieldWriteType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
