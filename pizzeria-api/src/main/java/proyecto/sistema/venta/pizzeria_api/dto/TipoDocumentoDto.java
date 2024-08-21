package proyecto.sistema.venta.pizzeria_api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TipoDocumentoDto {

	private int tipodocId;

	@NotNull
	private String tipodocDescripcion;

	private boolean tipodocEstado = true;
}
