package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the proveedores database table.
 * 
 */
@Entity
@Table(name="proveedores")
@NamedQuery(name="Proveedore.findAll", query="SELECT p FROM Proveedore p")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prov_id")
	private long provId;

	@Column(name="prov_direccion")
	private String provDireccion;

	@Column(name="prov_email")
	private String provEmail;

	@Column(name="prov_enabled")
	private boolean provEnabled;

	@Column(name="prov_pag_web")
	private String provPagWeb;

	@Column(name="prov_razon_social")
	private String provRazonSocial;

	@Column(name="prov_ruc")
	private String provRuc;

	@Column(name="prov_telefono")
	private String provTelefono;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name="bar_id")
	private Barrio barrio;

	public Proveedor() {
	}

	public long getProvId() {
		return this.provId;
	}

	public void setProvId(long provId) {
		this.provId = provId;
	}

	public String getProvDireccion() {
		return this.provDireccion;
	}

	public void setProvDireccion(String provDireccion) {
		this.provDireccion = provDireccion;
	}

	public String getProvEmail() {
		return this.provEmail;
	}

	public void setProvEmail(String provEmail) {
		this.provEmail = provEmail;
	}

	public boolean isProvEnabled() {
		return this.provEnabled;
	}

	public void setProvEnabled(boolean provEnabled) {
		this.provEnabled = provEnabled;
	}

	public String getProvPagWeb() {
		return this.provPagWeb;
	}

	public void setProvPagWeb(String provPagWeb) {
		this.provPagWeb = provPagWeb;
	}

	public String getProvRazonSocial() {
		return this.provRazonSocial;
	}

	public void setProvRazonSocial(String provRazonSocial) {
		this.provRazonSocial = provRazonSocial;
	}

	public String getProvRuc() {
		return this.provRuc;
	}

	public void setProvRuc(String provRuc) {
		this.provRuc = provRuc;
	}

	public String getProvTelefono() {
		return this.provTelefono;
	}

	public void setProvTelefono(String provTelefono) {
		this.provTelefono = provTelefono;
	}

}