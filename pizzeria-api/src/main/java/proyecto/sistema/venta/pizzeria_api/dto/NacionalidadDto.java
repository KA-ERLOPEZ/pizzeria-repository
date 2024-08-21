package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class NacionalidadDto {

	private int nacId;

	private boolean nacEnabled = true;

	@NotNull
	private String nacNombre;
}
