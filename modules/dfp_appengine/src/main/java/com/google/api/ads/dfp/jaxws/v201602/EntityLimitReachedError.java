
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error that occurs when creating an entity if the limit on the number of allowed entities for
 *             a network has already been reached.
 *           
 * 
 * <p>Java class for EntityLimitReachedError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityLimitReachedError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201602}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201602}EntityLimitReachedError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityLimitReachedError", propOrder = {
    "reason"
})
public class EntityLimitReachedError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected EntityLimitReachedErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link EntityLimitReachedErrorReason }
     *     
     */
    public EntityLimitReachedErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityLimitReachedErrorReason }
     *     
     */
    public void setReason(EntityLimitReachedErrorReason value) {
        this.reason = value;
    }

}
