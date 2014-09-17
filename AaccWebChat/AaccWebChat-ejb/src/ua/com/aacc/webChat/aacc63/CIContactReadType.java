/**
 * CIContactReadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ua.com.aacc.webChat.aacc63;

public class CIContactReadType implements java.io.Serializable {
    private long id;

    private long customerID;

    private String originalSubject;

    private CIContactSource source;

    private CIContactStatus status;

    private ua.com.aacc.webChat.aacc63.CISkillsetReadType skillset;

    private CIContactPriority priority;

    private long timezone;

    private String webOnHoldTag;

    private CIDateTime arrivalTime;

    private CIDateTime closedTime;

    private CIDateTime openTime;

    private long openDuration;

    private String mailTo;

    private String mailFrom;

    private String mailCC;

    private CIContactType contactType;

    private CIAgentReadType agent;

    private CIActionReadType[] actionList;

    private ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] customFieldList;

    public CIContactReadType() {
    }

    public CIContactReadType(
            long id,
            long customerID,
            String originalSubject,
            CIContactSource source,
            CIContactStatus status,
            ua.com.aacc.webChat.aacc63.CISkillsetReadType skillset,
            CIContactPriority priority,
            long timezone,
            String webOnHoldTag,
            CIDateTime arrivalTime,
            CIDateTime closedTime,
            CIDateTime openTime,
            long openDuration,
            String mailTo,
            String mailFrom,
            String mailCC,
            CIContactType contactType,
            CIAgentReadType agent,
            CIActionReadType[] actionList,
            ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] customFieldList) {
        this.id = id;
        this.customerID = customerID;
        this.originalSubject = originalSubject;
        this.source = source;
        this.status = status;
        this.skillset = skillset;
        this.priority = priority;
        this.timezone = timezone;
        this.webOnHoldTag = webOnHoldTag;
        this.arrivalTime = arrivalTime;
        this.closedTime = closedTime;
        this.openTime = openTime;
        this.openDuration = openDuration;
        this.mailTo = mailTo;
        this.mailFrom = mailFrom;
        this.mailCC = mailCC;
        this.contactType = contactType;
        this.agent = agent;
        this.actionList = actionList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the id value for this CIContactReadType.
     *
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this CIContactReadType.
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the customerID value for this CIContactReadType.
     *
     * @return customerID
     */
    public long getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this CIContactReadType.
     *
     * @param customerID
     */
    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the originalSubject value for this CIContactReadType.
     *
     * @return originalSubject
     */
    public String getOriginalSubject() {
        return originalSubject;
    }


    /**
     * Sets the originalSubject value for this CIContactReadType.
     *
     * @param originalSubject
     */
    public void setOriginalSubject(String originalSubject) {
        this.originalSubject = originalSubject;
    }


    /**
     * Gets the source value for this CIContactReadType.
     *
     * @return source
     */
    public CIContactSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this CIContactReadType.
     *
     * @param source
     */
    public void setSource(CIContactSource source) {
        this.source = source;
    }


    /**
     * Gets the status value for this CIContactReadType.
     *
     * @return status
     */
    public CIContactStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CIContactReadType.
     *
     * @param status
     */
    public void setStatus(CIContactStatus status) {
        this.status = status;
    }


    /**
     * Gets the skillset value for this CIContactReadType.
     *
     * @return skillset
     */
    public ua.com.aacc.webChat.aacc63.CISkillsetReadType getSkillset() {
        return skillset;
    }


    /**
     * Sets the skillset value for this CIContactReadType.
     *
     * @param skillset
     */
    public void setSkillset(ua.com.aacc.webChat.aacc63.CISkillsetReadType skillset) {
        this.skillset = skillset;
    }


    /**
     * Gets the priority value for this CIContactReadType.
     *
     * @return priority
     */
    public CIContactPriority getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this CIContactReadType.
     *
     * @param priority
     */
    public void setPriority(CIContactPriority priority) {
        this.priority = priority;
    }


    /**
     * Gets the timezone value for this CIContactReadType.
     *
     * @return timezone
     */
    public long getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this CIContactReadType.
     *
     * @param timezone
     */
    public void setTimezone(long timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the webOnHoldTag value for this CIContactReadType.
     *
     * @return webOnHoldTag
     */
    public String getWebOnHoldTag() {
        return webOnHoldTag;
    }


    /**
     * Sets the webOnHoldTag value for this CIContactReadType.
     *
     * @param webOnHoldTag
     */
    public void setWebOnHoldTag(String webOnHoldTag) {
        this.webOnHoldTag = webOnHoldTag;
    }


    /**
     * Gets the arrivalTime value for this CIContactReadType.
     *
     * @return arrivalTime
     */
    public CIDateTime getArrivalTime() {
        return arrivalTime;
    }


    /**
     * Sets the arrivalTime value for this CIContactReadType.
     *
     * @param arrivalTime
     */
    public void setArrivalTime(CIDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    /**
     * Gets the closedTime value for this CIContactReadType.
     *
     * @return closedTime
     */
    public CIDateTime getClosedTime() {
        return closedTime;
    }


    /**
     * Sets the closedTime value for this CIContactReadType.
     *
     * @param closedTime
     */
    public void setClosedTime(CIDateTime closedTime) {
        this.closedTime = closedTime;
    }


    /**
     * Gets the openTime value for this CIContactReadType.
     *
     * @return openTime
     */
    public CIDateTime getOpenTime() {
        return openTime;
    }


    /**
     * Sets the openTime value for this CIContactReadType.
     *
     * @param openTime
     */
    public void setOpenTime(CIDateTime openTime) {
        this.openTime = openTime;
    }


    /**
     * Gets the openDuration value for this CIContactReadType.
     *
     * @return openDuration
     */
    public long getOpenDuration() {
        return openDuration;
    }


    /**
     * Sets the openDuration value for this CIContactReadType.
     *
     * @param openDuration
     */
    public void setOpenDuration(long openDuration) {
        this.openDuration = openDuration;
    }


    /**
     * Gets the mailTo value for this CIContactReadType.
     *
     * @return mailTo
     */
    public String getMailTo() {
        return mailTo;
    }


    /**
     * Sets the mailTo value for this CIContactReadType.
     *
     * @param mailTo
     */
    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }


    /**
     * Gets the mailFrom value for this CIContactReadType.
     *
     * @return mailFrom
     */
    public String getMailFrom() {
        return mailFrom;
    }


    /**
     * Sets the mailFrom value for this CIContactReadType.
     *
     * @param mailFrom
     */
    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }


    /**
     * Gets the mailCC value for this CIContactReadType.
     *
     * @return mailCC
     */
    public String getMailCC() {
        return mailCC;
    }


    /**
     * Sets the mailCC value for this CIContactReadType.
     *
     * @param mailCC
     */
    public void setMailCC(String mailCC) {
        this.mailCC = mailCC;
    }


    /**
     * Gets the contactType value for this CIContactReadType.
     *
     * @return contactType
     */
    public CIContactType getContactType() {
        return contactType;
    }


    /**
     * Sets the contactType value for this CIContactReadType.
     *
     * @param contactType
     */
    public void setContactType(CIContactType contactType) {
        this.contactType = contactType;
    }


    /**
     * Gets the agent value for this CIContactReadType.
     *
     * @return agent
     */
    public CIAgentReadType getAgent() {
        return agent;
    }


    /**
     * Sets the agent value for this CIContactReadType.
     *
     * @param agent
     */
    public void setAgent(CIAgentReadType agent) {
        this.agent = agent;
    }


    /**
     * Gets the actionList value for this CIContactReadType.
     *
     * @return actionList
     */
    public CIActionReadType[] getActionList() {
        return actionList;
    }


    /**
     * Sets the actionList value for this CIContactReadType.
     *
     * @param actionList
     */
    public void setActionList(CIActionReadType[] actionList) {
        this.actionList = actionList;
    }


    /**
     * Gets the customFieldList value for this CIContactReadType.
     *
     * @return customFieldList
     */
    public ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CIContactReadType.
     *
     * @param customFieldList
     */
    public void setCustomFieldList(ua.com.aacc.webChat.aacc63.CICustomFieldReadType[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CIContactReadType)) return false;
        CIContactReadType other = (CIContactReadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.id == other.getId() &&
                this.customerID == other.getCustomerID() &&
                ((this.originalSubject == null && other.getOriginalSubject() == null) ||
                        (this.originalSubject != null &&
                                this.originalSubject.equals(other.getOriginalSubject()))) &&
                ((this.source == null && other.getSource() == null) ||
                        (this.source != null &&
                                this.source.equals(other.getSource()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.skillset == null && other.getSkillset() == null) ||
                        (this.skillset != null &&
                                this.skillset.equals(other.getSkillset()))) &&
                ((this.priority == null && other.getPriority() == null) ||
                        (this.priority != null &&
                                this.priority.equals(other.getPriority()))) &&
                this.timezone == other.getTimezone() &&
                ((this.webOnHoldTag == null && other.getWebOnHoldTag() == null) ||
                        (this.webOnHoldTag != null &&
                                this.webOnHoldTag.equals(other.getWebOnHoldTag()))) &&
                ((this.arrivalTime == null && other.getArrivalTime() == null) ||
                        (this.arrivalTime != null &&
                                this.arrivalTime.equals(other.getArrivalTime()))) &&
                ((this.closedTime == null && other.getClosedTime() == null) ||
                        (this.closedTime != null &&
                                this.closedTime.equals(other.getClosedTime()))) &&
                ((this.openTime == null && other.getOpenTime() == null) ||
                        (this.openTime != null &&
                                this.openTime.equals(other.getOpenTime()))) &&
                this.openDuration == other.getOpenDuration() &&
                ((this.mailTo == null && other.getMailTo() == null) ||
                        (this.mailTo != null &&
                                this.mailTo.equals(other.getMailTo()))) &&
                ((this.mailFrom == null && other.getMailFrom() == null) ||
                        (this.mailFrom != null &&
                                this.mailFrom.equals(other.getMailFrom()))) &&
                ((this.mailCC == null && other.getMailCC() == null) ||
                        (this.mailCC != null &&
                                this.mailCC.equals(other.getMailCC()))) &&
                ((this.contactType == null && other.getContactType() == null) ||
                        (this.contactType != null &&
                                this.contactType.equals(other.getContactType()))) &&
                ((this.agent == null && other.getAgent() == null) ||
                        (this.agent != null &&
                                this.agent.equals(other.getAgent()))) &&
                ((this.actionList == null && other.getActionList() == null) ||
                        (this.actionList != null &&
                                java.util.Arrays.equals(this.actionList, other.getActionList()))) &&
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
        _hashCode += new Long(getCustomerID()).hashCode();
        if (getOriginalSubject() != null) {
            _hashCode += getOriginalSubject().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSkillset() != null) {
            _hashCode += getSkillset().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        _hashCode += new Long(getTimezone()).hashCode();
        if (getWebOnHoldTag() != null) {
            _hashCode += getWebOnHoldTag().hashCode();
        }
        if (getArrivalTime() != null) {
            _hashCode += getArrivalTime().hashCode();
        }
        if (getClosedTime() != null) {
            _hashCode += getClosedTime().hashCode();
        }
        if (getOpenTime() != null) {
            _hashCode += getOpenTime().hashCode();
        }
        _hashCode += new Long(getOpenDuration()).hashCode();
        if (getMailTo() != null) {
            _hashCode += getMailTo().hashCode();
        }
        if (getMailFrom() != null) {
            _hashCode += getMailFrom().hashCode();
        }
        if (getMailCC() != null) {
            _hashCode += getMailCC().hashCode();
        }
        if (getContactType() != null) {
            _hashCode += getContactType().hashCode();
        }
        if (getAgent() != null) {
            _hashCode += getAgent().hashCode();
        }
        if (getActionList() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getActionList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getActionList(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CIContactReadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactReadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "customerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "originalSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactSource"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skillset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "skillset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CISkillsetReadType"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webOnHoldTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "webOnHoldTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "arrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "closedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "openTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "openDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "MailTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "MailFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "MailCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "contactType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIContactType"));
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
        elemField.setFieldName("actionList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "actionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIActionReadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://datatypes.ci.ccmm.applications.nortel.com", "CIActionReadType"));
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
