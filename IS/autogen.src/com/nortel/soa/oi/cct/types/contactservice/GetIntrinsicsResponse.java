
package com.nortel.soa.oi.cct.types.contactservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Intrinsic;


/**
 * <p>Java class for GetIntrinsicsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetIntrinsicsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="intrinsic" type="{http://www.nortel.com/soa/oi/cct/types}intrinsic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetIntrinsicsResponse", propOrder = {
    "intrinsic"
})
public class GetIntrinsicsResponse {

    @XmlElement(nillable = true)
    protected List<Intrinsic> intrinsic;

    /**
     * Gets the value of the intrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intrinsic }
     * 
     * 
     */
    public List<Intrinsic> getIntrinsic() {
        if (intrinsic == null) {
            intrinsic = new ArrayList<Intrinsic>();
        }
        return this.intrinsic;
    }

}
