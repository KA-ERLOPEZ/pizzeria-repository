package proyecto.sistema.venta.pizzeria_api.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.TipoPago;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;
import proyecto.sistema.venta.pizzeria_api.entities.Venta;

@Data
@AllArgsConstructor @NoArgsConstructor
public class PagoDto {

	private long pagId;

	private Timestamp pagFecha;

	private double pagMonto;
	
	private boolean enabled;

	private TipoPago tipoPago;

	private Usuario usuario;

	private Venta venta;
}
