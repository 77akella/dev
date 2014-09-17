/**
 * CIActionReadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIActionReadType implements java.io.Serializable {
    private long id;

    private long contactID;

    private CIAgentReadType agent;

    private String subject;

    private String text;

    private String textHTML;

    private CIDateTime callbackTime;

    private ua.com.aacc.webChat.aacc63.CICallbackStatus callbackStatus;

    private CIDateTime creationTime;

    private CIActionSource source;

    private String mailTo;

    private String mailCC;

    private String mailBCC;

    private String comment;

    private long timeAllocated;

    private String numberUsed;

    private long outboundTalkTime;

    private String outboundDispositionCode;

    private CIContactType actionType;

    private ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] customFieldList;

    public CIActionReadType() {
    }

    public CIActionReadType(
            long id,
            long contactID,
            CIAgentReadType agent,
            String subject,
            String text,
            String textHTML,
            CIDateTime callbackTime,
            ua.com.aacc.webChat.aacc63.CICallbackStatus callbackStatus,
            CIDateTime creationTime,
            CIActionSource source,
            String mailTo,
            String mailCC,
            String mailBCC,
            String comment,
            long timeAllocated,
            String numberUsed,
            long outboundTalkTime,
            String outboundDispositionCode,
            CIContactType actionType,
            ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] customFieldList) {
        this.id = id;
        this.contactID = contactID;
        this.agent = agent;
        this.subject = subject;
        this.text = text;
        this.textHTML = textHTML;
        this.callbackTime = callbackTime;
        this.callbackStatus = callbackStatus;
        this.creationTime = creationTime;
        this.source = source;
        this.mailTo = mailTo;
        this.mailCC = mailCC;
        this.mailBCC = mailBCC;
        this.comment = comment;
        this.timeAllocated = timeAllocated;
        this.numberUsed = numberUsed;
        this.outboundTalkTime = outboundTalkTime;
        this.outboundDispositionCode = outboundDispositionCode;
        this.actionType = actionType;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the id value for this CIActionReadType.
     *
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this CIActionReadType.
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the contactID value for this CIActionReadType.
     *
     * @return contactID
     */
    public long getContactID() {
        return contactID;
    }


    /**
     * Sets the contactID value for this CIActionReadType.
     *
     * @param contactID
     */
    public void setContactID(long contactID) {
        this.contactID = contactID;
    }


    /**
     * Gets the agent value for this CIActionReadType.
     *
     * @return agent
     */
    public CIAgentReadType getAgent() {
        return agent;
    }


    /**
     * Sets the agent value for this CIActionReadType.
     *
     * @param agent
     */
    public void setAgent(CIAgentReadType agent) {
        this.agent = agent;
    }


    /**
     * Gets the subject value for this CIActionReadType.
     *
     * @return subject
     */
    public String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this CIActionReadType.
     *
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }


    /**
     * Gets the text value for this CIActionReadType.
     *
     * @return text
     */
    public String getText() {
        return text;
    }


    /**
     * Sets the text value for this CIActionReadType.
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }


    /**
     * Gets the textHTML value for this CIActionReadType.
     *
     * @return textHTML
     */
    public String getTextHTML() {
        return textHTML;
    }


    /**
     * Sets the textHTML value for this CIActionReadType.
     *
     * @param textHTML
     */
    public void setTextHTML(String textHTML) {
        this.textHTML = textHTML;
    }


    /**
     * Gets the callbackTime value for this CIActionReadType.
     *
     * @return callbackTime
     */
    public CIDateTime getCallbackTime() {
        return callbackTime;
    }


    /**
     * Sets the callbackTime value for this CIActionReadType.
     *
     * @param callbackTime
     */
    public void setCallbackTime(CIDateTime callbackTime) {
        this.callbackTime = callbackTime;
    }


    /**
     * Gets the callbackStatus value for this CIActionReadType.
     *
     * @return callbackStatus
     */
    public ua.com.aacc.webChat.aacc63.CICallbackStatus getCallbackStatus() {
        return callbackStatus;
    }


    /**
     * Sets the callbackStatus value for this CIActionReadType.
     *
     * @param callbackStatus
     */
    public void setCallbackStatus(ua.com.aacc.webChat.aacc63.CICallbackStatus callbackStatus) {
        this.callbackStatus = callbackStatus;
    }


    /**
     * Gets the creationTime value for this CIActionReadType.
     *
     * @return creationTime
     */
    public CIDateTime getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this CIActionReadType.
     *
     * @param creationTime
     */
    public void setCreationTime(CIDateTime creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the source value for this CIActionReadType.
     *
     * @return source
     */
    public CIActionSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this CIActionReadType.
     *
     * @param source
     */
    public void setSource(CIActionSource source) {
        this.source = source;
    }


    /**
     * Gets the mailTo value for this CIActionReadType.
     *
     * @return mailTo
     */
    public String getMailTo() {
        return mailTo;
    }


    /**
     * Sets the mailTo value for this CIActionReadType.
     *
     * @param mailTo
     */
    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }


    /**
     * Gets the mailCC value for this CIActionReadType.
     *
     * @return mailCC
     */
    public String getMailCC() {
        return mailCC;
    }


    /**
     * Sets the mailCC value for this CIActionReadType.
     *
     * @param mailCC
     */
    public void setMailCC(String mailCC) {
        this.mailCC = mailCC;
    }


    /**
     * Gets the mailBCC value for this CIActionReadType.
     *
     * @return mailBCC
     */
    public String getMailBCC() {
        return mailBCC;
    }


    /**
     * Sets the mailBCC value for this CIActionReadType.
     *
     * @param mailBCC
     */
    public void setMailBCC(String mailBCC) {
        this.mailBCC = mailBCC;
    }


    /**
     * Gets the comment value for this CIActionReadType.
     *
     * @return comment
     */
    public String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this CIActionReadType.
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * Gets the timeAllocated value for this CIActionReadType.
     *
     * @return timeAllocated
     */
    public long getTimeAllocated() {
        return timeAllocated;
    }


    /**
     * Sets the timeAllocated value for this CIActionReadType.
     *
     * @param timeAllocated
     */
    public void setTimeAllocated(long timeAllocated) {
        this.timeAllocated = timeAllocated;
    }


    /**
     * Gets the numberUsed value for this CIActionReadType.
     *
     * @return numberUsed
     */
    public String getNumberUsed() {
        return numberUsed;
    }


    /**
     * Sets the numberUsed value for this CIActionReadType.
     *
     * @param numberUsed
     */
    public void setNumberUsed(String numberUsed) {
        this.numberUsed = numberUsed;
    }


    /**
     * Gets the outboundTalkTime value for this CIActionReadType.
     *
     * @return outboundTalkTime
     */
    public long getOutboundTalkTime() {
        return outboundTalkTime;
    }


    /**
     * Sets the outboundTalkTime value for this CIActionReadType.
     *
     * @param outboundTalkTime
     */
    public void setOutboundTalkTime(long outboundTalkTime) {
        this.outboundTalkTime = outboundTalkTime;
    }


    /**
     * Gets the outboundDispositionCode value for this CIActionReadType.
     *
     * @return outboundDispositionCode
     */
    public String getOutboundDispositionCode() {
        return outboundDispositionCode;
    }


    /**
     * Sets the outboundDispositionCode value for this CIActionReadType.
     *
     * @param outboundDispositionCode
     */
    public void setOutboundDispositionCode(String outboundDispositionCode) {
        this.outboundDispositionCode = outboundDispositionCode;
    }


    /**
     * Gets the actionType value for this CIActionReadType.
     *
     * @return actionType
     */
    public CIContactType getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this CIActionReadType.
     *
     * @param actionType
     */
    public void setActionType(CIContactType actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the customFieldList value for this CIActionReadType.
     *
     * @return customFieldList
     */
    public ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CIActionReadType.
     *
     * @param customFieldList
     */
    public void setCustomFieldList(ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIActionReadType)) return false;
        CIActionReadType other = (CIActionReadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.id == other.getId() &&
                this.contactID == other.getContactID() &&
                ((this.agent == null && other.getAgent() == null) ||
                        (this.agent != null &&
                                this.agent.equals(other.getAgent()))) &&
                ((this.subject == null && other.getSubject() == null) ||
                        (this.subject != null &&
                                this.subject.equals(other.getSubject()))) &&
                ((this.text == null && other.getText() == null) ||
                        (this.text != null &&
                                this.text.equals(other.getText()))) &&
                ((this.textHTML == null && other.getTextHTML() == null) ||
                        (this.textHTML != null &&
                                this.textHTML.equals(other.getTextHTML()))) &&
                ((this.callbackTime == null && other.getCallbackTime() == null) ||
                        (this.callbackTime != null &&
                                this.callbackTime.equals(other.getCallbackTime()))) &&
                ((this.callbackStatus == null && other.getCallbackStatus() == null) ||
                        (this.callbackStatus != null &&
                                this.callbackStatus.equals(other.getCallbackStatus()))) &&
                ((this.creationTime == null && other.getCreationTime() == null) ||
                        (this.creationTime != null &&
                                this.creationTime.equals(other.getCreationTime()))) &&
                ((this.source == null && other.getSource() == null) ||
                        (this.source != null &&
                                this.source.equals(other.getSource()))) &&
                ((this.mailTo == null && other.getMailTo() == null) ||
                        (this.mailTo != null &&
                                this.mailTo.equals(other.getMailTo()))) &&
                ((this.mailCC == null && other.getMailCC() == null) ||
                        (this.mailCC != null &&
                                this.mailCC.equals(other.getMailCC()))) &&
                ((this.mailBCC == null && other.getMailBCC() == null) ||
                        (this.mailBCC != null &&
                                this.mailBCC.equals(other.getMailBCC()))) &&
                ((this.comment == null && other.getComment() == null) ||
                        (this.comment != null &&
                                this.comment.equals(other.getComment()))) &&
                this.timeAllocated == other.getTimeAllocated() &&
                ((this.numberUsed == null && other.getNumberUsed() == null) ||
                        (this.numberUsed != null &&
                                this.numberUsed.equals(other.getNumberUsed()))) &&
                this.outboundTalkTime == other.getOutboundTalkTime() &&
                ((this.outboundDispositionCode == null && other.getOutboundDispositionCode() == null) ||
                        (this.outboundDispositionCode != null &&
                                this.outboundDispositionCode.equals(other.getOutboundDispositionCode()))) &&
                ((this.actionType == null && other.getActionType() == null) ||
                        (this.actionType != null &&
                                this.actionType.equals(other.getActionType()))) &&
                ((this.customFieldList == null && other.getCustomFieldList() == null) ||
                        (this.customFieldList != null &&
                                java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList())));
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
        _hashCode += new Long(getContactID()).hashCode();
        if (getAgent() != null) {
            _hashCode += getAgent().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getTextHTML() != null) {
            _hashCode += getTextHTML().hashCode();
        }
        if (getCallbackTime() != null) {
            _hashCode += getCallbackTime().hashCode();
        }
        if (getCallbackStatus() != null) {
            _hashCode += getCallbackStatus().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getMailTo() != null) {
            _hashCode += getMailTo().hashCode();
        }
        if (getMailCC() != null) {
            _hashCode += getMailCC().hashCode();
        }
        if (getMailBCC() != null) {
            _hashCode += getMailBCC().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        _hashCode += new Long(getTimeAllocated()).hashCode();
        if (getNumberUsed() != null) {
            _hashCode += getNumberUsed().hashCode();
        }
        _hashCode += new Long(getOutboundTalkTime()).hashCode();
        if (getOutboundDispositionCode() != null) {
            _hashCode += getOutboundDispositionCode().hashCode();
        }
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIActionReadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIActionReadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "contactID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "agent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIAgentReadType"));
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
        elemField.setFieldName("callbackTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "callbackTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "callbackStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICallbackStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "creationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIActionSource"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "mailTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "mailCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailBCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "mailBCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeAllocated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "timeAllocated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "numberUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundTalkTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "outboundTalkTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundDispositionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "outboundDispositionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICustomFieldReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CICustomFieldReadType"));
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
