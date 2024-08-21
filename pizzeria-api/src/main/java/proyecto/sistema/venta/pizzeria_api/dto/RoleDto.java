package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class RoleDto {

	private int roleId;

	@NotNull
	@NotBlank
	private String roleDescripcion;

	private boolean roleEnabled = true;
}
