package com.juegodetronos.controller;

import com.juegodetronos.model.Personaje;
import com.juegodetronos.service.PersonajeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personaje")
public class PersonajeController {
    private final PersonajeService personajeService;

    public PersonajeController(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeService.getAllPersonajes();
    }

    @GetMapping("/{id}")
    public Personaje getPersonajePorId(@PathVariable Long id) {
        return personajeService.getPersonajePorId(id);
    }
}
