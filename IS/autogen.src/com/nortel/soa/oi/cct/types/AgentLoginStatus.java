
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agentLoginStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agentLoginStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOGGED_IN"/>
 *     &lt;enumeration value="LOGGED_OUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agentLoginStatus")
@XmlEnum
public enum AgentLoginStatus {

    LOGGED_IN,
    LOGGED_OUT;

    public String value() {
        return name();
    }

    public static AgentLoginStatus fromValue(String v) {
        return valueOf(v);
    }

}
