package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

/**
 * The primary key class for the transacciones database table.
 * 
 */
@Embeddable
public class TransaccionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cac_id", insertable=false, updatable=false)
	private long cacId;

	@Column(name="tran_tipo_id", insertable=false, updatable=false)
	private long tranTipoId;

	public TransaccionPK() {
	}
	public long getCacId() {
		return this.cacId;
	}
	public void setCacId(int cacId) {
		this.cacId = cacId;
	}
	public long getTranTipoId() {
		return this.tranTipoId;
	}
	public void setTranTipoId(int tranTipoId) {
		this.tranTipoId = tranTipoId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransaccionPK)) {
			return false;
		}
		TransaccionPK castOther = (TransaccionPK)other;
		return 
			(this.cacId == castOther.cacId)
			&& (this.tranTipoId == castOther.tranTipoId);
	}

	public int hashCode() {
			
		return Objects.hash(this.cacId, this.tranTipoId);
	}
}