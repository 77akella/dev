
package com.nortel.soa.oi.cct.types.terminalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.TerminalConnection;


/**
 * <p>Java class for GetTerminalConnectionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTerminalConnectionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalConnection" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTerminalConnectionsResponse", propOrder = {
    "terminalConnection"
})
public class GetTerminalConnectionsResponse {

    @XmlElement(nillable = true)
    protected List<TerminalConnection> terminalConnection;

    /**
     * Gets the value of the terminalConnection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminalConnection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminalConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalConnection }
     * 
     * 
     */
    public List<TerminalConnection> getTerminalConnection() {
        if (terminalConnection == null) {
            terminalConnection = new ArrayList<TerminalConnection>();
        }
        return this.terminalConnection;
    }

}
