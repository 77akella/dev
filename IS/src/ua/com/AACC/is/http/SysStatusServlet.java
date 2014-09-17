package ua.com.AACC.is.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.AACC.CCT.AgentPopUpClient;

// TODO: Delete class
public class SysStatusServlet extends HttpServlet {

    final Logger logger = LoggerFactory.getLogger(SysStatusServlet.class);

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.debug("-------------------------"
                +"\nRemoteUser " + request.getRemoteUser()
                +"\nRemoteAddr " + request.getRemoteAddr()
                +"\nRemoteHost " + request.getRemoteHost());
        long startTime = System.currentTimeMillis();
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);

        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
            out.println("<html>");
            out.println(WebServer.HEADER);
            out.println("<center><h2>Сервер интеграции Avaya Aura Contact Center с GT.CRM.</h2>");
            out.println("Версия: " + AgentPopUpClient.CBB_VERSION);
            OperatingSystemMXBean operatingSystemMXBean =
                    ManagementFactory.getOperatingSystemMXBean();
            out.println("<table border=\"1\">"
                    + " <tr>"
                    + "     <th>Параметр</th>"
                    + "     <th>Значение</th>"
                    + " </tr>");
            for (Method method : operatingSystemMXBean.getClass().getMethods()) {
                method.setAccessible(true);
                String methodName = method.getName();
                if (methodName.startsWith("get")
                        && Modifier.isPublic(method.getModifiers())
                        && OperatingSystemMXBean.class.isAssignableFrom(
                        method.getDeclaringClass())) {
                    try {
                        out.println(" <tr>"
                                + "     <td>" + methodName.substring(3) + "</td>"
                                + "     <td>" + method.invoke(operatingSystemMXBean) + "</td>"
                                + " </tr>");
                    } catch (Throwable ex) {
                        // Ignore
                    }
                }
            }

            out.println("</table>");

            out.flush();

            out.println("<div style=\"color: gray; text-align: right; border-top: 1px solid gray; position: fixed; bottom: 0px; right: 0px; padding: 0px 10px; background-color: white; width: 100%; font-size: 0.7em;\">");
            out.println("</html>");
        } catch (Exception e) {
            out.println();
            logger.error("Exceprion: ", e);
        } finally {
            out.close();
        }
    }
}