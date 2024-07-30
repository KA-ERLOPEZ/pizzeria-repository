package proyecto.sistema.venta.pizzeria_api.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.OpDetallePK;
import proyecto.sistema.venta.pizzeria_api.entities.OrdenProduccion;
import proyecto.sistema.venta.pizzeria_api.entities.Stock;
import proyecto.sistema.venta.pizzeria_api.entities.UnidadMedida;

@Data
@AllArgsConstructor @NoArgsConstructor
public class OpDetalleDto {

	private OpDetallePK id;

	private double opdCantidad;

	private OrdenProduccion ordenProduccion;

	private Stock stock;

	private UnidadMedida unidadMedida;
}
