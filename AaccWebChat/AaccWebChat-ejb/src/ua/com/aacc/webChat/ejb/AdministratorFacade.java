package ua.com.aacc.webChat.ejb;

import ua.com.aacc.webChat.entity.Administrator;
import ua.com.util.QueryBundle;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Artem Murashov
 */
@Stateless
public class AdministratorFacade extends AbstractFacade<Administrator> {
    @PersistenceContext(unitName = "WebChat-ejbPU")
    private EntityManager em;
    private static Map<String, Administrator> cachedEntities=new ConcurrentHashMap<>();

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Map<String, Administrator> getCachedEntities() {
        return cachedEntities;
    }

    public AdministratorFacade() {
        super(Administrator.class);
    }

    public boolean isAdministratorsEmpty() {
        return findByName("artem")==null;
    }

    @Override
    public Administrator edit(Administrator entity, Administrator modBy) {
        if (entity.getUserName().equals("artem")) {
            throw new IllegalArgumentException("You cannot change \"artem\" account");
        }
        return super.edit(entity, modBy);
    }

    @Override
    public void remove(Administrator entity) {
        if (entity.getUserName().equals("artem")) {
            throw new IllegalArgumentException("You cannot delete \"artem\" account");
        }
        super.remove(entity);
    }

    public Administrator findByName(String userName) {
//        return (Administrator) createReadAllQueryBundle().compile().getSingleResult();         //.appendFilter("userName",userName)
        try {
            return (Administrator) QueryBundle.createReadAllQuery(getEntityManager(), Administrator.class)
                    .appendEqFilter("userName", userName).compile().getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
