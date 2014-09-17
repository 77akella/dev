
package com.nortel.soa.oi.cct.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentPropertyContactTypeArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agentPropertyContactTypeArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://www.nortel.com/soa/oi/cct/types}agentPropertyContactType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="contactPropertyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="translationTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agentPropertyContactTypeArray", propOrder = {
    "item",
    "contactPropertyType",
    "translationTable"
})
public class AgentPropertyContactTypeArray {

    protected List<AgentPropertyContactType> item;
    @XmlElement(required = true)
    protected String contactPropertyType;
    @XmlElement(required = true)
    protected String translationTable;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentPropertyContactType }
     * 
     * 
     */
    public List<AgentPropertyContactType> getItem() {
        if (item == null) {
            item = new ArrayList<AgentPropertyContactType>();
        }
        return this.item;
    }

    /**
     * Gets the value of the contactPropertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPropertyType() {
        return contactPropertyType;
    }

    /**
     * Sets the value of the contactPropertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPropertyType(String value) {
        this.contactPropertyType = value;
    }

    /**
     * Gets the value of the translationTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationTable() {
        return translationTable;
    }

    /**
     * Sets the value of the translationTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationTable(String value) {
        this.translationTable = value;
    }

}
