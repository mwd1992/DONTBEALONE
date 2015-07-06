package com.dont.be.alone.controller;

import com.dont.be.alone.domain.Detective;
import com.dont.be.alone.service.DetectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DetectiveController {

    @Autowired
    private DetectiveRepository detectiveRepository;

    @RequestMapping(value = "/detective/{username}", method = RequestMethod.GET)
    @ResponseBody
    public Detective getDetective(@PathVariable String username){
        return detectiveRepository.findByUsername(username);
    }

    @RequestMapping(value = "/detective", method = RequestMethod.POST)
    @ResponseBody
    public Detective createDetective(@RequestParam String username, @RequestParam String password,
                                     @RequestParam String email, @RequestParam String phone){
        Detective detective =  new Detective(username, password, email, phone);
        return detectiveRepository.save(detective);
    }
}
