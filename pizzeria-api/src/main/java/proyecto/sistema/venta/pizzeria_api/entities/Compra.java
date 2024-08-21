package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the compra_cabecera database table.
 * 
 */
@Entity
@Table(name="compra_cabecera")
@NamedQuery(name="Compra.findAll", query="SELECT c FROM Compra c")
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="compra_id")
	private int compraId;

	@Column(name="compra_estado")
	private String compraEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="compra_fec_compra")
	private Date compraFecCompra;

	@Column(name="compra_nro_fac")
	private String compraNroFac;

	@Column(name="compra_nro_timbrado")
	private String compraNroTimbrado;

	@Temporal(TemporalType.DATE)
	@Column(name="compra_timbrado_venci")
	private Date compraTimbradoVenci;

	@Column(name="compra_tipo")
	private String compraTipo;

	@Column(name="compra_total")
	private double compraTotal;

	@Column(name="compra_total_exentas")
	private double compraTotalExentas;

	@Column(name="compra_total_iva10")
	private double compraTotalIva10;

	@Column(name="compra_total_iva5")
	private double compraTotalIva5;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usu_id")
	private Usuario usuario;

	//bi-directional many-to-one association to CompraDetalle
	@OneToMany(mappedBy="compra")
	private List<CompraDetalle> Detalles;

	public Compra() {
	}

	public int getCompraId() {
		return this.compraId;
	}

	public void setCompraId(int compraId) {
		this.compraId = compraId;
	}

	public String getCompraEstado() {
		return this.compraEstado;
	}

	public void setCompraEstado(String compraEstado) {
		this.compraEstado = compraEstado;
	}

	public Date getCompraFecCompra() {
		return this.compraFecCompra;
	}

	public void setCompraFecCompra(Date compraFecCompra) {
		this.compraFecCompra = compraFecCompra;
	}

	public String getCompraNroFac() {
		return this.compraNroFac;
	}

	public void setCompraNroFac(String compraNroFac) {
		this.compraNroFac = compraNroFac;
	}

	public String getCompraNroTimbrado() {
		return this.compraNroTimbrado;
	}

	public void setCompraNroTimbrado(String compraNroTimbrado) {
		this.compraNroTimbrado = compraNroTimbrado;
	}

	public Date getCompraTimbradoVenci() {
		return this.compraTimbradoVenci;
	}

	public void setCompraTimbradoVenci(Date compraTimbradoVenci) {
		this.compraTimbradoVenci = compraTimbradoVenci;
	}

	public String getCompraTipo() {
		return this.compraTipo;
	}

	public void setCompraTipo(String compraTipo) {
		this.compraTipo = compraTipo;
	}

	public double getCompraTotal() {
		return this.compraTotal;
	}

	public void setCompraTotal(double compraTotal) {
		this.compraTotal = compraTotal;
	}

	public double getCompraTotalExentas() {
		return this.compraTotalExentas;
	}

	public void setCompraTotalExentas(double compraTotalExentas) {
		this.compraTotalExentas = compraTotalExentas;
	}

	public double getCompraTotalIva10() {
		return this.compraTotalIva10;
	}

	public void setCompraTotalIva10(double compraTotalIva10) {
		this.compraTotalIva10 = compraTotalIva10;
	}

	public double getCompraTotalIva5() {
		return this.compraTotalIva5;
	}

	public void setCompraTotalIva5(double compraTotalIva5) {
		this.compraTotalIva5 = compraTotalIva5;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<CompraDetalle> getDetalles() {
		return this.Detalles;
	}

	public void setDetalles(List<CompraDetalle> Detalles) {
		this.Detalles = Detalles;
	}

	public CompraDetalle addDetalle(CompraDetalle Detalle) {
		getDetalles().add(Detalle);
		Detalle.setCompra(this);

		return Detalle;
	}

	public CompraDetalle removeDetalle(CompraDetalle Detalle) {
		getDetalles().remove(Detalle);
		Detalle.setCompra(null);

		return Detalle;
	}

}