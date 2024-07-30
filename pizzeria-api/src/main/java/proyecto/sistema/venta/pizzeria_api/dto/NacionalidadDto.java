package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class NacionalidadDto {

	private long nacId;

	private boolean nacEnabled;

	private String nacNombre;
}
