
package com.nortel.soa.oi.cct.types.sessionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.AuthenticationLevel;


/**
 * <p>Java class for LogInToCCTServerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogInToCCTServerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationLevel" type="{http://www.nortel.com/soa/oi/cct/types}authenticationLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogInToCCTServerRequest", propOrder = {
    "authenticationLevel"
})
public class LogInToCCTServerRequest {

    @XmlElement(required = true)
    protected AuthenticationLevel authenticationLevel;

    /**
     * Gets the value of the authenticationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationLevel }
     *     
     */
    public AuthenticationLevel getAuthenticationLevel() {
        return authenticationLevel;
    }

    /**
     * Sets the value of the authenticationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationLevel }
     *     
     */
    public void setAuthenticationLevel(AuthenticationLevel value) {
        this.authenticationLevel = value;
    }

}
