package com.juegodetronos.service;

import com.juegodetronos.model.Episodio;
import com.juegodetronos.repository.EpisodioRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class EpisodioService {
    private final EpisodioRepository episodioRepository;

    public EpisodioService(EpisodioRepository episodioRepository) {
        this.episodioRepository = episodioRepository;
    }

    // Método para obtener el capítulo mejor calificado de una serie específica
    public Episodio obtenerCapituloMejorCalificado(Long serieId) {
        // Filtrar episodios de la serie y encontrar el de mayor calificación
        return episodioRepository.findAllByTemporada_SerieId(serieId).stream()
                .max(Comparator.comparing(Episodio::getClasificacion))
                .orElseThrow(() -> new RuntimeException("No se encontró un capítulo mejor calificado para la serie con ID: " + serieId));
    }

    // Método para calificar un episodio específico
    public Episodio calificarEpisodio(Long id, Double calificacion) {
        Episodio episodio = episodioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Episodio con ID: " + id + " no encontrado"));
        episodio.setClasificacion(calificacion);
        return episodioRepository.save(episodio);
    }

    // Método para obtener todos los episodios de una temporada específica
    public List<Episodio> getEpisodiosPorTemporada(Long temporadaId) {
        return episodioRepository.findByTemporadaId(temporadaId);
    }
}
