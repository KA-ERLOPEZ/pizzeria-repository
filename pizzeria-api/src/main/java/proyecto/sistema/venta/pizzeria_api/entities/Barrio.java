package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
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
	private long barId;

	@Column(name="bar_enabled")
	private boolean barEnabled;

	@Column(name="bar_nombre")
	private String barNombre;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="ciu_id")
	private Ciudad ciudade;

	public Barrio() {
	}

	public long getBarId() {
		return this.barId;
	}

	public void setBarId(long barId) {
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

	public Ciudad getCiudade() {
		return this.ciudade;
	}

	public void setCiudade(Ciudad ciudade) {
		this.ciudade = ciudade;
	}

}