package com.juegodetronos.controller;

import com.juegodetronos.model.Serie;
import com.juegodetronos.model.Episodio;
import com.juegodetronos.service.SerieService;
import com.juegodetronos.service.EpisodioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SerieController {

    private final SerieService serieService;
    private final EpisodioService episodioService;

    public SerieController(SerieService serieService, EpisodioService episodioService) {
        this.serieService = serieService;
        this.episodioService = episodioService;
    }

    @GetMapping("/")
    public String mostrarPaginaPrincipal(Model model) {
        Serie serie = serieService.getSerie(1L); // Suponiendo que el ID de la serie es 1
        Episodio mejorCapitulo = episodioService.obtenerCapituloMejorCalificado(serie.getId());
        model.addAttribute("serie", serie);
        model.addAttribute("mejorCapitulo", mejorCapitulo);
        return "index";
    }
}
