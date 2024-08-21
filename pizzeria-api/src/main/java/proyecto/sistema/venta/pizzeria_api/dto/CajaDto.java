package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.CajaAperturaCierre;
import proyecto.sistema.venta.pizzeria_api.entities.Sucursal;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CajaDto {

	private int cajaId;

	@NotNull
	private String cajaEstado;

	@NotNull
	private String cajaNro;

	private List<CajaAperturaCierre> cajaAperturaCierres;

	private Sucursal sucursal;
}
