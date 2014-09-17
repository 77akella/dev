package ua.com.aacc.webChat.ejb;

import ua.com.aacc.webChat.entity.WebChatConfig;
import ua.com.aacc.webChat.entity.WorkTimeRange;
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
public class WorkTimeRangeFacade extends AbstractFacade<WorkTimeRange> {
    @PersistenceContext(unitName = "WebChat-ejbPU")
    private EntityManager em;
    protected static Map<String, WorkTimeRange> cachedEntities=new ConcurrentHashMap<>();


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Map<String, WorkTimeRange> getCachedEntities() {
        return cachedEntities;
    }

    public WorkTimeRangeFacade() {
        super(WorkTimeRange.class);
    }

    public Long getRelatedWebChatsSize(WorkTimeRange workTimeRange){
        return (Long) QueryBundle.createReadCountQuery(getEntityManager(), WebChatConfig.class).appendEqObjectFilter("workTimeRange",workTimeRange).compile().getSingleResult();
    }
}
