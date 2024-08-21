package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.CompraDetalle;
import proyecto.sistema.venta.pizzeria_api.entities.Usuario;

@Data
@NoArgsConstructor @AllArgsConstructor
public class CompraDto {

	private int compraId;

	@NotNull
	private String compraEstado;

	@NotNull
	private Date compraFecCompra;

	@NotNull
	private String compraNroFac;

	@NotNull
	private String compraNroTimbrado;

	@NotNull
	private Date compraTimbradoVenci;

	@NotNull
	private String compraTipo;

	@NotNull
	private double compraTotal;

	@NotNull
	private double compraTotalExentas;

	@NotNull
	private double compraTotalIva10;

	@NotNull
	private double compraTotalIva5;

	private Usuario usuario;

	private List<CompraDetalle> Detalles;
}
