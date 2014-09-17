
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="presence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.nortel.com/soa/oi/cct/types}presenceStatus"/>
 *         &lt;element name="extendedStatus" type="{http://www.nortel.com/soa/oi/cct/types}presenceExtendedStatus"/>
 *         &lt;element name="activity" type="{http://www.nortel.com/soa/oi/cct/types}presenceActivity"/>
 *         &lt;element name="rawXml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "presence", propOrder = {
    "status",
    "extendedStatus",
    "activity",
    "rawXml",
    "note"
})
public class Presence {

    @XmlElement(required = true)
    protected PresenceStatus status;
    @XmlElement(required = true)
    protected PresenceExtendedStatus extendedStatus;
    @XmlElement(required = true)
    protected PresenceActivity activity;
    @XmlElement(required = true)
    protected String rawXml;
    @XmlElement(required = true)
    protected String note;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceStatus }
     *     
     */
    public PresenceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceStatus }
     *     
     */
    public void setStatus(PresenceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the extendedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceExtendedStatus }
     *     
     */
    public PresenceExtendedStatus getExtendedStatus() {
        return extendedStatus;
    }

    /**
     * Sets the value of the extendedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceExtendedStatus }
     *     
     */
    public void setExtendedStatus(PresenceExtendedStatus value) {
        this.extendedStatus = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceActivity }
     *     
     */
    public PresenceActivity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceActivity }
     *     
     */
    public void setActivity(PresenceActivity value) {
        this.activity = value;
    }

    /**
     * Gets the value of the rawXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawXml() {
        return rawXml;
    }

    /**
     * Sets the value of the rawXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawXml(String value) {
        this.rawXml = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
