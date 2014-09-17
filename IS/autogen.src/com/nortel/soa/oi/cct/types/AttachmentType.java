
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attachmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="attachmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BINARY"/>
 *     &lt;enumeration value="KEY_VALUE_PAIRS"/>
 *     &lt;enumeration value="STRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "attachmentType")
@XmlEnum
public enum AttachmentType {

    BINARY,
    KEY_VALUE_PAIRS,
    STRING;

    public String value() {
        return name();
    }

    public static AttachmentType fromValue(String v) {
        return valueOf(v);
    }

}
