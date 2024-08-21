package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import proyecto.sistema.venta.pizzeria_api.entities.Barrio;
import proyecto.sistema.venta.pizzeria_api.entities.Contrato;
import proyecto.sistema.venta.pizzeria_api.entities.Nacionalidad;
import proyecto.sistema.venta.pizzeria_api.validations.Validable;
import proyecto.sistema.venta.pizzeria_api.validations.Validador;

@Data
@NoArgsConstructor
public class PersonaDto implements Validable<PersonaDto> {

	@Setter(value = AccessLevel.NONE)
	@Getter(value = AccessLevel.NONE)
	private List<Validador<PersonaDto>> validadores = new ArrayList<>();
	
	private int perId;

	@NotNull
	private String perApellido;

	@NotNull
	private String perDireccion;

	@NotNull
	private String perEmail;

	@NotNull
	private boolean perEnabled = true;

	@NotNull
	private Date perFecNac;

	@NotNull
	private String perNombre;

	@NotNull
	private String perNroDocumento;

	@NotNull
	private String perTelefono;

	private List<Contrato> contratos;

	@NotNull
	private Barrio barrio;

	@NotNull
	private Nacionalidad nacionalidad;

	@Override
	public void validar() {
		
		validadores.forEach(v -> v.validar(this) );
		
	}

	@Override
	public void agregarValidador(Validador<PersonaDto> v) {
		// TODO Auto-generated method stub
		validadores.add(v);
	}
}
