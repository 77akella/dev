
package com.nortel.soa.oi.cct.types.connectionservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NOT_RECORDING"/>
 *     &lt;enumeration value="RECORDING"/>
 *     &lt;enumeration value="REQUESTED"/>
 *     &lt;enumeration value="CANCELREQUESTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingState")
@XmlEnum
public enum RecordingState {

    UNKNOWN,
    NOT_RECORDING,
    RECORDING,
    REQUESTED,
    CANCELREQUESTED;

    public String value() {
        return name();
    }

    public static RecordingState fromValue(String v) {
        return valueOf(v);
    }

}
