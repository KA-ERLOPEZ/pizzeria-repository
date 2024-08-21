package proyecto.sistema.venta.pizzeria_api.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.ConflictException;
import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.CustomException;
import proyecto.sistema.venta.pizzeria_api.dto.UsuarioDto;
import proyecto.sistema.venta.pizzeria_api.entities.Role;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;
import proyecto.sistema.venta.pizzeria_api.repositories.RoleRepository;
import proyecto.sistema.venta.pizzeria_api.repositories.UsuarioRepsository;
import proyecto.sistema.venta.pizzeria_api.services.UsuarioService;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepsository repository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private ModelMapper mapper;

	@Override
	public UsuarioDto getById(Integer id) {
		// TODO Auto-generated method stub
		Usuario usuario = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se usuario registro con id: " + id));
		return mapper.map(usuario, UsuarioDto.class);
	}

	@Override
	public UsuarioDto save(UsuarioDto entity) {
		// TODO Auto-generated method stub
		Usuario usuario = repository.findByUsuUsername(entity.getUsuUsername()).orElse(null);
		
		if (Objects.isNull(usuario)) {
			
			usuario = mapper.map(entity, Usuario.class);
			usuario.setUsuFecCreacion(new Date());
			usuario.setUsuPassword(encoder.encode(entity.getUsuPassword()));

			if(usuario.getRoles().isEmpty()) {
				Role role = new Role();
				role.setRoleId(5);
				role.setRoleDescripcion("ROLE_CLIENTE");
				usuario.getRoles().add(roleRepository.save(role));
			}
			return mapper.map(repository.save(usuario), UsuarioDto.class);
		}

		throw new ConflictException("Ya existe usuario con username: " + entity.getUsuUsername());
	}

	@Override
	public UsuarioDto update(UsuarioDto entity) {
		// TODO Auto-generated method stub
		Usuario usuario = repository.findByUsuUsername(entity.getUsuUsername()).orElse(null);

		if (Objects.isNull(usuario) || entity.getUsuId() == usuario.getUsuId()) {
			usuario = mapper.map(entity, Usuario.class);
			usuario.setUsuPassword(encoder.encode(entity.getUsuPassword()));
			return mapper.map(repository.save(usuario), UsuarioDto.class);
		}

		throw new ConflictException("Ya existe usuario con username: " + entity.getUsuUsername());
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Usuario usuario = repository.findById(id)
				.orElseThrow(() -> new CustomException("No se usuario registro con id: " + id));
		repository.delete(usuario);

	}

	@Override
	public void delete(UsuarioDto entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UsuarioDto> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll()
				.stream()
				.map(usu -> mapper.map(usu, UsuarioDto.class)).collect(Collectors.toList());
	}

}
