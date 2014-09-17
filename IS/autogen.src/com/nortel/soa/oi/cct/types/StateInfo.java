
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentState" type="{http://www.nortel.com/soa/oi/cct/types}state"/>
 *         &lt;element name="lastState" type="{http://www.nortel.com/soa/oi/cct/types}state"/>
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
@XmlType(name = "stateInfo", propOrder = {
    "currentState",
    "lastState",
    "type",
    "parentId"
})
public class StateInfo {

    @XmlElement(required = true)
    protected State currentState;
    @XmlElement(required = true)
    protected State lastState;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String parentId;

    /**
     * Gets the value of the currentState property.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setCurrentState(State value) {
        this.currentState = value;
    }

    /**
     * Gets the value of the lastState property.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getLastState() {
        return lastState;
    }

    /**
     * Sets the value of the lastState property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setLastState(State value) {
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
