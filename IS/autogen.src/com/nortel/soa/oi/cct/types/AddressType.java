
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="addressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="OUT_OF_PROVIDER"/>
 *     &lt;enumeration value="NETWORK_ROUTE_POINT"/>
 *     &lt;enumeration value="ROUTE_POINT"/>
 *     &lt;enumeration value="TREATMENT"/>
 *     &lt;enumeration value="GENERIC"/>
 *     &lt;enumeration value="LANDING_PAD"/>
 *     &lt;enumeration value="DNIS_LANDING_PAD"/>
 *     &lt;enumeration value="DNIS"/>
 *     &lt;enumeration value="AGENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "addressType")
@XmlEnum
public enum AddressType {

    UNDEFINED,
    OUT_OF_PROVIDER,
    NETWORK_ROUTE_POINT,
    ROUTE_POINT,
    TREATMENT,
    GENERIC,
    LANDING_PAD,
    DNIS_LANDING_PAD,
    DNIS,
    AGENT;

    public String value() {
        return name();
    }

    public static AddressType fromValue(String v) {
        return valueOf(v);
    }

}
