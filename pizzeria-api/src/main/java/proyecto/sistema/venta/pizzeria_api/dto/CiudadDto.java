package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;

//import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Barrio;
import proyecto.sistema.venta.pizzeria_api.entities.Pais;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CiudadDto {

	private int ciuId;

	private boolean ciuEnabled;

	@NotBlank(message = "El nombre es requerido")
	private String ciuNombre;

	private List<Barrio> barrios;

	private Pais pais;
}
