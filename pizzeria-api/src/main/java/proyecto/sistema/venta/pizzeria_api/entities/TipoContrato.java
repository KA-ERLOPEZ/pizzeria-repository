package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the tipo_contrato database table.
 * 
 */
@Entity
@Table(name="tipo_contrato")
@NamedQuery(name="TipoContrato.findAll", query="SELECT t FROM TipoContrato t")
public class TipoContrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tc_id")
	private int tcId;

	@Column(name="tc_enabled", columnDefinition = "tinyint(1) default '1'")
	private boolean tcEnabled;

	@Column(name="tc_ley_nro")
	private String tcLeyNro;

	@Column(name="tc_nombre")
	private String tcNombre;

	public TipoContrato() {
	}

	public int getTcId() {
		return this.tcId;
	}

	public void setTcId(int tcId) {
		this.tcId = tcId;
	}

	public boolean isTcEnabled() {
		return this.tcEnabled;
	}

	public void setTcEnabled(boolean tcEnabled) {
		this.tcEnabled = tcEnabled;
	}

	public String getTcLeyNro() {
		return this.tcLeyNro;
	}

	public void setTcLeyNro(String tcLeyNro) {
		this.tcLeyNro = tcLeyNro;
	}

	public String getTcNombre() {
		return this.tcNombre;
	}

	public void setTcNombre(String tcNombre) {
		this.tcNombre = tcNombre;
	}

}