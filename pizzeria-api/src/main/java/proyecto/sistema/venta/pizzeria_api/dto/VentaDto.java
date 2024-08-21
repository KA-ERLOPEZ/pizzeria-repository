package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.CajaAperturaCierre;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;
import proyecto.sistema.venta.pizzeria_api.entities.VentaDetalle;

@Data
@AllArgsConstructor @NoArgsConstructor
public class VentaDto {

	private int ventaId;
	
	@NotNull
	private double totalExentas;

	@NotNull
	private String ventaEstado;

	@NotNull
	private Date ventaFecha;

	@NotNull
	private String ventaTipo;

	@NotNull
	private double ventaTotal;

	@NotNull
	private double ventaTotalIva10;

	@NotNull
	private double ventaTotalIva5;

	@NotNull
	private CajaAperturaCierre cajaAperturaCierre;

	@NotNull
	private Usuario usuario;

	private List<VentaDetalle> Detalles;
}
