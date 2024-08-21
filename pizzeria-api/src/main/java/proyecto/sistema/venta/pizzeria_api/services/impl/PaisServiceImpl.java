package proyecto.sistema.venta.pizzeria_api.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.ConflictException;
import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.CustomException;
import proyecto.sistema.venta.pizzeria_api.dto.PaisDto;
import proyecto.sistema.venta.pizzeria_api.entities.Pais;
import proyecto.sistema.venta.pizzeria_api.repositories.PaisRepository;
import proyecto.sistema.venta.pizzeria_api.services.PaisService;

@Service
public class PaisServiceImpl implements PaisService {

	@Autowired
	private PaisRepository repository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public PaisDto getById(Integer id) {

		Pais pais = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se encontro registro con id: " + id));

		return mapper.map(pais, PaisDto.class);
	}

	@Override
	public PaisDto save(PaisDto entity) {
		// TODO Auto-generated method stub
		Pais pais = repository.findByPaisNombre(entity.getPaisNombre());

		if (Objects.isNull(pais) || pais.getPaisId() == entity.getPaisId()) {
			pais.setPaisNombre(entity.getPaisNombre().toUpperCase());
			return mapper.map(repository.save(mapper.map(entity, Pais.class)), PaisDto.class);

		}
		
		throw new ConflictException("Ya existe un pais con nombre: " + entity.getPaisNombre());
	}

	@Override
	public PaisDto update(PaisDto entity) {
		// TODO Auto-generated method stub
		Pais pais = repository.findByPaisNombre(entity.getPaisNombre());

		if (Objects.isNull(pais) || pais.getPaisId() == entity.getPaisId()) {
			pais.setPaisNombre(entity.getPaisNombre().toUpperCase());
			return mapper.map(repository.save(mapper.map(entity, Pais.class)), PaisDto.class);

		}
		
		throw new ConflictException("Ya existe un pais con nombre: " + entity.getPaisNombre());
	}

	@Override
	public void deleteById(Integer id) {
		Pais pais = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se encontro registro con id: " + id));
		repository.delete(pais);
	}

	@Override
	public void delete(PaisDto entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PaisDto> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll().stream().map(pais -> mapper.map(pais, PaisDto.class)).collect(Collectors.toList());
	}

}
