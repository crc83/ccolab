package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayChangeListAsSpec.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="displayChangeListAsSpec">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE"/>
 *     &lt;enumeration value="DISTINCT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "displayChangeListAsSpec")
@XmlEnum
public enum DisplayChangeListAsSpec {

    SINGLE,
    DISTINCT;

    public String value() {
        return name();
    }

    public static DisplayChangeListAsSpec fromValue(String v) {
        return valueOf(v);
    }

}
