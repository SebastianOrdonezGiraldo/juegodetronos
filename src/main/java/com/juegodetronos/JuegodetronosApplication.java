package com.juegodetronos;

import com.juegodetronos.model.Serie;
import com.juegodetronos.model.Temporada;
import com.juegodetronos.model.Episodio;
import com.juegodetronos.model.Personaje;
import com.juegodetronos.model.Actor;
import com.juegodetronos.repository.SerieRepository;
import com.juegodetronos.repository.TemporadaRepository;
import com.juegodetronos.repository.EpisodioRepository;
import com.juegodetronos.repository.PersonajeRepository;
import com.juegodetronos.repository.ActorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JuegodetronosApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuegodetronosApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(SerieRepository serieRepository,
									  TemporadaRepository temporadaRepository,
									  EpisodioRepository episodioRepository,
									  PersonajeRepository personajeRepository,
									  ActorRepository actorRepository) {
		return (args) -> {
			// Cargar la serie "Juego de Tronos"
			Serie serie = new Serie();
			serie.setNombre("Juego de Tronos");
			serie.setDescripcion("Serie de fantasía basada en las novelas de George R. R. Martin");
			serie.setCreador("David Benioff y D.B. Weiss");
			serie.setClasificacion(9.3);
			serie.setNumeroTemporadas(8);
			serie.setAnioEmision(2011);
			serieRepository.save(serie);

			// Cargar las primeras dos temporadas
			Temporada temporada1 = new Temporada();
			temporada1.setNumeroTemporada(1);
			temporada1.setSerie(serie);
			temporadaRepository.save(temporada1);

			Temporada temporada2 = new Temporada();
			temporada2.setNumeroTemporada(2);
			temporada2.setSerie(serie);
			temporadaRepository.save(temporada2);

			// Cargar episodios para la primera temporada
			Episodio episodio1 = new Episodio();
			episodio1.setNombre("El invierno se acerca");
			episodio1.setDescripcion("Primer episodio de Juego de Tronos");
			episodio1.setClasificacion(9.1);
			episodio1.setTemporada(temporada1);
			episodioRepository.save(episodio1);

			Episodio episodio2 = new Episodio();
			episodio2.setNombre("El Camino Real");
			episodio2.setDescripcion("Segundo episodio de Juego de Tronos");
			episodio2.setClasificacion(8.8);
			episodio2.setTemporada(temporada1);
			episodioRepository.save(episodio2);

			// Cargar episodios para la segunda temporada
			Episodio episodio3 = new Episodio();
			episodio3.setNombre("El Norte no olvida");
			episodio3.setDescripcion("Primer episodio de la segunda temporada");
			episodio3.setClasificacion(9.0);
			episodio3.setTemporada(temporada2);
			episodioRepository.save(episodio3);

			Episodio episodio4 = new Episodio();
			episodio4.setNombre("Las tierras de la noche");
			episodio4.setDescripcion("Segundo episodio de la segunda temporada");
			episodio4.setClasificacion(8.9);
			episodio4.setTemporada(temporada2);
			episodioRepository.save(episodio4);

			// Cargar algunos personajes
			Personaje personaje1 = new Personaje();
			personaje1.setNombre("Eddard Stark");
			personaje1.setDescripcion("Señor de Invernalia y Guardián del Norte");
			personajeRepository.save(personaje1);

			Personaje personaje2 = new Personaje();
			personaje2.setNombre("Daenerys Targaryen");
			personaje2.setDescripcion("Última sobreviviente de la Casa Targaryen");
			personajeRepository.save(personaje2);

			// Cargar algunos actores
			Actor actor1 = new Actor();
			actor1.setNombre("Sean Bean");
			actor1.setTemporada(temporada1);
			actorRepository.save(actor1);

			Actor actor2 = new Actor();
			actor2.setNombre("Emilia Clarke");
			actor2.setTemporada(temporada2);
			actorRepository.save(actor2);
		};
	}
}

