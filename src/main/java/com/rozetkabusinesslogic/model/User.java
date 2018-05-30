package com.rozetkabusinesslogic.model;

public class User {

    private String email;
    private String pass;
    private String name;

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public User setPass(String pass) {
        this.pass = pass;
        return this;
    }
    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}
