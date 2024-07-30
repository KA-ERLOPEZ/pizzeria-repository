package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Barrio;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ProveedorDto {

	private long provId;

	private String provDireccion;

	private String provEmail;

	private boolean provEnabled;

	private String provPagWeb;

	private String provRazonSocial;

	private String provRuc;

	private String provTelefono;
	
	private Barrio barrio;
}
