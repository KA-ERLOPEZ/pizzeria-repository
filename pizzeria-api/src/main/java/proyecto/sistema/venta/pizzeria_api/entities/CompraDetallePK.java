package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

/**
 * The primary key class for the compra_detalle database table.
 * 
 */
@Embeddable
public class CompraDetallePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="cd_id")
	private int cdId;

	@Column(name="prod_id", insertable=false, updatable=false)
	private int prodId;

	@Column(name="depo_id", insertable=false, updatable=false)
	private int depoId;

	@Column(name="compra_id", insertable=false, updatable=false)
	private int compraId;

	public CompraDetallePK() {
	}
	public int getCdId() {
		return this.cdId;
	}
	public void setCdId(int cdId) {
		this.cdId = cdId;
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
	public int getCompraId() {
		return this.compraId;
	}
	public void setCompraId(int compraId) {
		this.compraId = compraId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cdId, compraId, depoId, prodId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompraDetallePK other = (CompraDetallePK) obj;
		return cdId == other.cdId && compraId == other.compraId && depoId == other.depoId && prodId == other.prodId;
	}

	
}