package ua.com.aacc.webChat.admin.war.mBean.util;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

/**
 * @author Artem Murashov
 */
public class AuthorizationListener implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent event) {
//        event.getFacesContext().getApplication().
        FacesContext facesContext = event.getFacesContext();
        String currentPage = facesContext.getViewRoot().getViewId();

        boolean isLoginPage = (currentPage.lastIndexOf("login.xhtml") > -1);
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);

        if (session == null) {
            System.out.println("session is null");
//            NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
//            nh.handleNavigation(facesContext, null, "loginPage");
        } else {
            Object currentUser = session.getAttribute("username");

            if ((currentUser == null || currentUser == "")) {
                NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
                nh.handleNavigation(facesContext, null, "loginPage");
            }
        }
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        event.getFacesContext().getExternalContext().getSession(true);
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
}
