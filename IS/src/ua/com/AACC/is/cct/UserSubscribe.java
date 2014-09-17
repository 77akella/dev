package ua.com.AACC.is.cct;

import com.nortel.soa.oi.cct.types.AuthenticationLevel;
import com.nortel.soa.oi.cct.types.SsoToken;
import com.nortel.soa.oi.cct.types.sessionservice.LogInToCCTServerRequest;
import com.nortel.soa.oi.cct.types.sessionservice.LogInToCCTServerResponse;
import com.nortel.soa.oi.cct.types.sessionservice.LogOffFromCCTServerRequest;
import com.nortel.soa.oi.cct.userservice.LogInToCCTServerException;
import com.nortel.soa.oi.cct.userservice.LogOffFromCCTServerException;
import com.nortel.soa.oi.cct.userservice.SOAOICCTUserService;
import com.nortel.soa.oi.cct.userservice.SessionNotCreatedException;
import com.nortel.soa.oi.cct.userservice.UnsubscribeFailedFault;
import com.nortel.soa.oi.cct.userservice.UserService;
import javax.xml.ws.Endpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserSubscribe {

    private final static Logger logger = LoggerFactory.getLogger(UserSubscribe.class);
    private String notificationConsumerUri;
    private UserService userService = null;
    private String consumerPort = "9091";
    private static boolean subscribeInProgress = false;
    private static boolean loginInProgress = false;

    public UserSubscribe(String localIpAddress, String port, String serverDetails) throws Exception {
        if (port != null) {
            this.consumerPort = port;
        }
        this.notificationConsumerUri = "http://" + localIpAddress + ":" + consumerPort + "/SOAOICCT/services/NotificationConsumer";
//        getUserService();
    }

    public String getNotificationConsumerUri() {
        return notificationConsumerUri;
    }

    public UserService getUserService() {
        if (userService == null) {
            userService = new SOAOICCTUserService().getUserService();
        }
        return userService;
    }

    public SsoToken loginToCctServer(String user, String password, String domain) throws LogInToCCTServerException {

        logger.info("Trying login to CCT Server");
        if (!loginInProgress) {
            loginInProgress = true;
            try {
                LogInToCCTServerRequest req = new LogInToCCTServerRequest();
                AuthenticationLevel auth = new AuthenticationLevel();
                auth.setDomain(domain);
                auth.setPassword(password);
                auth.setUsername(user);
                req.setAuthenticationLevel(auth);
                LogInToCCTServerResponse token = getUserService().logInToCCTServer(req);
                loginInProgress = false;
                logger.info("Got Session Token : " + token.getSsoToken().getToken());
                return token.getSsoToken();
            } catch (Exception e) {
                loginInProgress = false;
                throw e;
            }
        } else {
            logger.info("Login in Progress. Ignoring request.");
            throw new RuntimeException("Login in Progress. Ignoring request.");
        }
    }

    public void logout(SsoToken ssoToken) throws SessionNotCreatedException, LogOffFromCCTServerException {
        LogOffFromCCTServerRequest req = new LogOffFromCCTServerRequest();
        req.setSsoToken(ssoToken);
        getUserService().logOffFromCCTServer(req);
        userService = null;
    }

    public String simpleSubscribe(String consumerEndpoint, SsoToken ssoToken) throws Exception {
        logger.info("About to Subscribe via user service");
        if (!subscribeInProgress) {
            subscribeInProgress = true;
            try {
                String subscription = getUserService().subscribe(consumerEndpoint, ssoToken);
                logger.info("Subscribe via user service COMPLETED");
                subscribeInProgress = false;
                return subscription;
            } catch (Exception e) {
                subscribeInProgress = false;
                throw e;
            }
        } else {
            logger.info("Subscribe in Progress. Ignoring request.");
            throw new RuntimeException("Subscribe in Progress. Ignoring request.");
        }
    }

    public void unsubscribe(String consumer, SsoToken ssoToken) throws SessionNotCreatedException, UnsubscribeFailedFault, Exception {
        logger.info("About to Unsubscribe via user service");
        getUserService().unsubscribe(consumer, ssoToken);
        logger.info("Unsubscribe via user service COMPLETED");
    }

    public String publishNotificationConsumer() {
        EventProcessor notificationConsumerImpl = new EventProcessor();
        Endpoint.publish(notificationConsumerUri, notificationConsumerImpl);
        return notificationConsumerUri;
    }
}
