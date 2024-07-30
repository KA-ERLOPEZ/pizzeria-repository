package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Barrio;
import proyecto.sistema.venta.pizzeria_api.entities.Contrato;
import proyecto.sistema.venta.pizzeria_api.entities.Nacionalidad;

@Data
@AllArgsConstructor @NoArgsConstructor
public class PersonaDto {

	private long perId;

	private String perApellido;

	private String perDireccion;

	private String perEmail;

	private boolean perEnabled;

	private Date perFecNac;

	private String perNombre;

	private String perNroDocumento;

	private String perTelefono;

	private List<Contrato> contratos;

	private Barrio barrio;

	private Nacionalidad nacionalidad;
}
