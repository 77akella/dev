package ua.com.AACC.is.db;

import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ua.com.AACC.is.callback.CallbackConfig;


public class DBserver {

    private static java.sql.Connection embeddedConn = null;

    public static void startDB() throws Exception {
        System.setProperty("derby.user.ISserver", "ISserver01");
        String dbUrl = "jdbc:derby:IS_DB;create=true;user=ISserver; password=ISserver01";
        embeddedConn = DriverManager.getConnection(dbUrl);
        Statement stmt = embeddedConn.createStatement();
        stmt.execute("SET SCHEMA APP");
        if (stmt != null) {
            stmt.close();
        }


        //embeddedConn.setAutoCommit(false);
        DatabaseMetaData dbmd = embeddedConn.getMetaData();
        ResultSet rs = dbmd.getTables(null, "APP", "IC_USERS", null);
        stmt = null;
        if (!rs.next()) {
            System.out.println("TABLE IC_USERS does not exist!");
            stmt = embeddedConn.createStatement();
            stmt.execute("CREATE TABLE APP.IC_USERS ("
                    + "id INT NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT user_fh_pk PRIMARY KEY,"
                    + " agentLoginId VARCHAR(10) UNIQUE NOT NULL, windowsUser VARCHAR(100) UNIQUE NOT NULL)");
        }
        if (stmt != null) {
            stmt.close();
        }

        dbmd = embeddedConn.getMetaData();
        rs = dbmd.getTables(null, "APP", "CALLBACK_CONFIG", null);
        stmt = null;
        if (!rs.next()) {
            System.out.println("TABLE CALLBACK_CONFIG does not exist!");
            stmt = embeddedConn.createStatement();
            stmt.execute("CREATE TABLE \"APP\".\"CALLBACK_CONFIG\" ("
//                    + "id INT NOT NULL GENERATED ALWAYS AS IDENTITY CONSTRAINT user_fh_pk PRIMARY KEY,"
                    + " CDN VARCHAR(100) PRIMARY KEY,"
                    + " OB_SKILLSET VARCHAR(50) NOT NULL,"
                    + " MAX_WAIT_TIME INTEGER NOT NULL,"
                    + " CB_SUBJECT VARCHAR(255) NOT NULL,"
                    + " CB_TEXT VARCHAR(1024) NOT NULL,"
                    + " PHONE_PREFIX VARCHAR(10) NOT NULL)");
        }
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (Exception ex) {
        }
    }

    public static String getAgentLoginIdFromDB(String windowsUser) {
        PreparedStatement ps = null;
        try {
            ps = embeddedConn.prepareStatement("SELECT agentLoginId FROM APP.IC_USERS where UPPER(windowsUser) = UPPER(?)");
            ps.setString(1, windowsUser);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                return result.getString("agentLoginId");
            }
        } catch (SQLException ex) {
//            logger.error("Failed get Agent login id from DB: {}", ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
            }
        }
        return null;
    }

    public static void stopDB() throws Exception {
        DriverManager.getConnection("jdbc:derby:IS_DB;shutdown=true;user=ISserver; password=ISserver01").close();
        embeddedConn.close();
    }

    public static Map<String, CallbackConfig> loadCallbackConfig() throws SQLException {
        Map<String, CallbackConfig> callbackConfigMap = new ConcurrentHashMap<>();
        try (PreparedStatement ps = embeddedConn.prepareStatement("SELECT CDN, OB_SKILLSET, MAX_WAIT_TIME, CB_SUBJECT, CB_TEXT, PHONE_PREFIX FROM APP.CALLBACK_CONFIG"); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String cdn = rs.getString("CDN");
                String skillset = rs.getString("OB_SKILLSET");
                int maxWaitTime = rs.getInt("MAX_WAIT_TIME");
                String subject = rs.getString("CB_SUBJECT");
                String text = rs.getString("CB_TEXT");
                String phonePrefix = rs.getString("PHONE_PREFIX");
                callbackConfigMap.put(cdn, new CallbackConfig(skillset, maxWaitTime, subject, text, phonePrefix));
            }
        }
        return callbackConfigMap;

    }
}
