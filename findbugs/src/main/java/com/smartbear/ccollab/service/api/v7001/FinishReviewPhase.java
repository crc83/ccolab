package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for finishReviewPhase complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="finishReviewPhase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reviewID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="finishedUntil" type="{http://v7001.api.service.ccollab.smartbear.com/}activityTypeSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finishReviewPhase", propOrder = {
        "reviewID",
        "finishedUntil"
})
public class FinishReviewPhase {

    protected int reviewID;
    protected ActivityTypeSpec finishedUntil;

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
     * Gets the value of the finishedUntil property.
     *
     * @return possible object is
     *         {@link ActivityTypeSpec }
     */
    public ActivityTypeSpec getFinishedUntil() {
        return finishedUntil;
    }

    /**
     * Sets the value of the finishedUntil property.
     *
     * @param value allowed object is
     *              {@link ActivityTypeSpec }
     */
    public void setFinishedUntil(ActivityTypeSpec value) {
        this.finishedUntil = value;
    }

}
