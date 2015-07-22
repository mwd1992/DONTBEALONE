package com.dont.be.alone.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class UserAuthority implements GrantedAuthority{

    private String authority;

    public UserAuthority(String authority){
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
