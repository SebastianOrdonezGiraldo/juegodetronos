package com.juegodetronos.service;

import com.juegodetronos.model.Temporada;
import com.juegodetronos.repository.TemporadaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemporadaService {
    private final TemporadaRepository temporadaRepository;

    public TemporadaService(TemporadaRepository temporadaRepository) {
        this.temporadaRepository = temporadaRepository;
    }

    public List<Temporada> getPrimerasDosTemporadas(Long serieId) {
        return temporadaRepository.findTop2BySerieIdOrderByNumeroTemporadaAsc(serieId);
    }

    public Temporada addTemporada(Temporada temporada) {
        return temporadaRepository.save(temporada);
    }
}

