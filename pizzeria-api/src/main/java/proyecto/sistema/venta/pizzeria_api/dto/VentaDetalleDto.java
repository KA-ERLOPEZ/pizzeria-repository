package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import proyecto.sistema.venta.pizzeria_api.entities.Stock;
import proyecto.sistema.venta.pizzeria_api.entities.Venta;
import proyecto.sistema.venta.pizzeria_api.entities.VentaDetallePK;

@Data
@AllArgsConstructor

public class VentaDetalleDto {

	private VentaDetallePK id;

	private double vdCantidad;

	private double vdIvaMonto;

	private double vdPrecio;

	private double vdSubtotal;

	private String vdTipoIva;
	
	private Stock stock;

	private Venta venta;
}
