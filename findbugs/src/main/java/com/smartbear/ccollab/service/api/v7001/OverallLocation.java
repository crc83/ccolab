package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for overallLocation complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="overallLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v7001.api.service.ccollab.smartbear.com/}location">
 *       &lt;sequence>
 *         &lt;element name="reviewID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overallLocation", propOrder = {
        "reviewID",
        "versionID"
})
public class OverallLocation
        extends Location {

    protected int reviewID;
    protected int versionID;

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
     * Gets the value of the versionID property.
     */
    public int getVersionID() {
        return versionID;
    }

    /**
     * Sets the value of the versionID property.
     */
    public void setVersionID(int value) {
        this.versionID = value;
    }

}
