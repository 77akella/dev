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
public class Campaign implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true, nullable=false)
    private String name;
    private String status="new";
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modDate;
    private boolean deleted;
    private boolean incomming;
    private boolean outgoing;
    @OneToOne
    private ContactList contactList;
    @OneToMany(mappedBy = "campaign",cascade= CascadeType.ALL,fetch= FetchType.EAGER)
    private List<CampVarMap> campVarMaps=new ArrayList<CampVarMap>();

    //fields for outgoing Actions
    private int maxCalls=1;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fromDate;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date toDate;
    @OneToOne
    private DialRule dialRule;
    @OneToOne(fetch= FetchType.EAGER,cascade= CascadeType.ALL)
    private ActionNode outAction;
    @OneToMany(mappedBy = "campaign",cascade= CascadeType.ALL)
    private List<DateRange> dateRanges=new ArrayList<DateRange>();

    //fields for incomming numbers;
    @OneToMany(cascade= CascadeType.ALL)
    private List<PhoneNumber> incommingNumbers=new ArrayList<PhoneNumber>();
    @OneToOne
    private CallFlow incommingCallFlow=null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DialRule getDialRule() {
        return dialRule;
    }

    public void setDialRule(DialRule dialRule) {
        this.dialRule = dialRule;
    }

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public List<CampVarMap> getCampVarMaps() {
        return campVarMaps;
    }

    public void setCampVarMaps(List<CampVarMap> campVarMaps) {
        this.campVarMaps = campVarMaps;
    }

    public List<DateRange> getDateRanges() {
        return dateRanges;
    }

    public void setDateRanges(List<DateRange> dateRanges) {
        this.dateRanges = dateRanges;
    }

    public boolean isIncomming() {
        return incomming;
    }

    public void setIncomming(boolean incomming) {
        this.incomming = incomming;
    }

    public boolean isOutgoing() {
        return outgoing;
    }

    public void setOutgoing(boolean outgoing) {
        this.outgoing = outgoing;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public CallFlow getIncommingCallFlow() {
        return incommingCallFlow;
    }

    public void setIncommingCallFlow(CallFlow incommingCallFlow) {
        this.incommingCallFlow = incommingCallFlow;
    }

    public List<PhoneNumber> getIncommingNumbers() {
        return incommingNumbers;
    }

    public void setIncommingNumbers(List<PhoneNumber> incommingNumbers) {
        this.incommingNumbers = incommingNumbers;
    }

    public String incommingNumbersToString(){
        StringBuilder sb=new StringBuilder();
        for(PhoneNumber in:incommingNumbers){
            sb.append(in.getNumber());
            if(incommingNumbers.indexOf(in)<incommingNumbers.size()-1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public int getMaxCalls() {
        return maxCalls;
    }

    public void setMaxCalls(int maxCalls) {
        this.maxCalls = maxCalls;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionNode getOutAction() {
        return outAction;
    }

    public void setOutAction(ActionNode outAction) {
        this.outAction = outAction;
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
        if (!(object instanceof Campaign)) {
            return false;
        }
        Campaign other = (Campaign) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Campaign[ id=" + id + " ]";
    }

}
