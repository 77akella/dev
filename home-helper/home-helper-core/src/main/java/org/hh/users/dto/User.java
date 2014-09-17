package org.hh.users.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

 
    public static final int STATUS_OK = 0;
    public static final int STATUS_BLOCKED = 1;
    //  public static final int STATUS_REGISTRATION_PENDING = 3;
    
    private int id;
    private String name;
    private Date creationDate;
    private String email;
    private String passwordHash;
    private List<Role> roles = new ArrayList<Role>();
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
