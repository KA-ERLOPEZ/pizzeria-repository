package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_transacciones database table.
 * 
 */
@Entity
@Table(name="tipo_transacciones")
@NamedQuery(name="TipoTransaccion.findAll", query="SELECT t FROM TipoTransaccion t")
public class TipoTransaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tran_tipo_id")
	private long tranTipoId;

	@Column(name="tran_tipo_enabled")
	private boolean tranTipoEnabled;

	@Column(name="tran_tipo_nombre")
	private String tranTipoNombre;

	//bi-directional many-to-one association to Transaccion
	@OneToMany(mappedBy="tipoTransaccione", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
	private List<Transaccion> transacciones;

	public TipoTransaccion() {
	}

	public long getTranTipoId() {
		return this.tranTipoId;
	}

	public void setTranTipoId(int tranTipoId) {
		this.tranTipoId = tranTipoId;
	}

	public boolean isTranTipoEnabled() {
		return this.tranTipoEnabled;
	}

	public void setTranTipoEnabled(boolean tranTipoEnabled) {
		this.tranTipoEnabled = tranTipoEnabled;
	}

	public String getTranTipoNombre() {
		return this.tranTipoNombre;
	}

	public void setTranTipoNombre(String tranTipoNombre) {
		this.tranTipoNombre = tranTipoNombre;
	}

	public List<Transaccion> getTransacciones() {
		return this.transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public Transaccion addTransaccione(Transaccion transaccione) {
		getTransacciones().add(transaccione);
		transaccione.setTipoTransaccione(this);

		return transaccione;
	}

	public Transaccion removeTransaccione(Transaccion transaccione) {
		getTransacciones().remove(transaccione);
		transaccione.setTipoTransaccione(null);

		return transaccione;
	}

}