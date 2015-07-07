package com.dont.be.alone.service;

import com.dont.be.alone.domain.Game;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface GameRepository extends Repository<Game, Long> {

    public List<Game> findAll();

    public List<Game> findByAuthor(String author);

    public Game findById(Long id);

    public Game save(Game game);
}
