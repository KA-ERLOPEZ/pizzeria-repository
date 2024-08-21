package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Barrio;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ProveedorDto {

	private int provId;

	@NotNull
	private String provDireccion;

	@NotNull
	private String provEmail;

	@NotNull
	private boolean provEnabled;

	@NotNull
	private String provPagWeb;

	@NotNull
	private String provRazonSocial;

	@NotNull
	private String provRuc;

	@NotNull
	private String provTelefono;
	
	private Barrio barrio;
}
