package ua.com.ivrManager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Interaction;
import ua.com.ivrManager.ejb.session.InteractionFacade;
import ua.com.ivrManager.ejb.session.ScheduledActions;
import ua.com.ivrManager.util.InteractionUtils;

/**
 *
 * @author Artem
 */
@WebServlet(name = "CallCode", urlPatterns = {"/CallCode"})
public class CallCode extends HttpServlet {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CallCode.class.getSimpleName());
    @EJB
    private InteractionFacade interactionFacade;
    @EJB
    private ScheduledActions scheduledActions;

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Map<String, String[]> parMap = request.getParameterMap();
        for (String key : parMap.keySet()) {
            for (String val : parMap.get(key)) {
                logger.debug("[CallCode Servlet] ------------'{}' -> '{}'", new Object[]{key, val});
            }
        }
        try {
            if (parMap.containsKey("CompletionCode")) {
                try {
                    Long interactionId = Long.valueOf(parMap.get("interId")[0]);
                    Interaction interaction = interactionFacade.find(interactionId);
                    interaction = InteractionUtils.processCompletionCode(interaction, parMap.get("CompletionCode")[0]);
                    logger.info(interaction.toString());
                    if(interaction==null){
                        out.println("");
                        out.close();
                        return;
                    }
                    try {
                        if (parMap.containsKey("CallConnectTime") && parMap.containsKey("CallCompletionTime")) {
                            logger.info("[CallCode Servlet] Request contains CallConnectTime and CallCompletionTime. Setting duration by this values.");
                            interaction.setDuration((int) (Long.valueOf(parMap.get("CallCompletionTime")[0]) - Long.valueOf(parMap.get("CallConnectTime")[0])));
                        }
                    } catch (Exception e) {
                        logger.warn("[CallCode Servlet] Unable to format CallConnectTime or CallCompletionTime",e);
                    }
                    interactionFacade.edit(interaction);
                    if(interaction.isEnded()){
                        scheduledActions.runOutgoingInteractionsAsync();
                        logger.info("[CallCode Servlet] Called runOutgoingInteractionsAsync Asynchronusley.");
                    }
                } catch (Exception e) {
                    logger.error("[CallCode Servlet] parMap.containsKey(CompletionCode), but error is ", e);
                }
            }
            out.println("");
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