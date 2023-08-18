package com.api.bigthree.controllers;

import com.api.bigthree.models.GrandSlam;
import com.api.bigthree.repository.GrandSlamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/grandslams")
public class GrandSlamsController {
    @Autowired
    private GrandSlamRepository grandSlamRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<GrandSlam> getAllGrandSlams() {
        return grandSlamRepository.findAll();
    }
}
