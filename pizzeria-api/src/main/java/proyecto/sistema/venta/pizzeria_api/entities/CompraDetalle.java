package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the compra_detalle database table.
 * 
 */
@Entity
@Table(name="compra_detalle")
@NamedQuery(name="CompraDetalle.findAll", query="SELECT c FROM CompraDetalle c")
public class CompraDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CompraDetallePK id;

	@Column(name="cd_cantidad")
	private double cdCantidad;

	@Column(name="cd_cantidad_recivida")
	private double cdCantidadRecivida;

	@Column(name="cd_precio")
	private double cdPrecio;

	@Column(name="cd_subtotal")
	private double cdSubtotal;

	@Column(name="cd_tasa_iva")
	private double cdTasaIva;

	@Column(name="cd_tipo_iva")
	private String cdTipoIva;

	//bi-directional many-to-one association to Compra
	@ManyToOne
	@JoinColumn(name="compra_id")
	private Compra compra;

	//uni-directional many-to-one association to Stock
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="depo_id", referencedColumnName="depo_id"),
		@JoinColumn(name="prod_id", referencedColumnName="prod_id")
		})
	private Stock stock;

	public CompraDetalle() {
	}

	public CompraDetallePK getId() {
		return this.id;
	}

	public void setId(CompraDetallePK id) {
		this.id = id;
	}

	public double getCdCantidad() {
		return this.cdCantidad;
	}

	public void setCdCantidad(double cdCantidad) {
		this.cdCantidad = cdCantidad;
	}

	public double getCdCantidadRecivida() {
		return this.cdCantidadRecivida;
	}

	public void setCdCantidadRecivida(double cdCantidadRecivida) {
		this.cdCantidadRecivida = cdCantidadRecivida;
	}

	public double getCdPrecio() {
		return this.cdPrecio;
	}

	public void setCdPrecio(double cdPrecio) {
		this.cdPrecio = cdPrecio;
	}

	public double getCdSubtotal() {
		return this.cdSubtotal;
	}

	public void setCdSubtotal(double cdSubtotal) {
		this.cdSubtotal = cdSubtotal;
	}

	public double getCdTasaIva() {
		return this.cdTasaIva;
	}

	public void setCdTasaIva(double cdTasaIva) {
		this.cdTasaIva = cdTasaIva;
	}

	public String getCdTipoIva() {
		return this.cdTipoIva;
	}

	public void setCdTipoIva(String cdTipoIva) {
		this.cdTipoIva = cdTipoIva;
	}

	public Compra getCompra() {
		return this.compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}