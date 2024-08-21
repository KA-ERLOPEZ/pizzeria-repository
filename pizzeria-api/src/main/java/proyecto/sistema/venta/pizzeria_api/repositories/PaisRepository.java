package proyecto.sistema.venta.pizzeria_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.sistema.venta.pizzeria_api.entities.Pais;

public interface PaisRepository extends JpaRepository<Pais, Integer> {

	Pais findByPaisNombre(String paisNombre);
}
