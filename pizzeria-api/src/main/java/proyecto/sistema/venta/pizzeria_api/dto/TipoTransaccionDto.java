package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Transaccion;

@Data
@AllArgsConstructor @NoArgsConstructor
public class TipoTransaccionDto {

	private long tranTipoId;

	private boolean tranTipoEnabled;

	private String tranTipoNombre;

	private List<Transaccion> transacciones;
}
