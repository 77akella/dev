//package ua.com.util;
//
//import org.eclipse.persistence.logging.AbstractSessionLog;
//import org.eclipse.persistence.logging.SessionLog;
//import org.eclipse.persistence.logging.SessionLogEntry;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class Slf4JEclipseLinkSessionLogger extends AbstractSessionLog implements SessionLog {
//
//    public static final Logger LOG = LoggerFactory.getLogger(Slf4JEclipseLinkSessionLogger.class);
//
//    @Override
//    public void log(SessionLogEntry sle) {
//
//        switch (sle.getLevel()) {
//
//        case SEVERE:
//            LOG.error(buildLogMessage(sle));
//            break;
//
//        case WARNING:
//            LOG.warn(buildLogMessage(sle));
//            break;
//
//        case INFO:
//            LOG.info(buildLogMessage(sle));
//            break;
//
//        default:
//            LOG.debug(buildLogMessage(sle));
//        }
//        if (sle.hasException()) {
//            LOG.error("Exception in EclipseLink", sle.getException());
//        }
//    }
//
//    private String buildLogMessage(SessionLogEntry sle) {
//        StringBuilder b = new StringBuilder();
//        b.append("message=").append(sle.getMessage());
//        if (sle.getParameters() != null && sle.getParameters() != null) {
//            for(Object o:sle.getParameters())
//            b.append("\n parameters=").append(o.toString());
//        }
//        if (sle.getSession() != null && sle.getSession().getName() != null) {
//            b.append("\n sessionName=").append(sle.getSession().getName());
//        }
//        if (sle.getThread() != null && sle.getThread().getName() != null) {
//            b.append("\n threadName=").append(sle.getThread().getName());
//        }
//        if (sle.hasException()) {
//            b.append("\n Exception=").append(sle.getException().getMessage());
//        }
//
//        return b.toString();
//    }
//
//}