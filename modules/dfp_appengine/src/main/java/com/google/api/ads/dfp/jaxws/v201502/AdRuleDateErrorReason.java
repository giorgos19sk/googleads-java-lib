
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRuleDateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRuleDateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START_DATE_TIME_IS_IN_PAST"/>
 *     &lt;enumeration value="END_DATE_TIME_IS_IN_PAST"/>
 *     &lt;enumeration value="END_DATE_TIME_NOT_AFTER_START_TIME"/>
 *     &lt;enumeration value="END_DATE_TIME_TOO_LATE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdRuleDateError.Reason")
@XmlEnum
public enum AdRuleDateErrorReason {


    /**
     * 
     *                 Cannot create a new ad rule with a start date in the past.
     *               
     * 
     */
    START_DATE_TIME_IS_IN_PAST,

    /**
     * 
     *                 Cannot update an existing ad rule that has already completely passed with
     *                 a new end date that is still in the past.
     *               
     * 
     */
    END_DATE_TIME_IS_IN_PAST,

    /**
     * 
     *                 End date must be after the start date.
     *               
     * 
     */
    END_DATE_TIME_NOT_AFTER_START_TIME,

    /**
     * 
     *                 {@code DateTime}s after 1 January 2037 are not supported.
     *               
     * 
     */
    END_DATE_TIME_TOO_LATE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdRuleDateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
