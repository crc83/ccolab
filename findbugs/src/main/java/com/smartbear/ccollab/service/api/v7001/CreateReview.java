package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createReview complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="createReview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userlogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createReview", propOrder = {
        "userlogin"
})
public class CreateReview {

    protected String userlogin;

    /**
     * Gets the value of the userlogin property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUserlogin() {
        return userlogin;
    }

    /**
     * Sets the value of the userlogin property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserlogin(String value) {
        this.userlogin = value;
    }

}
