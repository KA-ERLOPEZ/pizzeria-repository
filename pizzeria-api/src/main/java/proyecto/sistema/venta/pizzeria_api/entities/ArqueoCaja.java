package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the arqueo_caja database table.
 * 
 */
@Entity
@Table(name="arqueo_caja")
@NamedQuery(name="ArqueoCaja.findAll", query="SELECT a FROM ArqueoCaja a")
public class ArqueoCaja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="arqueo_id")
	private long arqueoId;

	@Temporal(TemporalType.DATE)
	@Column(name="arqueo_fecha")
	private Date arqueoFecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="arqueo_hora")
	private Date arqueoHora;

	@Column(name="arqueo_saldo")
	private double arqueoSaldo;

	@Column(name="arqueo_saldo_caja")
	private double arqueoSaldoCaja;

	@Column(name="arqueo_saldo_faltante")
	private double arqueoSaldoFaltante;

	@Column(name="arqueo_saldo_sobrante")
	private double arqueoSaldoSobrante;

	//uni-directional many-to-one association to CajaAperturaCierre
	@ManyToOne
	@JoinColumn(name="cac_id")
	private CajaAperturaCierre cajaAperturaCierre;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usu_id")
	private Usuario usuario;

	//bi-directional many-to-one association to DetalleArqueo
	@OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy="arqueoCaja")
	private List<DetalleArqueo> detalleArqueos;

	public ArqueoCaja() {
	}

	public long getArqueoId() {
		return this.arqueoId;
	}

	public void setArqueoId(long arqueoId) {
		this.arqueoId = arqueoId;
	}

	public Date getArqueoFecha() {
		return this.arqueoFecha;
	}

	public void setArqueoFecha(Date arqueoFecha) {
		this.arqueoFecha = arqueoFecha;
	}

	public Date getArqueoHora() {
		return this.arqueoHora;
	}

	public void setArqueoHora(Date arqueoHora) {
		this.arqueoHora = arqueoHora;
	}

	public double getArqueoSaldo() {
		return this.arqueoSaldo;
	}

	public void setArqueoSaldo(double arqueoSaldo) {
		this.arqueoSaldo = arqueoSaldo;
	}

	public double getArqueoSaldoCaja() {
		return this.arqueoSaldoCaja;
	}

	public void setArqueoSaldoCaja(double arqueoSaldoCaja) {
		this.arqueoSaldoCaja = arqueoSaldoCaja;
	}

	public double getArqueoSaldoFaltante() {
		return this.arqueoSaldoFaltante;
	}

	public void setArqueoSaldoFaltante(double arqueoSaldoFaltante) {
		this.arqueoSaldoFaltante = arqueoSaldoFaltante;
	}

	public double getArqueoSaldoSobrante() {
		return this.arqueoSaldoSobrante;
	}

	public void setArqueoSaldoSobrante(double arqueoSaldoSobrante) {
		this.arqueoSaldoSobrante = arqueoSaldoSobrante;
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

	public List<DetalleArqueo> getDetalleArqueos() {
		return this.detalleArqueos;
	}

	public void setDetalleArqueos(List<DetalleArqueo> detalleArqueos) {
		this.detalleArqueos = detalleArqueos;
	}

	public DetalleArqueo addDetalleArqueo(DetalleArqueo detalleArqueo) {
		getDetalleArqueos().add(detalleArqueo);
		detalleArqueo.setArqueoCaja(this);

		return detalleArqueo;
	}

	public DetalleArqueo removeDetalleArqueo(DetalleArqueo detalleArqueo) {
		getDetalleArqueos().remove(detalleArqueo);
		detalleArqueo.setArqueoCaja(null);

		return detalleArqueo;
	}

}