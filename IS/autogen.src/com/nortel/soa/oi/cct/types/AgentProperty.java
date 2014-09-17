
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agentProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTACT_TYPE"/>
 *     &lt;enumeration value="ADDRESS_NAME"/>
 *     &lt;enumeration value="VOICE_TERMINAL"/>
 *     &lt;enumeration value="LOGIN_STATUS"/>
 *     &lt;enumeration value="INFORMATION"/>
 *     &lt;enumeration value="READY_STATUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agentProperty")
@XmlEnum
public enum AgentProperty {

    CONTACT_TYPE,
    ADDRESS_NAME,
    VOICE_TERMINAL,
    LOGIN_STATUS,
    INFORMATION,
    READY_STATUS;

    public String value() {
        return name();
    }

    public static AgentProperty fromValue(String v) {
        return valueOf(v);
    }

}
