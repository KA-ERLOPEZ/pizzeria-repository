package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the op_detalle database table.
 * 
 */
@Entity
@Table(name="op_detalle")
@NamedQuery(name="OpDetalle.findAll", query="SELECT o FROM OpDetalle o")
public class OpDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OpDetallePK id;

	@Column(name="opd_cantidad")
	private double opdCantidad;

	//bi-directional many-to-one association to OrdenProduccion
	@ManyToOne
	@JoinColumn(name="op_id")
	private OrdenProduccion ordenProduccion;

	//uni-directional many-to-one association to Stock
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="depo_id", referencedColumnName="depo_id"),
		@JoinColumn(name="prod_id", referencedColumnName="prod_id")
		})
	private Stock stock;

	//uni-directional many-to-one association to UnidadMedida
	@ManyToOne
	@JoinColumn(name="um_id")
	private UnidadMedida unidadMedida;

	public OpDetalle() {
	}

	public OpDetallePK getId() {
		return this.id;
	}

	public void setId(OpDetallePK id) {
		this.id = id;
	}

	public double getOpdCantidad() {
		return this.opdCantidad;
	}

	public void setOpdCantidad(double opdCantidad) {
		this.opdCantidad = opdCantidad;
	}

	public OrdenProduccion getOrdenProduccion() {
		return this.ordenProduccion;
	}

	public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
		this.ordenProduccion = ordenProduccion;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public UnidadMedida getUnidadMedida() {
		return this.unidadMedida;
	}

	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

}