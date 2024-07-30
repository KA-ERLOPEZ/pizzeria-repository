package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class RoleDto {

	private long roleId;

	private String roleDescripcion;

	private boolean roleEnabled;
}
