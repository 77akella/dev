
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for openNetReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="openNetReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRANSFER_OPEN_NET_INIT"/>
 *     &lt;enumeration value="CONFERENCE_OPEN_NET_INIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "openNetReason")
@XmlEnum
public enum OpenNetReason {

    TRANSFER_OPEN_NET_INIT,
    CONFERENCE_OPEN_NET_INIT;

    public String value() {
        return name();
    }

    public static OpenNetReason fromValue(String v) {
        return valueOf(v);
    }

}
