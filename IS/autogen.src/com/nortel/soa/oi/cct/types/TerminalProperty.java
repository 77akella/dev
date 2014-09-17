
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminalProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terminalProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DO_NOT_DISTURB"/>
 *     &lt;enumeration value="FORWARDING"/>
 *     &lt;enumeration value="CONTACT_TYPE"/>
 *     &lt;enumeration value="TREATMENT_TERMINAL_TYPE"/>
 *     &lt;enumeration value="TREATMENT_TRANSPORT_TYPE"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="PORT"/>
 *     &lt;enumeration value="AGENT_LOGIN_SESSION"/>
 *     &lt;enumeration value="AGENT_LOGIN_SESSION_ENDED"/>
 *     &lt;enumeration value="ACTIVITY_CODE"/>
 *     &lt;enumeration value="READY_STATUS"/>
 *     &lt;enumeration value="VALIDATE_AGENT_LICENSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "terminalProperty")
@XmlEnum
public enum TerminalProperty {

    DO_NOT_DISTURB,
    FORWARDING,
    CONTACT_TYPE,
    TREATMENT_TERMINAL_TYPE,
    TREATMENT_TRANSPORT_TYPE,
    NAME,
    PORT,
    AGENT_LOGIN_SESSION,
    AGENT_LOGIN_SESSION_ENDED,
    ACTIVITY_CODE,
    READY_STATUS,
    VALIDATE_AGENT_LICENSE;

    public String value() {
        return name();
    }

    public static TerminalProperty fromValue(String v) {
        return valueOf(v);
    }

}
