/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.com.ivrManager.ejb.entity.Account;
import ua.com.ivrManager.ejb.entity.AccountGroup;
import ua.com.ivrManager.ejb.entity.Account_;
import ua.com.ivrManager.util.QueryBundle;

/**
 *
 * @author Artem
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> {
    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }

    public Account findByName(String name) {
        try {
            return (Account) QueryBundle.createReadAllQuery(getEntityManager(), Account.class)
                .appendEqFilter(Account_.login.getName(), name).compile().getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    public AccountGroup findGroup(Long key) {
        return getEntityManager().find(AccountGroup.class, key);
    }

    public List<AccountGroup> findAllGroups() {
        return (List<AccountGroup>) QueryBundle.createReadAllQuery(getEntityManager(), AccountGroup.class).compile().getResultList();
    }

    public boolean isAccountsEmpty(){
        return ((Long) QueryBundle.createReadCountQuery(getEntityManager(), Account.class).compile().getSingleResult()).intValue()==0;
    }

}
