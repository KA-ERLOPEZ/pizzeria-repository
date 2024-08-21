package proyecto.sistema.venta.pizzeria_api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginDto {

	private String username;
	
	private String password;
}
