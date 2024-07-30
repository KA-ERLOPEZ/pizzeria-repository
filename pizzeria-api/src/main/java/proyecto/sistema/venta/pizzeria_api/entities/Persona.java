package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the personas database table.
 * 
 */
@Entity
@Table(name="personas")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="per_id")
	private long perId;

	@Column(name="per_apellido")
	private String perApellido;

	@Column(name="per_direccion")
	private String perDireccion;

	@Column(name="per_email")
	private String perEmail;

	@Column(name="per_enabled")
	private boolean perEnabled;

	@Temporal(TemporalType.DATE)
	@Column(name="per_fec_nac")
	private Date perFecNac;

	@Column(name="per_nombre")
	private String perNombre;

	@Column(name="per_nro_documento")
	private String perNroDocumento;

	@Column(name="per_telefono")
	private String perTelefono;

	//bi-directional many-to-one association to Contrato
	@OneToMany(mappedBy="persona")
	private List<Contrato> contratos;

	//uni-directional many-to-one association to Barrio
	@ManyToOne
	@JoinColumn(name="bar_id")
	private Barrio barrio;

	//uni-directional many-to-one association to Nacionalidad
	@ManyToOne
	@JoinColumn(name="nac_id")
	private Nacionalidad nacionalidad;

	public Persona() {
	}

	public long getPerId() {
		return this.perId;
	}

	public void setPerId(long perId) {
		this.perId = perId;
	}

	public String getPerApellido() {
		return this.perApellido;
	}

	public void setPerApellido(String perApellido) {
		this.perApellido = perApellido;
	}

	public String getPerDireccion() {
		return this.perDireccion;
	}

	public void setPerDireccion(String perDireccion) {
		this.perDireccion = perDireccion;
	}

	public String getPerEmail() {
		return this.perEmail;
	}

	public void setPerEmail(String perEmail) {
		this.perEmail = perEmail;
	}

	public boolean isPerEnabled() {
		return this.perEnabled;
	}

	public void setPerEnabled(boolean perEnabled) {
		this.perEnabled = perEnabled;
	}

	public Date getPerFecNac() {
		return this.perFecNac;
	}

	public void setPerFecNac(Date perFecNac) {
		this.perFecNac = perFecNac;
	}

	public String getPerNombre() {
		return this.perNombre;
	}

	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}

	public String getPerNroDocumento() {
		return this.perNroDocumento;
	}

	public void setPerNroDocumento(String perNroDocumento) {
		this.perNroDocumento = perNroDocumento;
	}

	public String getPerTelefono() {
		return this.perTelefono;
	}

	public void setPerTelefono(String perTelefono) {
		this.perTelefono = perTelefono;
	}

	public List<Contrato> getContratos() {
		return this.contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public Contrato addContrato(Contrato contrato) {
		getContratos().add(contrato);
		contrato.setPersona(this);

		return contrato;
	}

	public Contrato removeContrato(Contrato contrato) {
		getContratos().remove(contrato);
		contrato.setPersona(null);

		return contrato;
	}

	public Barrio getBarrio() {
		return this.barrio;
	}

	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}

	public Nacionalidad getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}