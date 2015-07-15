package com.dont.be.alone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Detective {
    @Id
    @GeneratedValue
    private long id;

    private String username;
    private String password;
    private String email;
    private String phone;
    private String question;

    public Detective() {}

    public Detective(String username, String password, String email, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    public String getQuestion(){
        return question;
    }
}
