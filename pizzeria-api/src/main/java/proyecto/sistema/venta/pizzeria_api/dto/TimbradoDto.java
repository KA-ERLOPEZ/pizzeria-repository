package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TimbradoDto {
	
	private long timbradoId;

	private boolean timbradoEnabled;

	private Date timbradoFechaFin;

	private String timbradoNro;
	
	private Date timbrdoFechaInic;
}
