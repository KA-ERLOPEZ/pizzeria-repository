package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CargoDto {

	private int cargoId;

	private boolean cargoEnabled=true;

	@NotNull
	private String cargoNombre;
}
