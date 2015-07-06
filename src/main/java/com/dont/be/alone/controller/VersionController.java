package com.dont.be.alone.controller;

import com.dont.be.alone.domain.Version;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/api")
public class VersionController {

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    @ResponseBody
    public Version getAPIVersion(){
        return new Version("1.0");
    }
}
