
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPropertyTargetAgentPositionId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPropertyTargetAgentPositionId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetAgentPositionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPropertyTargetAgentPositionId", propOrder = {
    "targetAgentPositionId"
})
public class ContactPropertyTargetAgentPositionId {

    @XmlElement(required = true)
    protected String targetAgentPositionId;

    /**
     * Gets the value of the targetAgentPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAgentPositionId() {
        return targetAgentPositionId;
    }

    /**
     * Sets the value of the targetAgentPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAgentPositionId(String value) {
        this.targetAgentPositionId = value;
    }

}
