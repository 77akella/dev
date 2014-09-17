package ua.com.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Artem Murashov
 */
public class TimingLogger {

    private static final Logger logger = LoggerFactory.getLogger(TimingLogger.class);

    public static Logger getLogger() {
        return logger;
    }

    public static boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }
}
