package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the timbrado database table.
 * 
 */
@Entity
@NamedQuery(name="Timbrado.findAll", query="SELECT t FROM Timbrado t")
public class Timbrado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="timbrado_id")
	private long timbradoId;

	@Column(name="timbrado_enabled")
	private boolean timbradoEnabled;

	@Temporal(TemporalType.DATE)
	@Column(name="timbrado_fecha_fin")
	private Date timbradoFechaFin;

	@Column(name="timbrado_nro")
	private String timbradoNro;

	@Temporal(TemporalType.DATE)
	@Column(name="timbrdo_fecha_inic")
	private Date timbrdoFechaInic;

	public Timbrado() {
	}

	public long getTimbradoId() {
		return this.timbradoId;
	}

	public void setTimbradoId(long timbradoId) {
		this.timbradoId = timbradoId;
	}

	public boolean isTimbradoEnabled() {
		return this.timbradoEnabled;
	}

	public void setTimbradoEnabled(boolean timbradoEnabled) {
		this.timbradoEnabled = timbradoEnabled;
	}

	public Date getTimbradoFechaFin() {
		return this.timbradoFechaFin;
	}

	public void setTimbradoFechaFin(Date timbradoFechaFin) {
		this.timbradoFechaFin = timbradoFechaFin;
	}

	public String getTimbradoNro() {
		return this.timbradoNro;
	}

	public void setTimbradoNro(String timbradoNro) {
		this.timbradoNro = timbradoNro;
	}

	public Date getTimbrdoFechaInic() {
		return this.timbrdoFechaInic;
	}

	public void setTimbrdoFechaInic(Date timbrdoFechaInic) {
		this.timbrdoFechaInic = timbrdoFechaInic;
	}

}