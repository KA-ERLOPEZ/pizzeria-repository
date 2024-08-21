package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Caja;
import proyecto.sistema.venta.pizzeria_api.entities.Transaccion;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CajaAperturaCierreDto {

	private int id;

	@NotNull
	private Date cacFechaApertura;

	@NotNull
	private Date cacFechaCierre;

	@NotNull
	private Caja caja;

	@NotNull
	private Usuario usuario;

	private List<Transaccion> transacciones;
}
