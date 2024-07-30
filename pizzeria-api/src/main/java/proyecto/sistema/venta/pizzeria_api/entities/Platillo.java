package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the platillos database table.
 * 
 */
@Entity
@Table(name="platillos")
@NamedQuery(name="Platillo.findAll", query="SELECT p FROM Platillo p")
public class Platillo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="platillo_id")
	private long platilloId;

	@Column(name="platillo_descripcion")
	private String platilloDescripcion;

	@Column(name="platillo_detalle")
	private String platilloDetalle;

	@Column(name="platillo_nombre")
	private String platilloNombre;
	
	@Column(name="platillo_enabled")
	private boolean enable;

	//bi-directional many-to-one association to Receta
	@OneToMany(mappedBy="platillo", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
	private List<Receta> recetas;
	

	public Platillo() {
	}

	public long getPlatilloId() {
		return this.platilloId;
	}

	public void setPlatilloId(long platilloId) {
		this.platilloId = platilloId;
	}

	public String getPlatilloDescripcion() {
		return this.platilloDescripcion;
	}

	public void setPlatilloDescripcion(String platilloDescripcion) {
		this.platilloDescripcion = platilloDescripcion;
	}

	public String getPlatilloDetalle() {
		return this.platilloDetalle;
	}

	public void setPlatilloDetalle(String platilloDetalle) {
		this.platilloDetalle = platilloDetalle;
	}
	

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getPlatilloNombre() {
		return this.platilloNombre;
	}

	public void setPlatilloNombre(String platilloNombre) {
		this.platilloNombre = platilloNombre;
	}

	public List<Receta> getRecetas() {
		return this.recetas;
	}

	public void setRecetas(List<Receta> recetas) {
		this.recetas = recetas;
	}

	public Receta addReceta(Receta receta) {
		getRecetas().add(receta);
		receta.setPlatillo(this);

		return receta;
	}

	public Receta removeReceta(Receta receta) {
		getRecetas().remove(receta);
		receta.setPlatillo(null);

		return receta;
	}

}