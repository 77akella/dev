
package com.nortel.soa.oi.cct.basenotification;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listenerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listenerType">
 *   &lt;restriction base="{http://www.nortel.com/soa/oi/cct/BaseNotification}eventType">
 *     &lt;enumeration value="CONNECTION_STATE"/>
 *     &lt;enumeration value="TERMINAL_CONNECTION_STATE"/>
 *     &lt;enumeration value="ADDRESS_PROPERTY"/>
 *     &lt;enumeration value="TERMINAL_PROPERTY"/>
 *     &lt;enumeration value="CONTACT_PROPERTY"/>
 *     &lt;enumeration value="AGENT_PROPERTY"/>
 *     &lt;enumeration value="ADDRESS_STATE"/>
 *     &lt;enumeration value="TERMINAL_STATE"/>
 *     &lt;enumeration value="AGENT_STATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listenerType")
@XmlEnum(EventType.class)
public enum ListenerType {

    CONNECTION_STATE,
    TERMINAL_CONNECTION_STATE,
    ADDRESS_PROPERTY,
    TERMINAL_PROPERTY,
    CONTACT_PROPERTY,
    AGENT_PROPERTY,
    ADDRESS_STATE,
    TERMINAL_STATE,
    AGENT_STATE;

    public String value() {
        return name();
    }

    public static ListenerType fromValue(String v) {
        return valueOf(v);
    }

}
