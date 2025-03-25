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
import com.ProjetoCavalo.entities.Vendas;
import com.ProjetoCavalo.services.VendasService;

@RestController
@RequestMapping("/Vendaz")

public class VendasController {
    private final VendasService vendasService;

    @Autowired
    public VendasController(VendasService vendasService) {
        this.vendasService = vendasService;
    }

    @PostMapping
    public Vendas createVendaz(@RequestBody Vendas vendas) {
        return vendasService.saveVendas(vendas);
    }

    @GetMapping("/{id}")
    public Vendas getVendas(@PathVariable Long id) {
        return vendasService.getVendasById(id);
    }

    @GetMapping
    public List<Vendas> getAllVendaz() {
    	return vendasService.getAllVendas();
    }

    @DeleteMapping("/{id}")
    public void deleteVendas(@PathVariable Long id) {
        vendasService.deleteVendas(id);
    }
}



