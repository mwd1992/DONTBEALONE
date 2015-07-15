package com.dont.be.alone.controller;

import com.dont.be.alone.domain.Version;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VersionController {

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public Version getAPIVersion(){
        Version version = new Version("1.0");
        return version;
    }
}
