package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

/**
 * The primary key class for the stock database table.
 * 
 */
@Embeddable
public class StockPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="prod_id", insertable=false, updatable=false)
	private long prodId;

	@Column(name="depo_id", insertable=false, updatable=false)
	private long depoId;

	public StockPK() {
	}
	public long getProdId() {
		return this.prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public long getDepoId() {
		return this.depoId;
	}
	public void setDepoId(long depoId) {
		this.depoId = depoId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(depoId, prodId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockPK other = (StockPK) obj;
		return depoId == other.depoId && prodId == other.prodId;
	}

	
}