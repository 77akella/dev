
package com.nortel.soa.oi.cct.basenotification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Address;
import com.nortel.soa.oi.cct.types.ConnectionState;


/**
 * <p>Java class for ConnectionStateListenerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionStateListenerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressEntity" type="{http://www.nortel.com/soa/oi/cct/types}address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConnectionStateEvent" type="{http://www.nortel.com/soa/oi/cct/types}connectionState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionStateListenerType", propOrder = {
    "addressEntity",
    "connectionStateEvent"
})
public class ConnectionStateListenerType {

    @XmlElement(name = "AddressEntity")
    protected List<Address> addressEntity;
    @XmlElement(name = "ConnectionStateEvent")
    protected List<ConnectionState> connectionStateEvent;

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
     * Gets the value of the connectionStateEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionStateEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionStateEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionState }
     * 
     * 
     */
    public List<ConnectionState> getConnectionStateEvent() {
        if (connectionStateEvent == null) {
            connectionStateEvent = new ArrayList<ConnectionState>();
        }
        return this.connectionStateEvent;
    }

}
