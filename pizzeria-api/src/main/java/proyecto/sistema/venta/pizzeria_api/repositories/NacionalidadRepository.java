package proyecto.sistema.venta.pizzeria_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.sistema.venta.pizzeria_api.entities.Nacionalidad;


public interface NacionalidadRepository extends JpaRepository<Nacionalidad, Integer> {

	Nacionalidad findByNacNombre(String nacNombre);
}
