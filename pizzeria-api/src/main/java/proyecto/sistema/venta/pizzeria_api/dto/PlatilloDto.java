package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Receta;

@Data
@AllArgsConstructor @NoArgsConstructor
public class PlatilloDto {

	private int platilloId;

	@NotNull
	private String platilloDescripcion;

	@NotNull
	private String platilloDetalle;

	@NotNull
	private String platilloNombre;

	private boolean enable = true;

	private List<Receta> recetas;
}
