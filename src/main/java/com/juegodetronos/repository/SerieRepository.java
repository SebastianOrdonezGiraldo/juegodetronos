package com.juegodetronos.repository;

import com.juegodetronos.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    // Puedes agregar métodos personalizados aquí, si es necesario
}

