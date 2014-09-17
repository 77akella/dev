/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Artem
 */
@WebServlet(name = "Logger", urlPatterns = {"/Logger"})
public class Logger extends HttpServlet {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Logger.class);
    //    @EJB
//    private EventLoggerFacade facade;
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Map<String,String[]> parMap=request.getParameterMap();
        for(String key:parMap.keySet()){
            for(String val:parMap.get(key)){
                logger.info("[Logger Servlet] ------------'{}' -> '{}'", new Object[]{key, val});
            }
        }
//        EventLogger eventLogger=new EventLogger();
//        if(parMap.containsKey("level")){
//            eventLogger.setLogLevel(parMap.get("level")[0]);
//        }
//        if(parMap.containsKey("src")){
//            eventLogger.setSrc(parMap.get("src")[0]);
//        }
//        StringBuilder msg=new StringBuilder();
//            for(String key:parMap.keySet()){
//                for(String val:parMap.get(key)){
//                    try {
//                        java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.INFO,"[Logger Servlet] ------------"+key+" - "+val);
//                        if(key.equals("scenarioId")){
//                            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.INFO,"[Logger Servlet] ------sc------"+key+" - "+val);
//                        eventLogger.setScenarioId(Long.valueOf(val));
//                        continue;
//                        }
//                        if(key.equals("campaignId")){
//                            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.INFO,"[Logger Servlet] ------ca------"+key+" - "+val);
//                        eventLogger.setCampaignId(Long.valueOf(val));
//                        continue;
//                        }
//                        if(key.equals("strategyId")){
//                            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.INFO,"[Logger Servlet] ------st------"+key+" - "+val);
//                        eventLogger.setStrategyId(Long.valueOf(val));
//                        continue;
//                        }
//                        if(key.equals("callJobId")){
//                            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.INFO,"[Logger Servlet] -------callJobId-----"+key+" - "+val);
//                        eventLogger.setCallJobId(Long.valueOf(val));
//                        continue;
//                        }
//                        if(key.equals("sessionId")){
//                            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.INFO,"[Logger Servlet] ------sessionId------"+key+" - "+val);
//                        eventLogger.setSessionKey(val);
//                        continue;
//                        }
//                        if(key.equals("contactListId")){
//                            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.INFO,"[Logger Servlet] -------contactListId-----"+key+" - "+val);
//                        eventLogger.setContactListId(Long.valueOf(val));
//                        }
//                        msg.append(key).append(":: ").append(val).append("\n");
//                    } catch (Exception e) {
//                    }
//                }
//            }
//        eventLogger.setMsg(msg.toString());
//        facade.create(eventLogger);


        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<?xml version=\"1.0\" ?>");
            out.println("<xml>");
            out.println("</xml>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
