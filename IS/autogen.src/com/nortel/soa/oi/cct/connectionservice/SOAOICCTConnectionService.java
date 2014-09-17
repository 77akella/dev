package com.nortel.soa.oi.cct.connectionservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-01-31T11:02:30.437+03:00
 * Generated source version: 2.6.1
 *
 */
@WebServiceClient(name = "SOAOICCT_ConnectionService",
                  wsdlLocation = "http://ccc-aacc-mgt:9084/SOAOICCT/services/ConnectionService?wsdl",
                  targetNamespace = "http://www.nortel.com/soa/oi/cct/ConnectionService")
public class SOAOICCTConnectionService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.nortel.com/soa/oi/cct/ConnectionService", "SOAOICCT_ConnectionService");
    public final static QName ConnectionService = new QName("http://www.nortel.com/soa/oi/cct/ConnectionService", "ConnectionService");
    static {
        URL url = null;
        try {
            url = new URL("http://"+System.getProperty("cctServiceHostAndPort","ccc-aacc-mgt")+"/SOAOICCT/services/ConnectionService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SOAOICCTConnectionService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://ccc-aacc-mgt:9084/SOAOICCT/services/ConnectionService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SOAOICCTConnectionService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SOAOICCTConnectionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SOAOICCTConnectionService() {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SOAOICCTConnectionService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SOAOICCTConnectionService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SOAOICCTConnectionService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConnectionService
     */
    @WebEndpoint(name = "ConnectionService")
    public ConnectionService getConnectionService() {
        return super.getPort(ConnectionService, ConnectionService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConnectionService
     */
    @WebEndpoint(name = "ConnectionService")
    public ConnectionService getConnectionService(WebServiceFeature... features) {
        return super.getPort(ConnectionService, ConnectionService.class, features);
    }

}