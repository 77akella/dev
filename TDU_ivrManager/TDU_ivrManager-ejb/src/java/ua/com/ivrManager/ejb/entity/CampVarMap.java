package ua.com.ivrManager.ejb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Artem
 */
@Entity
public class CampVarMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade= CascadeType.ALL,fetch= FetchType.EAGER)
    private Var var;
    @ManyToOne(fetch= FetchType.EAGER)
    private ContactList contactList;
    private Integer conListColumn=-1;
    @ManyToOne
    private Campaign campaign;
    private boolean deleted;

    public CampVarMap() {
    }

    public CampVarMap(Var var, ContactList contactList, Campaign campaign) {
        this.var = var;
        this.contactList = contactList;
        this.campaign = campaign;
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

    public Integer getConListColumn() {
        return conListColumn;
    }

    public void setConListColumn(Integer conListColumn) {
        this.conListColumn = conListColumn;
    }

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
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
        if (!(object instanceof CampVarMap)) {
            System.out.println("CampVarMap "+this.toString()+ "! instanceof  "+ object.toString());
            return false;
        }
        CampVarMap other = (CampVarMap) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            System.out.println("CampVarMap "+this.toString()+ "! equals "+ object.toString());
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CampVarMap[ id=" + id + ", var="+var+", conList="+contactList+", conListColumn="+conListColumn+", campaign="+campaign+" ]";
    }

}
