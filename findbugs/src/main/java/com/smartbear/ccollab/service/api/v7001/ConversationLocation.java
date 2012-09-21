package com.smartbear.ccollab.service.api.v7001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conversationLocation complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="conversationLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v7001.api.service.ccollab.smartbear.com/}location">
 *       &lt;sequence>
 *         &lt;element name="conversationID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversationLocation", propOrder = {
        "conversationID"
})
public class ConversationLocation
        extends Location {

    protected int conversationID;

    /**
     * Gets the value of the conversationID property.
     */
    public int getConversationID() {
        return conversationID;
    }

    /**
     * Sets the value of the conversationID property.
     */
    public void setConversationID(int value) {
        this.conversationID = value;
    }

}
