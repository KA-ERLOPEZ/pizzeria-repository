package proyecto.sistema.venta.pizzeria_api.dto;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class LoteDto {

	private long loteId;

	private double loteCantidad;

	private Timestamp loteFechaVencimiento;

	private String loteNro;
}
