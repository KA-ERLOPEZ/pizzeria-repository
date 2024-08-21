package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Persona;

@Data
@NoArgsConstructor
public class SignupDto {

	private int usuId;

	private boolean enabled = true;

	private Date usuFecCreacion;

	@NotNull
	@NotBlank
	private String usuPassword;

	@NotNull
	@NotBlank
	private String usuUsername;
	
	@NotNull
	private Persona persona;
}
