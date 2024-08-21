package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the tamano database table.
 * 
 */
@Entity
@NamedQuery(name="Tamano.findAll", query="SELECT t FROM Tamano t")
public class Tamano implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tam_id")
	private int tamId;

	@Column(name="tam_descripcion")
	private String tamDescripcion;

	@Column(name="tam_enabled",columnDefinition = "tinyint(1) default '1'")
	private boolean tamEnabled;

	public Tamano() {
	}

	public int getTamId() {
		return this.tamId;
	}

	public void setTamId(int tamId) {
		this.tamId = tamId;
	}

	public String getTamDescripcion() {
		return this.tamDescripcion;
	}

	public void setTamDescripcion(String tamDescripcion) {
		this.tamDescripcion = tamDescripcion;
	}

	public boolean isTamEnabled() {
		return this.tamEnabled;
	}

	public void setTamEnabled(boolean tamEnabled) {
		this.tamEnabled = tamEnabled;
	}

}