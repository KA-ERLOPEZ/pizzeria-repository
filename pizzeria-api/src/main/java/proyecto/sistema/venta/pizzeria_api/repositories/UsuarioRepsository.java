package proyecto.sistema.venta.pizzeria_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.sistema.venta.pizzeria_api.entities.Usuario;
import java.util.Optional;


public interface UsuarioRepsository extends JpaRepository<Usuario, Integer> {

	
	Optional<Usuario> findByUsuUsername(String usuUsername);
}
