package proyecto.sistema.venta.pizzeria_api.configurations;

import java.io.IOException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private JwtProvider jwtProvider;

	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Obtenemos el token de la peticiòn
		String token = getTokenByRequest(request);

		if (Objects.nonNull(token)) {
			// Validamos y token y pregunatomos si el contexto de autentiacion està
			if (jwtProvider.validateToken(token) && SecurityContextHolder.getContext().getAuthentication() == null) {

				// Obtenemos el nombre de usuario del token
				String username = jwtProvider.getUsernameByToken(token);

				// Obtenemos el usuario con el usename del token
				UserDetails user = userDetailsService.loadUserByUsername(username);

				// Creamos token de authenticacion
				UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
						username, null, user.getAuthorities());

				// Agregamos la peticion a nuestro token
				authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

				// Pasamos nuestro token al contexto de seguridad
				SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			}
		}
		

		filterChain.doFilter(request, response);
	}

	private String getTokenByRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub

		String bearerToken = request.getHeader("Authorization");

		if (Objects.nonNull(bearerToken) && bearerToken.startsWith("Bearer")) {
			return bearerToken.substring(7);
		}
		return null;
	}

}
