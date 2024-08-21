package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.CajaAperturaCierre;
import proyecto.sistema.venta.pizzeria_api.entities.DetalleArqueo;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ArqueoCajaDto {

	private int arqueoId;

	@NotNull
	private Date arqueoFecha;

	@NotNull
	private Date arqueoHora;

	@NotNull
	private double arqueoSaldo;

	@NotNull
	private double arqueoSaldoCaja;

	@NotNull
	private double arqueoSaldoFaltante;

	@NotNull
	private double arqueoSaldoSobrante;

	private CajaAperturaCierre cajaAperturaCierre;

	private Usuario usuario;

	private List<DetalleArqueo> detalleArqueos;
}
