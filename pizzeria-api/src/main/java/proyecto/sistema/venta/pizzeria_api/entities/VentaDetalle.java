package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the venta_detalle database table.
 * 
 */
@Entity
@Table(name="venta_detalle")
@NamedQuery(name="VentaDetalle.findAll", query="SELECT v FROM VentaDetalle v")
public class VentaDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VentaDetallePK id;

	@Column(name="vd_cantidad")
	private double vdCantidad;

	@Column(name="vd_iva_monto")
	private double vdIvaMonto;

	@Column(name="vd_precio")
	private double vdPrecio;

	@Column(name="vd_subtotal")
	private double vdSubtotal;

	@Column(name="vd_tipo_iva")
	private String vdTipoIva;

	//uni-directional many-to-one association to Stock
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="depo_id", referencedColumnName="depo_id"),
		@JoinColumn(name="prod_id", referencedColumnName="prod_id")
		})
	private Stock stock;

	//bi-directional many-to-one association to Venta
	@ManyToOne
	@JoinColumn(name="venta_id")
	private Venta venta;

	public VentaDetalle() {
	}

	public VentaDetallePK getId() {
		return this.id;
	}

	public void setId(VentaDetallePK id) {
		this.id = id;
	}

	public double getVdCantidad() {
		return this.vdCantidad;
	}

	public void setVdCantidad(double vdCantidad) {
		this.vdCantidad = vdCantidad;
	}

	public double getVdIvaMonto() {
		return this.vdIvaMonto;
	}

	public void setVdIvaMonto(double vdIvaMonto) {
		this.vdIvaMonto = vdIvaMonto;
	}

	public double getVdPrecio() {
		return this.vdPrecio;
	}

	public void setVdPrecio(double vdPrecio) {
		this.vdPrecio = vdPrecio;
	}

	public double getVdSubtotal() {
		return this.vdSubtotal;
	}

	public void setVdSubtotal(double vdSubtotal) {
		this.vdSubtotal = vdSubtotal;
	}

	public String getVdTipoIva() {
		return this.vdTipoIva;
	}

	public void setVdTipoIva(String vdTipoIva) {
		this.vdTipoIva = vdTipoIva;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Venta getVenta() {
		return this.venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}