
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminalConnectionStateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terminalConnectionStateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentState" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnectionStateHolder"/>
 *         &lt;element name="lastState" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnectionStateHolder"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terminalConnectionStateInfo", propOrder = {
    "currentState",
    "lastState",
    "type",
    "parentId"
})
public class TerminalConnectionStateInfo {

    @XmlElement(required = true)
    protected TerminalConnectionStateHolder currentState;
    @XmlElement(required = true)
    protected TerminalConnectionStateHolder lastState;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String parentId;

    /**
     * Gets the value of the currentState property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionStateHolder }
     *     
     */
    public TerminalConnectionStateHolder getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionStateHolder }
     *     
     */
    public void setCurrentState(TerminalConnectionStateHolder value) {
        this.currentState = value;
    }

    /**
     * Gets the value of the lastState property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalConnectionStateHolder }
     *     
     */
    public TerminalConnectionStateHolder getLastState() {
        return lastState;
    }

    /**
     * Sets the value of the lastState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalConnectionStateHolder }
     *     
     */
    public void setLastState(TerminalConnectionStateHolder value) {
        this.lastState = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
    }

}
