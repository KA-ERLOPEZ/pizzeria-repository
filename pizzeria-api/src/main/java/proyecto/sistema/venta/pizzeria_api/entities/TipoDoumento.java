package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the tipo_doumento database table.
 * 
 */
@Entity
@Table(name="tipo_doumento")
@NamedQuery(name="TipoDoumento.findAll", query="SELECT t FROM TipoDoumento t")
public class TipoDoumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tipodoc_id")
	private long tipodocId;

	@Column(name="tipodoc_descripcion")
	private String tipodocDescripcion;

	@Column(name="tipodoc_estado")
	private boolean tipodocEstado;

	public TipoDoumento() {
	}

	public long getTipodocId() {
		return this.tipodocId;
	}

	public void setTipodocId(long tipodocId) {
		this.tipodocId = tipodocId;
	}

	public String getTipodocDescripcion() {
		return this.tipodocDescripcion;
	}

	public void setTipodocDescripcion(String tipodocDescripcion) {
		this.tipodocDescripcion = tipodocDescripcion;
	}

	public boolean isTipodocEstado() {
		return this.tipodocEstado;
	}

	public void setTipodocEstado(boolean tipodocEstado) {
		this.tipodocEstado = tipodocEstado;
	}

}