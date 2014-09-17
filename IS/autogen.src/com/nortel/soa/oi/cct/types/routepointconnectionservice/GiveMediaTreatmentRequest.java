
package com.nortel.soa.oi.cct.types.routepointconnectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Connection;
import com.nortel.soa.oi.cct.types.MediaTreatment;
import com.nortel.soa.oi.cct.types.SsoToken;


/**
 * <p>Java class for GiveMediaTreatmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiveMediaTreatmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssoToken" type="{http://www.nortel.com/soa/oi/cct/types}ssoToken"/>
 *         &lt;element name="connection" type="{http://www.nortel.com/soa/oi/cct/types}connection"/>
 *         &lt;element name="treatment" type="{http://www.nortel.com/soa/oi/cct/types}mediaTreatment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiveMediaTreatmentRequest", propOrder = {
    "ssoToken",
    "connection",
    "treatment"
})
public class GiveMediaTreatmentRequest {

    @XmlElement(required = true)
    protected SsoToken ssoToken;
    @XmlElement(required = true)
    protected Connection connection;
    @XmlElement(required = true)
    protected MediaTreatment treatment;

    /**
     * Gets the value of the ssoToken property.
     * 
     * @return
     *     possible object is
     *     {@link SsoToken }
     *     
     */
    public SsoToken getSsoToken() {
        return ssoToken;
    }

    /**
     * Sets the value of the ssoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SsoToken }
     *     
     */
    public void setSsoToken(SsoToken value) {
        this.ssoToken = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link Connection }
     *     
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connection }
     *     
     */
    public void setConnection(Connection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the treatment property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTreatment }
     *     
     */
    public MediaTreatment getTreatment() {
        return treatment;
    }

    /**
     * Sets the value of the treatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTreatment }
     *     
     */
    public void setTreatment(MediaTreatment value) {
        this.treatment = value;
    }

}
