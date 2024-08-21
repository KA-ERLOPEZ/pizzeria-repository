package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Ciudad;

@Data
@AllArgsConstructor @NoArgsConstructor
public class BarrioDto {

	private int barId;

	private boolean barEnabled= true;

	@NotNull
	private String barNombre;
	
	private Ciudad ciudad;
}
