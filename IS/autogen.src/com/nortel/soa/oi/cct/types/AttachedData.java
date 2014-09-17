
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attachedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attachedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.nortel.com/soa/oi/cct/types}attachmentType"/>
 *         &lt;element name="binaryData" type="{http://www.nortel.com/soa/oi/cct/types}byteArray" minOccurs="0"/>
 *         &lt;element name="keyValueData" type="{http://www.nortel.com/soa/oi/cct/types}keyValuePairArray" minOccurs="0"/>
 *         &lt;element name="stringData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachedData", propOrder = {
    "type",
    "binaryData",
    "keyValueData",
    "stringData"
})
public class AttachedData {

    @XmlElement(required = true)
    protected AttachmentType type;
    protected ByteArray binaryData;
    protected KeyValuePairArray keyValueData;
    protected String stringData;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setType(AttachmentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the binaryData property.
     * 
     * @return
     *     possible object is
     *     {@link ByteArray }
     *     
     */
    public ByteArray getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByteArray }
     *     
     */
    public void setBinaryData(ByteArray value) {
        this.binaryData = value;
    }

    /**
     * Gets the value of the keyValueData property.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePairArray }
     *     
     */
    public KeyValuePairArray getKeyValueData() {
        return keyValueData;
    }

    /**
     * Sets the value of the keyValueData property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePairArray }
     *     
     */
    public void setKeyValueData(KeyValuePairArray value) {
        this.keyValueData = value;
    }

    /**
     * Gets the value of the stringData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringData() {
        return stringData;
    }

    /**
     * Sets the value of the stringData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringData(String value) {
        this.stringData = value;
    }

}
