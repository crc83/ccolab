package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for updateReview complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="updateReview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reviewID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="displayChangeListAs" type="{http://v7001.api.service.ccollab.smartbear.com/}displayChangeListAsSpec" minOccurs="0"/>
 *         &lt;element name="accessibleBy" type="{http://v7001.api.service.ccollab.smartbear.com/}reviewAccessSpec" minOccurs="0"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateReview", propOrder = {
        "reviewID",
        "title",
        "groupGuid",
        "deadline",
        "displayChangeListAs",
        "accessibleBy",
        "templateName"
})
public class UpdateReview {

    protected int reviewID;
    protected String title;
    protected String groupGuid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadline;
    protected DisplayChangeListAsSpec displayChangeListAs;
    protected ReviewAccessSpec accessibleBy;
    protected String templateName;

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
     * Gets the value of the title property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the groupGuid property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getGroupGuid() {
        return groupGuid;
    }

    /**
     * Sets the value of the groupGuid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGroupGuid(String value) {
        this.groupGuid = value;
    }

    /**
     * Gets the value of the deadline property.
     *
     * @return possible object is
     *         {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDeadline(XMLGregorianCalendar value) {
        this.deadline = value;
    }

    /**
     * Gets the value of the displayChangeListAs property.
     *
     * @return possible object is
     *         {@link DisplayChangeListAsSpec }
     */
    public DisplayChangeListAsSpec getDisplayChangeListAs() {
        return displayChangeListAs;
    }

    /**
     * Sets the value of the displayChangeListAs property.
     *
     * @param value allowed object is
     *              {@link DisplayChangeListAsSpec }
     */
    public void setDisplayChangeListAs(DisplayChangeListAsSpec value) {
        this.displayChangeListAs = value;
    }

    /**
     * Gets the value of the accessibleBy property.
     *
     * @return possible object is
     *         {@link ReviewAccessSpec }
     */
    public ReviewAccessSpec getAccessibleBy() {
        return accessibleBy;
    }

    /**
     * Sets the value of the accessibleBy property.
     *
     * @param value allowed object is
     *              {@link ReviewAccessSpec }
     */
    public void setAccessibleBy(ReviewAccessSpec value) {
        this.accessibleBy = value;
    }

    /**
     * Gets the value of the templateName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

}
