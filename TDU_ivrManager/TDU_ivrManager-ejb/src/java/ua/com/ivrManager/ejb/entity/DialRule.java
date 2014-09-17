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
public class DialRule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true, nullable=false)
    private String name;

    @OneToMany(cascade= CascadeType.ALL,fetch= FetchType.EAGER)
    private List<DialRuleEntery> dialRuleEnteries=new ArrayList<DialRuleEntery>();
    
    private boolean deleted;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modDate=new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public List<DialRuleEntery> getDialRuleEnteries() {
        return dialRuleEnteries;
    }

    public void setDialRuleEnteries(List<DialRuleEntery> dialRuleEnteries) {
        this.dialRuleEnteries = dialRuleEnteries;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DialRule)) {
            return false;
        }
        DialRule other = (DialRule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DialRule[ id=" + id + " ]";
    }

}
