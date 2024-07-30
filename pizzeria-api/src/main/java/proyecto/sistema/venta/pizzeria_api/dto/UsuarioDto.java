package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.Set;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Role;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UsuarioDto {

	private long usuId;

	private boolean enabled;

	private Date usuFecCreacion;

	private String usuPassword;

	private String usuUsername;

	private Set<Role> roles;
}
