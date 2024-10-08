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
	private int umId;

	@Column(name="um_abreviatura")
	private String umAbreviatura;

	@Column(name="um_enabled", columnDefinition = "tinyint(1) default '1'")
	private boolean umEnabled;

	@Column(name="um_nombre")
	private String umNombre;

	public UnidadMedida() {
	}

	public int getUmId() {
		return this.umId;
	}

	public void setUmId(int umId) {
		this.umId = umId;
	}

	public String getUmAbreviatura() {
		return this.umAbreviatura;
	}

	public void setUmAbreviatura(String umAbreviatura) {
		this.umAbreviatura = umAbreviatura;
	}

	public boolean isUmEnabled() {
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