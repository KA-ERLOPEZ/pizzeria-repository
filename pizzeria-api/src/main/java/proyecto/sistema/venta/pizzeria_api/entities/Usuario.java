package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usu_id")
	private int usuId;

	@Column(name="usu_enabled", columnDefinition = "tinyint(1) default '1'", nullable = false)
	private boolean enabled;

	@Temporal(TemporalType.DATE)
	@Column(name="usu_fec_creacion", nullable = false)
	private Date usuFecCreacion;

	@Column(name="usu_password", nullable = false)
	private String usuPassword;

	@Column(name="usu_username", nullable = false, length = 150, unique = true)
	private String usuUsername;

	//uni-directional many-to-many association to Role
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(
		name="usuario_rol"
		, joinColumns={
			@JoinColumn(name="usu_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="role_id")
			}
		)
	private Set<Role> roles = new HashSet<>();

	//uni-directional many-to-one association to Persona
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="per_id")
	private Persona persona;

	public Usuario() {
	}

	public int getUsuId() {
		return this.usuId;
	}

	public void setUsuId(int usuId) {
		this.usuId = usuId;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Date getUsuFecCreacion() {
		return this.usuFecCreacion;
	}

	public void setUsuFecCreacion(Date usuFecCreacion) {
		this.usuFecCreacion = usuFecCreacion;
	}

	public String getUsuPassword() {
		return this.usuPassword;
	}

	public void setUsuPassword(String usuPassword) {
		this.usuPassword = usuPassword;
	}

	public String getUsuUsername() {
		return this.usuUsername;
	}

	public void setUsuUsername(String usuUsername) {
		this.usuUsername = usuUsername;
	}

	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}