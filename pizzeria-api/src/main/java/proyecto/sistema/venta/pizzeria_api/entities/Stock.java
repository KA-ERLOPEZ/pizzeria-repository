package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StockPK id;

	@Column(name="stk_cantidad_actual")
	private double stkCantidadActual;

	@Column(name="stk_cantidad_min")
	private double stkCantidadMin;

	//uni-directional many-to-one association to Deposito
	@ManyToOne
	@JoinColumn(name="depo_id")
	private Deposito deposito;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="prod_id")
	private Producto producto;

	public Stock() {
	}

	public StockPK getId() {
		return this.id;
	}

	public void setId(StockPK id) {
		this.id = id;
	}

	public double getStkCantidadActual() {
		return this.stkCantidadActual;
	}

	public void setStkCantidadActual(double stkCantidadActual) {
		this.stkCantidadActual = stkCantidadActual;
	}

	public double getStkCantidadMin() {
		return this.stkCantidadMin;
	}

	public void setStkCantidadMin(double stkCantidadMin) {
		this.stkCantidadMin = stkCantidadMin;
	}

	public Deposito getDeposito() {
		return this.deposito;
	}

	public void setDeposito(Deposito deposito) {
		this.deposito = deposito;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}