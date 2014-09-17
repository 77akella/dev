
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agentState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAPPED"/>
 *     &lt;enumeration value="UNMAPPED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agentState")
@XmlEnum
public enum AgentState {

    MAPPED,
    UNMAPPED;

    public String value() {
        return name();
    }

    public static AgentState fromValue(String v) {
        return valueOf(v);
    }

}
