
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentReadyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agentReadyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="READY"/>
 *     &lt;enumeration value="NOT_READY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agentReadyStatus")
@XmlEnum
public enum AgentReadyStatus {

    READY,
    NOT_READY;

    public String value() {
        return name();
    }

    public static AgentReadyStatus fromValue(String v) {
        return valueOf(v);
    }

}
