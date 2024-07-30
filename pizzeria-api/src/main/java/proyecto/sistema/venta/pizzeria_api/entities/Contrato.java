package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the contratos database table.
 * 
 */
@Entity
@Table(name="contratos")
@NamedQuery(name="Contrato.findAll", query="SELECT c FROM Contrato c")
public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ContratoPK id;

	@Column(name="cont_enabled")
	private boolean contEnabled;

	@Temporal(TemporalType.DATE)
	@Column(name="cont_fec_fin")
	private Date contFecFin;

	@Temporal(TemporalType.DATE)
	@Column(name="cont_fec_inicio")
	private Date contFecInicio;

	@Column(name="cont_salario")
	private double contSalario;

	//uni-directional many-to-one association to Cargo
	@ManyToOne
	@JoinColumn(name="cargo_id")
	private Cargo cargo;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="per_id")
	private Persona persona;

	//uni-directional many-to-one association to TipoContrato
	@ManyToOne
	@JoinColumn(name="tc_id")
	private TipoContrato tipoContrato;

	public Contrato() {
	}

	public ContratoPK getId() {
		return this.id;
	}

	public void setId(ContratoPK id) {
		this.id = id;
	}

	public boolean isContEnabled() {
		return this.contEnabled;
	}

	public void setContEnabled(boolean contEnabled) {
		this.contEnabled = contEnabled;
	}

	public Date getContFecFin() {
		return this.contFecFin;
	}

	public void setContFecFin(Date contFecFin) {
		this.contFecFin = contFecFin;
	}

	public Date getContFecInicio() {
		return this.contFecInicio;
	}

	public void setContFecInicio(Date contFecInicio) {
		this.contFecInicio = contFecInicio;
	}

	public double getContSalario() {
		return this.contSalario;
	}

	public void setContSalario(double contSalario) {
		this.contSalario = contSalario;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public TipoContrato getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}