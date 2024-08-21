package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the denominaciones database table.
 * 
 */
@Entity
@Table(name="denominaciones")
@NamedQuery(name="Denominacion.findAll", query="SELECT d FROM Denominacion d")
public class Denominacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="deno_id")
	private int denoId;

	@Column(name="deno_codigo")
	private String denoCodigo;

	@Column(name="deno_nombre")
	private String denoNombre;

	public Denominacion() {
	}

	public int getDenoId() {
		return this.denoId;
	}

	public void setDenoId(int denoId) {
		this.denoId = denoId;
	}

	public String getDenoCodigo() {
		return this.denoCodigo;
	}

	public void setDenoCodigo(String denoCodigo) {
		this.denoCodigo = denoCodigo;
	}

	public String getDenoNombre() {
		return this.denoNombre;
	}

	public void setDenoNombre(String denoNombre) {
		this.denoNombre = denoNombre;
	}

}