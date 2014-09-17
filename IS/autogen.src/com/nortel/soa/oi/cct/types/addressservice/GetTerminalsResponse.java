
package com.nortel.soa.oi.cct.types.addressservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Terminal;


/**
 * <p>Java class for GetTerminalsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTerminalsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminals" type="{http://www.nortel.com/soa/oi/cct/types}terminal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTerminalsResponse", propOrder = {
    "terminals"
})
public class GetTerminalsResponse {

    @XmlElement(nillable = true)
    protected List<Terminal> terminals;

    /**
     * Gets the value of the terminals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Terminal }
     * 
     * 
     */
    public List<Terminal> getTerminals() {
        if (terminals == null) {
            terminals = new ArrayList<Terminal>();
        }
        return this.terminals;
    }

}
