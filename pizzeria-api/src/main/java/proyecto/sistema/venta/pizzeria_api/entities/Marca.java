package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the marcas database table.
 * 
 */
@Entity
@Table(name="marcas")
@NamedQuery(name="Marca.findAll", query="SELECT m FROM Marca m")
public class Marca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mar_id")
	private int marId;

	@Column(name="mar_enabled", columnDefinition = "tinyint(1) default '1'")
	private boolean marEnabled;

	@Column(name="mar_nombre")
	private String marNombre;

	public Marca() {
	}

	public int getMarId() {
		return this.marId;
	}

	public void setMarId(int marId) {
		this.marId = marId;
	}

	public boolean isMarEnabled() {
		return this.marEnabled;
	}

	public void setMarEnabled(boolean marEnabled) {
		this.marEnabled = marEnabled;  
	}

	public String getMarNombre() {                                                                                                            
		return this.marNombre;
	}

	public void setMarNombre(String marNombre) {
		this.marNombre = marNombre;
	}

}