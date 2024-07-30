package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class SaborDto {
	
	private int sabId;

	private boolean sabEnabled;

	private String sabNombre;

}
