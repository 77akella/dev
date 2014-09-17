package ua.com.aacc.webChat.entity;

import org.hibernate.annotations.GenericGenerator;
import ua.com.aacc.webChat.entity.enums.GlobalConfigurationPropertyEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Artem Murashov
 */
@Entity
@GenericGenerator(name = "GLOBAL_CONFIG_ID_GEN", strategy = "uuid")
public class GlobalConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Enumerated(value = EnumType.STRING)
    private GlobalConfigurationPropertyEnum property;
    private String value;

    public static final Map<GlobalConfigurationPropertyEnum,String> defaultConfigs;
    static {
        defaultConfigs=new HashMap<>();
        defaultConfigs.put(GlobalConfigurationPropertyEnum.AACC_HOSTNAME,"ccc-aacc-mgt");
        defaultConfigs.put(GlobalConfigurationPropertyEnum.SkillsetNotInService,"1");
        defaultConfigs.put(GlobalConfigurationPropertyEnum.NotWorkTime,"2");
        defaultConfigs.put(GlobalConfigurationPropertyEnum.CHAT_HISTORY_REFRESH_PERIOD,"3");
        defaultConfigs.put(GlobalConfigurationPropertyEnum.ExternalAddress,"http://[EXTERNAL_DOMAIN]");
    }

    public GlobalConfigurationPropertyEnum getProperty() {
        return property;
    }

    public void setProperty(GlobalConfigurationPropertyEnum property) {
        this.property = property;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (property != null ? property.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof GlobalConfiguration)) {
            return false;
        }
        GlobalConfiguration other = (GlobalConfiguration) object;
        if ((this.property == null && other.property != null) || (this.property != null && !this.property.equals(other.property))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GlobalConfiguration[ property='" + property + "', value='" + value + "', ]";
    }
}
