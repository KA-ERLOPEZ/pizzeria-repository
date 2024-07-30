package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TipoPagoDto {

	private long tpId;

	private boolean tpEnabled;

	private String tpNombre;
}
