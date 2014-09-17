
package com.nortel.soa.oi.cct.types.contactservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.TreatmentConnection;


/**
 * <p>Java class for TreatmentConnectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TreatmentConnectionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connection" type="{http://www.nortel.com/soa/oi/cct/types}treatmentConnection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TreatmentConnectionResponse", propOrder = {
    "connection"
})
public class TreatmentConnectionResponse {

    @XmlElement(required = true)
    protected TreatmentConnection connection;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link TreatmentConnection }
     *     
     */
    public TreatmentConnection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatmentConnection }
     *     
     */
    public void setConnection(TreatmentConnection value) {
        this.connection = value;
    }

}
