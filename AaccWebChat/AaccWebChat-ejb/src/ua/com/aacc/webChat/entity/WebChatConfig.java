package ua.com.aacc.webChat.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import ua.com.aacc.webChat.entity.enums.AuthTypeEnum;
import ua.com.aacc.webChat.entity.enums.ContactPriorityEnum;
import ua.com.aacc.webChat.entity.enums.LanguageEnum;
import ua.com.aacc.webChat.entity.enums.SubjectTypeEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Murashov
 */
//@ObjectTypeConverter(name = "authConv", objectType = AuthTypeEnum.class, dataType = String.class, conversionValues = {
//    @ConversionValue(objectValue = "AACC_SKILLSET_PREFIX_AUTH", dataValue = "AACC_SKILLSET"),
//    @ConversionValue(objectValue = "NO_AUTH", dataValue = "NO")})
@Entity
@GenericGenerator(name = "WCHAT_CONF_ID_GEN", strategy = "uuid")
public class WebChatConfig extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "WCHAT_CONF_ID_GEN")
//    @Column(columnDefinition = "UUID")
    private String id;
    private String name;
    private String domain;

    @Type(type = "org.hibernate.type.StringClobType")
    private String css;
    @Enumerated(value = EnumType.STRING)
    private AuthTypeEnum authType = AuthTypeEnum.NO_AUTH;
    // used for password reminder in aacc auth
    private String emailSkillSet;
    @Enumerated(value = EnumType.STRING)
    @Column(length = 3)
    private LanguageEnum lang = LanguageEnum.RUS;
    private String styleTheme = "aristo";

    private String skillset;

    // Contact priority
    @Enumerated(value = EnumType.STRING)
    private ContactPriorityEnum priority = ContactPriorityEnum.Priority_3_Medium_High;

    // Do notify customer on Agent writing?
    private boolean notifyCustomerOnAgentWriting = true;
    // Do notify Agent on customer writing?
    private boolean notifyAgentOnCustomerWriting = true;

    private String customerDefaultLabel;

    private boolean showRequestInformation;
    //Set visible fields for input before start chat
    private boolean requestName;
    private boolean requireName;
    private boolean requestEmail;
    private boolean requireEmail;
    private boolean requestPhone;
    private boolean requirePhone;
    //is subject required?
    @Enumerated(value = EnumType.STRING)
    private SubjectTypeEnum subjectType=SubjectTypeEnum.HIDDEN;
    private boolean subjectRequired;
    // Subjects list
    @Cascade(value = {org.hibernate.annotations.CascadeType.ALL})
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> subjectsList = new ArrayList<>();
    @Type(type = "org.hibernate.type.StringClobType")
    private String messageOnSessionStart;
    @Type(type = "org.hibernate.type.StringClobType")
    private String messageOnSessionEnd;
    @ManyToOne
    private WorkTimeRange workTimeRange;
    @Type(type = "org.hibernate.type.StringClobType")
    private String notWorkTimeMessage;

    private boolean skillsetNotInServiceCheck=true;
    @Type(type = "org.hibernate.type.StringClobType")
    private String skillsetNotInServiceMessage;

    public WebChatConfig() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        if(domain.startsWith("http://wwww.")){
            domain="http://"+domain.substring(12);
        }else if(domain.startsWith("https://wwww.")){
            domain="https://"+domain.substring(13);
        }
        this.domain = domain;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public String getEmailSkillSet() {
        return emailSkillSet;
    }

    public void setEmailSkillSet(String emailSkillSet) {
        this.emailSkillSet = emailSkillSet;
    }

    public LanguageEnum getLang() {
        return lang;
    }

    public void setLang(LanguageEnum lang) {
        this.lang = lang;
    }

    public String getStyleTheme() {
        return styleTheme;
    }

    public void setStyleTheme(String styleTheme) {
        this.styleTheme = styleTheme;
    }

    public String getSkillset() {
        return skillset;
    }

    public void setSkillset(String skillset) {
        this.skillset = skillset;
    }

    public ContactPriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(ContactPriorityEnum priority) {
        this.priority = priority;
    }

    public boolean isNotifyCustomerOnAgentWriting() {
        return notifyCustomerOnAgentWriting;
    }

    public void setNotifyCustomerOnAgentWriting(boolean notifyCustomerOnAgentWriting) {
        this.notifyCustomerOnAgentWriting = notifyCustomerOnAgentWriting;
    }

    public boolean isNotifyAgentOnCustomerWriting() {
        return notifyAgentOnCustomerWriting;
    }

    public void setNotifyAgentOnCustomerWriting(boolean notifyAgentOnCustomertWriting) {
        this.notifyAgentOnCustomerWriting = notifyAgentOnCustomertWriting;
    }

    public String getCustomerDefaultLabel() {
        return customerDefaultLabel;
    }

    public void setCustomerDefaultLabel(String customerLabel) {
        this.customerDefaultLabel = customerLabel;
    }

    public boolean isShowRequestInformation() {
        return showRequestInformation;
    }

    public void setShowRequestInformation(boolean showRequestInformation) {
        this.showRequestInformation = showRequestInformation;
    }

    public boolean isRequireName() {
        return requireName;
    }

    public void setRequireName(boolean requireName) {
        this.requireName = requireName;
    }

    public boolean isRequestName() {
        return requestName;
    }

    public void setRequestName(boolean requestName) {
        this.requestName = requestName;
    }

    public boolean isRequestEmail() {
        return requestEmail;
    }

    public void setRequestEmail(boolean email) {
        this.requestEmail = email;
    }

    public boolean isRequestPhone() {
        return requestPhone;
    }

    public void setRequestPhone(boolean phone) {
        this.requestPhone = phone;
    }

    public boolean isRequireEmail() {
        return requireEmail;
    }

    public void setRequireEmail(boolean requireEmail) {
        this.requireEmail = requireEmail;
    }

    public boolean isRequirePhone() {
        return requirePhone;
    }

    public void setRequirePhone(boolean requirePhone) {
        this.requirePhone = requirePhone;
    }

    public boolean isSubjectRequired() {
        return subjectRequired;
    }

    public void setSubjectRequired(boolean subjectRequired) {
        this.subjectRequired = subjectRequired;
    }

    public List<String> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<String> subjectsList) {
        this.subjectsList = subjectsList;
    }

    public SubjectTypeEnum getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectTypeEnum subjectType) {
        this.subjectType = subjectType;
    }

     public String getMessageOnSessionEnd() {
        return messageOnSessionEnd;
    }

    public void setMessageOnSessionEnd(String messageOnSessionEnd) {
        this.messageOnSessionEnd = messageOnSessionEnd;
    }

    public String getMessageOnSessionStart() {
        return messageOnSessionStart;
    }

    public void setMessageOnSessionStart(String messageOnSessionStart) {
        this.messageOnSessionStart = messageOnSessionStart;
    }

    public WorkTimeRange getWorkTimeRange() {
        return workTimeRange;
    }

    public void setWorkTimeRange(WorkTimeRange workTimeRange) {
        this.workTimeRange = workTimeRange;
    }

    public String getNotWorkTimeMessage() {
        return notWorkTimeMessage;
    }

    public void setNotWorkTimeMessage(String notWorkTimeMessage) {
        this.notWorkTimeMessage = notWorkTimeMessage;
    }

    public boolean isSkillsetNotInServiceCheck() {
        return skillsetNotInServiceCheck;
    }

    public void setSkillsetNotInServiceCheck(boolean skillsetNotInServiceCheck) {
        this.skillsetNotInServiceCheck = skillsetNotInServiceCheck;
    }

    public String getSkillsetNotInServiceMessage() {
        return skillsetNotInServiceMessage;
    }

    public void setSkillsetNotInServiceMessage(String skillsetNotInServiceMessage) {
        this.skillsetNotInServiceMessage = skillsetNotInServiceMessage;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
//        hash = 37 * hash + (this.business != null ? this.business.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WebChatConfig other = (WebChatConfig) obj;
        if (other.getId() == null) {
            return false;
        }
        return other.getId().equals(id);
    }

    @Override
    public String toString() {
        return "WebChatConfig{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", domain='" + domain + '\'' +
                ", authType=" + authType +
                ", skillset='" + skillset + '\'' +
                ", skillsetNotInServiceCheck=" + skillsetNotInServiceCheck +
                '}';
    }
}
