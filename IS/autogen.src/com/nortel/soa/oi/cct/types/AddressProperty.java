
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="addressProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FORWARDING"/>
 *     &lt;enumeration value="DO_NOT_DISTURB"/>
 *     &lt;enumeration value="MESSAGE_WAITING"/>
 *     &lt;enumeration value="ADDRESS_TERMINAL_ASSOCIATION"/>
 *     &lt;enumeration value="ACQUIRE_STATUS"/>
 *     &lt;enumeration value="URI"/>
 *     &lt;enumeration value="CONTROLLED"/>
 *     &lt;enumeration value="PRESENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "addressProperty")
@XmlEnum
public enum AddressProperty {

    FORWARDING,
    DO_NOT_DISTURB,
    MESSAGE_WAITING,
    ADDRESS_TERMINAL_ASSOCIATION,
    ACQUIRE_STATUS,
    URI,
    CONTROLLED,
    PRESENCE;

    public String value() {
        return name();
    }

    public static AddressProperty fromValue(String v) {
        return valueOf(v);
    }

}
