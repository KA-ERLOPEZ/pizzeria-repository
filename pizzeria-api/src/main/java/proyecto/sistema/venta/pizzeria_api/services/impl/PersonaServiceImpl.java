/**
 * 
 */
package proyecto.sistema.venta.pizzeria_api.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.ConflictException;
import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.CustomException;
import proyecto.sistema.venta.pizzeria_api.dto.PersonaDto;
import proyecto.sistema.venta.pizzeria_api.entities.Persona;
import proyecto.sistema.venta.pizzeria_api.repositories.PersonaRepository;
import proyecto.sistema.venta.pizzeria_api.services.PersonaService;
import proyecto.sistema.venta.pizzeria_api.validations.impl.PersonaValidadorFecha;

/**
 * 
 */

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public PersonaDto getById(Integer id) {
		// TODO Auto-generated method stub
		
		Persona per = repository.findById(id)
				.orElseThrow(()-> new CustomException("No se encontro registro con id: " + id));
		return mapper.map(per, PersonaDto.class);
	}

	@Override
	public PersonaDto save(PersonaDto entity) {
		// TODO Auto-generated method stub
		Persona per = repository.findByPerNroDocumento(entity.getPerNroDocumento());
		
		if(Objects.isNull(per)) {
			PersonaValidadorFecha validador = new PersonaValidadorFecha();
			entity.agregarValidador(validador);
			entity.validar();
			per = mapper.map(entity, Persona.class);
			return mapper.map(repository.save(per), PersonaDto.class);
		}
		
		throw new ConflictException("Ya existe registro con nro documento: "+ entity.getPerNroDocumento());
	}


	@Override
	public PersonaDto update(PersonaDto entity) {
		// TODO Auto-generated method stub
	Persona per = repository.findByPerNroDocumento(entity.getPerNroDocumento());
		
		if(Objects.isNull(per) || per.getPerId() == entity.getPerId()) {
			PersonaValidadorFecha validador = new PersonaValidadorFecha();
			entity.agregarValidador(validador);
			entity.validar();
			per = mapper.map(entity, Persona.class);
			return mapper.map(repository.save(per), PersonaDto.class);
		}
		
		throw new ConflictException("Ya existe registro con nro documento: "+ entity.getPerNroDocumento());
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Persona per = repository.findById(id)
				.orElseThrow(()-> new CustomException("No se encontro registro con id: " + id));
		repository.delete(per);
	}

	@Override
	public void delete(PersonaDto entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonaDto> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll().stream()
				.map(per -> mapper.map(per, PersonaDto.class)).collect(Collectors.toList());
	}

	@Override
	public List<PersonaDto> getAllPersonasByNombre(String nombre) {
		// TODO Auto-generated method stub
		return repository.findAllByPerNombre(nombre).stream()
				.map(per -> mapper.map(per, PersonaDto.class)).collect(Collectors.toList());
	}

	@Override
	public PersonaDto getPersonaByNroDocumento(String nroDocumento) {
		// TODO Auto-generated method stub
		Persona per = repository.findByPerNroDocumento(nroDocumento);
		
		if(Objects.nonNull(per)) {
			return mapper.map(per, PersonaDto.class);
		}
		
		throw new CustomException("No se encontro registro con Nro. Documento: "+nroDocumento);
	}

	
}
