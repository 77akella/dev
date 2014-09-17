/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Artem
 */
@Entity
@Cacheable(false)
public class InteractionResults implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Interaction interaction;
    @ManyToOne
    private CallFlow callFlow;
    @ManyToOne
    private Campaign campaign;
    @ManyToOne
    private ContactList contactList;

    private Integer recordCount;
    private Integer resultCount;
    private Integer stepCount;
    private Integer timeFromStart;
    @ManyToOne
    private Var var;
    private String resultVal;
    private Integer resultTime;
    private Integer changeValTime;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modDate=new Date();
    private boolean deleted;
    public InteractionResults() {
    }

    public InteractionResults(Integer recordCount, Interaction interaction,CallFlow callFlow,Campaign campaign,ContactList contactList) {
        this.recordCount = recordCount;
        this.interaction = interaction;
        this.callFlow = callFlow;
        this.campaign = campaign;
        this.contactList=contactList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Interaction getInteraction() {
        return interaction;
    }

    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
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

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public Integer getChangeValTime() {
        return changeValTime;
    }

    public void setChangeValTime(Integer changeValTime) {
        this.changeValTime = changeValTime;
    }

    public Integer getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public Integer getResultTime() {
        return resultTime;
    }

    public void setResultTime(Integer resultTime) {
        this.resultTime = resultTime;
    }

    public String getResultVal() {
        return resultVal;
    }

    public void setResultVal(String resultVal) {
        this.resultVal = resultVal;
    }

    public Integer getStepCount() {
        return stepCount;
    }

    public void setStepCount(Integer stepCount) {
        this.stepCount = stepCount;
    }

    public Integer getTimeFromStart() {
        return timeFromStart;
    }

    public void setTimeFromStart(Integer timeFromStart) {
        this.timeFromStart = timeFromStart;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
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
        if (!(object instanceof InteractionResults)) {
            return false;
        }
        InteractionResults other = (InteractionResults) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InteractionResults[ id=" + id + ", interaction="+interaction+", campaign="+campaign+", ]";
    }

}
