package ua.com.AACC.is.db;

import com.intersys.jdbc.CacheConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.slf4j.LoggerFactory;


public class CacheCCMMconnection {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(CacheCCMMconnection.class);
    private final static org.slf4j.Logger loggerTiming = LoggerFactory.getLogger("Timing");
    private final static String selectPhones = " SELECT ph.Number FROM cls.PhoneNumbers ph WHERE ph.Customer = ?";
    private static CacheConnectionPoolDataSource pds;
    public static void initPool() {
        final long startReq = System.currentTimeMillis();
        try {

            pds = new CacheConnectionPoolDataSource();
            pds.restartConnectionPool();
            pds.setURL("jdbc:Cache://10.44.209.3:1972/MULTIMEDIA");
            pds.setUser("mmExternal");
            pds.setPassword("mmExt");
            try {
                int maxPoolSize = Integer.valueOf(System.getProperty("ccmmDbConnectionMaxPoolSize", "0"));
                if(maxPoolSize!=0){
                    pds.setMaxPoolSize(maxPoolSize);
                }
            } catch (Exception e) {
            }
        } catch (SQLException ex) {
            logger.error("Failed to init CacheConnectionPoolDataSource: ", ex);
        }
        loggerTiming.info("CacheCCMMconnection: initPool takes {}ms", System.currentTimeMillis() - startReq);
    }

    public static String getMsisdnArrayUrlPart(String contactID) {
        logger.info("getMsisdnArrayUrlPart: contactID='{}'",contactID);
        final long startReq = System.currentTimeMillis();
        Connection dbconnection;
        try {
            dbconnection = getConnectionPool().getConnection();
        } catch (SQLException ex) {
            logger.error("Failed to get connection from connection pool: {}", ex.getMessage());
            initPool();
            try {
                dbconnection = getConnectionPool().getConnection();
            } catch (SQLException e) {
                logger.error("Failed to get connection from connection [Attempt 2] pool: {}", e.getMessage());
                return "";
            }
        }
        if (dbconnection == null) {
            return "";
        }
        PreparedStatement prepareStatement = null;
        StringBuilder msisdns = new StringBuilder();
        try {
            prepareStatement = dbconnection.prepareStatement(selectPhones);
            prepareStatement.setString(1, contactID);
            ResultSet executeQuery = prepareStatement.executeQuery();
            while (executeQuery.next()) {
                msisdns.append("&msisdn[]=").append(executeQuery.getString(1));
            }
        } catch (SQLException | NullPointerException ex) {
            logger.error("Faied to create prepareStatement. Reinitializing DB.", ex);
        } finally {
            if (prepareStatement != null) {
                try {
                    prepareStatement.close();
                } catch (SQLException ex) {
                }
            }
            if (dbconnection != null) {
                try {
                    dbconnection.close();
                } catch (SQLException ex) {
                }
            }
        }
        logger.info("getMsisdnArrayUrlPart: urlPart='{}'",msisdns);
        loggerTiming.info("CacheCCMMconnection: getMsisdnArrayUrlPart takes {}ms. Pool count: {}", System.currentTimeMillis() - startReq, pds.getPoolCount());
        return msisdns.toString();
    }

    private static CacheConnectionPoolDataSource getConnectionPool() {
        if (pds == null) {
            initPool();
        }
        return pds;
    }
}
