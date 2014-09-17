
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resourceState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resourceState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_SERVICE"/>
 *     &lt;enumeration value="OUT_OF_SERVICE"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resourceState")
@XmlEnum
public enum ResourceState {

    IN_SERVICE,
    OUT_OF_SERVICE,
    INVALID,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ResourceState fromValue(String v) {
        return valueOf(v);
    }

}
