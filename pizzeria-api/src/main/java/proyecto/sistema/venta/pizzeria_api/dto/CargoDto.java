package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CargoDto {

	private long cargoId;

	private boolean cargoEnabled;

	private String cargoNombre;
}
