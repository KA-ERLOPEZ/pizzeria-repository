package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Sucursal;

@Data
@AllArgsConstructor @NoArgsConstructor
public class DepositoDto {

	private long depoId;
	
	private boolean depoEstado;

	private String depoNombre;

	private Sucursal sucursal;
}
