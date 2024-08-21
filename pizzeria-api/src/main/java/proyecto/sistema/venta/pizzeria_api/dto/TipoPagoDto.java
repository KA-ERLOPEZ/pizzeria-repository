package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TipoPagoDto {

	private int tpId;

	private boolean tpEnabled = true;

	@NotNull
	private String tpNombre;
}
