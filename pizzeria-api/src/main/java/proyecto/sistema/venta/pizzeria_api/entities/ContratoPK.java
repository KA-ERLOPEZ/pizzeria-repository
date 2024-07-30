package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the contratos database table.
 * 
 */
@Embeddable
public class ContratoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="tc_id", insertable=false, updatable=false)
	private long tcId;

	@Column(name="per_id", insertable=false, updatable=false)
	private long perId;

	public ContratoPK() {
	}
	public long getTcId() {
		return this.tcId;
	}
	public void setTcId(int tcId) {
		this.tcId = tcId;
	}
	public long getPerId() {
		return this.perId;
	}
	public void setPerId(long perId) {
		this.perId = perId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ContratoPK)) {
			return false;
		}
		ContratoPK castOther = (ContratoPK)other;
		return 
			(this.tcId == castOther.tcId)
			&& (this.perId == castOther.perId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = (int)(hash * prime + this.tcId);
		hash = (int)(hash * prime + this.perId);
		
		return hash;
	}
}