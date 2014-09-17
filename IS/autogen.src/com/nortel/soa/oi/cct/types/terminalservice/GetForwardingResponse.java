
package com.nortel.soa.oi.cct.types.terminalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Forwarding;


/**
 * <p>Java class for GetForwardingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetForwardingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forwarding" type="{http://www.nortel.com/soa/oi/cct/types}forwarding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetForwardingResponse", propOrder = {
    "forwarding"
})
public class GetForwardingResponse {

    @XmlElement(nillable = true)
    protected List<Forwarding> forwarding;

    /**
     * Gets the value of the forwarding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwarding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwarding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Forwarding }
     * 
     * 
     */
    public List<Forwarding> getForwarding() {
        if (forwarding == null) {
            forwarding = new ArrayList<Forwarding>();
        }
        return this.forwarding;
    }

}
