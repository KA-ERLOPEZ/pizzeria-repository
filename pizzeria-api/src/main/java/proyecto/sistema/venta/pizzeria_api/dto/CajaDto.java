package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.CajaAperturaCierre;
import proyecto.sistema.venta.pizzeria_api.entities.Sucursal;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CajaDto {

	private long cajaId;

	private String cajaEstado;

	private String cajaNro;

	private List<CajaAperturaCierre> cajaAperturaCierres;

	private Sucursal sucursal;
}
