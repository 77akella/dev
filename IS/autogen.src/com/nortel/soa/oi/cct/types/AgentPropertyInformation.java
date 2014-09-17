
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentPropertyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentPropertyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sortKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hasSkillset" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasPrimaries" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasSecondaries" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="referedByTf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="referedByTfv" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="viewScope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personalDn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondaryDn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentPropertyInformation", propOrder = {
    "templateId",
    "positionId",
    "tnName",
    "changeId",
    "sortKey",
    "displayTemplate",
    "hasSkillset",
    "hasPrimaries",
    "hasSecondaries",
    "referedByTf",
    "referedByTfv",
    "viewScope",
    "personalDn",
    "secondaryDn",
    "state",
    "primeId"
})
public class AgentPropertyInformation {

    @XmlElement(required = true)
    protected String templateId;
    @XmlElement(required = true)
    protected String positionId;
    @XmlElement(required = true)
    protected String tnName;
    @XmlElement(required = true)
    protected String changeId;
    @XmlElement(required = true)
    protected String sortKey;
    @XmlElement(required = true)
    protected String displayTemplate;
    protected boolean hasSkillset;
    protected boolean hasPrimaries;
    protected boolean hasSecondaries;
    protected boolean referedByTf;
    protected boolean referedByTfv;
    @XmlElement(required = true)
    protected String viewScope;
    @XmlElement(required = true)
    protected String personalDn;
    @XmlElement(required = true)
    protected String secondaryDn;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(required = true)
    protected String primeId;

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionId(String value) {
        this.positionId = value;
    }

    /**
     * Gets the value of the tnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnName() {
        return tnName;
    }

    /**
     * Sets the value of the tnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnName(String value) {
        this.tnName = value;
    }

    /**
     * Gets the value of the changeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * Sets the value of the changeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeId(String value) {
        this.changeId = value;
    }

    /**
     * Gets the value of the sortKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortKey() {
        return sortKey;
    }

    /**
     * Sets the value of the sortKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortKey(String value) {
        this.sortKey = value;
    }

    /**
     * Gets the value of the displayTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTemplate() {
        return displayTemplate;
    }

    /**
     * Sets the value of the displayTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTemplate(String value) {
        this.displayTemplate = value;
    }

    /**
     * Gets the value of the hasSkillset property.
     * 
     */
    public boolean isHasSkillset() {
        return hasSkillset;
    }

    /**
     * Sets the value of the hasSkillset property.
     * 
     */
    public void setHasSkillset(boolean value) {
        this.hasSkillset = value;
    }

    /**
     * Gets the value of the hasPrimaries property.
     * 
     */
    public boolean isHasPrimaries() {
        return hasPrimaries;
    }

    /**
     * Sets the value of the hasPrimaries property.
     * 
     */
    public void setHasPrimaries(boolean value) {
        this.hasPrimaries = value;
    }

    /**
     * Gets the value of the hasSecondaries property.
     * 
     */
    public boolean isHasSecondaries() {
        return hasSecondaries;
    }

    /**
     * Sets the value of the hasSecondaries property.
     * 
     */
    public void setHasSecondaries(boolean value) {
        this.hasSecondaries = value;
    }

    /**
     * Gets the value of the referedByTf property.
     * 
     */
    public boolean isReferedByTf() {
        return referedByTf;
    }

    /**
     * Sets the value of the referedByTf property.
     * 
     */
    public void setReferedByTf(boolean value) {
        this.referedByTf = value;
    }

    /**
     * Gets the value of the referedByTfv property.
     * 
     */
    public boolean isReferedByTfv() {
        return referedByTfv;
    }

    /**
     * Sets the value of the referedByTfv property.
     * 
     */
    public void setReferedByTfv(boolean value) {
        this.referedByTfv = value;
    }

    /**
     * Gets the value of the viewScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewScope() {
        return viewScope;
    }

    /**
     * Sets the value of the viewScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewScope(String value) {
        this.viewScope = value;
    }

    /**
     * Gets the value of the personalDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalDn() {
        return personalDn;
    }

    /**
     * Sets the value of the personalDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalDn(String value) {
        this.personalDn = value;
    }

    /**
     * Gets the value of the secondaryDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryDn() {
        return secondaryDn;
    }

    /**
     * Sets the value of the secondaryDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryDn(String value) {
        this.secondaryDn = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the primeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeId() {
        return primeId;
    }

    /**
     * Sets the value of the primeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeId(String value) {
        this.primeId = value;
    }

}
