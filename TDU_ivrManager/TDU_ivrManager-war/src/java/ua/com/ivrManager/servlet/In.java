/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.CallFlow;
import ua.com.ivrManager.ejb.entity.Campaign;
import ua.com.ivrManager.ejb.entity.Interaction;
import ua.com.ivrManager.ejb.entity.PhoneNumber;
import ua.com.ivrManager.ejb.session.InteractionFacade;

/**
 *
 * @author Artem
 */
@WebServlet(name = "In_VXML", urlPatterns = {"/In"})
@RequestScoped
public class In extends HttpServlet {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(In.class.getSimpleName());
    @EJB
    private InteractionFacade interactionFacade;
    public static final String VXML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
            + "<vxml version=\"2.1\" xmlns=\"http://www.w3.org/2001/vxml\"\n"
            + "            xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n"
            + "            xsi:schemaLocation=\"http://www.w3.org/2001/vxml http://www.w3.org/TR/2007/REC-voicexml21-20070619/vxml.xsd\">\n"
            + "<script src=\"resources/addResults.js\" />"
            + "<var name=\"session___aai\" expr=\"getScriptItem( 'session.connection.aai' )\"/>"
            + "<var name=\"session___ani\" expr=\"getScriptItem( 'session.connection.remote.uri' )\"/>"
            + "<var name=\"session___dnis\" expr=\"getScriptItem( 'session.connection.local.uri' )\"/>"
            + "<var name=\"session___protocolname\" expr=\"getScriptItem( 'session.connection.protocol.name' )\"/>"
            + "<var name=\"session___protocolversion\" expr=\"getScriptItem( 'session.connection.protocol.version' )\"/>"
            + "<var name=\"session___uui\" expr=\"'unknown'\"/>"
            + "<var name=\"session___calltag\" expr=\"'unknown'\"/>"
            + "<var name=\"session___channel\" expr=\"getScriptItem( 'session.avaya.telephone.channel' )\"/>"
            + "<var name=\"session___vpcalledextension\" expr=\"'unknown'\"/>"
            + "<var name=\"session___vpcoveragereason\" expr=\"'unknown'\"/>"
            + "<var name=\"session___vpcoveragetype\" expr=\"'unknown'\"/>"
            + "<var name=\"session___vprdnis\" expr=\"'unknown'\"/>"
            + "<var name=\"redirectinfo___uri\" expr=\"getRedirect('uri')\"/>"
            + "<var name=\"redirectinfo___presentationinfo\" expr=\"getRedirect('pi')\"/>"
            + "<var name=\"redirectinfo___screeninginfo\" expr=\"getRedirect('si')\"/>"
            + "<var name=\"redirectinfo___reason\" expr=\"getRedirect('reason')\"/>"
            + "<var name=\"session___sharedmode\" expr=\"getScriptItem( 'session.avaya.uui.mode' )\"/>"
            + "<var name=\"shareduui___id\" expr=\"getShareduui('id')\"/>"
            + "<var name=\"shareduui___value\" expr=\"getShareduui('value')\"/>"
            + "<var name=\"session___sessionlabel\" expr=\"getScriptItem( 'session.avaya.ucid' )\"/>"
            + "<var name=\"session___sipcallid\" expr=\"getSIPCallID()\"/>"
            + "<var name=\"session___mediatype\" expr=\"getScriptItem( 'session.connection.protocol.sip.media[1].type' )\"/>"
            + "<var name=\"session___videoenabled\" expr=\"getScriptItem( 'session.connection.video.enabled' )\"/>"
            + "<var name=\"session___videocodec\" expr=\"getScriptItem( 'session.connection.video.codec' )\"/>"
            + "<var name=\"session___videoformat\" expr=\"getScriptItem( 'session.connection.video.format' )\"/>"
            + "<var name=\"session___videowidth\" expr=\"getScriptItem( 'session.connection.video.width' )\"/>"
            + "<var name=\"session___videoheight\" expr=\"getScriptItem( 'session.connection.video.height' )\"/>"
            + "<var name=\"session___videofps\" expr=\"getScriptItem( 'session.connection.video.fps' )\"/>"
            + "<var name=\"session___videobitrate\" expr=\"getScriptItem( 'session.connection.video.bitrate' )\"/>"
            + "<var name=\"session___videonearfmtp\" expr=\"getScriptItem( 'session.connection.video.nearfmtp' )\"/>"
            + "<var name=\"session___videofarfmtp\" expr=\"getScriptItem( 'session.connection.video.farfmtp' )\"/>"
            + "<var name=\"session___ucid\" expr=\"getScriptItem( 'session.avaya.ucid' )\"/>"
            + "<var name=\"session___conversefirst\" expr=\"'unknown'\"/>"
            + "<var name=\"session___conversesecond\" expr=\"'unknown'\"/>\n"
            + "<var name=\"sessionId\" expr=\"getScriptItem( 'session.avaya.telephone.call_tag' )\"/>\n"
            + "<var name=\"EXIT\"/>\n"
            + "<var name=\"EXIT_logger\"/>\n"
            + "<var name=\"wrapUpCode\"/>\n"
            + "<var name=\"contactId\" expr=\"getScriptItem( 'session.connection.ccxml.values.contactId')\"/> \n"
            + "<var name=\"contactListId\" expr=\"getScriptItem( 'session.connection.ccxml.values.contactListId')\"/> \n"
            + "<var name=\"campaignId\" expr=\"getScriptItem( 'session.connection.ccxml.values.campaignId')\"/> \n";

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
        //  response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "1");
        response.setContentType("application/voicexml+xml");
        Map<String, String[]> parMap = request.getParameterMap();
        for (String key : parMap.keySet()) {
            for (String val : parMap.get(key)) {
                logger.debug("[In vxml Servlet] ------------'{}' -> '{}'", new Object[]{key, val});
            }
        }

