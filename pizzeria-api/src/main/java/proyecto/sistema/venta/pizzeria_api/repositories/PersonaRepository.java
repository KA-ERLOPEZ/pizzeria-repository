package proyecto.sistema.venta.pizzeria_api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.sistema.venta.pizzeria_api.entities.Persona;
import java.util.List;


public interface PersonaRepository extends JpaRepository<Persona, Integer> {

	List<Persona> findAllByPerNombre(String perNombre);
	
	Persona findByPerNroDocumento(String perNroDocumento);
	
}
