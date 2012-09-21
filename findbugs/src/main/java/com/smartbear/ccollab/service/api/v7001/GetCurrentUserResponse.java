package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCurrentUserResponse complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="getCurrentUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://v7001.api.service.ccollab.smartbear.com/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentUserResponse", propOrder = {
        "_return"
})
public class GetCurrentUserResponse {

    @XmlElement(name = "return")
    protected User _return;

    /**
     * Gets the value of the return property.
     *
     * @return possible object is
     *         {@link User }
     */
    public User getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value allowed object is
     *              {@link User }
     */
    public void setReturn(User value) {
        this._return = value;
    }

}
