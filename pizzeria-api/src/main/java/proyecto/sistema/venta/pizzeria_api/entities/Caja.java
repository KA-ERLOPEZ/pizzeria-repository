package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the cajas database table.
 * 
 */
@Entity
@Table(name="cajas")
@NamedQuery(name="Caja.findAll", query="SELECT c FROM Caja c")
public class Caja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="caja_id")
	private int cajaId;

	@Column(name="caja_estado")
	private String cajaEstado;

	@Column(name="caja_nro")
	private String cajaNro;

	//bi-directional many-to-one association to CajaAperturaCierre
	@OneToMany(mappedBy="caja", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<CajaAperturaCierre> cajaAperturaCierres;

	//uni-directional many-to-one association to Sucursal
	@ManyToOne
	@JoinColumn(name="suc_id")
	private Sucursal sucursal;

	public Caja() {
	}

	public int getCajaId() {
		return this.cajaId;
	}

	public void setCajaId(int cajaId) {
		this.cajaId = cajaId;
	}

	public String getCajaEstado() {
		return this.cajaEstado;
	}

	public void setCajaEstado(String cajaEstado) {
		this.cajaEstado = cajaEstado;
	}

	public String getCajaNro() {
		return this.cajaNro;
	}

	public void setCajaNro(String cajaNro) {
		this.cajaNro = cajaNro;
	}

	public List<CajaAperturaCierre> getCajaAperturaCierres() {
		return this.cajaAperturaCierres;
	}

	public void setCajaAperturaCierres(List<CajaAperturaCierre> cajaAperturaCierres) {
		this.cajaAperturaCierres = cajaAperturaCierres;
	}

	public CajaAperturaCierre addCajaAperturaCierre(CajaAperturaCierre cajaAperturaCierre) {
		getCajaAperturaCierres().add(cajaAperturaCierre);
		cajaAperturaCierre.setCaja(this);

		return cajaAperturaCierre;
	}

	public CajaAperturaCierre removeCajaAperturaCierre(CajaAperturaCierre cajaAperturaCierre) {
		getCajaAperturaCierres().remove(cajaAperturaCierre);
		cajaAperturaCierre.setCaja(null);

		return cajaAperturaCierre;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}