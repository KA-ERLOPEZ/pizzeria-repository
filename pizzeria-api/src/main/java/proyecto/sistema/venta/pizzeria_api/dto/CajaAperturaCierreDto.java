package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Caja;
import proyecto.sistema.venta.pizzeria_api.entities.Transaccion;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CajaAperturaCierreDto {

	private long id;

	private Date cacFechaApertura;

	private Date cacFechaCierre;

	private Caja caja;

	private Usuario usuario;

	private List<Transaccion> transacciones;
}
