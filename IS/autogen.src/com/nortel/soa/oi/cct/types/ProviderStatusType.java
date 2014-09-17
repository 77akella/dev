
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="providerStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STARTUP"/>
 *     &lt;enumeration value="FAILURE_MASTER_APPLICATION"/>
 *     &lt;enumeration value="FAILURE_SUPPORTING_APPLICATION"/>
 *     &lt;enumeration value="RESTART"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "providerStatusType")
@XmlEnum
public enum ProviderStatusType {

    STARTUP,
    FAILURE_MASTER_APPLICATION,
    FAILURE_SUPPORTING_APPLICATION,
    RESTART;

    public String value() {
        return name();
    }

    public static ProviderStatusType fromValue(String v) {
        return valueOf(v);
    }

}
