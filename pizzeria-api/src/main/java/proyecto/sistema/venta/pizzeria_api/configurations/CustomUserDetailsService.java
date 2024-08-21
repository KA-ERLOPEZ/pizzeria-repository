package proyecto.sistema.venta.pizzeria_api.configurations;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import proyecto.sistema.venta.pizzeria_api.configurations.exeptions.CustomException;
import proyecto.sistema.venta.pizzeria_api.entities.Role;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;
import proyecto.sistema.venta.pizzeria_api.repositories.UsuarioRepsository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepsository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = repository.findByUsuUsername(username)
				.orElseThrow(()-> new CustomException("No se encontro usuario con username: " + username));
		return new CustomUserDetails(
				usuario.getUsuUsername(),
				usuario.getUsuPassword(),
				usuario.getPersona().getPerNombre(),
				usuario.getPersona().getPerApellido(),
				usuario.isEnabled(),
				getAuthorities(usuario.getRoles())
				);
	}

	private Collection<? extends GrantedAuthority> getAuthorities(Set<Role> roles) {
		// TODO Auto-generated method stub
		return roles.stream().map(role -> {
			return new SimpleGrantedAuthority(role.getRoleDescripcion());
		}).collect(Collectors.toList());
	}

}
