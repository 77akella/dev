/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Artem
 */
@Entity
public class StatisticsTemplate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany
    private List<StatisticsTemplateEntery> statisticsTemplateEntery=new ArrayList<StatisticsTemplateEntery>();
    @ManyToOne
    private CallFlow callFlow;
    @ManyToOne
    private Campaign campaign;
    @ManyToOne
    private ContactList contactList;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modDate=new Date();
    private boolean deleted;

    public StatisticsTemplate() {
    }

    public StatisticsTemplate(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StatisticsTemplateEntery> getStatisticsTemplateEntery() {
        return statisticsTemplateEntery;
    }

    public void setStatisticsTemplateEntery(List<StatisticsTemplateEntery> statisticsTemplateEntery) {
        this.statisticsTemplateEntery = statisticsTemplateEntery;
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
        if (!(object instanceof StatisticsTemplate)) {
            return false;
        }
        StatisticsTemplate other = (StatisticsTemplate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            System.out.println(".equals: "+this.toString()+"!="+other.toString());
            return false;
        }
        System.out.println(".equals: "+this.toString()+"=="+other.toString());
        return true;
    }

    @Override
    public String toString() {
        return "StatisticsTemplate[ id=" + id + ", name="+name+", conList="+contactList+", callFlow="+callFlow+", campaing="+campaign+", statisticsTemplateEntery="+statisticsTemplateEntery+" ]";
    }

}
