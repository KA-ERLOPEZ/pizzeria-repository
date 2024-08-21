package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * The persistent class for the ciudades database table.
 * 
 */
@Entity
@Table(name="ciudades")
@JsonIgnoreProperties("barrios")
@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c")
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ciu_id")
	private int ciuId;

	@Column(name="ciu_enabled", columnDefinition = "tinyint(1) default '1'")
	private boolean ciuEnabled = true;

	@Column(name="ciu_nombre", nullable = false)
	private String ciuNombre;

	//bi-directional many-to-one association to Barrio
	@OneToMany(mappedBy="ciudad", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JsonManagedReference
	private List<Barrio> barrios;

	//bi-directional many-to-one association to Pais
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="pais_id")
	@JsonBackReference
	private Pais pais;

	public Ciudad() {
	}

	public int getCiuId() {
		return this.ciuId;
	}

	public void setCiuId(int ciuId) {
		this.ciuId = ciuId;
	}

	public boolean isCiuEnabled() {
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
		barrio.setCiudad(this);

		return barrio;
	}

	public Barrio removeBarrio(Barrio barrio) {
		getBarrios().remove(barrio);
		barrio.setCiudad(null);

		return barrio;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}