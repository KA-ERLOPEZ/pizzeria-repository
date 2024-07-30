package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the detalle_arqueo database table.
 * 
 */
@Entity
@Table(name="detalle_arqueo")
@NamedQuery(name="DetalleArqueo.findAll", query="SELECT d FROM DetalleArqueo d")
public class DetalleArqueo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DetalleArqueoPK id;

	@Column(name="da_cantidad")
	private int daCantidad;

	//bi-directional many-to-one association to ArqueoCaja
	@ManyToOne
	@JoinColumn(name="arqueo_id")
	private ArqueoCaja arqueoCaja;

	//uni-directional many-to-one association to Denominacion
	@ManyToOne
	@JoinColumn(name="deno_id")
	private Denominacion denominacion;

	public DetalleArqueo() {
	}

	public DetalleArqueoPK getId() {
		return this.id;
	}

	public void setId(DetalleArqueoPK id) {
		this.id = id;
	}

	public int getDaCantidad() {
		return this.daCantidad;
	}

	public void setDaCantidad(int daCantidad) {
		this.daCantidad = daCantidad;
	}

	public ArqueoCaja getArqueoCaja() {
		return this.arqueoCaja;
	}

	public void setArqueoCaja(ArqueoCaja arqueoCaja) {
		this.arqueoCaja = arqueoCaja;
	}

	public Denominacion getDenominacion() {
		return this.denominacion;
	}

	public void setDenominacion(Denominacion denominacion) {
		this.denominacion = denominacion;
	}

}