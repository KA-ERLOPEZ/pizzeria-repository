package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the unidad_medida database table.
 * 
 */
@Entity
@Table(name="unidad_medida")
@NamedQuery(name="UnidadMedida.findAll", query="SELECT u FROM UnidadMedida u")
public class UnidadMedida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="um_id")
	private long umId;

	@Column(name="um_abreviatura")
	private String umAbreviatura;

	@Column(name="um_enabled")
	private boolean umEnabled;

	@Column(name="um_nombre")
	private String umNombre;

	public UnidadMedida() {
	}

	public long getUmId() {
		return this.umId;
	}

	public void setUmId(long umId) {
		this.umId = umId;
	}

	public String getUmAbreviatura() {
		return this.umAbreviatura;
	}

	public void setUmAbreviatura(String umAbreviatura) {
		this.umAbreviatura = umAbreviatura;
	}

	public boolean getUmEnabled() {
		return this.umEnabled;
	}

	public void setUmEnabled(boolean umEnabled) {
		this.umEnabled = umEnabled;
	}

	public String getUmNombre() {
		return this.umNombre;
	}

	public void setUmNombre(String umNombre) {
		this.umNombre = umNombre;
	}

}