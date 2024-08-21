package proyecto.sistema.venta.pizzeria_api.services.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.ConflictException;
import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.CustomException;
import proyecto.sistema.venta.pizzeria_api.dto.RoleDto;
import proyecto.sistema.venta.pizzeria_api.entities.Role;
import proyecto.sistema.venta.pizzeria_api.repositories.RoleRepository;
import proyecto.sistema.venta.pizzeria_api.services.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository repository;

	@Autowired
	private ModelMapper mapper;

	@Override
	public RoleDto getById(Integer id) {
		Role role = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se encontrò registro con id: " + id));
		return mapper.map(role, RoleDto.class);
	}

	@Override
	public RoleDto save(RoleDto entity) {

		Role role = repository.findByRoleDescripcion(entity.getRoleDescripcion());

		if (Objects.isNull(role)) {

			role = mapper.map(entity, Role.class);
			return mapper.map(repository.save(role), RoleDto.class);
		}

		throw new ConflictException("Ya existe registro con descripciòn: " + entity.getRoleDescripcion());
	}

	@Override
	public RoleDto update(RoleDto entity) {
		Role role = repository.findByRoleDescripcion(entity.getRoleDescripcion());

		if (Objects.isNull(role) || entity.getRoleId() == role.getRoleId()) {

			role = mapper.map(entity, Role.class);
			return mapper.map(repository.save(role), RoleDto.class);
		}

		throw new ConflictException("Ya existe registro con descripciòn: " + entity.getRoleDescripcion());
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Role role = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se encontrò registro con id: " + id));
		
		repository.delete(role);

	}

	@Override
	public void delete(RoleDto entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<RoleDto> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll()
				.stream()
				.map(role -> mapper.map(role, RoleDto.class)).collect(Collectors.toList());
	}

}
