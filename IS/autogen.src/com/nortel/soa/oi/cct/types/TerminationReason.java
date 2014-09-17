
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminationReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terminationReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SESSION_TERMINATION"/>
 *     &lt;enumeration value="SUBSCRIPTION_TERMINATION"/>
 *     &lt;enumeration value="UNEXPECTED_TERMINATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "terminationReason")
@XmlEnum
public enum TerminationReason {

    SESSION_TERMINATION,
    SUBSCRIPTION_TERMINATION,
    UNEXPECTED_TERMINATION;

    public String value() {
        return name();
    }

    public static TerminationReason fromValue(String v) {
        return valueOf(v);
    }

}
