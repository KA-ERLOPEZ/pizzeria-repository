package proyecto.sistema.venta.pizzeria_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.sistema.venta.pizzeria_api.entities.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {

	Ciudad findByCiuNombre(String nombre);
}
