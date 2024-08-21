package proyecto.sistema.venta.pizzeria_api.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.CustomException;
import proyecto.sistema.venta.pizzeria_api.dto.BarrioDto;
import proyecto.sistema.venta.pizzeria_api.entities.Barrio;
import proyecto.sistema.venta.pizzeria_api.repositories.BarrioRepository;
import proyecto.sistema.venta.pizzeria_api.services.BarrioService;

@Service
public class BarrioServiceImpl implements BarrioService {

	@Autowired
	private BarrioRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public BarrioDto getById(Integer id) {
		//TODO  Auto-generated method stub
		Barrio barrio = repository.findById(id)
				.orElseThrow(()-> new CustomException("No se encontro registro con id: " + id));
		
		return mapper.map(barrio, BarrioDto.class);
	}

	@Override
	public BarrioDto save(BarrioDto entity) {
		
		Barrio barrio= mapper.map(entity, Barrio.class);
		return mapper.map(repository.save(barrio), BarrioDto.class);
	}

	@Override
	public BarrioDto update(BarrioDto entity) {
		Barrio barrio= mapper.map(entity, Barrio.class);
		return mapper.map(repository.save(barrio), BarrioDto.class);

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
		Barrio barrio=  repository.findById(id)
				.orElseThrow(()-> new CustomException("No se encontro registro con id: " + id));
		repository.delete(barrio);
	}

	@Override
	public void delete(BarrioDto entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BarrioDto> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll()
				.stream()
				.map(bar -> mapper.map(bar, BarrioDto.class))				
				.collect(Collectors.toList());
	}

}
