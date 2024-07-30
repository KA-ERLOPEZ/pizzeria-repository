package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TipoDocumentoDto {

	private long tipodocId;

	private String tipodocDescripcion;

	private boolean tipodocEstado;
}
