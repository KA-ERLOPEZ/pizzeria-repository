package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the categorias database table.
 * 
 */
@Entity
@Table(name="categorias")
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cat_id")
	private long catId;

	@Column(name="cat_enabled")
	private boolean catEnabled;

	@Column(name="cat_nombre")
	private String catNombre;

	public Categoria() {
	}

	public long getCatId() {
		return this.catId;
	}

	public void setCatId(long catId) {
		this.catId = catId;
	}

	public boolean isCatEnabled() {
		return this.catEnabled;
	}

	public void setCatEnabled(boolean catEnabled) {
		this.catEnabled = catEnabled;
	}

	public String getCatNombre() {
		return this.catNombre;
	}

	public void setCatNombre(String catNombre) {
		this.catNombre = catNombre;
	}

}