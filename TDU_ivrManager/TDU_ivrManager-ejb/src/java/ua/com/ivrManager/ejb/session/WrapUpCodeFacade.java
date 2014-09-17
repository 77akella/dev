/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.com.ivrManager.ejb.entity.WrapUpCode;

/**
 *
 * @author Artem
 */
@Stateless
public class WrapUpCodeFacade extends AbstractFacade<WrapUpCode> {

    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WrapUpCodeFacade() {
        super(WrapUpCode.class);
    }
}
