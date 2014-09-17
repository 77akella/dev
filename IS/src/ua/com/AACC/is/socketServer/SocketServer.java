package ua.com.AACC.is.socketServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocketServer implements Runnable {

    final static Logger logger = LoggerFactory.getLogger(SocketServer.class);
    private static int PORT = 8888;
    private static Map<String, SocketConnection> agentSocketMap = new ConcurrentHashMap<>();
    private static ServerSocket s;

    public SocketServer(int port) throws IOException {
        PORT = port;
        s = new ServerSocket(PORT);
        s.setReuseAddress(true);
    }

    @Override
    public void run() {
        try {
            logger.info("[StartUp] SocketServer Started");
            while (!s.isClosed()) {
                Socket socket = s.accept();
                try {
                    logger.info("Got new socket connection from " + socket.getInetAddress().getHostAddress());
                    SocketConnection s1 = new SocketConnection(socket);
                    new Thread(s1, "SocketConnection_" + s1.getIP()).start();
                } catch (IOException e) {
                    socket.close();
                }
            }
        } catch (IOException ex) {
            logger.warn("SocketServer: {}", ex.getMessage());
        } finally {
            stop();
        }
    }

    public static void stop() {
        try {
//            // TODO: Check for concurent modification
//            for (Iterator<Entry<String, SocketConnection>> it = agentSocketMap.entrySet().iterator(); it.hasNext();) {
//                Map.Entry<String, SocketConnection> connectedAgents = it.next();
//                connectedAgents.getValue().disconnect();
//                agentSocketMap.remove(connectedAgents.getKey());
//            }
            s.close();
        } catch (Exception ex) {
            logger.error("[Stopping] {}", ex.getMessage());
        }
    }

    public static void addToMap(String agentLoginId, SocketConnection sc) throws IOException {
        if (agentLoginId == null) {
            sc.disconnect();
            return;
        }
        SocketConnection alreadyLogged = agentSocketMap.get(agentLoginId);
        if (alreadyLogged != null) {
            if (!alreadyLogged.getIP().equals(sc.getIP())) {
                throw new IOException("IP: " + alreadyLogged.getIP());
            } else {
                alreadyLogged.shutdownCBB();
            }
        }
        //Hint: do not link to agentLoginId object from SocketConnection
        agentSocketMap.put(new String(agentLoginId.toCharArray()), sc);
    }

    private static void send(String msg, String agentLoginId) {
        SocketConnection socketConnection = agentSocketMap.get(agentLoginId);
        if (socketConnection != null) {
            try {
                socketConnection.sendMsg(msg);
            } catch (IOException ex) {
                logger.warn("Failed to send message to {}. Disconnecting socket. Message: {}. Error desc:",
                        agentLoginId, msg, ex.getMessage());
                socketConnection.disconnect();
            }
        } else {
            logger.warn("{} is not connected. Ignoring. Message: {}", agentLoginId, msg);
        }
    }

    public static void removeFromMap(String agentLoginId) {
        agentSocketMap.remove(agentLoginId);
    }

    public static void sendBrowse(String url, String agentLoginId) {
        send("browse: " + url, agentLoginId);
    }

    public static int connectedCbbCount() {
        return agentSocketMap.size();
    }
}
