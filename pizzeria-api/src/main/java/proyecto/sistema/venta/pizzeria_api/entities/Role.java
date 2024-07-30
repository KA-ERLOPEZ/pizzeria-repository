package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the roles database table.
 * 
 */
@Entity
@Table(name="roles")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private long roleId;

	@Column(name="role_descripcion")
	private String roleDescripcion;

	@Column(name="role_enabled")
	private boolean roleEnabled;

	public Role() {
	}

	public long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleDescripcion() {
		return this.roleDescripcion;
	}

	public void setRoleDescripcion(String roleDescripcion) {
		this.roleDescripcion = roleDescripcion;
	}

	public boolean isRoleEnabled() {
		return this.roleEnabled;
	}

	public void setRoleEnabled(boolean roleEnabled) {
		this.roleEnabled = roleEnabled;
	}

}