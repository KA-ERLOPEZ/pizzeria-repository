package proyecto.sistema.venta.pizzeria_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.sistema.venta.pizzeria_api.entities.Barrio;


public interface BarrioRepository extends JpaRepository<Barrio, Integer> {

	Barrio findByBarNombre(String barNombre);
}
