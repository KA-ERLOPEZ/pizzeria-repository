package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Barrio;
import proyecto.sistema.venta.pizzeria_api.entities.Pais;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CiudadDto {

	private long ciuId;

	private boolean ciuEnabled;

	private String ciuNombre;

	private List<Barrio> barrios;

	private Pais pais;
}
