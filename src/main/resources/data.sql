-- Insertar la serie "Juego de Tronos"
INSERT INTO serie (id, nombre, descripcion, creador, clasificacion, numero_temporadas, anio_emision, poster_url)
VALUES (1, 'Juego de Tronos', 'Serie de fantasía basada en las novelas de George R. R. Martin', 'David Benioff y D.B. Weiss', 9.3, 8, 2011, '/images/poster_juego_de_tronos.jpg');

-- Insertar las primeras dos temporadas
INSERT INTO temporada (id, numero_temporada, serie_id)
VALUES (1, 1, 1), (2, 2, 1);

-- Insertar episodios para la primera temporada
INSERT INTO episodio (id, nombre, descripcion, clasificacion, temporada_id)
VALUES
    (1, 'El invierno se acerca', 'Primer episodio de Juego de Tronos', 9.1, 1),
    (2, 'El Camino Real', 'Segundo episodio de Juego de Tronos', 8.8, 1);

-- Insertar episodios para la segunda temporada
INSERT INTO episodio (id, nombre, descripcion, clasificacion, temporada_id)
VALUES
    (3, 'El Norte no olvida', 'Primer episodio de la segunda temporada', 9.0, 2),
    (4, 'Las tierras de la noche', 'Segundo episodio de la segunda temporada', 8.9, 2);

-- Insertar algunos personajes
INSERT INTO personaje (id, nombre, descripcion, foto_url)
VALUES
    (1, 'Eddard Stark', 'Señor de Invernalia y Guardián del Norte', '/images/personajes/eddard_stark.jpg'),
    (2, 'Daenerys Targaryen', 'Última sobreviviente de la Casa Targaryen', '/images/personajes/daenerys_targaryen.jpg');

-- Insertar algunos actores
INSERT INTO actor (id, nombre, temporada_id)
VALUES
    (1, 'Sean Bean', 1),
    (2, 'Emilia Clarke', 2);
