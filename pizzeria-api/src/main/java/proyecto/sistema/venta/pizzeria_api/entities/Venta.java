package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the venta_cabecera database table.
 * 
 */
@Entity
@Table(name="venta_cabecera")
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="venta_id")
	private long ventaId;

	@Column(name="total_exentas")
	private double totalExentas;

	@Column(name="venta_estado")
	private String ventaEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="venta_fecha")
	private Date ventaFecha;

	@Column(name="venta_tipo")
	private String ventaTipo;

	@Column(name="venta_total")
	private double ventaTotal;

	@Column(name="venta_total_iva10")
	private double ventaTotalIva10;

	@Column(name="venta_total_iva5")
	private double ventaTotalIva5;

	//uni-directional many-to-one association to CajaAperturaCierre
	@ManyToOne
	@JoinColumn(name="cac_id")
	private CajaAperturaCierre cajaAperturaCierre;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usu_id")
	private Usuario usuario;

	//bi-directional many-to-one association to VentaDetalle
	@OneToMany(mappedBy="venta", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
	private List<VentaDetalle> Detalles;

	public Venta() {
	}

	public long getVentaId() {
		return this.ventaId;
	}

	public void setVentaId(long ventaId) {
		this.ventaId = ventaId;
	}

	public double getTotalExentas() {
		return this.totalExentas;
	}

	public void setTotalExentas(double totalExentas) {
		this.totalExentas = totalExentas;
	}

	public String getVentaEstado() {
		return this.ventaEstado;
	}

	public void setVentaEstado(String ventaEstado) {
		this.ventaEstado = ventaEstado;
	}

	public Date getVentaFecha() {
		return this.ventaFecha;
	}

	public void setVentaFecha(Date ventaFecha) {
		this.ventaFecha = ventaFecha;
	}

	public String getVentaTipo() {
		return this.ventaTipo;
	}

	public void setVentaTipo(String ventaTipo) {
		this.ventaTipo = ventaTipo;
	}

	public double getVentaTotal() {
		return this.ventaTotal;
	}

	public void setVentaTotal(double ventaTotal) {
		this.ventaTotal = ventaTotal;
	}

	public double getVentaTotalIva10() {
		return this.ventaTotalIva10;
	}

	public void setVentaTotalIva10(double ventaTotalIva10) {
		this.ventaTotalIva10 = ventaTotalIva10;
	}

	public double getVentaTotalIva5() {
		return this.ventaTotalIva5;
	}

	public void setVentaTotalIva5(double ventaTotalIva5) {
		this.ventaTotalIva5 = ventaTotalIva5;
	}

	public CajaAperturaCierre getCajaAperturaCierre() {
		return this.cajaAperturaCierre;
	}

	public void setCajaAperturaCierre(CajaAperturaCierre cajaAperturaCierre) {
		this.cajaAperturaCierre = cajaAperturaCierre;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<VentaDetalle> getDetalles() {
		return this.Detalles;
	}

	public void setDetalles(List<VentaDetalle> Detalles) {
		this.Detalles = Detalles;
	}

	public VentaDetalle addDetalle(VentaDetalle Detalle) {
		getDetalles().add(Detalle);
		Detalle.setVenta(this);

		return Detalle;
	}

	public VentaDetalle removeDetalle(VentaDetalle Detalle) {
		getDetalles().remove(Detalle);
		Detalle.setVenta(null);

		return Detalle;
	}

}