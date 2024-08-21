package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class SaborDto {
	
	private int sabId;

	private boolean sabEnabled = true;

	@NotNull
	private String sabNombre;

}
