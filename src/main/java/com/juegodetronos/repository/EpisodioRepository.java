package com.juegodetronos.repository;

import com.juegodetronos.model.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EpisodioRepository extends JpaRepository<Episodio, Long> {
    // Método para obtener todos los episodios de una temporada específica
    List<Episodio> findByTemporadaId(Long temporadaId);

    // Método para obtener todos los episodios de una serie específica a través de la temporada
    List<Episodio> findAllByTemporada_SerieId(Long serieId);
}
