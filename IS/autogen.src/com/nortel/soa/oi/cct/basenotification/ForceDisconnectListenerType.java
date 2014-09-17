
package com.nortel.soa.oi.cct.basenotification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Provider;


/**
 * <p>Java class for ForceDisconnectListenerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForceDisconnectListenerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderEntity" type="{http://www.nortel.com/soa/oi/cct/types}provider" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForceDisconnectListenerType", propOrder = {
    "providerEntity"
})
public class ForceDisconnectListenerType {

    @XmlElement(name = "ProviderEntity")
    protected List<Provider> providerEntity;

    /**
     * Gets the value of the providerEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Provider }
     * 
     * 
     */
    public List<Provider> getProviderEntity() {
        if (providerEntity == null) {
            providerEntity = new ArrayList<Provider>();
        }
        return this.providerEntity;
    }

}
