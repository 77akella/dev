package ua.com.ivrManager.ejb.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.com.ivrManager.ejb.entity.DBConnection;

/**
 *
 * @author Artem
 */
@Stateless
public class DBConnectionFacade extends AbstractFacade<DBConnection> {
    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DBConnectionFacade() {
        super(DBConnection.class);
    }

}
