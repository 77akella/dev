package ua.com.ivrManager.ejb.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ua.com.ivrManager.ejb.entity.Campaign;
import ua.com.ivrManager.ejb.entity.ContactList;
import ua.com.ivrManager.util.QueryBundle;


/**
 *
 * @author Artem
 */
@Stateless
public class CampaignFacade extends AbstractFacade<Campaign> {
    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CampaignFacade() {
        super(Campaign.class);
    }

    public List<ContactList> findAllContactList() {
        QueryBundle qb = QueryBundle.createReadAllQuery(getEntityManager(), ContactList.class).appendBoolFilter("deleted", false);
        return qb.compile().getResultList();
    }

    public void run(Campaign campaign) {
        campaign.setStatus("Running");
        getEntityManager().merge(campaign);
    }

    public void stop(Campaign campaign) {
        campaign.setStatus("stoppped");
        getEntityManager().merge(campaign);
    }

}
