package proyecto.sistema.venta.pizzeria_api.dto;

import java.util.List;


//import com.fasterxml.jackson.annotation.JsonManagedReference;

//import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import proyecto.sistema.venta.pizzeria_api.entities.Ciudad;

@Data
@AllArgsConstructor @NoArgsConstructor
public class PaisDto {

	private int paisId;
	
	private boolean paisEnabled;

	@NotBlank(message = "El nombre es requerido")
	private String paisNombre;

	private List<Ciudad> ciudades;
}
