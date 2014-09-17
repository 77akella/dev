
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminalState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terminalState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENABLE"/>
 *     &lt;enumeration value="DISABLE"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="DISABLE_PENDING"/>
 *     &lt;enumeration value="DEFAULT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "terminalState")
@XmlEnum
public enum TerminalState {

    ENABLE,
    DISABLE,
    PENDING,
    DISABLE_PENDING,
    DEFAULT;

    public String value() {
        return name();
    }

    public static TerminalState fromValue(String v) {
        return valueOf(v);
    }

}
