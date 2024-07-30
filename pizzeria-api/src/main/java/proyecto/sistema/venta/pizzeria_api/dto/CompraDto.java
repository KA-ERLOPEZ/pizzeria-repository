package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.CompraDetalle;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;

@Data
@NoArgsConstructor @AllArgsConstructor
public class CompraDto {

	private long compraId;

	private String compraEstado;

	private Date compraFecCompra;

	private String compraNroFac;

	private String compraNroTimbrado;

	private Date compraTimbradoVenci;

	private String compraTipo;

	private double compraTotal;

	private double compraTotalExentas;

	private double compraTotalIva10;

	private double compraTotalIva5;

	private Usuario usuario;

	private List<CompraDetalle> Detalles;
}
