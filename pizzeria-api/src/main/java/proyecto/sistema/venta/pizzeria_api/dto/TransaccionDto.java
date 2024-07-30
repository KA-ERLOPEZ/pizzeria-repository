package proyecto.sistema.venta.pizzeria_api.dto;

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

	private String tranDescripcion;

	private byte tranEnabled;

	private double tranMonto;

	private CajaAperturaCierre cajaAperturaCierre;

	private TipoTransaccion tipoTransaccione;
}
