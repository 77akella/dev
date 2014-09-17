
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemEvent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="systemEvent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONNECTION_FAILURE"/>
 *     &lt;enumeration value="SUBSCRIPTION_TERMINATION"/>
 *     &lt;enumeration value="SUBSCRIPTION_TERMINATION_IMMINENT"/>
 *     &lt;enumeration value="SESSION_TERMINATION"/>
 *     &lt;enumeration value="SESSION_TERMINATION_IMMINENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "systemEvent")
@XmlEnum
public enum SystemEvent {

    CONNECTION_FAILURE,
    SUBSCRIPTION_TERMINATION,
    SUBSCRIPTION_TERMINATION_IMMINENT,
    SESSION_TERMINATION,
    SESSION_TERMINATION_IMMINENT;

    public String value() {
        return name();
    }

    public static SystemEvent fromValue(String v) {
        return valueOf(v);
    }

}
