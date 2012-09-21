package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activityTypeSpec.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="activityTypeSpec">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANY"/>
 *     &lt;enumeration value="AUTHOR"/>
 *     &lt;enumeration value="FILE"/>
 *     &lt;enumeration value="POKE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "activityTypeSpec")
@XmlEnum
public enum ActivityTypeSpec {

    ANY,
    AUTHOR,
    FILE,
    POKE;

    public String value() {
        return name();
    }

    public static ActivityTypeSpec fromValue(String v) {
        return valueOf(v);
    }

}
