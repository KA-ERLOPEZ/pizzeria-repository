package proyecto.sistema.venta.pizzeria_api.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.CustomException;
import proyecto.sistema.venta.pizzeria_api.dto.NacionalidadDto;
import proyecto.sistema.venta.pizzeria_api.entities.Nacionalidad;
import proyecto.sistema.venta.pizzeria_api.repositories.NacionalidadRepository;
import proyecto.sistema.venta.pizzeria_api.services.NacionalidadService;

@Service
public class NacionalidadServiceImpl implements NacionalidadService {

	@Autowired
	private NacionalidadRepository repository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public NacionalidadDto getById(Integer id) {
		Nacionalidad nac = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se encontro nacionalidad con id: " + id));
		return mapper.map(nac, NacionalidadDto.class);
	}

	@Override
	public NacionalidadDto save(NacionalidadDto entity) {
		Nacionalidad nac = repository.findByNacNombre(entity.getNacNombre());

		if (Objects.isNull(nac)) {
			nac = mapper.map(entity, Nacionalidad.class);
			nac.setNacNombre(entity.getNacNombre().toUpperCase());
			return mapper.map(repository.save(nac), NacionalidadDto.class);
		}
		throw new CustomException("Ya existe Nacionalidad con nombre: " + entity.getNacNombre());
	}

	@Override
	public NacionalidadDto update(NacionalidadDto entity) {
		// TODO Auto-generated method stub
		Nacionalidad nac = repository.findByNacNombre(entity.getNacNombre());

		if (Objects.isNull(nac) || nac.getNacId() == entity.getNacId()) {
			nac = mapper.map(entity, Nacionalidad.class);
			nac.setNacNombre(entity.getNacNombre().toUpperCase());
			return mapper.map(repository.save(nac), NacionalidadDto.class);
		}
		throw new CustomException("Ya existe Nacionalidad con nombre: " + entity.getNacNombre());

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Nacionalidad nac = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se encontro nacionalidad con id: " + id));
		repository.delete(nac);
		

	}

	@Override
	public void delete(NacionalidadDto entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<NacionalidadDto> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll()
				.stream()
				.map(nac -> mapper.map(nac, NacionalidadDto.class)).collect(Collectors.toList());
	}

}
