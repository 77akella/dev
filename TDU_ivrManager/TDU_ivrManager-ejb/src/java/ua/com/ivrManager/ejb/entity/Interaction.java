/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.entity;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Artem
 */
@Entity
@Cacheable(false)
public class Interaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Interaction child;
    @OneToOne
    private Interaction parent;

//    type of interaction^
//    0: phone call
//    1: e-mail
//    2: sms
    private int type;

    @ManyToOne(fetch= FetchType.EAGER)
    private Campaign campaign;
    @ManyToOne(fetch= FetchType.EAGER)
    private ContactList contactList;
    @ManyToOne
    private ActionNode actionNode;
    private Long contactId;

    @ManyToOne
    private CallFlow callFlow;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date scheduledDate;

    private boolean incomming;
    @Column(columnDefinition="TEXT")
    private String reason;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modDate;
    private int duration;

    private boolean processing;
    private boolean ended;
    private int attempt;
    private String lastComplCode;
    @ElementCollection(fetch=FetchType.EAGER)
    @MapKeyTemporal(TemporalType.TIMESTAMP)
    @MapKeyColumn(name="codeDate")
    @Column(name="code")
    private Map<Date,String> complCodes=new HashMap<Date, String>();
    private String sessionId;
    private String ucid;
    private String ani;
    private String dnis;
    @ManyToOne
    private WrapUpCode wrapUpCode;

    @OneToMany(mappedBy = "interaction")
    private List<InteractionResults> resultVars=new ArrayList<InteractionResults>();
    @Column(columnDefinition="TEXT")
    private String messageSubject;
    @Column(columnDefinition="TEXT")
    private String messageText;
    private boolean deleted;

    public Interaction() {
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAni() {
        return ani;
    }

    public void setAni(String ani) {
        this.ani = ani;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public CallFlow getCallFlow() {
        return callFlow;
    }

    public void setCallFlow(CallFlow callFlow) {
        this.callFlow = callFlow;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public Interaction getChild() {
        return child;
    }

    public void setChild(Interaction child) {
        this.child = child;
    }

    public Map<Date, String> getComplCodes() {
        return complCodes;
    }

    public void setComplCodes(Map<Date, String> complCodes) {
        this.complCodes = complCodes;
    }

    public ActionNode getActionNode() {
        return actionNode;
    }

    public void setActionNode(ActionNode actionNode) {
        this.actionNode = actionNode;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public String getDnis() {
        return dnis;
    }

    public void setDnis(String dnis) {
        this.dnis = dnis;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDurationString(){
//        if(startDate!=null&&endDate!=null&&endDate.after(startDate)){
//            return (new SimpleDateFormat("mm:ss")).format(new Date(endDate.getTime() - startDate.getTime()));
//        }
//        return null;
        return ((int) duration/60)+":"+(duration%60);
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public boolean isEnded() {
        return ended;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }

    public boolean isIncomming() {
        return incomming;
    }

    public void setIncomming(boolean incomming) {
        this.incomming = incomming;
    }

    public String getLastComplCode() {
        return lastComplCode;
    }

    public void setLastComplCode(String lastComplCode) {
        this.lastComplCode = lastComplCode;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public Interaction getParent() {
        return parent;
    }

    public void setParent(Interaction parent) {
        this.parent = parent;
    }

    public boolean isProcessing() {
        return processing;
    }

    public void setProcessing(boolean processing) {
        this.processing = processing;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<InteractionResults> getResultVars() {
        return resultVars;
    }

    public void setResultVars(List<InteractionResults> resultVars) {
        this.resultVars = resultVars;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getUcid() {
        return ucid;
    }

    public void setUcid(String ucid) {
        this.ucid = ucid;
    }

    public WrapUpCode getWrapUpCode() {
        return wrapUpCode;
    }

    public void setWrapUpCode(WrapUpCode wrapUpCode) {
        this.wrapUpCode = wrapUpCode;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<Interaction> getCallHierarchy(){
        List<Interaction> list=new ArrayList<Interaction>();
        list.add(this);
        if(this.getParent()!=null){
            list.addAll(this.getParent().getCallHierarchy());
        }
        return list;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Interaction)) {
            return false;
        }
        Interaction other = (Interaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interaction[ id=" + id + ", processing="+processing+", ended="+ended+" ]";
    }

}