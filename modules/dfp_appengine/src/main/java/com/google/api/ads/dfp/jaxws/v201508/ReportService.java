
package com.google.api.ads.dfp.jaxws.v201508;

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
@WebServiceClient(name = "ReportService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201508", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201508/ReportService?wsdl")
public class ReportService
    extends Service
{

    private final static URL REPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException REPORTSERVICE_EXCEPTION;
    private final static QName REPORTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201508", "ReportService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201508/ReportService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REPORTSERVICE_WSDL_LOCATION = url;
        REPORTSERVICE_EXCEPTION = e;
    }

    public ReportService() {
        super(__getWsdlLocation(), REPORTSERVICE_QNAME);
    }

    public ReportService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ReportServiceInterface
     */
    @WebEndpoint(name = "ReportServiceInterfacePort")
    public ReportServiceInterface getReportServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201508", "ReportServiceInterfacePort"), ReportServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportServiceInterface
     */
    @WebEndpoint(name = "ReportServiceInterfacePort")
    public ReportServiceInterface getReportServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201508", "ReportServiceInterfacePort"), ReportServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REPORTSERVICE_EXCEPTION!= null) {
            throw REPORTSERVICE_EXCEPTION;
        }
        return REPORTSERVICE_WSDL_LOCATION;
    }

}
