
package com.nortel.soa.oi.cct.types.addressservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.ResourceState;


/**
 * <p>Java class for GetStateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourseState" type="{http://www.nortel.com/soa/oi/cct/types}resourceState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStateResponse", propOrder = {
    "resourseState"
})
public class GetStateResponse {

    @XmlElement(required = true)
    protected ResourceState resourseState;

    /**
     * Gets the value of the resourseState property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceState }
     *     
     */
    public ResourceState getResourseState() {
        return resourseState;
    }

    /**
     * Sets the value of the resourseState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceState }
     *     
     */
    public void setResourseState(ResourceState value) {
        this.resourseState = value;
    }

}
