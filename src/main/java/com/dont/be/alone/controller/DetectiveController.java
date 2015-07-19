package com.dont.be.alone.controller;

import com.dont.be.alone.domain.Detective;
import com.dont.be.alone.service.DetectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DetectiveController {

    @Autowired
    private DetectiveRepository detectiveRepository;

    @RequestMapping(value = "/detective", method = RequestMethod.GET)
    public Detective getDetective(@RequestParam(required = false) String username, @RequestParam(required = false) String email){
        Optional<Detective> detective;
        Optional<String> username_ = Optional.of(username);
        if (username_.isPresent())
            detective = Optional.ofNullable(detectiveRepository.findByUsername(username));
        else
            detective = Optional.of(detectiveRepository.findByEmail(email));
        return detective.get();
    }

    @RequestMapping(value = "/detective", method = RequestMethod.POST)
    public Detective createDetective(@RequestParam String username, @RequestParam String password,
                                     @RequestParam String email, @RequestParam String phone, @RequestParam String question){
        Detective detective =  new Detective(username, password, email, phone, question);
        detectiveRepository.save(detective);
        return detective;
    }
}
