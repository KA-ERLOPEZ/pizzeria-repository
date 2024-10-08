package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

/**
 * The primary key class for the op_detalle database table.
 * 
 */
@Embeddable
public class OpDetallePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="op_id", insertable=false, updatable=false)
	private int opId;

	@Column(name="prod_id", insertable=false, updatable=false)
	private int prodId;

	@Column(name="depo_id", insertable=false, updatable=false)
	private int depoId;

	public OpDetallePK() {
	}
	public int getOpId() {
		return this.opId;
	}
	public void setOpId(int opId) {
		this.opId = opId;
	}
	public int getProdId() {
		return this.prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getDepoId() {
		return this.depoId;
	}
	public void setDepoId(int depoId) {
		this.depoId = depoId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(depoId, opId, prodId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OpDetallePK other = (OpDetallePK) obj;
		return depoId == other.depoId && opId == other.opId && prodId == other.prodId;
	}

	

}