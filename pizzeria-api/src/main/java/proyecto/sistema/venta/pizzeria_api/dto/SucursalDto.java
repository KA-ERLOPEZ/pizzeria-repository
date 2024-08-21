package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class SucursalDto {

	private int sucId;

	@NotNull
	private String sucDireccion;

	@NotNull
	private String sucEmail;

	private boolean sucEstado = true;

	@NotNull
	private String sucNombre;

	@NotNull
	private String sucTelefono;
}
