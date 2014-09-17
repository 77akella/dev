/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Interaction;
import ua.com.ivrManager.ejb.entity.InteractionResults;
import ua.com.ivrManager.ejb.session.InteractionFacade;

/**
 *
 * @author Artem
 */
@WebServlet(name = "Submit", urlPatterns = {"/Submit"})
public class Submit extends HttpServlet {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Submit.class);
    @EJB
    private InteractionFacade interactionFacade;

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
        logger.info("[Submit vxml Servlet] called Submit servlet");

        Map<String, String[]> parMap = request.getParameterMap();
        if (parMap.containsKey("interId")) {
            Map<Integer, InteractionResults> resultsMap = new HashMap<Integer, InteractionResults>();
            Interaction interaction = interactionFacade.find(Long.valueOf(request.getParameter("interId")));
//      Todo: check for duplicate interaction results, if needed
            //            if(interaction.get)
            if (parMap.containsKey("session___dnis")) {
                interaction.setDnis(request.getParameter("session___dnis"));
            }
            for (String key : parMap.keySet()) {
                for (String val : parMap.get(key)) {
                    try {
                        if (key.equals("wrapUpCode")) {
                            logger.info("[Submit vxml Servlet] ------wrapUpCode------'{}' - '{}'", new Object[]{key, val});
                            interaction.setWrapUpCode(interactionFacade.findWrapUpCode(Long.valueOf(val)));
                            continue;
                        }
                        if (key.equals("sessionId")) {
                            logger.info("[Submit vxml Servlet] ------sessionId------'{}' - '{}'", new Object[]{key, val});
                            interaction.setSessionId(val);
                            continue;
                        }
                        if (key.equals("callFlowId")&&interaction.getCallFlow()==null) {
                            logger.info("[Submit vxml Servlet] ------CallFlow------'{}' - '{}'", new Object[]{key, val});
                            interaction.setCallFlow(interactionFacade.findCallFlow(Long.valueOf(val)));
                            continue;
                        }
                        if (key.equals("session___ani")) {
                            logger.info("[Submit vxml Servlet] -------ani-----'{}' - '{}'", new Object[]{key, val});
                            interaction.setAni(val);
                            continue;
                        }
                        if (key.equals("session___ucid")) {
                            logger.info("[Submit vxml Servlet] -------ucid-----'{}' - '{}'", new Object[]{key, val});
                            interaction.setUcid(val);
                            continue;
                        }
                        if (key.startsWith("results.")) {

                            resultsMap = processResults(interaction,resultsMap, key, val);
                        }
                        logger.debug("[Submit vxml Servlet] ------------'{}' - '{}'", new Object[]{key, val});
//                            if(!key.startsWith("session__")&&!key.startsWith("redirectinfo___")&&!key.startsWith("shareduui___")){
//                                resultVars.put(key, val);
//                            }
                    } catch (Exception e) {
                        logger.error("[Submit vxml Servlet] error submiting call", e);
                    }
                }
            }
            interaction.setResultVars(new ArrayList<InteractionResults>(resultsMap.values()));
            interaction.setProcessing(false);
            interaction.setEnded(true);
            if (interaction.getStartDate() != null) {
                interaction.setDuration((int) (System.currentTimeMillis() - interaction.getStartDate().getTime()) / 1000);
            }
            interaction.setModDate(new Date());
            interactionFacade.edit(interaction);
        }
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "1");
//            response.setContentType("application/voicexml+xml");

        PrintWriter out = response.getWriter();
        try {
            out.println("<?xml version=\"1.0\" ?>");
            out.println("<xml>");
            out.println("<response>ok</response>");
            out.println("</xml>");
        } finally {
            out.close();
        }
    }

    private Map<Integer, InteractionResults> processResults(Interaction interaction,Map<Integer, InteractionResults> resultsMap, String key, String val) {
        String[] attr = key.split("\\.");
        Integer id = Integer.valueOf(attr[1]);
        if (!resultsMap.containsKey(id)) {
            resultsMap.put(id, new InteractionResults(id, interaction, interaction.getCallFlow(), interaction.getCampaign(), interaction.getContactList()));
        }
        //stepCount : stepCount , varId:varId , resultVal:resultVal , timeFromStart : ((new Date).getTime()-startTime) , changeValTime : changeValTime , resultCount:prevResult.count , resultTime:prevResult.time
        if (attr[2].equals("stepCount")) {
            resultsMap.get(id).setStepCount(Integer.valueOf(val));
        }
        if (attr[2].equals("varId")) {
            resultsMap.get(id).setVar(interactionFacade.findVar(Long.valueOf(val)));
        }
        if (attr[2].equals("resultVal")) {
            resultsMap.get(id).setResultVal(val);
        }
        if (attr[2].equals("timeFromStart")) {
            resultsMap.get(id).setTimeFromStart(Integer.valueOf(val));
        }
        if (attr[2].equals("changeValTime")) {
            resultsMap.get(id).setChangeValTime(Integer.valueOf(val));
        }
        if (attr[2].equals("resultCount")) {
            resultsMap.get(id).setResultCount(Integer.valueOf(val));
        }
        if (attr[2].equals("resultTime")) {
            resultsMap.get(id).setResultTime(Integer.valueOf(val));
        }

        return resultsMap;
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
