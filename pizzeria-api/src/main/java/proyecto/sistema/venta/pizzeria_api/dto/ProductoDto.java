package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Categoria;
import proyecto.sistema.venta.pizzeria_api.entities.Marca;
import proyecto.sistema.venta.pizzeria_api.entities.Proveedor;
import proyecto.sistema.venta.pizzeria_api.entities.Sabor;
import proyecto.sistema.venta.pizzeria_api.entities.Stock;
import proyecto.sistema.venta.pizzeria_api.entities.Tamano;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ProductoDto {
	
	private int prodId;
	
	@NotNull
	private String prodCodigo;

	@NotNull
	private String prodDescripcion;

	private boolean prodEnabled = true;

	@NotNull
	private String prodNombre;

	@NotNull
	private double prodPrecioCompra;

	@NotNull
	private double prodPrecioVenta;

	@NotNull
	private String tipoProducto;

	private Categoria categoria;

	private Marca marca;

	private Proveedor proveedor;

	private Sabor sabor;

	private Tamano tamano;
	
	private String imgUrl;

	private List<Stock> stocks;

}
