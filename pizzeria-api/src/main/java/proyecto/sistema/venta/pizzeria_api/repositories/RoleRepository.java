package proyecto.sistema.venta.pizzeria_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import proyecto.sistema.venta.pizzeria_api.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByRoleDescripcion(String roleDescripcion);
}
