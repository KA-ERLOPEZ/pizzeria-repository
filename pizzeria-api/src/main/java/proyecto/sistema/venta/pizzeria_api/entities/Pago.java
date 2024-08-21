package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.*;


/**
 * The persistent class for the pagos database table.
 * 
 */
@Entity
@Table(name="pagos")
@NamedQuery(name="Pago.findAll", query="SELECT p FROM Pago p")
public class Pago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pag_id")
	private int pagId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pag_fecha")
	private Timestamp pagFecha;

	@Column(name="pag_monto")
	private double pagMonto;

	@Column(name="pag_enabled", columnDefinition = "tinyint(1) default '1'")
	private boolean enabled;
	
	//uni-directional many-to-one association to TipoPago
	@ManyToOne
	@JoinColumn(name="tp_id")
	private TipoPago tipoPago;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usu_id")
	private Usuario usuario;
	

	//uni-directional many-to-one association to Venta
	@ManyToOne
	@JoinColumn(name="venta_id")
	private Venta venta;

	public Pago() {
	}

	public int getPagId() {
		return this.pagId;
	}

	public void setPagId(int pagId) {
		this.pagId = pagId;
	}

	public Timestamp getPagFecha() {
		return this.pagFecha;
	}

	public void setPagFecha(Timestamp pagFecha) {
		this.pagFecha = pagFecha;
	}

	public double getPagMonto() {
		return this.pagMonto;
	}

	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setPagMonto(double pagMonto) {
		this.pagMonto = pagMonto;
	}

	public TipoPago getTipoPago() {
		return this.tipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Venta getVenta() {
		return this.venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}