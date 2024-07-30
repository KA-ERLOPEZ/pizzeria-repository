package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the nacionalidad database table.
 * 
 */
@Entity
@NamedQuery(name="Nacionalidad.findAll", query="SELECT n FROM Nacionalidad n")
public class Nacionalidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nac_id")
	private long nacId;

	@Column(name="nac_enabled")
	private boolean nacEnabled;

	@Column(name="nac_nombre")
	private String nacNombre;

	public Nacionalidad() {
	}

	public long getNacId() {
		return this.nacId;
	}

	public void setNacId(long nacId) {
		this.nacId = nacId;
	}

	public boolean isNacEnabled() {
		return this.nacEnabled;
	}

	public void setNacEnabled(boolean nacEnabled) {
		this.nacEnabled = nacEnabled;
	}

	public String getNacNombre() {
		return this.nacNombre;
	}

	public void setNacNombre(String nacNombre) {
		this.nacNombre = nacNombre;
	}

}