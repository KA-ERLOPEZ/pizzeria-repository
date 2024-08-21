package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TamanoDto {

	private int tamId;

	@NotNull
	private String tamDescripcion;

	private boolean tamEnabled = true;
	
}
