package proyecto.sistema.venta.pizzeria_api.dto;

import java.sql.Timestamp;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class LoteDto {

	private int loteId;

	@NotNull
	private double loteCantidad;

	@NotNull
	private Timestamp loteFechaVencimiento;

	@NotNull
	private String loteNro;
}
