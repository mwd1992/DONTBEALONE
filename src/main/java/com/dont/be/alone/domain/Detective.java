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
    private String password;    //password is the answer to the question.
    private String email;
    private String phone;
    private String question;

    public Detective() {}

    public Detective(String username, String password, String email, String phone, String question) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.question = question;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getQuestion(){
        return question;
    }
}
