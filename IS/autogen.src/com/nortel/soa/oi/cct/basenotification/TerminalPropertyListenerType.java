
package com.nortel.soa.oi.cct.basenotification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.nortel.soa.oi.cct.types.Terminal;
import com.nortel.soa.oi.cct.types.TerminalProperty;


/**
 * <p>Java class for TerminalPropertyListenerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalPropertyListenerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TerminalEntity" type="{http://www.nortel.com/soa/oi/cct/types}terminal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TerminalPropertyEvent" type="{http://www.nortel.com/soa/oi/cct/types}terminalProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalPropertyListenerType", propOrder = {
    "terminalEntity",
    "terminalPropertyEvent"
})
public class TerminalPropertyListenerType {

    @XmlElement(name = "TerminalEntity")
    protected List<Terminal> terminalEntity;
    @XmlElement(name = "TerminalPropertyEvent")
    protected List<TerminalProperty> terminalPropertyEvent;

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
     * Gets the value of the terminalPropertyEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminalPropertyEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminalPropertyEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalProperty }
     * 
     * 
     */
    public List<TerminalProperty> getTerminalPropertyEvent() {
        if (terminalPropertyEvent == null) {
            terminalPropertyEvent = new ArrayList<TerminalProperty>();
        }
        return this.terminalPropertyEvent;
    }

}
