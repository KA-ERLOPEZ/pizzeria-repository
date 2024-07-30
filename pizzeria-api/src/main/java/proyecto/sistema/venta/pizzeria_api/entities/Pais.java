package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the paises database table.
 * 
 */
@Entity
@Table(name="paises")
@NamedQuery(name="Pais.findAll", query="SELECT p FROM Pais p")
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pais_id")
	private long paisId;

	@Column(name="pais_enabled")
	private boolean paisEnabled;

	@Column(name="pais_nombre")
	private String paisNombre;

	//bi-directional many-to-one association to Ciudad
	@OneToMany(mappedBy="pais", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Ciudad> ciudades;

	public Pais() {
	}

	public long getPaisId() {
		return this.paisId;
	}

	public void setPaisId(long paisId) {
		this.paisId = paisId;
	}

	public boolean isPaisEnabled() {
		return this.paisEnabled;
	}

	public void setPaisEnabled(boolean paisEnabled) {
		this.paisEnabled = paisEnabled;
	}

	public String getPaisNombre() {
		return this.paisNombre;
	}

	public void setPaisNombre(String paisNombre) {
		this.paisNombre = paisNombre;
	}

	public List<Ciudad> getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	public Ciudad addCiudade(Ciudad ciudade) {
		getCiudades().add(ciudade);
		ciudade.setPais(this);

		return ciudade;
	}

	public Ciudad removeCiudade(Ciudad ciudade) {
		getCiudades().remove(ciudade);
		ciudade.setPais(null);

		return ciudade;
	}

}