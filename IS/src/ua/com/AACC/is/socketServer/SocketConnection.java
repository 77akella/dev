package ua.com.AACC.is.socketServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import org.slf4j.LoggerFactory;
import ua.com.AACC.CCT.AgentPopUpClient;
import ua.com.AACC.is.db.DBserver;
import ua.com.AACC.is.http.WebServer;

public class SocketConnection implements Runnable {

    final static org.slf4j.Logger logger = LoggerFactory.getLogger(SocketConnection.class);
    private Socket socket;
    private String agentLoginId;
    private BufferedReader in;
    private PrintWriter out;
//    private boolean started;

    public SocketConnection(Socket s) throws IOException {
        agentLoginId = null;
        socket = s;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"), 1);
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), 1), true);
        logger.info("Connected CBB from " + s.getInetAddress().getHostAddress());
//        started = true;
    }

    @Override
    public void run() {
        long lastPingTime = System.currentTimeMillis();
        try {
            String str;
            while ((str = in.readLine()) != null) {
                if (str.trim().startsWith("ping")) {
                    out.println("pong");
                    out.flush();
                    continue;
                }
                if (str.trim().startsWith("pong")) {
                    lastPingTime = System.currentTimeMillis();
                    continue;
                }

                logger.info("{} ({}) ---> {}", new Object[]{getIP(), agentLoginId, str});
                if (str.trim().startsWith("version:")) {
                    String version = str.substring(8).trim();
                    try {
                        if (!AgentPopUpClient.CBB_VERSION.equals(version)) {
                            sendMsg("update: http://" + socket.getLocalAddress().getHostAddress() + ":" + WebServer.PORT + "/CBB");
                        }
                    } finally {
                        sendMsg("version: " + AgentPopUpClient.CBB_VERSION);
                    }
                }
                if (str.startsWith("supported:")) {
                    try {
                        String[] supported = str.substring(10).split(",");
                        for (int i = 0; i < supported.length; i++) {
                            if (supported[i].trim().startsWith("ping")) {
//                                        timeout = Integer.valueOf(supported[i].trim().substring(5).trim()).intValue() / 5;
                                logger.info("Socket {} will be pinged", getIP());
                                socket.setSoTimeout(5000);
                                lastPingTime = System.currentTimeMillis();
//                                        socket.setKeepAlive(true);
//                                        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"), 1);
//                                        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket
//                                                .getOutputStream(), "UTF-8"), 1), true);
                            }
                        }
                    } catch (Exception e) {
                        logger.error("Exception in " + str + ": ", e);
                    }
                }

                if (str.startsWith("login:")) {
                    String windowsUser = str.substring(6).trim();
                    agentLoginId = DBserver.getAgentLoginIdFromDB(windowsUser);
                    if (agentLoginId == null) {
                        sendMsg("В системе не найдено соответствие  имени пользователя Windows идентификатору оператора (agentLoginID). Обратитесь к администратору");
                        throw new IOException("Wrong auth user");
                    }
                    try {
                        SocketServer.addToMap(agentLoginId, this);
                        sendMsg("OK " + agentLoginId);
                    } catch (IOException e) {
                        sendMsg("В системе уже зарегистрирован оператор с agentLoginID " + agentLoginId + " по адресу " + e.getMessage() + ". Обратитесь к администратору");
                        throw new IOException("Another agent already logged in by " + e.getMessage());
                    }
                }

                if (str.trim().equals("END")) {
                    logger.info("Disconnecting socket {} ({}) on client request", getIP(), agentLoginId);
                    disconnect();
                    return;
                }
            }
        } catch (IOException e) {
            logger.debug("Socket Exception: {}", e.getMessage());
        } finally {
            logger.debug("Closing socket {} ({})", getIP(), agentLoginId);
            disconnect();
            logger.debug("Socket closed {} ({})", getIP(), agentLoginId);
        }
    }

    public void sendMsg(String msg) throws IOException {
        out.println(msg);
        out.flush();
        logger.info("{} ({}) <--- {}", getIP(), agentLoginId, msg);
    }

    protected void shutdownCBB() {
        try {
            sendMsg("EXIT");
            logger.debug("Client shutdown {} ({})", getIP(), agentLoginId);
        } catch (Exception e) {
            logger.debug("Client shutdown {} ({}) failed: {}", new Object[]{getIP(), agentLoginId, e.getMessage()});
        }
    }

    protected void disconnect() {
        logger.debug("Disconnecting socket {} for agentLoginId={}", getIP(), agentLoginId);
//        started = false;
        if (agentLoginId != null) {
            SocketServer.removeFromMap(agentLoginId);
        }
        try {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            if (socket != null && !socket.isClosed()) {
                socket.shutdownInput();
                socket.shutdownOutput();
                socket.close();
            }
        } catch (IOException ex) {
            logger.error("Failed to close socket {}, {}", getIP(), ex.getMessage());
        }
    }

    protected String getIP() {
        return socket.getInetAddress().getHostAddress();
    }
}
