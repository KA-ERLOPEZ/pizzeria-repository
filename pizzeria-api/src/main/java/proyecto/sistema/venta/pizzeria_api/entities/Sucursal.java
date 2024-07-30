package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the sucursales database table.
 * 
 */
@Entity
@Table(name="sucursales")
@NamedQuery(name="Sucursal.findAll", query="SELECT s FROM Sucursal s")
public class Sucursal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="suc_id")
	private long sucId;

	@Column(name="suc_direccion")
	private String sucDireccion;

	@Column(name="suc_email")
	private String sucEmail;

	@Column(name="suc_estado")
	private boolean sucEstado;

	@Column(name="suc_nombre")
	private String sucNombre;

	@Column(name="suc_telefono")
	private String sucTelefono;

	public Sucursal() {
	}

	public long getSucId() {
		return this.sucId;
	}

	public void setSucId(long sucId) {
		this.sucId = sucId;
	}

	public String getSucDireccion() {
		return this.sucDireccion;
	}

	public void setSucDireccion(String sucDireccion) {
		this.sucDireccion = sucDireccion;
	}

	public String getSucEmail() {
		return this.sucEmail;
	}

	public void setSucEmail(String sucEmail) {
		this.sucEmail = sucEmail;
	}

	public boolean getSucEstado() {
		return this.sucEstado;
	}

	public void setSucEstado(boolean sucEstado) {
		this.sucEstado = sucEstado;
	}

	public String getSucNombre() {
		return this.sucNombre;
	}

	public void setSucNombre(String sucNombre) {
		this.sucNombre = sucNombre;
	}

	public String getSucTelefono() {
		return this.sucTelefono;
	}

	public void setSucTelefono(String sucTelefono) {
		this.sucTelefono = sucTelefono;
	}

}