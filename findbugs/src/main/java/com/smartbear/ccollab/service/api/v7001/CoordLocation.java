package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coordLocation complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="coordLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v7001.api.service.ccollab.smartbear.com/}location">
 *       &lt;sequence>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reviewID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="versionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coordLocation", propOrder = {
        "page",
        "reviewID",
        "versionID",
        "x",
        "y"
})
public class CoordLocation
        extends Location {

    protected int page;
    protected int reviewID;
    protected int versionID;
    protected int x;
    protected int y;

    /**
     * Gets the value of the page property.
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     */
    public void setPage(int value) {
        this.page = value;
    }

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

    /**
     * Gets the value of the x property.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     */
    public void setY(int value) {
        this.y = value;
    }

}
