
package com.google.api.ads.adwords.jaxws.v201601.express;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ProductServiceService", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601", wsdlLocation = "https://adwords.google.com/api/adwords/express/v201601/ProductServiceService?wsdl")
public class ProductServiceService
    extends Service
{

    private final static URL PRODUCTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTSERVICESERVICE_EXCEPTION;
    private final static QName PRODUCTSERVICESERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201601", "ProductServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/express/v201601/ProductServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTSERVICESERVICE_WSDL_LOCATION = url;
        PRODUCTSERVICESERVICE_EXCEPTION = e;
    }

    public ProductServiceService() {
        super(__getWsdlLocation(), PRODUCTSERVICESERVICE_QNAME);
    }

    public ProductServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ProductServiceServiceInterface
     */
    @WebEndpoint(name = "ProductServiceServiceInterfacePort")
    public ProductServiceServiceInterface getProductServiceServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/express/v201601", "ProductServiceServiceInterfacePort"), ProductServiceServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductServiceServiceInterface
     */
    @WebEndpoint(name = "ProductServiceServiceInterfacePort")
    public ProductServiceServiceInterface getProductServiceServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/express/v201601", "ProductServiceServiceInterfacePort"), ProductServiceServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTSERVICESERVICE_EXCEPTION!= null) {
            throw PRODUCTSERVICESERVICE_EXCEPTION;
        }
        return PRODUCTSERVICESERVICE_WSDL_LOCATION;
    }

}
