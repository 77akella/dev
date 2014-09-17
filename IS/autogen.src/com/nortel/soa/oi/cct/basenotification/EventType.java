
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="CONNECTION_STATE"/>
 *     &lt;enumeration value="TERMINAL_CONNECTION_STATE"/>
 *     &lt;enumeration value="ADDRESS_PROPERTY"/>
 *     &lt;enumeration value="TERMINAL_PROPERTY"/>
 *     &lt;enumeration value="CONTACT_PROPERTY"/>
 *     &lt;enumeration value="AGENT_PROPERTY"/>
 *     &lt;enumeration value="ADDRESS_STATE"/>
 *     &lt;enumeration value="TERMINAL_STATE"/>
 *     &lt;enumeration value="AGENT_STATE"/>
 *     &lt;enumeration value="SERVICE_PROVIDER_STATUS"/>
 *     &lt;enumeration value="FORCE_DISCONNECT"/>
 *     &lt;enumeration value="DEFAULT_TREATMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eventType")
@XmlEnum
public enum EventType {

    SYSTEM,
    CONNECTION_STATE,
    TERMINAL_CONNECTION_STATE,
    ADDRESS_PROPERTY,
    TERMINAL_PROPERTY,
    CONTACT_PROPERTY,
    AGENT_PROPERTY,
    ADDRESS_STATE,
    TERMINAL_STATE,
    AGENT_STATE,
    SERVICE_PROVIDER_STATUS,
    FORCE_DISCONNECT,
    DEFAULT_TREATMENT;

    public String value() {
        return name();
    }

    public static EventType fromValue(String v) {
        return valueOf(v);
    }

}
