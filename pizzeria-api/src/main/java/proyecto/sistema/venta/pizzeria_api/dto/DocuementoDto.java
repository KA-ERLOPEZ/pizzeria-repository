package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Timbrado;
import proyecto.sistema.venta.pizzeria_api.entities.TipoDoumento;
import proyecto.sistema.venta.pizzeria_api.entities.Venta;

@Data
@AllArgsConstructor @NoArgsConstructor
public class DocuementoDto {
	
	private int documentoId;

	private boolean documentoEnabled = true;

	@NotNull
	private Date documentoFecEmision;

	@NotNull
	private String documentoNro;

	@NotNull
	private Timbrado timbrado;

	@NotNull
	private TipoDoumento tipoDoumento;

	private Venta ventaCabecera;

}
