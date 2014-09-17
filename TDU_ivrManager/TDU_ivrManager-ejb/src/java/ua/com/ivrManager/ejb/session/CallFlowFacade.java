package ua.com.ivrManager.ejb.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.CallFlow;
import ua.com.ivrManager.ejb.entity.CallFlowNode;
import ua.com.ivrManager.ejb.entity.WrapUpCode;


/**
 *
 * @author Artem
 */
@Stateless
public class CallFlowFacade extends AbstractFacade<CallFlow> {
    @PersistenceContext(unitName = "TDU-ivrManager")
    private EntityManager em;

    private static final Logger logger=LoggerFactory.getLogger(CallFlowFacade.class);

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CallFlowFacade() {
        super(CallFlow.class);
    }

    public WrapUpCode findWrapUpCode(Long id){
        return getEntityManager().find(WrapUpCode.class, id);
    }

    public Object findCallFlowNode(Long key) {
       return getEntityManager().find(CallFlowNode.class, key);
    }
}

