
package com.nortel.soa.oi.cct.basenotification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.AddressProperty;


/**
 * <p>Java class for AddressPropertyListenerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressPropertyListenerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressEntity" type="{http://www.nortel.com/soa/oi/cct/types}address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AddressPropertyEvent" type="{http://www.nortel.com/soa/oi/cct/types}addressProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressPropertyListenerType", propOrder = {
    "addressEntity",
    "addressPropertyEvent"
})
public class AddressPropertyListenerType {

    @XmlElement(name = "AddressEntity")
    protected List<Address> addressEntity;
    @XmlElement(name = "AddressPropertyEvent")
    protected List<AddressProperty> addressPropertyEvent;

    /**
     * Gets the value of the addressEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddressEntity() {
        if (addressEntity == null) {
            addressEntity = new ArrayList<Address>();
        }
        return this.addressEntity;
    }

    /**
     * Gets the value of the addressPropertyEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressPropertyEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressPropertyEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressProperty }
     * 
     * 
     */
    public List<AddressProperty> getAddressPropertyEvent() {
        if (addressPropertyEvent == null) {
            addressPropertyEvent = new ArrayList<AddressProperty>();
        }
        return this.addressPropertyEvent;
    }

}
