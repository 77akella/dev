
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attachedXMLData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attachedXMLData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value8" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value9" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachedXMLData", propOrder = {
    "value1",
    "value2",
    "value3",
    "value4",
    "value5",
    "value6",
    "value7",
    "value8",
    "value9"
})
public class AttachedXMLData {

    @XmlElement(required = true)
    protected String value1;
    @XmlElement(required = true)
    protected String value2;
    @XmlElement(required = true)
    protected String value3;
    @XmlElement(required = true)
    protected String value4;
    @XmlElement(required = true)
    protected String value5;
    @XmlElement(required = true)
    protected String value6;
    @XmlElement(required = true)
    protected String value7;
    @XmlElement(required = true)
    protected String value8;
    @XmlElement(required = true)
    protected String value9;

    /**
     * Gets the value of the value1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue1() {
        return value1;
    }

    /**
     * Sets the value of the value1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue1(String value) {
        this.value1 = value;
    }

    /**
     * Gets the value of the value2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue2() {
        return value2;
    }

    /**
     * Sets the value of the value2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue2(String value) {
        this.value2 = value;
    }

    /**
     * Gets the value of the value3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue3() {
        return value3;
    }

    /**
     * Sets the value of the value3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue3(String value) {
        this.value3 = value;
    }

    /**
     * Gets the value of the value4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue4() {
        return value4;
    }

    /**
     * Sets the value of the value4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue4(String value) {
        this.value4 = value;
    }

    /**
     * Gets the value of the value5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue5() {
        return value5;
    }

    /**
     * Sets the value of the value5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue5(String value) {
        this.value5 = value;
    }

    /**
     * Gets the value of the value6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue6() {
        return value6;
    }

    /**
     * Sets the value of the value6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue6(String value) {
        this.value6 = value;
    }

    /**
     * Gets the value of the value7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue7() {
        return value7;
    }

    /**
     * Sets the value of the value7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue7(String value) {
        this.value7 = value;
    }

    /**
     * Gets the value of the value8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue8() {
        return value8;
    }

    /**
     * Sets the value of the value8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue8(String value) {
        this.value8 = value;
    }

    /**
     * Gets the value of the value9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue9() {
        return value9;
    }

    /**
     * Sets the value of the value9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue9(String value) {
        this.value9 = value;
    }

}
