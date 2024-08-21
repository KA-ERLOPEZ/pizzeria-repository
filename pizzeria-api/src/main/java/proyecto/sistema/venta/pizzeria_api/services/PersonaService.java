package proyecto.sistema.venta.pizzeria_api.services;


import java.util.List;

import proyecto.sistema.venta.pizzeria_api.dto.PersonaDto;

public interface PersonaService extends GenericService<PersonaDto, Integer> {

	List<PersonaDto> getAllPersonasByNombre(String nombre);
	
	PersonaDto getPersonaByNroDocumento(String nroDocumento);
}
