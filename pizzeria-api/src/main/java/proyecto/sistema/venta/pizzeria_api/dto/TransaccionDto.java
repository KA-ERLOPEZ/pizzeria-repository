package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.CajaAperturaCierre;
import proyecto.sistema.venta.pizzeria_api.entities.TipoTransaccion;
import proyecto.sistema.venta.pizzeria_api.entities.TransaccionPK;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TransaccionDto {

	private TransaccionPK id;

	@NotNull
	private String tranDescripcion;

	private boolean tranEnabled = true;

	@NotNull
	private double tranMonto;

	@NotNull
	private CajaAperturaCierre cajaAperturaCierre;

	@NotNull
	private TipoTransaccion tipoTransaccion;
}
