package ua.com.ivrManager.ejb.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.com.ivrManager.ejb.entity.DialRule;

/**
 *
 * @author Artem
 */
@Stateless
public class DialRuleFacade extends AbstractFacade<DialRule> {
    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DialRuleFacade() {
        super(DialRule.class);
    }

}
