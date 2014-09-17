package ua.com.aacc.webChat.ejb;

import ua.com.aacc.webChat.entity.GlobalConfiguration;
import ua.com.aacc.webChat.entity.enums.GlobalConfigurationPropertyEnum;
import ua.com.util.QueryBundle;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Artem Murashov
 */
@Startup
@Singleton
@LocalBean
public class GlobalConfigurationSingletonFacade {

    @PersistenceContext(unitName = "WebChat-ejbPU")
    private EntityManager em;
    private Map<GlobalConfigurationPropertyEnum,String> propMap=new ConcurrentHashMap();

    private EntityManager getEm() {
        return em;
    }

    @PostConstruct
    private void postConstruct() {
        GlobalConfigurationPropertyEnum[] propertyNames = GlobalConfigurationPropertyEnum.values();
        int size=propertyNames.length;
        for(int i=0; i<size; i++){
            try{
                if(getProperty(propertyNames[i])==null){
                    setProperty(propertyNames[i],GlobalConfiguration.defaultConfigs.get(propertyNames[i]));
                }
            }catch (Exception e){
                setProperty(propertyNames[i],GlobalConfiguration.defaultConfigs.get(propertyNames[i]));
            }
        }
    }

    public String getRefreshPeriod(){
        return getProperty(GlobalConfigurationPropertyEnum.CHAT_HISTORY_REFRESH_PERIOD);
    }

    public String getAaccHostName() {
//        if (aaccHostName == null) {
//            aaccHostName = (String) QueryBundle.createReadAllQuery(getEm(), GlobalConfiguration.class).appendEqFilter("property", GlobalConfigurationPropertyEnum.AACC_HOSTNAME).compile().setMaxResults(1).getSingleResult();
//        }
//        return aaccHostName;
        return getProperty(GlobalConfigurationPropertyEnum.AACC_HOSTNAME);
    }

    public String getProperty(GlobalConfigurationPropertyEnum property){
        String result=propMap.get(property);
        if(result==null){
            GlobalConfiguration config = (GlobalConfiguration) QueryBundle.createReadAllQuery(getEm(), GlobalConfiguration.class).appendEqFilter("property", property).compile().setMaxResults(1).getSingleResult();
            if(config==null){
                return null;
            }
            result=config.getValue();
            propMap.put(property,result);
        }
        return result;
    }

    public void setProperty(GlobalConfigurationPropertyEnum property,String value){
        propMap.put(property,value);
        try{
            GlobalConfiguration config = (GlobalConfiguration) QueryBundle.createReadAllQuery(getEm(), GlobalConfiguration.class).appendEqFilter("property", property).compile().setMaxResults(1).getSingleResult();
            config.setValue(value);
            getEm().merge(config);
        }catch (Exception e){
            GlobalConfiguration config=new GlobalConfiguration();
            config.setValue(value);
            config.setProperty(property);
            getEm().merge(config);
        }
    }
}
