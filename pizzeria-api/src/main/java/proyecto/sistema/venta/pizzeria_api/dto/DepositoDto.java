package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Sucursal;

@Data
@AllArgsConstructor @NoArgsConstructor
public class DepositoDto {

	private int depoId;
	
	private boolean depoEstado = true;

	@NotNull
	private String depoNombre;

	private Sucursal sucursal;
}
