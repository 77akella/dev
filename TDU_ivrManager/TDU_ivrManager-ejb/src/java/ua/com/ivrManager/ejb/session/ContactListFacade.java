package ua.com.ivrManager.ejb.session;

import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.com.ivrManager.ejb.entity.Contact;
import ua.com.ivrManager.ejb.entity.ContactList;
import ua.com.ivrManager.ejb.entity.Contact_;
import ua.com.ivrManager.util.QueryBundle;


/**
 *
 * @author Artem
 */
@Stateless
public class ContactListFacade extends AbstractFacade<ContactList> {
    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactListFacade() {
        super(ContactList.class);
    }

    public List<Contact> loadContacts(int start, int length, String order, boolean desc, Map<String, String> map,ContactList contactList) {
        return QueryBundle.createReadAllQuery(getEntityManager(), Contact.class)
                .appendOrder(order, desc).setFilter(map)
                .appendEqObjectFilter(Contact_.contactList.getName(), contactList)
                .appendBoolFilter("deleted", false)
                .compile().setMaxResults(length).setFirstResult(start).getResultList();
    }

    public int loadContactsCount(Map<String, String> filters, ContactList contactList) {
        return ((Long) QueryBundle.createReadCountQuery(getEntityManager(), Contact.class)
                .setFilter(filters)
                .appendEqObjectFilter(Contact_.contactList.getName(), contactList)
                .appendBoolFilter("deleted", false)
                .compile().getSingleResult()).intValue();
    }

    public void addContacts(List<Contact> newContacts) {
        for(Contact contact:newContacts){
            getEntityManager().merge(contact);
        }

    }
}
