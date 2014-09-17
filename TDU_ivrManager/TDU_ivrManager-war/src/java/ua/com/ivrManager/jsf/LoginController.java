package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.security.Principal;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Account;

@ManagedBean(name = "loginController")
@RequestScoped
public class LoginController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    private Account current;
    private String username;
    private String password;

    public LoginController() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        if (session != null) {
            session.invalidate();
        }
    }

    public Account getCurrent() {
        return current;
    }

    public void setCurrent(Account current) {
        this.current = current;
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
        try {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
            if (session != null) {
                session.invalidate();
            }
            request.login(username, password);
            Principal principal = request.getUserPrincipal();

            logger.info("[LoginController] Logged user: '{}'", principal.getName());
            return "index";
        } catch (ServletException e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Неверный логин/пароль", null));
            logger.error("[LoginController] login: '{}'", e.getMessage());
        }
        return "failure";
    }

    public boolean isAccountsEmpty(){
        return ((AccountController) FacesContext.getCurrentInstance().getApplication().getELResolver().
                getValue(FacesContext.getCurrentInstance().getELContext(), null, "accountController")).isAccountsEmpty();
    }

    public void createAdminAccount(){
        ((AccountController) FacesContext.getCurrentInstance().getApplication().getELResolver().
                getValue(FacesContext.getCurrentInstance().getELContext(), null, "accountController")).createAdminAccount();
    }

}
