package ua.com.aacc.webChat.war.mBean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
* @author Artem Murashov
*/
@ManagedBean(name = "common")
@SessionScoped
public class SessionController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(SessionController.class);
    private String ip;

    @PostConstruct
    private void postConstruct(){
        ip=((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getRemoteAddr();
        logger.info("postConstruct, ip: {}, instance: {}", ip, this);
    }

    @PreDestroy
    private void disconnectOnPageCloseEvent(){
        logger.info("PreDestroy");
    }


    public void ping(){
        logger.info("Doing ping. ip: {}",ip);
    }
}
