package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the sabores database table.
 * 
 */
@Entity
@Table(name="sabores")
@NamedQuery(name="Sabor.findAll", query="SELECT s FROM Sabor s")
public class Sabor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sab_id")
	private int sabId;

	@Column(name="sab_enabled", columnDefinition = "tinyint(1) default '1'")
	private boolean sabEnabled;

	@Column(name="sab_nombre")
	private String sabNombre;

	public Sabor() {
	}

	public int getSabId() {
		return this.sabId;
	}

	public void setSabId(int sabId) {
		this.sabId = sabId;
	}

	public boolean getSabEnabled() {
		return this.sabEnabled;
	}

	public void isSabEnabled(boolean sabEnabled) {
		this.sabEnabled = sabEnabled;
	}

	public String getSabNombre() {
		return this.sabNombre;
	}

	public void setSabNombre(String sabNombre) {
		this.sabNombre = sabNombre;
	}

}