package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for waitReview complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="waitReview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reviewID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="waitingUntil" type="{http://v7001.api.service.ccollab.smartbear.com/}activityTypeSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waitReview", propOrder = {
        "reviewID",
        "waitingUntil"
})
public class WaitReview {

    protected int reviewID;
    protected ActivityTypeSpec waitingUntil;

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
     * Gets the value of the waitingUntil property.
     *
     * @return possible object is
     *         {@link ActivityTypeSpec }
     */
    public ActivityTypeSpec getWaitingUntil() {
        return waitingUntil;
    }

    /**
     * Sets the value of the waitingUntil property.
     *
     * @param value allowed object is
     *              {@link ActivityTypeSpec }
     */
    public void setWaitingUntil(ActivityTypeSpec value) {
        this.waitingUntil = value;
    }

}
