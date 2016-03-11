
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATTRIBUTE_NAMES_NOT_UNIQUE"/>
 *     &lt;enumeration value="ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES"/>
 *     &lt;enumeration value="CANNOT_CHANGE_ORIGIN"/>
 *     &lt;enumeration value="CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED"/>
 *     &lt;enumeration value="CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED"/>
 *     &lt;enumeration value="CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED"/>
 *     &lt;enumeration value="CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS"/>
 *     &lt;enumeration value="FEED_REMOVED"/>
 *     &lt;enumeration value="INVALID_ORIGIN_VALUE"/>
 *     &lt;enumeration value="FEED_ORIGIN_IS_NOT_USER"/>
 *     &lt;enumeration value="DUPLICATE_FEED_NAME"/>
 *     &lt;enumeration value="INVALID_FEED_NAME"/>
 *     &lt;enumeration value="MISSING_OAUTH_INFO"/>
 *     &lt;enumeration value="NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY"/>
 *     &lt;enumeration value="TOO_MANY_FEED_ATTRIBUTES_FOR_FEED"/>
 *     &lt;enumeration value="INVALID_BUSINESS_ACCOUNT"/>
 *     &lt;enumeration value="BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedError.Reason")
@XmlEnum
public enum FeedErrorReason {


    /**
     * 
     *                 The names of the FeedAttributes must be unique.
     *               
     * 
     */
    ATTRIBUTE_NAMES_NOT_UNIQUE,

    /**
     * 
     *                 The attribute list must be an exact copy of the existing list if the attribute id's are
     *                 present.
     *               
     * 
     */
    ATTRIBUTES_DO_NOT_MATCH_EXISTING_ATTRIBUTES,

    /**
     * 
     *                 Origin can only be set during Feed creation.
     *               
     * 
     */
    CANNOT_CHANGE_ORIGIN,

    /**
     * 
     *                 Cannot specify USER origin for a system generated feed.
     *               
     * 
     */
    CANNOT_SPECIFY_USER_ORIGIN_FOR_SYSTEM_FEED,

    /**
     * 
     *                 Cannot specify ADWORDS origin for a non-system generated feed.
     *               
     * 
     */
    CANNOT_SPECIFY_ADWORDS_ORIGIN_FOR_NON_SYSTEM_FEED,

    /**
     * 
     *                 Cannot specify feed attributes for system feed.
     *               
     * 
     */
    CANNOT_SPECIFY_FEED_ATTRIBUTES_FOR_SYSTEM_FEED,

    /**
     * 
     *                 Cannot update FeedAttributes on feed with origin adwords.
     *               
     * 
     */
    CANNOT_UPDATE_FEED_ATTRIBUTES_WITH_ORIGIN_ADWORDS,

    /**
     * 
     *                 The given id refers to a removed Feed. Removed Feeds are immutable.
     *               
     * 
     */
    FEED_REMOVED,

    /**
     * 
     *                 The origin of the feed is not valid for the client.
     *               
     * 
     */
    INVALID_ORIGIN_VALUE,

    /**
     * 
     *                 A user can only create and modify feeds with user origin.
     *               
     * 
     */
    FEED_ORIGIN_IS_NOT_USER,

    /**
     * 
     *                 Feed name matches that of another active Feed.
     *               
     * 
     */
    DUPLICATE_FEED_NAME,

    /**
     * 
     *                 Name of feed is not allowed.
     *               
     * 
     */
    INVALID_FEED_NAME,

    /**
     * 
     *                 Missing OAuthInfo
     *               
     * 
     */
    MISSING_OAUTH_INFO,

    /**
     * 
     *                 New FeedAttributes must not effect the unique key.
     *               
     * 
     */
    NEW_ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY,

    /**
     * 
     *                 Too many FeedAttributes for a Feed.
     *               
     * 
     */
    TOO_MANY_FEED_ATTRIBUTES_FOR_FEED,

    /**
     * 
     *                 The business account is not valid.
     *               
     * 
     */
    INVALID_BUSINESS_ACCOUNT,

    /**
     * 
     *                 Business account cannot access Google My Business account.
     *               
     * 
     */
    BUSINESS_ACCOUNT_CANNOT_ACCESS_LOCATION_ACCOUNT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FeedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
