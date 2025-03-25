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
import com.ProjetoCavalo.entities.Cavalo;
import com.ProjetoCavalo.services.CavaloService;

@RestController
@RequestMapping("/Cavalos")

public class CavaloController {
    private final CavaloService cavaloService;

    @Autowired
    public CavaloController(CavaloService cavaloService) {
        this.cavaloService = cavaloService;
    }

    @PostMapping
    public Cavalo createCavalos(@RequestBody Cavalo cavalo) {
        return cavaloService.saveCavalo(cavalo);
    }

    @GetMapping("/{id}")
    public Cavalo getCavalo(@PathVariable Long id) {
        return cavaloService.getCavaloById(id);
    }

    @GetMapping
    public List<Cavalo> getAllCavalos() {
    	return cavaloService.getAllCavalo();
    }

    @DeleteMapping("/{id}")
    public void deleteCavalo(@PathVariable Long id) {
        cavaloService.deleteCavalo(id);
    }
}

