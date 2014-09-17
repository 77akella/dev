package ua.com.AACC.is.cct;

import com.nortel.soa.oi.cct.metricsservice.SOAOICCTMetricsService;
import com.nortel.soa.oi.cct.types.metricsservice.MetricsRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.AACC.is.run.IS;


public class SessionMonitor extends Thread{

    private final static Logger logger = LoggerFactory.getLogger(SessionMonitor.class);
    private static int period = 15000;
    private static volatile boolean started;
    private static volatile Integer lastLicenseConsumedCount = -1;
    private static volatile long lastRestartTime = 0;

    public static void setPeriond(int period) {
        SessionMonitor.period = period * 1000;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (started) {
                    checkConnection();
                }
                Thread.sleep(period);
            } catch (Exception ex) {
                logger.warn("CctSessionChecker: WARNING:", ex);
            }
        }
    }

    public static int getLastLicenseConsumedCount() {
        if (lastLicenseConsumedCount > 0) {
            checkConnection();
        }
        return lastLicenseConsumedCount;
    }

    public synchronized void stopMonitor() {
        logger.warn("Stopping Session monitor");
        started = false;
    }

    public synchronized void startMonitor() {
        logger.warn("Starting Session monitor");
        started = true;
    }

    private static void checkConnection() {
        MetricsRequest metricsRequest = new MetricsRequest();
        try {
            metricsRequest.setSsoToken(IS.getSsoToken());
            int licenseConsumedCount = new SOAOICCTMetricsService().getMetricsService()
                    .getLicenseConsumedCount(metricsRequest).getCount();
            if (lastLicenseConsumedCount == licenseConsumedCount) {
                logger.debug("licenseConsumedCount: {}", licenseConsumedCount);
            } else {
                if (lastLicenseConsumedCount == -1) {
                    logger.warn("Connection to CCT Established!");
                }
                synchronized (lastLicenseConsumedCount) {
                    lastLicenseConsumedCount = licenseConsumedCount;
                }
                logger.info("licenseConsumedCount: {}", licenseConsumedCount);
            }
        } catch (Exception ex) {
            if (lastLicenseConsumedCount != -1) {
                logger.info("Connection to CCT LOST! ssoToken='{}'", IS.getSsoToken() == null ? null : IS.getSsoToken().getToken());
            }
            synchronized (lastLicenseConsumedCount) {
                lastLicenseConsumedCount = -1;
            }
            logger.error("CctSessionChecker: Restarting CCT: {}", ex.getMessage());
            logger.debug("CctSessionChecker: Restarting CCT: StackTrace", ex);
            if (System.currentTimeMillis() - lastRestartTime > 900 * 1000) {
                lastRestartTime = System.currentTimeMillis();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        IS.reStartCCT();
                    }
                }).start();
            }
        }
    }
}
