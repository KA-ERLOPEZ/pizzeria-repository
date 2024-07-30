package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CategoriaDto {

	private long catId;

	private boolean catEnabled;

	private String catNombre;
}
