package ua.com.AACC.is.http;

import com.nortel.soa.oi.cct.sessionservice.SessionNotCreatedException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class AbstractXMLServlet extends HttpServlet {

    private final static Logger logger = LoggerFactory.getLogger(AbstractXMLServlet.class);

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.debug("-------------------------{} {}", request.getRequestURI(), request.getQueryString());
        logger.debug("Request from {}", request.getRemoteAddr());

        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "1");
        response.setContentType("text/xml;charset=utf-8");
        long startTimeStamp = System.currentTimeMillis();
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();
        out.println("<?xml version=\"1.0\"?>");
        out.println("<is>");
        out.println("<response>");
        String agentLoginId = null;
        if (request.getParameter("agentLoginID") != null) {
            agentLoginId = request.getParameter("agentLoginID");
        }
        try {
            if (agentLoginId == null) {
                throw new Exception("3", new Exception("Parameters validation failed: agentLoginID==null"));
            }
            out.println("<agentLoginId>" + agentLoginId + "</agentLoginId>");
            out.println(handleAction(agentLoginId, request));
            out.println("<errorCode>0</errorCode>");
            out.println("<errorDesc></errorDesc>");
        } catch (javax.xml.ws.WebServiceException | com.nortel.soa.oi.cct.agentservice.SessionNotCreatedException | SessionNotCreatedException | com.nortel.soa.oi.cct.agentterminalservice.SessionNotCreatedException wse) {
            String errorDesc = wse.getMessage() != null ? wse.getMessage() : "No information";
            out.println("<errorCode>4</errorCode>");
            out.println("<errorDesc> Connection to CCT lost: " + errorDesc + "</errorDesc>");
            logger.error("Failed to process request '{}' with parameters '{}' for agent '{}' from ip {}",
                    request.getRequestURI(), request.getQueryString(), agentLoginId, request.getRemoteAddr());
            logger.info(wse.getMessage(), wse);
        } catch (Exception e) {
            String errorCode = e.getMessage();
            String errorDesc = e.getCause() != null ? e.getCause().getMessage() : "No information";
            out.println("<errorCode>" + errorCode + "</errorCode>");
            out.println("<errorDesc>" + errorDesc + "</errorDesc>");
            logger.warn("Failed to process request '{}' with parameters '{}' for agent '{}' from ip {}",
                    request.getRequestURI(), request.getQueryString(), agentLoginId, request.getRemoteAddr());
            logger.info(e.getMessage(), e);
        } finally {
            out.println("</response>");
            out.println("<start>" + startTimeStamp + "</start>");
            out.println("<end>" + System.currentTimeMillis() + "</end>");
            out.println("<responseTime>" + (System.currentTimeMillis() - startTimeStamp) + "</responseTime>");
            out.print("</is>");
            out.close();
            logger.info("Request {} from {} with parameters {} handaled in {} miliseconds",
                    request.getRequestURI(),request.getRemoteAddr(),request.getParameterMap(),System.currentTimeMillis() - startTimeStamp);
        }
    }

    /**
     * Handle action using parameters from request
     *
     * @param request
     * @return XML response if needed
     * @throws Exception. e.getMessage() contains errorCode
     */
    public abstract String handleAction(String agentLoginId, HttpServletRequest request) throws Exception;
}