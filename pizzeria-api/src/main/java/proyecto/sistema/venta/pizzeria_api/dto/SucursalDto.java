package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class SucursalDto {

	private long sucId;

	private String sucDireccion;

	private String sucEmail;

	private boolean sucEstado;

	private String sucNombre;

	private String sucTelefono;
}
