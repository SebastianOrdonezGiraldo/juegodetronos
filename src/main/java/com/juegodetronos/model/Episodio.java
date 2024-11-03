package com.juegodetronos.model;

import jakarta.persistence.*;


import java.util.List;

@Entity
public class Episodio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Double clasificacion;

    @ManyToOne
    @JoinColumn(name = "temporada_id")
    private Temporada temporada;

    @OneToMany(mappedBy = "episodio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EpisodioFoto> fotos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public Double getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Double clasificacion) {
        this.clasificacion = clasificacion;
    }

    public List<EpisodioFoto> getFotos() {
        return fotos;
    }

    public void setFotos(List<EpisodioFoto> fotos) {
        this.fotos = fotos;
    }
}
