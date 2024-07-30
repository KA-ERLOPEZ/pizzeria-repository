package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

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
	
	private long prodId;

	private String prodCodigo;

	private String prodDescripcion;

	private boolean prodEnabled;

	private String prodNombre;

	private double prodPrecioCompra;

	private double prodPrecioVenta;

	private String tipoProducto;

	private Categoria categoria;

	private Marca marca;

	private Proveedor proveedor;

	private Sabor sabor;

	private Tamano tamano;
	
	private String imgUrl;

	private List<Stock> stocks;

}
