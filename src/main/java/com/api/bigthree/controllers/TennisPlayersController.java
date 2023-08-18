package com.api.bigthree.controllers;

import com.api.bigthree.models.TennisPlayer;
import com.api.bigthree.repository.TennisPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/tennisplayers")
public class TennisPlayersController {

    @Autowired
    private TennisPlayerRepository tennisPlayerRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<TennisPlayer> getAllPlayers() {
        return tennisPlayerRepository.findAll();
    }
}
