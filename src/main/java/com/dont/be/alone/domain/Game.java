package com.dont.be.alone.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Game {

    @Id
    private long id;

    private String author;
    private String summary;
    private String truth;

    public Game(){}

    public Game(String author, String summary, String truth) {
        this.author = author;
        this.summary = summary;
        this.truth = truth;
    }
}
