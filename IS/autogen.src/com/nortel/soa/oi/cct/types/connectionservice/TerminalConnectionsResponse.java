
package com.nortel.soa.oi.cct.types.connectionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.TerminalConnection;


/**
 * <p>Java class for TerminalConnectionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalConnectionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalConnections" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalConnectionsResponse", propOrder = {
    "terminalConnections"
})
public class TerminalConnectionsResponse {

    @XmlElement(nillable = true)
    protected List<TerminalConnection> terminalConnections;

    /**
     * Gets the value of the terminalConnections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminalConnections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminalConnections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalConnection }
     * 
     * 
     */
    public List<TerminalConnection> getTerminalConnections() {
        if (terminalConnections == null) {
            terminalConnections = new ArrayList<TerminalConnection>();
        }
        return this.terminalConnections;
    }

}
