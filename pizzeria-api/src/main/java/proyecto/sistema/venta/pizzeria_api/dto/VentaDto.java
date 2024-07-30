package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.CajaAperturaCierre;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;
import proyecto.sistema.venta.pizzeria_api.entities.VentaDetalle;

@Data
@AllArgsConstructor @NoArgsConstructor
public class VentaDto {

	private long ventaId;

	private double totalExentas;

	private String ventaEstado;

	private Date ventaFecha;

	private String ventaTipo;

	private double ventaTotal;

	private double ventaTotalIva10;

	private double ventaTotalIva5;

	private CajaAperturaCierre cajaAperturaCierre;

	private Usuario usuario;

	private List<VentaDetalle> Detalles;
}
