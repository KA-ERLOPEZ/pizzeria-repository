package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the caja_apertura_cierre database table.
 * 
 */
@Entity
@Table(name="caja_apertura_cierre")
@NamedQuery(name="CajaAperturaCierre.findAll", query="SELECT c FROM CajaAperturaCierre c")
public class CajaAperturaCierre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cac_id")
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="cac_fecha_apertura")
	private Date cacFechaApertura;

	@Temporal(TemporalType.DATE)
	@Column(name="cac_fecha_cierre")
	private Date cacFechaCierre;

	//bi-directional many-to-one association to Caja
	@ManyToOne
	@JoinColumn(name="caja_id")
	private Caja caja;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usu_id")
	private Usuario usuario;

	//bi-directional many-to-one association to Transaccion
	@OneToMany(fetch=FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE},  mappedBy="cajaAperturaCierre")
	private List<Transaccion> transacciones;

	public CajaAperturaCierre() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCacFechaApertura() {
		return this.cacFechaApertura;
	}

	public void setCacFechaApertura(Date cacFechaApertura) {
		this.cacFechaApertura = cacFechaApertura;
	}

	public Date getCacFechaCierre() {
		return this.cacFechaCierre;
	}

	public void setCacFechaCierre(Date cacFechaCierre) {
		this.cacFechaCierre = cacFechaCierre;
	}

	public Caja getCaja() {
		return this.caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Transaccion> getTransacciones() {
		return this.transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public Transaccion addTransaccione(Transaccion transaccione) {
		getTransacciones().add(transaccione);
		transaccione.setCajaAperturaCierre(this);

		return transaccione;
	}

	public Transaccion removeTransaccione(Transaccion transaccione) {
		getTransacciones().remove(transaccione);
		transaccione.setCajaAperturaCierre(null);

		return transaccione;
	}

}