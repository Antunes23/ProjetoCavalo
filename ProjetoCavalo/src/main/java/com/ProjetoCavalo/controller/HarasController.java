package com.ProjetoCavalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ProjetoCavalo.entities.Haras;
import com.ProjetoCavalo.services.HarasService;

@RestController
@RequestMapping("/Haraz")

public class HarasController {
    private final HarasService harasService;

    @Autowired
    public HarasController(HarasService harasService) {
        this.harasService = harasService;
    }

    @PostMapping
    public Haras createHaraz(@RequestBody Haras haras) {
        return harasService.saveHaras(haras);
    }

    @GetMapping("/{id}")
    public Haras getHaras(@PathVariable Long id) {
        return harasService.getHarasById(id);
    }

    @GetMapping
    public List<Haras> getAllHaraz() {
    	return harasService.getAllHaras();
    }

    @DeleteMapping("/{id}")
    public void deleteHaras(@PathVariable Long id) {
        harasService.deleteHaras(id);
    }
}

