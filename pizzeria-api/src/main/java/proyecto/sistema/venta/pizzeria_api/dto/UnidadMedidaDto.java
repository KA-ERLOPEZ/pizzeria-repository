package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UnidadMedidaDto {

	private int umId;

	@NotNull
	private String umAbreviatura;

	private boolean umEnabled = true;

	@NotNull
	private String umNombre;
}
