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
public class DBConnection implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String jdbcAddr;
    private String userName;
    private String password;
    @Column(columnDefinition="TEXT")
    private String sqlQuery;
    private String idColumn;
    private String idStart;
    @Column(columnDefinition="TEXT")
    private String errorDesc;
    private int maxResults;
    private int requestPeriodInMin;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastQueryDate;
    @ManyToOne
    private ContactList contactList;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modDate;
    private boolean deleted;


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

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getIdColumn() {
        return idColumn;
    }

    public void setIdColumn(String idColumn) {
        this.idColumn = idColumn;
    }

    public String getIdStart() {
        return idStart;
    }

    public void setIdStart(String idStart) {
        this.idStart = idStart;
    }

    public Date getLastQueryDate() {
        return lastQueryDate;
    }

    public void setLastQueryDate(Date lastQueryDate) {
        this.lastQueryDate = lastQueryDate;
    }

    public int getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(int maxResults) {
        this.maxResults = maxResults;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRequestPeriodInMin() {
        return requestPeriodInMin;
    }

    public void setRequestPeriodInMin(int requestPeriodInMin) {
        this.requestPeriodInMin = requestPeriodInMin;
    }

    public String getSqlQuery() {
        return sqlQuery;
    }

    public void setSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public String getJdbcAddr() {
        return jdbcAddr;
    }

    public void setJdbcAddr(String jdbcAddr) {
        this.jdbcAddr = jdbcAddr;
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
        if (!(object instanceof DBConnection)) {
            return false;
        }
        DBConnection other = (DBConnection) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DBConnection[ id=" + id + " ]";
    }

}
