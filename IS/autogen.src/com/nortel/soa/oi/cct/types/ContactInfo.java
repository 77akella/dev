
package com.nortel.soa.oi.cct.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calledAddress" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *         &lt;element name="callingAddress" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *         &lt;element name="callingTerminal" type="{http://www.nortel.com/soa/oi/cct/types}terminal"/>
 *         &lt;element name="capabilities" type="{http://www.nortel.com/soa/oi/cct/types}contactCapabilities"/>
 *         &lt;element name="connections" type="{http://www.nortel.com/soa/oi/cct/types}connection" maxOccurs="unbounded"/>
 *         &lt;element name="lastRedirectedAddress" type="{http://www.nortel.com/soa/oi/cct/types}address"/>
 *         &lt;element name="originalDestination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactInfo", propOrder = {
    "calledAddress",
    "callingAddress",
    "callingTerminal",
    "capabilities",
    "connections",
    "lastRedirectedAddress",
    "originalDestination"
})
public class ContactInfo {

    @XmlElement(required = true)
    protected Address calledAddress;
    @XmlElement(required = true)
    protected Address callingAddress;
    @XmlElement(required = true)
    protected Terminal callingTerminal;
    @XmlElement(required = true)
    protected ContactCapabilities capabilities;
    @XmlElement(required = true)
    protected List<Connection> connections;
    @XmlElement(required = true)
    protected Address lastRedirectedAddress;
    @XmlElement(required = true)
    protected String originalDestination;

    /**
     * Gets the value of the calledAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCalledAddress() {
        return calledAddress;
    }

    /**
     * Sets the value of the calledAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCalledAddress(Address value) {
        this.calledAddress = value;
    }

    /**
     * Gets the value of the callingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCallingAddress() {
        return callingAddress;
    }

    /**
     * Sets the value of the callingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCallingAddress(Address value) {
        this.callingAddress = value;
    }

    /**
     * Gets the value of the callingTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal }
     *     
     */
    public Terminal getCallingTerminal() {
        return callingTerminal;
    }

    /**
     * Sets the value of the callingTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal }
     *     
     */
    public void setCallingTerminal(Terminal value) {
        this.callingTerminal = value;
    }

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ContactCapabilities }
     *     
     */
    public ContactCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactCapabilities }
     *     
     */
    public void setCapabilities(ContactCapabilities value) {
        this.capabilities = value;
    }

    /**
     * Gets the value of the connections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     * 
     * 
     */
    public List<Connection> getConnections() {
        if (connections == null) {
            connections = new ArrayList<Connection>();
        }
        return this.connections;
    }

    /**
     * Gets the value of the lastRedirectedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getLastRedirectedAddress() {
        return lastRedirectedAddress;
    }

    /**
     * Sets the value of the lastRedirectedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setLastRedirectedAddress(Address value) {
        this.lastRedirectedAddress = value;
    }

    /**
     * Gets the value of the originalDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDestination() {
        return originalDestination;
    }

    /**
     * Sets the value of the originalDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDestination(String value) {
        this.originalDestination = value;
    }

}
