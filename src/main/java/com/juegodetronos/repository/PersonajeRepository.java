package com.juegodetronos.repository;

import com.juegodetronos.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
    // Métodos personalizados para Personaje, si son necesarios
}
