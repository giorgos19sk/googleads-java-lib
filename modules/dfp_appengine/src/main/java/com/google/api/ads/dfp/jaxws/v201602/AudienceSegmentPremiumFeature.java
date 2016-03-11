
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A premium feature applied to audience segment targeting.
 *           
 * 
 * <p>Java class for AudienceSegmentPremiumFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceSegmentPremiumFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201602}PremiumFeature">
 *       &lt;sequence>
 *         &lt;element name="audienceSegmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceSegmentPremiumFeature", propOrder = {
    "audienceSegmentId"
})
public class AudienceSegmentPremiumFeature
    extends PremiumFeature
{

    protected Long audienceSegmentId;

    /**
     * Gets the value of the audienceSegmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAudienceSegmentId() {
        return audienceSegmentId;
    }

    /**
     * Sets the value of the audienceSegmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAudienceSegmentId(Long value) {
        this.audienceSegmentId = value;
    }

}
