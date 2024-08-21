package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the depositos database table.
 * 
 */
@Entity
@Table(name="depositos")
@NamedQuery(name="Deposito.findAll", query="SELECT d FROM Deposito d")
public class Deposito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="depo_id")
	private int depoId;

	@Column(name="depo_estado", columnDefinition = "tinyint(1) default '1'")
	private boolean depoEstado;

	@Column(name="depo_nombre")
	private String depoNombre;

	//uni-directional many-to-one association to Sucursal
	@ManyToOne
	@JoinColumn(name="suc_id")
	private Sucursal sucursal;

	public Deposito() {
	}

	public int getDepoId() {
		return this.depoId;
	}

	public void setDepoId(int depoId) {
		this.depoId = depoId;
	}

	public boolean isDepoEstado() {
		return this.depoEstado;
	}

	public void setDepoEstado(boolean depoEstado) {
		this.depoEstado = depoEstado;
	}

	public String getDepoNombre() {
		return this.depoNombre;
	}

	public void setDepoNombre(String depoNombre) {
		this.depoNombre = depoNombre;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}