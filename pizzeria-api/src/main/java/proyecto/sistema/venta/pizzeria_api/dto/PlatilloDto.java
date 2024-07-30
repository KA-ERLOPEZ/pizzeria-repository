package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Receta;

@Data
@AllArgsConstructor @NoArgsConstructor
public class PlatilloDto {

	private long platilloId;

	private String platilloDescripcion;

	private String platilloDetalle;

	private String platilloNombre;

	private boolean enable;

	private List<Receta> recetas;
}
