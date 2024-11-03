package com.juegodetronos.controller;

import com.juegodetronos.model.Actor;
import com.juegodetronos.service.ActorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actor")
public class ActorController {
    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/temporada/{temporadaId}")
    public List<Actor> getActoresPorTemporada(@PathVariable Long temporadaId) {
        return actorService.getActoresPorTemporada(temporadaId);
    }
}
