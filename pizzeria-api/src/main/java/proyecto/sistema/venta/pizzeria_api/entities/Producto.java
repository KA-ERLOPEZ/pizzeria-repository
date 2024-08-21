package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prod_id")
	private int prodId;

	@Column(name="prod_codigo")
	private String prodCodigo;

	@Column(name="prod_descripcion")
	private String prodDescripcion;

	@Column(name="prod_enabled", columnDefinition = "tinyint(1) default '1'")
	private boolean prodEnabled;

	@Column(name="prod_nombre")
	private String prodNombre;

	@Column(name="prod_precio_compra")
	private double prodPrecioCompra;

	@Column(name="prod_precio_venta")
	private double prodPrecioVenta;

	@Column(name="tipo_producto")
	private String tipoProducto;
	
	@Column(name="tipo_imgUrl")
	private String imgUrl;

	//uni-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="cat_id")
	private Categoria categoria;

	//uni-directional many-to-one association to Marca
	@ManyToOne
	@JoinColumn(name="mar_id")
	private Marca marca;

	//uni-directional many-to-one association to Proveedore
	@ManyToOne
	@JoinColumn(name="prov_id")
	private Proveedor proveedor;

	//uni-directional many-to-one association to Sabor
	@ManyToOne
	@JoinColumn(name="sab_id")
	private Sabor sabor;

	//uni-directional many-to-one association to Tamano
	@ManyToOne
	@JoinColumn(name="tam_id")
	private Tamano tamano;

	//bi-directional many-to-one association to Stock
	@OneToMany(mappedBy="producto", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.PERSIST}, orphanRemoval = true)
	private List<Stock> stocks;

	public Producto() {
	}

	public int getProdId() {
		return this.prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdCodigo() {
		return this.prodCodigo;
	}

	public void setProdCodigo(String prodCodigo) {
		this.prodCodigo = prodCodigo;
	}

	public String getProdDescripcion() {
		return this.prodDescripcion;
	}

	public void setProdDescripcion(String prodDescripcion) {
		this.prodDescripcion = prodDescripcion;
	}

	public boolean isProdEnabled() {
		return this.prodEnabled;
	}

	public void setProdEnabled(boolean prodEnabled) {
		this.prodEnabled = prodEnabled;
	}

	public String getProdNombre() {
		return this.prodNombre;
	}

	public void setProdNombre(String prodNombre) {
		this.prodNombre = prodNombre;
	}

	public double getProdPrecioCompra() {
		return this.prodPrecioCompra;
	}

	public void setProdPrecioCompra(double prodPrecioCompra) {
		this.prodPrecioCompra = prodPrecioCompra;
	}

	public double getProdPrecioVenta() {
		return this.prodPrecioVenta;
	}

	public void setProdPrecioVenta(double prodPrecioVenta) {
		this.prodPrecioVenta = prodPrecioVenta;
	}

	public String getTipoProducto() {
		return this.tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Proveedor getProveedore() {
		return this.proveedor;
	}

	public void setProveedore(Proveedor proveedore) {
		this.proveedor = proveedore;
	}

	public Sabor getSabor() {
		return this.sabor;
	}

	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

	public Tamano getTamano() {
		return this.tamano;
	}

	public void setTamano(Tamano tamano) {
		this.tamano = tamano;
	}

	public List<Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Stock addStock(Stock stock) {
		getStocks().add(stock);
		stock.setProducto(this);

		return stock;
	}

	public Stock removeStock(Stock stock) {
		getStocks().remove(stock);
		stock.setProducto(null);

		return stock;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	

}