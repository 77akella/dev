
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminalPropertyDoNotDisturb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="terminalPropertyDoNotDisturb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doNotDisturbSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "terminalPropertyDoNotDisturb", propOrder = {
    "doNotDisturbSet"
})
public class TerminalPropertyDoNotDisturb {

    protected boolean doNotDisturbSet;

    /**
     * Gets the value of the doNotDisturbSet property.
     * 
     */
    public boolean isDoNotDisturbSet() {
        return doNotDisturbSet;
    }

    /**
     * Sets the value of the doNotDisturbSet property.
     * 
     */
    public void setDoNotDisturbSet(boolean value) {
        this.doNotDisturbSet = value;
    }

}
