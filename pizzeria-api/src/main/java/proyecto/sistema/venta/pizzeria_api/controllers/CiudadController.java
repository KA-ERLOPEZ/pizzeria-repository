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
import proyecto.sistema.venta.pizzeria_api.dto.CiudadDto;
import proyecto.sistema.venta.pizzeria_api.services.CiudadService;

@RestController
@RequestMapping("/api")
public class CiudadController {

	@Autowired
	private CiudadService service;
	
	@PostMapping("/user/ciudad")
	public ResponseEntity<CiudadDto> guardarCiudad(@Valid @RequestBody CiudadDto ciudad) {

		return new ResponseEntity<>(service.save(ciudad), HttpStatus.CREATED);
	}

	@PutMapping("/user/ciudad")
	public ResponseEntity<CiudadDto> actualizarCiudad(@Valid @RequestBody CiudadDto ciudad) {

		return new ResponseEntity<>(service.update(ciudad), HttpStatus.OK);
	}

	@GetMapping("/public/ciudad/{id}")
	public ResponseEntity<CiudadDto> buscarCiudadById(@PathVariable("id")int id) {

		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}

	@DeleteMapping("/supervisor/ciudad/{id}")
	public ResponseEntity<?> EliminarCiudadById(@PathVariable("id") int id) {

		service.deleteById(id);
		return new ResponseEntity<>(Map.of("message", "Registro eliminado con exito"), HttpStatus.CREATED);
	}
	
	@GetMapping("/public/ciudad")
	public ResponseEntity<?> listarCiudades(){
		
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
		
	}
}
