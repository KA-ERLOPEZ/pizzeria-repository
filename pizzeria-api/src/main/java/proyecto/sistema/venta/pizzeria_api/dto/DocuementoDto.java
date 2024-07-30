package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Timbrado;
import proyecto.sistema.venta.pizzeria_api.entities.TipoDoumento;
import proyecto.sistema.venta.pizzeria_api.entities.Venta;

@Data
@AllArgsConstructor @NoArgsConstructor
public class DocuementoDto {
	
	private long documentoId;

	private boolean documentoEnabled;

	private Date documentoFecEmision;

	private String documentoNro;

	private Timbrado timbrado;

	private TipoDoumento tipoDoumento;

	private Venta ventaCabecera;

}
