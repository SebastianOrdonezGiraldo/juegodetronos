package com.juegodetronos.controller;

import com.juegodetronos.model.Episodio;
import com.juegodetronos.service.EpisodioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/episodio")
public class EpisodioController {
    private final EpisodioService episodioService;

    public EpisodioController(EpisodioService episodioService) {
        this.episodioService = episodioService;
    }

    @GetMapping("/temporada/{temporadaId}")
    public List<Episodio> getEpisodiosPorTemporada(@PathVariable Long temporadaId) {
        return episodioService.getEpisodiosPorTemporada(temporadaId);
    }

    @PatchMapping("/{id}/calificar")
    public Episodio calificarEpisodio(@PathVariable Long id, @RequestParam Double calificacion) {
        return episodioService.calificarEpisodio(id, calificacion);
    }
}
