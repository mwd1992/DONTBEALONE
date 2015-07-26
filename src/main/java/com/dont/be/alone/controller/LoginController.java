package com.dont.be.alone.controller;

import com.dont.be.alone.domain.Detective;
import com.dont.be.alone.service.DetectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@RequestMapping(value = "/api")
public class LoginController {

    @Autowired
    private DetectiveRepository detectiveRepository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Detective login(@RequestParam(required = false) String username,@RequestParam(required = false) String email, @RequestParam String password) {
        Optional<Detective> detective;
        if (username != null && !username.equals("")) {
            detective = Optional.of(detectiveRepository.findByUsernameAndPassword(username, password));
        } else {
            detective = Optional.of(detectiveRepository.findByEmailAndPassword(email, password));
        }
        return detective.get();
    }
}
