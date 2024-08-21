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

import proyecto.sistema.venta.pizzeria_api.dto.UsuarioDto;
import proyecto.sistema.venta.pizzeria_api.services.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@PostMapping("/supervisor/usuario")
	public ResponseEntity<UsuarioDto> guardarUsuario(@RequestBody UsuarioDto usuario){
		
		return new ResponseEntity<>(service.save(usuario), HttpStatus.CREATED);
	}
	
	@PutMapping("/usario")
	public ResponseEntity<UsuarioDto> actualizarUsuario(@RequestBody UsuarioDto usuario){
		
		return new ResponseEntity<>(service.update(usuario), HttpStatus.OK);
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<UsuarioDto> buscarUsuarioById(@PathVariable("id") int id){
		
		return ResponseEntity.ok(service.getById(id));
	}
	
	@DeleteMapping("/admin/usuario/{id}")
	public ResponseEntity<?> eliminarUsuarioById(@PathVariable("id") int id){
		
		service.deleteById(id);
		
		return ResponseEntity.ok(Map.of("message:", "Registro eliminado con exito"));
	}
	
	@GetMapping("/public/usuario")
	public ResponseEntity<?> listarUsuarios(){
		
		return ResponseEntity.ok(service.getAll());
	}
	
}
