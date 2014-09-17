/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Artem
 */
@Entity
public class Var implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String dotName;
    private String type;
    private String initVal;

    private boolean report=true;
    private boolean valueFromContactList;
    private boolean system;
    private boolean userDefined;
    private boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public Var() {
    }

    public Var(String dotName,String type, String initVal, boolean valueFromContactList) {
        this.type = type;
        this.initVal = initVal;
        this.name=type;
        this.valueFromContactList = valueFromContactList;
        this.dotName=dotName;
    }

    public Var(String dotName,String type, String initVal, boolean valueFromContactList, int tempId) {
        this.type = type;
        this.initVal = initVal;
        this.name=type;
        this.valueFromContactList = valueFromContactList;
        this.dotName=dotName+tempId;
    }

    public Var(String name,String dotName, String type, String initVal, boolean valueFromContactList, boolean system, boolean userDefined,boolean report) {
        this.name = name;
        this.dotName=dotName;
        this.type = type;
        this.initVal = initVal;
        this.valueFromContactList = valueFromContactList;
        this.system = system;
        this.userDefined = userDefined;
        this.report=report;
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

    public String getInitVal() {
        return initVal;
    }

    public void setInitVal(String initVal) {
        this.initVal = initVal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDotName() {
        return dotName;
    }

    public void setDotName(String dotName) {
        this.dotName = dotName;
    }

    public boolean isReport() {
        return report;
    }

    public void setReport(boolean report) {
        this.report = report;
    }

    public boolean isSystem() {
        return system;
    }

    public void setSystem(boolean system) {
        this.system = system;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUserDefined() {
        return userDefined;
    }

    public void setUserDefined(boolean userDefined) {
        this.userDefined = userDefined;
    }

    public boolean isValueFromContactList() {
        return valueFromContactList;
    }

    public void setValueFromContactList(boolean valueFromContactList) {
        this.valueFromContactList = valueFromContactList;
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
        if (!(object instanceof Var)) {
            return false;
        }
        Var other = (Var) object;

        if((this.id != null && other.id != null)&&this.id.equals(other.id)){
            return true;
        }
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))
                || (this.dotName == null ? other.dotName != null : !this.dotName.equals(other.dotName))
                || (this.type == null ? other.type != null : !this.type.equals(other.type))
                ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Var[ id=" + id + ", name="+name+", dotName="+dotName+", type="+type+" ]";
    }

}
// private Long id;
//    private String name;
//    private String dotName;
//    private String type;
//    private String initVal;
//
//    private boolean report=true;
//    private boolean valueFromContactList;
//    private boolean system;
//    private boolean userDefined;
//    private boolean deleted;