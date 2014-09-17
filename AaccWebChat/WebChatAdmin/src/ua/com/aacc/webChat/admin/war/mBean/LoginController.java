package ua.com.aacc.webChat.admin.war.mBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.aacc.webChat.admin.war.mBean.util.JsfUtil;
import ua.com.aacc.webChat.ejb.WsCcmmFacade;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.security.Principal;


@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    private String username;
    private String password;
    @EJB
    private WsCcmmFacade facade;

    public LoginController() {
//        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
//        if (session != null) {
//            logger.warn("Constructor: invalidating session");
//            session.invalidate();
//        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //    public void logout() {
//        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
//        logger.info("[LoginController] logout");
//        if (session != null) {
//            session.invalidate();
//        }
//        FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "/redirect.jsp");
//    }
    public String login() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        if (request.getUserPrincipal() != null) {
            return "index";
        }
        try {
//          facade.administratorLogoff(token);
        } catch (Exception e) {

        }
        try {
//            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
//            if (session != null) {
//                session.invalidate();
//            } else {
//                FacesContext.getCurrentInstance().getExternalContext().getSession(true);
//                return "login";
//            }

//            if(!"artem".equals(username)){
////                String token=facade.administratorLogin(username,password);
////                facade.administratorLogoff(token);
//                AdministratorController administratorController = (AdministratorController) FacesContext.getCurrentInstance().getApplication().getELResolver().
//                        getValue(FacesContext.getCurrentInstance().getELContext(), null, "administratorController");
//                Administrator administrator = administratorController.findByName(username);
//                if(!administrator.getPassword().equals(JsfUtil.hash(username,password))){
//                    administratorController.updatePass(administrator,password);
//                }
//            }

            request.login(username, password);
            Principal principal = request.getUserPrincipal();
//            Session session = request.getSessionInternal(true);
            logger.info("[LoginController] Logged user: '{}'", principal.getName());
//            FacesContext.getCurrentInstance().getExternalContext().getResponse()
//            FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "/index.xhtml");
            return "index";
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Неверный логин/пароль", null));
            logger.error("[LoginController] login: {}", e.getMessage());
        }
        return "failure";
    }

    public boolean isAdministratorsEmpty() {
        try {
            return ((AdministratorController) FacesContext.getCurrentInstance().getApplication().getELResolver().
                    getValue(FacesContext.getCurrentInstance().getELContext(), null, "administratorController")).isAdministratorsEmpty() && "artem".equals(username);
        } catch (Exception e) {
            logger.error("isAdministratorsEmpty: ", e);
            JsfUtil.addErrorMessage("DB error");
            return false;
        }
    }

    public void createAdminAccount() {
        ((AdministratorController) FacesContext.getCurrentInstance().getApplication().getELResolver().
                getValue(FacesContext.getCurrentInstance().getELContext(), null, "administratorController")).createAdminAdministrator();
    }

//    public void idleListener() {
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
//                "Your session is closed", "You have been idle for at least 5 seconds"));
//        //invalidate session
//        //HttpSession facesSession = (HttpSession)
//        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
//        //.getSession(false);
//        logger.warn("Invalidating session on IDLE request");
//        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
//        if (session != null) {
//            session.invalidate();
//        }
//    }
//
//    public void activeListener() {
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
//                "Welcome Back", "That's a long coffee break!"));
//        logger.warn("Active request");
//    }
}
