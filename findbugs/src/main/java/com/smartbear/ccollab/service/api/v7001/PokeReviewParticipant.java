package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pokeReviewParticipant complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="pokeReviewParticipant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reviewID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="participantLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pokeReviewParticipant", propOrder = {
        "reviewID",
        "participantLogin"
})
public class PokeReviewParticipant {

    protected int reviewID;
    protected String participantLogin;

    /**
     * Gets the value of the reviewID property.
     */
    public int getReviewID() {
        return reviewID;
    }

    /**
     * Sets the value of the reviewID property.
     */
    public void setReviewID(int value) {
        this.reviewID = value;
    }

    /**
     * Gets the value of the participantLogin property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getParticipantLogin() {
        return participantLogin;
    }

    /**
     * Sets the value of the participantLogin property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setParticipantLogin(String value) {
        this.participantLogin = value;
    }

}
