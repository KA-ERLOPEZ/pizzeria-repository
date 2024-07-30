package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the ciudades database table.
 * 
 */
@Entity
@Table(name="ciudades")
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ciu_id")
	private long ciuId;

	@Column(name="ciu_enabled")
	private boolean ciuEnabled;

	@Column(name="ciu_nombre")
	private String ciuNombre;

	//bi-directional many-to-one association to Barrio
	@OneToMany(mappedBy="ciudade")
	private List<Barrio> barrios;

	//bi-directional many-to-one association to Pais
	@ManyToOne
	@JoinColumn(name="pais_id")
	private Pais pais;

	public Ciudad() {
	}

	public long getCiuId() {
		return this.ciuId;
	}

	public void setCiuId(long ciuId) {
		this.ciuId = ciuId;
	}

	public boolean setCiuEnabled() {
		return this.ciuEnabled;
	}

	public void setCiuEnabled(boolean ciuEnabled) {
		this.ciuEnabled = ciuEnabled;
	}

	public String getCiuNombre() {
		return this.ciuNombre;
	}

	public void setCiuNombre(String ciuNombre) {
		this.ciuNombre = ciuNombre;
	}

	public List<Barrio> getBarrios() {
		return this.barrios;
	}

	public void setBarrios(List<Barrio> barrios) {
		this.barrios = barrios;
	}

	public Barrio addBarrio(Barrio barrio) {
		getBarrios().add(barrio);
		barrio.setCiudade(this);

		return barrio;
	}

	public Barrio removeBarrio(Barrio barrio) {
		getBarrios().remove(barrio);
		barrio.setCiudade(null);

		return barrio;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}