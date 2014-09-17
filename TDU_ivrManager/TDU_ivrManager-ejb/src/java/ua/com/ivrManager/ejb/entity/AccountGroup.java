/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Artem
 */
@Entity
public class AccountGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final String[] groups={"admin","view","edit"};
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true, nullable=false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String groupName) {
        for(String grp:groups){
            if(groupName.equals(grp)){
                this.name = groupName;
                return;
            }
        }
        throw new IllegalArgumentException(groupName+" not supported");
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
        if (!(object instanceof AccountGroup)) {
            return false;
        }
        AccountGroup other = (AccountGroup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AccountGroup[ id=" + id + " ]";
    }

}
