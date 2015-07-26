package com.dont.be.alone.controller;

import com.dont.be.alone.domain.Detective;
import com.dont.be.alone.service.DetectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class QuestionController {

    @Autowired
    private DetectiveRepository detectiveRepository;

    @RequestMapping("/detective/question")
    public String getQuestionByUsernameOrEmail(@RequestParam(required = false) String username,
                                               @RequestParam(required = false) String email) {
        Optional<String> emailAddress = Optional.ofNullable(email);
        Optional<String> user = Optional.ofNullable(username);
        Optional<Detective> detective;
        if (emailAddress.isPresent())
        {
            detective = Optional.ofNullable(detectiveRepository.findByEmail(emailAddress.get()));
        }
        else if (user.isPresent())
        {
            detective = Optional.ofNullable(detectiveRepository.findByUsername(user.get()));
        }
        else detective = Optional.empty();
        return detective.isPresent() ? detective.get().getQuestion() : "";
    }
}
