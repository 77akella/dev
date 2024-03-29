package ua.com.AACC.is.http;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.AACC.CCT.AgentPopUpClient;
import ua.com.AACC.is.callback.CallbackController;

// TODO: Delete class
public class ReloadCallbackConfigsServlet extends HttpServlet {

    final Logger logger = LoggerFactory.getLogger(ReloadCallbackConfigsServlet.class);

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("-------------------------");
        logger.info("RemoteUser " + request.getRemoteUser());
        logger.info("RemoteAddr " + request.getRemoteAddr());
        logger.info("RemoteHost " + request.getRemoteHost());
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);


        try (PrintWriter out = response.getWriter();) {
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
            out.println("<html>");
            out.println(WebServer.HEADER);
            out.println("<center><h2>Сервер интеграции Avaya Aura Contact Center с GT.CRM.</h2>");
            out.println("Версия: " + AgentPopUpClient.CBB_VERSION);
            out.println("<a href=\"/\"> Вернуться на главную </a>");
            out.println("<center><h3>Обновление настроек обратного вызова</h3>");
            out.println("<b>Результат: </b>");
            try {
                String login = request.getParameter("login");
                String pass = request.getParameter("pass");
                if (login == null || pass == null || login.isEmpty() || pass.isEmpty()) {
                    throw new Exception("Логин и/или пароль не введены");
                }
                if (!System.getProperty("derby.user." + login, "").equals(pass)) {
                    throw new Exception("Ошибка аутентикации: логин и/или пароль введены неправильно");
                }
                CallbackController.reloadCdnConfigs();
                out.println("Настройки обратного вызова обновлены");
            } catch (Exception e) {
                out.println("<p style=\"color: red;\">" + e.getMessage() == null ? "Ошибка" : e.getMessage() + "</p>");
                logger.error("Failed to reloadCdnConfigs: ", e);
                if (e.getClass().getName().startsWith("com.nortel.soa.oi.cct")) {
                    out.println("<p style=\"color: red; font-size: 0.5em;\">");
                    e.printStackTrace(out);
                    out.println("</p>");
                }
            }
            out.println("</html>");
        } catch (Exception e) {
            logger.error("Exceprion: ", e);
        }
    }
}