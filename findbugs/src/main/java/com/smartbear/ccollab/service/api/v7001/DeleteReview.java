package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteReview complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="deleteReview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reviewID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteReview", propOrder = {
        "reviewID"
})
public class DeleteReview {

    protected int reviewID;

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

}
