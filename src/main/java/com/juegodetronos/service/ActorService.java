package com.juegodetronos.service;

import com.juegodetronos.model.Actor;
import com.juegodetronos.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> getActoresPorTemporada(Long temporadaId) {
        return actorRepository.findByTemporadaId(temporadaId);
    }
}

