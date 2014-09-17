package ua.com.ivrManager.jsf;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import ua.com.ivrManager.ejb.session.ScheduledActions;


@ManagedBean(name = "systemController")
@SessionScoped
public class SystemController implements Serializable {

    @EJB
    private ScheduledActions scheduledActions;

    public int getFreeChanels(){
        return scheduledActions.getFreeChanels();
    }

    public int getMaxCalls(){
        return scheduledActions.getMaxCalls();
    }

    public String getVpHost(){
        return scheduledActions.getVpHost();
    }

    public String getVpUser(){
        return scheduledActions.getVpUser();
    }
}
