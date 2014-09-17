package ua.com.AACC.is.http;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebServer implements Runnable {

    final static Logger logger = LoggerFactory.getLogger(WebServer.class);
    private static Server server;
    public static int PORT;
    public static final String HEADER = "<head>"
            + "<title>Сервер интеграции Avaya Aura Contact Center с GT.CRM</title>\n"
            + "<style>\n"
            + "html {\n"
            + "    height: 100% !important;\n"
            + "}\n"
            + "body {\n"
            //            + "    /* SVG fallback(Opera 11.10-, IE9) */\n"
            //            + "    background: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciPjxkZWZzPjxsaW5lYXJHcmFkaWVudCBpZD0iZ3JhZGllbnQiIHgxPSIwJSIgeTE9IjAlIiB4Mj0iMCUiIHkyPSIxMDAlIj48c3RvcCBvZmZzZXQ9IjAlIiBzdHlsZT0ic3RvcC1jb2xvcjpyZ2JhKDExOSwxMzYsMTUzLDEpOyIgLz48c3RvcCBvZmZzZXQ9IjEwMCUiIHN0eWxlPSJzdG9wLWNvbG9yOnJnYmEoMjU1LDI1NSwyNTUsMSk7IiAvPjwvbGluZWFyR3JhZGllbnQ+PC9kZWZzPjxyZWN0IGZpbGw9InVybCgjZ3JhZGllbnQpIiBoZWlnaHQ9IjEwMCUiIHdpZHRoPSIxMDAlIiAvPjwvc3ZnPg==);\n"
            //            + "    /* Opera 11.10+ */\n"
            //            + "    background: -o-linear-gradient(top, rgba(119,136,153,1), rgba(255,255,255,1));\n"
            //            + "    /* Firefox 3.6+ */\n"
            //            + "    background: -moz-linear-gradient(top, rgba(119,136,153,1), rgba(255,255,255,1));\n"
            //            + "    /* Chrome 7+ & Safari 5.03+ */\n"
            //            + "    background: -webkit-gradient(linear, left top, left bottom, color-stop(0, rgba(119,136,153,1)), color-stop(1, rgba(255,255,255,1)));\n"
            //            + "    /* IE5.5 - IE7 */\n"
            //            + "    filter: progid:DXImageTransform.Microsoft.Gradient(GradientType=0,StartColorStr=#FF778899,EndColorStr=#FFFFFFFF);\n"
            //            + "    /* IE8 */\n"
            //            + "    -ms-filter: \"progid:DXImageTransform.Microsoft.Gradient(GradientType=0,StartColorStr=#FF778899,EndColorStr=#FFFFFFFF)\"\n"
            + "height: 100%; \n"
            + ""
            + "/* SVG fallback(Opera 11.10-, IE9) */\n"
            + "background: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciPjxkZWZzPjxsaW5lYXJHcmFkaWVudCBpZD0iZ3JhZGllbnQiIHgxPSIwJSIgeTE9IjAlIiB4Mj0iMCUiIHkyPSIxMDAlIj48c3RvcCBvZmZzZXQ9IjAlIiBzdHlsZT0ic3RvcC1jb2xvcjpyZ2JhKDI1NSwyNTUsMjU1LDEpOyIgLz48c3RvcCBvZmZzZXQ9IjEwMCUiIHN0eWxlPSJzdG9wLWNvbG9yOnJnYmEoMTE5LDEzNiwxNTMsMSk7IiAvPjwvbGluZWFyR3JhZGllbnQ+PC9kZWZzPjxyZWN0IGZpbGw9InVybCgjZ3JhZGllbnQpIiBoZWlnaHQ9IjEwMCUiIHdpZHRoPSIxMDAlIiAvPjwvc3ZnPg==);\n"
            + "\n"
            + "/* Opera 11.10+ */\n"
            + "background: -o-linear-gradient(top, rgba(255,255,255,1), rgba(119,136,153,1));\n"
            + "\n"
            + "/* Firefox 3.6+ */\n"
            + "background: -moz-linear-gradient(top, rgba(255,255,255,1), rgba(119,136,153,1));\n"
            + "\n"
            + "/* Chrome 7+ & Safari 5.03+ */\n"
            + "background: -webkit-gradient(linear, left top, left bottom, color-stop(0, rgba(255,255,255,1)), color-stop(1, rgba(119,136,153,1)));\n"
            + "\n"
            + "/* IE5.5 - IE7 */\n"
            + "filter: progid:DXImageTransform.Microsoft.Gradient(GradientType=0,StartColorStr=#FFFFFFFF,EndColorStr=#FF778899);\n"
            + "\n"
            + "/* IE8 */\n"
            + "-ms-filter: \"progid:DXImageTransform.Microsoft.Gradient(GradientType=0,StartColorStr=#FFFFFFFF,EndColorStr=#FF778899)\""
            + "    color: white;\n"
            + "    font-size: 1.1em;\n"
            + "}\n"
            + "a {\n"
            + "    display: inline-block;\n"
            + "    padding: 2px 10px;\n"
            + "    margin: 4px 10px;\n"
            + "    background: rgb(127, 185, 231);\n"
            + "    border: 4px solid rgb(127, 185, 231);\n"
            + "    border-radius: 5px;\n"
            + "    /* Font styles */\n"
            + "    text-decoration: none;\n"
            + "    font-weight: bold;\n"
            + "    color: white;\n"
            + "}\n"
            + " \n"
            + "a:hover   { background: rgb(127, 185, 231);}\n"
            + " \n"
            + "a:active  { background: rgb(127, 185, 231);}\n"
            + " \n"
            + "a:visited { background: rgb(127, 185, 231); }\n"
            + ""
            + ""
            + "button {\n"
            + "    display: inline-block;\n"
            + "    padding: 2px 10px;\n"
            + "    margin: 4px 10px;\n"
            + "    background: rgb(127, 185, 231);\n"
            + "    border: 4px solid rgb(127, 185, 231);\n"
            + "    border-radius: 5px;\n"
            + "    /* Font styles */\n"
            + "    color: white;\n"
            + "    font-weight: bold;\n"
            + "    text-decoration: none;\n"
            + "}\n"
            + "button:hover {\n"
            + "    background: #0AF\n"
            + "    border: 4px solid rgb(127, 185, 231);"
            + "    cursor: pointer;"
            + "}\n"
            + ""
            + ""
            + "input {\n"
            + "    display: block;\n"
            + "    padding: 5px;\n"
            + "    border: 4px solid rgb(127, 185, 231);\n"
            + "    border-radius: 5px;\n"
            + "    color: #333;\n"
            + "    transition: all 0.3s ease-out;\n"
            + "}\n"
            + "input:hover { border-radius: 8px; }\n"
            + "table {"
            + "    border: 4px solid rgb(127, 185, 231);\n"
            + "    border-radius: 5px;\n"
            + "    border-collapse: collapse;\n"
            + "    padding: 0.2em;\n"
            + "    margin: 1em 2em;\n"
            + "}\n"
            + "td { padding: 0.2em;}\n"
            + "th { padding: 0.5em; background: rgb(127, 185, 231); color: white;}\n"
            + "</style>\n"
            + "</head>";

    /**
     * WebServer constructor
     *
     * @param ip - IP bind to
     * @param PORT - PORT listen for
     */
    public WebServer(String ip, int port) throws Exception {
        WebServer.PORT = port;
        server = new Server(port);

        SelectChannelConnector con = new SelectChannelConnector();
        con.setHost(ip);
        con.setPort(port);
        server.setConnectors(new Connector[]{con});

        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        contextHandler.addServlet(new ServletHolder(new CbbDownloadsRequestServlet()), "/CBB");
        contextHandler.addServlet(new ServletHolder(new FaviconServlet()), "/favicon.ico");
        contextHandler.addServlet(new ServletHolder(new StatisticsServlet()), "/");
        contextHandler.addServlet(new ServletHolder(new SysStatusServlet()), "/stat");
        contextHandler.addServlet(new ServletHolder(new CallRequestHandler()), "/call");
        contextHandler.addServlet(new ServletHolder(new DropRequestHandler()), "/drop");
        contextHandler.addServlet(new ServletHolder(new SetAgentReadyRequestHandler()), "/setAgentReady");
        contextHandler.addServlet(new ServletHolder(new SetAgentNotReadyRequestHandler()), "/setAgentNotReady");
        contextHandler.addServlet(new ServletHolder(new BlindTransferRequestHandler()), "/blindTransfer");
        contextHandler.addServlet(new ServletHolder(new ControlledTransferRequestHandler()), "/controlledTransfer");
        contextHandler.addServlet(new ServletHolder(new CompleteControlledTransferRequestHandler()), "/completeControlledTransfer");
        contextHandler.addServlet(new ServletHolder(new GetAgentStatusRequestHandler()), "/getAgentStatus");
        contextHandler.addServlet(new ServletHolder(new ReloadCallbackConfigsServlet()), "/ReloadCallbackConfigs");
        contextHandler.addServlet(new ServletHolder(new ReStartCCT()), "/ReStartCCT");
        contextHandler.addServlet(new ServletHolder(new GetAgentStatusWithDetailsRequestHandler()), "/getAgentStatusD");

        server.setHandler(contextHandler);
        server.start();
    }

    @Override
    public void run() {
        try {
            server.join();
        } catch (Exception ex) {
            logger.error("Error starting HttpServer", ex);

        }
    }

    /**
     * Stop WebServer
     *
     * @throws Exception
     */
    public static void stop() throws Exception {
        server.stop();
    }

    /**
     * Is server started?
     *
     */
    public static boolean isStarted() {
        return server.isStarted();
    }
}
