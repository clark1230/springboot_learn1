package com.hzitxx.entity;

import java.io.Serializable;

public class User implements Serializable {
    private int userId;
    private String username;
    private String gender;

    public User() {
    }

    public User(int userId, String username, String gender) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
