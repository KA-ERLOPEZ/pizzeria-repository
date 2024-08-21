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
import proyecto.sistema.venta.pizzeria_api.dto.BarrioDto;

import proyecto.sistema.venta.pizzeria_api.services.BarrioService;

@RestController
@RequestMapping("/api")
public class BarrioController {

	@Autowired
	private BarrioService service;
	
	@PostMapping("/user/barrio")
	public ResponseEntity<BarrioDto> guardarBario(@Valid @RequestBody BarrioDto barrio) {

		return new ResponseEntity<>(service.save(barrio), HttpStatus.CREATED);
	}

	@PutMapping("/user/barrio")
	public ResponseEntity<BarrioDto> actualizarBarrio(@Valid @RequestBody BarrioDto barrio) {

		return new ResponseEntity<>(service.update(barrio), HttpStatus.OK);
	}

	@GetMapping("/public/barrio/{id}")
	public ResponseEntity<BarrioDto> buscarBarrioById(@PathVariable("id")int id) {

		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}

	@DeleteMapping("/supervisor/barrio/{id}")
	public ResponseEntity<?> EliminarBarrioById(@PathVariable("id") int id) {

		service.deleteById(id);
		return new ResponseEntity<>(Map.of("message", "Registro eliminado con exito"), HttpStatus.OK);
	}
	
	@GetMapping("/public/barrio")
	public ResponseEntity<?> listarCiudades(){
		
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		
	}
}