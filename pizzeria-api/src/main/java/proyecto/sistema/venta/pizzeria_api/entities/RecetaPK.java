package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

/**
 * The primary key class for the recetas database table.
 * 
 */
@Embeddable
public class RecetaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="platillo_id", insertable=false, updatable=false)
	private long platilloId;

	@Column(name="prod_id", insertable=false, updatable=false)
	private long prodId;

	public RecetaPK() {
	}
	public long getPlatilloId() {
		return this.platilloId;
	}
	public void setPlatilloId(long platilloId) {
		this.platilloId = platilloId;
	}
	public long getProdId() {
		return this.prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(platilloId, prodId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecetaPK other = (RecetaPK) obj;
		return platilloId == other.platilloId && prodId == other.prodId;
	}

	
}