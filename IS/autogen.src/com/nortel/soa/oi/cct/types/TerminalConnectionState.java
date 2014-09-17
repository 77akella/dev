
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminalConnectionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terminalConnectionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IDLE"/>
 *     &lt;enumeration value="RINGING"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="HELD"/>
 *     &lt;enumeration value="AUTOHELD"/>
 *     &lt;enumeration value="INUSE"/>
 *     &lt;enumeration value="BRIDGED"/>
 *     &lt;enumeration value="DROPPED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "terminalConnectionState")
@XmlEnum
public enum TerminalConnectionState {

    IDLE,
    RINGING,
    ACTIVE,
    HELD,
    AUTOHELD,
    INUSE,
    BRIDGED,
    DROPPED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static TerminalConnectionState fromValue(String v) {
        return valueOf(v);
    }

}
