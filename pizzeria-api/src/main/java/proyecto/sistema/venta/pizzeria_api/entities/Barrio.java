package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;


/**
 * The persistent class for the barrios database table.
 * 
 */
@Entity
@Table(name="barrios")
@NamedQuery(name="Barrio.findAll", query="SELECT b FROM Barrio b")
public class Barrio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bar_id")
	private int barId;

	@Column(name="bar_enabled", columnDefinition = "tinyint(1) default '1'")
	private boolean barEnabled;

	@Column(name="bar_nombre")
	private String barNombre;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name="ciu_id")
	@JsonBackReference
	private Ciudad ciudad;

	public Barrio() {
	}

	public int getBarId() {
		return this.barId;
	}

	public void setBarId(int barId) {
		this.barId = barId;
	}

	public boolean isBarEnabled() {
		return this.barEnabled;
	}

	public void setBarEnabled(boolean barEnabled) {
		this.barEnabled = barEnabled;
	}

	public String getBarNombre() {
		return this.barNombre;
	}

	public void setBarNombre(String barNombre) {
		this.barNombre = barNombre;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudade) {
		this.ciudad = ciudade;
	}

}