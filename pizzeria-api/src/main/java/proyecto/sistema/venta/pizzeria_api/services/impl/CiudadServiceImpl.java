package proyecto.sistema.venta.pizzeria_api.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.ConflictException;
import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.CustomException;
import proyecto.sistema.venta.pizzeria_api.dto.CiudadDto;
import proyecto.sistema.venta.pizzeria_api.entities.Ciudad;
import proyecto.sistema.venta.pizzeria_api.repositories.CiudadRepository;
import proyecto.sistema.venta.pizzeria_api.services.CiudadService;

@Service
public class CiudadServiceImpl implements CiudadService {

	@Autowired
	private CiudadRepository repository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public CiudadDto getById(Integer id) {

		Ciudad ciudad = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se encontro registro con id: " + id));
		return mapper.map(ciudad, CiudadDto.class);
	}

	@Override
	public CiudadDto save(CiudadDto entity) {

		Ciudad ciudad = repository.findByCiuNombre(entity.getCiuNombre().toUpperCase());
		if(Objects.isNull(ciudad)) {
			 ciudad = mapper.map(entity, Ciudad.class);
			 ciudad.setCiuNombre(entity.getCiuNombre().toUpperCase());
				return mapper.map(repository.save(ciudad), CiudadDto.class);
		}
		
		throw new ConflictException("Ya existe ciudad con nombre: " + entity.getCiuNombre());
	}

	@Override
	public CiudadDto update(CiudadDto entity) {

		Ciudad ciudad = repository.findByCiuNombre(entity.getCiuNombre());
		if(Objects.isNull(ciudad)|| ciudad.getCiuId() == entity.getCiuId()) {
			 ciudad = mapper.map(entity, Ciudad.class);
			 ciudad.setCiuNombre(entity.getCiuNombre().toUpperCase());
			 return mapper.map(repository.save(ciudad), CiudadDto.class);
		}
		
		throw new ConflictException("Ya existe ciudad con nombre: " + entity.getCiuNombre());
	}

	@Override
	public void deleteById(Integer id) {
		Ciudad ciudad = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se encontro registro con id: " + id));
		repository.delete(ciudad);
	}

	@Override
	public void delete(CiudadDto entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CiudadDto> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll().stream().map(ciu -> mapper.map(ciu, CiudadDto.class)).collect(Collectors.toList());
	}

}
