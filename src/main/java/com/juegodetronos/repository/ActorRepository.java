package com.juegodetronos.repository;

import com.juegodetronos.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    List<Actor> findByTemporadaId(Long temporadaId);
}
