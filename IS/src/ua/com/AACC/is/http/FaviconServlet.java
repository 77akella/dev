package ua.com.AACC.is.http;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class FaviconServlet extends HttpServlet {

    final Logger logger = LoggerFactory.getLogger(FaviconServlet.class);

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        DataInputStream in = null;
        ServletOutputStream op = null;
        try {
            int length = 0;
            op = response.getOutputStream();
            //
            //  Set the response and go!
            //
            //
            response.setContentType("image/vnd.microsoft.icon");
            //response.setContentLength((int) f.length());
            response.setHeader("Content-Disposition", "attachment; filename=\"favicon.ico\"");
            //
            //  Stream to the requester.
            //
            byte[] bbuf = new byte[1024];
            in = new DataInputStream(FaviconServlet.class.getResource("tray_blue.gif").openStream());

            while ((in != null) && ((length = in.read(bbuf)) != -1)) {
                op.write(bbuf, 0, length);
            }
            response.setStatus(HttpServletResponse.SC_OK);
            logger.debug("favicon sent");
        } catch (Exception e) {

            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            logger.error("Can't send favicon", e);
        } finally {
            if (in != null) {
                in.close();
            }
            if (op != null) {
                op.flush();
                op.close();
            }

        }
    }
}
