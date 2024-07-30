package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the cargos database table.
 * 
 */
@Entity
@Table(name="cargos")
@NamedQuery(name="Cargo.findAll", query="SELECT c FROM Cargo c")
public class Cargo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cargo_id")
	private long cargoId;

	@Column(name="cargo_enabled")
	private boolean cargoEnabled;

	@Column(name="cargo_nombre")
	private String cargoNombre;

	public Cargo() {
	}

	public long getCargoId() {
		return this.cargoId;
	}

	public void setCargoId(long cargoId) {
		this.cargoId = cargoId;
	}

	public boolean isCargoEnabled() {
		return this.cargoEnabled;
	}

	public void setCargoEnabled(boolean cargoEnabled) {
		this.cargoEnabled = cargoEnabled;
	}

	public String getCargoNombre() {
		return this.cargoNombre;
	}

	public void setCargoNombre(String cargoNombre) {
		this.cargoNombre = cargoNombre;
	}

}