package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the transacciones database table.
 * 
 */
@Entity
@Table(name="transacciones")
@NamedQuery(name="Transaccion.findAll", query="SELECT t FROM Transaccion t")
public class Transaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransaccionPK id;

	@Column(name="tran_descripcion")
	private String tranDescripcion;

	@Column(name="tran_enabled")
	private byte tranEnabled;

	@Column(name="tran_monto")
	private double tranMonto;

	//bi-directional many-to-one association to CajaAperturaCierre
	@ManyToOne
	@JoinColumn(name="cac_id")
	private CajaAperturaCierre cajaAperturaCierre;

	//bi-directional many-to-one association to TipoTransaccion
	@ManyToOne
	@JoinColumn(name="tran_tipo_id")
	private TipoTransaccion tipoTransaccione;

	public Transaccion() {
	}

	public TransaccionPK getId() {
		return this.id;
	}

	public void setId(TransaccionPK id) {
		this.id = id;
	}

	public String getTranDescripcion() {
		return this.tranDescripcion;
	}

	public void setTranDescripcion(String tranDescripcion) {
		this.tranDescripcion = tranDescripcion;
	}

	public byte getTranEnabled() {
		return this.tranEnabled;
	}

	public void setTranEnabled(byte tranEnabled) {
		this.tranEnabled = tranEnabled;
	}

	public double getTranMonto() {
		return this.tranMonto;
	}

	public void setTranMonto(double tranMonto) {
		this.tranMonto = tranMonto;
	}

	public CajaAperturaCierre getCajaAperturaCierre() {
		return this.cajaAperturaCierre;
	}

	public void setCajaAperturaCierre(CajaAperturaCierre cajaAperturaCierre) {
		this.cajaAperturaCierre = cajaAperturaCierre;
	}

	public TipoTransaccion getTipoTransaccione() {
		return this.tipoTransaccione;
	}

	public void setTipoTransaccione(TipoTransaccion tipoTransaccione) {
		this.tipoTransaccione = tipoTransaccione;
	}

}