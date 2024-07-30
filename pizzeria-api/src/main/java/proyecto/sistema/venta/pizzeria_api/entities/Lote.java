package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.*;


/**
 * The persistent class for the lote database table.
 * 
 */
@Entity
@NamedQuery(name="Lote.findAll", query="SELECT l FROM Lote l")
public class Lote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="lote_id")
	private long loteId;

	@Column(name="lote_cantidad")
	private double loteCantidad;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lote_fecha_vencimiento")
	private Timestamp loteFechaVencimiento;

	@Column(name="lote_nro")
	private String loteNro;

	//uni-directional many-to-one association to Stock
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="depo_id", referencedColumnName="depo_id"),
		@JoinColumn(name="prod_id", referencedColumnName="prod_id")
		})
	private Stock stock;

	public Lote() {
	}

	public long getLoteId() {
		return this.loteId;
	}

	public void setLoteId(long loteId) {
		this.loteId = loteId;
	}

	public double getLoteCantidad() {
		return this.loteCantidad;
	}

	public void setLoteCantidad(double loteCantidad) {
		this.loteCantidad = loteCantidad;
	}

	public Timestamp getLoteFechaVencimiento() {
		return this.loteFechaVencimiento;
	}

	public void setLoteFechaVencimiento(Timestamp loteFechaVencimiento) {
		this.loteFechaVencimiento = loteFechaVencimiento;
	}

	public String getLoteNro() {
		return this.loteNro;
	}

	public void setLoteNro(String loteNro) {
		this.loteNro = loteNro;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}