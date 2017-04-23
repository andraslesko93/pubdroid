package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model;

/**
 * Created by Vori on 2017-04-23.
 */

public class User {
    private Long id = null;
    private String username = null;
    private String phone = null;

    public User(String username, String phone) {
        this.username = username;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
