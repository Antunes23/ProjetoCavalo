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
import com.ProjetoCavalo.entities.ApostaDeCorrida;
import com.ProjetoCavalo.services.ApostaDeCorridaService;

@RestController
@RequestMapping("/Aposta")

public class ApostaDeCorridaController {
    private final ApostaDeCorridaService apostaDeCorridaService;

    @Autowired
    public ApostaDeCorridaController(ApostaDeCorridaService apostaDeCorridaService) {
        this.apostaDeCorridaService = apostaDeCorridaService;
    }

    @PostMapping
    public ApostaDeCorrida createAposta(@RequestBody ApostaDeCorrida apostaDeCorrida) {
        return apostaDeCorridaService.saveApostaDeCorrida(apostaDeCorrida);
    }

    @GetMapping("/{id}")
    public ApostaDeCorrida getApostaDeCorrida(@PathVariable Long id) {
        return apostaDeCorridaService.getApostaDeCorridaById(id);
    }

    @GetMapping
    public List<ApostaDeCorrida> getAllAposta() {
    	return apostaDeCorridaService.getAllApostaDeCorrida();
    }

    @DeleteMapping("/{id}")
    public void deleteApostaDeCorrida(@PathVariable Long id) {
        apostaDeCorridaService.deleteApostaDeCorrida(id);
    }
}
