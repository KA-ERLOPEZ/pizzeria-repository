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

import proyecto.sistema.venta.pizzeria_api.dto.PersonaDto;
import proyecto.sistema.venta.pizzeria_api.services.PersonaService;

@RestController
@RequestMapping("/api")
public class PersonaController {

	@Autowired
	private PersonaService service;

	@GetMapping("/persona/{id}")
	public ResponseEntity<PersonaDto> buscarPersonaPorId(@PathVariable("id") int id) {

		return ResponseEntity.ok(service.getById(id));
	}

	@GetMapping("/supervisor/persona/user/nro-doc/{nroDoc}")
	public ResponseEntity<PersonaDto> buscarPersonaPorNroDocumento(@PathVariable("nroDoc") String nroDoc) {

		return ResponseEntity.ok(service.getPersonaByNroDocumento(nroDoc));
	}

	@PostMapping("/user/persona")
	public ResponseEntity<PersonaDto> guardarPersona(@RequestBody PersonaDto persona) {

		return new ResponseEntity<PersonaDto>(service.save(persona), HttpStatus.CREATED);
	}
	
	@PutMapping("/user/persona")
	public ResponseEntity<PersonaDto> actualizarPersona(@RequestBody PersonaDto persona) {

		return new ResponseEntity<PersonaDto>(service.update(persona), HttpStatus.OK);
	}
	
	@DeleteMapping("/supervisor/persona/{id}")
	public ResponseEntity<?> eliminarPersonaPorId(@PathVariable("id") int id) {

		service.deleteById(id);
		return ResponseEntity.ok(Map.of("message", "Persona eliminado con exito"));
	}
	
	@GetMapping("/persona")
	public ResponseEntity<?> listarPersonas(){
		
		return ResponseEntity.ok(service.getAll());
	}

}
