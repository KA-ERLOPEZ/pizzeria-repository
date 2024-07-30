package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Ciudad;

@Data
@AllArgsConstructor @NoArgsConstructor
public class BarrioDto {

	private long barId;

	private boolean barEnabled;

	private String barNombre;
	
	private Ciudad ciudade;
}
