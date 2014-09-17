
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="entityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="TERMINAL"/>
 *     &lt;enumeration value="AGENT"/>
 *     &lt;enumeration value="PROVIDER"/>
 *     &lt;enumeration value="USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "entityType")
@XmlEnum
public enum EntityType {

    ADDRESS,
    TERMINAL,
    AGENT,
    PROVIDER,
    USER;

    public String value() {
        return name();
    }

    public static EntityType fromValue(String v) {
        return valueOf(v);
    }

}
