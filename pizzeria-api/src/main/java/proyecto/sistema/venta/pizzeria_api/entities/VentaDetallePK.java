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
	private int vdId;

	@Column(name="venta_id", insertable=false, updatable=false)
	private int ventaId;

	@Column(name="prod_id", insertable=false, updatable=false)
	private int prodId;

	@Column(name="depo_id", insertable=false, updatable=false)
	private int depoId;

	public VentaDetallePK() {
	}
	public int getVdId() {
		return this.vdId;
	}
	public void setVdId(int vdId) {
		this.vdId = vdId;
	}
	public int getVentaId() {
		return this.ventaId;
	}
	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
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