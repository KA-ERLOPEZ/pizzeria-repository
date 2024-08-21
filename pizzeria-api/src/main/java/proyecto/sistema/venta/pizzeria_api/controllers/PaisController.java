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
import proyecto.sistema.venta.pizzeria_api.dto.PaisDto;
import proyecto.sistema.venta.pizzeria_api.services.PaisService;

@RestController
@RequestMapping("/pais")
public class PaisController {

	@Autowired
	private PaisService service;

	@PostMapping("/user/pais")
	public ResponseEntity<PaisDto> guardarPais(@Valid @RequestBody PaisDto pais) {

		return new ResponseEntity<>(service.save(pais), HttpStatus.CREATED);
	}

	@PutMapping("/user/pais")
	public ResponseEntity<PaisDto> actualizarPais(@Valid @RequestBody PaisDto pais) {

		return new ResponseEntity<>(service.update(pais), HttpStatus.OK);
	}

	@GetMapping("/user/pais/{id}")
	public ResponseEntity<PaisDto> busarPaisById(@PathVariable("id") int id) {

		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}

	@DeleteMapping("/supervisor/pais/{id}")
	public ResponseEntity<?> EliminarPaisById(@PathVariable("id") int id) {

		service.deleteById(id);
		return new ResponseEntity<>(Map.of("message", "Registro eliminado con exito"), HttpStatus.OK);
	}
	
	@GetMapping("/public/pais")
	public ResponseEntity<?> listarPiases(){
		
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		
	}
}
