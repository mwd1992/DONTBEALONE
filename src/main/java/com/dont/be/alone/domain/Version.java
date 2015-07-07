package com.dont.be.alone.domain;

import org.springframework.stereotype.Component;

@Component
public class Version {

    String version;

    public Version(){}

    public Version(String version){
        this.version = version;
    }
}
