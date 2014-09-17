
package com.nortel.soa.oi.cct.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactProperty.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contactProperty">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTACT"/>
 *     &lt;enumeration value="CONFERENCE_INIT"/>
 *     &lt;enumeration value="CONFERENCE_COMPLETE"/>
 *     &lt;enumeration value="BLIND_TRANSFER_COMPLETE"/>
 *     &lt;enumeration value="SUPERVISED_TRANSFER_INIT"/>
 *     &lt;enumeration value="SUPERVISED_TRANSFER_COMPLETE"/>
 *     &lt;enumeration value="CONSULT"/>
 *     &lt;enumeration value="ATTACHED_DATA"/>
 *     &lt;enumeration value="NETWORK_DIALED_ADDRESS"/>
 *     &lt;enumeration value="SPEXTERNAL_ID"/>
 *     &lt;enumeration value="UUI"/>
 *     &lt;enumeration value="CONTACT_TYPE"/>
 *     &lt;enumeration value="CALLED_ALIAS"/>
 *     &lt;enumeration value="CALLED_ADDRESS"/>
 *     &lt;enumeration value="CALLING_ADDRESS"/>
 *     &lt;enumeration value="CALLING_TERMINAL"/>
 *     &lt;enumeration value="LAST_REDIRECTED_ADDRESS"/>
 *     &lt;enumeration value="CCM_ID"/>
 *     &lt;enumeration value="INTRINSICS"/>
 *     &lt;enumeration value="ROUTE"/>
 *     &lt;enumeration value="NODE_ID"/>
 *     &lt;enumeration value="SOURCE_SITE_GROUP_ID"/>
 *     &lt;enumeration value="TARGET_AGENT_POSITION_ID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contactProperty")
@XmlEnum
public enum ContactProperty {

    CONTACT,
    CONFERENCE_INIT,
    CONFERENCE_COMPLETE,
    BLIND_TRANSFER_COMPLETE,
    SUPERVISED_TRANSFER_INIT,
    SUPERVISED_TRANSFER_COMPLETE,
    CONSULT,
    ATTACHED_DATA,
    NETWORK_DIALED_ADDRESS,
    SPEXTERNAL_ID,
    UUI,
    CONTACT_TYPE,
    CALLED_ALIAS,
    CALLED_ADDRESS,
    CALLING_ADDRESS,
    CALLING_TERMINAL,
    LAST_REDIRECTED_ADDRESS,
    CCM_ID,
    INTRINSICS,
    ROUTE,
    NODE_ID,
    SOURCE_SITE_GROUP_ID,
    TARGET_AGENT_POSITION_ID;

    public String value() {
        return name();
    }

    public static ContactProperty fromValue(String v) {
        return valueOf(v);
    }

}
