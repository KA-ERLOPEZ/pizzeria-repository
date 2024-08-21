package proyecto.sistema.venta.pizzeria_api.dto;


import jakarta.validation.constraints.NotNull;
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

	@NotNull
	private double opdCantidad;

	@NotNull
	private OrdenProduccion ordenProduccion;

	@NotNull
	private Stock stock;

	@NotNull
	private UnidadMedida unidadMedida;
}
