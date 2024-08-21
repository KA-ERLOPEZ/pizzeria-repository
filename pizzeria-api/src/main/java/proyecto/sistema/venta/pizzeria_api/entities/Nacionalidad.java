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
	private int nacId;

	@Column(name="nac_enabled", nullable=false, columnDefinition = "tinyint(1) default '1'")
	private boolean nacEnabled= true;

	@Column(name="nac_nombre", length = 150, nullable = false)
	private String nacNombre;

	public Nacionalidad() {
	}

	public int getNacId() {
		return this.nacId;
	}

	public void setNacId(int nacId) {
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