package com.dont.be.alone.controller;

import com.dont.be.alone.domain.Game;
import com.dont.be.alone.service.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @RequestMapping(value = "/games", method = RequestMethod.GET)
    public @ResponseBody List<Game> listAllGames(){
        return gameRepository.findAll();
    }

    @RequestMapping(value = "/games/{author}", method = RequestMethod.GET)
         public @ResponseBody List<Game> listAllGamesByAuthor(@PathVariable String author){
        return gameRepository.findByAuthor(author);
    }

    @RequestMapping(value = "/game/{id}", method = RequestMethod.GET)
    public @ResponseBody Game findGamesById(@PathVariable Long id){
        return gameRepository.findById(id);
    }

    @RequestMapping(value = "/game", method = RequestMethod.POST)
    public @ResponseBody Game createGame(@RequestParam String author, @RequestParam String summary, @RequestParam String truth){
        return gameRepository.save(new Game(author, summary, truth));
    }
}
