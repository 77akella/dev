package org.hh.users.dto;

public class Role {

    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_CRAFTSMAN = "CRAFTSMAN";
    public static final String ROLE_CONSUMER = "CONSUMER";

    public static Role ADMIN;
    public static Role CONSUMER;
    public static Role CRAFTSMAN;
    
    static {
        ADMIN = new Role(1, ROLE_ADMIN);
        CONSUMER = new Role(2, ROLE_CONSUMER);
        CRAFTSMAN = new Role(3, ROLE_CRAFTSMAN);
    }

    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Role) {
            return name.equals(((Role) obj).getName());
        }
        return false;
    }
    
    @Override
    public String toString() {
    	return this.getName();
    }
}
