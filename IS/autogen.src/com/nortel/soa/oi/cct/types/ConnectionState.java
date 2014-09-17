
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="connectionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="ALERTING"/>
 *     &lt;enumeration value="ANCHORED"/>
 *     &lt;enumeration value="CONTROLLED"/>
 *     &lt;enumeration value="DIALING"/>
 *     &lt;enumeration value="DISCONNECTED"/>
 *     &lt;enumeration value="ESTABLISHED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="IDLE"/>
 *     &lt;enumeration value="INITIATED"/>
 *     &lt;enumeration value="NETWORK_ALERTING"/>
 *     &lt;enumeration value="NETWORK_REACHED"/>
 *     &lt;enumeration value="OFFERED"/>
 *     &lt;enumeration value="PARKED"/>
 *     &lt;enumeration value="RETRIEVING"/>
 *     &lt;enumeration value="ROUTING"/>
 *     &lt;enumeration value="QUEUED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "connectionState")
@XmlEnum
public enum ConnectionState {

    ACTIVE,
    ALERTING,
    ANCHORED,
    CONTROLLED,
    DIALING,
    DISCONNECTED,
    ESTABLISHED,
    FAILED,
    IDLE,
    INITIATED,
    NETWORK_ALERTING,
    NETWORK_REACHED,
    OFFERED,
    PARKED,
    RETRIEVING,
    ROUTING,
    QUEUED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ConnectionState fromValue(String v) {
        return valueOf(v);
    }

}
