package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TimbradoDto {
	
	private int timbradoId;

	private boolean timbradoEnabled = true;

	@NotNull
	private Date timbradoFechaFin;

	@NotNull
	private String timbradoNro;
	
	@NotNull
	private Date timbrdoFechaInic;
}
