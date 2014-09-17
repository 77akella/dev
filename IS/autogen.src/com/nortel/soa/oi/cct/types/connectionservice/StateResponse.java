
package com.nortel.soa.oi.cct.types.connectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.StateInfo;


/**
 * <p>Java class for StateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stateInfo" type="{http://www.nortel.com/soa/oi/cct/types}stateInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateResponse", propOrder = {
    "stateInfo"
})
public class StateResponse {

    @XmlElement(required = true)
    protected StateInfo stateInfo;

    /**
     * Gets the value of the stateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StateInfo }
     *     
     */
    public StateInfo getStateInfo() {
        return stateInfo;
    }

    /**
     * Sets the value of the stateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateInfo }
     *     
     */
    public void setStateInfo(StateInfo value) {
        this.stateInfo = value;
    }

}
