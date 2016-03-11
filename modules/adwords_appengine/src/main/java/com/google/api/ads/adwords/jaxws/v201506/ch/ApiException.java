
package com.google.api.ads.adwords.jaxws.v201506.ch;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ApiExceptionFault", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201506")
public class ApiException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.google.api.ads.adwords.jaxws.v201506.cm.ApiException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ApiException(String message, com.google.api.ads.adwords.jaxws.v201506.cm.ApiException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ApiException(String message, com.google.api.ads.adwords.jaxws.v201506.cm.ApiException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.google.api.ads.adwords.jaxws.v201506.cm.ApiException
     */
    public com.google.api.ads.adwords.jaxws.v201506.cm.ApiException getFaultInfo() {
        return faultInfo;
    }

}
