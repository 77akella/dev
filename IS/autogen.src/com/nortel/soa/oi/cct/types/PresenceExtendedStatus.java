
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presenceExtendedStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="presenceExtendedStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXT_UNREACHABLE"/>
 *     &lt;enumeration value="EXT_REACHABLE"/>
 *     &lt;enumeration value="EXT_BUSY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "presenceExtendedStatus")
@XmlEnum
public enum PresenceExtendedStatus {

    EXT_UNREACHABLE,
    EXT_REACHABLE,
    EXT_BUSY;

    public String value() {
        return name();
    }

    public static PresenceExtendedStatus fromValue(String v) {
        return valueOf(v);
    }

}
