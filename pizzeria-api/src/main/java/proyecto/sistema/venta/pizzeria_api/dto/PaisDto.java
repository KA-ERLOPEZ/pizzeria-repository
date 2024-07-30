package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Ciudad;

@Data
@AllArgsConstructor @NoArgsConstructor
public class PaisDto {

	private long paisId;
	
	private boolean paisEnabled;

	private String paisNombre;

	private List<Ciudad> ciudades;
}