        PrintWriter out = response.getWriter();
        try {
            if (parMap.containsKey("id")) {
                String callFlowId = request.getParameter("id");
                CallFlow callFlow = interactionFacade.findCallFlow(Long.valueOf(callFlowId));
                out.write(VXML_HEADER);
                out.println("<var name=\"callFlowId\" expr=\"'" + callFlowId + "'\"/>");
                Interaction interaction;
                try {
                    if (!parMap.containsKey("interId")) {
                        interaction = new Interaction();
                        interaction.setProcessing(true);
                        interaction.setStartDate(new Date());
                        interaction.setIncomming(true);
                        interaction.setCallFlow(callFlow);
                        try {
                            if (parMap.containsKey("campaignId")) {
                                interaction.setCampaign(interactionFacade.findCampaign(Long.valueOf(request.getParameter("campaignId"))));
                            }
                        } catch (Exception e) {
                        }
                        if (parMap.containsKey("dnis")) {
                            interaction.setDnis(request.getParameter("dnis"));
                        }
                        if (parMap.containsKey("ani")) {
                            interaction.setAni(request.getParameter("ani"));
                        }
                        out.println("<var name=\"interId\" expr=\"'" + interactionFacade.edit(interaction).getId() + "'\"/>");
                    } else {
                        interaction = interactionFacade.find(Long.valueOf(request.getParameter("interId")));
                        interaction.setProcessing(true);
                        interaction.setStartDate(new Date());
                        interaction.setCallFlow(callFlow);
                        interactionFacade.edit(interaction);
                        out.println("<var name=\"interId\" expr=\"'" + request.getParameter("interId") + "'\"/>");
//                    out.println("<var name=\"interId\" expr=\"getScriptItem( 'session.connection.ccxml.values.interId')\"/>");
                    }
                } catch (Exception e) {
                    logger.error("[In vxml Servlet] Error in modifying Interaction parmap=" + parMap, e);
                }
                out.write(callFlow.getVxmlText());
            } else {
                out.write(VXML_HEADER);
                out.println("<form>\n<block>\n   <log expr=\"'session_ dnis is '+session___dnis\" />\n");
                List<Campaign> camps = interactionFacade.findAllRunningIncommingCampaigns();
                for (Campaign c : camps) {
                    for (PhoneNumber in : c.getIncommingNumbers()) {
                        out.println("<if cond=\"session___dnis == '" + in.getNumber() + "'\"> <goto expr=\"'In?id=" + c.getIncommingCallFlow().getId() + "&amp;campaignId=" + c.getId() + "&amp;dnis='+session___dnis+'&amp;ani='+session___ani\" /> </if>\n");
                    }
                }
                out.println("      <audio src=\"resources/numberIsNotAssigned.wav\" />\n"
                        + "</block>\n</form>\n</vxml>");
            }
        } catch (Exception e) {
            logger.error("[In vxml Servlet] Error in processing incomming call: ", e);
        } finally {
            logger.debug("[In vxml Servlet] VXML sent: \n'{}'", out.toString());
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
