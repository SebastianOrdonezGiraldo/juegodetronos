package com.juegodetronos.service;

import com.juegodetronos.model.Personaje;
import com.juegodetronos.repository.PersonajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {
    private final PersonajeRepository personajeRepository;

    public PersonajeService(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }

    public Personaje getPersonajePorId(Long id) {
        return personajeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Personaje no encontrado"));
    }
}

