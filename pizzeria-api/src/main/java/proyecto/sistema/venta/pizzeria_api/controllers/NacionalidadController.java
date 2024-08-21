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

import proyecto.sistema.venta.pizzeria_api.dto.NacionalidadDto;
import proyecto.sistema.venta.pizzeria_api.services.NacionalidadService;

@RestController
@RequestMapping("/api")
public class NacionalidadController {

	@Autowired
	private NacionalidadService service;

	@PostMapping("/user/nacionalidad")
	public ResponseEntity<NacionalidadDto> guardarNacionalidad(@RequestBody NacionalidadDto nac) {

		return new ResponseEntity<>(service.save(nac), HttpStatus.CREATED);
	}

	@PutMapping("/user/nacionalidad")
	public ResponseEntity<NacionalidadDto> actualizarNacionalidad(@RequestBody NacionalidadDto nac) {

		return new ResponseEntity<>(service.update(nac), HttpStatus.ACCEPTED);
	}

	@GetMapping("/public/nacionalidad")
	public ResponseEntity<?> listarNacionalidad() {

		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("public/nacionalidad/{id}")
	public ResponseEntity<NacionalidadDto> getNacionalidadById(@PathVariable("Id") int id){
		
		return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/supervisor/nacionalidad/{id}")
	public ResponseEntity<?> deleteNacionalidadById(@PathVariable("id") int id){
		
		service.deleteById(id);
		return new ResponseEntity<>(Map.of("message", "Elemento eliminado con exito"), HttpStatus.OK);
	}
}

