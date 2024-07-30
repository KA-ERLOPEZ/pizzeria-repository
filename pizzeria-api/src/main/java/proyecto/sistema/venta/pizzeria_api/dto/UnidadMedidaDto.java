package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UnidadMedidaDto {

	private long umId;

	private String umAbreviatura;

	private boolean umEnabled;

	private String umNombre;
}
