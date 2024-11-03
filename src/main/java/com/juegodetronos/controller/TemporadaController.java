package com.juegodetronos.controller;

import com.juegodetronos.model.Temporada;
import com.juegodetronos.service.TemporadaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/temporada")
public class TemporadaController {
    private final TemporadaService temporadaService;

    public TemporadaController(TemporadaService temporadaService) {
        this.temporadaService = temporadaService;
    }

    @GetMapping("/primerasDos/{serieId}")
    public List<Temporada> getPrimerasDosTemporadas(@PathVariable Long serieId) {
        return temporadaService.getPrimerasDosTemporadas(serieId);
    }

    @PostMapping
    public Temporada addTemporada(@RequestBody Temporada temporada) {
        return temporadaService.addTemporada(temporada);
    }
}
