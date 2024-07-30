package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TipoContratoDto {

	private long tcId;

	private boolean tcEnabled;

	private String tcLeyNro;

	private String tcNombre;
}
