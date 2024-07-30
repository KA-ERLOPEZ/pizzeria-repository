package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Cargo;
import proyecto.sistema.venta.pizzeria_api.entities.ContratoPK;
import proyecto.sistema.venta.pizzeria_api.entities.Persona;
import proyecto.sistema.venta.pizzeria_api.entities.TipoContrato;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ContratoDto {

	private ContratoPK id;

	private boolean contEnabled;

	private Date contFecFin;

	private Date contFecInicio;

	private double contSalario;

	private Cargo cargo;

	private Persona persona;

	private TipoContrato tipoContrato;
}
