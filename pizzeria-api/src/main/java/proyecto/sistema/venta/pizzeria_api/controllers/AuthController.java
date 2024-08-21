package proyecto.sistema.venta.pizzeria_api.controllers;

import java.security.Principal;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.sistema.venta.pizzeria_api.configurations.CustomUserDetails;
import proyecto.sistema.venta.pizzeria_api.configurations.CustomUserDetailsService;
import proyecto.sistema.venta.pizzeria_api.configurations.JwtProvider;
import proyecto.sistema.venta.pizzeria_api.dto.LoginDto;
import proyecto.sistema.venta.pizzeria_api.dto.SignupDto;
import proyecto.sistema.venta.pizzeria_api.dto.TokenDto;
import proyecto.sistema.venta.pizzeria_api.dto.UsuarioDto;
import proyecto.sistema.venta.pizzeria_api.services.UsuarioService;

@RestController
@RequestMapping("/api")
public class AuthController {

	@Autowired
	private JwtProvider jwtProvider;

	@Autowired
	private CustomUserDetailsService detailsService;
	
	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private ModelMapper mapper;

	@PostMapping("/public/auth/login")
	public ResponseEntity<TokenDto> login(@RequestBody LoginDto login) {

		// Autenticamos el usuario
		UserDetails user = (UserDetails) authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(login.getUsername(), login.getPassword()))
				.getPrincipal();
		
		//Obtenemos el token si todo va bien
		String token = jwtProvider.generateToken(user);
		
		return new ResponseEntity<TokenDto>(new TokenDto(token), HttpStatus.OK);

	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody SignupDto signup){
		
		return new ResponseEntity<>(usuarioService.save(mapper.map(signup, UsuarioDto.class)), HttpStatus.CREATED);
	}
	
	@GetMapping("/principal")
	public CustomUserDetails principal(Principal principal){
		
		return (CustomUserDetails) detailsService.loadUserByUsername(principal.getName());
	}
}
