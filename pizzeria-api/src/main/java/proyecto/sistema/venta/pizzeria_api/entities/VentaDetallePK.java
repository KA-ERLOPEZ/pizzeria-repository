package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

/**
 * The primary key class for the venta_detalle database table.
 * 
 */
@Embeddable
public class VentaDetallePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="vd_id")
	private long vdId;

	@Column(name="venta_id", insertable=false, updatable=false)
	private long ventaId;

	@Column(name="prod_id", insertable=false, updatable=false)
	private long prodId;

	@Column(name="depo_id", insertable=false, updatable=false)
	private long depoId;

	public VentaDetallePK() {
	}
	public long getVdId() {
		return this.vdId;
	}
	public void setVdId(long vdId) {
		this.vdId = vdId;
	}
	public long getVentaId() {
		return this.ventaId;
	}
	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VentaDetallePK)) {
			return false;
		}
		VentaDetallePK castOther = (VentaDetallePK)other;
		return 
			(this.vdId == castOther.vdId)
			&& (this.ventaId == castOther.ventaId)
			&& (this.prodId == castOther.prodId)
			&& (this.depoId == castOther.depoId);
	}

	public int hashCode() {
		
		return Objects.hash(depoId, prodId, vdId, ventaId);
	}
}