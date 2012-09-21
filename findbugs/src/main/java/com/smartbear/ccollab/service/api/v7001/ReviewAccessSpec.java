package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reviewAccessSpec.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="reviewAccessSpec">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANYONE"/>
 *     &lt;enumeration value="GROUP_OR_PARTICIPANTS"/>
 *     &lt;enumeration value="GROUP"/>
 *     &lt;enumeration value="PARTICIPANTS"/>
 *     &lt;enumeration value="GROUP_PARTICIPANTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "reviewAccessSpec")
@XmlEnum
public enum ReviewAccessSpec {

    ANYONE,
    GROUP_OR_PARTICIPANTS,
    GROUP,
    PARTICIPANTS,
    GROUP_PARTICIPANTS;

    public String value() {
        return name();
    }

    public static ReviewAccessSpec fromValue(String v) {
        return valueOf(v);
    }

}
