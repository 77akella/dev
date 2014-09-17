package com.nortel.soa.oi.cct.terminalservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:04:43.812+03:00
 * Generated source version: 2.6.1
 *
 */
@WebServiceClient(name = "SOAOICCT_TerminalService",
                  wsdlLocation = "http://ccc-aacc-mgt:9084/SOAOICCT/services/TerminalService?wsdl",
                  targetNamespace = "http://www.nortel.com/soa/oi/cct/TerminalService")
public class SOAOICCTTerminalService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.nortel.com/soa/oi/cct/TerminalService", "SOAOICCT_TerminalService");
    public final static QName TerminalService = new QName("http://www.nortel.com/soa/oi/cct/TerminalService", "TerminalService");
    static {
        URL url = null;
        try {
            url = new URL("http://"+System.getProperty("cctServiceHostAndPort","ccc-aacc-mgt")+"/SOAOICCT/services/TerminalService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SOAOICCTTerminalService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://ccc-aacc-mgt:9084/SOAOICCT/services/TerminalService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SOAOICCTTerminalService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SOAOICCTTerminalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SOAOICCTTerminalService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SOAOICCTTerminalService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SOAOICCTTerminalService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SOAOICCTTerminalService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns TerminalService
     */
    @WebEndpoint(name = "TerminalService")
    public TerminalService getTerminalService() {
        return super.getPort(TerminalService, TerminalService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TerminalService
     */
    @WebEndpoint(name = "TerminalService")
    public TerminalService getTerminalService(WebServiceFeature... features) {
        return super.getPort(TerminalService, TerminalService.class, features);
    }

}
