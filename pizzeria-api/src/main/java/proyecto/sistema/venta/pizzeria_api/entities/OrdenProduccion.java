package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the orden_produccion database table.
 * 
 */
@Entity
@Table(name="orden_produccion")
@NamedQuery(name="OrdenProduccion.findAll", query="SELECT o FROM OrdenProduccion o")
public class OrdenProduccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="op_id")
	private int opId;

	@Column(name="op_cantidad")
	private double opCantidad;

	@Column(name="op_estado")
	private String opEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="op_fech_entrega")
	private Date opFechEntrega;

	@Temporal(TemporalType.DATE)
	@Column(name="op_fecha")
	private Date opFecha;

	//bi-directional many-to-one association to OpDetalle
	@OneToMany(mappedBy="ordenProduccion")
	private List<OpDetalle> Detalles;

	//uni-directional many-to-one association to Platillo
	@ManyToOne
	@JoinColumn(name="platillo_id")
	private Platillo platillo;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="usu_id")
	private Usuario usuario;

	public OrdenProduccion() {
	}

	public int getOpId() {
		return this.opId;
	}

	public void setOpId(int opId) {
		this.opId = opId;
	}

	public double getOpCantidad() {
		return this.opCantidad;
	}

	public void setOpCantidad(double opCantidad) {
		this.opCantidad = opCantidad;
	}

	public String getOpEstado() {
		return this.opEstado;
	}

	public void setOpEstado(String opEstado) {
		this.opEstado = opEstado;
	}

	public Date getOpFechEntrega() {
		return this.opFechEntrega;
	}

	public void setOpFechEntrega(Date opFechEntrega) {
		this.opFechEntrega = opFechEntrega;
	}

	public Date getOpFecha() {
		return this.opFecha;
	}

	public void setOpFecha(Date opFecha) {
		this.opFecha = opFecha;
	}

	public List<OpDetalle> getDetalles() {
		return this.Detalles;
	}

	public void setDetalles(List<OpDetalle> Detalles) {
		this.Detalles = Detalles;
	}

	public OpDetalle addDetalle(OpDetalle Detalle) {
		getDetalles().add(Detalle);
		Detalle.setOrdenProduccion(this);

		return Detalle;
	}

	public OpDetalle removeDetalle(OpDetalle Detalle) {
		getDetalles().remove(Detalle);
		Detalle.setOrdenProduccion(null);

		return Detalle;
	}

	public Platillo getPlatillo() {
		return this.platillo;
	}

	public void setPlatillo(Platillo platillo) {
		this.platillo = platillo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}