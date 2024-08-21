package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Persona;
import proyecto.sistema.venta.pizzeria_api.entities.Role;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UsuarioDto {

	private int usuId;

	private boolean enabled = true;

	private Date usuFecCreacion;

	@NotNull
	@NotBlank
	private String usuPassword;

	@NotNull
	@NotBlank
	private String usuUsername;

	private Set<Role> roles = new HashSet<>();
	
	@NotNull
	private Persona persona;
}
