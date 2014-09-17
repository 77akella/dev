
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="CONSULT_INIT"/>
 *     &lt;enumeration value="CONSULT_COMPLETE"/>
 *     &lt;enumeration value="TRANSFER_INIT"/>
 *     &lt;enumeration value="TRANSFER_URI_INIT"/>
 *     &lt;enumeration value="TRANSFER_OPEN_NET_INIT"/>
 *     &lt;enumeration value="TRANSFER_COMPLETE"/>
 *     &lt;enumeration value="CONFERENCE_INIT"/>
 *     &lt;enumeration value="CONFERENCE_URI_INIT"/>
 *     &lt;enumeration value="CONFERENCE_OPEN_NET_INIT"/>
 *     &lt;enumeration value="CONFERENCE_COMPLETE"/>
 *     &lt;enumeration value="BARGE_IN"/>
 *     &lt;enumeration value="OBSERVE"/>
 *     &lt;enumeration value="WHISPER"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="PARK"/>
 *     &lt;enumeration value="REDIRECT"/>
 *     &lt;enumeration value="ROUTE"/>
 *     &lt;enumeration value="SHUTDOWN"/>
 *     &lt;enumeration value="EMERGENCY"/>
 *     &lt;enumeration value="CALL_SUPERVISOR"/>
 *     &lt;enumeration value="DEFAULT_TREATMENT"/>
 *     &lt;enumeration value="FORCE_DISCONNECT"/>
 *     &lt;enumeration value="ADDRESS_REMOVAL"/>
 *     &lt;enumeration value="NOT_READY"/>
 *     &lt;enumeration value="PULL"/>
 *     &lt;enumeration value="BULK_RECORD"/>
 *     &lt;enumeration value="DEMAND_RECORD"/>
 *     &lt;enumeration value="QUALITY_RECORD"/>
 *     &lt;enumeration value="DENIED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="NO_RESPONSE"/>
 *     &lt;enumeration value="INSUFFICIENT_RESOURCES"/>
 *     &lt;enumeration value="RECORD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reason")
@XmlEnum
public enum Reason {

    DEFAULT,
    CONSULT_INIT,
    CONSULT_COMPLETE,
    TRANSFER_INIT,
    TRANSFER_URI_INIT,
    TRANSFER_OPEN_NET_INIT,
    TRANSFER_COMPLETE,
    CONFERENCE_INIT,
    CONFERENCE_URI_INIT,
    CONFERENCE_OPEN_NET_INIT,
    CONFERENCE_COMPLETE,
    BARGE_IN,
    OBSERVE,
    WHISPER,
    REJECT,
    PARK,
    REDIRECT,
    ROUTE,
    SHUTDOWN,
    EMERGENCY,
    CALL_SUPERVISOR,
    DEFAULT_TREATMENT,
    FORCE_DISCONNECT,
    ADDRESS_REMOVAL,
    NOT_READY,
    PULL,
    BULK_RECORD,
    DEMAND_RECORD,
    QUALITY_RECORD,
    DENIED,
    CANCELLED,
    NO_RESPONSE,
    INSUFFICIENT_RESOURCES,
    RECORD;

    public String value() {
        return name();
    }

    public static Reason fromValue(String v) {
        return valueOf(v);
    }

}
