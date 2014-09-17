
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terminalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TREATMENT"/>
 *     &lt;enumeration value="GENERIC"/>
 *     &lt;enumeration value="AGENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "terminalType")
@XmlEnum
public enum TerminalType {

    TREATMENT,
    GENERIC,
    AGENT;

    public String value() {
        return name();
    }

    public static TerminalType fromValue(String v) {
        return valueOf(v);
    }

}
