package ua.com.AACC.is.http;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class CbbDownloadsRequestServlet extends HttpServlet {

    final Logger logger = LoggerFactory.getLogger(CbbDownloadsRequestServlet.class);

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("-------------------------/CBB update");
        logger.info("RemoteUser " + request.getRemoteUser());
        logger.info("RemoteAddr " + request.getRemoteAddr());
        logger.info("RemoteHost " + request.getRemoteHost());

        DataInputStream in = null;
        ServletOutputStream op = null;
        try {
            File f = new File("lib" + File.separator + "CBB.jar");
            int length = 0;
            op = response.getOutputStream();
            //
            //  Set the response and go!
            //
            //
            response.setContentType("application/octet-stream");
            response.setContentLength((int) f.length());
            response.setHeader("Content-Disposition", "attachment; filename=\"CBB.jar\"");
            //
            //  Stream to the requester.
            //
            byte[] bbuf = new byte[1024];
            in = new DataInputStream(new FileInputStream(f));

            while ((in != null) && ((length = in.read(bbuf)) != -1)) {
                op.write(bbuf, 0, length);
            }
            response.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {

            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            System.err.println(e.getMessage());
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
