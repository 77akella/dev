package ua.com.aacc.webChat.ejb;

import ua.com.aacc.webChat.aacc63.CISkillsetReadType;
import ua.com.aacc.webChat.entity.Administrator;
import ua.com.aacc.webChat.entity.WebChatConfig;
import ua.com.aacc.webChat.entity.WorkTimeRange;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Artem Murashov
 */
@Stateless
public class WebChatConfigFacade extends AbstractFacade<WebChatConfig> {
    @PersistenceContext(unitName = "WebChat-ejbPU")
    private EntityManager em;
    @EJB
    private WsCcmmFacade wsCcmmFacade;

    private static Map<String, WebChatConfig> cachedEntities=new ConcurrentHashMap<>();

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Map<String, WebChatConfig> getCachedEntities() {
        return cachedEntities;
    }

    @Override
    public WebChatConfig find(Object id) {
        WebChatConfig webChatConfig = super.find(id);
        if(webChatConfig!=null && webChatConfig.getWorkTimeRange()!=null){
            if(WorkTimeRangeFacade.cachedEntities.containsKey(webChatConfig.getWorkTimeRange().getId())){
                WorkTimeRange workTimeRange=WorkTimeRangeFacade.cachedEntities.get(webChatConfig.getWorkTimeRange().getId());
                webChatConfig.setWorkTimeRange(workTimeRange);
            }
        }
        return webChatConfig;
    }

    public WebChatConfigFacade() {
        super(WebChatConfig.class);
    }

    public boolean validateSkillSet(String skillsetName) {
        String sessionKey;
        try {
             sessionKey = wsCcmmFacade.getAnonymousSessionKey().getSessionKey();
            CISkillsetReadType skillsetByName = wsCcmmFacade.getSkillsetByName(skillsetName, sessionKey);
            return skillsetByName.getName().startsWith("WC_");
        } catch (Exception e) {
            return false;
        }
    }

    public CISkillsetReadType[] getAllWcSkillsets(){
        String sessionKey = wsCcmmFacade.getAnonymousSessionKey().getSessionKey();
            return wsCcmmFacade.getAllWebSkillsets(sessionKey).getSkillsetList();
    }

    public CISkillsetReadType[] getAllEmailSkillsets(){
        String sessionKey = wsCcmmFacade.getAnonymousSessionKey().getSessionKey();
        try{
            return wsCcmmFacade.getAllEmailSkillsets(sessionKey).getSkillsetList();
        }catch (Exception e){
            CISkillsetReadType[] skillsetList = wsCcmmFacade.getAllSkillsets(sessionKey).getSkillsetList();
            List<CISkillsetReadType> skillsetReadTypeList=new ArrayList<>();
            int size=skillsetList.length;
            for(int i=0;i<size;i++){
                if(skillsetList[i].getName().startsWith("EM_")){
                    skillsetReadTypeList.add(skillsetList[i]);
                }
            }
            skillsetList=new CISkillsetReadType[skillsetReadTypeList.size()];
            return skillsetReadTypeList.toArray(skillsetList);
        }
    }
}
