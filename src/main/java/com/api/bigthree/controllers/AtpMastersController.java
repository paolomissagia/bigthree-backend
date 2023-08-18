package com.api.bigthree.controllers;

import com.api.bigthree.models.AtpMaster;
import com.api.bigthree.repository.AtpMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/atpmasters")
public class AtpMastersController {
    @Autowired
    private AtpMasterRepository atpMasterRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<AtpMaster> getAllAtpMasters() {
        return atpMasterRepository.findAll();
    }
}
