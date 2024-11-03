package com.juegodetronos.service;

import com.juegodetronos.model.Episodio;
import com.juegodetronos.model.Serie;
import com.juegodetronos.repository.SerieRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class SerieService {
    private final SerieRepository serieRepository;

    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public Serie getSerie(Long id) {
        return serieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Serie no encontrada"));
    }

    // Método para calcular el capítulo mejor calificado de la serie
    public Episodio getCapituloMejorCalificado(Long serieId) {
        return serieRepository.findById(serieId)
                .flatMap(serie -> serie.getTemporadas().stream()
                        .flatMap(temporada -> temporada.getEpisodios().stream())
                        .max(Comparator.comparing(Episodio::getClasificacion)))
                .orElseThrow(() -> new RuntimeException("No se encontró ningún capítulo"));
    }
}
