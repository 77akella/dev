
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presenceActivity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="presenceActivity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="ON_THE_PHONE"/>
 *     &lt;enumeration value="MEAL"/>
 *     &lt;enumeration value="AWAY"/>
 *     &lt;enumeration value="HOLIDAY"/>
 *     &lt;enumeration value="PERM_ABSENCE"/>
 *     &lt;enumeration value="DO_NOT_DISTURB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "presenceActivity")
@XmlEnum
public enum PresenceActivity {

    @XmlEnumValue("None")
    NONE("None"),
    AVAILABLE("AVAILABLE"),
    ON_THE_PHONE("ON_THE_PHONE"),
    MEAL("MEAL"),
    AWAY("AWAY"),
    HOLIDAY("HOLIDAY"),
    PERM_ABSENCE("PERM_ABSENCE"),
    DO_NOT_DISTURB("DO_NOT_DISTURB");
    private final String value;

    PresenceActivity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresenceActivity fromValue(String v) {
        for (PresenceActivity c: PresenceActivity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
