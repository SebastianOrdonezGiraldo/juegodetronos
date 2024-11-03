package com.juegodetronos.repository;

import com.juegodetronos.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemporadaRepository extends JpaRepository<Temporada, Long> {
    List<Temporada> findTop2BySerieIdOrderByNumeroTemporadaAsc(Long serieId);
}

