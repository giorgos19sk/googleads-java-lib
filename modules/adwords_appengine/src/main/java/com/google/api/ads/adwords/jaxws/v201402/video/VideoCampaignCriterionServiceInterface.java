
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "VideoCampaignCriterionServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/video/v201402")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201402.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201402.video.ObjectFactory.class
})
public interface VideoCampaignCriterionServiceInterface {


    /**
     * 
     *         Returns the list of campaign criteria that meet the selector criteria.
     *         
     *         @param selector Determines which campaign criteria to return.
     *         @return A list of campaign criteria.
     *         @throws ApiException if problems occurred while fetching data.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.video.VideoCampaignCriterionPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/video/v201402")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/video/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.video.VideoCampaignCriterionServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/video/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.video.VideoCampaignCriterionServiceInterfacegetResponse")
    public VideoCampaignCriterionPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/video/v201402")
        VideoCampaignCriterionSelector selector)
        throws ApiException
    ;

    /**
     * 
     *         Adds or deletes campaign level criteria.
     *         NOTE: CampaignCriterionOperation does not support the SET/UPDATE operator.
     *         
     *         @param operations A list of unique operations.
     *         @return List of updated campaign criteria, in the same order as mutated.
     *         @throws ApiException if problems occurred while updating targeting group criteria.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.video.VideoCampaignCriterionReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/video/v201402")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/video/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.video.VideoCampaignCriterionServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/video/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.video.VideoCampaignCriterionServiceInterfacemutateResponse")
    public VideoCampaignCriterionReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/video/v201402")
        List<VideoCampaignCriterionOperation> operations)
        throws ApiException
    ;

}