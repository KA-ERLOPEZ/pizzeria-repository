package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

/**
 * The primary key class for the detalle_arqueo database table.
 * 
 */
@Embeddable
public class DetalleArqueoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="arqueo_id", insertable=false, updatable=false)
	private int arqueoId;

	@Column(name="deno_id", insertable=false, updatable=false)
	private int denoId;

	public DetalleArqueoPK() {
	}
	public int getArqueoId() {
		return this.arqueoId;
	}
	public void setArqueoId(int arqueoId) {
		this.arqueoId = arqueoId;
	}
	public long getDenoId() {
		return this.denoId;
	}
	public void setDenoId(int denoId) {
		this.denoId = denoId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(arqueoId, denoId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetalleArqueoPK other = (DetalleArqueoPK) obj;
		return arqueoId == other.arqueoId && denoId == other.denoId;
	}


}