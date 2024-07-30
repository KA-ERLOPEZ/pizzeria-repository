package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the recetas database table.
 * 
 */
@Entity
@Table(name="recetas")
@NamedQuery(name="Receta.findAll", query="SELECT r FROM Receta r")
public class Receta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RecetaPK id;

	@Column(name="receta_cantidad")
	private double recetaCantidad;

	//bi-directional many-to-one association to Platillo
	@ManyToOne
	@JoinColumn(name="platillo_id")
	private Platillo platillo;

	//uni-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="prod_id")
	private Producto producto;

	//uni-directional many-to-one association to UnidadMedida
	@ManyToOne
	@JoinColumn(name="um_id")
	private UnidadMedida unidadMedida;

	public Receta() {
	}

	public RecetaPK getId() {
		return this.id;
	}

	public void setId(RecetaPK id) {
		this.id = id;
	}

	public double getRecetaCantidad() {
		return this.recetaCantidad;
	}

	public void setRecetaCantidad(double recetaCantidad) {
		this.recetaCantidad = recetaCantidad;
	}

	public Platillo getPlatillo() {
		return this.platillo;
	}

	public void setPlatillo(Platillo platillo) {
		this.platillo = platillo;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public UnidadMedida getUnidadMedida() {
		return this.unidadMedida;
	}

	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

}