package proyecto.sistema.venta.pizzeria_api.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the documentos database table.
 * 
 */
@Entity
@Table(name="documentos")
@NamedQuery(name="Documento.findAll", query="SELECT d FROM Documento d")
public class Documento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="documento_id")
	private long documentoId;

	@Column(name="documento_enabled")
	private boolean documentoEnabled;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="documento_fec_emision")
	private Date documentoFecEmision;

	@Column(name="documento_nro")
	private String documentoNro;

	//uni-directional many-to-one association to Timbrado
	@ManyToOne
	@JoinColumn(name="timbrado_id")
	private Timbrado timbrado;

	//uni-directional many-to-one association to TipoDoumento
	@ManyToOne
	@JoinColumn(name="tipodoc_id")
	private TipoDoumento tipoDoumento;

	//uni-directional many-to-one association to Venta
	@ManyToOne
	@JoinColumn(name="venta_id")
	private Venta ventaCabecera;

	public Documento() {
	}

	public long getDocumentoId() {
		return this.documentoId;
	}

	public void setDocumentoId(int documentoId) {
		this.documentoId = documentoId;
	}

	public boolean isDocumentoEnabled() {
		return this.documentoEnabled;
	}

	public void setDocumentoEnabled(boolean documentoEnabled) {
		this.documentoEnabled = documentoEnabled;
	}

	public Date getDocumentoFecEmision() {
		return this.documentoFecEmision;
	}

	public void setDocumentoFecEmision(Date documentoFecEmision) {
		this.documentoFecEmision = documentoFecEmision;
	}

	public String getDocumentoNro() {
		return this.documentoNro;
	}

	public void setDocumentoNro(String documentoNro) {
		this.documentoNro = documentoNro;
	}

	public Timbrado getTimbrado() {
		return this.timbrado;
	}

	public void setTimbrado(Timbrado timbrado) {
		this.timbrado = timbrado;
	}

	public TipoDoumento getTipoDoumento() {
		return this.tipoDoumento;
	}

	public void setTipoDoumento(TipoDoumento tipoDoumento) {
		this.tipoDoumento = tipoDoumento;
	}

	public Venta getVentaCabecera() {
		return this.ventaCabecera;
	}

	public void setVentaCabecera(Venta ventaCabecera) {
		this.ventaCabecera = ventaCabecera;
	}

}