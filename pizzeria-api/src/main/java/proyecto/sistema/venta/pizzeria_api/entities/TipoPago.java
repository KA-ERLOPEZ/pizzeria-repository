package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the tipo_pago database table.
 * 
 */
@Entity
@Table(name="tipo_pago")
@NamedQuery(name="TipoPago.findAll", query="SELECT t FROM TipoPago t")
public class TipoPago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tp_id")
	private int tpId;

	@Column(name="tp_enabled", columnDefinition = "tinyint(1) default '1'")
	private boolean tpEnabled;

	@Column(name="tp_nombre")
	private String tpNombre;

	public TipoPago() {
	}

	public int getTpId() {
		return this.tpId;
	}

	public void setTpId(int tpId) {
		this.tpId = tpId;
	}

	public boolean getTpEnabled() {
		return this.tpEnabled;
	}

	public void setTpEnabled(boolean tpEnabled) {
		this.tpEnabled = tpEnabled;
	}

	public String getTpNombre() {
		return this.tpNombre;
	}

	public void setTpNombre(String tpNombre) {
		this.tpNombre = tpNombre;
	}

}