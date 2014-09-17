
package com.nortel.soa.oi.cct.types.contactservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.AttachedXMLData;


/**
 * <p>Java class for GetAttachedXMLDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAttachedXMLDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachedXMLData" type="{http://www.nortel.com/soa/oi/cct/types}attachedXMLData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAttachedXMLDataResponse", propOrder = {
    "attachedXMLData"
})
public class GetAttachedXMLDataResponse {

    @XmlElement(required = true)
    protected AttachedXMLData attachedXMLData;

    /**
     * Gets the value of the attachedXMLData property.
     * 
     * @return
     *     possible object is
     *     {@link AttachedXMLData }
     *     
     */
    public AttachedXMLData getAttachedXMLData() {
        return attachedXMLData;
    }

    /**
     * Sets the value of the attachedXMLData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedXMLData }
     *     
     */
    public void setAttachedXMLData(AttachedXMLData value) {
        this.attachedXMLData = value;
    }

}
