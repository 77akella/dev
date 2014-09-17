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
import ua.com.AACC.is.cct.EventProcessor;
import ua.com.AACC.is.cct.SessionMonitor;
import ua.com.AACC.is.socketServer.SocketServer;

// TODO: Delete class
public class StatisticsServlet extends HttpServlet {

    final Logger logger = LoggerFactory.getLogger(StatisticsServlet.class);

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("-------------------------");
        logger.info("RemoteUser " + request.getRemoteUser());
        logger.info("RemoteAddr " + request.getRemoteAddr());
        logger.info("RemoteHost " + request.getRemoteHost());
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
            boolean cctNotConnected = true;
            try {
                cctNotConnected = SessionMonitor.getLastLicenseConsumedCount() < 0;
            } catch (Exception e) {
            }
//            if (cctNotConnected) {
            out.println("<table style=\"border: none; min-width: 80%;\">");
            out.println("<tr>");
            out.println("<td>");
            out.println("<form action=\"/ReloadCallbackConfigs\" method=\"post\" autocomplete=\"off\">"
                    + "<b style=\"width: 222px; display: block;\">Обновление настроек Callback</b>" //настроек обратного вызова
                    + "<p>"
                    + "Логин:&nbsp;&nbsp;<input type=\"text\" name=\"login\" /><br />"
                    + "Пароль:&nbsp;<input type=\"password\" name=\"pass\" /></p>"
                    + "<p><button type=\"submit\">Обновить настойки</button></p>"
                    + "</form>");
            out.println("</td>");

            out.println("<td>");
            out.println("<table border=\"1\">"
                    + " <tr>"
                    + "     <th>Параметр</th>"
                    + "     <th>Значение</th>"
                    + " </tr>"
                    + " <tr>"
                    + "     <td>Активные СВВ</td>"
                    + "     <td>" + SocketServer.connectedCbbCount() + "</td>"
                    + " </tr>"
                    + " <tr>"
                    + "     <td>Обработано запросов</td>"
                    + "     <td>" + EventProcessor.getCountProcess() + "</td>"
                    + " </tr>"
                    + " <tr>"
                    + "     <td>Среднее время обработки запроса, мс</td>"
                    + "     <td>" + EventProcessor.getAvgProcessingTime() + "</td>"
                    + " </tr>"
                    + " <tr>"
                    + "     <td>Статус подключения ССТ</td>"
                    + "     <td>" + (cctNotConnected ? "Нет соединения" : "Подключено") + "</td>"
                    + " </tr>"
                    + " <tr>"
                    + "     <td>Потребленных лицензий ССТ</td>"
                    + "     <td>" + (cctNotConnected ? "Нет соединения" : SessionMonitor.getLastLicenseConsumedCount()) + "</td>"
                    + " </tr>"
                    + " <tr>"
                    + "     <td>Записей на обратный вызов</td>"
                    + "     <td>" + CallbackController.getCallRecordsCount() + "</td>"
                    //                    + " </tr>"
                    //                    + " <tr>"
                    //                    + "     <td>Количество терминалов</td>"
                    //                    + "     <td>" + (cctNotConnected ? "Нет соединения" : IS.getCurrentTerminalCount()) + "</td>"
                    + " </tr>\n"
                    + "</table>");
            out.println("</td>");

            out.println("<td>");
            out.println("<form action=\"/ReStartCCT\" method=\"post\" autocomplete=\"off\">"
                    + "<b>Рестарт подключения ССТ</b>"
                    + "<p>"
                    + "Логин:&nbsp;&nbsp;<input type=\"text\" name=\"login\" /><br />"
                    + "Пароль:&nbsp;<input type=\"password\" name=\"pass\" />"
                    + "</p>"
                    + "<p><button type=\"submit\">Рестарт подключения</button></p>"
                    + "</form>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.flush();
//            }

            out.println("<a href=\"/CBB\">Скачать СВВ </a>");
            out.println("</center>");
            out.println("<br />");
            out.println(EventProcessor.getAgentTransferMapSize());
            out.println("<br />");
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