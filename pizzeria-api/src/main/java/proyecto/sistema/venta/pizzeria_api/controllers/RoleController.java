package proyecto.sistema.venta.pizzeria_api.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import proyecto.sistema.venta.pizzeria_api.dto.RoleDto;
import proyecto.sistema.venta.pizzeria_api.services.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleService service;
	
	@PostMapping("/supervisor/role")
	public ResponseEntity<RoleDto> guardarRole(@Valid @RequestBody RoleDto role) {

		return new ResponseEntity<>(service.save(role), HttpStatus.CREATED);
	}

	@PutMapping("/supervisor/role")
	public ResponseEntity<RoleDto> actualizarRole(@Valid @RequestBody RoleDto role) {

		return new ResponseEntity<>(service.update(role), HttpStatus.OK);
	}

	@GetMapping("/user/role/{id}")
	public ResponseEntity<RoleDto> busarRoleById(@PathVariable("id") int id) {

		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}

	@DeleteMapping("/admin/role/{id}")
	public ResponseEntity<?> EliminarRoleById(@PathVariable("id") int id) {

		service.deleteById(id);
		return new ResponseEntity<>(Map.of("message", "Registro eliminado con exito"), HttpStatus.OK);
	}
	
	@GetMapping("/role")
	public ResponseEntity<?> listarRoles(){
		
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		
	}

}
