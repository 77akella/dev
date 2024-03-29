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
import ua.com.ivrManager.ejb.session.InteractionFacade;

/**
 *
 * @author Artem
 */
@WebServlet(name = "GetContactData", urlPatterns = {"/GetContactData"})
public class GetContactData extends HttpServlet {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(GetContactData.class.getSimpleName());
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
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Map<String, String[]> parMap = request.getParameterMap();
        for (String key : parMap.keySet()) {
            for (String val : parMap.get(key)) {
                logger.info("[GetContactData Servlet] ------------'{}' -> '{}'", new Object[]{key, val});
            }
        }
        try {
            assert request.getParameterMap().containsKey("interId");
            assert request.getParameterMap().containsKey("varId");

            logger.info("[GetContactData Servlet] interId='{}'", request.getParameter("interId"));
            out.println("<?xml version=\"1.0\" ?>");
            out.print("<contactData>");
            out.print(interactionFacade.findContactFileld(Long.valueOf(request.getParameter("interId")), Long.valueOf(request.getParameter("varId"))));
            out.print("</contactData>");
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
            logger.error("[GetContactData Servlet] request.getParameterMap()=" + request.getParameterMap().toString(), e);
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
