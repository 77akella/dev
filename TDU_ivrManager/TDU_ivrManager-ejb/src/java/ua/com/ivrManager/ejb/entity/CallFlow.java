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
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"name","deleted"}))
public class CallFlow implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(/*unique=true,*/ nullable=false)
    private String name;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modDate;

    private String editMode= ua.com.ivrManager.util.BasicVXML.MODE_BASIC;
    private int lastFlowCountId;
    @Column(columnDefinition="TEXT")
    private String vxmlText;

    @OneToOne(cascade= CascadeType.ALL,fetch= FetchType.EAGER)
    private CallFlowNode flowNode;
    private boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

    public CallFlowNode getFlowNode() {
        return flowNode;
    }

    public void setFlowNode(CallFlowNode flowNode) {
        this.flowNode = flowNode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLastFlowCountId() {
        return lastFlowCountId;
    }

    public void setLastFlowCountId(int lastFlowCountId) {
        this.lastFlowCountId = lastFlowCountId;
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

    public String getVxmlText() {
        return vxmlText;
    }

    public void setVxmlText(String vxmlText) {
        this.vxmlText = vxmlText;
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
        if (!(object instanceof CallFlow)) {
            return false;
        }
        CallFlow other = (CallFlow) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CallFlow[ id=" + id + " ]";
    }
}
