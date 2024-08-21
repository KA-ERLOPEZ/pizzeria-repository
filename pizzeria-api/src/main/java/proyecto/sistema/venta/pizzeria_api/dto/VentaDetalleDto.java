package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import proyecto.sistema.venta.pizzeria_api.entities.Stock;
import proyecto.sistema.venta.pizzeria_api.entities.Venta;
import proyecto.sistema.venta.pizzeria_api.entities.VentaDetallePK;

@Data
@AllArgsConstructor

public class VentaDetalleDto {

	private VentaDetallePK id;

	@NotNull
	private double vdCantidad;

	@NotNull
	private double vdIvaMonto;

	@NotNull
	private double vdPrecio;

	@NotNull
	private double vdSubtotal;

	@NotNull
	private String vdTipoIva;
	
	@NotNull
	private Stock stock;

	@NotNull
	private Venta venta;
}
