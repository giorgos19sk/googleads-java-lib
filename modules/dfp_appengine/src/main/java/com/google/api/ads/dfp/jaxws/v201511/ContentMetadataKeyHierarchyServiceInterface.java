
package com.google.api.ads.dfp.jaxws.v201511;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating, and retrieving {@link ContentMetadataKeyHierarchy}
 *       objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ContentMetadataKeyHierarchyServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContentMetadataKeyHierarchyServiceInterface {


    /**
     * 
     *         Creates new {@link ContentMetadataKeyHierarchy} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link ContentMetadataKeyHierarchy#id}</li>
     *         <li>{@link ContentMetadataKeyHierarchy#name}</li>
     *         <li>{@link ContentMetadataKeyHierarchy#hierarchyLevels}</li>
     *         </ul>
     *         
     *         @param contentMetadataKeyHierarchies the hierarchies to create
     *         @return the created hierarchies with their IDs filled in
     *       
     * 
     * @param contentMetadataKeyHierarchies
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchy>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "createContentMetadataKeyHierarchies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchyServiceInterfacecreateContentMetadataKeyHierarchies")
    @ResponseWrapper(localName = "createContentMetadataKeyHierarchiesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchyServiceInterfacecreateContentMetadataKeyHierarchiesResponse")
    public List<ContentMetadataKeyHierarchy> createContentMetadataKeyHierarchies(
        @WebParam(name = "contentMetadataKeyHierarchies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        List<ContentMetadataKeyHierarchy> contentMetadataKeyHierarchies)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ContentMetadataKeyHierarchyPage} of {@link ContentMetadataKeyHierarchy}
     *         objects that satisfy the given {@link Statement#query}. The following fields are supported
     *         for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ContentMetadataKeyHierarchy#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ContentMetadataKeyHierarchy#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ContentMetadataKeyHierarchy#status}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter a set of
     *         content metadata key hierarchies
     *         @return the content metadata key hierarchies that match the given filter
     *         @throws ApiException if the ID of the active network does not exist or there is a
     *         backend error
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchyPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "getContentMetadataKeyHierarchiesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchyServiceInterfacegetContentMetadataKeyHierarchiesByStatement")
    @ResponseWrapper(localName = "getContentMetadataKeyHierarchiesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchyServiceInterfacegetContentMetadataKeyHierarchiesByStatementResponse")
    public ContentMetadataKeyHierarchyPage getContentMetadataKeyHierarchiesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link ContentMetadataKeyHierarchy} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param contentMetadataKeyHierarchyAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of hierarchies
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param contentMetadataKeyHierarchyAction
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201511.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "performContentMetadataKeyHierarchyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchyServiceInterfaceperformContentMetadataKeyHierarchyAction")
    @ResponseWrapper(localName = "performContentMetadataKeyHierarchyActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchyServiceInterfaceperformContentMetadataKeyHierarchyActionResponse")
    public UpdateResult performContentMetadataKeyHierarchyAction(
        @WebParam(name = "contentMetadataKeyHierarchyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        ContentMetadataKeyHierarchyAction contentMetadataKeyHierarchyAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ContentMetadataKeyHierarchy} objects.
     *         
     *         @param contentMetadataKeyHierarchies the hierarchies to update
     *         @return the updated hierarchies
     *         @throws ApiException if there is an error updating the one of the hierarchies
     *       
     * 
     * @param contentMetadataKeyHierarchies
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchy>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
    @RequestWrapper(localName = "updateContentMetadataKeyHierarchies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchyServiceInterfaceupdateContentMetadataKeyHierarchies")
    @ResponseWrapper(localName = "updateContentMetadataKeyHierarchiesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", className = "com.google.api.ads.dfp.jaxws.v201511.ContentMetadataKeyHierarchyServiceInterfaceupdateContentMetadataKeyHierarchiesResponse")
    public List<ContentMetadataKeyHierarchy> updateContentMetadataKeyHierarchies(
        @WebParam(name = "contentMetadataKeyHierarchies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511")
        List<ContentMetadataKeyHierarchy> contentMetadataKeyHierarchies)
        throws ApiException_Exception
    ;

}
