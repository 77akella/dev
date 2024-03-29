
package com.nortel.soa.oi.cct.types.addressservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Presence;


/**
 * <p>Java class for GetPresenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPresenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="presence" type="{http://www.nortel.com/soa/oi/cct/types}presence"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPresenceResponse", propOrder = {
    "presence"
})
public class GetPresenceResponse {

    @XmlElement(required = true)
    protected Presence presence;

    /**
     * Gets the value of the presence property.
     * 
     * @return
     *     possible object is
     *     {@link Presence }
     *     
     */
    public Presence getPresence() {
        return presence;
    }

    /**
     * Sets the value of the presence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presence }
     *     
     */
    public void setPresence(Presence value) {
        this.presence = value;
    }

}
