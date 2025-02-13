package com.martin.ciutatsdb.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "AUTHORITIES")
public class Authority {
    @Id
    private String username;
    private String authority;

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

