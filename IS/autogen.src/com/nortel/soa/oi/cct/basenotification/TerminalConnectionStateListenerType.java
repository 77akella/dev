
package com.nortel.soa.oi.cct.basenotification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Terminal;
import com.nortel.soa.oi.cct.types.TerminalConnectionState;


/**
 * <p>Java class for TerminalConnectionStateListenerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalConnectionStateListenerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TerminalEntity" type="{http://www.nortel.com/soa/oi/cct/types}terminal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TerminalConnectionStateEvent" type="{http://www.nortel.com/soa/oi/cct/types}terminalConnectionState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalConnectionStateListenerType", propOrder = {
    "terminalEntity",
    "terminalConnectionStateEvent"
})
public class TerminalConnectionStateListenerType {

    @XmlElement(name = "TerminalEntity")
    protected List<Terminal> terminalEntity;
    @XmlElement(name = "TerminalConnectionStateEvent")
    protected List<TerminalConnectionState> terminalConnectionStateEvent;

    /**
     * Gets the value of the terminalEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminalEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminalEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Terminal }
     * 
     * 
     */
    public List<Terminal> getTerminalEntity() {
        if (terminalEntity == null) {
            terminalEntity = new ArrayList<Terminal>();
        }
        return this.terminalEntity;
    }

    /**
     * Gets the value of the terminalConnectionStateEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminalConnectionStateEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminalConnectionStateEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalConnectionState }
     * 
     * 
     */
    public List<TerminalConnectionState> getTerminalConnectionStateEvent() {
        if (terminalConnectionStateEvent == null) {
            terminalConnectionStateEvent = new ArrayList<TerminalConnectionState>();
        }
        return this.terminalConnectionStateEvent;
    }

}
