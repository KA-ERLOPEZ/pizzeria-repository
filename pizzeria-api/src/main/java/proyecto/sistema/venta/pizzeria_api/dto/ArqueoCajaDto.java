package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.CajaAperturaCierre;
import proyecto.sistema.venta.pizzeria_api.entities.DetalleArqueo;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ArqueoCajaDto {

	private long arqueoId;

	private Date arqueoFecha;

	private Date arqueoHora;

	private double arqueoSaldo;

	private double arqueoSaldoCaja;

	private double arqueoSaldoFaltante;

	private double arqueoSaldoSobrante;

	private CajaAperturaCierre cajaAperturaCierre;

	private Usuario usuario;

	private List<DetalleArqueo> detalleArqueos;
}
